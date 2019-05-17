import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.lang.StringBuilder;

public class MultipleoccurenceTest {

    //object has created for java class

    private static Multipleoccurence ob;
    @Before
    public void setup(){
        ob=new Multipleoccurence();
    }
    @After
    public void tearDown(){
        ob=null;
    }

    //String is declared

    String s="rohith hit";
    String sub="hi";
    @Test
    public void multiple()
    {
        //passing string and substring to the java class method

        String res=ob.isMultipleOccurence(s,sub);

        //compares the result retrieved from java class

        assertEquals("2-4,7-9",res);
    }


}