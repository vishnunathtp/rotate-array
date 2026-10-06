# Rotate Array

In-place reversal algorithm in Java to rotate an array to the right by `k` steps.

## Problem Description
Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

### Example
- Input: `nums = [1, 2, 3, 4, 5, 6, 7], k = 3`
- Output: `[5, 6, 7, 1, 2, 3, 4]`

## Approach & Complexity
Utilizes the classic 3-step in-place reversal:
1. Reverse the entire array.
2. Reverse the first `k` elements.
3. Reverse the remaining `n - k` elements.

- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(1)$ auxiliary memory (in-place).

## How to Run & Test
```bash
javac -d bin src/RotateArray.java tests/RotateArrayTest.java
java -cp bin -ea RotateArrayTest
```
