package models;

public class Book {

    private int id;

    private String title;

    private String authorsName;

    private Float price;

    private int booksSold;

    public Book(){}

    public Book(int id, String title, String authorsName, Float price, int booksSold) {
        this.id = id;
        this.title = title;
        this.authorsName = authorsName;
        this.price = price;
        this.booksSold = booksSold;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

   public String getTitle(String title){
        return this.title;
   }

   public Float getPrice(){
        return this.price;
    }

    public void setPrice(Float price){
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public int getBooksSold() {
        return booksSold;
    }

    public void setBooksSold(int booksSold) {
        this.booksSold = booksSold;
    }
}
