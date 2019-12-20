import java.util.Scanner;
class BCalc {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long width, height, area;
        double paintPrice, totalPaintPrice;

        System.out.println("Enter an width:");
        width = scan.nextInt();
        
        
        System.out.println("Enter a height:");
        height = scan.nextInt();
        
        System.out.println("Enter Price of Paint");
        paintPrice = scan.nextDouble();
        
        area = width * height;
        
        totalPaintPrice = paintPrice * area;
        
        System.out.println("Cost to Paint: $" + totalPaintPrice); 
     }
    }

