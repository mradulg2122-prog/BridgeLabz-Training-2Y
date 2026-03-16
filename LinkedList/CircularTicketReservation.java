
class CircularTicketReservation {

    static class Node{
        int ticketId;
        String customer,movie,seat,time;
        Node next;

        Node(int id,String c,String m,String s,String t){
            ticketId=id; customer=c; movie=m; seat=s; time=t;
        }
    }

    static Node head=null;

    static void addTicket(int id,String c,String m,String s,String t){
        Node n=new Node(id,c,m,s,t);
        if(head==null){
            head=n;
            n.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head) temp=temp.next;
        temp.next=n;
        n.next=head;
    }

    static void display(){
        if(head==null) return;
        Node t=head;
        do{
            System.out.println(t.ticketId+" "+t.customer+" "+t.movie);
            t=t.next;
        }while(t!=head);
    }
}
