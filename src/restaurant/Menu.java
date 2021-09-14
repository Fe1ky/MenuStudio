package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        MenuItem noodles = new MenuItem("Noodles", 19.99, "Main Course", "Noodles and Butter");
        MenuItem cake = new MenuItem("Cake", 4.99, "Dessert", "Chocolate Cake");
        MenuItem pizza = new MenuItem("Pepperoni Pizza", 15.99, "Main Course", "Pepperoni Pizza with red sauce");
        MenuItem iceCream = new MenuItem("Chocolate Ice-Cream", 3.99, "Dessert", "IceCream with the flavor chocolate");
        MenuItem friedPickles = new MenuItem("Fried Pickles", 8.99, "Appetizer", "Deep-Fried Pickles");
        MenuItem mozzarellaSticks = new MenuItem("Mozzarella Sticks", 7.99, "Appetizer", "Deep-Fried Mozzarella Sticks");

        ArrayList<MenuItem> menuItems = new ArrayList<>();



        menuItems.add(noodles);
        menuItems.add(cake);
        menuItems.add(pizza);
        menuItems.add(iceCream);
        menuItems.add(friedPickles);
        menuItems.add(mozzarellaSticks);

        for(int i = 0; i<menuItems.size(); i++) {
            if(i == (menuItems.size() - 1)) {
               menuItems.get(i).setNewItem(true);
           }
        }




        Date latestUpdateTime = new Date();

        System.out.println("Last update to program is: " + latestUpdateTime);


        System.out.println("Please input a menu-item: ");

        String input = in.nextLine();

        System.out.println("your input is: " + input);


        for(MenuItem item : menuItems) {
            String var1 = item.getItemName();
            System.out.println("working");
            if (input.equals(var1)) {
                menuItems.remove(item);
                break;
            }

            System.out.println("Please input item price: ");
            String priceInput = in.nextLine();
            double price = Double.parseDouble(priceInput);


            System.out.println("Please input category (Appetizer, Main Course, or Dessert): ");
            String category = in.nextLine();


            System.out.println("Please input menu item description: ");
            String description = in.nextLine();


            MenuItem newItemInForLoop = new MenuItem(input, price, category, description);
            menuItems.add(newItemInForLoop);
            break;
        }

/*`
        ArrayList<String> menuItems = new ArrayList<>();
        ArrayList<String> dateAdded = new ArrayList<>();
        String tempName;
        int tempPrice;
        String tempDescription;
        String tempCategory;

        String date = "1/1/21";
        MenuItem item1 = new MenuItem("Apple Pie", 1.0, "Delicious and American", "dessert");
        menuItems.add(item1.getItemName());
        menuItems.add()

        do {
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                students.add(newStudent);
            }

        } while(!newStudent.equals(""));
*/
        int lastItem = menuItems.size() - 1;
        menuItems.get(lastItem).setNewItem(true);







        /*




        A way to add and remove menu items from the menu.  -- adding and removing arraylist
        A way to tell if a menu item is new.
        A way to tell when the menu was last updated.
        A way to print out both a single menu item as well as the entire menu.
        A way to determine whether or not two menu items are equal.







        The menu consists of several menu items.

        Each menu item has a price, description, and category (appetizer, main course, or dessert).

        It should be possible to display whether or not a menu item is new.

        The app should know when the menu was last updated, so visitors can see that the restaurant is constantly changing and adding exciting new items.

         */


    }
}
