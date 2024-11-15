public class Book {
    //оздайте класс Book,
    //который будет представлять книгу с полями:
    //
    //title (название книги)
    //author (автор книги)
    //yearPublished (год публикации)
    //price (цена книги)
    //Класс должен быть POJO (Plain Old Java Object), т.е. должен включать:
    //конструктор по умолчанию.
    //геттеры и сеттеры для каждого поля.
    //Напишите программу,
    //которая создаёт несколько экземпляров класса Book,
    //заполняет их данными и выводит информацию о книгах на экран.

    private String title;
    private String author;
    private int yearPublished;
    private int price;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void getInfo(){
        System.out.println("Название: " + title +
                "\nАвтор: " + author +
                "\nДата публикации: " + yearPublished +
                "\nЦена: " + price);
    }
}
