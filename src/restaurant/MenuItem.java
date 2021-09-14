package restaurant;

public class MenuItem {

    private String itemName;
    private Double itemPrice;
    private String description;
    private String category;
    private Boolean newItem = false;



    public MenuItem(String itemName, Double itemPrice,String category, String description){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.description = description;
        this.category = category;
    }

    public String getItemName(){
        return itemName;
    }
    public Double getItemPrice(){
        return itemPrice;
    }
    public String getDescription(){
        return description;
    }
    public String getCategory(){
        return category;
    }
    public Boolean getNewItem(){
        return newItem;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }


}
