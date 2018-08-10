/**
 * Created by Stepan on 10.08.2018.
 */


import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator");
         {//Выводим на экран возможные действия
            System.out.println("Select action: 1 - Sum(+), 2 - Difference(-), 3 - Multiply(*), 4 - Division(/)");
            //Добавляем новую переменную choose.
            int choose = scanner.nextInt();
            //Делаем выбор, в зависимости от введенных пользователем чисел: 1 - Сумма, 2 - Вычитание, 3 - Умножение, 4 - Деление.
            switch (choose) {
                case 1:
                    System.out.println("You choose the Amount!");
                    System.out.println("Enter the number #1");
                    // Водим первое число
                    double i = scanner.nextDouble();
                    // Водим второе число
                    System.out.println("Enter the number #2");
                    double b = scanner.nextDouble();
                    // Задаем еще одну переменную d
                    double d = i + b;
                    // Округляем переменную d до 4х знаков после запятой
                    System.out.printf("Result = %.4f", d);
                    scanner.close();
                    break;
                case 2:
                    System.out.println("You chose the Difference!");
                    System.out.println("Enter the number #1");
                    // Водим первое число
                    double i1 = scanner.nextDouble();
                    // Водим второе число
                    System.out.println("Enter the number #2");
                    double b1 = scanner.nextDouble();
                    // Задаем еще одну переменную d
                    double d1 = i1 - b1;
                    // Округляем переменную d до 4х знаков после запятой
                    System.out.printf("Result = %.4f", d1);
                    scanner.close();
                    break;
                case 3:
                    System.out.println("You have chosen Multiplication!");
                    System.out.println("Enter the number #1");
                    // Водим первое число
                    double i2 = scanner.nextDouble();
                    // Водим второе число
                    System.out.println("Enter the number #2");
                    double b2 = scanner.nextDouble();
                    // Задаем еще одну переменную d
                    double d2 = i2 * b2;
                    // Округляем переменную d до 4х знаков после запятой
                    System.out.printf("Result = %.4f", d2);
                    scanner.close();
                    break;
                case 4:
                    System.out.println("You chose Division!");
                    System.out.println("Enter the number #1");
                    // Водим первое число
                    double i3 = scanner.nextDouble();
                    // Водим второе число
                    System.out.println("Enter the number #2");
                    double b3 = scanner.nextDouble();
                    // Задаем еще одну переменную d
                    double d3 = i3 / b3;
                    // Округляем переменную d до 4х знаков после запятой
                    System.out.printf("Result = %.4f", d3);
                    scanner.close();
                    break;

                default:
                    System.out.println("Out of range");
            }
        }

    }
}