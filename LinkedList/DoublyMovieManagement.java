
class DoublyMovieManagement {

    static class Node{
        String title,director;
        int year;
        double rating;
        Node prev,next;

        Node(String t,String d,int y,double r){
            title=t; director=d; year=y; rating=r;
        }
    }

    static Node head=null,tail=null;

    static void addEnd(String t,String d,int y,double r){
        Node n=new Node(t,d,y,r);
        if(head==null){ head=tail=n; return; }
        tail.next=n;
        n.prev=tail;
        tail=n;
    }

    static void remove(String title){
        Node t=head;
        while(t!=null){
            if(t.title.equals(title)){
                if(t.prev!=null) t.prev.next=t.next;
                else head=t.next;
                if(t.next!=null) t.next.prev=t.prev;
                else tail=t.prev;
                return;
            }
            t=t.next;
        }
    }

    static void displayForward(){
        Node t=head;
        while(t!=null){
            System.out.println(t.title+" "+t.rating);
            t=t.next;
        }
    }

    static void displayReverse(){
        Node t=tail;
        while(t!=null){
            System.out.println(t.title+" "+t.rating);
            t=t.prev;
        }
    }
}
