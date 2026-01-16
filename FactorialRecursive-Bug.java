// Buggy version: missing base case, causes infinite recursion
public int factorial(int n) {
    // Bug: no base case for n == 0
    return n * factorial(n - 1); 
}
