package com.save.tinker.core.analyzer.model.sub;

import com.save.tinker.core.analyzer.model.Abstract;

import java.util.Collections;
import java.util.Map;

public class VesselFragments extends Abstract {

    /*
     * 容器碎片，每1个完整的容器占1%完成度，共3%
     */

    // 当前拥有的碎片数量
    private int vesselFragments;

    // 斯莱商店
    private boolean slyVesselFrag1;         // 550吉欧
    private boolean slyVesselFrag2;         // 900吉欧，需要店主的钥匙

    // 深巢右下角
    private boolean vesselFragStagNest;

    // 古老盆地喷泉投3000吉欧奖励
    private boolean fountainVesselSummoned;


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
