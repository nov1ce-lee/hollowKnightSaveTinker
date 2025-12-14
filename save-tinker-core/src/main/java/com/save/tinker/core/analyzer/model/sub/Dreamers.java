package com.save.tinker.core.analyzer.model.sub;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Dreamers {
    /*
     * 守梦者
     */
    private boolean lurienDefeated;     // 守望者卢瑞恩
    private boolean monomonDefeated;    // 教师莫诺蒙
    private boolean hegemolDefeated;    // 野兽赫拉

    public Map<String, Boolean> getDreamers() {
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

    public List<String> getDreamersDefeated() {
        List<String> dreamersDefeated = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : getDreamers().entrySet()) {
            if (entry.getValue()) {
                dreamersDefeated.add(getName(entry.getKey()));
            }
        }
        return dreamersDefeated;
    }

    public List<String> getDreamersUndefeated() {
        List<String> dreamersUndefeated = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : getDreamers().entrySet()) {
            if (!entry.getValue()) {
                dreamersUndefeated.add(getName(entry.getKey()));
            }
        }
        return dreamersUndefeated;
    }
}
