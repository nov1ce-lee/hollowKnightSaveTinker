package com.save.tinker.core.analyzer.model.sub;

import com.save.tinker.core.analyzer.model.Abstract;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class GrimAndHive extends Abstract {

    /*
     * 格林剧团和生命血，每个占有1%完成度，击败王格林或放逐格林都可以获得1%，共3%
     */

    // ★ 格林剧团
    private boolean killedGrimm;                    // 击败格林团长
    private boolean killedNightmareGrimm;           // 击败梦魇之王格林
    private boolean destroyedNightmareLantern;      // 摧毁梦魇之灯，放逐格林剧团

    // ★ 生命血（更新了蜂巢和蓝血）
    private boolean killedHiveKnight;               // 击败蜂巢骑士

    @Override
    public Map<String, Boolean> getMap() {
        Map<String, Boolean> map = new HashMap<>();
        map.put("killedGrimm", killedGrimm);
        map.put("killedNightmareGrimm", killedNightmareGrimm);
        map.put("destroyedNightmareLantern", destroyedNightmareLantern);
        map.put("killedHiveKnight", killedHiveKnight);
        return map;
    }

    @Override
    public String getName(String key) {
        switch (key) {
            case "killedGrimm":
                return "格林团长";
            case "killedNightmareGrimm":
                return "梦魇之王格林";
            case "destroyedNightmareLantern":
                return "梦魇之灯";
            case "killedHiveKnight":
                return "蜂巢骑士";
            default:
                return "";
        }
    }

    @Override
    public int getValue() {
        return 1;
    }
}
