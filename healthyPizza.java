public class healthyPizza extends basePizza {
    public
    void add_lowFatPaneer(int index) {
        this.price[index] += 50;
        toppings++;
        System.out.println("Total = " + this.price[index]);
    }


    @Override
    void buyPizza(int itemNo) {
        int index = itemNo-1,choice=0;
        System.out.println("You have selected " + this.name[index]);
        System.out.println("1. Add Hawaiian & Kale topping");
        System.out.println("2. Add low fat paneer topping");
        System.out.println("3. Add olive topping");
        System.out.println("4. Buy pizza");
        while (choice!=4) {
            choice= read.nextInt();
            switch (choice) {
                case 1:
                    add_capsicum(index);
                    break;
                case 2:
                    add_lowFatPaneer(index);
                    break;
                case 3:
                    add_olives(index);
                    break;
                case 4:
                    System.out.println("Checking out");
                    bill(index);
                    break;
                default :
                    System.out.println("Invalid Choice");
            }
        }
    }
}