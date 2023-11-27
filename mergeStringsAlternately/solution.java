package mergeStringsAlternately;

class solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i;
        for(i=0;(i < word1.length() && i < word2.length());i++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        if(word1.length() == word2.length())
            return result.toString();
        if(word1.length() < word2.length()) {
            appendRemainString(result, word2, i);
        } else {
            appendRemainString(result, word1, i);
        }

        return result.toString();
    }

    private void appendRemainString(StringBuilder sb, String s, int index) {
        sb.append(s.substring(index));
    }
}
