public class Cat extends Animals {
    String name;
    String meal = "Milk";

//    public Cat(String name) {
//        super(name);
//        System.out.println(this.name);
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void PrintName(){
        System.out.println(name);
    }
    @Override
    protected void sayHello(){
        System.out.println("Meow!");
    }

    void eat(String meal){
        System.out.println("I drink.... " + meal);
    }
}
