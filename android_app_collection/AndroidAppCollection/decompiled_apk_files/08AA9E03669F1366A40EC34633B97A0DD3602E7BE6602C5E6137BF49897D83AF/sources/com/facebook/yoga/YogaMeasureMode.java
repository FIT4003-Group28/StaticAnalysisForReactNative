package com.facebook.yoga;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public enum YogaMeasureMode {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);
    

    /* renamed from: d  reason: collision with root package name */
    private int f4258d;

    YogaMeasureMode(int i) {
        this.f4258d = i;
    }

    public static YogaMeasureMode a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return EXACTLY;
            case 2:
                return AT_MOST;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }
}
