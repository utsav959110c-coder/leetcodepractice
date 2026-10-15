import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mappingsStoT = new HashMap<>();
        HashMap<Character, Character> mappingsTtoS = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            Character sch = s.charAt(i);
            Character tch = t.charAt(i);

            boolean iscontains = mappingsStoT.containsKey(sch);
            boolean iscontain = mappingsTtoS.containsKey(tch);

            if (iscontains && iscontain) {
                if (!mappingsStoT.get(sch).equals(tch) ||
                    !mappingsTtoS.get(tch).equals(sch)) {
                    return false;
                }
            }
            else if (!iscontains && !iscontain) {
                mappingsStoT.put(sch, tch);
                mappingsTtoS.put(tch, sch);
            }
            else {
                return false;
            }
        }

        return true;
    }
}