/**
 * Created by Stepan on 10.08.2018.
 * @author Basov Stepan
 */


import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор");
         {//Выводим на экран возможные действия
            System.out.println("Выберете действие: 1 - Сложение(+), 2 - Вычитание(-), 3 - Умножение(*), 4 - Деление(/)");
            //Добавляем новую переменную choose.
            int choose = scanner.nextInt();
            //Делаем выбор, в зависимости от введенных пользователем чисел: 1 - Сумма, 2 - Вычитание, 3 - Умножение, 4 - Деление.
             System.out.println("Введите первое число ");
             // Водим первое число
             double i = scanner.nextDouble();
             // Водим второе число
             System.out.println("Введите второе число");
             double b = scanner.nextDouble();

            switch (choose) {
                case 1:
                    System.out.println("Вы выбрали сложение!");
                     double d = i + b;
                    // Округляем переменную d до 4х знаков после запятой
                    System.out.printf("Сумма = %.4f", d);
                     break;
                case 2:
                    System.out.println("Вы выбрали вычитание!");
                    double d1 = i - b;
                    // Округляем переменную d до 4х знаков после запятой
                    System.out.printf("Разность = %.4f", d1);
                    break;
                case 3:
                    System.out.println("Вы выбрали умножение!");
                   // Задаем еще одну переменную d
                    double d2 = i* b;
                    // Округляем переменную d до 4х знаков после запятой
                    System.out.printf("Произведение = %.4f", d2);
                    break;
                case 4:
                    System.out.println("Вы выбрали деление!");
                   // Задаем еще одну переменную d3
                    double d3 = i / b;
                    // Округляем переменную d до 4х знаков после запятой
                    System.out.printf("Частное = %.4f", d3);
                     break;

                default:
                    System.out.println("Нет такой операции");
            }
        }
       scanner.close();
    }
}