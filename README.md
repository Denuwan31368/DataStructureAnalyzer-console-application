# Data Structure & Graph Performance Analyzer

> **CIT300: Data Structures & Algorithms — Graded Practical Assignment 2**
> 

![Java](https://img.shields.io/badge/JAVA-F89820?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/GIT-F05032?style=for-the-badge&logo=git&logoColor=white)
![Module](https://img.shields.io/badge/MODULE-CIT300-555555?style=for-the-badge)
![Team](https://img.shields.io/badge/TEAM-GROUP%2012-0075CA?style=for-the-badge)
![Status](https://img.shields.io/badge/STATUS-COMPLETED-2EA043?style=for-the-badge)

---

## Project Description

A Java console application that demonstrates the practical application of
core data structures (array, stack, queue, linked list), searching
algorithms (linear and binary search), and graph concepts (adjacency list
representation with BFS and DFS traversal), along with a performance
comparison that records and displays step-counts and timing for the
searching and traversal operations.


---

##  Team Members Details and Responsibility

| Student ID | Full Name | Assigned Responsibility | Individual Contribution |
|---|---|---|---|
| 23DA2-0428 | A.M.D.C Pilimathalawwa | Array, Searching, Performance Comparison, main menu and integration | • Implemented `ArrayOperations` (insert, delete, search, display, full-array handling)<br>• Implemented `SearchOperations` (linear and binary search with step counting)<br>• Implemented `PerformanceComparison` (records and displays results)<br>• Built `MainApp` and integrated all components into the main menu |
| 23DA2-0313 | Hashan Madhura | Stack and Queue | • Implemented `StackOperations` (push, pop, peek, display)<br>• Implemented `QueueOperations` (enqueue, dequeue, peek/front, display)<br>• Handled empty-stack and empty-queue conditions<br>• Integrated both into the main application |
| 23DA2-0056 | Chamika Sithum | Linked List | • Implemented `LinkedListOperations` using a custom singly linked list<br>• Implemented insert, delete, search, and display<br>• Tested edge cases such as deleting a missing value<br>• Integrated the module into the main application |
| 23DA2-0401 | R.M.M.E Rathnayeka | Graph and traversal | • Implemented `GraphOperations` using an adjacency list<br>• Implemented add vertex, add edge, and display graph<br>• Implemented BFS and DFS traversal with step counting<br>• Integrated the graph module into the main application |

---

## Technologies Used

- **Language:** Java (JDK 11 or newer)
- **Interface:** Console-based, using `java.util.Scanner`
- **Data structures:** the array, stack, queue, and linked list are implemented
  from scratch with custom classes, not `java.util.ArrayList`, `Stack`, or
  `LinkedList`. The graph uses `java.util.Map` and `List` only as the adjacency-list
  container; the graph logic (add vertex, add edge, BFS, DFS) is custom.
- **Version control:** Git and GitHub, with feature branches and pull requests

---

## Main System Features

| Component | Operations |
|---|---|
| **Array** | Insert, delete, search, display, full-array handling |
| **Stack** | Push, pop, peek, display, empty-stack handling |
| **Queue** | Enqueue, dequeue, peek/front, display, empty-queue handling |
| **Linked List** | Insert, delete, search, display |
| **Searching** | Linear search and binary search, each reporting steps and time |
| **Graph** | Add vertex, add edge, display graph, BFS traversal, DFS traversal |
| **Performance Comparison** | Table of the latest search and traversal results, with an explanation of why they differ |
| **Display All Results** | Shows the current state of every data structure at once |

Input validation is built in throughout: invalid menu choices, non-numeric
input, empty structures, full array, duplicate vertices, missing values and
missing vertices are all handled with a clear message.

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

