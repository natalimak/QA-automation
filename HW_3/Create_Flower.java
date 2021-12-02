package HW_3;

public class Create_Flower {
    public static void main(String[] args) {
        Flower f = new Flower("Chamomile", 4, "Spring", "White");
        Flower f1 = new Flower("Cyclamen", 6, "Winter", "Purple");
        Flower f2 = new Flower();
        f.print_flower();
        f1.print_flower();
        f2.print_flower();


    }
}
