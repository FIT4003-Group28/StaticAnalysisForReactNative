package defpackage;

import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: eia  reason: default package */
/* loaded from: classes.dex */
public final class eia implements Interpolator {
    public static final eia a = new eia(0.01d);
    private final double b;
    private final double c;

    public eia(double d) {
        boolean z = false;
        if (d > dcyn.a && d < 1.0d) {
            z = true;
        }
        dbsk.g(z, "The exponent should be greater than 0 and less than 1, but %s was given.", Double.valueOf(d));
        this.b = d;
        this.c = 1.0d - d;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((1.0d - Math.pow(this.b, f)) / this.c);
    }
}
