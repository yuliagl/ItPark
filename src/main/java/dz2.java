public class dz2 {
    public static void main(String[] args) {
        int a = 0;
        int num = 1;
        int b = 0;
        //Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            b = a;
            a = num;
            num = b + num;
            System.out.println(num);
            if(num > 1000){
                break;
            }
        }
    }
}
