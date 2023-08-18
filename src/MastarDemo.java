public class MastarDemo {

    public static void main(String[] args) {
        String sentence="Welcome to I.T MASTAR";
        //"Welcome to I.T MASTAR"
        //Output : MaStar
        char mCharLetter=sentence.charAt(15); //'M'
        char aCharLetter=sentence.charAt(16); //'A'
        char sCharLetter=sentence.charAt(17); // 'S'
        String word1=sentence.substring(18,21);//"TAR"
        String word2=word1.toLowerCase();//"tar" -->OK
        char acharLower=Character.toLowerCase(aCharLetter); //'a'
        String aStringLower= String.valueOf(acharLower); //"a" -->OK
        String mString= String.valueOf(mCharLetter);//"M" -->OK
        String sString= String.valueOf(sCharLetter);//"S" -->OK
        String output=mString+aStringLower+sString+word2;
        System.out.println(output);//Output : MaStar


    }
}
