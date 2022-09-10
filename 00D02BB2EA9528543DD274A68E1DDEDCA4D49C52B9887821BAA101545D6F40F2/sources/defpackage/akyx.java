package defpackage;

import android.graphics.Rect;
import android.opengl.Matrix;
/* compiled from: PG */
/* renamed from: akyx  reason: default package */
/* loaded from: classes.dex */
public final class akyx {
    private static final float a = (float) (1.0d / Math.log(2.0d));

    private akyx() {
    }

    private static float A(akra akraVar, akra akraVar2, akra akraVar3, akra akraVar4) {
        return 1.0f / ((float) akrb.b(akraVar, akraVar2, akraVar3, akraVar4));
    }

    public static float a(float f, int i, float f2) {
        return ((float) Math.pow(2.0d, 30.0f - f)) * (i / (f2 * 256.0f));
    }

    public static float b(akzh akzhVar, float f) {
        double k = akzhVar.p().j.k();
        int z = akzhVar.z();
        return (float) akqo.n(f, k, akzhVar.C(), (int) (z / akzhVar.B()));
    }

    public static float c(akzh akzhVar, float f, float f2) {
        return 30.0f - bvop.d((f / f2) * (akzhVar.B() * 256.0f));
    }

    public static float d(akzh akzhVar, akra akraVar) {
        if (akzhVar.p().l == 0.0f) {
            return 1.0f;
        }
        return akzhVar.m() / akzhVar.t(akraVar, true);
    }

    public static float e(akzh akzhVar) {
        return w(akzhVar, akzhVar.m());
    }

    public static double f(akzh akzhVar) {
        double r = akzhVar.p().j.r();
        double e = e(akzhVar);
        Double.isNaN(e);
        return r / e;
    }

    public static alad g(akzh akzhVar, alad aladVar, float f, float f2) {
        float w = w(akzhVar, k(aladVar, akzhVar.C(), akzhVar.z(), akzhVar.B()));
        alad p = akzhVar.p();
        double d = p.l;
        Double.isNaN(d);
        double cos = Math.cos(d * 0.017453292519943295d);
        akra b = p.e().b();
        akra b2 = p.f().b();
        akra.F(b, f * w, b);
        akra.F(b2, ((-f2) * w) / ((float) cos), b2);
        akra akraVar = aladVar.j;
        int i = akraVar.c;
        akra C = akraVar.C(b);
        akra.B(C, b2, C);
        C.c = i;
        alaa b3 = alad.b(aladVar);
        b3.d(C);
        return b3.a();
    }

    public static void h(akzh akzhVar, alad aladVar, float f, float f2, akra akraVar) {
        i(aladVar, akzhVar.C(), akzhVar.n(), akzhVar.z(), akzhVar.B(), f, f2, akraVar);
    }

    public static void i(alad aladVar, float f, float f2, int i, float f3, float f4, float f5, akra akraVar) {
        float f6;
        float k = k(aladVar, f, i, f3);
        float f7 = k / (f2 * i);
        float f8 = f4 * f7;
        float f9 = (-f5) * f7;
        if (aladVar.l > 0.0f) {
            double atan2 = Math.atan2(f9, k);
            double sin = Math.sin(atan2);
            double d = aladVar.l;
            Double.isNaN(d);
            f9 = k * ((float) (sin / Math.cos((d * 0.017453292519943295d) + atan2)));
            double d2 = (k * k) + (f9 * f9);
            double d3 = (k + k) * f9;
            double d4 = aladVar.l + 90.0f;
            Double.isNaN(d4);
            double cos = Math.cos(d4 * 0.017453292519943295d);
            Double.isNaN(d3);
            Double.isNaN(d2);
            f6 = ((float) Math.sqrt(d2 - (d3 * cos))) / k;
        } else {
            f6 = 1.0f;
        }
        akra a2 = aladVar.e().a();
        akra g = alad.g(aladVar.m);
        akra.F(a2, (-f8) * f6, a2);
        akra.F(g, -f9, g);
        akra.B(aladVar.j.C(a2), g, akraVar);
    }

    public static alad j(akzh akzhVar, alad aladVar, float f, float f2, float f3) {
        float y = f2 - (akzhVar.y() * aladVar.n.b());
        float z = f3 - (akzhVar.z() * aladVar.n.c());
        alaa b = alad.b(g(akzhVar, aladVar, y, z));
        b.c = f;
        akzhVar.c.b(b);
        alad a2 = b.a();
        akzhVar.o(a2);
        return g(akzhVar, a2, -y, -z);
    }

    public static float k(alad aladVar, float f, int i, float f2) {
        return y(aladVar.k, f, i, f2);
    }

    public static akqs l(alad aladVar, int i, int i2, float f) {
        aksj aksjVar = new akzh(aladVar, i, i2, f).r().c;
        akqr a2 = akqs.a();
        a2.d(aksjVar.c.S());
        a2.d(aksjVar.b.S());
        return a2.b();
    }

    public static akqs m(dhjx dhjxVar) {
        dhkd dhkdVar = dhjxVar.d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        boolean z = false;
        if (dhkdVar.b > 0) {
            dhkd dhkdVar2 = dhjxVar.d;
            if (dhkdVar2 == null) {
                dhkdVar2 = dhkd.d;
            }
            if (dhkdVar2.c > 0) {
                z = true;
            }
        }
        dbsk.a(z);
        alad c = alad.c(dhjxVar);
        if (c == null) {
            c = alad.a;
        }
        dhkd dhkdVar3 = dhjxVar.d;
        if (dhkdVar3 == null) {
            dhkdVar3 = dhkd.d;
        }
        int i = dhkdVar3.b;
        dhkd dhkdVar4 = dhjxVar.d;
        if (dhkdVar4 == null) {
            dhkdVar4 = dhkd.d;
        }
        return l(c, i, dhkdVar4.c, 1.0f);
    }

    public static int[] n(akzh akzhVar, akra akraVar) {
        float[] fArr = new float[8];
        if (!o(akzhVar, akraVar, fArr)) {
            return null;
        }
        return new int[]{Math.round(fArr[0]), Math.round(fArr[1])};
    }

    public static boolean o(akzh akzhVar, akra akraVar, float[] fArr) {
        dbsk.l(fArr.length >= 8);
        fArr[0] = (((akraVar.a - akzhVar.i()) + 536870912) & 1073741823) - 536870912;
        fArr[1] = akraVar.b - akzhVar.j();
        fArr[2] = akraVar.c;
        float[] v = akzhVar.v();
        fArr[4] = (v[0] * fArr[0]) + (v[4] * fArr[1]) + (v[8] * fArr[2]) + v[12];
        fArr[5] = (v[1] * fArr[0]) + (v[5] * fArr[1]) + (v[9] * fArr[2]) + v[13];
        float f = (v[3] * fArr[0]) + (v[7] * fArr[1]) + (v[11] * fArr[2]) + v[15];
        fArr[7] = f;
        if (f <= 0.0f) {
            fArr[0] = Float.NaN;
            fArr[1] = Float.NaN;
            return false;
        }
        float f2 = 1.0f / f;
        fArr[0] = fArr[4] * f2;
        fArr[1] = fArr[5] * f2;
        return true;
    }

    public static boolean p(akzh akzhVar, akra akraVar, akse akseVar, float[] fArr) {
        boolean o = o(akzhVar, akraVar, fArr);
        akseVar.r(fArr[0], fArr[1]);
        return o;
    }

    public static boolean q(akzh akzhVar, akra akraVar, float[] fArr) {
        fArr[0] = (((akraVar.a - akzhVar.i()) + 536870912) & 1073741823) - 536870912;
        fArr[1] = akraVar.b - akzhVar.j();
        float[] v = akzhVar.v();
        fArr[4] = (v[0] * fArr[0]) + (v[4] * fArr[1]) + v[12];
        fArr[5] = (v[1] * fArr[0]) + (v[5] * fArr[1]) + v[13];
        float f = (v[3] * fArr[0]) + (v[7] * fArr[1]) + v[15];
        fArr[7] = f;
        if (f <= 0.0f) {
            fArr[0] = Float.NaN;
            fArr[1] = Float.NaN;
            return false;
        }
        float f2 = 1.0f / f;
        fArr[0] = fArr[4] * f2;
        fArr[1] = fArr[5] * f2;
        return true;
    }

    public static boolean r(akzh akzhVar, float f, float f2, akra akraVar, float[] fArr) {
        dbsk.l(fArr.length >= 8);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = 1.0f;
        fArr[3] = 1.0f;
        Matrix.multiplyMV(fArr, 4, akzhVar.w(), 0, fArr, 0);
        akra q = akzhVar.q();
        int i = q.a;
        int i2 = q.b;
        int i3 = q.c;
        float f3 = 1.0f / fArr[7];
        double d = fArr[4] * f3;
        double d2 = fArr[5] * f3;
        double d3 = (fArr[6] * f3) / i3;
        if (d3 >= 1.0d || Double.isNaN(d3)) {
            return false;
        }
        Double.isNaN(d3);
        double d4 = 1.0d / (1.0d - d3);
        akzhVar.h(akraVar);
        double d5 = i;
        double d6 = i2;
        double d7 = akraVar.a;
        Double.isNaN(d);
        Double.isNaN(d7);
        Double.isNaN(d5);
        Double.isNaN(d5);
        double d8 = akraVar.b;
        Double.isNaN(d2);
        Double.isNaN(d8);
        Double.isNaN(d6);
        Double.isNaN(d6);
        akraVar.t((int) ((((d + d7) - d5) * d4) + d5), (int) ((((d2 + d8) - d6) * d4) + d6));
        return true;
    }

    @dzsi
    public static akra s(akzh akzhVar, float f, float f2, float[] fArr) {
        akra akraVar = new akra();
        if (r(akzhVar, f, f2, akraVar, fArr)) {
            return akraVar;
        }
        return null;
    }

    @dzsi
    public static akqk t(akzh akzhVar, float f, float f2, float f3, float f4, float[] fArr) {
        dbsk.l(fArr.length >= 8);
        akra q = akzhVar.q();
        int i = q.a;
        int i2 = q.b;
        int i3 = q.c;
        int i4 = akzhVar.i() - i;
        int j = akzhVar.j() - i2;
        fArr[0] = f;
        fArr[1] = f3;
        fArr[2] = 1.0f;
        fArr[3] = 1.0f;
        Matrix.multiplyMV(fArr, 4, akzhVar.w(), 0, fArr, 0);
        float f5 = 1.0f / fArr[7];
        double d = fArr[4] * f5;
        double d2 = fArr[5] * f5;
        float f6 = i3;
        double d3 = (fArr[6] * f5) / f6;
        if (d3 >= 1.0d) {
            return null;
        }
        Double.isNaN(d3);
        double d4 = 1.0d / (1.0d - d3);
        double d5 = i4;
        double d6 = i;
        double d7 = j;
        double d8 = i2;
        Double.isNaN(d);
        Double.isNaN(d5);
        Double.isNaN(d6);
        Double.isNaN(d2);
        Double.isNaN(d7);
        Double.isNaN(d8);
        akra akraVar = new akra((int) (((d + d5) * d4) + d6), (int) (((d2 + d7) * d4) + d8));
        fArr[0] = f2;
        Matrix.multiplyMV(fArr, 4, akzhVar.w(), 0, fArr, 0);
        float f7 = 1.0f / fArr[7];
        double d9 = fArr[4] * f7;
        double d10 = fArr[5] * f7;
        double d11 = (fArr[6] * f7) / f6;
        if (d11 >= 1.0d) {
            return null;
        }
        Double.isNaN(d11);
        double d12 = 1.0d / (1.0d - d11);
        Double.isNaN(d9);
        Double.isNaN(d5);
        Double.isNaN(d6);
        Double.isNaN(d10);
        Double.isNaN(d7);
        Double.isNaN(d8);
        akra akraVar2 = new akra((int) (((d9 + d5) * d12) + d6), (int) (((d10 + d7) * d12) + d8));
        fArr[1] = f4;
        Matrix.multiplyMV(fArr, 4, akzhVar.w(), 0, fArr, 0);
        float f8 = 1.0f / fArr[7];
        double d13 = fArr[4] * f8;
        double d14 = fArr[5] * f8;
        double d15 = (fArr[6] * f8) / f6;
        if (d15 >= 1.0d) {
            return null;
        }
        Double.isNaN(d15);
        double d16 = 1.0d / (1.0d - d15);
        Double.isNaN(d13);
        Double.isNaN(d5);
        Double.isNaN(d6);
        Double.isNaN(d14);
        Double.isNaN(d7);
        Double.isNaN(d8);
        akra akraVar3 = new akra((int) (((d13 + d5) * d16) + d6), (int) (((d14 + d7) * d16) + d8));
        fArr[0] = f;
        Matrix.multiplyMV(fArr, 4, akzhVar.w(), 0, fArr, 0);
        float f9 = 1.0f / fArr[7];
        double d17 = fArr[4] * f9;
        double d18 = fArr[5] * f9;
        double d19 = (fArr[6] * f9) / f6;
        if (d19 >= 1.0d) {
            return null;
        }
        Double.isNaN(d19);
        double d20 = 1.0d / (1.0d - d19);
        Double.isNaN(d17);
        Double.isNaN(d5);
        Double.isNaN(d6);
        Double.isNaN(d18);
        Double.isNaN(d7);
        Double.isNaN(d8);
        return akqk.a(new akra((int) (((d17 + d5) * d20) + d6), (int) (((d18 + d7) * d20) + d8)), akraVar3, akraVar, akraVar2);
    }

    public static void u(akzh akzhVar, akza akzaVar, akra akraVar, Rect rect, int i, float[] fArr) {
        float A;
        akqk t = t(akzhVar, rect.left, rect.right - 1, rect.top + i, rect.bottom - 1, fArr);
        for (int i2 = 0; i2 < 5 && t != null && !t.j(akraVar); i2++) {
            akra akraVar2 = akzhVar.p().j;
            int[] n = n(akzhVar, akraVar);
            if (n != null) {
                if (n[0] < rect.left) {
                    A = A(t.e(), t.h(), akraVar2, akraVar);
                } else {
                    A = n[0] >= rect.right ? A(t.f(), t.g(), akraVar2, akraVar) : 1.0f;
                }
                if (n[1] < rect.top + i) {
                    A = Math.max(A, A(t.g(), t.h(), akraVar2, akraVar));
                } else if (n[1] >= rect.bottom) {
                    A = Math.max(A, A(t.f(), t.e(), akraVar2, akraVar));
                }
                float log = akzhVar.p().k - (((float) Math.log(A)) * a);
                if (Math.abs(log - akzhVar.p().k) < 1.0E-6d && akzhVar.p().l < akzaVar.f(log)) {
                    return;
                }
                alaa b = alad.b(akzhVar.p());
                b.c = log;
                b.d = Math.min(akzaVar.f(log), akzhVar.p().l);
                akzhVar.o(b.a());
                t = t(akzhVar, rect.left, (rect.left + rect.right) - 1, rect.top + i, rect.bottom - 1, fArr);
            } else {
                float abs = Math.abs(A(t.f(), t.e(), akraVar2, akraVar));
                float f = akzhVar.p().k;
                double log2 = Math.log(abs);
                float f2 = a;
                alaa b2 = alad.b(akzhVar.p());
                b2.c = f - (((float) log2) * f2);
                akzhVar.o(b2.a());
                return;
            }
        }
    }

    public static dhjx v(dhjx dhjxVar, float f, int i) {
        double[] dArr = new double[3];
        dhkb dhkbVar = dhjxVar.c;
        if (dhkbVar == null) {
            dhkbVar = dhkb.e;
        }
        float f2 = dhkbVar.b;
        float f3 = dhkbVar.c;
        double d = f2;
        Double.isNaN(d);
        double d2 = 90.0d - d;
        if (d2 < dcyn.a) {
            d2 += 360.0d;
        } else if (d2 >= 360.0d) {
            d2 -= 360.0d;
        }
        double d3 = f3;
        Double.isNaN(d3);
        double d4 = d3 * 0.017453292519943295d;
        double d5 = d2 * 0.017453292519943295d;
        double sin = Math.sin(d4);
        dArr[0] = Math.cos(d5) * sin;
        dArr[1] = sin * Math.sin(d5);
        dArr[2] = -Math.cos(d4);
        dhjz dhjzVar = dhjxVar.b;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        float f4 = dhjxVar.e;
        double d6 = dhjzVar.d;
        double d7 = dhjzVar.c;
        double d8 = f4;
        dhkd dhkdVar = dhjxVar.d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        double y = y((float) akqo.n(d6, d7, d8, dhkdVar.c), f4, i, f);
        akra e = akra.e(dhjzVar.c, dhjzVar.b);
        double d9 = dArr[0];
        Double.isNaN(y);
        int round = (int) Math.round(d9 * y);
        double d10 = dArr[1];
        Double.isNaN(y);
        akra C = e.C(new akra(round, (int) Math.round(y * d10), 0));
        dsqp dsqpVar = (dsqp) dhjxVar.cu(5);
        dsqpVar.bC(dhjxVar);
        dhjw dhjwVar = (dhjw) dsqpVar;
        dsqp dsqpVar2 = (dsqp) dhjzVar.cu(5);
        dsqpVar2.bC(dhjzVar);
        dhjy dhjyVar = (dhjy) dsqpVar2;
        double k = C.k();
        if (dhjyVar.c) {
            dhjyVar.bF();
            dhjyVar.c = false;
        }
        dhjz dhjzVar2 = (dhjz) dhjyVar.b;
        dhjzVar2.a = 2 | dhjzVar2.a;
        dhjzVar2.c = k;
        double o = C.o();
        if (dhjyVar.c) {
            dhjyVar.bF();
            dhjyVar.c = false;
        }
        dhjz dhjzVar3 = (dhjz) dhjyVar.b;
        dhjzVar3.a |= 1;
        dhjzVar3.b = o;
        if (dhjwVar.c) {
            dhjwVar.bF();
            dhjwVar.c = false;
        }
        dhjx dhjxVar2 = (dhjx) dhjwVar.b;
        dhjz bK = dhjyVar.bK();
        bK.getClass();
        dhjxVar2.b = bK;
        dhjxVar2.a |= 1;
        return dhjwVar.bK();
    }

    public static float w(akzh akzhVar, float f) {
        return f / (akzhVar.n() * akzhVar.z());
    }

    public static float x(float f, int i, float f2, float f3) {
        return (a(f, i, 1.0f) * z(f3)) / (f2 * i);
    }

    private static float y(float f, float f2, int i, float f3) {
        return a(f, i, f3) * z(f2);
    }

    private static float z(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) (0.5d / Math.tan((d * 0.017453292519943295d) * 0.5d));
    }
}
