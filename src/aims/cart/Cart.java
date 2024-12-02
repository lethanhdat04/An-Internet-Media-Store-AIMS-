package aims.cart;

import aims.media.DigitalVideoDisc;

import java.util.ArrayList;

public class Cart {

    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered = 0;
    private final ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
            qtyOrdered++;
        } else {
            System.out.println("The cart is full. Cannot add more items.");
        }
    }

    //Overloading by differing types of parameter
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for (DigitalVideoDisc digitalVideoDisc : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered.add(digitalVideoDisc);
                qtyOrdered++;
            } else {
                System.out.println("The cart is full. Cannot add more items.");
            }
        }
    }

    //Overloading by differing the number of parameters
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(dvd1);
            qtyOrdered++;
        } else {
            System.out.println("The cart is full. Cannot add more items.");
        }
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(dvd2);
            qtyOrdered++;
        } else {
            System.out.println("The cart is full. Cannot add more items.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.remove(disc)) {
            qtyOrdered--;
        } else {
            System.out.println("The disc is not in the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public ArrayList<DigitalVideoDisc> getItemsOrdered() {
        return itemsOrdered;
    }

    public String toString(DigitalVideoDisc item){
        return String.format("\t %-10s %-10d %-20s %-20s %-20s %3d: %.2f$", "DVD", item.getId(), item.getTitle(), item.getCategory(), item.getDirector(), item.getLength(), item.getCost());
    }

    public void print(){
        System.out.println("**************************************CART**************************************");
        System.out.println("Ordered Items:");
        for (DigitalVideoDisc item : this.itemsOrdered){
            System.out.println(toString(item));
        }
    }

    public void findByID(int id) {
        for (DigitalVideoDisc item : itemsOrdered) {
            if (item.getId() == id) {
                System.out.println("DVD with ID = " + id + ": " + item.getTitle());
                return;
            }
        }
        System.out.println("No match not found");
    }

    public void searchByTitle(String keywords) {
        boolean isMatch = false;
        ArrayList<DigitalVideoDisc> matches = new ArrayList<>();

        //Convert keywords to lowercase and split into array
        String[] searchWords = keywords.toLowerCase().split("\\s+");

        //Search through the DVD list
        for (DigitalVideoDisc item : itemsOrdered) {
            String itemTitle = item.getTitle().toLowerCase();

            for (String word : searchWords) {
                if (itemTitle.contains(word)) {
                    matches.add(item);
                    isMatch = true;
                    break;  //Move to next
                }
            }
        }

        if (isMatch) {
            System.out.println("Matching DVDs found: ");
            System.out.println("--------------------");
            for (DigitalVideoDisc item : matches) {
                String results = String.format("\t %-10s %-10d %-20s %-20s %-20s %3d: %.2f$", "DVD", item.getId(), item.getTitle(), item.getCategory(), item.getDirector(), item.getLength(), item.getCost());
                System.out.println(results);
            }
        } else {
            System.out.println("No Item found matching your search criteria.");
        }
    }

}
