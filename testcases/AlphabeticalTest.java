import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabeticalTest
{
    //object has created for java class

    private static Alphabetical ob;
    @Before
    public void setup(){
        ob=new Alphabetical();
    }
    @After
    public void tearDown(){
        ob=null;
    }

    //String is declared

    String s="rohith sai";
    @Test
    public void alphabetic()
    {
        //passing string to the java class method

        String res=ob.isAlphabetical(s);

        //compares the result retrieved from java class

        assertEquals("ahhiiorst",res);
    }

}