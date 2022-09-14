package com.facebook.yoga;
/* loaded from: classes.dex */
public class o {
    public static long a(float f2, float f3) {
        int floatToRawIntBits = Float.floatToRawIntBits(f2);
        return Float.floatToRawIntBits(f3) | (floatToRawIntBits << 32);
    }

    public static long a(int i, int i2) {
        return a(i, i2);
    }
}
