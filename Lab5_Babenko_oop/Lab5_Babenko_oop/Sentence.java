package Lab5_Babenko_oop;


public class Sentence {
    //батьківський клас

    //creating regex for punctuation
    //word or punctuation
    //static не буде створюватися для кожного екземпляру класу окремо
    private static final String punctuationSymbols = ",.!?;";

    private SentenceElement[] sentenceElements;

    /**
     *generation of constructor for sentenceElements
     * access for global variable
     */

    public Sentence(SentenceElement[] sentenceElements) {
        this.sentenceElements = sentenceElements;
    }

    public Sentence(String sentenceString){
        // delimiters
        // підстановка punctuationSymbols
        String [] sentenceElementsStrings = sentenceString.split("(?=[" + punctuationSymbols + "])|\\s");
        // creating array for сентенс елементів
        sentenceElements = new SentenceElement[sentenceElementsStrings.length];

        // проходимо по елементам
        String sentenceElementString;
        for (int i = 0; i < sentenceElementsStrings.length; i++) {
            sentenceElementString = sentenceElementsStrings[i];
            sentenceElements[i] = punctuationSymbols.contains(sentenceElementsStrings[i])
                    //
                    ? new Punctuation(sentenceElementString)
                    : new Word(sentenceElementString);
        }
    }



    /**
     * @return Sentence
     */
    //making toString for output Sentence
    @Override
    public String toString() {
        //створюємо стрінгбафер для меншої затрати ресурсів
        StringBuilder sentenceString = new StringBuilder();
        //цикл для накопичення елентів через індекс
        for (int i = 0; i < sentenceElements.length; i++) {
            sentenceString.append(
                    //instanceof перевірка чи є елемент зліва екземпляром класу справа
                    //якщо ненульовий елемент, то ставимо пробіл перед словом
                    // якщо це нульове(перше), то ніякого пробвлу
                    (i != 0 && sentenceElements[i] instanceof Word ? " " : "") +
                            sentenceElements[i].toString()
            );
        }
        return sentenceString.toString();
    }


    /**
     *метод, що повертає кількість слів
     */
    public int findWordEntrancesQuantity(String wordString) {
        /**
         *задаємо початкове значення цілочисельним типом
         */
        int wordEntrancesQuantity = 0;

/**
 *цикл для обходу по словам, як елементам речення
 * якщо sentenceElement виконує, тобто є частиною Word
 * порівнюємо
 * щоразу збільшуємо за допомогою інкременти
 */
        for (SentenceElement sentenceElement : sentenceElements) {
            if (sentenceElement instanceof Word) {
//                if (sentenceElement.toString().equals(wordString)) {
                Word word = (Word) sentenceElement;
                if (word.equalsString(wordString)) {
                    wordEntrancesQuantity++;
                }
            }
        }
        return wordEntrancesQuantity;
    }
}
