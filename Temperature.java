import java.util.Scanner;
    public class Temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double Temperature = sc.nextDouble();

        if(Temperature > 35){
            System.out.println("Temperature is Very Hot.");
        }
        else if(Temperature > 25){
            System.out.println("Pleasent Weather.");
        }
        else if(Temperature > 15){
            System.out.println("Cold Weather.");
        }
        else{
            System.out.println("Very Cold Weather.");
        }
        sc.close(); 
    }
}