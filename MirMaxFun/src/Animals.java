public class Animals {
    String name;
    protected void sayHello(){
        System.out.println("Hello!");
    }
    void eat(){
        System.out.println("I eating....");
    }

//    public Animals(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
