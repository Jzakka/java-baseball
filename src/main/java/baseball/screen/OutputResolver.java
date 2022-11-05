package baseball.screen;

import baseball.domain.Result;

import java.util.ArrayList;
import java.util.List;

public class OutputResolver {
    public void print(Result result) {
        Integer ball = result.getBall();
        Integer strike = result.getStrike();

        String resultPrompt = buildPrompt(ball, strike);

        System.out.println(resultPrompt);
    }

    private String buildPrompt(Integer ball, Integer strike) {
        List<String> ballsAndStrikes = new ArrayList<>();

        if (ball > 0) {
            ballsAndStrikes.add(ball + "볼");
        }
        if (strike > 0) {
            ballsAndStrikes.add(strike + "스트라이크");
        }
        if (ballsAndStrikes.isEmpty()) {
            return "낫싱";
        }

        return String.join(" ", ballsAndStrikes);
    }
}
