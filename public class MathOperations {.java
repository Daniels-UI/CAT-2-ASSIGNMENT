public class MathOperations {
    
    public int multiply(int a, int b) {
        return a * b;
    }

    
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    
    public int multiply(int... numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        System.out.println("Multiplication of 2 numbers: " + mathOps.multiply(3, 4)); // Output: 12
        System.out.println("Multiplication of 3 numbers: " + mathOps.multiply(2, 3, 4)); // Output: 24
        System.out.println("Multiplication of multiple numbers: " + mathOps.multiply(1, 2, 3, 4)); // Output: 24
    }
}
