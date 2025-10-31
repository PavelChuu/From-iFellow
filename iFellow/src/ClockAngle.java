import java.util.Scanner;

public class ClockAngle {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Введите значение для часовой стрелки:");
          int hours = scanner.nextInt();
          System.out.println("Введите значение для минутной стрелки:");
          int minutes = scanner.nextInt();

     //Обработка ошибок
          while ((hours > 23 || hours < 0) || (minutes > 59 || minutes < 0)){
               if (hours > 23 || hours < 0){
                    System.out.println("Введено неверно значение для часовой стрелки");
                    System.out.println("Введите значение для часовой стрелки:");
                    hours = scanner.nextInt();
          }
               if (minutes > 59 || minutes < 0){
                    System.out.println("Введено неверно значение для минутной стрелки");
                    System.out.println("Введите значение для минутной стрелки:");
                    minutes = scanner.nextInt();
          }
               }
               
          scanner.close();
          //Переводим 24-ти часовой на 12-ти часовой формат
          hours = (hours % 12);

          angleHand(hours, minutes);
      }

      public static void angleHand (int hours, int minutes){
          //1 час = 30 градусов. Плюс 0,5 градуса за каждую минуту
          double hourAngle = (hours * 30.0 + minutes * 0.5);
          //1 минута = 6 градусов
          double minutesAngle = (minutes * 6.0);
          //Узнаём модуль разницы углов
          double diff = Math.abs(hourAngle - minutesAngle);
          if (diff > 180.0) {diff = 360.0 - diff;}
          System.out.println("Угол между часовой и минутной стрелкой: " + diff + "°");
      }
 }
