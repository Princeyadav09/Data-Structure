class SLL
{
    class Node
    {
        int data;
        Node next;
        Node(int x)
        {
            data=x;
            next=null;
        }
    }
    Node head;
    void addind(int x,int ind)
    {
        if(head==null)
        {
            Node n=new Node(x);
            head=n;
        }
        else
        {
            Node temp=head;
            Node n=new Node(x);
            int i=0;
            while(i<ind && head.next!=null)
            {
                i++;
                head=head.next;
            }
            n.next=head.next;
            head.next=n;
            head=temp;
        }
    }
    void addend(int x)
    {
        if(head==null)
        {
            Node n=new Node(x);
            head=n;
        }
        else
        {
            Node Temp=head;
            Node n=new Node(x);
            while(head.next!=null)
            {
                head=head.next;
            }
            head.next=n;
            head=Temp;
        }
    }
    void addbeg(int x)
    {
        if(head==null)
        {
            Node n=new Node(x);
            head=n;
        }
        else
        {
            Node n=new Node(x);
            n.next=head;
            head=n;
        }
    }
    void display()
    {
        if(head==null)
        {
            System.out.println("Empty");
        }
        while(head!=null){
        System.out.print(head.data+" ");
        head=head.next;
        }
    }
    public static void main(String arg[])
    {
        SLL ll=new SLL();
        ll.addbeg(4);
        ll.addbeg(42);
        ll.addbeg(43);
        ll.addbeg(5);
        ll.addbeg(8);
        ll.addbeg(9);
        ll.addend(4);
        ll.addend(0);
        ll.addend(42);
        ll.addend(43);
        ll.addend(5);
        ll.addend(8);
        ll.addend(0);
        ll.addend(9);
        ll.addind(0,2);
        ll.addind(0,4);
        ll.addind(0,6);
        ll.addind(0,1);
        ll.addend(0);
        ll.addend(42);

        ll.display();
    }    
}