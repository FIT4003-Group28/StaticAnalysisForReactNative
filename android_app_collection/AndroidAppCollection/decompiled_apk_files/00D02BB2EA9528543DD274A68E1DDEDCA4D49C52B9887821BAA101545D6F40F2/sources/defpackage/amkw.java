package defpackage;

import android.graphics.Color;
import android.graphics.Typeface;
/* compiled from: PG */
/* renamed from: amkw  reason: default package */
/* loaded from: classes.dex */
public final class amkw {
    public static int a(alxo alxoVar) {
        if (alxoVar.b()) {
            return alxoVar.q.b();
        }
        int d = d(alxoVar);
        return (((((((d >>> 16) & 255) * 77) + (((d >>> 8) & 255) * 151)) + ((d & 255) * 28)) >> 8) >= 192 ? 8421504 : 16777215) | ((((d >>> 24) * 160) / 255) << 24);
    }

    public static float b(alxo alxoVar) {
        alyf alyfVar = alxoVar.q;
        float d = alyfVar != null ? alyfVar.d() : 2.8f;
        if (Color.alpha(a(alxoVar)) == 0) {
            return 0.0f;
        }
        return d;
    }

    public static float c(int i, amky amkyVar, float f) {
        return Math.max(amkyVar.b, Math.min(amkyVar.c, i * amkyVar.d)) * f;
    }

    public static int d(alxo alxoVar) {
        int a = alxoVar.b() ? alxoVar.q.a() : -9541545;
        if (a == 0) {
            return -9541545;
        }
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface e(int i) {
        int i2;
        Typeface typeface = null;
        if (i > 0) {
            boolean m = alyf.m(i);
            i2 = m;
            if (alyf.n(i)) {
                i2 = (m ? 1 : 0) | 2;
            }
            if (alyf.q(i)) {
                typeface = Typeface.create("sans-serif-condensed", i2);
            } else if (alyf.o(i)) {
                typeface = Typeface.create("sans-serif-light", i2);
            } else if (alyf.p(i)) {
                try {
                    int i3 = i2 == 1 ? 1 : 0;
                    int i4 = i2 == 1 ? 1 : 0;
                    int i5 = i2 == 1 ? 1 : 0;
                    typeface = Typeface.create("sans-serif-medium", i3);
                } catch (Exception unused) {
                }
                if (typeface == null) {
                    int i6 = i2 == 1 ? 1 : 0;
                    boolean z = i2 == 1 ? 1 : 0;
                    boolean z2 = i2 == 1 ? 1 : 0;
                    boolean z3 = i2 == 1 ? 1 : 0;
                    i2 = i6 | 1;
                }
            }
        } else {
            i2 = 0;
        }
        if (typeface == null) {
            int i7 = i2 == 1 ? 1 : 0;
            int i8 = i2 == 1 ? 1 : 0;
            return Typeface.defaultFromStyle(i7);
        }
        return typeface;
    }
}
