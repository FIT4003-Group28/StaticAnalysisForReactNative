package defpackage;

import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: cslz  reason: default package */
/* loaded from: classes5.dex */
final class cslz implements Interpolator {
    final /* synthetic */ Interpolator a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;

    public cslz(Interpolator interpolator, float f, float f2) {
        this.a = interpolator;
        this.b = f;
        this.c = f2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float interpolation = this.a.getInterpolation(f);
        float f2 = this.b;
        return csmm.b((interpolation * f2) / (f2 - this.c));
    }
}
