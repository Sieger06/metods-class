public class Main {

    public static void main(String[] args) {
        Author testAuthor = new Author("Александр", "Грибоедов");
        Book book1 = new Book("Горе от ума", testAuthor, 1824);
        Author testAuthor2 = new Author("Иван", "Гончаров");
        Book book2 = new Book("Обломов", testAuthor2, 1846);

        book1.setReleaseYear(1825);

        System.out.println(book1);
        System.out.println(book2);

       // System.out.println(book1.getName() + " - вышла в " + book1.getReleaseYear() + " году - Автор " + testAuthor.getAuthorName() + " " + testAuthor.getAuthorSecondName());
       // System.out.println(book1.getReleaseYear());
       // System.out.println(book2.getName() + " - вышла в " + book2.getReleaseYear() + " году - Автор " + testAuthor2.getAuthorName() + " " + testAuthor2.getAuthorSecondName());

    }
}