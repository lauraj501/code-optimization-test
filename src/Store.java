public class Store {
    public static void main(String[] args) {
        final int precio1 = 15;
        final int precio2 = 10;
        final int precio3 = 5;

        int total1 = p1 * 2;
        int total2 = p2 * 3;
        int total3 = p3 * 4;

        int totalSales = total1 + total2 + total3;

        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
