class Solution {
    public String reverseWords(String s) {
        char[] a = s.toCharArray();
        int n = removeExtraSpaces(a);
        reverse(a, 0,n-1);
        reverseEachWord(a, n);
        return new String(a, 0, n);
    }
    private int removeExtraSpaces(char[]a){
        int write = 0;
        for (int read = 0;read < a.length; read ++){
            if(a[read]==' '){
                if (write > 0 && a[write - 1] != ' ') a[write++] = ' ';
            } else {
                  a[write++] = a[read];
            }
    }
    if (write > 0 && a[write - 1] == ' ') write--; 
        return write;
    }
    private void reverse(char[]a,int lo , int hi){
        while(lo < hi){
            char t = a [lo]; a[lo] = a[hi]; a[hi] = t;
            lo++;  hi--;
        }
    }
    private void reverseEachWord(char[]a,int n){
        int start = 0;
        for(int i = 0; i<=n;i++){
            if(i==n || a[i]==' '){
                reverse(a,start,i-1);
                start = i+1;
            }
        }
    }
}
