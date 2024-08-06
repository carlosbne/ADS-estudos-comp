/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Hobbit", "J.J.R. Tolkien", "High-Fantasy");
        Book b2 = new Book("Neuromancer", "William Gibson", "Sci-fi-Cyberpunk");
        
        Member a1 = new Member("Carlos", 20);

        a1.addReadBook(b1);
        a1.addReadBook(b2);

        List<Book> readBooks = a1.getBooks();
        
        for(Book book : readBooks){
            System.out.println(book.getTitle());
        }
    }
}