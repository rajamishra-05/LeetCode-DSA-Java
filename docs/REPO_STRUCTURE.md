# Repository Structure Guide

This repository is organized to support long-term Java DSA practice with a clear topic-first layout.

## Current structure

```text
LeetCode-DSA-Java/
├── README.md
├── .gitignore
├── CONTRIBUTING.md
├── docs/
│   └── REPO_STRUCTURE.md
├── templates/
│   └── LeetCodeSolutionTemplate.java
├── 01-Arrays/
│   ├── 0001-Two-Sum.java
│   ├── 0007-ReverseInteger
│   └── ...
└── future-topics/
    ├── 02-Strings
    ├── 03-Hashing
    ├── 04-LinkedList
    ├── 05-Stacks-And-Queues
    ├── 06-Trees
    ├── 07-Graphs
    ├── 08-Dynamic-Programming
    ├── 09-Backtracking
    └── 10-Heap-And-Priority-Queue
```

## Goals

- easy browsing by topic
- quick discovery by numbered problem
- clean and scalable solution layout
- consistent naming and documentation

## Best practices

1. Keep problem files within the relevant topic folder.
2. Use numbered names so files sort naturally.
3. Add complexity notes in comments.
4. Maintain consistent Java formatting.
5. Avoid mixing unrelated problem solutions in one file.

## Naming convention

```text
0001-Two-Sum.java
0026-Remove-Duplicates.java
0213-House-Robber-II.java
```

## Future ideal layout

As the repo grows, the preferred structure becomes:

```text
LeetCode-DSA-Java/
├── README.md
├── src/
│   └── main/java/
│       └── com/yourname/dsa/
│           ├── arrays/
│           ├── strings/
│           ├── trees/
│           └── graphs/
├── tests/
│   └── java/
│       └── com/yourname/dsa/
└── pom.xml
```

This is cleaner for large repositories and supports Java build tooling.
