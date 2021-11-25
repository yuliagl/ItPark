package lesson7;


public class dz4 {

    public static void main(String[] args) {
        //int f = 500;
        Animals another = new Animals();
        /*another.runCat = 100;
        another.jumpCat = 5;
        another.swimCat = false;
        another.jumpDog = 2;
        another.runDog = 150;
        another.swimDog = true;
        another.swimFish = true;
        another.runFish = false;
        another.jumpFish = false;*/
        //System.out.println("Брошка прыгает в высоту на " + another.jumpCat + " метров");
        /*if (f > another.runDog) {
            System.out.println("Собака не может пробежать " + f + " метров");
        } else {
            System.out.println("Собака сможет пробежать " + f + " метров");
        }*/
        System.out.println(another.jumpFish+", так как рыбы не умеют прыгать");
        System.out.println("Кошка может пробежать "+another.runCat(190)+" метров");
        System.out.println("Кошка прыгает на "+another.jumpCat(6) +" метров");
        System.out.println("Собака может проплыть "+another.swimDog(8) + " метров или пока не устанет");
        System.out.println(another.swimfish(true));
        System.out.println(another.runFish+",так как рыбы не умеют бегать");
        System.out.println(another.swimCat+", так как кошки не умеют плавать");
        System.out.println("Собака может пробежать "+another.runDog(80)+ " метров");
        System.out.println("Собка может подбрыгнуть на "+another.jumpDog(1)+" метров");



    }

}