package defpackage;

import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: bcaa  reason: default package */
/* loaded from: classes3.dex */
final class bcaa implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = 10.0f * f;
        double pow = Math.pow(0.009999999776482582d, f * 8.0f);
        double d = f2 + f2;
        Double.isNaN(d);
        return (float) ((pow * (-Math.cos(d * 3.141592653589793d))) + 1.0d);
    }
}
