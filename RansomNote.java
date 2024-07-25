public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) count[c - 'a']++;
        for (char c : ransomNote.toCharArray()) if (--count[c - 'a'] < 0) {
            System.out.println(false);
            return;
        }
        System.out.println(true);
    }
}