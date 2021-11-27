package courses.DShelydko.v13.task2;

import java.util.Scanner;

public class lab2 {public static void main(String[] args) {
    //таблица 1
    //задача 13
    Scanner scan = new Scanner(System.in);
    String mane = scan.nextLine();
    int x, b, x1, x2, x3;
    x = scan.nextInt();
    x1 = x / 100;
    x2 = (x / 10) % 10;
    x3 = x % 10;
    if ((x1 == x2) || (x1 == x3) || (x2 == x3)) {
        System.out.println("есть");
    } else {
        System.out.println("нет");
    }
    //задача 9
    int R, A;
    R = scan.nextInt();
    A = scan.nextInt();
    if (R * 2 > A) {
        System.out.println("нет");
    } else {
        System.out.println("да");
    }
    //таблица 2
    //задача 9
    int d1;
    d1 = scan.nextInt();
    if (d1 < 10) {
        System.out.println(d1);
    } else
        switch (d1) {
            case 10:
                System.out.println("A");
                break;
            case 11:
                System.out.println("B");
                break;
            case 12:
                System.out.println("C");
                break;
            case 13:
                System.out.println("D");
                break;
            case 14:
                System.out.println("E");
                break;
            case 15:
                System.out.println("F");
                break;
            default:
                System.out.println("Oooops, something wrong !");

        }

}
}
