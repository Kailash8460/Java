# Data Structure and Algorithms

## Question 6:

Find the maximum product of a contiguous subarray within a one-dimensional array.

### Samples:

```text
Input 1: [2, 3, -2, 4]
Output: 6
Explanation: Subarray [2, 3] gives product = 6.

Input 2: [-2, 0, -1]
Output: 0
Explanation: Maximum product is 0.

Input 3: [-2, 3, -4]
Output: 24
Explanation: (-2 × 3 × -4) = 24.

Input 4: [5]
Output: 5
Explanation: Only one element → must return it.

Input 5: [1, 2, 3, 4]
Output: 24
Explanation: Multiply all.

Input 6: [-1, -2, -3, -4]
Output: 24
Explanation: All multiply → positive.

Input 7: [-1, -2, -3] 
Output: 6
Explanation: Ignore one negative → [-2, -3]

Input 8: [2, -3, 0, 4, -1, 2] 
Output: 4
Explanation: Best subarray after zero → [4]

Input 9: [2, -5, -2, -4, 3] 
Output: 24
Explanation: [-2, -4, 3] → 24

Input 10: [1, 2, -100, 3, 4]
Output: 12
Explanation: Ignore left part → [3,4]
```

### Solution: 

Go to the **Solution.java** file.