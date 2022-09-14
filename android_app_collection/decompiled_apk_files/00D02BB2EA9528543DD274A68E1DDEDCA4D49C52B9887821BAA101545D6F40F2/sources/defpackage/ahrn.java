package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: ahrn  reason: default package */
/* loaded from: classes.dex */
public final class ahrn {
    public float a;
    public float b;
    public float c;
    public float d;

    public ahrn() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 1.0f;
    }

    public ahrn(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final void a(float[] fArr) {
        float f = this.a;
        float f2 = f + f;
        float f3 = this.b;
        float f4 = f3 + f3;
        float f5 = this.c;
        float f6 = f5 + f5;
        float f7 = this.d;
        float f8 = f7 * f2;
        float f9 = f7 * f4;
        float f10 = f7 * f6;
        float f11 = f2 * f;
        float f12 = f * f4;
        float f13 = f * f6;
        float f14 = f4 * f3;
        float f15 = f3 * f6;
        float f16 = f5 * f6;
        fArr[0] = 1.0f - (f14 + f16);
        fArr[1] = f12 - f10;
        fArr[2] = f13 + f9;
        fArr[3] = f12 + f10;
        fArr[4] = 1.0f - (f16 + f11);
        fArr[5] = f15 - f8;
        fArr[6] = f13 - f9;
        fArr[7] = f15 + f8;
        fArr[8] = 1.0f - (f11 + f14);
    }

    public final float b(ahrn ahrnVar) {
        return (this.a * ahrnVar.a) + (this.b * ahrnVar.b) + (this.c * ahrnVar.c) + (this.d * ahrnVar.d);
    }

    public final void c(ahrn ahrnVar) {
        this.a = -ahrnVar.a;
        this.b = -ahrnVar.b;
        this.c = -ahrnVar.c;
        this.d = ahrnVar.d;
    }

    public final void d(float f, float f2, float f3) {
        while (f3 > 3.141592653589793d) {
            f3 -= 6.2831855f;
        }
        while (f3 <= -3.141592653589793d) {
            f3 += 6.2831855f;
        }
        double d = f3 / 2.0f;
        float sin = (float) Math.sin(d);
        this.a = f * sin;
        this.b = f2 * sin;
        this.c = sin * 0.0f;
        this.d = (float) Math.cos(d);
    }

    public final void e(float[] fArr, float f) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float sqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4));
        float f5 = f * sqrt;
        float sin = ((double) sqrt) > 1.0E-10d ? ((float) Math.sin(f5 / 2.0f)) / sqrt : 0.0f;
        this.a = f2 * sin;
        this.b = f3 * sin;
        this.c = f4 * sin;
        this.d = (float) Math.cos(f5 / 2.0f);
    }

    public final void f(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[4];
        float f3 = fArr[8];
        float f4 = f + f2 + f3;
        if (f4 > 1.0E-6f) {
            double sqrt = Math.sqrt(f4 + 1.0f);
            float f5 = (float) (sqrt + sqrt);
            this.d = 0.25f * f5;
            this.a = (fArr[7] - fArr[5]) / f5;
            this.b = (fArr[2] - fArr[6]) / f5;
            this.c = (fArr[3] - fArr[1]) / f5;
        } else if (f > f2 && f > f3) {
            double sqrt2 = Math.sqrt(((f + 1.0f) - f2) - f3);
            float f6 = (float) (sqrt2 + sqrt2);
            this.d = (fArr[7] - fArr[5]) / f6;
            this.a = 0.25f * f6;
            this.b = (fArr[3] + fArr[1]) / f6;
            this.c = (fArr[2] + fArr[6]) / f6;
        } else if (f2 > f3) {
            double sqrt3 = Math.sqrt(((f2 + 1.0f) - f) - f3);
            float f7 = (float) (sqrt3 + sqrt3);
            this.d = (fArr[2] - fArr[6]) / f7;
            this.a = (fArr[3] + fArr[1]) / f7;
            this.b = 0.25f * f7;
            this.c = (fArr[7] + fArr[5]) / f7;
        } else {
            double sqrt4 = Math.sqrt(((f3 + 1.0f) - f) - f2);
            float f8 = (float) (sqrt4 + sqrt4);
            this.d = (fArr[3] - fArr[1]) / f8;
            this.a = (fArr[2] + fArr[6]) / f8;
            this.b = (fArr[7] + fArr[5]) / f8;
            this.c = f8 * 0.25f;
        }
    }

    public final void g(ahrn ahrnVar, ahrn ahrnVar2) {
        float f = ahrnVar.d;
        float f2 = ahrnVar2.a;
        float f3 = ahrnVar.a;
        float f4 = ahrnVar2.d;
        float f5 = ahrnVar.b;
        float f6 = ahrnVar2.c;
        float f7 = ahrnVar.c;
        float f8 = ahrnVar2.b;
        this.a = (((f * f2) + (f3 * f4)) + (f5 * f6)) - (f7 * f8);
        this.b = ((f * f8) - (f3 * f6)) + (f5 * f4) + (f7 * f2);
        this.c = (((f * f6) + (f3 * f8)) - (f5 * f2)) + (f7 * f4);
        this.d = (((f * f4) - (f3 * f2)) - (f5 * f8)) - (f7 * f6);
    }

    public final void h(ahrn ahrnVar, ahrn ahrnVar2) {
        float f = ahrnVar.d;
        float f2 = -ahrnVar2.a;
        float f3 = ahrnVar.a;
        float f4 = ahrnVar2.d;
        float f5 = ahrnVar.b;
        float f6 = -ahrnVar2.c;
        float f7 = ahrnVar.c;
        float f8 = -ahrnVar2.b;
        this.a = (((f * f2) + (f3 * f4)) + (f5 * f6)) - (f7 * f8);
        this.b = ((f * f8) - (f3 * f6)) + (f5 * f4) + (f7 * f2);
        this.c = (((f * f6) + (f3 * f8)) - (f5 * f2)) + (f7 * f4);
        this.d = (((f * f4) - (f3 * f2)) - (f5 * f8)) - (f7 * f6);
    }

    public final void i(ahrn ahrnVar) {
        float b = ahrnVar.b(ahrnVar);
        float sqrt = Math.abs(1.0f - b) < 2.0E-4f ? (b + 1.0f) / 2.0f : (float) Math.sqrt(b);
        if (sqrt != 0.0f) {
            float f = 1.0f / sqrt;
            this.a = ahrnVar.a * f;
            this.b = ahrnVar.b * f;
            this.c = ahrnVar.c * f;
            this.d = ahrnVar.d * f;
            return;
        }
        l(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public final void j() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 1.0f;
    }

    public final void k(ahrn ahrnVar, ahrn ahrnVar2) {
        g(ahrnVar2, ahrnVar);
        h(this, ahrnVar2);
    }

    public final void l(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final void m(ahrn ahrnVar) {
        this.a = ahrnVar.a;
        this.b = ahrnVar.b;
        this.c = ahrnVar.c;
        this.d = ahrnVar.d;
    }

    public final void n(ahrn ahrnVar, ahrn ahrnVar2, float f) {
        double d;
        h(ahrnVar, ahrnVar2);
        float f2 = 1.0f - f;
        float f3 = this.d;
        double acos = (f3 > 1.0f || f3 < -1.0f) ? 0.0d : Math.acos(f3);
        double sin = Math.sin(acos);
        if (sin != dcyn.a) {
            double d2 = f2;
            Double.isNaN(d2);
            d = Math.sin(d2 * acos) / sin;
        } else {
            d = 1.0d;
        }
        double d3 = this.a;
        Double.isNaN(d3);
        this.a = (float) (d3 * d);
        double d4 = this.b;
        Double.isNaN(d4);
        this.b = (float) (d4 * d);
        double d5 = this.c;
        Double.isNaN(d5);
        this.c = (float) (d5 * d);
        double d6 = f2;
        Double.isNaN(d6);
        this.d = (float) Math.cos(d6 * acos);
        g(this, ahrnVar2);
    }

    public final String toString() {
        return String.format(Locale.US, "[%f, %f, %f, %f]", Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d));
    }
}
