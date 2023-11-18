public class UniqueTree extends Tree
{
    public void insert(int Data)
    {
        insert(Data, Root);
    }
    private void insert(int Data, Element Root)
    {
        if(this.Root == null)this.Root = new Element(Data);
        if(Root == null)return;
        if(Data < Root.Data)
        {
            //Добавляем значение в левую ветку
            if(Root.Left == null)Root.Left = new Element(Data);
            else insert(Data, Root.Left);
        }
        else if(Data > Root.Data)
        {
            //Добавляем значение в правую ветку
            if(Root.Right == null)Root.Right = new Element(Data);
            else insert(Data, Root.Right);
        }
    }
}
