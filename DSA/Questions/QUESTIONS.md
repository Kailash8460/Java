# Data Structure and Algorithms

## Question 1:

Given an array of integers, find the largest element.

### Samples:

```text
Input 1: [3, 7, 2, 9, 5]
Output: 9
Explanation: The maximum value in the array is 9.

Input 2: [1, 1, 1, 1]
Output: 1
Explanation: All elements are same, so max is 1.

Input 3: [-5, -2, -9, -1]
Output: -1
Explanation: Among negative numbers, -1 is the largest.
```

### Solution: 

Go to the **Solution_01.java** file.

## Question 2:

Given an array of integers and a target sum, determine if any two numbers sum up to the target.

### Samples:

```text
Input 1: [2, 7, 11, 15]
Target = 9
Output: true
Explanation: 2 + 7 = 9.

Input 2: [3, 2, 4]
Target = 6
Output: true
Explanation: 2 + 4 = 6.

Input 3: [1, 2, 3]
Target = 7
Output: false
Explanation: No pair sums to 7.
```

### Solution: 

Go to the **Solution_02.java** file.

## Question 3:

Given an array of stock prices, determine the maximum profit obtainable by buying once and selling once.

### Samples:

```text
Input 1: [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: Buy at 1 and sell at 6 → profit = 5.

Input 2: [7, 6, 4, 3, 1]
Output: 0
Explanation: Prices keep decreasing → no profit possible.

Input 3: [1, 2, 3, 4, 5]
Output: 4
Explanation: Buy at 1 and sell at 5 → profit = 4.

Input 4: [3, 8, 2, 5, 7, 1, 9]
Output: 8
Explanation: Best is buy at 1, sell at 9 → profit = 8.

Input 5: [7, 1, 5, 6, 3, 4]
Output: 5
Explanation: Buy at 1 and sell at 6 → profit = 5.

Input 6: [5]
Output: 0
Explanation: You can’t sell after buying → no transaction possible.
```

### Solution: 

Go to the **Solution_03.java** file.

## Question 4:

Given an array of integers, return an array where each element is the product of all other elements.

### Samples:

```text
Input 1: [1, 2, 3, 4]
Output: [24, 12, 8, 6]
Explanation: Each index contains product of all other elements.

Input 2: [2, 3, 4, 5]
Output: [60, 40, 30, 24]
Explanation: Example: index 0 → 3×4×5 = 60.

Input 3: [1, 0, 3, 4]
Output: [0, 12, 0, 0]
Explanation: Zero affects all products except its own position.
```

### Solution: 

Go to the **Solution_04.java** file.

## Question 5:

Find the contiguous subarray within a one-dimensional array that has the largest sum.

### Samples:

```text
Input 1: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
Explanation: Subarray [4, -1, 2, 1] gives sum = 6.

Input 2: [1, 2, 3, 4]
Output: 10
Explanation: Entire array gives maximum sum.

Input 3: [-1, -2, -3, -4]
Output: -1
Explanation: Maximum single element is -1.
```

### Solution: 

Go to the **Solution_05.java** file.