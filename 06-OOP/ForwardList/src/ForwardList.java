public class ForwardList<T>
{
    Element<T> Head;
    int size;
    public ForwardList()
    {
        this.Head = null;
        size = 0;
        System.out.println("LConstructor:\t" + Integer.toHexString(hashCode()));
    }
    ForwardList(ForwardList<T> other)
    {
        System.out.println("LCopyConstructor:" + Integer.toHexString(hashCode()));
        //Shallow copy - Поверхностное копирование
        //this.Head = other.Head;
        //this.size = other.size;
        for(Element<T> Temp = other.Head; Temp != null; Temp = Temp.getNext())
            this.push_front(Temp.getData());
        reverse();
    }
    public void reverse()
    {
        ForwardList<T> reverse = new ForwardList<T>();
        while(Head != null)
        {
            reverse.push_front(Head.Data);
            pop_front();
        }
        this.Head = reverse.Head;
        reverse.Head = null;
    }
    public void push_front(T Data)
    {
        /*Element New = new Element(Data);
        New.setNext(Head);
        Head = New;*/
        Head = new Element(Data, Head);
        size++;
    }
    public void push_back(T Data)
    {
        if(Head == null)
        {
            push_front(Data);
            return;
        }
        //1) Доходим до конце списка:
        Element<T> Temp = Head;
        while(Temp.getNext() != null)Temp = Temp.getNext();
        //2) Добавляем элемент в конец списка:
        Temp.setNext(new Element(Data));
        size++;
    }
    void insert(T Data, int Index)
    {
        if(Index == 0)
        {
            push_front(Data);
            return;
        }
        if(Index > size)return;
        Element<T> Temp = Head;
        for(int i = 0; i < Index - 1; i++)Temp = Temp.getNext();
        /*Element New = new Element(Data);
        New.setNext(Temp.getNext());
        Temp.setNext(New);*/
        Temp.setNext(new Element(Data, Temp.getNext()));
        size++;
    }

    public void pop_front()
    {
        Head = Head.getNext();
        size--;
    }
    public void pop_back()
    {
        Element<T> Temp = Head;
        while(Temp.getNext().getNext() != null)Temp=Temp.getNext();
        Temp.setNext(null);
        size--;
    }

    public void print()
    {
        Element<T> Temp = Head;    //Temp - это итератор.
        //Итератор - это указатель, при помощи которого можно получить доступ к элементам структуры данных.
        while(Temp != null)
        {
            System.out.print(Temp.getData() + "\t");
            Temp = Temp.getNext();
        }
        System.out.println();
    }
}
