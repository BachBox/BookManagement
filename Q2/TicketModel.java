package Q2;

import java.util.*;

public class TicketModel {
    private List<TicketBook> tickets = new ArrayList<>();
    private BookModel bookModel = new BookModel();

    public TicketModel(BookModel bookModel) {
        this.bookModel = bookModel;
    }

    public void borrowBook(Scanner sc){
        System.out.println("Input reader name: ");
        String readerName = sc.nextLine();
        System.out.println("Input bookId: ");
        int bookId = Integer.parseInt(sc.nextLine());
        System.out.println("Input borrowing date: ");
        String borrowingDate = sc.nextLine();
        System.out.println("Input expiration date: ");
        String expirationDate = sc.nextLine();


        TicketBook t = new TicketBook(readerName, bookId, borrowingDate, expirationDate);
        //Create a ticket then subtract a Book from booklist, add ticket to the ticketlist simultaneously,
        bookModel.subtractABook(bookId);
        tickets.add(t);
        System.out.println("Borrow successfully. Here is ur borrow ticket: ");
        System.out.println(t);
    }

    public void returnABook(Scanner sc){
        String readerName = sc.nextLine();
        for (int i = 0; i < tickets.size(); i++) {
            if(tickets.get(i).getReaderName().equalsIgnoreCase(readerName)){
            bookModel.addABook(1);
            tickets.remove(i);
            //Create a ticket then add that Book from booklist, remove ticket to the ticketlist simultaneously
            }
        }
    }

    public void printTicketList(){
        for (int i = 0; i < tickets.size(); i++) {
            System.out.println(tickets.get(i));
        }
    }
  
}
