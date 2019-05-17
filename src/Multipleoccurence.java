import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Multipleoccurence {

    //Method declaration

    public String isMultipleOccurence(String s, String sub) {

        String res="";
        Pattern pattern = Pattern.compile(sub);
        Matcher matcher = pattern.matcher(s);

        int count = 0;
        while (matcher.find()) {
            count++;
             res += matcher.start() + "-" + matcher.end()+",";//print startin index and last index of given substring

        }
        //it will return upto last but one index

        return res.substring(0,res.length()-1);


    }
}