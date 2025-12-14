package com.save.tinker.core.analyzer.model.sub;

import com.save.tinker.core.analyzer.model.Abstract;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class Equipments extends Abstract {

    /*
     * 装备，在获得装备后获取相应能力，每个占有2%完成度，共14%
     */

    private boolean hasDash;                // 冲刺，获得蛾翼披风
    private boolean hasWalljump;            // 攀墙跳，获得螳螂爪
    private boolean hasDoubleJump;          // 二段跳，获得帝王之翼
    private boolean hasSuperDash;           // 超冲，获得水晶之心
    private boolean hasShadowDash;          // 黑冲，获得暗影披风
    private boolean hasAcidArmour;          // 酸泳，获得伊思玛的眼泪
    private boolean hasKingsBrand;          // 进深渊，获得王之印记

    @Override
    public Map<String, Boolean> getMap() {
        Map<String, Boolean> map = new HashMap<>();
        map.put("hasDash", hasDash);
        map.put("hasWalljump", hasWalljump);
        map.put("hasDoubleJump", hasDoubleJump);
        map.put("hasSuperDash", hasSuperDash);
        map.put("hasShadowDash", hasShadowDash);
        map.put("hasAcidArmour", hasAcidArmour);
        map.put("hasKingsBrand", hasKingsBrand);
        return Collections.unmodifiableMap(map);
    }

    @Override
    public String getName(String key) {
        switch (key) {
            case "hasDash":
                return "冲刺";
            case "hasWalljump":
                return "攀墙跳";
            case "hasDoubleJump":
                return "二段跳";
            case "hasSuperDash":
                return "超冲";
            case "hasShadowDash":
                return "黑冲";
            case "hasAcidArmour":
                return "酸泳";
            case "hasKingsBrand":
                return "进深渊";
            default:
                return "";
        }
    }

    @Override
    public int getValue() {
        return 2;
    }
}
