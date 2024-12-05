public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {

        boolean check = false;
        for(int i = 0; i < sentences.length; i++){
            //sentences[i] = lowerCase(sentences[i]);           

            for(int j = 0; j < keywords.length; j++){

                if((lowerCase(sentences[i])).contains(keywords[j])){
                    System.out.println(sentences[i]);
                    break;
                }
            /*    for(int x = 0; x < s.length; x++){

                    if(contains(s[x], lowerCase(keywords[j]))){
                        System.out.println(sentences[i]);
                        check = true;
                        break;
                    }
                }

                if(check) break;

            } */
            }
        }
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String s = "";

        for(int i = 0; i < str.length(); i++){

            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) s += (char) (str.charAt(i) + 32);

            else s += str.charAt(i);
        }

        return s;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if(str1 == "" || str2 == "") return true;

        int step = 1;

        for(int i = 0; i < str1.length(); i++){

            
            if(str1.charAt(i) == str2.charAt(0)){

                for(int j = 1; j < str2.length() && j + i < str1.length(); j++){

                    if((str1.charAt(i + j) != str2.charAt(j))) {
                        return false;
                    }
                }
                return true;
            }
        }

        return false;

    }
}
