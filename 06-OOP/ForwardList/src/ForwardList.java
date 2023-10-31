public class ForwardList
{
    Element Head;
    public ForwardList()
    {
        this.Head = null;
        System.out.println("LConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public void push_front(int Data)
    {
        Element New = new Element(Data);
        New.setNext(Head);
        Head = New;
    }

    public void print()
    {
        Element Temp = Head;
        while(Temp != null)
        {
            System.out.print(Temp.getData() + "\t");
            Temp = Temp.getNext();
        }
    }
}
