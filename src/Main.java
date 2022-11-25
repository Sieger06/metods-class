public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Горе от ума", 1824);
        Author book11 = new Author("Александр", "Грибоедов");
        Book book2 = new Book("Обломов", 1847);
        Author book21 = new Author("Иван", "Гончаров");

        book1.setReleaseYear(1825);

        System.out.println(book1.getName() + " - вышла в " + book1.getReleaseYear() + " году - Автор " + book11.getAuthorName() + " " + book11.getAuthorSecondName());
        System.out.println(book1.getReleaseYear());
        System.out.println(book2.getName() + " - вышла в " + book2.getReleaseYear() + " году - Автор " + book21.getAuthorName() + " " + book21.getAuthorSecondName());
    }
}