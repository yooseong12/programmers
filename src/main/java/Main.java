public class Main {

    public static void main(String[] args) {
        /**
         * 기사단의 각 기사에게는 1번 ~ number 까지 번호가 저장되어있음
         * 기사들은 무기점에서 무기를 구매하려고 함
         *
         * 각 기사는 자신의 기사 번호의 약수 개수에 해당하는 "공격력"을 가진
         * 무기를 구매하려고함
         *
         * 단, 이웃나라의 협약에 의해 공격력의 제한 수치를 정하고ㅡ
         * 제한수치보다 큰 공격력을 가진 무기를 구매해야하는 기사는
         * 협약기관에서 정한 공격력을 가진 무기를 구매해야함
         *
         * 1. 1 ~ n 의 기사의 약수를 구하는 반복문 int 배열에 저장
         * 2. limit의 수를 넘는 약수를 조건문으로 걸른 후 해당 index 값을 power 로 치환
         * 3. int 배열에 담긴 값을 모두 더해서 return
         */

        int number = 5;
        int limit = 3;
        int power = 2;

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
        System.out.println(answer);
    }

}