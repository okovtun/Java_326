import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);  //KeyBoard - Клавиатуры
        //System.out.print("Введите температуру воздуха: ");
       /* int t = kb.nextInt();

        if(t>70){
            System.out.println("Вы на другой планете");
        }
        else if(t>50){
            System.out.println("Вы на экваторе");
        }
        else if(t>35){
            System.out.println("Очень жарко");
        }
        else if(t>25){
            System.out.println("Жарко");
        }
        else if(t>15){
            System.out.println("Тепло");
        }
        else if(t > 0){
            System.out.println("Холодно");
        }
        else{
            System.out.println("Мороз");
        }*/

        System.out.print("Введите число: ");
        int n = kb.nextInt();
        if(n>0 && n<10)
        {
            System.out.println("Вы попали");
        }
        else
        {
            System.out.println("Вы промахнулись");
        }
    }
}