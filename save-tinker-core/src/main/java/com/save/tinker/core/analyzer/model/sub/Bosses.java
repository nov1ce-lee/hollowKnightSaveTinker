package com.save.tinker.core.analyzer.model.sub;

import com.save.tinker.core.analyzer.model.Abstract;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class Bosses extends Abstract {

    /*
     * Bosses，每个占有1%完成度，共14%
     */

    private boolean killedFalseKnight;                 // 假骑士
    private boolean killedBigFly;                      // 格鲁兹之母（这个名字好奇怪。。）
    private boolean killedMawlek;                      // 躁郁的毛里克
    private boolean killedJarCollector;                // 收藏家
    private boolean killedMantisLord;                  // 螳螂领主，三螳螂
    private boolean killedTraitorLord;                 // 叛徒领主
    private boolean killedMageLord;                    // 灵魂大师
    private boolean killedMegaJellyfish;               // 乌姆
    private boolean killedInfectedKnight;              // 残破容器
    private boolean killedMimicSpider;                 // 诺斯克（就你叫模仿者蛛mimic spider是吧）
    private boolean killedBlackKnight;                 // 守望者骑士
    private boolean killedDungDefender;                // 粪虫防御者
    private boolean hornet1Defeated;                   // 守护者大黄蜂，初见
    private boolean hornetOutskirtsDefeated;           // 岗哨大黄蜂，再战

    @Override
    public Map<String, Boolean> getMap() {
        Map<String, Boolean> bosses = new HashMap<>();
        bosses.put("killedFalseKnight", killedFalseKnight);
        bosses.put("killedBigFly", killedBigFly);
        bosses.put("killedMawlek", killedMawlek);
        bosses.put("killedJarCollector", killedJarCollector);
        bosses.put("killedMantisLord", killedMantisLord);
        bosses.put("killedTraitorLord", killedTraitorLord);
        bosses.put("killedMageLord", killedMageLord);
        bosses.put("killedMegaJellyfish", killedMegaJellyfish);
        bosses.put("killedInfectedKnight", killedInfectedKnight);
        bosses.put("killedMimicSpider", killedMimicSpider);
        bosses.put("killedBlackKnight", killedBlackKnight);
        bosses.put("killedDungDefender", killedDungDefender);
        bosses.put("hornet1Defeated", hornet1Defeated);
        bosses.put("hornetOutskirtsDefeated", hornetOutskirtsDefeated);
        return bosses;
    }

    @Override
    public String getName(String key) {
        switch (key) {
            case "killedFalseKnight":
                return "假骑士";
            case "killedBigFly":
                return "格鲁兹之母";
            case "killedMawlek":
                return "躁郁的毛里克";
            case "killedJarCollector":
                return "收藏家";
            case "killedMantisLord":
                return "螳螂领主";
            case "killedTraitorLord":
                return "叛徒领主";
            case "killedMageLord":
                return "灵魂大师";
            case "killedMegaJellyfish":
                return "乌姆";
            case "killedInfectedKnight":
                return "残破容器";
            case "killedMimicSpider":
                return "诺斯克";
            case "killedBlackKnight":
                return "守望者骑士";
            case "killedDungDefender":
                return "粪虫防御者";
            case "hornet1Defeated":
                return "守护者大黄蜂";
            case "hornetOutskirtsDefeated":
                return "岗哨大黄蜂";
            default:
                return "";
        }
    }
}
