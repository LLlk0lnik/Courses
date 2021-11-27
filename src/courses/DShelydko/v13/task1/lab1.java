package courses.DShelydko.v13.task1;

import java.util.Scanner;

public class lab1 {public static void main(String[] args) {
    //1-ое задание
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    double j;
    double b;
    double c;
    double x;
    double resylt;
    //1-ая формула
    j = scanner.nextInt();
    x = scanner.nextInt();
    resylt = (2*3.14*j+Math.pow(Math.tan(x), 3))/ (2*j*Math.abs(Math.cos(x)));
    System.out.println(resylt);
    //2-ая формула
    j = scanner.nextInt();
    x = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();
    resylt = (Math.pow(x, 3) + Math.pow(x, 2) * Math.pow(Math.sin(b), 2)*x + c) / (1+(Math.pow(x, 2)+c)/(1-x));
    System.out.println(resylt);
    //2-ое задание
    //13-ая задача
    double Y1, Y2, X1, X2, otvet1, otvet2;
    Y1 = scanner.nextInt();
    Y2 = scanner.nextInt();
    X1 = scanner.nextInt();
    X2 = scanner.nextInt();
    otvet1 = ((Y2-Y1)/2)+Y1;
    otvet2 = ((X2-X1)/2)+X1;
    System.out.println(otvet1);
    System.out.println(otvet2);
    //1-ая задача
    double osn1, osn2, alfa,s;
    osn1 = scanner.nextInt();
    osn2 = scanner.nextInt();
    alfa = scanner.nextInt();
    s = ((Math.pow(osn1, 2) - Math.pow(osn2, 2)) * Math.tan(alfa))/2;
    System.out.println(s);
    //5-ая задача
    double A, B, otv1,otv2,otv3;
    A = scanner.nextInt();
    B = scanner.nextInt();
    otv1 = A * 1024;
    otv2 = B / 1024;
    otv3 = (A*Math.pow(2, -20))-(B*Math.pow(2, -20));
    System.out.println(otv1);
    System.out.println(otv2);
    System.out.println(otv3);
    //18-ая задача
    double h, V, S,Otv1;
    h = scanner.nextInt();
    V = scanner.nextInt();
    S=V/h;
    Otv1 = s/(2*3.14*h);
    System.out.println(S);
    System.out.println(Otv1);
}
}
