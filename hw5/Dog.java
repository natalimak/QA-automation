package hw5;

public class Dog {
    String name;
    String color;
    int age;
public Dog (String dogName, String dogColor, int dogAge){
    name=dogName;
    color=dogColor;
    age=dogAge;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
