# Data Structure & Graph Performance Analyzer

> **CIT300: Data Structures & Algorithms — Graded Practical Assignment 2**
> *Sri Lanka Technology Campus (SLTC)*

![Java](https://img.shields.io/badge/JAVA-F89820?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/GIT-F05032?style=for-the-badge&logo=git&logoColor=white)
![Module](https://img.shields.io/badge/MODULE-CIT300-555555?style=for-the-badge)
![Team](https://img.shields.io/badge/TEAM-GROUP%12-0075CA?style=for-the-badge)
![Status](https://img.shields.io/badge/STATUS-COMPLETED-2EA043?style=for-the-badge)

---

## Project Overview

A unified, console-based Java application that implements, demonstrates, and
compares fundamental data structures and algorithms. It combines an array,
stack, queue, and linked list with searching algorithms (linear and binary
search) and graph traversal (BFS and DFS). Every search and traversal
reports the number of steps taken and its execution time, and a performance
comparison table puts the results side by side.

**Scope:** Weeks 1–11 &nbsp;|&nbsp; **Contribution:** 10% of the final module grade

---

##  Engineering Team — Group XX

| Student ID | Full Name | Assigned Responsibility | Individual Contribution |
|---|---|---|---|
| 23DA2-0401 | R.M.M.E Rathnayaka | Array, Searching, Performance Comparison, main menu and integration | • Implemented `ArrayOperations` (insert, delete, search, display, full-array handling)<br>• Implemented `SearchOperations` (linear and binary search with step counting)<br>• Implemented `PerformanceComparison` (records and displays results)<br>• Built `MainApp` and integrated all components into the main menu |
| 23DA2-0056 | Chamika Sithum | Stack and Queue | • Implemented `StackOperations` (push, pop, peek, display)<br>• Implemented `QueueOperations` (enqueue, dequeue, peek/front, display)<br>• Handled empty-stack and empty-queue conditions<br>• Integrated both into the main application |
| 23DA2-0428 | A.M.D.C Pilimathalawwa | Linked List | • Implemented `LinkedListOperations` using a custom singly linked list<br>• Implemented insert, delete, search, and display<br>• Tested edge cases such as deleting a missing value<br>• Integrated the module into the main application |
| 23DA2-0313 | Hashan Madhura | Graph and traversal | • Implemented `GraphOperations` using an adjacency list<br>• Implemented add vertex, add edge, and display graph<br>• Implemented BFS and DFS traversal with step counting<br>• Integrated the graph module into the main application |

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

| Requirement | Status | Implemented In |
|---|---|---|
| A. Array | ✅ Done | `ArrayOperations.java` |
| B. Stack | ✅ Done | `StackOperations.java` |
| C. Queue | ✅ Done | `QueueOperations.java` |
| D. Linked List | ✅ Done | `LinkedListOperations.java` |
| E. Searching (linear and binary) | ✅ Done | `SearchOperations.java` |
| F. Graph (BFS and DFS) | ✅ Done | `GraphOperations.java` |
| Performance / complexity demonstration | ✅ Done | `PerformanceComparison.java` |
| Integrated console application | ✅ Done | `MainApp.java` |

---

##  Project Structure

```
DataStructureAnalyzer/
├── README.md
└── src/
    ├── ArrayOperations.java        # Array: insert, delete, search, display
    ├── SearchOperations.java       # Linear and binary search with step counts
    ├── PerformanceComparison.java  # Records and displays the comparison table
    ├── StackOperations.java        # Stack: push, pop, peek, display
    ├── QueueOperations.java        # Queue: enqueue, dequeue, peek, display
    ├── LinkedListOperations.java   # Linked list: insert, delete, search, display
    ├── GraphOperations.java        # Graph: adjacency list, BFS, DFS
    └── MainApp.java                # Main menu, submenus, integration, validation
```

---

### Main menu

```
1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results
9. Exit
```

---

## 🤝 GitHub Collaboration

- Each member worked on their own feature branch and committed as each part was completed.
- Work was merged into `main` through pull requests.
- The commit history and pull requests show each member's individual contribution.

---
##  Demonstration Video

A single merged video of under 15 minutes demonstrates the whole system. Each
member's face is visible throughout their own section, which covers their
introduction, responsibility, code, live demonstration, an explanation of the
data structure or algorithm and its complexity, and how it fits into the
complete system.
