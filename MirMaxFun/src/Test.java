public class Test {
    public static void main(String[] args) {
        metod1();
    }
    public static void metod1() {
        System.out.println("перед вызовом метода 2");
        metod2();
        System.out.println("вышли из метода 2");
    }
    public static void metod2() {
        System.out.println("перед вызовом метода 3");
        metod3();
        System.out.println("вышли из метода 3");
    }
    public static void metod3() {
        System.out.println("Был вызван метод 3");
    }


}
