class DLL
{
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int x)
        {
            data=x;
            next=null;
            prev=null;
        }
    }
    Node head;
    void addind(int ind,int x)
    {
        Node n=new Node(x);
        if(head==null)
        {
            head=n;
        }
        else
        {
            Node temp=head;
            int i=0;
            while(i<ind && head!=null)
            {
                i++;
                head=head.next;
            }
            n.next=head.next;
            head.next.prev=n;
            head.next=n;
            n.prev=head;
            head=temp;
        }
    }
    void addbeg(int x)
    {
        Node n=new Node(x);
        if(head==null)
        {
            head=n;
        }
        else
        {
            n.next=head;
            head.prev=n;
            head=n;
        }
    }
    void display()
    {
       if(head==null)
       {
           System.out.println("Empty");
       }
       while(head!=null)
       {
           System.out.print(head.data+" ");
           head=head.next;
       }
    }
    public static void main(String arg[])
    {
        DLL ll=new DLL();
         ll.addbeg(4);
        ll.addbeg(42);
        ll.addbeg(43);
        ll.addbeg(5);
        ll.addbeg(8);
        ll.addbeg(9);
        ll.addind(1,0);
        ll.display();      
    }
}