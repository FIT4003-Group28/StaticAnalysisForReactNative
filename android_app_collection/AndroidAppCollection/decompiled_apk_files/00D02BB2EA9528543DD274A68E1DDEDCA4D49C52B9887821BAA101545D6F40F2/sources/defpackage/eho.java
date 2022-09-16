package defpackage;

import android.view.animation.Interpolator;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: eho  reason: default package */
/* loaded from: classes.dex */
public final class eho implements Interpolator {
    public final float[] a = new float[25];
    private final akqa b;
    private final akqa c;

    public eho(float f, float f2, float f3, float f4) {
        this.b = new akqa(dcyn.a, f, f3, 1.0d);
        this.c = new akqa(dcyn.a, f2, f4, 1.0d);
        for (int i = 0; i < 25; i++) {
            this.a[i] = b(i / 24.0f, 10, false);
        }
    }

    public static Interpolator a(float f, float f2, float f3, float f4) {
        try {
            Interpolator interpolator = (Interpolator) Class.forName("android.view.animation.PathInterpolator").getConstructor(Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE).newInstance(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
            return interpolator != null ? interpolator : new eho(f, f2, f3, f4);
        } catch (Throwable unused) {
            return new eho(f, f2, f3, f4);
        }
    }

    private final float b(float f, int i, boolean z) {
        int i2 = (int) (24.0f * f);
        float f2 = z ? this.a[i2] : f;
        float f3 = 1.0f;
        if (z && i2 < 24) {
            f3 = this.a[i2 + 1];
        }
        for (int i3 = 0; i3 < i; i3++) {
            double d = f2;
            float d2 = ((float) this.b.d(d)) - f;
            if (Math.abs(d2) <= 1.0E-4f) {
                return f2;
            }
            float f4 = (float) this.b.f(d);
            f2 = f4 != 0.0f ? f2 - (d2 / f4) : f2 + ((f3 - f2) / 2.0f);
        }
        return f2;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eho)) {
            return false;
        }
        eho ehoVar = (eho) obj;
        return this.b.equals(ehoVar.b) && this.c.equals(ehoVar.c);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.c.d(b(f, 3, true));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }
}
