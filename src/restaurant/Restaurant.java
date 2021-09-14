package restaurant;

import java.util.ArrayList;


public class Restaurant {

    public static void main(String[] args){

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

        Menu menu = new Menu(menuItems);
        menu.addMenuItem(mozzarellaSticks);
        menu.removeMenuItem(mozzarellaSticks);





    }
}
