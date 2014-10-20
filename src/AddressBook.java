import java.util.ArrayList;

/**
 * Created by student on 20.10.2014.
 */
public class AddressBook {
    ArrayList<Address> list= new ArrayList<Address>();

    public void add (Address a){
        list.add(a);
    }
    public void find (String n){
        for (int i = 0; i<=list.size();i++){
            if (list.get(i).name == n){
                System.out.println(list.get(i));
            }
        }
    }

    public Address findind(int x){
       return list.get(x);
    }

    public void print (){
        for (int i = 0; i<=list.size();i++){
                System.out.println(list.get(i));
        }
    }
    public void delete (int i){
        list.remove(findind(i));
    }
    public void count (){
        System.out.println(list.size());
    }
}
