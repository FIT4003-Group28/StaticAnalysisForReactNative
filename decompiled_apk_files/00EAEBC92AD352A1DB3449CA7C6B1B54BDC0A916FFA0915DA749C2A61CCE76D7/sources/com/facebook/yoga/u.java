package com.facebook.yoga;
/* loaded from: classes.dex */
public enum u {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f6573b;

    u(int i) {
        this.f6573b = i;
    }

    public static u a(int i) {
        if (i != 0) {
            if (i == 1) {
                return POINT;
            }
            if (i == 2) {
                return PERCENT;
            }
            if (i == 3) {
                return AUTO;
            }
            throw new IllegalArgumentException("Unknown enum value: " + i);
        }
        return UNDEFINED;
    }

    public int a() {
        return this.f6573b;
    }
}
