public class KnightWeapon {
    public int solution(int number, int limit, int power) {
        int[] result = new int[number];
        int[] divisor = new int[result.length];
        int answer = 0;

        for (int i = number; i > 0; i--) {
            result[i-1] = i;
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 1; j <= Math.sqrt(result[i]); j++) {
                if (result[i] % j == 0) {
                    divisor[i]++;
                    if (j * j != result[i]) {
                        divisor[i]++;
                    }
                }
            }
            if (divisor[i] > limit) {
                divisor[i] = power;
            }
        }

        for (int i = 0; i < result.length; i++) {
            answer += divisor[i];
        }

        return answer;
    }
}
