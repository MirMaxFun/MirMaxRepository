import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

public class Programm
{
//    public static void main(String[] args) {
//        //File file = new File("theme.txt");
//        Scanner scanner = new Scanner(System.in);
//        Integer x = null;
//        int y = scanner.nextInt();
//        try {
//            System.out.println(x / y);
//        } catch (ArithmeticException | NullPointerException ex) {
//            System.out.println("На ноль делить нельзя/объекта не существует!");
//        }//catch (NullPointerException e ){
////            System.out.println("Кажется такого объекта не существует");
////        }
////    }


    public static void main(String[] args) {
//        int[] numbers = new int[5];
//        //System.out.println(Arrays.toString(numbers));
//        numbers[0] = 1;
//        for (int i = 1; i < numbers.length; i++){
//            numbers[i] = i+1;
//        }
//        //System.out.println(Arrays.toString(numbers));
//        ArrayList<Integer> arrayNumbers = new ArrayList<>(1000);
//
//        arrayNumbers.add(6);
//        arrayNumbers.add(7);
//        arrayNumbers.add(8);
//        arrayNumbers.add(9);
////        System.out.println(arrayNumbers);
////        System.out.println(arrayNumbers.size());
////        System.out.println(arrayNumbers.get(1));
////        System.out.println(arrayNumbers.get(2) + arrayNumbers.get(3));
//        arrayNumbers.set(0, 10);
//        //System.out.println(arrayNumbers);
//
//
//        ArrayList<Integer> NewArray = new ArrayList<>(arrayNumbers);
//        System.out.println(NewArray.size());
//        for (int i = 0; i < arrayNumbers.size(); i++) {
//            arrayNumbers.set(i, 10+i);
//        }
////        System.out.println(arrayNumbers);
////        System.out.println(NewArray.get(1));
//        NewArray.addAll(0, arrayNumbers);
////        System.out.println(NewArray.get(1));
//        System.out.println(NewArray);
////        System.out.println(NewArray.size());
////        for (int x :
////                NewArray) {
////            System.out.print(x + " ");
////        }
//        NewArray.remove(0);
//        System.out.println(NewArray);
//        NewArray.remove(NewArray.size() - 1);
//        System.out.println(NewArray);
//        NewArray.remove(arrayNumbers);
//        System.out.println(NewArray);
//        NewArray.add(0, 10);
//        System.out.println(NewArray);
//        NewArray.clear();
//        System.out.println(NewArray);
//        System.out.println(NewArray.isEmpty());
//        if (NewArray.isEmpty()){
//            System.out.println("Massive is Empty");
//        } else {
//            System.out.println("Massive not Empty");
//        }
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("one");
//        strings.add("two");
//        strings.add("three");
//        strings.add("four");
//        strings.add("five");
//        System.out.println(strings);
//        System.out.println(strings.indexOf("four"));
//        //strings.remove("three");
//        System.out.println(strings);
//        System.out.println(strings.indexOf("four"));
//        Comparator<String> sortByWordLength = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
//        strings.sort(sortByWordLength);
//        System.out.println(strings);


//        HashMap<Integer, String> numbers = new HashMap<>();
//        numbers.put(1, "one");
//        numbers.put(2, "two");
//        numbers.put(3, "three");
//        numbers.put(4, "four");
//        numbers.put(5, "five");
//        numbers.put(6, "six");
//        numbers.put(7, "seven");
////        System.out.println(numbers);
////        System.out.println(numbers.get(2));
//        numbers.remove(2);
//        System.out.println(numbers);
//        System.out.println(numbers.get(2));
//        System.out.println(numbers.size());
//        System.out.println(numbers.values());
//        ArrayList<String> arrayValue = new ArrayList<>(numbers.values());
//        for (int i = 0; i < arrayValue.size(); i++) {
//            System.out.print(arrayValue.get(i) + " ");
//
//        }
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.print(numbers.get(i + 1) + " ");
//        }
//        for (String value : numbers.values()) {
//            System.out.println(value);
//        }
//        for (int key : numbers.keySet()) {
//            System.out.println(key);
//        }
//        for (Map.Entry<Integer, String> set : numbers.entrySet()){
//            System.out.print(set.getKey() + " " + set.getValue() + " ");
//        }



        //public
        //protected
        //private
        //(default)
        //static
        //finale
        //void
//        Animals animals = new Animals("Name");
//        animals.eat();
//        Cat cat = new Cat("Mosya");
//
//        cat.getName();
//        cat.sayHello();
//        Dog dog = new Dog("Doggy");
//        dog.sayHello();
//        cat.sayHello();
//        dog.eat();
//        cat.eat();
//        cat.eat("Xuy");
//        Animals carOrDog = new Dog("Sharik");
//        carOrDog.sayHello();
//        long x =10;
//        int y = (int) x; //10
//        System.out.println(carOrDog instanceof Animals);

        ArrayList<Animals> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Animals());
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(i + " " + youACat(animals.get(i)));
        }


    }

    static boolean youACat(Animals obj) {
        if (obj instanceof  Cat){
            return true;
        }
        else return false;

    }



}