package overloading;

class MathOperations {
    // Multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Multiplication of 2 numbers: " + math.multiply(3, 4));
        System.out.println("Multiplication of 3 numbers: " + math.multiply(3, 4, 5));
    }
}
