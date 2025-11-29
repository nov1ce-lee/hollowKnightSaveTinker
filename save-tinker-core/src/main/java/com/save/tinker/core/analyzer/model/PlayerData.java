package com.save.tinker.core.analyzer.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PlayerData {
    /**
     * 主体包，游戏首发内容
     */
    // ★ 能力，在获得装备后获取相应能力
    @SerializedName("hasDash") private boolean hasDash;                     // 冲刺，获得蛾翼披风
    @SerializedName("hasWalljump") private boolean hasWalljump;             // 攀墙跳，获得螳螂爪
    @SerializedName("hasDoubleJump") private boolean hasDoubleJump;         // 二段跳，获得帝王之翼
    @SerializedName("hasSuperDash") private boolean hasSuperDash;           // 超冲，获得水晶之心
    @SerializedName("hasShadowDash") private boolean hasShadowDash;         // 黑冲，获得暗影披风
    @SerializedName("hasAcidArmour") private boolean hasAcidArmour;         // 酸泳，获得伊思玛的眼泪
    @SerializedName("hasCrystalHeart") private boolean hasKingsBrand;       // 进深渊，获得王之印记

    // ★ 法术
    @SerializedName("fireballLevel") private int fireballLevel;     // 0：未获得；1：复仇之魂，白波；2：暗影之魂，黑波
    @SerializedName("screamLevel") private int screamLevel;         // 0：未获得；1：嚎叫幽灵，白吼；2：深渊尖啸，黑吼
    @SerializedName("quakeLevel") private int quakeLevel;           // 0：未获得；1：荒芜俯冲，白砸；2：黑暗降临，黑砸

    // ★ 面具碎片 / 容器碎片  （仅能查看当前拥有的碎片数量）
    @SerializedName("heartPieces") private int heartPieces;
    @SerializedName("vesselFragments") private int vesselFragments;

    // ★ 护符，主体包共36个护符，后续更新内容包新增4个护符，共40个护符，5个可升级或变化的护符
    @SerializedName("charmsOwned") private int charmsOwned;

    // ★ 骨钉技艺
    @SerializedName("hasDashSlash") private boolean hasDashSlash;       // 强力劈砍，向骨钉大师席奥学习
    @SerializedName("hasCyclone") private boolean hasCyclone;           // 旋风劈砍，向骨钉大师马托学习
    @SerializedName("hasUpwardSlash") private boolean hasUpwardSlash;   // 冲刺劈砍，向骨钉大师奥罗学习

    // ★ 骨钉升级
    @SerializedName("nailSmithUpgrades") private int nailSmithUpgrades; // 骨钉共需升级4次

    // ★ 守梦者
    @SerializedName("lurienDefeated") private boolean lurienDefeated;   // 守望者卢瑞恩
    @SerializedName("monomonDefeated") private boolean monomonDefeated; // 教师莫诺蒙
    @SerializedName("hegemolDefeated") private boolean hegemolDefeated; // 野兽赫拉

    // ★ 梦之钉
    @SerializedName("hasDreamNail") private boolean hasDreamNail;           // 获得梦之钉
    @SerializedName("dreamNailUpgraded") private boolean dreamNailUpgraded; // 觉醒梦之钉，1800精华
    @SerializedName("mothDeparted") private boolean mothDeparted;           // 聆听先知的遗言，2400精华

    // Bosses【好难找。。】
    @SerializedName("killedFalseKnight") private boolean killedFalseKnight;                 // 假骑士
    @SerializedName("killedBigBuzzer") private boolean killedBigBuzzer;                     // 格鲁兹之母（这个名字好奇怪。。）
    @SerializedName("killedMawlek") private boolean killedMawlek;                           // 躁郁的毛里克
    @SerializedName("killedJarCollector") private boolean killedJarCollector;               // 收藏家
    @SerializedName("killedMantisLord") private boolean killedMantisLord;                   // 螳螂领主，三螳螂
    @SerializedName("killedTraitorLord") private boolean killedTraitorLord;                 // 叛徒领主
    @SerializedName("killedBlackKnight") private boolean killedBlackKnight;                 // 守望者骑士（不确定和守望者骑士团的关系，修改后会影响完成度，因此不确定完成度关注的是否是打完六喜丸子）
    @SerializedName("killedDungDefender") private boolean killedDungDefender;               // 粪虫防御者
    @SerializedName("hornet1Defeated") private boolean killedHornet;                        // 守护者大黄蜂，初见
    @SerializedName("hornetOutskirtsDefeated") private boolean hornetOutskirtsDefeated;     // 岗哨大黄蜂，再战

    // ★ 战士之梦
    @SerializedName("killedGhostAladar") private boolean killedGhostAladar;                 // 击败戈布（戈布曾以其支持者的名字命名为Aladar，游戏文件中也有时这样称呼他）
    @SerializedName("killedGhostXero") private boolean killedGhostXero;                     // 击败泽若
    @SerializedName("killedGhostHu") private boolean killedGhostHu;                         // 击败胡长老
    @SerializedName("killedGhostMarmu") private boolean killedGhostMarmu;                   // 击败马尔穆
    @SerializedName("killedGhostNoEyes") private boolean killedGhostNoEyes;                 // 击败无眼
    @SerializedName("killedGhostMarkoth") private boolean killedGhostMarkoth;               // 击败马科斯
    @SerializedName("killedGhostGalien") private boolean killedGhostGalien;                 // 击败加利安

    // ★ 愚人斗兽场
    @SerializedName("colosseumBronzeCompleted") private boolean colosseumBronzeCompleted;   // 勇士的试炼
    @SerializedName("colosseumSilverCompleted") private boolean colosseumSilverCompleted;   // 征服者的试炼
    @SerializedName("colosseumGoldCompleted") private boolean colosseumGoldCompleted;       // 愚人的试炼

    /**
     * 内容包，游戏后续更新新增内容
     */
    // ★ 格林剧团
    @SerializedName("killedGrimm") private boolean killedGrimm;                     // 击败格林团长
    @SerializedName("killedNightmareGrimm") private boolean killedNightmareGrimm;   // 击败梦魇之王格林

    // ★ 生命血（更新了蜂巢和蓝血）
    @SerializedName("killedHiveKnight") private boolean killedHiveKnight;   // 击败蜂巢骑士

    // ★ 神居
    @SerializedName("hasGodfinder") private boolean hasGodfinder;                       // 获取神明调谐器
    @SerializedName("bossDoorStateTier1") private BossDoorState bossDoorStateTier1;     // 大师万神殿，第一扇门连战
    @SerializedName("bossDoorStateTier2") private BossDoorState bossDoorStateTier2;     // 艺术家万神殿，第二扇门连战
    @SerializedName("bossDoorStateTier3") private BossDoorState bossDoorStateTier3;     // 贤者万神殿，第三扇门连战
    @SerializedName("bossDoorStateTier4") private BossDoorState bossDoorStateTier4;     // 骑士万神殿，第四扇门连战

    @Data
    public static class BossDoorState {
        @SerializedName("completed")
        private boolean completed;

        @SerializedName("unlocked")
        private boolean unlocked;
    }
}
