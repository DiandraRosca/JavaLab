package Ex3;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dati un nr natural n=");
        int n=sc.nextInt();
        System.out.printf("divizorii lui "+ n + "sunt=");

        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        //verif dc nr e prim

        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
        {
            System.out.println();
            System.out.println( "este un nr prim "+n);

        }else {

            System.out.println("\n" + n + " nu este un nr prim ");
        }

    }
}
