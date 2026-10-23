class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sDict = new HashMap<>();
        HashMap<Character, Integer> tDict = new HashMap<>();

        for (char letter : s.toLowerCase().toCharArray()) {
            Integer occurency = (sDict.get(letter) == null) ? 0 : sDict.get(letter);
            sDict.put(letter, occurency + 1);
        }

        for (char letter : t.toLowerCase().toCharArray()) {
            Integer occurency = (tDict.get(letter) == null) ? 0 : tDict.get(letter);
            tDict.put(letter, occurency + 1);
        }

        return (sDict.equals(tDict));
    }
}
