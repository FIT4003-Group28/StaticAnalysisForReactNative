package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;
/* compiled from: FontWeight.java */
/* loaded from: classes.dex */
enum l {
    Normal("normal"),
    Bold("bold"),
    Bolder("bolder"),
    Lighter("lighter"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900");
    
    private static final Map<String, l> o;
    private final String n;

    static {
        l[] values;
        HashMap hashMap = new HashMap();
        for (l lVar : values()) {
            hashMap.put(lVar.n, lVar);
        }
        o = com.facebook.common.d.f.a(hashMap);
    }

    l(String str) {
        this.n = str;
    }

    public static l a(String str) {
        if (!o.containsKey(str)) {
            throw new IllegalArgumentException("Unknown String Value: " + str);
        }
        return o.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.n;
    }
}
