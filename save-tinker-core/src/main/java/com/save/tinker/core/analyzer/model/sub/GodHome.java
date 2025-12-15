package com.save.tinker.core.analyzer.model.sub;

import com.save.tinker.core.analyzer.model.Abstract;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class GodHome extends Abstract {

    /*
     * 神居，每个占有1%完成度，共5%
     */

    private boolean hasGodfinder;                 // 获取神明调谐器
    private BossDoorState bossDoorStateTier1;     // 大师万神殿，第一扇门连战
    private BossDoorState bossDoorStateTier2;     // 艺术家万神殿，第二扇门连战
    private BossDoorState bossDoorStateTier3;     // 贤者万神殿，第三扇门连战
    private BossDoorState bossDoorStateTier4;     // 骑士万神殿，第四扇门连战

    @Override
    public Map<String, Boolean> getMap() {
        Map<String, Boolean> map = new HashMap<>();
        map.put("hasGodfinder", hasGodfinder);
        map.put("bossDoorStateTier1", bossDoorStateTier1.isCompleted());
        map.put("bossDoorStateTier2", bossDoorStateTier2.isCompleted());
        map.put("bossDoorStateTier3", bossDoorStateTier3.isCompleted());
        map.put("bossDoorStateTier4", bossDoorStateTier4.isCompleted());
        return map;
    }

    @Override
    public String getName(String key) {
        switch (key) {
            case "hasGodfinder":
                return "神明调谐器";
            case "bossDoorStateTier1":
                return "大师万神殿";
            case "bossDoorStateTier2":
                return "艺术家万神殿";
            case "bossDoorStateTier3":
                return "贤者万神殿";
            case "bossDoorStateTier4":
                return "骑士万神殿";
            default:
                return "";
        }
    }

    @Override
    public int getValue() {
        return 1;
    }

    @Data
    public static class BossDoorState {
        private boolean completed;
        private boolean unlocked;
    }
}
