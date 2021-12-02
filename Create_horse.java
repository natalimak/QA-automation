package HW_3;

public class Create_horse {
    public static void main(String[] args) {
        Horse h = new Horse("Vasya",4);
        Horse h1 = new Horse("Haim");
        Horse h2 = new Horse();
        System.out.println("h: "+h.getName()+" "+"h1: "+h1.getName()+" "+"h2: "+ " "+ h2.getName());

    }
}
