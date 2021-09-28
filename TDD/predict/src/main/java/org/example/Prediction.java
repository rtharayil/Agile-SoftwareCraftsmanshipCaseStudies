package org.example;

public class Prediction {

    ILanguageModelAlgo LMAglo;
    public Prediction(ILanguageModelAlgo mockAlgo) {
        LMAglo =mockAlgo;
    }

    public void predict(String sentence) {


        String lastWord = getLastWord(sentence);

        if(sentence.endsWith(" ")) {
            LMAglo.predictUsingBigram(lastWord);
        }
        else{
            LMAglo.predictUsingMonogram(lastWord);
        }

    }

    private String getLastWord(String sentence) {
        String [] words = sentence.split(" ");
        String lastWord="";
        if(words.length >0) {
             lastWord = words[words.length - 1];
        }
        return lastWord;
    }
}
