package restaurant;

public class MenuItem {

    private String itemName;
    private Double itemPrice;
    private String description;
    private String category;
    private Boolean newItem;



    public MenuItem(String itemName, Double itemPrice,String description,String category){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.description = description;
        this.category = category;
        this.newItem = true;
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
        return getNewItem();
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
