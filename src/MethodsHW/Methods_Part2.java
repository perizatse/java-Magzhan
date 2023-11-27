package MethodsHW;

public class Methods_Part2 {
    //Task 7.4
    public static void main(String[] args) {
        String inputString = "Java is good to learn Object Oriented programming.";
        int wordCount = countWords(inputString);
        System.out.println("Количество слов в строке: " + wordCount);
    }

    static int countWords(String inputString) {
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            if (Character.isWhitespace(c)) {
                inWord = false;
            } else {
                if (!inWord) {
                    inWord = true;
                    wordCount++;
                }
            }
        }

        return wordCount;

    }
}

