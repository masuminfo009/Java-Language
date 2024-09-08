import java.util.Scanner;

public class First{
    public static void main(String[] args) {
        System.out.println("\n");




    Scanner input = new Scanner(System.in);

        System.out.print("Enter your year: ");
        int year = input.nextInt();
        

        if (year%400==0) {
            System.out.println("It is Lepear ... ");
        }
        else if (year%4==0 && year%100 !=0) {
            System.out.println("It is a Lepear .. ");
        }
        else{
            System.out.println("Not Lepear ... ");
        }






        System.out.println("\n");
    }
}