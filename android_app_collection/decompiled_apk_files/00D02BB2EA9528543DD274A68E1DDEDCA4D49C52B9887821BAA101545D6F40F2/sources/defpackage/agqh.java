package defpackage;

import android.animation.TimeInterpolator;
/* renamed from: agqh  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class agqh implements TimeInterpolator {
    static final TimeInterpolator a = new agqh();

    private agqh() {
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = (-0.5f) + f;
        double d = 1.0f - ((f2 * f2) * 4.0f);
        double d2 = f;
        Double.isNaN(d2);
        double sin = Math.sin(d2 * 6.283185307179586d * 3.0d);
        Double.isNaN(d);
        return (float) (d * sin);
    }
}
