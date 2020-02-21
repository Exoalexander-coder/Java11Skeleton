import java.util.Scanner;
public class LastChanceGas {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        
        
        int tankCapacity, fuelTankPrecent, VehicleMPG;
        final int distance = 200;
        
        System.out.println("Tank Capacity Percent: ");
        tankCapacity = scan.nextInt();
        
        System.out.println("Fuel percent remaining: ");
        fuelTankPrecent = scan.nextInt();
        
        System.out.println("Vehicle MPG rating: ");
        VehicleMPG = scan.nextInt();
       
        int gallonsRemaining = (fuelTankPrecent * tankCapacity) / 100;
        
        int range = VehicleMPG();
        
        
       
        
    }
}    