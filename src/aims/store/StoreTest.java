package aims.store;

import aims.disc.DigitalVideoDisc;

import java.util.ArrayList;

public class StoreTest {
    public static void main(String[] args) {
        // Create a new store
        Store store = new Store();

        // Test adding DVDs using different constructors
        System.out.println("Testing addDVD method:");

        // Using constructor with all parameters
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);

        // Using constructor with title, category, and cost
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);

        // Test adding DVDs
        System.out.println("\nAdding DVDs to store:");
        System.out.println("Adding '" + dvd1.getTitle() + "': " + store.addDVD(dvd1));
        System.out.println("Adding '" + dvd2.getTitle() + "': " + store.addDVD(dvd2));
        System.out.println("Adding '" + dvd3.getTitle() + "': " + store.addDVD(dvd3));

        // Display current store state
        System.out.println("\nCurrent number of DVDs in store: " + store.getNumberOfDVDs());

        // Test removing DVDs
        System.out.println("\nTesting removeDVD method:");
        System.out.println("Removing 'Star Wars': " + store.removeDVD("Star Wars"));
        System.out.println("Number of DVDs after removal: " + store.getNumberOfDVDs());

        // Try to remove a DVD that doesn't exist
        System.out.println("\nTrying to remove non-existent DVD:");
        System.out.println("Removing 'Matrix': " + store.removeDVD("Matrix"));

        // Display remaining DVDs
        System.out.println("\nRemaining DVDs in store:");
        ArrayList<DigitalVideoDisc> itemsInStore = store.getItemsInStore();

        int i = 0;
        for (DigitalVideoDisc item : itemsInStore) {
            i++;
            System.out.println((i) + ". " + item.getTitle() +
                    " (ID: " + item.getId() + ")" +
                    " - Category: " + item.getCategory() +
                    " - Cost: $" + item.getCost());
        }
    }
}