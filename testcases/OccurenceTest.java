import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceTest {

    //object has created for java class

    private static Occurence total;
    @Before
    public void setup(){
        total=new Occurence();
    }
    @After
    public void tearDown(){
        total=null;
    }

    //String is declared

    String s="rohith hit";
    @Test
    public void occurTest()
    {
        //passing string to the java class method

        int res=total.totalOccurence(s);

        //compares the result retrieved from java class

        assertEquals(3,res);
    }

}