package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
enum f0 {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom("bottom"),
    center("center"),
    top("top"),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");
    
    private static final Map<String, f0> s = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final String f9583b;

    static {
        f0[] values;
        for (f0 f0Var : values()) {
            s.put(f0Var.f9583b, f0Var);
        }
    }

    f0(String str) {
        this.f9583b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f0 a(String str) {
        if (s.containsKey(str)) {
            return s.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f9583b;
    }
}
