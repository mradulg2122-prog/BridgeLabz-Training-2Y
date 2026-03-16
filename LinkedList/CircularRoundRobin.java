
class CircularRoundRobin {

    static class Node{
        int pid,burst;
        Node next;

        Node(int p,int b){
            pid=p; burst=b;
        }
    }

    static Node head=null;

    static void addProcess(int p,int b){
        Node n=new Node(p,b);
        if(head==null){
            head=n;
            n.next=head;
            return;
        }
        Node t=head;
        while(t.next!=head) t=t.next;
        t.next=n;
        n.next=head;
    }

    static void display(){
        Node t=head;
        if(t==null) return;
        do{
            System.out.println("Process "+t.pid+" Burst "+t.burst);
            t=t.next;
        }while(t!=head);
    }
}
