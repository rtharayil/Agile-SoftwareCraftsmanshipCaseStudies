package org.example;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;



import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;


/**
 * Unit test for simple App.
 */

/*
public class moctest

{

    @Test
    public void iterator_will_return_hello_world(){
        //arrange
        Iterator i= mock(Iterator.class);
        when(i.next()).thenReturn("Hello").thenReturn("World");
        //act
        String result=i.next()+" "+i.next();
        //assert
        assertEquals("Hello World", result);

    }


    @Test
    public void with_arguments(){
        Comparable c=mock(Comparable.class);
        when(c.compareTo("Test")).thenReturn(1);
        assertEquals(1,c.compareTo("Test"));
    }


    @Test(expected=IOException.class)
    public void OutputStreamWriter_rethrows_an_exception_from_OutputStream()
            throws IOException{
        OutputStream mock=mock(OutputStream.class);
        OutputStreamWriter osw=new OutputStreamWriter(mock);
        doThrow(new IOException()).when(mock).close();
        osw.close();
    }

    @Test
    public void OutputStreamWriter_Closes_OutputStream_on_Close()
            throws IOException{
        OutputStream mock=mock(OutputStream.class);
        OutputStreamWriter osw=new OutputStreamWriter(mock);
        osw.close();
        verify(mock).close();
    }

    @Test
    public void whenSpyingOnList_thenCorrect() {
        List<String> list = new ArrayList<String>();
        List<String> spyList = Mockito.spy(list);

        spyList.add("one");
        spyList.add("two");

        Mockito.verify(spyList).add("one");
        Mockito.verify(spyList).add("two");

        assertEquals(2, spyList.size());
    }

    @Test
    public void mockSpyDiff() {

        List<String> mocList = Mockito.mock(List.class);

        mocList.add("one");
        mocList.add("two");

        Mockito.verify(mocList).add("one");
        Mockito.verify(mocList).add("two");

        assertEquals(0, mocList.size());

        when(mocList.size()).thenReturn(2);

        assertEquals(2, mocList.size());
    }
}
*/