import java.util.ArrayList;
import java.util.List;

class Member{
    private String name;
    private int age;
    private List<Book> readBooks;


    public Member(String name, int age){
        this.name = name;
        this.age = age;
        this.readBooks = new ArrayList<Book>();
    }

    //getters
    public String getName(){
        return this.name;
    }    
    public int getAge(){
        return this.age;
    }
    public List<Book> getBooks(){
        return readBooks;
    }


    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void addReadBook(Book book){
        readBooks.add(book);
    }


    @Override
    public String toString(){
        return "Member{" + 
                "name = '" + name +'\'' +
                ", age = " + age + 
                ", readBooks = " + readBooks +
                '}';
    }

}


