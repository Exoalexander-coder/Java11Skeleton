import java.util.Scanner; //imports scanner utility to begin code

class RunofIntegers { // declares program class name

    public static void main(String[] args) { // holds the rest of the code
        Scanner scan = new Scanner(System.in); //begins scanning code letter by letter

        int runStart; //declares first variable

        int RunEnd; //declares second Variable

        System.out.println("Enter Start:  "); // prompts user for input
        runStart = scan.nextInt();
        
        System.out.println("Enter End: "); // prompts user for input
        RunEnd = scan.nextInt(); // recalls second variable for use 
        

        

        while (runStart <= RunEnd) { // declares a loop to the program
            System.out.println (runStart); // 
            runStart +=1;  
            
        }
    }
}
