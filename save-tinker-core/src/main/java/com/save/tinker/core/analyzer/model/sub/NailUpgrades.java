package com.save.tinker.core.analyzer.model.sub;

import com.save.tinker.core.analyzer.model.Abstract;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class NailUpgrades extends Abstract {

    /*
     * 骨钉升级,每升级一次占有1%完成度，共4%
     */

    private int nailSmithUpgrades;

    @Override
    public Map<String, Boolean> getMap() {
        Map<String, Boolean> map = new HashMap<>();
        map.put("nailSmithUpgrade1", nailSmithUpgrades > 0);
        map.put("nailSmithUpgrade2", nailSmithUpgrades > 1);
        map.put("nailSmithUpgrade3", nailSmithUpgrades > 2);
        map.put("nailSmithUpgrade4", nailSmithUpgrades > 3);
        return map;
    }

    @Override
    public String getName(String key) {
        switch (key) {
            case "nailSmithUpgrade1":
                return "骨钉升级1";
            case "nailSmithUpgrade2":
                return "骨钉升级2";
            case "nailSmithUpgrade3":
                return "骨钉升级3";
            case "nailSmithUpgrade4":
                return "骨钉升级4";
            default:
                return "";
        }
    }

    @Override
    public int getValue() {
        return 1;
    }
}
