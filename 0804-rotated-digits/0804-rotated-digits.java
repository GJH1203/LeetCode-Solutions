  class Solution {
    public int rotatedDigits(int N) {
        int validCount = 0;
        for(int i = 1; i < N + 1; i++){
            String nString = String.valueOf(i);
            if(nString.indexOf('3') >= 0){
                continue;
            }
            if(nString.indexOf('4') >= 0){
                continue;
            }
            if(nString.indexOf('7') >= 0){
                continue;
            }
            if(nString.indexOf('2') >= 0 || nString.indexOf('5') >= 0 ){
                validCount++;
                continue;
            }
            if(nString.indexOf('6') >= 0 || nString.indexOf('9') >= 0 ){
                validCount++;
                continue;
            }
        }
        return validCount;
    }
}