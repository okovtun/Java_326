import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = kb.nextInt();
        int[] mass = new int[n];
        double[] massDouble = new double[n];
        char[] massChar = new char[n];
        Random rand = new Random(0);
        for (int i = 0; i < n; i++) {
            mass[i] = rand.nextInt(10,777);
            massDouble[i] = rand.nextDouble();
            massChar[i] = (char)(rand.nextInt());
        }
        System.out.println(Arrays.toString(mass));
        System.out.println(Arrays.toString(massDouble));
        System.out.println(Arrays.toString(massChar));
        System.out.print("Сумма всех элементов массива: " + Sum(mass) + "\n");
        System.out.print("Сумма всех элементов массива (double): " + Sum(massDouble) + "\n");
        System.out.print("Сумма всех элементов массива (char): " + Sum(massChar) + "\n");
        System.out.print("Среднее-арифметическое элементов массива: " + Avg(mass) + "\n");
        System.out.print("Среднее-арифметическое элементов массива (double): " + Avg(massDouble) + "\n");
        System.out.print("Среднее-арифметическое элементов массива (char): " + Avg(massChar) + "\n");
        System.out.print("Минимальное значение из массива: " + MinValueIn(mass) + "\n");
        System.out.print("Минимальное значение из массива (double) : " + MinValueIn(massDouble) + "\n");
        System.out.print("Максимальное значение из массива: " + MaxValueIn(mass) + "\n");
        System.out.print("Максимальное значение из массива (double): " + MaxValueIn(massDouble) + "\n");
        System.out.print("Введите сдвиг: ");
        int num = kb.nextInt();
        int[] arrLeft = ShiftLeft(mass, num);
        System.out.print("Смещаем влево: " + Arrays.toString(arrLeft) + " " + "\n");
        double[] arrLeftDouble = ShiftLeft(massDouble, num);
        System.out.print("Смещаем влево (double): " + Arrays.toString(arrLeftDouble) + " " + "\n");
        int[] arrRight = ShiftRight(mass, num);
        System.out.print("Смещаем вправо: " + Arrays.toString(arrRight) + " " + "\n");
        double[] arrRightDouble = ShiftRight(massDouble, num);
        System.out.print("Смещаем вправо (double): " + Arrays.toString(arrRightDouble) + " ");
    }

    static int Sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }

    static double Sum(double[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }

    /*static int Sum(char[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }*/
    static String Sum(char[] arr)
    {
        return "Для типа данных 'char' невозможно вычислить сумму";
    }

    static double Avg(int[] arr) {
        return (double)Sum(arr) / arr.length;
    }

    static double Avg(double[] arr) {
        double avg = Sum(arr) / arr.length;
        return avg;
    }
    /*static double Avg(char arr[])
    {
        return (double)Sum(arr)/arr.length;
    }*/
    static String Avg(char arr[])
    {
        return "Для типа данных 'char' невозможно вычислить среднее-арифметическое";
    }

    static int MinValueIn(int[] arr) {
        int min;
        min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    static double MinValueIn(double[] arr) {
        double min;
        min = Double.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    static int MaxValueIn(int[] arr) {
        int max;
        max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    static double MaxValueIn(double[] arr) {
        double max;
        max = Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    static int[] ShiftLeft(int[] arr, int num) {
        for (int i = 0; i < num; i++) {
            int first = arr[0];
            for (int j = 1; j < arr.length - 1; j++) {
                int temp = arr[j];
                arr[j - 1] = temp;
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }
        return arr;
    }

    static double[] ShiftLeft(double[] arr, int num) {
        for (int i = 0; i < num; i++) {
            double first = arr[0];
            for (int j = 1; j < arr.length - 1; j++) {
                double temp = arr[j];
                arr[j - 1] = temp;
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }
        return arr;
    }

    static int[] ShiftRight(int[] arr, int num) {
        for (int i = 0; i < num; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j >= 1; j--) {
                int temp = arr[j];
                arr[j] = temp;
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        return arr;
    }

    static double[] ShiftRight(double[] arr, int num) {
        for (int i = 0; i < num; i++) {
            double last = arr[arr.length - 1];
            for (int j = arr.length - 1; j >= 1; j--) {
                double temp = arr[j];
                arr[j] = temp;
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        return arr;
    }
}