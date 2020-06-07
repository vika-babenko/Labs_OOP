package Lab7_OOP;

import Lab6_OOP.Flower;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        //створюємо ліст з квітки з ціною 1 і свіжістю 1
        MyList myList = new MyList(new Flower(50,1));
        /*
        *додаємо ще одну квітку
         */
        myList.add(new Flower(22, 2));
        myList.add(new Flower(24, 3));
        myList.add(new Flower(30, 4));

        //testing пустого конструктора
        MyList myList1 = new MyList();
        myList1.add(new Flower(45,0));
        myList1.add(new Flower(15,0));


        ArrayList myArrayList = new ArrayList();
        myArrayList.add(new Flower(5, 3));
        myArrayList.add(new Flower(4, 6));
        MyList myList2 = new MyList(myArrayList);



        //помітка
        System.out.println("*******");
        //working with iterator
        //проходимося по квітах, ітеруючи виводимо результати
        Iterator iterator = myList2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        System.out.println(iterator.next());

        ListIterator listIterator = myList2.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());

        System.out.println(myList2.contains(new Flower(5,3)));
    }
}
