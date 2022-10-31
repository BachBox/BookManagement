package Q2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BookModel bookModel = new BookModel();
    TicketModel ticketModel = new TicketModel(bookModel);

    
    Book b1 = new Book(1, "Harry Potter", "Magic", "Unknown", 3);
    Book b2 = new Book(2, "Mad Max", "Action", "Unknown", 2);
    Book b3 = new Book(3, "Peaky Blinders", "Gangstar", "Nolan", 4);
    
    List<Book> books = new ArrayList<>(Arrays.asList(b1, b2, b3));
    bookModel.setBooks(books);

    System.out.println(b1);
    ticketModel.borrowBook(sc);
    System.out.println(b1);
    System.out.println("============");
    ticketModel.printTicketList();
    System.out.println("============");
    ticketModel.returnABook(sc);
    System.out.println("============");
    ticketModel.printTicketList();
    

    }
    
}
