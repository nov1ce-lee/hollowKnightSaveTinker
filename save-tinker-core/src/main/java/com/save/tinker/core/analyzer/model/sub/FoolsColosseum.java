package com.save.tinker.core.analyzer.model.sub;

import com.save.tinker.core.analyzer.model.Abstract;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class FoolsColosseum extends Abstract {

    /*
     * 愚人竞技场，每个占有1%完成度，共3%
     */

    private boolean colosseumBronzeCompleted;   // 勇士的试炼（竞技场1）
    private boolean colosseumSilverCompleted;   // 征服者的试炼（竞技场2）
    private boolean colosseumGoldCompleted;     // 愚人的试炼（竞技场3）


    @Override
    public Map<String, Boolean> getMap() {
        Map<String, Boolean> map = new HashMap<>();
        map.put("colosseumBronzeCompleted", colosseumBronzeCompleted);
        map.put("colosseumSilverCompleted", colosseumSilverCompleted);
        map.put("colosseumGoldCompleted", colosseumGoldCompleted);
        return map;
    }

    @Override
    public String getName(String key) {
        switch (key) {
            case "colosseumBronzeCompleted":
                return "勇士的试炼";
            case "colosseumSilverCompleted":
                return "征服者的试炼";
            case "colosseumGoldCompleted":
                return "愚人的试炼";
            default:
                return "";
        }
    }

    @Override
    public int getValue() {
        return 1;
    }
}
