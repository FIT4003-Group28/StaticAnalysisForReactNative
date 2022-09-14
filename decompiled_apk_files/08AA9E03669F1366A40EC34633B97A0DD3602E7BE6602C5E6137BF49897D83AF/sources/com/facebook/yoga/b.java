package com.facebook.yoga;
/* compiled from: YogaMeasureOutput.java */
/* loaded from: classes.dex */
public class b {
    public static long a(float f, float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        return Float.floatToRawIntBits(f2) | (floatToRawIntBits << 32);
    }

    public static long a(int i, int i2) {
        return a(i, i2);
    }
}
