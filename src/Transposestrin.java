public class Transposestrin {

    //Method declaration

    public String isTranspose(String s) {

        //using split function we will split the words

        String[] words = s.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }

        String res = reversedString.trim();

        //returns string by removing spaces existed

        return res;
    }

}

