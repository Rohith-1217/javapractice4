import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NamepresenceTest {

    //object has created for java class

    private static Namepresence ob;
    @Before
    public void setup(){
        ob=new Namepresence();
    }
    @After
    public void tearDown(){
        ob=null;
    }

    //String is declared

    String s="this is harry";
    String find="harry";
    String find1="good";
    @Test
    public void Namepresen()
    {
        //passing string and key to the java class method

        String res=ob.isPresent(find,s);

        //compares the result retrieved from java class

        assertEquals("true",res);

        //checking two cases of problem

        String res1=ob.isPresent1(find1,s);
        assertEquals("false",res1);

    }

}