import java.util.Scanner;
public class Main {
    public static void factorial(int a) {
        long factorial = 1;
        for (int i = 2; i <= a; i++)
            factorial *= i;
        System.out.println("Факториал=" + factorial);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер масива");
        int size = 0;
        if (input.hasNextInt())
        {
            size = input.nextInt();
            float sred = 0, sum = 0;
            int b[] = new int[size];
            for (int i = 0; i < b.length; i++)
            {
                System.out.println("Введите элемент масива");
                b[i] = input.nextInt();
                sum += b[i];
            }
            int min = b[0],max = b[0];
            for (int i = 0; i < b.length; i++)
            {
                if(b[i] >= max)
                {
                    max = b[i];
                }
                if(b[i] <= min)
                {
                    min = b[i];
                }
            }
            sred = sum/size;
            System.out.println("Сумма элементов массива = " + sum);
            System.out.println("Среднее арифметическое массива = " + sred);
            System.out.println("Максимальный элемент массива " + max);
            System.out.println("Минимальный элемент массива " + min);
        }
        else
        {
            System.out.println("Вы ввели не целое число");
        }
        System.out.println("Введите факториал");
        int fac = input.nextInt();
        factorial(fac);

    }
}