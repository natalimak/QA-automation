package HW_3.Refrigerator;

public class Use_ref {
    public static void main(String[] args) {
        Refrigerator mySharp = new Sharp();
        mySharp.status();

        mySharp.open();
        mySharp.status();

        mySharp.freeze(-4);
        mySharp.status();

        mySharp.close();
        mySharp.status();

    }
}
