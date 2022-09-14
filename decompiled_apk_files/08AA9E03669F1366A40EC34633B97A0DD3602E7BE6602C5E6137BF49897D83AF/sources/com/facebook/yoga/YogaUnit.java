package com.facebook.yoga;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public enum YogaUnit {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    
    private int e;

    YogaUnit(int i) {
        this.e = i;
    }

    public int a() {
        return this.e;
    }

    public static YogaUnit a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return POINT;
            case 2:
                return PERCENT;
            case 3:
                return AUTO;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
