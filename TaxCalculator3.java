public class TaxCalculator3 {
    public static double calculateTax(int income) {
        double tax = 0;
        if (income > 1000000) {
            tax += (income - 1000000) * 0.4;
            income = 1000000;
        }
        if (income > 500000) {
            tax += (income - 500000) * 0.3;
            income = 500000;
        }
        if (income > 200000) {
            tax += (income - 200000) * 0.2;
            income = 200000;
        }
        if (income > 100000) {
            tax += (income - 100000) * 0.1;
        }
        return tax;
    }

    public static void main(String[] args) {
        int income = 600000;
        System.out.println("Tax: " + calculateTax(income));
    }
}