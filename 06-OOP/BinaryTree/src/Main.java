import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random(0);
        System.out.print("Введите размер дерева: ");
        int n = kb.nextInt();
        Tree tree = new Tree();
        for(int i = 0; i < n; i++)
        {
            tree.insert(rand.nextInt(100));
        }
        tree.print();
        System.out.println();
        System.out.println("Минимальное значение в дереве: " + tree.minValue());
        System.out.println("Максимальное значение в дереве: " + tree.maxValue());
        System.out.println("Сумма элементов дерева: " + tree.sum());
        System.out.println("Количество элементов дерева: " + tree.count());
        System.out.println("Среднее-арифметическое элементов дерева: " + tree.avg());

        UniqueTree u_tree = new UniqueTree();
        for(int i = 0; i < n; i++)
        {
            u_tree.insert(rand.nextInt(100));
        }
        u_tree.clear();

        u_tree.print();
        System.out.println();
        System.out.println("Минимальное значение в дереве: " + u_tree.minValue());
        System.out.println("Максимальное значение в дереве: " + u_tree.maxValue());
        System.out.println("Сумма элементов дерева: " + u_tree.sum());
        System.out.println("Количество элементов дерева: " + u_tree.count());
        System.out.println("Среднее-арифметическое элементов дерева: " + u_tree.avg());
    }
}