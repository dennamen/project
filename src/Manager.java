import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by student on 20.10.2014.
 */
public class Manager {

    public static void main(String[] args){
        AddressBook book = new AddressBook();


        Scanner in = new Scanner(System.in);
        String n;
        String p;
        String e;
        int i;
        int a;
        while (true) {
            System.out.println("1.Добавление записи");
            System.out.println("2.Поиск по имени");
            System.out.println("3.Вывод всех записей");
            System.out.println("4.Удаление");
            System.out.println("5.Изменение");
            System.out.println("6.Выход из программы");
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
                    ArrayList<Integer> found = book.find(z);
                    for (i=0; i<found.size();i++){
                        System.out.println(i);
                        Integer index = found.get(i);
                        book.print1(index, book.findind(index));
                    }
                    // todo: вывод найденных записей
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
                    book.edit(i, n, p, e);

                    break;
                case 6:
                    return;

            }
        }



    }



}
