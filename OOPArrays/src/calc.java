import java.text.DecimalFormat;
import java.util.Scanner;

public class calc {

    public static void main(String args[]) {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Welcome to Uber Dash, the best food delivery around!");
        startOrder(inputDevice);

    }

    public static void startOrder(Scanner inputDevice) {
        Customer customer = createCustomer(inputDevice);
        Order order = pickRestaurant (inputDevice, customer);
        order = pickFood (inputDevice, order, customer);
        System.out.println("Thanks for your order! Your receipt will be emailed to you.");
        System.out.println("Your order will be delivered to " + customer.getAddress() + ".");



    }

    public static Customer createCustomer(Scanner inputDevice){
        Customer customer = new Customer();
        System.out.print("What is your name?");
        customer.setName(inputDevice.nextLine());
        System.out.print("Where would you like this order delivered?");
        customer.setAddress(inputDevice.nextLine());
        return customer;
    }

    public static Order pickRestaurant(Scanner inputDevice, Customer customer){
        int restaurantSelection = 0;
        Order order = new Order();

        for(int i=0; i < Order.RESTAURANTS.length; i++){
            System.out.println((i+1)+ "."+ Order.RESTAURANTS[i]);
        }
        System.out.println("What restaurant would you like to order from?");
        restaurantSelection = Integer.parseInt(inputDevice.nextLine());
        order.setRestaurantIndex(restaurantSelection - 1);
        return order;

    }

    public static Order pickFood(Scanner inputDevice, Order order, Customer customer){
        int restaurantSelected = order.getRestaurantIndex();
        int food = 0;
            do{
                for (int i = 0; i < Order.MENUS[restaurantSelected].length; i++) {
                    System.out.println((i + 1) + "." + Order.MENUS[restaurantSelected][i]);
                    System.out.println("What would you like to eat?");
                    food = Integer.parseInt(inputDevice.nextLine());
                }
            }while (food < 1 || food > Order.MENUS[restaurantSelected].length);

            order.setMenuIndex(food - 1);
            return order;
        }




    }


