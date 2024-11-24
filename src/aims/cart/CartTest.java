package aims.cart;

import aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 90, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 29.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 19.99f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 14.99f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 24.99f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 19.99f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Joker", "Drama", "Todd Phillips", 122, 16.99f);
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Coco", "Animation", 15.49f);
        DigitalVideoDisc dvd11 = new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 162, 25.99f);
        DigitalVideoDisc dvd12 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 21.99f);
        DigitalVideoDisc dvd13 = new DigitalVideoDisc("Inside Out", "Animation", 18.99f);


        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
        cart.addDigitalVideoDisc(dvd4);
        cart.addDigitalVideoDisc(dvd5);
        cart.addDigitalVideoDisc(dvd6);
        cart.addDigitalVideoDisc(dvd7);
        cart.addDigitalVideoDisc(dvd8);
        cart.addDigitalVideoDisc(dvd9);
        cart.addDigitalVideoDisc(dvd10);
        cart.addDigitalVideoDisc(dvd11);
        cart.addDigitalVideoDisc(dvd12);
        cart.addDigitalVideoDisc(dvd13);

        cart.print();
        cart.findByID(1);
        cart.searchByTitle("The");
    }

}
