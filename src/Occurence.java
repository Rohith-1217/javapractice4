public class Occurence {

    //Method declaration
    public int totalOccurence(String s)
    {
        //it stores the string length which doen't contain the given  letter

        int res = s.length() - s.replaceAll("h", "").length();
        return res;
    }


}


