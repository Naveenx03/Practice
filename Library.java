abstract class Item{
    private String title;
    private String author;
    Item(String title, String author){
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    
    abstract void display();
}

class Book extends Item{
    private String genre;
    Book(String genre, String title, String author){
        super(title, author);
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    void display(){
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Genre: "+getGenre());
    }
}
class Borrower extends Book{
    private String name;
    private String dueDare;
    Borrower(String name, String dueDare, String genre, String title, String author){
        super(genre, title, author);
        this.name = name;
        this.dueDare = dueDare;
    }
    
    public String getName() {
        return name;
    }
    public String getDueDare() {
        return dueDare;
    }
    void display(){
        super.display();
        System.out.println("Name: "+getName());
        System.out.println("DueDare: "+getDueDare());
    }
}

public class Library {
    public static void main(String[] args){
        Item[] arr = new Item[2];
        arr[0] = new Book("self-development", "Atomic habit", "James Clear");
        arr[1] = new Borrower("Naveen","15/08/25","self-development", "Psychology of money", "Morgan housel");
        for(Item user: arr){
            user.display();
            System.out.println();
        }
    }
}
