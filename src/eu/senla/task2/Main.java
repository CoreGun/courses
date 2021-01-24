package eu.senla.task2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Цвета радуги: 1 - Красный, 2 - Оранжевый, 3 - Желтый, 4 -Зеленый, 5 - Голубой, 6 - Синий, 7 - Фиолетовый");
        System.out.println("Парные цвета нужно вводить как двухзначное число!"+"\n");

        Rainbow rainbow = new Rainbow();
        rainbow.setColorNumber(66); //задаем номер цвета
        rainbow.colorSelection(); //вызываем метод для вывода

        rainbow.setColorNumber(12);
        rainbow.colorSelection();
        rainbow.setColorNumber(56);
        rainbow.colorSelection();
        rainbow.setColorNumber(3);
        rainbow.colorSelection();
        rainbow.setColorNumber(33);
        rainbow.colorSelection();
        rainbow.setColorNumber(65);
        rainbow.colorSelection();
        rainbow.setColorNumber(34);
        rainbow.colorSelection();
        rainbow.setColorNumber(8);
        rainbow.colorSelection();
        rainbow.setColorNumber(78);
        rainbow.colorSelection();

    }
}
