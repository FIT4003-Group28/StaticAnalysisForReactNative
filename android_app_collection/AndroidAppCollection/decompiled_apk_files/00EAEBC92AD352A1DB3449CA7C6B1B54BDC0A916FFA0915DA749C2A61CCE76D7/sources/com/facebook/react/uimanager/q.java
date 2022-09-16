package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;
/* loaded from: classes.dex */
public class q {
    public static float a(double d2) {
        return b((float) d2);
    }

    public static float a(float f2) {
        return f2 / c.b().density;
    }

    public static float a(float f2, float f3) {
        DisplayMetrics b2 = c.b();
        float f4 = b2.scaledDensity;
        float f5 = b2.density;
        float f6 = f4 / f5;
        if (f3 >= 1.0f && f3 < f6) {
            f4 = f5 * f3;
        }
        return f2 * f4;
    }

    public static float b(float f2) {
        return TypedValue.applyDimension(1, f2, c.b());
    }

    public static float c(float f2) {
        return a(f2, Float.NaN);
    }

    public static float d(float f2) {
        return f2 / c.a().scaledDensity;
    }
}
