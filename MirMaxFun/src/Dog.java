public class Dog extends Animals {
    String meal = "bone";

//    public Dog(String name) {
//        super(name);
//        System.out.println(name);
//    }

    @Override
    protected void sayHello(){
        System.out.println("Wow!");
    }

    protected void eat(String meal){
        System.out.println("I eating.... " + meal);
    }

}
