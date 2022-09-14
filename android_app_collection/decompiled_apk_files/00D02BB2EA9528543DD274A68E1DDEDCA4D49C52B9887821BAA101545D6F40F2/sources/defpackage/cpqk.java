package defpackage;

import android.content.Context;
import android.util.TypedValue;
/* compiled from: PG */
/* renamed from: cpqk  reason: default package */
/* loaded from: classes5.dex */
public final class cpqk {
    private static float a = 1.0f;
    private static float b = 1.0f;

    public static float a(Context context, float f) {
        if (context != null) {
            a = TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        }
        return a * f;
    }

    public static float b(Context context, float f) {
        if (context != null) {
            b = TypedValue.applyDimension(2, 1.0f, context.getResources().getDisplayMetrics());
        }
        return b * f;
    }

    public static boolean c(float f, float f2, float f3) {
        return f >= Math.min(f2, f3) + 0.0f && f <= Math.max(f2, f3) + 0.0f;
    }

    public static int d(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static float e(float f, float f2, float f3) {
        return f2 - ((f2 - f) * (1.0f - f3));
    }
}
