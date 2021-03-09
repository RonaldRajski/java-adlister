package models;

public class Album {

    private int id;
    private String artist;
    private String name;
    private int releaseYear;
    private Float sales;
    private String genre;

    public Album(String billy_idol, String white_wedding, int i, int i1, String rock){}

    public Album(int id, String artist, String name, int releaseYear, Float sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.releaseYear = releaseYear;
        this.sales = sales;
        this.genre = genre;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Float getSales() {
        return this.sales;
    }

    public void setSales(Float sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
