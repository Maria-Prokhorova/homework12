public class Main {
    public static void main(String[] args) {

        /*
        Задание
        Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
        Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать
        (вызывать) его версию метода.
         */

        Author author1 = new Author("Дмитрий", "Глуховский");
        Author author2 = new Author("Айн", "Рэнд");
        Book book1 = new Book("Метро 2033", author1, 2007);
        Book book2 = new Book("Атлант расправил плечи", author2, 1957);
        Book book3 = new Book("Метро 2033", author1, 2015);


        System.out.println("Название первой книги - " + book1.getTitleBook());
        System.out.println("Автор первой книги - " + book1.getAuthorBook().getNameAuthor() + " " + book1.getAuthorBook().getSurnameAuthor());
        System.out.println("Год публикации первой книги - " + book1.getYearPublicationBook());
        System.out.println("Название второй книги - " + book2.getTitleBook());
        System.out.println("Автор второй книги - " + book2.getAuthorBook().getNameAuthor() + " " + book2.getAuthorBook().getSurnameAuthor());
        System.out.println("Год публикации второй книги - " + book2.getYearPublicationBook());

        book2.setYearPublication(2004);
        System.out.println("Год публикации второй книги после изменений - " + book2.getYearPublicationBook());

        System.out.println();
        System.out.println(book1);
        System.out.println(book2);

        System.out.println();
        if (book1.equals(book3)) {
            System.out.println("Это одна и та же книга, только имеет разный год публикации");
        } else System.out.println("Это разные книги");
    }
}