abstract class Order
{
    abstract void orderFood();
    void items(String item)
    {
        System.out.println("Food items : " + item);
    }
    void bill(int amount)
    {
        System.out.println("Total bill : " + amount);
    }
    void quantity(int quantity)
    {
        System.out.println("Quantity : " + quantity);
    }
}
class FoodOrder extends Order
{
    public void orderFood()
    {
        System.out.println("Order placed successfully");
    }
    public static void main(String args[])
    {
        FoodOrder f = new FoodOrder();
        f.items("Dose");
        f.quantity(3);
        f.orderFood();
        f.bill(500);
    }
}
