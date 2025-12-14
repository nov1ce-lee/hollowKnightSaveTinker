package com.save.tinker.core.analyzer.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public abstract class Abstract {
    public abstract Map<String, Boolean> getMap();

    public abstract String getName(String key);

    public abstract int getValue();

    public List<String> getTrueList() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : getMap().entrySet()) {
            if (entry.getValue()) {
                list.add(getName(entry.getKey()));
            }
        }
        return list;
    }

    public List<String> getFalseList() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : getMap().entrySet()) {
            if (!entry.getValue()) {
                list.add(getName(entry.getKey()));
            }
        }
        return list;
    }

    public int getCompletedCount() {
        return getTrueList().size() * getValue();
    }
}
