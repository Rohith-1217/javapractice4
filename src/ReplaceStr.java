public class ReplaceStr {

    //Method declaration
    public String StringReplace(String s){
        //by using replaceAll method we can replace the given letter in given string
        String repla= s.replaceAll("d", "f").replaceAll("l","t");
        return repla;
    }


}
