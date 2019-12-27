package AbstractClass;

public class LivingThingExample {
    public static void main(String[] args) {
        Human human = new Human();
        Dog dog = new Dog();
        
        human.breath();
        human.eat();
        human.walk();
        
        System.out.println();
        dog.breath();
        dog.eat();
        dog.walk();
        
    }
    /*
         abstract fungsi walk = agar bisa override sesuai kelas yang dipakai dan subclass bisa memakai fungsi pada superclass
    */
}
