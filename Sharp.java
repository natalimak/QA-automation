package HW_3.Refrigerator;

public class Sharp implements Refrigerator {
    boolean closed;
    int temper;
    boolean light;

    public Sharp(){
        closed = true;
        temper = 4;
        light = false;
    }

    public void freeze(int temp) {
        temper=temp;
        System.out.println("current temperature is: "+temper);
        if (temper<0)
            System.out.println("Freezing mode");

        else
            System.out.println("Refrigerator mode");
    }
    public void open() {
        closed = false;
        light = true;
        System.out.println("the door is open,please close");
    }
    public void close() {
        closed = true;
        light = false;
        System.out.println("the door is closed,good boy");
    }

    public void status(){
        System.out.println("Temperature: "+ temper);
        if (closed)
            System.out.println("Door is closed");
        else
            System.out.println("Door is open");
        if (light)
            System.out.println("Light is ON");
        else
            System.out.println("Light is OFF");

    }
}
