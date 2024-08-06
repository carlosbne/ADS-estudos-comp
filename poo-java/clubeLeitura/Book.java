// classe book
public class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    //getters
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getGenre(){
        return this.genre;
    }

    //setter
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

    @Override
    public String toString(){
        return "Book{" + 
                "title = '" + title + '\'' +
                ", author = '"+ author + '\'' +
                ", genre = '" + genre + '\'' +
                '}';
    }

}

