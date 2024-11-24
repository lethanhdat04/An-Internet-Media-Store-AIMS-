package aims.store;

import aims.disc.DigitalVideoDisc;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore;
    private int numberOfDVDs;
    private static final int MAX_CAPACITY = 100;    //Maximum store capacity

    public Store() {
        itemsInStore = new ArrayList<>();
        numberOfDVDs = 0;
    }

    public boolean addDVD (DigitalVideoDisc dvd) {
        if (dvd == null || numberOfDVDs >= MAX_CAPACITY) {
            return false;
        } else {
            itemsInStore.add(dvd);
            numberOfDVDs++;
            return true;
        }
    }

    public boolean removeDVD (String title) {
        if (title == null || numberOfDVDs == 0) {
            return false;
        }

        for (DigitalVideoDisc item : itemsInStore) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                itemsInStore.remove(item);
                numberOfDVDs--;
                return true;
            }
        }

        System.out.println("Don't find DVD's title in aims.store.Store");
        return false;
    }

    public ArrayList<DigitalVideoDisc> getItemsInStore() {return itemsInStore;}

    public int getNumberOfDVDs() {return numberOfDVDs;}
}
