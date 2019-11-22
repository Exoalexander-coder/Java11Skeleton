public class TicketCalcTax {
    public static void main(String[] args) {
        double ticketPrice = 23.45;
        double purchaseAmount = 8;
        double  preTaxPrice = ticketPrice * purchaseAmount ;
        double taxAmount = preTaxPrice * 0.12;
        double totalCost = preTaxPrice * 1.12;

        System.out.println("Total cost = "+ ticketPrice * purchaseAmount + "dollars ");
        System.out.println("Total Tax: " + taxAmount);
        System.out.println("Total with tax:" + totalCost);
    }
}
