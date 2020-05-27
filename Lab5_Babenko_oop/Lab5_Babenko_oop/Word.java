package Lab5_Babenko_oop;



public class Word extends SentenceElement {


    //creating array of letters from Letter
    //named letters as plural
    private Letter[] letters;

    public Word(Letter[] letters) {
        this.letters = letters;
    }

    // creating for output Word
    // return our word
    @Override
    public String toString(){
        //пустий вордстрінг
        StringBuilder wordString = new StringBuilder();
        //цикл, який обходить і ми отримуємо доступ до кожного елемента масиву
        //накопичуємо наші елементи масиву String.toString();
        for (Letter letter : letters) {

            //при кожній конкатенації створюється новий стрінг, щоб запобігти затрачання ресурсів, вик. StringBuilder
            wordString.append(letter.toString());
        }
        return wordString.toString();
     }
}

