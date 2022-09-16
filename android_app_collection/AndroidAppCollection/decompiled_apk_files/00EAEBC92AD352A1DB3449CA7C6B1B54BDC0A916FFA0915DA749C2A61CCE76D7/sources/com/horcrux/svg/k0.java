package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
enum k0 {
    None("none"),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");
    

    /* renamed from: h  reason: collision with root package name */
    private static final Map<String, k0> f9637h = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final String f9638b;

    static {
        k0[] values;
        for (k0 k0Var : values()) {
            f9637h.put(k0Var.f9638b, k0Var);
        }
    }

    k0(String str) {
        this.f9638b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k0 a(String str) {
        if (f9637h.containsKey(str)) {
            return f9637h.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f9638b;
    }
}
