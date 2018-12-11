/*
Let's call an array A a mountain if the following properties hold:

A.length >= 3
There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
*/
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        for (int i = 0; i < A.length; i++){
            if (isRemainingPartDecreasing(A,i) && isBeforePartIncreasing(A,i))
                return i;
        }
        return A.length;
    }
    boolean isRemainingPartDecreasing(int[] A, int index){
         for (int i = index; i < A.length - 1; i++){
             int current = A[i];
             int next = A[i+1];
             if (current <= next)
                 return false;
         }
        return true;
    }
    boolean isBeforePartIncreasing(int[] A, int index){
        for (int i = 0; i < index; i++){
            int current = A[i];
            int next = A[i+1];
            if (current >= next)
                return false;
        }
        return true;
    }
}
