
class DoublyLibraryManagement {

    static class Node{
        String title,author,genre;
        int id;
        boolean available=true;
        Node prev,next;

        Node(String t,String a,String g,int i){
            title=t; author=a; genre=g; id=i;
        }
    }

    static Node head=null,tail=null;

    static void addBook(String t,String a,String g,int id){
        Node n=new Node(t,a,g,id);
        if(head==null){ head=tail=n; return; }
        tail.next=n;
        n.prev=tail;
        tail=n;
    }

    static void displayForward(){
        Node t=head;
        while(t!=null){
            System.out.println(t.title+" "+t.available);
            t=t.next;
        }
    }

    static void displayReverse(){
        Node t=tail;
        while(t!=null){
            System.out.println(t.title+" "+t.available);
            t=t.prev;
        }
    }
}
