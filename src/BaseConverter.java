import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double cel;

        //Узнаём начальное значение в Цельсиях
        System.out.println("Введите температуру в градусах Цельсия:");
        cel = scanner.nextDouble();
        convert(cel);
        scanner.close();
    }

    public static void convert(double cel) {
        Scanner scanner = new Scanner(System.in);
        byte b;

        //Узнаём желаему шкалу для конвертации
        System.out.println("Введите желаемую шкалу:");
        System.out.println("1 - Кельвин");
        System.out.println("2 - Фаренгейт");
        b = scanner.nextByte();

        //Обработка ошибок
        while (b != 1 && b != 2){
            System.out.println("Ошибка: неверный вариант");
            System.out.println("Введите желаемую шкалу:");
            System.out.println("1 - Кельвин");
            System.out.println("2 - Фаренгейт");
            b = scanner.nextByte();
        }
        scanner.close();
        //Конвертация
        switch (b) {
            case 1:
            System.out.printf("Результат: " + (cel + 273.15) + "° K");
                break;
            case 2:
            System.out.printf("Результат: " + (cel * 9 / 5 + 32) + "° F");
                break;
        }
    }
}