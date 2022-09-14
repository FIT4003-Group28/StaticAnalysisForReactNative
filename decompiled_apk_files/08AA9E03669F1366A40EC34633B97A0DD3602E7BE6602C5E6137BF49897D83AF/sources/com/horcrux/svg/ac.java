package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;
/* compiled from: TextDecoration.java */
/* loaded from: classes.dex */
enum ac {
    None("none"),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");
    
    private static final Map<String, ac> g;
    private final String f;

    static {
        ac[] values;
        HashMap hashMap = new HashMap();
        for (ac acVar : values()) {
            hashMap.put(acVar.f, acVar);
        }
        g = com.facebook.common.d.f.a(hashMap);
    }

    ac(String str) {
        this.f = str;
    }

    public static ac a(String str) {
        if (!g.containsKey(str)) {
            throw new IllegalArgumentException("Unknown String Value: " + str);
        }
        return g.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f;
    }
}
