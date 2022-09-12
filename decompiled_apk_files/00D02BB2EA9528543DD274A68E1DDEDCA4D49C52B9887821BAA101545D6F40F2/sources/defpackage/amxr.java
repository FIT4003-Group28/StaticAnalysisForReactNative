package defpackage;

import android.opengl.Matrix;
/* compiled from: PG */
/* renamed from: amxr  reason: default package */
/* loaded from: classes2.dex */
public class amxr {
    @dzsi
    public final akqk a;
    public final amkz b;
    protected final akzh c;
    public final akra d;
    public final float[] e;
    public final float f;
    public final float[] g;
    public final amla i;
    private final bnvr j = new bnvr();
    private final bnvs k = new bnvs();
    private final bnvs l = new bnvs();
    private final akra m = new akra();
    public final float[] h = new float[6];

    public amxr(akra akraVar, float f, akzh akzhVar) {
        float[] fArr = new float[2];
        this.e = fArr;
        float[] fArr2 = new float[8];
        this.g = fArr2;
        akqk.a(new akra(0, 0), new akra(0, 0), new akra(0, 0), new akra(0, 0));
        this.i = new amla();
        if (!akyx.o(akzhVar, akraVar, fArr2)) {
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
        }
        fArr[0] = fArr2[0];
        float f2 = fArr2[1];
        fArr[1] = f2;
        float f3 = fArr[0];
        float f4 = f3 - f;
        float f5 = f3 + f;
        float f6 = f2 - f;
        float f7 = f2 + f;
        this.a = akyx.t(akzhVar, f4, f5, f6, f7, fArr2);
        this.b = new amkz(f4, f6, f5, f7);
        this.d = akraVar;
        this.c = akzhVar;
        this.f = f;
    }

    private static boolean c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f8 + (f / 2.0f);
        float f10 = f9 * f9;
        float f11 = f4 - f2;
        float f12 = f5 - f3;
        float f13 = (((f6 - f2) * f11) + ((f7 - f3) * f12)) / ((f11 * f11) + (f12 * f12));
        if (f13 > 0.0f && !Float.isNaN(f13)) {
            if (f13 >= 1.0f) {
                f2 = f4;
                f3 = f5;
            } else {
                f2 += f11 * f13;
                f3 += f13 * f12;
            }
        }
        float f14 = f6 - f2;
        float f15 = f7 - f3;
        return (f14 * f14) + (f15 * f15) <= f10;
    }

    public final boolean a(float f, float f2, double d, float f3, float f4) {
        this.i.h(f, f2, d, f3 / 2.0f, f4 / 2.0f);
        return this.i.g(this.b);
    }

    public final boolean b(float[] fArr, boolean z, float f, bnvr bnvrVar, float f2) {
        double d;
        bnvr bnvrVar2 = this.j;
        if (bnvrVar2 != bnvrVar) {
            bnvrVar2.f(bnvrVar);
            if (this.j.b) {
                this.m.aa(this.d);
            } else {
                bnvs bnvsVar = this.k;
                akra akraVar = this.d;
                bnvsVar.a(akraVar.a, akraVar.b, 1.0f);
                bnvr bnvrVar3 = this.j;
                bnvs bnvsVar2 = this.l;
                float[] fArr2 = this.k.a;
                fArr2[3] = 1.0f;
                Matrix.multiplyMV(bnvsVar2.a, 0, bnvrVar3.a, 0, fArr2, 0);
                this.m.t((int) this.l.e(), (int) this.l.f());
            }
        }
        if (z) {
            akzh akzhVar = this.c;
            akra akraVar2 = this.m;
            float[] fArr3 = this.g;
            fArr3[0] = akraVar2.a;
            fArr3[1] = akraVar2.b;
            float[] v = akzhVar.v();
            fArr3[4] = (v[0] * fArr3[0]) + (v[4] * fArr3[1]);
            fArr3[5] = (v[1] * fArr3[0]) + (v[5] * fArr3[1]);
            float f3 = v[11] + v[15];
            fArr3[7] = f3;
            if (f3 <= 0.0f) {
                fArr3[0] = Float.NaN;
                fArr3[1] = Float.NaN;
                return false;
            }
            float f4 = 1.0f / f3;
            fArr3[0] = fArr3[4] * f4;
            fArr3[1] = fArr3[5] * f4;
        } else if (!akyx.o(this.c, this.m, this.g)) {
            return false;
        }
        float[] fArr4 = this.g;
        float f5 = fArr4[0];
        float f6 = fArr4[1];
        float f7 = 0.5f * f;
        if (f5 < (dece.a(fArr[0], fArr[2], fArr[4]) - f2) - f7 || f5 > dece.b(fArr[0], fArr[2], fArr[4]) + f2 + f7 || f6 < (dece.a(fArr[1], fArr[3], fArr[5]) - f2) - f7 || f6 > dece.b(fArr[1], fArr[3], fArr[5]) + f2 + f7) {
            return false;
        }
        if (c(f, fArr[0], fArr[1], fArr[2], fArr[3], f5, f6, f2) || c(f, fArr[2], fArr[3], fArr[4], fArr[5], f5, f6, f2) || c(f, fArr[4], fArr[5], fArr[0], fArr[1], f5, f6, f2)) {
            return true;
        }
        float f8 = fArr[0];
        double d2 = fArr[1];
        float f9 = fArr[2];
        float f10 = fArr[3];
        double d3 = fArr[4];
        double d4 = fArr[5];
        double d5 = f10;
        Double.isNaN(d5);
        Double.isNaN(d4);
        double d6 = d5 - d4;
        double d7 = f8;
        Double.isNaN(d7);
        Double.isNaN(d3);
        double d8 = d7 - d3;
        double d9 = f9;
        Double.isNaN(d3);
        Double.isNaN(d9);
        double d10 = d3 - d9;
        Double.isNaN(d2);
        Double.isNaN(d4);
        double d11 = (d6 * d8) + ((d2 - d4) * d10);
        double d12 = f5;
        Double.isNaN(d12);
        Double.isNaN(d3);
        double d13 = d12 - d3;
        double d14 = f6;
        Double.isNaN(d14);
        Double.isNaN(d4);
        double d15 = d14 - d4;
        double d16 = (d6 * d13) + (d10 * d15);
        Double.isNaN(d4);
        Double.isNaN(d2);
        double d17 = ((d4 - d2) * d13) + (d8 * d15);
        double d18 = (d11 - d16) - d17;
        if (d11 < dcyn.a) {
            d = -d11;
            d16 = -d16;
            d17 = -d17;
            d18 = -d18;
        } else {
            d = d11;
        }
        double d19 = d;
        double d20 = d18;
        return d16 >= dcyn.a && d16 <= d19 && d17 >= dcyn.a && d17 <= d19 && d20 >= dcyn.a && d20 <= d19;
    }
}
