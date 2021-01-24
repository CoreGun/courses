package eu.senla.task2;

public class Rainbow {

    private int colorNumber;
    private String colorNameFirstPart;

    public int getColorNumber() {
        return colorNumber;
    }

    public void setColorNumber(int colorNumber) {
        this.colorNumber = colorNumber;

    }
    private void PrintColor(int a){ //выводим цвет
        final String colorNameSecondPart = "ый"+ "\n";
        final String colorNameSecondPartForBlue = "ий" + "\n";
        final String colorNameSecondPartForIndigo = "ой" + "\n";
        if (a != 5 && a != 6) {
            System.out.println(colorNameFirstPart + colorNameSecondPart);
        } else if (a == 5){
            System.out.println(colorNameFirstPart + colorNameSecondPartForIndigo);
        } else {
            System.out.println(colorNameFirstPart + colorNameSecondPartForBlue);
        }
    }

    private void SetColor(int a) {   //задаем значение переменной с цветом в зависимости от номера
        switch (a) {
            case 1:
                colorNameFirstPart = "Красн";
                break;
            case 2:
                colorNameFirstPart = "Оранжев";
                break;
            case 3:
                colorNameFirstPart = "Желт";
                break;
            case 4:
                colorNameFirstPart = "Зелен";
                break;
            case 5:
                colorNameFirstPart = "Голуб";
                break;
            case 6:
                colorNameFirstPart = "Син";
                break;
            case 7:
                colorNameFirstPart = "Фиолетов";
                break;
        }
    }
    public void colorSelection() { //проверка номера и вывод цвета

        final char o = 'о';
        final char e = 'е';

        if (colorNumber >= 1 && colorNumber <= 7) {
            SetColor(colorNumber);
            PrintColor(colorNumber);
        }else if (colorNumber <= 77 && colorNumber >= 11 && colorNumber/10 <=7) {
            int firstNumber = colorNumber / 10;
            int secondNumber = colorNumber % 10;
            int firstEquallySecond;
            if (firstNumber == secondNumber) {
                firstEquallySecond = 1;
            } else {
                firstEquallySecond = 2;
            }

            SetColor(firstNumber);
            switch (firstEquallySecond) {
                case 1:
                    System.out.print("Если смешать одинаковые цвета получим такой же: ");
                    PrintColor(firstNumber);
                    break;
                case 2:
                    if (firstNumber != 6) {
                        System.out.print(colorNameFirstPart + o + " - ");
                    } else {
                        System.out.print(colorNameFirstPart + e + " - ");
                    }
                    SetColor(secondNumber);
                    PrintColor(secondNumber);
                    break;
            }
        }else{
            System.out.println("Неправильный номер" + "\n");
        }
    }
}
