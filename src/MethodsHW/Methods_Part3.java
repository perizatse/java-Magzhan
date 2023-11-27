package MethodsHW;

public class Methods_Part3 {
    //Task 7.6
    public static void main(String[] args) {
        String inputString = "AIEEE";
        boolean allVowels = areAllVowels(inputString);
        System.out.println(allVowels);
    }

    static boolean areAllVowels(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            char c = Character.toLowerCase(inputString.charAt(i));
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                return false;
            }
        }
        return true;
    }
}

