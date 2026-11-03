class Solution {
    public List<String> generateParenthesis(int n) {
        List<List<String>> dp = new ArrayList<>();
        dp.add(List.of(""));

        for(int k = 1 ; k <= n ; k++){
            List <String> current = new ArrayList<>();
            for (int c = 0 ; c < k ; c++){
                for (String a : dp.get(c)){
                    for (String b : dp.get(k-1-c)){
                        current.add("("+a+")"+b);
                    }
                }
            }
            dp.add(current);
        }
         return dp.get(n);
    }
}