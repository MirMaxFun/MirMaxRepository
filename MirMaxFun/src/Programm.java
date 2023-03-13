import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Programm
{
    public static void main(String[] args) {
        //File file = new File("theme.txt");
        Scanner scanner = new Scanner(System.in);
        Integer x = null;
        int y = scanner.nextInt();
        try {
            System.out.println(x / y);
        } catch (ArithmeticException | NullPointerException ex) {
            System.out.println("На ноль делить нельзя/объекта не существует!");
        }//catch (NullPointerException e ){
//            System.out.println("Кажется такого объекта не существует");
//        }
//    }

    }
}