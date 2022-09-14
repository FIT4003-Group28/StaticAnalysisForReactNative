package com.facebook.yoga;
/* loaded from: classes.dex */
public enum h {
    INHERIT(0),
    LTR(1),
    RTL(2);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f6530b;

    h(int i) {
        this.f6530b = i;
    }

    public static h a(int i) {
        if (i != 0) {
            if (i == 1) {
                return LTR;
            }
            if (i == 2) {
                return RTL;
            }
            throw new IllegalArgumentException("Unknown enum value: " + i);
        }
        return INHERIT;
    }

    public int a() {
        return this.f6530b;
    }
}
