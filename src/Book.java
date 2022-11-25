public class Book {

    private String name;
    private int releaseYear;
    public Book (String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName(){
        return this.name;
    }

    public int getReleaseYear(){
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }
}
