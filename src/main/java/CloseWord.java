public class CloseWord {
    public int[] solution(String s) {
        String[] strArray = s.split("");
        int[] answer = new int[strArray.length];
        String[] change = new String[strArray.length];
        int size = 0;

        for(int i=0; i<strArray.length; i++){
            change[i] = strArray[i];
            answer[i] = -1;
            for(int j=i-1; j >=0; j--){
                if(change[i].equals(change[j])){
                    size = i -j;
                    answer[i] = Math.abs(size);
                    break;
                }
            }

        }
        return answer;
    }
}
