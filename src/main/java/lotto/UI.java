package lotto;

import camp.nextstep.edu.missionutils.Console;

public class UI {
    public String getInputMoney(){
        System.out.println("구입금액을 입력해 주세요.");
        return Console.readLine();
    }
}