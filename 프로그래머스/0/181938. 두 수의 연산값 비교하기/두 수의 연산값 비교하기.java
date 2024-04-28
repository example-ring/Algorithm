class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        int ab = Integer.parseInt(str1 + str2);
        int multiple = 2 * a * b;
        if (ab >= multiple) {
            answer = ab;
        } else if (ab < multiple) {
            answer = multiple;
        }
        return answer;
    }
}