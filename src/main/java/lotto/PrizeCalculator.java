package lotto;

import static lotto.constants.ConstantValues.*;

import java.util.HashMap;
import java.util.List;

public class PrizeCalculator {

    public static HashMap<String, Integer> getScore(List<Lotto> lottoList, Lotto winLotto, int bonus) {
        HashMap<String, Integer> finalScore = new HashMap<>();
        for (Lotto lotto : lottoList) {
            int count = LottoChecker.checkLotto(lotto, winLotto);
            boolean bonusMatch = LottoChecker.checkBonus(lotto, bonus);
            String key = getScoreKey(count, bonusMatch);
            finalScore.put(key, finalScore.getOrDefault(key, 0) + 1);
        }
        return finalScore;
    }

    private static String getScoreKey(int count, boolean bonusMatch) {
        if (count == 6) {
            return "1등";
        }
        if (count == 5 && bonusMatch) {
            return "2등";
        }
        if (count == 5) {
            return "3등";
        }
        if (count == 4) {
            return "4등";
        }
        return "5등";
    }


}