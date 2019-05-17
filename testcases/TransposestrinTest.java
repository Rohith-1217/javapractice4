import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposestrinTest {

    //object has created for java class

    private static Transposestrin ob;
    @Before
    public void setup(){
        ob=new Transposestrin();
    }
    @After
    public void tearDown(){
        ob=null;
    }

    //String is declared

    String s="all good";
    @Test
    public void transpose()
    {

        //passing string to the java class method

        String res=ob.isTranspose(s);

        //compares the result retrieved from java class

        assertEquals("lla doog",res);
    }

}