package Lab5_Babenko_oop;


public class Sentence {
    //батьківський клас

    private SentenceElement[] sentenceElements;


    // generation of constructor for sentenceElements
    //access for global variable
    public Sentence(SentenceElement[] sentenceElements) {
        this.sentenceElements = sentenceElements;
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

    public int findWordEntrancesQuantity(String wordString) {
        int wordEntrancesQuantity = 0;


        for (SentenceElement sentenceElement : sentenceElements) {
            if (sentenceElement instanceof Word) {
                if (sentenceElement.toString().equals(wordString)) {
                    wordEntrancesQuantity++;
                }
            }
        }
        return wordEntrancesQuantity;
    }
}
