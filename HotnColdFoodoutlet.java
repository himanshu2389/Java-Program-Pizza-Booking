import java.util.Scanner;
public class HotnColdFoodoutlet {
    public static void main (String args[]) {
        int itemNo;
        Scanner scan = new Scanner(System.in);
        basePizza base= new basePizza();
        healthyPizza hPizza = new healthyPizza();
        base.addPizza("Capricciosa", "Medium", 399.99);
        base.addPizza("Rosemary Pizza", "Regular", 259.99);
        base.addPizza("Squil Pizza", "Medium", 299.99);
        base.addPizza("Farm House", "Large", 499.99);
        base.addPizza("Paneer Makhani", "Regular", 279.99);
        hPizza.addPizza("Non-Veg Indi Tandoori", "Medium", 169.99);
        hPizza.addPizza("Hot Spicy Mushrooms", "Regular", 420.99);
        hPizza.addPizza("Ilalian Classics", "Medium", 640.99);
        hPizza.addPizza("Fresh Veggie", "Large", 480.99);
        hPizza.addPizza("Chicken Deluxe Wave", "Regular", 440.99);
        System.out.println("Welcome to La Pino's Pizza ordering system.");
        System.out.println("1. Healhty Pizza");
        System.out.println("2. Normal Pizza");
        int choice = scan.nextInt() ;
        switch (choice) {
            case 1:
                base.showMenu();
                System.out.println("Choose a pizza and enter the item no.");
                itemNo=scan.nextInt();
                base.buyPizza(itemNo);
                break;
            case 2:
                hPizza.showMenu();
                System.out.println("Choose a pizza and enter the item no.");
                itemNo=scan.nextInt();
                hPizza.buyPizza(itemNo);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}


