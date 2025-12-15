package com.save.tinker.core.analyzer.model.sub;

import com.save.tinker.core.analyzer.model.Abstract;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collections;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class Fragments extends Abstract {

    /*
     * 面具碎片 / 容器碎片，每1个完整的面具或容器占1%完成度，面具4个，容器3个，共7%
     */

    // 当前拥有的碎片数量
    private int heartPieces;
    private int vesselFragments;

    /*
     * 面具碎片
     */

    // 斯莱商店
    private boolean slyShellFrag1;  // 150吉欧
    private boolean slyShellFrag2;  // 500吉欧
    private boolean slyShellFrag3;  // 800吉欧，拿到斯莱的地下室钥匙后
    private boolean slyShellFrag4;  // 1500吉欧，同上

    /*
     * 容器碎片
     */

    // 斯莱商店
    private boolean slyVesselFrag1;
    private boolean slyVesselFrag2;
    private boolean slyVesselFrag3;
    private boolean slyVesselFrag4;

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
