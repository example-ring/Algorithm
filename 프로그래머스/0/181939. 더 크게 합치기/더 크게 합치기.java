class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        int ab = Integer.parseInt(str1 + str2);
        int ba = Integer.parseInt(str2 + str1);
        if (ab >= ba){
            answer = ab;
        } else if (ab < ba){
            answer = ba;
        }
        return answer;
    }
}