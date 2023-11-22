public class PigLatin {
    private String englishPhrase;

    /**
     * Constructors for objects of class PigLatin
     */
    public PigLatin() {
        englishPhrase = "my feet smell and my nose runs ";
        // default constructor
    }

    public PigLatin(String phrase) {
        englishPhrase = phrase + " ";
    }

    public String getPhrase() {
        return englishPhrase;
    }

    /**
     * The getWord method looks for a space to return the next word and truncates
     * the phrase.
     */
    public String getWord() {
        int index = englishPhrase.indexOf(' ');
        String word = englishPhrase.substring(0, index);
        englishPhrase = englishPhrase.substring(index + 1);
        return word;
    }

    public int findVowelPos(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.substring(i, i + 1)) > -1) {
                return i;
            }
        }
        return -1;
    }

    public String wordToPigLatin(String englishWord) {
        int index = findVowelPos(englishWord);

        if (index == -1) {
            return englishWord + "ay";
        } else if (index == 0) {
            return englishWord + "yay";
        } else {
            String start = englishWord.substring(0, index);
            String end = englishWord.substring(index);
            if (Character.isUpperCase(englishWord.charAt(0))) {
                end = end.substring(0, 1).toUpperCase() + end.substring(1).toLowerCase();
                start = start.toLowerCase();
            }
            return end + start + "ay";
        }
    }

    public String translate() {
        String ans = "";
        while (englishPhrase.length() > 1) {
            ans += wordToPigLatin(getWord()) + " ";
        }
        return ans.trim(); // Remove trailing space
    }

    public static void main(String args[]) {
        PigLatin one = new PigLatin();
        System.out.println(one.getWord());
        System.out.println(one.getPhrase());
        System.out.println(one.getWord());
        System.out.println(one.getPhrase());
        System.out.println(one.findVowelPos("apple"));
        System.out.println(one.findVowelPos("rhythm"));
        System.out.println(one.findVowelPos("street"));
        System.out.println(one.wordToPigLatin("apple"));
        System.out.println(one.wordToPigLatin("rhythm"));
        System.out.println(one.wordToPigLatin("truck"));

        PigLatin two = new PigLatin("Today is Monday");
        System.out.println(two.translate());
    }
}
