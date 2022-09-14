package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
enum i0 {
    Normal("normal"),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");
    
    private static final Map<String, i0> p = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final String f9616b;

    static {
        i0[] values;
        for (i0 i0Var : values()) {
            p.put(i0Var.f9616b, i0Var);
        }
    }

    i0(String str) {
        this.f9616b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i0 a(String str) {
        return p.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(String str) {
        return p.containsKey(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f9616b;
    }
}
