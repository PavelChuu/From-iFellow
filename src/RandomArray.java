import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float min = 1, max = 0, sum = 0;

        //Узнаём длинну массива
        System.out.println("Введите длинну массива:");
        int a = scanner.nextInt();
        scanner.close();

        float [] array = new float[a];

        //Заполняем массив и находим min, max и sum
        for (int n=0; n<a; n++) {
            array[n] = (float) (Math.random());
            System.out.println(array[n]);
            if (min > array[n]) { min = array[n];}
            if (max < array[n]) { max = array[n];}
            sum += array[n];
        }
        
        System.out.println("Максимальное значение:" + max);
        System.out.println("Минимальное значение:" + min);
        System.out.println("Среднее значение:" + (sum / a));
    }
}
