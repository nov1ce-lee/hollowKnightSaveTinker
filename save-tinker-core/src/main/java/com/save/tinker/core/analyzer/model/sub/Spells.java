package com.save.tinker.core.analyzer.model.sub;

import com.save.tinker.core.analyzer.model.Abstract;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class Spells extends Abstract {

    /*
     * 法术，每个占有1%完成度，共6%
     */

    private int fireballLevel;          // 0：未获得；1：复仇之魂，白波；2：暗影之魂，黑波
    private int screamLevel;            // 0：未获得；1：嚎叫幽灵，白吼；2：深渊尖啸，黑吼
    private int quakeLevel;             // 0：未获得；1：荒芜俯冲，白砸；2：黑暗降临，黑砸

    @Override
    public Map<String, Boolean> getMap() {
        Map<String, Boolean> map = new HashMap<>();
        map.put("fireball1", fireballLevel >= 1);
        map.put("fireball2", fireballLevel == 2);
        map.put("scream1", screamLevel >= 1);
        map.put("scream2", screamLevel == 2);
        map.put("quake1", quakeLevel >= 1);
        map.put("quake2", quakeLevel == 2);
        return map;
    }

    @Override
    public String getName(String key) {
        switch (key) {
            case "fireball1":
                return "复仇之魂";
            case "fireball2":
                return "暗影之魂";
            case "scream1":
                return "嚎叫幽灵";
            case "scream2":
                return "深渊尖啸";
            case "quake1":
                return "荒芜俯冲";
            case "quake2":
                return "黑暗降临";
            default:
                return null;
        }
    }

    @Override
    public int getValue() {
        return 1;
    }
}
