public class CharSplit {
    public int solution(String s) {
        int answer = 0;
        int xCount = 1;
        int sCount = 0;

        String[] str = s.split("");

        loop:
        for (int i = 0; i <= str.length; i++) {
            if (str.length-1 == i) {
                answer++;
                break;
            }else {
                for (int j = i + 1; j <= str.length; j++) {
                    if (str.length-1 == j) {
                        answer++;
                        break loop;
                    }
                    if (str[i].equals(str[j])) {
                        xCount++;
                    } else {
                        sCount++;
                    }

                    if (xCount == sCount) {
                        answer++;
                        i = j;
                        xCount = 1;
                        sCount = 0;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
