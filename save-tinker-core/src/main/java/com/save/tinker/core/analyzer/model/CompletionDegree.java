package com.save.tinker.core.analyzer.model;

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
    private int spellsCount;
    private final int spellsMax = 6;

    // 远古面具，每个占有1%完成度，共4%
    private int maskShardsCount;
    private final int maskShardsMax = 4;

    // 灵魂容器，每个占有1%完成度，共3%
    private int vesselFragmentsCount;
    private final int vesselFragmentsMax = 3;

    // 骨钉技艺，每个占有1%完成度，共3%
    private int nailArtsCount;
    private final int nailArtsMax = 3;

    // 骨钉升级，每次占有1%完成度，共4%
    private int nailUpgradesCount;
    private final int nailUpgradesMax = 4;

    // 普通Boss，每个占有1%完成度，共14%
    private int normalBossesCount;
    private final int normalBossesMax = 14;

    // 战士之梦，每个占有1%完成度，共7%
    private int warriorDreamsCount;
    private final int warriorDreamsMax = 7;

    // 护符，每个占有1%完成度，共36%
    private int charmsCount;
    private final int charmsMax = 36;

    // 守梦者，每个占有1%完成度，共3%
    private int dreamersCount;
    private final int dreamersMax = 3;

    // 梦之钉，每个占有1%完成度，共3%
    private int dreamNailCount;
    private final int dreamNailMax = 3;

    // 愚人斗兽场，每个占有1%完成度，共3%
    private int foolsColosseumCount;
    private final int foolsColosseumMax = 3;

    /**
     * 内容包完成度，共12%
     */
    // 格林剧团
    private int grimmTroupeCount;
    private final int grimmTroupeMax = 6;

    // 生命血
    private int lifeBloodCount;
    private final int lifeBloodMax = 1;

    // 神居
    private int godMasterCount;
    private final int godMasterMax = 5;

    private void updateDegree() {
        this.degree = equipmentsCount + spellsCount + maskShardsCount + vesselFragmentsCount + nailArtsCount
                + nailUpgradesCount + normalBossesCount + warriorDreamsCount + charmsCount + dreamersCount
                + dreamNailCount + foolsColosseumCount + grimmTroupeCount + lifeBloodCount + godMasterCount;
    }
}
