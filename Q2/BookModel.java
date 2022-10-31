package Q2;

import java.util.*;

public class BookModel {
    private List<Book> books = new ArrayList<>();

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Book inputABook(Scanner sc){
        System.out.println("Input id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Input name: ");
        String name = sc.nextLine();
        System.out.println("Input category: ");
        String category = sc.nextLine();
        System.out.println("Input author: ");
        String author = sc.nextLine();
        System.out.println("Input quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        books.add(new Book(id, name, category, author, quantity));
        return new Book(id, name, category, author, quantity);
    }
    public void removeABook(int id, Scanner sc){
        books.remove(searchBookById(id));
    }
    public int searchBookById(int id){
        int pos = -1;
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getId() == id)
            pos = i;
        }
        return pos;
    }
    
    public void updateQuantity(int id, int amount,Scanner sc){
        int pos = searchBookById(id);
        System.out.println("Do u wanna add or subtract? Type 1 is add or 2 is subtract ");
        if(Integer.parseInt(sc.nextLine())==1)
            books.get(pos).setQuantity(books.get(pos).getQuantity()+amount);
        else if(books.get(pos).getQuantity()>0)
            books.get(pos).setQuantity(books.get(pos).getQuantity()-amount);
        else 
            System.out.println("This book is not available!");
    }

    public void addABook(int id){
        int pos = searchBookById(id);
        books.get(pos).setQuantity(books.get(pos).getQuantity()+1);
    }

    public void subtractABook(int id){
        int pos = searchBookById(id);
        books.get(pos).setQuantity(books.get(pos).getQuantity()-1);
    }
}
