import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0 ) {
                arrayList.add(i);
            }
        }
        Object[] objectArray = arrayList.toArray();
        int[] answer = new int[objectArray.length];
        for (int i = 0; i < objectArray.length; i++) {
            answer[i] = (int) objectArray[i];
        }
        return answer;
    }
}