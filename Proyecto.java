package proyecto;

import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {
        boolean a1 = true, a2 = true, a3 = false, a4 = false, a5 = false;
        boolean t1 = true, t2 = true, t3 = false, t4 = false, t5 = false;

        Scanner num = new Scanner(System.in);

        System.out.println("Cuantas iteraciones decea hacer: ");
        int ite = num.nextInt();

        for (int i = 0; i < ite; i++) {

            a1 = t1;
            a2 = t2;
            a3 = t3;
            a4 = t4;
            a5 = t5;

            System.out.print("( ");

            if ((a4 || a5) == true) {
                t1 = true;
                System.out.print("1 ");
            } else {
                t1 = false;
                System.out.print("0 ");
            }

            if (a3 == true) {
                t2 = true;
                System.out.print(",1 ");
            } else {
                t2 = false;
                System.out.print(",0 ");
            }

            if ((a2 || a5) == true) {
                t3 = true;
                System.out.print(",1 ");
            } else {
                t3 = false;
                System.out.print(",0 ");
            }

            if ((a1 || a5) == true) {
                t4 = true;
                System.out.print(",1 ");
            } else {
                t4 = false;
                System.out.print(",0 ");
            }

            if (a2 == true) {
                t5 = true;
                System.out.print(",1 ");
            } else {
                t5 = false;
                System.out.print(",0 ");
            }

            System.out.println(")");
        }

    }
}
