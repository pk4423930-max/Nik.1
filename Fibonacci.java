public class Fibonacci {

    public static int getFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10;
        for (int i = 0; i < terms; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
    }
}
 
   
