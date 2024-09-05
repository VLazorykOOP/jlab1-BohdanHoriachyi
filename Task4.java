import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String[] words = inputText.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                char lastChar = word.charAt(word.length() - 1);
                StringBuilder newWord = new StringBuilder();
                for (int i = 0; i < word.length() - 1; i++) {
                    if (word.charAt(i) != lastChar) {
                        newWord.append(word.charAt(i));
                    }
                }
                newWord.append(lastChar);
                result.append(newWord).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
