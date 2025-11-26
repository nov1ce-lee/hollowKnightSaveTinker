package com.save.tinker.core.analyzer;

import lombok.Data;

@Data
public class CompletionDegree {
    /**
     * 完成度，主体完成度上限为100%，加入内容包后完成度上限上升至112%
     */
    private int degree;

    /**
     * 主体完成度，上限为100%
     */

    // 能力，每个占有2%完成度，共14%
    private int equipmentsCount;
    private final int equipmentsMax = 14;

    // 法术，每个占有1%完成度，共6%

    // 远古面具，每个占有1%完成度，共4%
    private int maskShardsCount;
    private final int maskShardsMax = 4;

    // 灵魂容器，每个占有1%完成度，共3%

    // 骨钉技艺，每个占有1%完成度，共3%
    private int nailArtsCount;
    private final int nailArtsMax = 3;

    // 骨钉升级，每次占有1%完成度，共4%
    private int nailUpgradesCount;
    private final int nailUpgradesMax = 4;

    // 普通Boss，每个占有1%完成度，共14%
    private int normalBossesCount;

    // 战士之梦，每个占有1%完成度，共7%
    private int warriorDreamsCount;

    // 护符，每个占有1%完成度，共36%
    private int charmsCount;

    // 守梦者，每个占有1%完成度，共3%
    private int dreamersCount;

    // 梦之钉，每个占有1%完成度，共3%
    private int dreamNailCount;

    // 愚人斗兽场，每个占有1%完成度，共3%
    private int foolsColosseumCount;

    /*
     * 内容包
     */
}
