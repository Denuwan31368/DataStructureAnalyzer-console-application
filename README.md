# Data Structure and Graph Performance Analyzer

**Module:** CIT300 – Data Structures and Algorithms
**Assessment:** Group Practical Assignment 2 

## Project Description

A Java console application that demonstrates the practical application of
core data structures (array, stack, queue, linked list), searching
algorithms (linear and binary search), and graph concepts (adjacency list
representation with BFS and DFS traversal), along with a performance
comparison that records and displays step-counts and timing for the
searching and traversal operations.

---

## Team Members

| Student Name | Student ID | Assigned Responsibility | Individual Contribution |
|---|---|---|---|
| A.M.D.C Pilimathalawwa | 23DA2-0428 | Array and Searching implementation, Performance Comparison, main menu and integration | Implemented `ArrayOperations.java` (insert, delete, search, display with full-array handling), `SearchOperations.java` (Linear and Binary Search with step-counting), `PerformanceComparison.java`, and integrated all components into `MainApp.java`'s menu system. |
| Hashan Madhura | 23DA2-0313 | Stack and Queue implementation | Implemented StackOperations.java (push, pop, peek, display, with empty-stack handling) and QueueOperations.java (enqueue, dequeue, peek/front, display, with empty-queue handling). |
| Chamika Sithum | 23DA2-0056 | Linked List implementation |  |
| R.M.M.E Rathnayaka | 23DA2-0401 | Graph implementation and traversal | Implemented 'GraphOperations.java' using an adjacency list - add vertex, add edge, display graph, BFS traversal, and DFS traversal, each reporting the number of vertices visited. |

---

## Technologies Used

- **Language:** Java (JDK 11+)
- **Interface:** Console-based (`java.util.Scanner`)
- All core data structures (array, stack, queue, linked list) are
  implemented from scratch with custom classes rather than
  `java.util.ArrayList`/`Stack`/`LinkedList`, to demonstrate understanding
  of the underlying mechanics. The graph uses `java.util.Map`/`List` only
  as the underlying adjacency-list container — the graph logic itself
  (add/remove/BFS/DFS) is custom.

---

## Main System Features

- **Array Operations:** insert, delete, search, display (fixed-capacity array with full-array handling).
- **Stack Operations:** push, pop, peek, display (handles popping from an empty stack).
- **Queue Operations:** enqueue, dequeue, peek/front, display (handles dequeuing from an empty queue).
- **Linked List Operations:** insert, delete, search, display.
- **Searching Operations:** Linear Search and Binary Search over the array's data, each reporting steps taken and execution time.
- **Graph Operations:** add vertex, add edge, display graph, BFS traversal, DFS traversal, each reporting vertices visited and execution time.
- **Performance Comparison:** a single table comparing Linear vs Binary Search and BFS vs DFS by steps and time, with a short explanation of why the results differ.
- **Display All Results:** shows the current state of every data structure at once.
- Full input validation and graceful handling of invalid menu choices, empty structures, and duplicate vertices/edges.

---

## Requirements Coverage

| Component | Status | Implemented In |
|---|---|---|
| A. Array (insert, delete, search, display) | Done | `ArrayOperations.java` |
| B. Stack (push, pop, peek, display, empty handling) | Done | `StackOperations.java` |
| C. Queue (enqueue, dequeue, peek/front, display, empty handling) | Done | `QueueOperations.java` |
| D. Linked List (insert, delete, search, display) | Done | `LinkedListOperations.java` |
| E. Searching (Linear Search, Binary Search) | Done | `SearchOperations.java` |
| F. Graph (add vertex, add edge, display, BFS, DFS) | Done | `GraphOperations.java` |
| Performance/Complexity Demonstration | Done | `PerformanceComparison.java` |
| Main console application integration | Done | `MainApp.java` |
| Input validation / invalid operations / empty structures | Done | Validation helpers throughout `MainApp.java` |

---

## Project Structure

```
DataStructureAnalyzer/
├── README.md
└── src/
    ├── ArrayOperations.java        # A.M.D.C Pilimathalawwa - array insert/delete/search/display
    ├── SearchOperations.java       # A.M.D.C Pilimathalawwa - linear & binary search with step counts
    ├── PerformanceComparison.java  # A.M.D.C Pilimathalawwa - records & displays performance table
    ├── StackOperations.java        # Hashan Madhura - stack push/pop/peek/display
    ├── QueueOperations.java        # Hashan Madhura - queue enqueue/dequeue/peek/display
    ├── LinkedListOperations.java   # Chamika Sithum - linked list insert/delete/search/display
    ├── GraphOperations.java        # R.M.M.E Rathnayaka - graph, adjacency list, BFS/DFS
    └── MainApp.java                # Shared - main menu, submenus, integration, validation
```

---


## GitHub Collaboration

- Each member worked on their own feature branch (`feature/array-searching`,
  `feature/stack-queue`, `feature/linked-list`, `feature/graph`), committing
  incrementally as each method was completed.
- Work was merged into `main` via individual Pull Requests, each reviewed
  by at least one other team member before merging.
- `MainApp.java` was integrated last, once all four branches were merged,
  since it depends on every other class.
- Full commit history is visible under the repository's Commits tab;
  merged Pull Requests are visible under the Pull requests tab.

---
