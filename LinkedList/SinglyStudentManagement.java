
import java.util.*;

class SinglyStudentManagement {

    static class Node {
        int roll;
        String name;
        int age;
        String grade;
        Node next;

        Node(int r,String n,int a,String g){
            roll=r; name=n; age=a; grade=g;
        }
    }

    static Node head=null;

    static void addAtEnd(int r,String n,int a,String g){
        Node newNode=new Node(r,n,a,g);
        if(head==null){ head=newNode; return; }
        Node temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=newNode;
    }

    static void deleteByRoll(int roll){
        if(head==null) return;
        if(head.roll==roll){ head=head.next; return; }
        Node temp=head;
        while(temp.next!=null && temp.next.roll!=roll) temp=temp.next;
        if(temp.next!=null) temp.next=temp.next.next;
    }

    static Node search(int roll){
        Node t=head;
        while(t!=null){
            if(t.roll==roll) return t;
            t=t.next;
        }
        return null;
    }

    static void updateGrade(int roll,String grade){
        Node s=search(roll);
        if(s!=null) s.grade=grade;
    }

    static void display(){
        Node t=head;
        while(t!=null){
            System.out.println(t.roll+" "+t.name+" "+t.age+" "+t.grade);
            t=t.next;
        }
    }
}
