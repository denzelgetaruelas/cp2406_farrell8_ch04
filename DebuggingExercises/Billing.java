/**
 * Created by Jc337839 on 21/08/17.
 */
public class Billing
{
    public static void main(String[] args)
    {
        double price = 24.5;
        int quantity = 5;
        double coupon = 12.60;
        computeBill(price);
        computeBill(price, quantity);
        computeBill(price, quantity, coupon);
    }
    public static void computeBill(double price)
    {
        double total = price * 1.08;
        System.out.println("Total price: $" + String.format("%.2f", total));
    }
    public static void computeBill(double price, int quantity)
    {
        double total = price * quantity + 1.08;
        System.out.println("Total price: $" + String.format("%.2f", total));
    }
    public static void computeBill(double price, int quantity, double coupon)
    {
        double total = ((price * quantity) - coupon) * 1.08;
        System.out.println("Total price: $" + String.format("%.2f", total));
    }
}
