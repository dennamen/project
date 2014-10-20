import java.util.Scanner;

/**
 * Created by student on 20.10.2014.
 */
public class Manager {

    public static void main(String[] args){
        AddressBook book = new AddressBook();

        System.out.println("1.Добавление записи");
        System.out.println("2.Поиск");
        System.out.println("3.Вывод всех записей");
        System.out.println("4.Удаление");
        System.out.println("5.Изменение");
        System.out.println("6.Выход из программы");
        Scanner in = new Scanner(System.in);
        String n;
        String p;
        String e;
        int i;
        Address address;
        int a;
        while (true) {
            System.out.println("Oyvey!");
            a = in.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Имя:");
                    n = in.next();
                    System.out.println("Телефон:");
                    p = in.next();
                    System.out.println("Почта:");
                    e = in.next();
                    book.add(new Address(n,p,e));
                    break;
                case 2:
                    System.out.println("Имя:");
                    String z = in.next();
                    book.find(z);
                    break;
                case 3:
                    book.print();
                    break;
                case 4:
                    System.out.println("Индекс:");
                    i = in.nextInt();
                    book.delete(i);
                    break;
                case 5:
                    System.out.println("Индекс:");
                     i = in.nextInt();
                    System.out.println("Имя:");
                     n = in.next();
                    System.out.println("Телефон:");
                     p = in.next();
                    System.out.println("Почта:");
                     e = in.next();
                    book.list.get(i).name=n;
                    book.list.get(i).phone=p;
                    book.list.get(i).email=e;
                    break;
                case 6:
                 break;
            }
        }



    }



}
