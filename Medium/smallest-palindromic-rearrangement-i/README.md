# Smallest Palindromic Rearrangement I
**Difficulty:** Medium
**Tags:** String, Sorting, Counting Sort
**Runtime:** 34 ms
**Memory:** 48104000
## Problem
You are given a 

palindromic

 string 
s
.

Return the 

lexicographically smallest

 palindromic 
permutation
 of 
s
.

 

Example 1:

Input:
 
s = &quot;z&quot;

Output:
 
&quot;z&quot;

Explanation:

A string of only one character is already the lexicographically smallest palindrome.

Example 2:

Input:
 
s = &quot;babab&quot;

Output:
 
&quot;abbba&quot;

Explanation:

Rearranging 
&quot;babab&quot;
 &rarr; 
&quot;abbba&quot;
 gives the smallest lexicographic palindrome.

Example 3:

Input:
 
s = &quot;daccad&quot;

Output:
 
&quot;acddca&quot;

Explanation:

Rearranging 
&quot;daccad&quot;
 &rarr; 
&quot;acddca&quot;
 gives the smallest lexicographic palindrome.

 

Constraints:

	

1 <= s.length <= 10
5

	

s
 consists of lowercase English letters.

	

s
 is guaranteed to be palindromic.
[View on LeetCode](https://leetcode.com/problems/smallest-palindromic-rearrangement-i/)