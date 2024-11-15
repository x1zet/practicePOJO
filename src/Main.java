import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book();
        System.out.println("Введите название: ");
        String title = scanner.next();
        book1.setTitle(title);

        System.out.println(book1.getTitle());

        scanner.close();
    }
}