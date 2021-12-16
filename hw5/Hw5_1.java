package hw5;

public class Hw5_1 {
    public static void main(String[] args) {
        //int a=0;
       // int a=1/0;

        //this using with try-not catches exception than doesn't exist in "try",
        // need to move "int a=1/0;" to Try block
        try
        {
            int a=1/0;
            System.out.println(10/a);
        }
        //catch Arithmetic exception only

        /*catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("bad math");
        }
        //catch every exception
        catch(Exception e){
            e.printStackTrace();
            System.out.println("bad move");
        }
        */finally{
            System.out.println("Will always run...");
        }
        System.out.println("This will be printed, because we handled the exception!");

    }
}
