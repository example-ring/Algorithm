class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for (int idx = 0; idx < code.length(); idx++) {
            if (code.substring(idx, idx + 1).equals("1")) {
                if (mode == 0) {
                    mode = 1;
                } else if (mode == 1) {
                    mode = 0;
                }
            } else if (!code.substring(idx, idx + 1).equals("1")) {
                if (mode == 0) {
                    if (idx % 2 == 0) {
                    ret = ret + code.substring(idx, idx + 1);
                    } 
                } else if (mode == 1) {
                    if (idx % 2 != 0) {
                        ret = ret + code.substring(idx, idx + 1);
                    }
                }
            }
            
        }
        
        if (ret.equals("")) {
            return "EMPTY";
        }
        
        return ret;
    }
}