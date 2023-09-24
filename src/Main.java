public class Main {
    public static void main(String[] args)
    {
        double salesTax = 1.05;
        double itemCost = 30;
        double totalCost = 0;

        totalCost = salesTax * itemCost;

        System.out.println("Your total cost including sales tax is "+ totalCost);
    }
}