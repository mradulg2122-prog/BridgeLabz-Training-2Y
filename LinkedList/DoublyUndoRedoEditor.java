
class DoublyUndoRedoEditor {

    static class Node{
        String text;
        Node prev,next;

        Node(String t){ text=t; }
    }

    static Node current=null;

    static void type(String txt){
        Node n=new Node(txt);
        if(current!=null){
            current.next=n;
            n.prev=current;
        }
        current=n;
    }

    static void undo(){
        if(current!=null && current.prev!=null)
            current=current.prev;
    }

    static void redo(){
        if(current!=null && current.next!=null)
            current=current.next;
    }

    static void show(){
        if(current!=null)
            System.out.println(current.text);
    }
}
