import java.util.Scanner;

public class Rectangle {
    //Класс с вычислениями и инкапсуляцией
    //Создайте класс Rectangle, который инкапсулирует:
    //
    //длину (double length)
    //ширину (double width)
    //Реализуйте:
    //геттеры и сеттеры для обеих сторон
    //(должны быть проверены на положительность значений).
    //метод calculateArea(), который вычисляет площадь прямоугольника.
    //метод calculatePerimeter(), который вычисляет периметр прямоугольника.
    //Добавьте в класс проверки на правильность значений: например, длина и ширина не могут быть отрицательными.

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0){
            System.out.println("Не может быть меньше 0");
        } else {
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0){
            System.out.println("Не может быть меньше 0");
        } else {
            this.length = length;
        }
    }

    public double calculateArea(){
        return width * length;
    }

    public double calculatePerimeter(){
        return 2*(width+length);
    }

    private void valueCheck(){
        if (length < 0 || width < 0){
            System.out.println("Невозможные значения");
        }
    }
}
