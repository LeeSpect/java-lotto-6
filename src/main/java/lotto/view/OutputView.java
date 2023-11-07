package lotto.view;

import java.util.ArrayList;
import java.util.HashMap;
import lotto.Lotto;
//constant의 값들을 가져오기 위해 import
import static lotto.constants.InputMessages.*;
import static lotto.constants.ResponseMessages.*;

public class OutputView {

    public static void printStartBuyMessage() {
        System.out.println(START_BUY_MESSAGE);
    }

    public static void printLottoCount(int lottoCount) {
        System.out.println(lottoCount + END_BUY_MESSAGE.getMessage());
    }

    public static void printLottoSet(ArrayList<Lotto> lottoList) {
        for (Lotto lotto : lottoList) {
            printLottoNumbers(lotto);
        }
    }

    public static void printLottoNumbers(Lotto lotto) {
        System.out.println(lotto.getNumbers());
    }

    public static void printGetWinNumberMessage() {
        System.out.println(GET_WIN_NUMBER_MESSAGE);
    }

    public static void printGetBonusNumberMessage() {
        System.out.println(GET_BONUS_NUMBER_MESSAGE);
    }

    public static void printWinningStatistics(HashMap<String, Integer> finalScore, int lottoCount) {
        System.out.println();
        System.out.println(WIN_STATS_MESSAGE);
        System.out.println(LINE_MESSAGE);
        System.out.println(WIN_MESSAGE_5.getMessage() + winningStatistics[0] + "개");
        System.out.println(WIN_MESSAGE_4.getMessage() + winningStatistics[1] + "개");
        System.out.println(WIN_MESSAGE_3.getMessage() + winningStatistics[2] + "개");
        System.out.println(WIN_MESSAGE_2.getMessage() + winningStatistics[3] + "개");
        System.out.println(WIN_MESSAGE_1.getMessage() + winningStatistics[4] + "개");
        System.out.println(PROFIT_MESSAGE.getMessage() + yield + "%");
    }

}
