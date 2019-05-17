import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Namepresence {

    //Method declaration

    public String isPresent(String find,String s)
    {
        String res;
        Pattern pattern = Pattern.compile(find);
        Matcher m = pattern.matcher(s);
        if (m.find())
            res="true";
        else
            res="false";


        return res;
    }
    //another method declaration for another test case

    public String isPresent1(String find,String s)
    {
        String res;
        Pattern pattern = Pattern.compile(find);
        Matcher m = pattern.matcher(s);

        //find the given name present in given string or not

        if (m.find())
            res="true";
        else
            res="false";


        return res;
    }

}
