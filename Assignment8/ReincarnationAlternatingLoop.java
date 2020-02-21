import java.util.Scanner;
public class ReincarnationAlternatingLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         System.out.println("Press any number too leave the womb");
         int womb = scan.nextInt();
         int sum = 0;
         while (womb > 0) {
        
         System.out.println("Enter a number for your gene pool: ");
         int Gene1 = scan.nextInt();
         System.out.println("Enter another number for your gene pool: ");
         int Gene2 = scan.nextInt();
        
         if (Gene1 > Gene2) {
            System.out.println("You are a boy");
         } else {   
            System.out.println("You Are a girl");
         }
         
         System.out.println("Press any number too go through childhood");
         int birth = scan.nextInt();
        
         
        
         System.out.println("Going through childhood...");
         System.out.println("press any number to go through puberty");
         int puberty = scan.nextInt();
         System.out.println("press any number to go adulthood");
         int adulthood = scan.nextInt();
         
         
         if (puberty > puberty) {
             System.out.println("press any number to go through  late adulthood to death");
             int lateAdultHood = scan.nextInt();
             System.out.println();
            } else {
            System.out.println("You have died from old age");
            System.out.println("You have either killed yourself or died from old age");
            System.out.println("either way your timeline has been completed and will replay from the start");
            System.out.println();
            System.out.println("During your next loop you might experince a feedback memory loop or De Ja Vu this feedback is intended to keep the systems memory from over flowing");
            System.out.println();
            System.out.println("The loop will continue from childhood as you will have no memory of birth from the first run");
            System.out.println("You will also be able to choose your gender so the next loop won't be the same as the last cycle");
            System.out.println("Resetting timeline...");
               
        
       
         }           
      }    
   } 
}   