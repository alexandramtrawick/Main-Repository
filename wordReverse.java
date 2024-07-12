import java.util.Scanner;
public class wordReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What word would you like to reverse?");
        String word = scan.next();

        reverseWord(word);
    }

    private static void reverseWord(String word) {
        String newWord = "";

        for(int i = word.length() - 1; i >= 0; i--){
            newWord += word.substring(i, i+1);
        }
        System.out.println("Your word in reverse: " + newWord);
    }
}

