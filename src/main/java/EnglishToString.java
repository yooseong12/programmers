public class EnglishToString {
    public int solution(String s) {
        char[] ch = s.toCharArray();
        int result = 0;

        for (int i =0; i< ch.length;){
            if (ch[i] == 'z') {
                result = result * 10 + 0;
                i += 4;
            } else if(ch[i] == 'o') {
                result = result * 10 + 1;
                i += 3;
            } else if(ch[i] == 't') {
                if(ch[i+1] == 'w') {
                    result = result * 10 + 2;
                    i += 3;
                } else {
                    result = result * 10 + 3;
                    i += 5;
                }
            } else if(ch[i] == 'f') {
                if(ch[i+1] == 'o') {
                    result = result * 10 + 4;
                    i += 4;
                } else {
                    result = result * 10 + 5;
                    i += 4;
                }
            } else if(ch[i] == 's') {
                if(ch[i+1] == 'i') {
                    result = result * 10 + 6;
                    i += 3;
                } else {
                    result = result * 10 + 7;
                    i += 5;
                }
            } else if(ch[i] == 'e') {
                result = result * 10 + 8;
                i += 5;
            } else if(ch[i] == 'n') {
                result = result * 10 + 9;
                i += 4;
            }
        }
        return result;
    }
}
