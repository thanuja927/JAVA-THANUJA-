import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:");
        int Number = sc.nextInt();

        if(Number ==  7){
           System.out.println("Correct Guess!!");
        }
        else{
            System.out.println("Wrong Guess!!");
        }

        sc.close();
    }
}