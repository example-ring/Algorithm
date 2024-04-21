class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int [2];
        
        int denom, numer, temp = 1;
        denom = denom1 * denom2;
        numer = numer1 * denom2 + numer2 * denom1;
        System.out.print(numer + "  " +  denom);
        for(int i = 2; i <= numer ; i++) {
            if(numer % i == 0 && denom % i == 0){
            temp = i;
            }
        }
        numer = numer / temp;
        denom = denom / temp;
        answer [0] = numer;
        answer [1] = denom;
        
        return answer;
    }
}