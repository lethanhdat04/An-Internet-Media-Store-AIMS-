import aims.cart.Cart;
import aims.disc.DigitalVideoDisc;

import java.util.ArrayList;

public class Aims {
	    public static void main(String[] args) {
	        // Khởi tạo đối tượng aims.disc.DigitalVideoDisc
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Superman", "Science", "Marvel", 60, 3.14f);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Batman", "Math", 5.67f);

	        // Khởi tạo giỏ hàng và thêm đĩa vào giỏ
	        Cart cart = new Cart();
//	        cart.addDigitalVideoDisc(dvd1);
//	        cart.addDigitalVideoDisc(dvd2);

			DigitalVideoDisc[] dvdList = {dvd1, dvd2};
			cart.addDigitalVideoDisc(dvdList);

			//Show items in aims.cart.Cart
			ArrayList<DigitalVideoDisc> items = cart.getItemsOrdered();
			for (DigitalVideoDisc disc : items) {
				System.out.println(disc.getTitle());
			}

	        // Hiển thị tổng chi phí của các đĩa trong giỏ
	        System.out.println("Total cost is: " + cart.totalCost());

	        // Xóa một đĩa và hiển thị lại tổng chi phí
	        cart.removeDigitalVideoDisc(dvd1);
	        System.out.println("Total cost after removal is: " + cart.totalCost());
	    }
	}

