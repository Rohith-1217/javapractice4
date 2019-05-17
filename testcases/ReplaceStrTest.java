import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceStrTest {

    //object has created for java class

    private static ReplaceStr total;
    @Before
    public void setup(){
        total=new ReplaceStr();
    }
    @After
    public void tearDown(){
        total=null;
    }

    //String is declared

    String s="all good";
    @Test
    public void occurTest()
    {
        //passing string and key to the java class method

        String res=total.StringReplace(s);

        //compares the result retrieved from java class

        assertEquals("att goof",res);
    }

}