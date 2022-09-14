package com.facebook.yoga;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);
    

    /* renamed from: d  reason: collision with root package name */
    private int f4231d;

    YogaDirection(int i) {
        this.f4231d = i;
    }

    public int a() {
        return this.f4231d;
    }

    public static YogaDirection a(int i) {
        switch (i) {
            case 0:
                return INHERIT;
            case 1:
                return LTR;
            case 2:
                return RTL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
