import java.util.Random;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("#1");
        Random rand = new Random();
        //int rand_int1 = rand.nextInt(1000);
        //System.out.println(rand_int1);
        int arr[] = new int [10];
        for(int i = 0; i < arr.length;i ++)
        {
            arr[i] = rand.nextInt(100);
            System.out.println(arr[i]);
        }
        for(int i = 0; i < arr.length;i ++)
        {
            for(int j = 1; j < arr.length;j ++)
            {
                if (arr[j] > arr[j-1])
                {
                    int tem = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tem;
                }
            }
        }
        System.out.println("=========");
        for(int i = 0;i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("=========");
        for(int i = 0; i < arr.length;i ++)
        {
            double a = Math.random()*100;
            arr[i] = (int) a;
            System.out.println(arr[i]);
        }
        for(int i = 0; i < arr.length;i ++)
        {
            for(int j = 1; j < arr.length;j ++)
            {
                if (arr[j] > arr[j-1])
                {
                    int tem = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tem;
                }
            }
        }
        System.out.println("=========");
        for(int i = 0;i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("#3");
        int B[] = new int[4];
        for(int i = 0 ; i < B.length; i ++)
        {
            B[i] =rand.nextInt(90) + 10;
            System.out.print(B[i]+" ");
        }
        boolean s = true;
        for(int i = 0 ; i < B.length - 1; i ++)
        {
            if(!(B[i + 1] > B[i]))
            {
                s = false;
            }
        }
        if(s)
        {
            System.out.println("последовательность строго возростающая");
        }
        else
        {
            System.out.println("последовательность строго не возростающая");
        }
    }
}