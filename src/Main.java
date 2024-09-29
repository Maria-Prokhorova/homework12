public class Main {
    public static void main(String[] args) {

        /*
        Создайте класс Book, который будет содержать в себе данные о названии, авторе и годе публикации книги.
        Убедитесь, что типы полей класса Book выбраны правильно: это String, Author и int.
        Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
        Напишите конструкторы для обоих классов, заполняющие все поля.
        Создайте геттеры для всех полей автора и всех полей книги.
        Создайте сеттер для поля «Год публикации» у книги.
        В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно
        тоже двух) и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут создаваться без
        авторов.
        Метод main не должен находиться в классах Book и Author.
        Создайте отдельный класс для запуска приложения и объявите метод main в нем.
        В том же методе main измените год публикации одной из книг с помощью сеттера.
         */

        Author author1 = new Author("Дмитрий", "Глуховский");
        Author author2 = new Author("Айн", "Рэнд");
        Book book1 = new Book("Метро 2033", author1, 2007);
        Book book2 = new Book("Атлант расправил плечи", author2, 1957);

        System.out.println("Название первой книги - " + book1.getTitleBook());
        System.out.println("Автор первой книги - " + book1.getAuthorBook().getNameAuthor() + " " + book1.getAuthorBook().getSurnameAuthor());
        System.out.println("Год публикации первой книги - " + book1.getYearPublicationBook());
        System.out.println("Название второй книги - " + book2.getTitleBook());
        System.out.println("Автор второй книги - " + book2.getAuthorBook().getNameAuthor() + " " + book2.getAuthorBook().getSurnameAuthor());
        System.out.println("Год публикации второй книги - " + book2.getYearPublicationBook());

        book2.setYearPublication(2004);
        System.out.println("Год публикации второй книги после изменений - " + book2.getYearPublicationBook());

    }
}