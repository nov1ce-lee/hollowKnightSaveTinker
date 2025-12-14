package com.save.tinker.core.analyzer.model.sub;

import com.save.tinker.core.analyzer.model.Abstract;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class NailArts extends Abstract {

    /*
     * 骨钉技艺，每个占有1%完成度，共3%
     */

    private boolean hasDashSlash;           // 强力劈砍，向骨钉大师席奥学习
    private boolean hasCyclone;             // 旋风劈砍，向骨钉大师马托学习
    private boolean hasUpwardSlash;         // 冲刺劈砍，向骨钉大师奥罗学习

    @Override
    public Map<String, Boolean> getMap() {
        Map<String, Boolean> map = new HashMap<>();
        map.put("hasDashSlash", hasDashSlash);
        map.put("hasCyclone", hasCyclone);
        map.put("hasUpwardSlash", hasUpwardSlash);
        return Collections.unmodifiableMap(map);
    }

    @Override
    public String getName(String key) {
        switch (key) {
            case "hasDashSlash":
                return "强力劈砍";
            case "hasCyclone":
                return "旋风劈砍";
            case "hasUpwardSlash":
                return "冲刺劈砍";
            default:
                return "";
        }
    }

    @Override
    public int getValue() {
        return 1;
    }
}
