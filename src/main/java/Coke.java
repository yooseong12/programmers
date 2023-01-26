import java.util.ArrayList;
import java.util.List;

public class Coke {
    /**
     * 콜라 문제
     * 콜라 빈 병 2개를 가져다주면 콜라 1병을 주는 마트가 있음
     * 빈병 20개를 가져다주면 몇 병을 받을 수 있을까
     *
     * 조건 - 보유중인 빈병이 2개 미만이면, 콜라를 받을 수 없음
     *
     * 주어지는 값
     * a = 콜라를 받기 위해 주어야 하는 병 수
     * b = 지급되는 콜라
     * n = 내가 가지고 있는 빈 병의 갯수
     */

    public int solution(int a, int b, int n) {
        int c = 0;
        int result = 0;
        List<Integer> list = new ArrayList<>();
        int answer = 0;

        while (true) {
            result = n;
            n = n / a;
            n *= b;

            if (result % a != 0) {
                c = c + (result % a);
            }

            list.add(n);
            if (n < a) {
                n += c;
                c = 0;
                if (n < a) {
                    break;
                }
            }


        }
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }
}
