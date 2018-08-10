/**
 * Created by Stepan on 10.08.2018.
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
            switch (choose) {
                case 1:
                    System.out.println("Вы выбрали сложение!");
                    System.out.println("Введите первое слогаемое ");
                    // Водим первое число
                    double i = scanner.nextDouble();
                    // Водим второе число
                    System.out.println("Введите второе слогаемое");
                    double b = scanner.nextDouble();
                    // Задаем еще одну переменную d - сумма
                    double d = i + b;
                    // Округляем переменную d до 4х знаков после запятой
                    System.out.printf("Сумма = %.4f", d);
                    scanner.close();
                    break;
                case 2:
                    System.out.println("Вы выбрали вычитание!");
                    System.out.println("Введите уменьшаемое ");
                    // Водим первое число
                    double i1 = scanner.nextDouble();
                    // Водим второе число
                    System.out.println("Введите вычитаемое");
                    double b1 = scanner.nextDouble();
                    // Задаем еще одну переменную d
                    double d1 = i1 - b1;
                    // Округляем переменную d до 4х знаков после запятой
                    System.out.printf("Разность = %.4f", d1);
                    scanner.close();
                    break;
                case 3:
                    System.out.println("Вы выбрали умножение!");
                    System.out.println("Введите первый множитель");
                    // Водим первое число
                    double i2 = scanner.nextDouble();
                    // Водим второе число
                    System.out.println("Введите второй множитель");
                    double b2 = scanner.nextDouble();
                    // Задаем еще одну переменную d
                    double d2 = i2 * b2;
                    // Округляем переменную d до 4х знаков после запятой
                    System.out.printf("Произведение = %.4f", d2);
                    scanner.close();
                    break;
                case 4:
                    System.out.println("Вы выбрали деление!");
                    System.out.println("Введите делимое");
                    // Водим первое число
                    double i3 = scanner.nextDouble();
                    // Водим второе число
                    System.out.println("Введите делитель");
                    double b3 = scanner.nextDouble();
                    // Задаем еще одну переменную d
                    double d3 = i3 / b3;
                    // Округляем переменную d до 4х знаков после запятой
                    System.out.printf("Частное = %.4f", d3);
                    scanner.close();
                    break;

                default:
                    System.out.println("Нет такой операции");
            }
        }

    }
}