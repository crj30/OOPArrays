import java.io.OptionalDataException;

public class Order {
    public static final String[] RESTAURANTS =  { "McDonalds", "Burger King", "Little Caesars"};

    public static final String [][] MENUS = {
            {"Big Mac Meal", "McNuggets Meal", "McChicken Meal"},
            {"Whopper Meal", "Chicken Tenders Meal", "Kids Meal"},
            {"Pepperoni Pizza", "Cheese Pizza", "Meat Lovers Pizza"}};


    private int restaurantIndex;
    private int menuIndex;

    public void setRestaurantIndex(int restaurantIndex){this.restaurantIndex = restaurantIndex; }
    public void setMenuIndex (int menuIndex){ this.menuIndex = menuIndex;}

    public int getRestaurantIndex(){ return this.restaurantIndex;}
    public int getMenuIndex(){return this.menuIndex;}

    }




