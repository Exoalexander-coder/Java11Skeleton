
import java.util.Scanner;
class Echo {
    public static void main (String[] args) {
        String inData;
        Scanner dog = new Scanner(System.in);
        System.out.print("Enter your name:");
        inData = dog.nextLine();
        System.out.print("Hello, " + inData + ".");
    }
}