
import java.util.*;

class SinglySocialMedia {

    static class User{
        int id;
        String name;
        List<Integer> friends=new ArrayList<>();
        User next;

        User(int i,String n){
            id=i; name=n;
        }
    }

    static User head=null;

    static void addUser(int id,String name){
        User u=new User(id,name);
        u.next=head;
        head=u;
    }

    static User find(int id){
        User t=head;
        while(t!=null){
            if(t.id==id) return t;
            t=t.next;
        }
        return null;
    }

    static void addFriend(int a,int b){
        User u=find(a);
        if(u!=null) u.friends.add(b);
    }
}
