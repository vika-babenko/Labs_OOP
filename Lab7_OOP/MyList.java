package Lab7_OOP;

//%C2=0
//C3=2
import Lab6_OOP.Flower;
import java.util.*;

//двозв*язний список
public class MyList<E> implements List<Flower> {
    /*
     *створюємо приватні поля
     */
    private Node head;
    private Node tail;
    private int size;


    //пустий конструктор для ліст1
    public MyList() {
    }

    //перевантаження
    //конструктор з одним об*єктом квітка
    public MyList(Flower flower) {
        //додаємо квітку у нашу колекцію
        add(flower);
    }

    //перевантажуємо конструктор ще раз
    //конструктор для колекції
    //за допомогою ключового слова extends додаємо тільки квіти або їх нащадків
    public MyList(Collection<? extends Flower> collection) {
        addAll(collection);
    }

    //generation of methods for flower
    @Override
    public int size() {

        //return size of object
        return size;
    }

    //realisation of method
    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    //realisation of method
    @Override
    public boolean contains(Object o) {
        for (Flower flower : this) {
            if (flower.equals(o)) {
                return true;
            }
        }
        return false;
    }


    // реалізація ітератора
    @Override
    public Iterator<Flower> iterator() {
        return new MyIterator();
    }

    //внутрішній клас
    class MyIterator implements Iterator<Flower> {
        //private field
        // надаємо значення head
        protected Node currentNode = head;

        //генеруємо 2 дефолтні методи для ітератора
        @Override
        public boolean hasNext() {

            //передбачаємо виявлення помилок, робимо так, щоб currentNode!=null в поверненні
            return currentNode != null;
        }

        @Override
        public Flower next() {
            //обробка виключної ситуації
            try {
                //отримуємо значення квітки і наступної квітки
                Flower flower = currentNode.getFlower();

                //посилання на наступну квітку
                currentNode = currentNode.getNext();

                //return flower
                return flower;
            } catch (NullPointerException e) {
                throw new NoSuchElementException();

            }


        }
    }



    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    /**
    *реалізація методу add()
    * flower -- міститься в Node
     * якщо розмір(голова двозв язного списку) дорівнює 0
     * голова буде вузлом
     * хвіст буде завжди дорівнювати щойно доданому елементу
     * previous посилається на head
     * next on tail
     */
    @Override
    public boolean add(Flower flower) {
        Node node = new Node(flower, null, tail);
        if(head == null) {
            head = node;
        }
        else {
            tail.setNext(node);
        }
        tail = node;
        /*
         * створюємо голову та хвіст двозв*язного списку
         * надаємо тип node
         * збільшуємо розмір за допомогою інкременти
         */
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Flower> c) {
        /**
         * бере кожен елемент з колекції і додає його
         * цикл, який обходить по масиву
         * на кожній ітерації він дає елемент масиву
         */
        boolean isCollectionChanged = false;
        for (Flower flower : c) {
            //add повертає true якщо щось змінилось
            // щоразу або з isCollectionChanged та add
            // true з true(false) = true -->always(в нашому випадку)
            // false з false = false
            isCollectionChanged |= add(flower);
        }
        return isCollectionChanged;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Flower> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Flower get(int index) {
        return null;
    }

    @Override
    public Flower set(int index, Flower element) {
        return null;
    }

    @Override
    public void add(int index, Flower element) {

    }

    @Override
    public Flower remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Flower> listIterator() {
        return new MyListIterator();
    }

    //extends ==> розширює MyIterator
    //implements ==> реалізує інтерфейс
    class MyListIterator extends MyIterator implements ListIterator<Flower>{
           /* @Override
            public boolean hasNext() {
            return false;
        }

            @Override
            public Flower next() {
            return null;
        }*/

            @Override
            public boolean hasPrevious() {
            return currentNode.getPrevious() != null;
        }

        /**
         * отримуємо значення попереднього
         * отримуємо квітку
         * @return previous flower
         */
            @Override
            public Flower previous() {
                currentNode = currentNode.getPrevious();
                return currentNode.getFlower();
        }

            @Override
            public int nextIndex() {
            return 0;
        }

            @Override
            public int previousIndex() {
            return 0;
        }

        // видаляє, що викликалося пізніше
            @Override
            public void remove() {

        }

            @Override
            public void set(Flower flower) {

        }

            @Override
            public void add(Flower flower) {

        }
    }


    @Override
    public ListIterator<Flower> listIterator(int index) {
        return null;
    }

    @Override
    public List<Flower> subList(int fromIndex, int toIndex) {
        return null;
    }
}