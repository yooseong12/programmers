public class FoodFight {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
            }
        }

        sb.append(0);


        for (int k = food.length-1; k > 0; k--) {
            for (int j = 0; j < food[k] / 2; j++) {
                sb.append(k);
            }
        }
        String answer = sb.toString();
        return answer;
    }
}
