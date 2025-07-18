class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        List<String> ss = new ArrayList<>();
        String[] st = s.split("");
        int max = 0, count = 0;
        for (String str : st) {
            if (!ss.contains(str)) {
                ss.add(str);
                count = ss.size();
            } else {
                count = 0;
                while (ss.contains(str)) {
                    ss.remove(0);
                }
                ss.add(str);
                count = ss.size();
            }

            if (max < count) {
                max = count;
            }
        }
        return max;
    }
}