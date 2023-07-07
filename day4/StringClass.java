package day4;

public class StringClass {
    public static void main(String[] args) {
        String word = "apple ";
        StringBuffer wordBuffer = new StringBuffer(word);

        wordBuffer.append("rocks");
        System.out.println(wordBuffer.toString());

        for (int index = 0; index < word.length(); index++) {
            System.out.println(word.charAt(index));
        }
    }
}
