import java.util.Objects;

public class Book {

    private final String name;
    private int releaseYear;
    private final Author authorName;

    public Book (String name, Author authorName, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.authorName = authorName;
    }

    public String getName(){
        return name;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public String toString (){
        return String.format("%s, %s, %d", name, authorName, releaseYear);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book3 = (Book) o;
        return releaseYear == book3.releaseYear && Objects.equals(name, book3.name) && Objects.equals(authorName, book3.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, releaseYear);
    }

}
