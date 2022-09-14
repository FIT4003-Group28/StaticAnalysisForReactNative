package com.facebook.react.uimanager;

import android.util.TypedValue;
/* compiled from: PixelUtil.java */
/* loaded from: classes.dex */
public class o {
    public static float a(float f) {
        return TypedValue.applyDimension(1, f, b.a());
    }

    public static float a(double d2) {
        return a((float) d2);
    }

    public static float b(float f) {
        return TypedValue.applyDimension(2, f, b.a());
    }

    public static float c(float f) {
        return f / b.a().density;
    }
}
