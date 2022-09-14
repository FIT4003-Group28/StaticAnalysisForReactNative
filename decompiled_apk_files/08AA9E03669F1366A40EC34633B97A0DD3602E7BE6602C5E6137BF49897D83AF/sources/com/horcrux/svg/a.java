package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;
/* compiled from: AlignmentBaseline.java */
/* loaded from: classes.dex */
enum a {
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
    
    private static final Map<String, a> r;
    private final String q;

    static {
        a[] values;
        HashMap hashMap = new HashMap();
        for (a aVar : values()) {
            hashMap.put(aVar.q, aVar);
        }
        r = com.facebook.common.d.f.a(hashMap);
    }

    a(String str) {
        this.q = str;
    }

    public static a a(String str) {
        if (!r.containsKey(str)) {
            throw new IllegalArgumentException("Unknown String Value: " + str);
        }
        return r.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.q;
    }
}
