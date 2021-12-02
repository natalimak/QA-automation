package HW_3;

public class Horse {
    private String name;
    private int age;

    public Horse(String HorseName, int HorseAge) {
        name = HorseName;
        age = HorseAge;
    }

    public Horse(String HorseName) {
        name = HorseName;
    }

    public Horse() {
        name = "Horsy";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
