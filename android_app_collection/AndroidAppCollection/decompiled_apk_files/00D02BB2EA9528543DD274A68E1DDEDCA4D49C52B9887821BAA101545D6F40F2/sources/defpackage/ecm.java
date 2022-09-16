package defpackage;

import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: ecm  reason: default package */
/* loaded from: classes6.dex */
final class ecm implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double d = f * 3.0f;
        Double.isNaN(d);
        return (float) (((-Math.pow(0.029999999329447746d, f)) * Math.cos(d * 3.141592653589793d)) + 1.0d);
    }
}
