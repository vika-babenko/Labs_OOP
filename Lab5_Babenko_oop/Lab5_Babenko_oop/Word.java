package Lab5_Babenko_oop;



public class Word extends SentenceElement {


    //creating array of letters from Letter
    //named letters as plural
    private Letter[] letters;

    public Word(Letter[] letters) {
        this.letters = letters;
    }

    public Word(String wordString) {
        char[] lettersChars = wordString.toCharArray();
        letters = new Letter[lettersChars.length];
        for (int i = 0; i < lettersChars.length; i++) {
            letters[i] = new Letter(lettersChars[i]);
        }
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


     //creating method for returning result of entrance
    public boolean equalsString(String wordString) {
        return toString().equals(wordString);
    }
}

