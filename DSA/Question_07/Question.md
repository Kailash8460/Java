# Data Structure and Algorithms

## Question 7

Given a sorted array that has been rotated, search for a target value.

### Samples

```text
Input 1: [4, 5, 6, 7, 0, 1, 2] 
Target = 0
Output: 4
Explanation: Target found at index 4.

Input 2: [4, 5, 6, 7, 0, 1, 2] 
Target = 3
Output: -1
Explanation: Target not present.

Input 3: [1] 
Target = 0
Output: -1
Explanation: Single element not equal to target.

Input 4: [1, 2, 3, 4, 5]
Target = 3
Output: 2
Explanation: Works like normal binary search.

Input 5: [2, 3, 4, 5, 1]
Target = 1
Output: 4
Explanation: Rotation happens at the end.

Input 6: [6, 7, 1, 2, 3, 4, 5]
Target = 1
Output: 2
Explanation: Target is the smallest element (pivot).

Input 7: [2, 2, 2, 3, 2]
Target = 3
Output: 3
Explanation: Standard solution may fail if not careful.
```

### Solution

Go to the **Solution.java** file.
