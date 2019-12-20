import java.util.Scanner;
class ACalculate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long width, height, area;

        System.out.println("Enter an width:");
        width = scan.nextInt();
        
        
        System.out.println("Enter a height:");
        height = scan.nextInt();
        
        area = width * height;
        
        System.out.println("Area = " + area);
    }
}
