package com.save.tinker.core.analyzer.model.sub;

import lombok.Data;

@Data
public class GodHome {
    private boolean hasGodfinder;                 // 获取神明调谐器
    private BossDoorState bossDoorStateTier1;     // 大师万神殿，第一扇门连战
    private BossDoorState bossDoorStateTier2;     // 艺术家万神殿，第二扇门连战
    private BossDoorState bossDoorStateTier3;     // 贤者万神殿，第三扇门连战
    private BossDoorState bossDoorStateTier4;     // 骑士万神殿，第四扇门连战

    @Data
    public static class BossDoorState {
        private boolean completed;
        private boolean unlocked;
    }
}
