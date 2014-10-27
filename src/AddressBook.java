import java.util.ArrayList;

/**
 * Created by student on 20.10.2014.
 */
public class AddressBook {
    private ArrayList<Address> list= new ArrayList<Address>();

    public void add (Address a){
        list.add(a);
    }

    public ArrayList<Integer> find (String n){
        ArrayList<Integer> z = new ArrayList<Integer> ();

        for (int i = 0; i<list.size();i++){
            if (list.get(i).name.equals(n)){
                //print1(list.get(i));
                z.add(i);
            }
        }
        return z;
    }

    public Address findind(int x){
       return list.get(x);
    }

    public void print (){
        for (int i = 0; i<list.size();i++){
                print1(i, list.get(i));
        }
    }

    public void print1 (int index, Address entry){
        System.out.println("Индекс: "+index+", Имя: "+entry.name+", Телефон: "+entry.phone+", Почта: "+entry.email);
    }

    public void delete (int i){
        list.remove(i);
    }
    public void count (){
        System.out.println(list.size());
    }

    public void edit(int index, String name, String phone, String email) {
        list.get(index).name=name;
        list.get(index).phone=phone;
        list.get(index).email=email;
    }
}
