package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* compiled from: PG */
/* renamed from: czum  reason: default package */
/* loaded from: classes5.dex */
public final class czum {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new aoo();
    public static final TimeInterpolator c = new aon();
    public static final TimeInterpolator d = new aop();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int b(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}