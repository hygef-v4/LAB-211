package Fibonacci;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 45; i++) {
            if (i == 44) {  // remove the last comma 
                System.out.println(fib(i));
            } else {
                System.out.print(fib(i) + ", ");
            }
        }
    }
    // return nth fibonacci 
    static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
