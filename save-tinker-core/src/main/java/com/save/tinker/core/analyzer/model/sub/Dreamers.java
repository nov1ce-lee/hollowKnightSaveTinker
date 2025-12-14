package com.save.tinker.core.analyzer.model.sub;

import com.save.tinker.core.analyzer.model.Abstract;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class Dreamers extends Abstract {

    /*
     * 守梦者，每个占有1%完成度，共3%
     */

    private boolean lurienDefeated;     // 守望者卢瑞恩
    private boolean monomonDefeated;    // 教师莫诺蒙
    private boolean hegemolDefeated;    // 野兽赫拉

    @Override
    public Map<String, Boolean> getMap() {
        Map<String, Boolean> dreamers = new HashMap<>();
        dreamers.put("lurienDefeated", lurienDefeated);
        dreamers.put("monomonDefeated", monomonDefeated);
        dreamers.put("hegemolDefeated", hegemolDefeated);
        return dreamers;
    }

    public String getName(String key) {
        switch (key) {
            case "lurienDefeated":
                return "守望者卢瑞恩";
            case "monomonDefeated":
                return "教师莫诺蒙";
            case "hegemolDefeated":
                return "野兽赫拉";
            default:
                return "";
        }
    }

    @Override
    public int getValue() {
        return 1;
    }
}
