import java.util.Arrays;

public class Alphabetical {

    //Method declaration

    public String isAlphabetical(String s)
    {
           char ArrayOfString[] = s.toCharArray();

                Arrays.sort(ArrayOfString);
                String sort = new String(ArrayOfString);

                //removing spaces using trim function

                String res= sort.trim();
                return res;

            }

    }

