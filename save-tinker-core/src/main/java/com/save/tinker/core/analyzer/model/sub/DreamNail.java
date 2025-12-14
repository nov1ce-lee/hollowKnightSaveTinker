package com.save.tinker.core.analyzer.model.sub;

import com.save.tinker.core.analyzer.model.Abstract;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class DreamNail extends Abstract {

    /*
     * 梦之钉，每个占有1%完成度，共3%
     */

    private boolean hasDreamNail;           // 获得梦之钉
    private boolean dreamNailUpgraded;      // 觉醒梦之钉，获得1800精华后与先知对话后觉醒
    private boolean mothDeparted;           // 聆听先知的遗言，获得2400精华后与先知对话后完成，先知升天

    @Override
    public Map<String, Boolean> getMap() {
        Map<String, Boolean> map = new HashMap<>();
        map.put("hasDreamNail", hasDreamNail);
        map.put("dreamNailUpgraded", dreamNailUpgraded);
        map.put("mothDeparted", mothDeparted);
        return map;
    }

    @Override
    public String getName(String key) {
        switch (key) {
            case "hasDreamNail":
                return "获得梦之钉";
            case "dreamNailUpgraded":
                return "觉醒梦之钉";
            case "mothDeparted":
                return "聆听先知的遗言";
            default:
                return "";
        }
    }

    @Override
    public int getValue() {
        return 1;
    }
}
