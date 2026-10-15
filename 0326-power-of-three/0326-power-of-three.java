class Solution {
    public boolean isPowerOfThree(int n) {
           // Base case 1
        if (n == 1) {
            return true;
        }

        // Base case 2
        if (n <= 0 || n % 3 != 0) {
            return false;
        }

        // Recursive call
        return isPowerOfThree(n / 3);
        
    }
}