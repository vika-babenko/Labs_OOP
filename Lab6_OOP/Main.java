package Lab6_OOP;

//варіант - букет квітів(варіант 0)
public class Main {
    public static void main(String [] args){
        // екземпляри, які посилаються
        Flower flower = new Orchid(100, 5, 1, 100);
        Flower flower2 = new Chamomile(35, 2, 50);
        Flower flower3 = new Daffodil(50, 3, 20);

        //створюємо стрічку ціна -- 10
        Tape tape = new Tape(10);

        //створюємо обгортку ціна -- 20
        Wrapper wrapper = new Wrapper(20);

        //creating of bouquet
        //{} initialisation
        //поліморфізм за типами данних
        Bouquet bouquet = new Bouquet(new BouquetComponent[]{flower, flower2, flower3, tape, wrapper});

        //calling method sortByFreshness
        bouquet.sortByFreshness();

        // массив с цветами в заданном диапазоне
        BouquetComponent[] findFlowers = bouquet.getFlowersInRange(15, 25);

        for (BouquetComponent foundFlower: findFlowers) {
            System.out.println(foundFlower);
        }




        System.out.println("Лабу зроблено:)");
    }
}
