import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10; // int - тип данных целое число, a - имя переменной, = - присвоить, 10 значение
        int c = 25;
        int d = 45;

        System.out.println(a);
        System.out.println(c);
        System.out.println(d);

        int sum = a + c;
        int sub = a - c;
        int mul = a * c;
        int div = a / c;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        double a1 = 10.2;
        double a2 = 15.3;

        double sum1 = a1 + a2;
        System.out.println(sum1);

        float a3 = 10.2f;
        float a4 = 15.3f;
        float sum2 = a3 + a4;
        System.out.println(sum2);

        double test = a2 + a3;

        boolean trueVar = true;
        boolean falseVar = false;
        boolean antiTrueVar = !trueVar;

        char digit = '1';
        String digits = "123456";
        int calculation = (1 + 2) * 3 * (4 + 8);
        System.out.println(calculation);


        System.out.print("введите возраст:");
        Scanner sc = new Scanner((System.in));
        int age = sc.nextInt();



        if (age >= 18 && age <=25) {
            System.out.println("ПАСПОРТ");
        } else if (age >= 25 && age < 65) {
            System.out.println("ПРОДАЮ");
        }else if (age >= 65 && age < 100) {
            System.out.println("ПРОДАЮ С ЛЕКАРСТВАМИ");
        }else {
            System.out.println("ТЫ И ТАК МЁРТВ");
        }
    }
}
