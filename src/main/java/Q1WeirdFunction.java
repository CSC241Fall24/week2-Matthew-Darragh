// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n < 3) {
            return n;
        }
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
    }

    public static int fIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n < 3) {
            return n;
        }
        
        int f0 = 0, f1 = 1, f2 = 2;
        int result = 0;
        
        for (int i = 3; i <= n; i++) {
            result = f2 + 2 * f1 + 3 * f0;
            f0 = f1;
            f1 = f2;
            f2 = result;
        }
        
        return result;
    }
}
