import java.util.Scanner;
public class PieEatingContest {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Weight of contestant: ");
        
        int weight = scan.nextInt();
       
        if (weight >= 220 && weight <= 280) {
            System.out.println("You are allowed to enter the contest:  ");
            
        } else {
            System.out.println("Your either too fat or too skinny");
            }
    }
}   