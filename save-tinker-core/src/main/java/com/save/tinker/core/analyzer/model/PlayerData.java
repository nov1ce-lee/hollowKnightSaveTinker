package com.save.tinker.core.analyzer.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.save.tinker.core.analyzer.model.sub.Bosses;
import com.save.tinker.core.analyzer.model.sub.Charms;
import com.save.tinker.core.analyzer.model.sub.DreamNail;
import com.save.tinker.core.analyzer.model.sub.FoolsColosseum;
import com.save.tinker.core.analyzer.model.sub.GrimAndHive;
import com.save.tinker.core.analyzer.model.sub.Dreamers;
import com.save.tinker.core.analyzer.model.sub.Equipments;
import com.save.tinker.core.analyzer.model.sub.GodHome;
import com.save.tinker.core.analyzer.model.sub.MaskFragments;
import com.save.tinker.core.analyzer.model.sub.NailArts;
import com.save.tinker.core.analyzer.model.sub.NailUpgrades;
import com.save.tinker.core.analyzer.model.sub.Spells;
import com.save.tinker.core.analyzer.model.sub.VesselFragments;
import com.save.tinker.core.analyzer.model.sub.WarriorDreams;
import lombok.Data;

@Data
public class PlayerData {
    /**
     * 主体包，游戏首发内容
     */
    @JsonUnwrapped
    private Equipments equipments;              // ★ 装备

    @JsonUnwrapped
    private Spells spells;                      // ★ 法术

    @JsonUnwrapped
    private MaskFragments maskFragments;        // ★ 面具碎片

    @JsonUnwrapped
    private VesselFragments vesselFragments;    // ★ 容器碎片

    @JsonUnwrapped
    private Charms charms;              // ★ 护符

    @JsonUnwrapped
    private Dreamers dreamers;          // ★ 守梦者

    @JsonUnwrapped
    private DreamNail dreamNail;        // ★ 梦之钉

    @JsonUnwrapped
    private NailArts nailArts;          // ★ 骨钉技艺

    @JsonUnwrapped
    private NailUpgrades nailUpgrades;  // ★ 骨钉升级

    @JsonUnwrapped
    private Bosses bosses;

    @JsonUnwrapped
    private WarriorDreams warriorDreams;    // ★ 战士之梦

    @JsonUnwrapped
    private FoolsColosseum foolsColosseum;  // ★ 愚人斗兽场

    /**
     * 内容包，游戏后续更新新增内容
     */
    @JsonUnwrapped
    private GrimAndHive grimAndHive;        // ★ 格林剧团 / 蜂巢

    @JsonUnwrapped
    private GodHome godHome;                // ★ 神居
}
