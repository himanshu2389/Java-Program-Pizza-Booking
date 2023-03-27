import java.util.Scanner;

public class basePizza {
    protected
    int count = 0,toppings=0;
    double price[] = new double[5];
    String name[]= new String[5];
    String size[] = new String[5];
    public
    Scanner read = new Scanner(System.in);
    void addPizza (String name, String size, double price){
        this.name[count] = name;
        this.price[count] = price;
        this.size[count] = size;
        count++;
    }
    void add_capsicum(int index) {
        this.price[index] += 30;
        toppings++;
        System.out.println("Total = " + this.price[index]);
    }
    void add_cheese(int index) {
        this.price[index] += 40;
        toppings++;
        System.out.println("Total = " + this.price[index]);
    }
    void add_olives(int index) {
        this.price[index] += 50;
        toppings++;
        System.out.println("Total = " + this.price[index]);
    }
    void showMenu () {
        System.out.println("**     Menu       **");
        for(int i=0;i<count;i++) {
            System.out.println("        "+(i+1)+"            ");
            System.out.println("| "+this.name[i]);
            System.out.println("| "+this.price[i] + " Rs.");
        }
        System.out.println("___________________________");
    }
    void buyPizza(int itemNo) {
        int index = itemNo-1,choice=0;
        System.out.println("You have selected " + this.name[index]);
        System.out.println("1. Add Cheese Topping");
        System.out.println("2. Add Capsicum topping");
        System.out.println("3. Add olive topping");
        System.out.println("4. Buy pizza");
        while (choice!=4) {
            if(toppings==2) {
                System.out.println("\n You have added max no. of topping. Checking out");
                bill(index);
                break;
            }
            else {
                choice= read.nextInt();
                switch (choice) {
                    case 1:
                        add_capsicum(index);
                        break;
                    case 2:
                        add_cheese(index);
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
    void bill(int index) {
        String cName,cNo;
        System.out.println("Please enter your name");
        read.nextLine();
        cName=read.nextLine();
        System.out.println("Please enter your contact no. ");
        cNo=read.nextLine();
        System.out.println("\n********Reciept*********");
        System.out.println(cName + " : "+ cNo);
        System.out.println(this.name[index] + " Pizza "+this.price[index] + "rs.");
    }
}