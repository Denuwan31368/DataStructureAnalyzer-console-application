import java.util.List;
import java.util.Scanner;

public class MainApp {

    private static final Scanner sc = new Scanner(System.in);

    private static final ArrayOperations arrayOps = new ArrayOperations();           
    private static final SearchOperations searchOps = new SearchOperations();       
    private static final StackOperations stackOps = new StackOperations();         
    private static final QueueOperations queueOps = new QueueOperations(); 
    private static final LinkedListOperations listOps = new LinkedListOperations();  // Sithum
    private static final GraphOperations graphOps = new GraphOperations();           // Eranga
    private static final PerformanceComparison performance = new PerformanceComparison(); 

    public static void main(String[] args) {
        int choice;
        do {
            clearScreen();
            printMainMenu();
            choice = readInt("Enter your choice: ");
            System.out.println();
            switch (choice) {
                case 1: arrayMenu(); break;
                case 2: stackMenu(); break;
                case 3: queueMenu(); break;
                case 4: linkedListMenu(); break;
                case 5: searchingMenu(); break;
                case 6: graphMenu(); break;
                case 7: performance.display(); pause(); break;
                case 8: displayAllResults(); pause(); break;
                case 9: System.out.println("Exiting... Goodbye!"); break;
                default:
                    System.out.println("Invalid choice. Please select 1-9.");
                    pause();
            }
        } while (choice != 9);
        sc.close();
    }

    private static void printMainMenu() {
        System.out.println("=============================================");
        System.out.println(" DATA STRUCTURE & GRAPH ANALYZER");
        System.out.println("=============================================");
        System.out.println("1. Array Operations");
        System.out.println("2. Stack Operations");
        System.out.println("3. Queue Operations");
        System.out.println("4. Linked List Operations");
        System.out.println("5. Searching Operations");
        System.out.println("6. Graph Operations");
        System.out.println("7. Performance Comparison");
        System.out.println("8. Display All Results");
        System.out.println("9. Exit");
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) System.out.println();
        }
    }

    private static void pause() {
        System.out.println();
        System.out.print("Press Enter to continue...");
        sc.nextLine();
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }

    private static String readNonEmpty(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            if (!line.isEmpty()) return line;
            System.out.println("This field cannot be empty.");
        }
    }

    private static void arrayMenu() {
        int choice;
        do {
            clearScreen();
            System.out.println("--------------- ARRAY OPERATIONS ------------");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            choice = readInt("Enter your choice: ");
            System.out.println();
            switch (choice) {
                case 1: {
                    int value = readInt("Enter integer value to insert: ");
                    if (arrayOps.insert(value)) System.out.println("Inserted successfully.");
                    else System.out.println("Error: Array is full.");
                    break;
                }
                case 2: {
                    int value = readInt("Enter value to delete: ");
                    if (arrayOps.delete(value)) System.out.println("Deleted successfully.");
                    else System.out.println("Error: Value not found in array.");
                    break;
                }
                case 3: {
                    int value = readInt("Enter value to search: ");
                    int idx = arrayOps.search(value);
                    System.out.println(idx == -1 ? "Value not found." : "Value found at index " + idx + ".");
                    break;
                }
                case 4: arrayOps.display(); break;
                case 5: break;
                default: System.out.println("Invalid choice. Please select 1-5.");
            }
            if (choice != 5) pause();
        } while (choice != 5);
    }

    private static void searchingMenu() {
        int choice;
        do {
            clearScreen();
            System.out.println("--------------- SEARCHING OPERATIONS --------");
            System.out.println("(Operates on the current Array contents)");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Return to Main Menu");
            choice = readInt("Enter your choice: ");
            System.out.println();
            int[] snapshot = arrayOps.getSnapshot();
            if (snapshot.length == 0 && choice != 3) {
                System.out.println("Error: Array is empty. Add values via Array Operations first.");
                pause();
                continue;
            }
            switch (choice) {
                case 1: {
                    int target = readInt("Enter value to search for: ");
                    long t0 = System.nanoTime();
                    SearchOperations.SearchResult r = searchOps.linearSearch(snapshot, target);
                    long elapsed = System.nanoTime() - t0;
                    boolean found = r.index != -1;
                    System.out.println((found ? "Found at index " + r.index : "Not found")
                            + " after " + r.steps + " step(s), taking " + elapsed + " ns.");
                    performance.recordLinearSearch(target, r.steps, elapsed, found);
                    break;
                }
                case 2: {
                    int target = readInt("Enter value to search for: ");
                    long t0 = System.nanoTime();
                    SearchOperations.SearchResult r = searchOps.binarySearch(snapshot, target);
                    long elapsed = System.nanoTime() - t0;
                    boolean found = r.index != -1;
                    System.out.println((found ? "Found at index " + r.index + " (in sorted copy)" : "Not found")
                            + " after " + r.steps + " step(s), taking " + elapsed + " ns.");
                    performance.recordBinarySearch(target, r.steps, elapsed, found);
                    break;
                }
                case 3: break;
                default: System.out.println("Invalid choice. Please select 1-3.");
            }
            if (choice != 3) pause();
        } while (choice != 3);
    }

    private static void stackMenu() {
        int choice;
        do {
            clearScreen();
            System.out.println("--------------- STACK OPERATIONS ------------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            choice = readInt("Enter your choice: ");
            System.out.println();
            switch (choice) {
                case 1: {
                    int value = readInt("Enter integer value to push: ");
                    stackOps.push(value);
                    System.out.println("Pushed successfully.");
                    break;
                }
                case 2: {
                    Integer popped = stackOps.pop();
                    System.out.println(popped == null ? "Error: Stack is empty." : "Popped value: " + popped);
                    break;
                }
                case 3: {
                    Integer top = stackOps.peek();
                    System.out.println(top == null ? "Error: Stack is empty." : "Top value: " + top);
                    break;
                }
                case 4: stackOps.display(); break;
                case 5: break;
                default: System.out.println("Invalid choice. Please select 1-5.");
            }
            if (choice != 5) pause();
        } while (choice != 5);
    }

    private static void queueMenu() {
        int choice;
        do {
            clearScreen();
            System.out.println("--------------- QUEUE OPERATIONS ------------");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek/Front");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            choice = readInt("Enter your choice: ");
            System.out.println();
            switch (choice) {
                case 1: {
                    int value = readInt("Enter integer value to enqueue: ");
                    queueOps.enqueue(value);
                    System.out.println("Enqueued successfully.");
                    break;
                }
                case 2: {
                    Integer dequeued = queueOps.dequeue();
                    System.out.println(dequeued == null ? "Error: Queue is empty." : "Dequeued value: " + dequeued);
                    break;
                }
                case 3: {
                    Integer front = queueOps.peekFront();
                    System.out.println(front == null ? "Error: Queue is empty." : "Front value: " + front);
                    break;
                }
                case 4: queueOps.display(); break;
                case 5: break;
                default: System.out.println("Invalid choice. Please select 1-5.");
            }
            if (choice != 5) pause();
        } while (choice != 5);
    }

    // ============================================================
    // Sithum PART: Linked List Operations (menu 4)
    // ============================================================

    private static void linkedListMenu() {
        int choice;
        do {
            clearScreen();
            System.out.println("--------------- LINKED LIST OPERATIONS ------");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            choice = readInt("Enter your choice: ");
            System.out.println();
            switch (choice) {
                case 1: {
                    int value = readInt("Enter integer value to insert: ");
                    listOps.insert(value);
                    System.out.println("Inserted successfully.");
                    break;
                }
                case 2: {
                    int value = readInt("Enter value to delete: ");
                    System.out.println(listOps.delete(value) ? "Deleted successfully." : "Error: Value not found.");
                    break;
                }
                case 3: {
                    int value = readInt("Enter value to search: ");
                    int idx = listOps.search(value);
                    System.out.println(idx == -1 ? "Value not found." : "Value found at position " + idx + ".");
                    break;
                }
                case 4: listOps.display(); break;
                case 5: break;
                default: System.out.println("Invalid choice. Please select 1-5.");
            }
            if (choice != 5) pause();
        } while (choice != 5);
    }

    // ============================================================
    // Eranga PART: Graph Operations (menu 6)
    // ============================================================

    private static void graphMenu() {
        int choice;
        do {
            clearScreen();
            System.out.println("--------------- GRAPH OPERATIONS ------------");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS Traversal");
            System.out.println("5. DFS Traversal");
            System.out.println("6. Return to Main Menu");
            choice = readInt("Enter your choice: ");
            System.out.println();
            switch (choice) {
                case 1: {
                    String name = readNonEmpty("Enter new vertex name: ");
                    System.out.println(graphOps.addVertex(name) ? "Vertex added." : "Error: Vertex already exists.");
                    break;
                }
                case 2: {
                    String a = readNonEmpty("Enter first vertex: ");
                    String b = readNonEmpty("Enter second vertex: ");
                    System.out.println(graphOps.addEdge(a, b) ? "Edge added."
                            : "Error: Check that both vertices exist and are not already connected.");
                    break;
                }
                case 3: graphOps.displayGraph(); break;
                case 4: {
                    String start = readNonEmpty("Enter starting vertex: ");
                    if (!graphOps.hasVertex(start)) {
                        System.out.println("Error: Vertex not found.");
                        break;
                    }
                    long t0 = System.nanoTime();
                    GraphOperations.TraversalResult r = graphOps.bfs(start);
                    long elapsed = System.nanoTime() - t0;
                    System.out.println("BFS order: " + r.order + "  (" + r.steps + " vertices visited, " + elapsed + " ns)");
                    performance.recordBfs(start, r.steps, elapsed);
                    break;
                }
                case 5: {
                    String start = readNonEmpty("Enter starting vertex: ");
                    if (!graphOps.hasVertex(start)) {
                        System.out.println("Error: Vertex not found.");
                        break;
                    }
                    long t0 = System.nanoTime();
                    GraphOperations.TraversalResult r = graphOps.dfs(start);
                    long elapsed = System.nanoTime() - t0;
                    System.out.println("DFS order: " + r.order + "  (" + r.steps + " vertices visited, " + elapsed + " ns)");
                    performance.recordDfs(start, r.steps, elapsed);
                    break;
                }
                case 6: break;
                default: System.out.println("Invalid choice. Please select 1-6.");
            }
            if (choice != 6) pause();
        } while (choice != 6);
    }

    private static void displayAllResults() {
        System.out.println("=============================================");
        System.out.println(" CURRENT STATE OF ALL DATA STRUCTURES");
        System.out.println("=============================================");
        System.out.print("Array:       "); arrayOps.display();
        System.out.print("Stack:       "); stackOps.display();
        System.out.print("Queue:       "); queueOps.display();
        System.out.print("Linked List: "); listOps.display();
        System.out.println("Graph:");
        graphOps.displayGraph();
    }
}
