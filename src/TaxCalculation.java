public class TaxCalculation {
    public static void main(String[] args) {
        double productPrice1 = 100;
        double productPrice2 = 200;
        final double tax1 = 0.15;
        final double tax2 = 0.10;
        double total_Tax1 = productPrince1 * tax1;
        double total_Tax2 = productPrice2 * tax2;
        double Total_final = total_Tax1 + total_Tax2; 
        
        if (Total_final > 50) {
            System.out.println("High total tax: " + Total_final);
        } else {
            System.out.println("Low tax");
        }
    }
}
