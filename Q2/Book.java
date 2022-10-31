package Q2;

public class Book {
    private int id;
    private String name;
    private String category;
    private String author;
    private int quantity;
    
    public Book(int id, String name, String category, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.author = author;
        this.quantity = quantity;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", Category=" + category + ", author=" + author + ", quantity="
                + quantity + "]";
    }
  
    
}
