class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}

public class Main11
{
    public static void main(String args[])
    {
        Node first=new Node(10);
        Node second=new Node(10);
        Node third=new Node(10);
        first.next=second;
        second.next=third;
        Node temp=first;
        while(temp!=null)
        {
            System.err.println(temp.data+" ");
            temp=temp.next;
        }
    }
}