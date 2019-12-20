import java.util.Scanner;
class CAge {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         int age, days;
         
         System.out.println("Enter Age: ");
         age =  scan.nextInt();
         
         
         days = 365 * age;
         
         System.out.println("you have been living a lie at least: " + days + " days");
        

    }
}
