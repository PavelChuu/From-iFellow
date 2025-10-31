import java.util.HashMap;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String a = scanner.nextLine();

        //Проверка на пустую строку
        while (a.isEmpty()) {
            System.out.println("Строка пустая");
            System.out.println("Введите строку:");
            a = scanner.nextLine();
        }
        findDuplicate(a);
        scanner.close();
    }

    public static void findDuplicate(String str){
        HashMap<Character, Integer> count = new HashMap<>();
        boolean b = true;

        //Конвертируем строку в массив символов и проверяем каждый символ на дубликат
        for (char c : str.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        //Выводим кол-во дубликатов
        System.out.println("Повторяющиеся символы:");
        for (char c : count.keySet()) {
            if (count.get(c) > 1) {
                System.out.println(c + ": встречается " + count.get(c) + " раз(а)");
                b=false;
            }
        }
        if (b==true){System.out.println("Повторяющихся символов нет");}
    }
}