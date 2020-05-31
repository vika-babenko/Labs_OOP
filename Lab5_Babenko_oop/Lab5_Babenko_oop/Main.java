package Lab5_Babenko_oop;

public class Main {

    //статичні методи
    private static void myMethod(){
        System.out.println("In my method");

    }

    //перевантаження
    private static void myMethod(int b){
        System.out.println("In my method(int b = " + b + ')');
    }


    public static void main(String[] args){

        Text text2 = new Text("Hello, world! Hello, Victoria!");
        System.out.println(text2);

        /**
         * доступ клієнта до тексту
         */
        // !!! CLIENT
        Client client = new Client(text2);
        client.startLiveInTheSystem();

        //myMethod(1);
        //myMethod();

/*
/**
 * створення літер
 */
        /*Letter letter = new Letter( 'A');
                System.out.println(letter);

                Letter letter2 = new Letter( 'a');
                System.out.println(letter2);

                Letter letter3 = new Letter( 'B');
                System.out.println(letter3);



              //creating array of symbols
                //quick creating of array
               Letter [] letters = {
                       new Letter('H'),
                       new Letter('e'),
                       new Letter('l'),
                        new Letter('l'),
                        new Letter('o'),
                };


               //передача масиву letters
                Word word = new Word(letters);


                //quick creating of array
                Letter [] letters2 = {
                        new Letter('w'),
                       new Letter('o'),
                     new Letter('r'),
                       new Letter('l'),
                        new Letter('d'),
                };

               Word word2 = new Word(letters2);
               System.out.println(word);
               System.out.println(word2);
        //punctuation

        /*
          передача пунктуації
         */
        /*Punctuation punctuation = new Punctuation(",");
        Punctuation punctuation2 = new Punctuation("!");

        //creating of sentence as array
        Sentence sentence = new Sentence(new SentenceElement[]{
                word,
                punctuation,
                word2,
                punctuation2

        });

        Word word3 = new Word(new Letter[]{
                new Letter('V'),
                new Letter('i'),
                new Letter('k'),
                new Letter('t'),
                new Letter('o'),
                new Letter('r'),
                new Letter('i'),
                new Letter('a'),
        });

        Sentence sentence2 = new Sentence(new SentenceElement[]{
                word,
                punctuation,
                word3,
                punctuation2

        });



//вивід на екран
        System.out.println(sentence);
        System.out.println(sentence2);



        Text text = new Text(new Sentence[]{sentence, sentence2});*/
       // Text text2 = new Text("Hello, world. Hello, Viktoria.");

        //System.out.println(text);




        System.out.println("Зроблено! :)");
    }
}
