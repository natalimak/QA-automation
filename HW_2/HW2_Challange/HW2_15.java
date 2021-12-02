package HW2_Challange;

public class HW2_15 {
    public static void main(String[] args) {
        int rows = 8;
        int space = rows-2;
        int j=1;
        for (int i = 1; i <= rows; ++i)
        {
            for (j = 1; j <= rows; ++j)
            {
                    if (j==i||j==rows+1-i)
                         System.out.print("*");

                    else
                        System.out.print(" ");
            }
           System.out.println();
        }
    }
}
