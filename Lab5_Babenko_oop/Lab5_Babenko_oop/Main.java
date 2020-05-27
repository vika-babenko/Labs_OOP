package Lab5_Babenko_oop;

public class Main {
    public static void main(String[] args){
/**
 * створення літер
 */
        Letter letter = new Letter( 'A');
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


        /**
         * Створення слів
         */
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

        /**
         * передача пунктуації
         */
        Punctuation punctuation = new Punctuation(",");
        Punctuation punctuation2 = new Punctuation("!");

        /**
         * створення речення
         */
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



        Text text = new Text(new Sentence[]{sentence, sentence2});

        System.out.println(text);


        /**
         * доступ клієнта до тексту
         */
        // !!! CLIENT
        Client client = new Client(text);
        client.startLiveInTheSystem();

        System.out.println("Зроблено! :)");


    }
}
