# Contributing

This repository is meant for Java-based LeetCode and DSA practice. Keep it clean, readable, and consistent.

## File naming rules

- Use the format: `###-Problem-Name.java`
- Keep problem names readable and consistent
- Prefer camel-case or kebab-case depending on current repo conventions
- Always include a `.java` extension for Java files

## Solution style

Each file should include:
- a `Solution` class
- problem title comment or description
- approach summary
- complexity notes
- simple, readable implementation

## Folder structure

- Keep solutions grouped by topic
- Use numbered folders for major categories like `01-Arrays`, `02-Strings`, etc.
- Add a README inside each topic directory when the folder grows large

## Pull request / commit expectations

- Keep each commit focused on one topic or a small set of related solutions
- Use descriptive commit messages
- Avoid mixing formatting cleanup and logic changes in the same commit

## Example

```java
class Solution {
    public int someFunction(int[] nums) {
        // approach
        return 0;
    }
}
```

## Recommended future improvements

- add `.java` extensions to all files
- add topic-level READMEs
- add unit tests for core implementations
- add Maven/Gradle setup for Java builds
