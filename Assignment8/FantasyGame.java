import java.util.Scanner;
public class FantasyGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String characterName;
        int strength, health, luck;
        final int maxPoints = 15;
        
        System.out.println("Welcome to Soviet Trail");
        
        System.out.println("Enter name of character: ");
        String name = scan.nextLine();
        
        System.out.println("Enter strength (1-10): ");
        strength = scan.nextInt();
        
        System.out.println("Enter Health 1-10: ");
        health = scan.nextInt();
        
        System.out.println("Enter luck (1-10): ");
        luck = scan.nextInt();
        
        int totalpoints = strength + health + luck;
        if (totalpoints > maxPoints) {
            System.out.println("You have given too many points to your character and will be rest to points");
            strength = 5;
            health = 5;
            luck = 5;
        
        } else {
            System.out.println("You may now continue your quest to find the sacared hammer and sickle");
    }
    System.out.println(name + ", strength: " + strength + ", health: " + health +  ", luck: " + strength);
 } 
} 
    