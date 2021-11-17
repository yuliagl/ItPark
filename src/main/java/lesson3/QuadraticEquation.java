package lesson3;

import java.util.Scanner;

/*public class QuadraticEquation {
    // ax^2 + bx + c = 0
    // Сначалa надо найти дискрем.(D = b^2 - 4ac)


    public static void main(String[] args) {
        int i = 1;
        int i1 = 9;
        int i2 = 6;
        long d = dis(i,i1,i2);
        System.out.println(d);
    }
    /*if (int i == 0){
        System.out.println("Первый коэффициент не может быть 0");
    }else if(discreminant < 0){
        System.out.println("");
    }
    private static long dis(int a, int b,int c) {
        long d = (b * b) - (4 *(a * c));
        return d;
    }
}*/
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите значение c: ");
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней");
        }
    }
}