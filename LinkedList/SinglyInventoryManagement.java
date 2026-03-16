
class SinglyInventoryManagement {

    static class Node{
        String name;
        int id,qty;
        double price;
        Node next;

        Node(String n,int i,int q,double p){
            name=n; id=i; qty=q; price=p;
        }
    }

    static Node head=null;

    static void addItem(String n,int i,int q,double p){
        Node node=new Node(n,i,q,p);
        node.next=head;
        head=node;
    }

    static double totalValue(){
        double sum=0;
        Node t=head;
        while(t!=null){
            sum+=t.qty*t.price;
            t=t.next;
        }
        return sum;
    }
}
