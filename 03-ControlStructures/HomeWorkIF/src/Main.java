import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
//        int score=5;    //Количество правильнъ ответов
//        int answer=4;    //Ответ пользователя
        /*System.out.println("Столица Испании:");
        System.out.println("1. Стамбул;");
        System.out.println("2. Мадрид;");
        System.out.println("3. Токио;");
        System.out.println("4. Нью-Йорк;");
        System.out.print("Ваш ответ:");
        answer = kb.nextInt();
        if(answer == 2)
        {
            System.out.println("Правильно");
            score++;
        }
        else
        {
            System.out.println("Ответ неверный");
        }

        System.out.println("Самая близкая планета к Солнцу:");
        System.out.println("1. Меркурий");
        System.out.println("2. Венера");
        System.out.println("3. Земля");
        System.out.println("4. Марс");
        System.out.print("Ваш ответ:");
        answer = kb.nextInt();
        if(answer == 1)
        {
            System.out.println("Правильно");
            score++;
        }
        else
        {
            System.out.println("Ответ неверный");
        }

        System.out.println("Какая группа крови самая редкая:");
        System.out.println("1. I");
        System.out.println("2. II");
        System.out.println("3. III");
        System.out.println("4. IV");
        System.out.print("Ваш ответ:");
        answer = kb.nextInt();
        if(answer == 4)
        {
            System.out.println("Правильно");
            score++;
        }
        else
        {
            System.out.println("Ответ неверный");
        }*/

        //System.out.print("Вы набрали %d ".formatted(score));
       /* if(score>=10 && score <=20)
        {
            System.out.println(" очков");
        }
        else if(score % 10 == 1)
        {
            System.out.println(" очко");
        }
        else if(score%10 >1 && score%10<5)
        {
            System.out.println(" очка");
        }
        else
        {
            System.out.println(" очков");
        }*/

        /*for(int i=0; i<1000;i++)
        {
            System.out.println("Вы набрали %d %s".formatted(i, suffix(i)));
        }*/

        int a;
        int b;
        int c;
        char s; //Sign - знак операции
        System.out.print("Введите первое число: ");
        a = kb.nextInt();

        System.out.print("Введите операцию: ");
        s = kb.next().charAt(0);

        System.out.print("Введите второе число: ");
        b = kb.nextInt();

       /*if(s == '+')
        {
            c=a+b;
        }
        else if(s == '-')
        {
            c = a-b;
        }
        else if(s == '*')
        {
            c = a*b;
        }
        else if(s == '/')
        {
            c=a/b;
        }
        else
        {
            c = Integer.MIN_VALUE;
            System.out.println("Error: No operation");
        }*/

       /* switch(s)
        {
            case '+': c = a + b; break;
            case '-': c = a - b; break;
            case '*': c = a * b; break;
            case '/': c = a / b; break;
            default: c = Integer.MIN_VALUE;
                System.out.println("Error: No operation");
        }

        if(c != Integer.MIN_VALUE)          System.out.printf("%d %c %d = %d", a, s, b, c);*/

        /*switch(s)
        {
            case '+': System.out.printf("%d + %d = %d\n", a, b, a + b); break;
            case '-': System.out.printf("%d - %d = %d\n", a, b, a - b); break;
            case '*': System.out.printf("%d * %d = %d\n", a, b, a * b); break;
            case '/': System.out.printf("%d / %d = %d\n", a, b, a / b); break;
            default:  System.out.println("No operation");
        }*/

        /*System.out.print("Введите арифметическое выражение: ");
        String expression = kb.nextLine();

//        String[] numbers = expression.split("\\+\\-\\*\\/");
        String[] numbers = expression.split("[\\+\\-\\*\\/]");
        System.out.println("Expression: " + expression);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c;
//        expression.indexOf()

//        System.out.printf("%d %c %d", a, s, b);
        if(expression.indexOf('+') > 0)
        {
            c=a+b;
            System.out.printf("%d + %d = %d", a, b, c);
        }
        else if(expression.indexOf('-') > 0)
        {
            c = a-b;
            System.out.printf("%d - %d = %d", a, b, c);
        }
        else if(expression.indexOf('*') > 0)
        {
            c = a*b;
            System.out.printf("%d * %d = %d", a, b, c);
        }
        else if(expression.indexOf('/') > 0)
        {
            c=a/b;
            System.out.printf("%d / %d = %d", a, b, c);
        }
        else
        {
            c = Integer.MIN_VALUE;
            System.out.println("Error: No operation");
        }*/
//        System.out.printf("%d %c %d = %d", a, s, b, c);
    }

    public static String suffix(int score)
    {
        String suffix = "";
        if(score>=10 && score <=20||score%10 >= 5 || score%10==0)
        {
            suffix = " очков";
        }
        else if(score % 10 == 1)
        {
            suffix = (" очко");
        }
        else if(score%10 >1 && score%10<5)
        {
            suffix = (" очка");
        }
       /* else
        {
            suffix = (" очков");
        }*/
        return suffix;
    }
}