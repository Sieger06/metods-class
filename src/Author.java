import java.util.Objects;

public class Author {

    private String authorName;
    private String authorSecondName;

    public Author (String authorName, String authorSecondName){
        this.authorName = authorName;
        this.authorSecondName = authorSecondName;
    }

    public String getAuthorName(){
        return this.authorName;
    }

    public String getAuthorSecondName() {
        return authorSecondName;
    }


    @Override
    public String toString() {
        return authorName + " " + authorSecondName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSecondName);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author3 = (Author) o;
        return authorName == author3.authorName && Objects.equals(authorName, author3.authorName) && Objects.equals(authorSecondName, author3.authorSecondName);
    }
}

