import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int middle;
        Arrays.sort(array);
        for(int i : array)
        System.out.print(i + " ");
        middle = array.length / 2;
        answer = array[middle];
        return answer;
    }
}