package Exercitiul4;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class EX4 {
    public static void main(String[] args) {
        Random random=new Random();

        int a=random.nextInt(30)+1;
        int b=random.nextInt(30)+1;

        System.out.println("a=" + a);
        System.out.println("b=" +b);
//metoda lui euclid
        int cmmdc = calculateCmmdc(a, b);

        System.out.println("CMMDC(a, b) = " + cmmdc);
    }

    private static int calculateCmmdc(int a, int b) {
        if (b == 0) {
            return a;
        }

        return calculateCmmdc(b, a % b);

    }
}
