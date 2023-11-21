import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter integer [" + (i + 1) + "] : ");
            array[i] = scanner.nextInt();
        }
        sortArray(array);
        System.out.print("Sorted Order : ");
        for (int num : array)
        {
            System.out.print(num + " ");
        }
    }
    private static void sortArray(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++)
            {
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
