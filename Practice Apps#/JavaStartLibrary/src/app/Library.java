package app;

import data.Book;
public class Library {

	public static void main(String[] args) {
		final String appName = "Biblioteka v0.4";
		 
        Book book1 = new Book("Exodus", "Wolter White", 2012, 344, "Greg",
                "343455677");
        Book book2 = new Book("How to be effective", " Jax Hamilton", 2018,
                254, "NYC", "17854256321");
        Book book3 = new Book("The path of the programmer",
                "Kathrene Sun", 2003, 657, "Macromedia Bolt Book",
                "987254785632");
 
        System.out.print(appName);
        System.out.println("Books avaible in Library:");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
	}

}
