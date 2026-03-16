
class CircularTaskScheduler {

    static class Node{
        int id,priority;
        String name,date;
        Node next;

        Node(int i,String n,int p,String d){
            id=i; name=n; priority=p; date=d;
        }
    }

    static Node head=null;

    static void addTask(int id,String name,int p,String date){
        Node n=new Node(id,name,p,date);
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
        if(head==null) return;
        Node t=head;
        do{
            System.out.println(t.id+" "+t.name);
            t=t.next;
        }while(t!=head);
    }
}
