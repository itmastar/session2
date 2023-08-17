public class LearnDemo {
    public static void main(String[] args) {
        String sentence="I want to learn Java";
        //"l" 'l' ->'L' -> "L"+"earn"
        //Learn  //earn //l //L //L+earn
        //LEARN //L //earn //L+earn
        String word=sentence.substring(11,15);
        System.out.println(word);
        char letter=sentence.charAt(10);
        System.out.println(letter);
        String lLetter= String.valueOf(Character.toUpperCase(letter));
        System.out.println(lLetter);
        String output=lLetter+word;
        System.out.println(output);
//        System.out.println(word.toUpperCase());

        //"Welcome to I.T MASTAR"
        //Output : MaStar
    }
}
