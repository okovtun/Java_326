import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Random rand = new Random(0);
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = kb.nextInt();

        ForwardList list = new ForwardList();
        for(int i = 0; i < n; i++)
        {
            //list.push_back(rand.nextInt(100));
            list.push_front(rand.nextInt(100));
        }
        //list.print();
        try
        {
        System.out.print("Введите значение добавляемого элемента: ");
        int value = kb.nextInt();
        System.out.print("Введите индекс добавляемого элемента: ");
        int index = kb.nextInt();
            list.insert(value, index);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        list.print();
        long start_time = System.nanoTime();
        ForwardList list2 = new ForwardList(list);
        long end_time = System.nanoTime();
        System.out.println("Список скопировался за %f секунд.".formatted((double)(end_time - start_time)*1e-9));
        /*list2.print();
        list.pop_back();
        list.print();
        list2.print();*/
    }
}