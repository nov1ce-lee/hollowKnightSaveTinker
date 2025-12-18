package com.save.tinker.core.analyzer.model.sub;

import com.save.tinker.core.analyzer.model.Abstract;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collections;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class MaskFragments extends Abstract {

    /*
     * 面具碎片，每1个完整的面具占1%完成度，共4%
     */

    // 当前拥有的碎片数量
    private int heartPieces;
    private int maxHealthBase;

    // 斯莱商店
    private boolean slyShellFrag1;  // 150吉欧
    private boolean slyShellFrag2;  // 500吉欧
    private boolean slyShellFrag3;  // 800吉欧，拿到斯莱的地下室钥匙后
    private boolean slyShellFrag4;  // 1500吉欧，同上

    // 解救5只毛毛虫后虫爷爷奖励
    private int grubRewards;

    // 灰色哀悼者送花任务奖励
    private boolean xunRewardGiven;


    @Override
    public Map<String, Boolean> getMap() {
        return Collections.emptyMap();
    }

    @Override
    public String getName(String key) {
        return "";
    }

    @Override
    public int getValue() {
        return 0;
    }
}
