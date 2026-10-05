public class PermutationCombination {

    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        long nPr = factorial(n) / factorial(n - r);
        long nCr = factorial(n) / (factorial(r) * factorial(n - r));

        System.out.println("n = " + n + ", r = " + r);
        System.out.println("Permutation (nPr): " + nPr);
        System.out.println("Combination (nCr): " + nCr);
    }
}
