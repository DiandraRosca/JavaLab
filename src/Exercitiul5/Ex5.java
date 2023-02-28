package Exercitiul5;
import java.util.Random;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Random random = new Random();

        int n = random.nextInt(20) + 1;
        System.out.println("n=" + n);

        boolean isInFibonacciSequence = checkFibonacci(n);

        if (isInFibonacciSequence) {
            System.out.println(n + " este in sirul lui Fibonacci");
        } else {
            System.out.println(n + " nu este in sirul lui Fibonacci");
        }
    }

    private static boolean checkFibonacci(int n) {
        int a = 0, b = 1, c = 1;

        while (c < n) {
            a = b;
            b = c;
            c = a + b;
        }

        if (c == n) {
            return true;
        } else {
            return false;
        }


    }
}

