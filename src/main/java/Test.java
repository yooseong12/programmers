import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        /**
         * 디버깅하는 공간
         */

        /**
         *
         * 매일 1명의 가수가 노래를 부름 "점수'가 부여됨
         * 상위 k 번째 이내이면 "명예의 전당"에 올라가게 됨
         * 그 후에 더 높은 점수가 나오면 제일 낮은 점수가 명예의 전당에서 내려오게 됨
         *
         * 요구사항
         *
         * 매일 "명예의 전당" 에서 최하위 점수 발표
         *
         */

        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = new int[score.length];
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            q.add(score[i]);
            if (q.size() > k) {
                q.poll();
            }
            answer[i] = q.peek();
        }
        for (int i = 0; i < score.length; i++) {
            System.out.println(answer[i]);
        }

    }
}
