import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Strings --> a, b ,/, Phani, Hello , " ", ' '
        String word="Mastar";
        System.out.println(word);
        //toUpperCase(),toLowerCase(),length(),substring(), concat(), +, charAt(), equals(), equalsIgnoreCase()
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        String word1=word.toLowerCase();
        System.out.println(word1);
        System.out.println(word.length());
        String fName="phani";
        String lName="madiraju";
        String fullName=fName + lName;
        System.out.println(fullName);
        fullName=fName+" "+lName;
        System.out.println(fullName);
         String concat = fName.concat(lName);
        System.out.println(concat);
        System.out.println(fName.concat(" ").concat(lName));
        System.out.println(fName.toUpperCase().concat(",").concat(lName.toUpperCase()));
        char letter='a';
        System.out.println(Character.toUpperCase(letter));
        String word2="Mastaru";
        String word3="mastar";
        System.out.println(word2.equals(word3));
        System.out.println(word2.equalsIgnoreCase(word3));
        System.out.println(word2.charAt(0));
        System.out.println(word2.charAt(2));
        System.out.println(word2.charAt(5));
//        System.out.println(word2.charAt(6));
        System.out.println(word2.substring(0));
        System.out.println(word2.substring(2));
        System.out.println(word2.substring(4));
        System.out.println(word2.substring(0,3));
        System.out.println(word2.substring(0,4));
        System.out.println(word2.substring(2,6));
        String word4="learn_it";
        //earn
        System.out.println(word4.substring(1,5));
        //it
        System.out.println(word4.substring(6,8));
        String word5="Become a pro";
        //come
        System.out.println(word5.substring(2,6));
        //pro
        System.out.println(word5.substring(7,10));
        System.out.println(word5.substring(9,12));


    }
}