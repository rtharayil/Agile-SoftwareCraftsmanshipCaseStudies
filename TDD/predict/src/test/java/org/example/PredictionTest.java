package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
public class PredictionTest {
    /**
     * Rigorous Test :-)
     */
    ILanguageModelAlgo mockAlgo;
    Prediction prediction;

    @Before
    public void  SetUp(){

         mockAlgo = mock(ILanguageModelAlgo.class);
         prediction = new Prediction(mockAlgo);

    }

    @Test
    public void testForTest(){
        Assert.assertTrue(true);
    }
    
    @Test
    public  void Should_CallBigramModel_When_ASingleWordWithSpaceAsInput(){

        prediction.predict("Hello ");
        Mockito.verify(mockAlgo).predictUsingBigram("Hello");


    }

    @Test
    public  void Should_CallBigramModel_When_SpaceIsAnInput(){

        prediction.predict(" ");
        Mockito.verify(mockAlgo).predictUsingBigram("");
    }

    @Test
    public  void Should_CallBigramModel_When_APhraceIsEndingWithSpace(){

        prediction.predict("Hello World ");
        Mockito.verify(mockAlgo).predictUsingBigram("World");
    }


    @Test
    public  void Should_CallMonoGramModel_When_InputIsAPartialWord(){

        prediction.predict("Worl");
        Mockito.verify(mockAlgo).predictUsingMonogram("Worl");
    }

    @Test
    public  void Should_CallMonoGramModel_When_InputIsNone(){

        prediction.predict("");
        Mockito.verify(mockAlgo).predictUsingMonogram("");
    }

    @Test
    public  void Should_CallMonoGramModel_When_InputaFullPhraceEndingWithAPartialWord(){

        prediction.predict("Hello How Are you Do");
        Mockito.verify(mockAlgo).predictUsingMonogram("Do");
    }

}
