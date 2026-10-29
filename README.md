# LeetCode-DSA-Java

A clean, topic-wise collection of Java solutions for LeetCode problems, focused on Data Structures and Algorithms practice.

## Overview

This repository is designed to help you:
- practice DSA consistently in Java
- organize solutions by topic and difficulty
- keep every problem easy to locate and review
- document approach, complexity, and implementation clearly

## Repository structure

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
│   ├── 0009-palindrome
│   ├── 0014-prefixProblem
│   ├── 0026-RemoveDuplicates
│   ├── 0027-RemoveElement
│   ├── 0034-leet
│   ├── 0035-SearchInsertPosition
│   ├── 0167-TwoSum_II
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

## What makes this repo organized

- Topic-wise folders for problem groups
- Numbered file naming for quick navigation
- Consistent Java solution structure
- Complexity notes in each solution
- Clear contribution guidelines for future additions

## Recommended naming convention

Use the pattern:

```text
<problem-number>-<problem-name>.java
```

Examples:
- `0001-Two-Sum.java`
- `0026-Remove-Duplicates.java`
- `0213-House-Robber-II.java`

## How to add a new problem

1. Create a topic folder if it does not exist.
2. Name the file using the LeetCode problem number and title.
3. Add:
   - class `Solution`
   - clear problem description comment
   - approach summary
   - time and space complexity
4. Keep code clean and easy to read.

## Suggested roadmap

- Arrays
- Strings
- Hashing
- Two Pointers
- Sliding Window
- Linked List
- Stacks and Queues
- Trees
- Binary Search
- Graphs
- Dynamic Programming
- Greedy
- Backtracking
- Heaps
- Trie
- Bit Manipulation

## Contribution guidelines

See [CONTRIBUTING.md](CONTRIBUTING.md) for repository standards and contribution workflow.

## License

This repository is currently maintained as a personal practice workspace. Add a LICENSE file if you want to share it publicly under an open-source license.

## Next improvements

- standardize all filenames to `.java`
- add README files inside each topic folder
- add difficulty labels and solution notes
- include a `src/` Java package layout for larger growth
- add automated compilation checks with Maven or Gradle

---

This repo is now structured for simple and scalable growth while staying easy to navigate for daily DSA practice.
