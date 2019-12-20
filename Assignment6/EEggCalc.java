import java.util.Scanner;
class EEggCalc {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int eggAmount, eggDozen, eggSingles;
        
        System.out.println("Enter Amount of Eggs: ");
        eggAmount = scan.nextInt();
        
        eggDozen = eggAmount / 12;
        eggSingles = eggAmount % 12;
        
        System.out.println("You have " + eggDozen + " dozen and " + eggSingles + "eggs.");
    }
}

