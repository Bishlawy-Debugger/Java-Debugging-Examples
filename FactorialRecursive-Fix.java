// Fixed version: includes base case
public int factorial(int n) {
    if (n == 0) {
        return 1; // base case
    }
    return n * factorial(n - 1);
}
