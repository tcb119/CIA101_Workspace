package xxx;

public class Animal {
    private int age;
    private float weight;

    public Animal(int age, float weight) {
        if (age > 0)
            this.age = age;
        else
            System.out.println("請檢查輸入的年紀");

        if (weight > 0)
            this.weight = weight;
        else
            System.out.println("請檢查輸入的體重");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void speak() {
        System.out.println("此動物的年紀為：" + getAge() + "歲");
        System.out.println("此動物的體重為：" + getWeight() + "公斤");
    }

}
