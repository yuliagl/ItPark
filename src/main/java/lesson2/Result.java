package lesson2;

public class Result {
    public static void main(String[] args) {
        long summa1 = summa(99, 4);
        System.out.println(summa1);
        long summa2 = summa(9012, 1);
        System.out.println(summa2);
        long minus1 = minus(99, 100);
        System.out.println(minus1);
    }

    public static long summa(int arg1, int arg2) {
        int result;
        result = arg1 + arg2;
        return result;

    }

    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;

    }
}
