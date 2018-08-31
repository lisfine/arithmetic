public class test {
    public static void main(String[] args) {
       String J = "aA", S = "aAAbbbb";
        System.out.println(numJewelsInStones(J, S));
    }

    static int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] JArray = J.toCharArray();
        char[] SArray = S.toCharArray();

        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)){
                    count ++;
                }
            }
        }
        return count;
    }
}
