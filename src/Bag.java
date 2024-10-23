import java.util.ArrayList;

public class Bag {
    private class Item {
        String name;
        int quantity;

        Item(String name) {
            this.name = name;
            this.quantity = 1;
        }

        void incrementQuantity() {
            this.quantity++;
        }
    }

    private ArrayList<Item> items;

    public Bag() {
        this.items = new ArrayList<>();
    }

    public void add(String itemName) {
        for (Item item : items) {
            if (item.name.equals(itemName)) {
                item.incrementQuantity();
                return;
            }
        }
        items.add(new Item(itemName));
    }
    public int count(String itemName){
        for(Item item:items){
            if(item.name.equals(itemName)){
                return item.quantity;
            }
        }
        return 0;
    }
}

