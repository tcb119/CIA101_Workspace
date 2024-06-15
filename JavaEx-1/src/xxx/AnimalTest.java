package xxx;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal(2,5.0f);
        animal.speak();

        System.out.println("=== 三年過去了 ===");

        animal.setAge(5);
        animal.setWeight(12.0f);
        animal.speak();
    }
}
