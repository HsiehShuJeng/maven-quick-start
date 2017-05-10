package scott.programming.training;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest{
    private Application app;
    
    @Before
    public void set(){
        app = new Application();
    }
    
    @Test
    public void testWordCountString(){
        int count = app.countWords("ths is a test");
        assertTrue(count == 4);
    }
    
    @Test
    public void testWordCountEmpty(){
        int count = app.countWords("");
        assertTrue(count == 0);
    }
    
    @Test
    public void testWordCOuntNull(){
        int count = app.countWords(null);
        assertTrue(count == 0);
    }
    
    @Test
    @Ignore
    public void testWordCountMore(){
        int count = app.countWords("this will be skipped");
        assertTrue(count == 3);
    }
    
    @Test
    public void testWordCountSingle(){
        int count = app.countWords("test");
        assertTrue(count == 1);
    }
}
