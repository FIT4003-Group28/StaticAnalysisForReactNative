package com.facebook.yoga;
/* loaded from: classes.dex */
public enum n {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    n(int i) {
    }

    public static n a(int i) {
        if (i != 0) {
            if (i == 1) {
                return EXACTLY;
            }
            if (i == 2) {
                return AT_MOST;
            }
            throw new IllegalArgumentException("Unknown enum value: " + i);
        }
        return UNDEFINED;
    }
}
