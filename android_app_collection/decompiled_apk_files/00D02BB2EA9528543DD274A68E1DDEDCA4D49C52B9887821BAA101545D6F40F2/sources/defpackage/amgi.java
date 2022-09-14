package defpackage;

import com.google.android.apps.gmm.map.internal.vector.gl.GeometryUtil;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: amgi  reason: default package */
/* loaded from: classes.dex */
public final class amgi {
    private static final int[] a = {amfz.a(2), amfz.a(1), amfz.a(4), amfz.a(3)};
    private static final int[] b = {amfz.a(4), amfz.a(3), amfz.a(2), amfz.a(1)};
    private static final int[] c = {amfz.a(6), amfz.a(5)};
    private static final int[] d = {amfz.a(6), amfz.a(5), amfz.a(7), amfz.a(6), amfz.a(5)};
    private static final float e = 0.5f / GeometryUtil.a;
    private static final aksf f = aksf.a;

    public static float a(float f2) {
        while (f2 > 5.3687091E8f) {
            f2 -= 1.07374182E9f;
        }
        while (f2 < -5.3687091E8f) {
            f2 += 1.07374182E9f;
        }
        return f2;
    }

    public static int b(int i) {
        while (i > 536870912) {
            i -= 1073741824;
        }
        while (i < -536870912) {
            i += 1073741824;
        }
        return i;
    }

    public static void c(float[] fArr, int[] iArr, float f2, float f3, float[] fArr2, int i, int i2, int i3, int i4, int[] iArr2, int i5, float f4, amgr amgrVar) {
        l(new amga(fArr, fArr.length, f2, f3), fArr2, i, i2, i3, i4, iArr2, i5, null, iArr, false, f4, amgrVar);
        amgrVar.k();
    }

    public static void d(int i, int[] iArr, int i2, int i3, int i4, float[] fArr, int i5, int i6, int i7, int i8, int[] iArr2, int i9, float[] fArr2, int[] iArr3, boolean z, float f2, @dzsi int[] iArr4, @dzsi int[] iArr5, amgr amgrVar) {
        l(new amgb(iArr, i, i2, i3, i4, z, iArr4, iArr5), fArr, i5, i6, i7, i8, iArr2, i9, fArr2, iArr3, z, f2, amgrVar);
        amgrVar.k();
    }

    static int e(float f2) {
        return ((int) (((f2 * e) + 0.5f) * 255.0f)) & 255;
    }

    static int f(float f2) {
        return (char) (((f2 * e) + 0.5f) * 65535.0f);
    }

    public static void g(int[] iArr, int i, int i2, int[] iArr2, float[] fArr, float[] fArr2, float[] fArr3, float f2, float f3, amgr amgrVar) {
        int length = iArr.length;
        if (length < 4) {
            return;
        }
        float[] fArr4 = new float[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            fArr4[i3] = iArr[i3];
        }
        h(fArr4, i, i2, iArr2, fArr, fArr2, fArr3, f2, f3, amgrVar);
    }

    public static void h(float[] fArr, float f2, float f3, int[] iArr, float[] fArr2, float[] fArr3, float[] fArr4, float f4, float f5, amgr amgrVar) {
        int i;
        int i2;
        float[] fArr5 = fArr;
        int length = fArr5.length;
        if (length < 4) {
            return;
        }
        int i3 = length >> 1;
        int i4 = (iArr == null || iArr.length == 0) ? i3 : iArr[0];
        float f6 = fArr2[0] * f4;
        float f7 = fArr3[0] * f4;
        float f8 = fArr4[0] * f4;
        if (f6 <= 0.0f) {
            return;
        }
        aksf aksfVar = f;
        akse d2 = aksfVar.d();
        akse d3 = aksfVar.d();
        akse d4 = aksfVar.d();
        d2.b = a(fArr5[0] - f2);
        d2.c = fArr5[1] - f3;
        d3.b = a(fArr5[2] - f2);
        d3.c = fArr5[3] - f3;
        akse.t(d3, d2, d4);
        d4.b = a(d4.b);
        float c2 = d4.c();
        akse d5 = aksfVar.d();
        akse d6 = aksfVar.d();
        float f9 = f7;
        float f10 = f8 + f5;
        boolean z = false;
        float f11 = 0.0f;
        int i5 = 1;
        int i6 = i4;
        float f12 = f6;
        int i7 = 0;
        float f13 = c2;
        int i8 = 0;
        while (i8 < i3) {
            float f14 = f10 - f5;
            float f15 = f14 - f11;
            float f16 = f11;
            while (true) {
                if (f15 <= f13) {
                    i = i3;
                    i2 = i5;
                    break;
                }
                int i9 = i5 + 1;
                if (i9 == i3) {
                    i = i3;
                    i2 = i9;
                    i8 = i5;
                    z = true;
                    break;
                }
                int i10 = i9 + i9;
                d2.s(d3);
                d3.b = a(fArr5[i10] - f2);
                d3.c = fArr5[i10 + 1] - f3;
                akse.t(d3, d2, d4);
                d4.b = a(d4.b);
                f16 += f13;
                f13 = d4.c();
                f15 = f14 - f16;
                i3 = i3;
                int i11 = i5;
                i5 = i9;
                i8 = i11;
            }
            if (z) {
                break;
            }
            akse.m(d4, f15 / f13, d5);
            akse.i(d5, d2, d5);
            d5.b = a(d5.b);
            d6.s(d4);
            float f17 = f12 / 2.0f;
            akse.o(d6, d6);
            akse.p(d6, d6);
            aksf aksfVar2 = f;
            int i12 = i2;
            akse d7 = aksfVar2.d();
            float f18 = f13;
            akse d8 = aksfVar2.d();
            float f19 = f12;
            akse d9 = aksfVar2.d();
            akse akseVar = d4;
            akse d10 = aksfVar2.d();
            akse akseVar2 = d3;
            float f20 = -f17;
            w(f20, f17, d6, d7);
            w(f20, f20, d6, d8);
            w(f17, f20, d6, d9);
            w(f17, f17, d6, d10);
            float f21 = f10;
            amgrVar.e(d5.b + d7.b, d5.c + d7.c, f21, 0, 1);
            amgrVar.e(d5.b + d8.b, d5.c + d8.c, f21, 0, 0);
            amgrVar.e(d5.b + d9.b, d5.c + d9.c, f21, 1, 0);
            amgrVar.e(d5.b + d7.b, d5.c + d7.c, f21, 0, 1);
            amgrVar.e(d5.b + d9.b, d5.c + d9.c, f21, 1, 0);
            amgrVar.e(d5.b + d10.b, d5.c + d10.c, f21, 1, 1);
            aksfVar2.h(d7);
            aksfVar2.h(d8);
            aksfVar2.h(d9);
            aksfVar2.h(d10);
            if (i8 >= i6) {
                i7++;
                int i13 = (iArr == null || i7 >= iArr.length) ? i : iArr[i7];
                f12 = i7 < fArr2.length ? f4 * fArr2[i7] : f19;
                if (i7 < fArr3.length) {
                    i6 = i13;
                    f9 = fArr3[i7] * f4;
                } else {
                    i6 = i13;
                }
            } else {
                f12 = f19;
            }
            f10 += f12 + f9;
            fArr5 = fArr;
            i5 = i12;
            f11 = f16;
            i3 = i;
            f13 = f18;
            d4 = akseVar;
            d3 = akseVar2;
        }
        amgrVar.k();
        aksf aksfVar3 = f;
        aksfVar3.h(d5);
        aksfVar3.h(d6);
        aksfVar3.h(d2);
        aksfVar3.h(d3);
        aksfVar3.h(d4);
    }

    public static void i(int i, int i2, amgr amgrVar) {
        byte[] g = amgrVar.g(i);
        amgrVar.h(i2, g);
        amgrVar.i(g);
    }

    public static void j(int[] iArr, int i, float f2, int i2, int i3, float f3, float f4, boolean z, amgr amgrVar) {
        int i4;
        amgr amgrVar2 = amgrVar;
        if (i <= 1) {
            return;
        }
        int i5 = amgrVar2.f;
        akra akraVar = new akra(i2, i3);
        akra akraVar2 = new akra(iArr[0], iArr[1]);
        akra akraVar3 = new akra();
        akra akraVar4 = new akra();
        akra akraVar5 = new akra();
        akra akraVar6 = new akra();
        akra akraVar7 = new akra();
        akra akraVar8 = new akra();
        akra akraVar9 = new akra();
        akra akraVar10 = new akra();
        akra akraVar11 = new akra();
        akra.D(akraVar2, akraVar, akraVar2);
        akra akraVar12 = akraVar6;
        int i6 = 1;
        float f5 = 0.0f;
        while (i6 < i) {
            int i7 = i6 + i6;
            akra akraVar13 = akraVar4;
            int i8 = i5;
            akraVar3.t(iArr[i7], iArr[i7 + 1]);
            akra.D(akraVar3, akraVar, akraVar3);
            akra.D(akraVar3, akraVar2, akraVar5);
            akra akraVar14 = akraVar;
            akra akraVar15 = akraVar11;
            float hypot = (float) Math.hypot(akraVar5.a, akraVar5.b);
            if (hypot == 0.0f) {
                akraVar7.t((int) f2, 0);
            } else {
                int i9 = akraVar5.a;
                int i10 = -akraVar5.b;
                akraVar7.a = i10;
                akraVar7.b = i9;
                akse akseVar = new akse(i10, i9);
                akse.m(akseVar, f2 / hypot, akseVar);
                akraVar7.t((int) akseVar.b, (int) akseVar.c);
            }
            float f6 = true != z ? f4 : f5;
            f5 += hypot * f3;
            float f7 = true != z ? f4 : f5;
            akra.D(akraVar2, akraVar7, akraVar8);
            akra.B(akraVar2, akraVar7, akraVar9);
            akra.D(akraVar3, akraVar7, akraVar10);
            akraVar11 = akraVar15;
            akra.B(akraVar3, akraVar7, akraVar11);
            amgrVar.c(akraVar9, 0.0f, f6);
            amgrVar.c(akraVar8, 1.0f, f6);
            amgrVar.c(akraVar10, 1.0f, f7);
            amgrVar.c(akraVar11, 0.0f, f7);
            amgrVar.c(akraVar3, 0.5f, f7);
            akraVar2.aa(akraVar3);
            i6++;
            amgrVar2 = amgrVar;
            akraVar = akraVar14;
            akraVar4 = akraVar13;
            i5 = i8;
        }
        amgr amgrVar3 = amgrVar2;
        int i11 = i5;
        akra akraVar16 = akraVar4;
        int i12 = i - 1;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i11 + (i13 * 5);
            int i15 = i14 + 2;
            amgrVar3.m(i14, i14 + 1, i15);
            amgrVar3.m(i14, i15, i14 + 3);
        }
        int i16 = 0;
        while (true) {
            i4 = i12 - 1;
            if (i16 >= i4) {
                break;
            }
            int i17 = i16 + i16;
            akraVar2.t(iArr[i17], iArr[i17 + 1]);
            akraVar3.t(iArr[i17 + 2], iArr[i17 + 3]);
            akra akraVar17 = akraVar16;
            akraVar17.t(iArr[i17 + 4], iArr[i17 + 5]);
            akra.D(akraVar3, akraVar2, akraVar5);
            akra akraVar18 = akraVar12;
            akra.D(akraVar17, akraVar3, akraVar18);
            int i18 = i11 + (i16 * 5);
            int i19 = i18 + 5;
            if (akse.b(akse.a, new akse(akraVar5.a, akraVar5.b), new akse(akraVar18.a, akraVar18.b)) > 0.0f) {
                amgrVar3.m(i18 + 2, i19 + 1, i18 + 4);
            } else {
                amgrVar3.m(i18 + 3, i18 + 4, i19);
            }
            i16++;
            akraVar12 = akraVar18;
            akraVar16 = akraVar17;
        }
        akra akraVar19 = akraVar12;
        akra akraVar20 = akraVar16;
        int i20 = (i + i) - 2;
        int i21 = iArr[0];
        int i22 = iArr[i20];
        if (i21 == i22) {
            int i23 = iArr[1];
            int i24 = iArr[i20 + 1];
            if (i23 == i24) {
                akraVar2.t(i22, i24);
                akraVar3.t(iArr[0], iArr[1]);
                akraVar20.t(iArr[2], iArr[3]);
                akra.D(akraVar3, akraVar2, akraVar5);
                akra.D(akraVar20, akraVar3, akraVar19);
                int i25 = i11 + (i4 * 5);
                if (akse.b(akse.a, new akse(akraVar5.a, akraVar5.b), new akse(akraVar19.a, akraVar19.b)) > 0.0f) {
                    amgrVar3.m(i25 + 2, i11 + 1, i25 + 4);
                } else {
                    amgrVar3.m(i25 + 3, i11 + 4, i11);
                }
            }
        }
        amgrVar.k();
    }

    public static amgf k(float[] fArr) {
        dbsk.l(fArr.length == 4);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            dbsk.l(fArr[i3] <= 255.0f);
            int i4 = (int) (fArr[i3] * 0.003921569f * 65535.0f);
            i = (i << 8) | ((i4 >> 8) & 255);
            i2 = (i2 << 8) | (i4 & 255);
        }
        return new amgf(i, i2);
    }

    private static void l(amgh amghVar, float[] fArr, int i, int i2, int i3, int i4, int[] iArr, int i5, float[] fArr2, int[] iArr2, boolean z, float f2, amgr amgrVar) {
        if (amghVar.a() < 4) {
            return;
        }
        amgc amgcVar = new amgc(amghVar, amgrVar.g, i4, i5, fArr2, iArr2, iArr, fArr);
        amgcVar.i = i;
        amgcVar.j = i2;
        amgcVar.k = i3;
        amgcVar.l = z;
        amge amgeVar = new amge(amgcVar);
        amgeVar.l = 0;
        amgeVar.k = 0;
        amgeVar.j = iArr2.length == 0 ? amgcVar.n : iArr2[0];
        amgeVar.i = f2;
        int a2 = amghVar.a() / 2;
        float[] fArr3 = new float[a2];
        fArr3[0] = f2;
        akse akseVar = new akse();
        akse akseVar2 = new akse();
        for (int i6 = 1; i6 < a2; i6++) {
            int i7 = i6 - 1;
            amghVar.b(i7 + i7, akseVar);
            amghVar.b(i6 + i6, akseVar2);
            akse akseVar3 = new akse();
            akse.t(akseVar2, akseVar, akseVar3);
            if (z) {
                akseVar3.b = a(akseVar3.b);
            }
            fArr3[i6] = fArr3[i7] + akseVar3.c();
        }
        amgd amgdVar = new amgd(iArr[amgeVar.k]);
        amgdVar.d = f2;
        amgdVar.c = fArr3[Math.min(a2 - 1, amgeVar.j)] - amgdVar.d;
        amgdVar.b = 0.0f;
        amgdVar.e = amgcVar.m ? 0.0f : fArr[amgeVar.k];
        amgg amggVar = new amgg();
        aksf aksfVar = f;
        akse d2 = aksfVar.d();
        akse d3 = aksfVar.d();
        akse d4 = amghVar.d();
        if (d4 == null) {
            amghVar.b(0, amgeVar.a);
            amghVar.b(2, amgeVar.b);
            amgeVar.a();
            akse.p(amgeVar.e, d3);
            akse akseVar4 = amgeVar.a;
            akse akseVar5 = amgeVar.e;
            float f3 = amgdVar.e;
            akse akseVar6 = amggVar.a;
            x(akseVar5, f3, akseVar6);
            akse.i(akseVar4, akseVar6, d2);
            akse d5 = aksfVar.d();
            d5.s(amgeVar.e);
            akse.n(d5, d5);
            akse akseVar7 = amgeVar.e;
            if (n(amgcVar.i) && !amgcVar.h) {
                akse akseVar8 = amgeVar.e;
                akse akseVar9 = new akse();
                akse.t(d3, akseVar8, akseVar9);
                int[] iArr3 = a;
                p(amgrVar, amgcVar, d2, iArr3[0], -1.0f, akseVar9, amgdVar);
                amgrVar.d();
                akse d6 = aksfVar.d();
                akse.i(d3, amgeVar.e, d6);
                p(amgrVar, amgcVar, d2, iArr3[1], -1.0f, d6, amgdVar);
                aksfVar.h(d6);
            } else if (amgcVar.h) {
                p(amgrVar, amgcVar, d2, a[2], amgeVar.i, d5, amgdVar);
            } else {
                p(amgrVar, amgcVar, d2, a[2], amgeVar.i, d5, amgdVar);
            }
            int[] iArr4 = a;
            p(amgrVar, amgcVar, d2, iArr4[2], amgeVar.i, d5, amgdVar);
            p(amgrVar, amgcVar, d2, iArr4[3], amgeVar.i, akseVar7, amgdVar);
            aksfVar.h(d5);
        } else {
            amgeVar.a = d4;
            amghVar.b(0, amgeVar.b);
            amghVar.b(2, amgeVar.c);
            amgeVar.a();
            v(amgrVar, amgcVar, amgdVar, amgeVar, amggVar, fArr3, d2, true);
        }
        amgeVar.l = 1;
        if (amghVar.a() > 4) {
            int i8 = 2;
            while (i8 < amghVar.a() - 2) {
                i8 += 2;
                amghVar.b(i8, amgeVar.c);
                v(amgrVar, amgcVar, amgdVar, amgeVar, amggVar, fArr3, d2, false);
                amgeVar.l++;
            }
        } else {
            amgeVar.c.s(amgeVar.b);
            amgeVar.f.s(amgeVar.e);
        }
        float c2 = amgeVar.i + amgeVar.d.c();
        amgeVar.i = c2;
        amgdVar.b = (c2 - amgdVar.d) / amgdVar.c;
        akse e2 = amghVar.e();
        if (e2 == null) {
            akse akseVar10 = amgeVar.c;
            akse akseVar11 = amgeVar.f;
            float f4 = amgdVar.e;
            akse akseVar12 = amggVar.a;
            x(akseVar11, f4, akseVar12);
            akse.i(akseVar10, akseVar12, d2);
            if (n(amgcVar.j) && !amgcVar.h) {
                boolean z2 = amgcVar.e;
                int[] iArr5 = b;
                int i9 = iArr5[0];
                float f5 = amgeVar.i;
                akse akseVar13 = amgeVar.f;
                akse akseVar14 = amggVar.b;
                akse.n(akseVar13, akseVar14);
                p(amgrVar, amgcVar, d2, o(z2, i9), f5, akseVar14, amgdVar);
                p(amgrVar, amgcVar, d2, o(amgcVar.e, iArr5[1]), amgeVar.i, amgeVar.f, amgdVar);
                float f6 = -(amgeVar.i + 2.0f);
                akse.p(amgeVar.f, d3);
                akse.n(d3, d3);
                boolean z3 = amgcVar.e;
                int i10 = iArr5[2];
                akse akseVar15 = amgeVar.f;
                akse akseVar16 = amggVar.b;
                akse.t(d3, akseVar15, akseVar16);
                p(amgrVar, amgcVar, d2, o(z3, i10), f6, akseVar16, amgdVar);
                boolean z4 = amgcVar.e;
                int i11 = iArr5[3];
                akse akseVar17 = amgeVar.f;
                akse akseVar18 = amggVar.b;
                akse.i(d3, akseVar17, akseVar18);
                p(amgrVar, amgcVar, d2, o(z4, i11), f6, akseVar18, amgdVar);
                amgrVar.d();
            } else if (amgcVar.h) {
                amgcVar.o.b(2, amgeVar.c);
                akse akseVar19 = amgeVar.c;
                akse akseVar20 = amgeVar.b;
                akse akseVar21 = amggVar.b;
                akse.t(akseVar19, akseVar20, akseVar21);
                if (amgcVar.l) {
                    akseVar21.b = a(akseVar21.b);
                }
                akse akseVar22 = amgeVar.f;
                akse.p(akseVar21, akseVar22);
                akse.o(akseVar22, akseVar22);
                akse.m(akseVar22, 255.0f, akseVar22);
                boolean z5 = akse.b(akse.a, amgeVar.d, akseVar21) > 0.0f;
                akse u = u(amgeVar.e, amgeVar.f);
                akse akseVar23 = amgeVar.b;
                float f7 = amgdVar.e;
                akse akseVar24 = amggVar.a;
                x(u, f7, akseVar24);
                akse akseVar25 = amggVar.d;
                akse.i(akseVar23, akseVar24, akseVar25);
                r(amgrVar, amgcVar, akseVar25, amgeVar.e, amgeVar.f, u, amgeVar.i, amgdVar, amgdVar, false, z5);
                amgrVar.d();
            } else {
                int[] iArr6 = b;
                int i12 = iArr6[0];
                float f8 = amgeVar.i;
                akse akseVar26 = amgeVar.f;
                akse akseVar27 = amggVar.b;
                akse.n(akseVar26, akseVar27);
                p(amgrVar, amgcVar, d2, i12, f8, akseVar27, amgdVar);
                p(amgrVar, amgcVar, d2, iArr6[1], amgeVar.i, amgeVar.f, amgdVar);
                amgrVar.d();
            }
        } else {
            amgeVar.c = e2;
            v(amgrVar, amgcVar, amgdVar, amgeVar, amggVar, fArr3, d2, false);
            amgrVar.d();
        }
        aksf aksfVar2 = f;
        aksfVar2.h(d2);
        aksfVar2.h(d3);
    }

    private static float m(akse akseVar, akse akseVar2, akse akseVar3, akse akseVar4, akse akseVar5) {
        akse.t(akseVar2, akseVar, akseVar4);
        akse.t(akseVar3, akseVar, akseVar5);
        return akseVar5.a(akseVar4) / akseVar4.a(akseVar4);
    }

    private static boolean n(int i) {
        return i == 2 || i == 1 || i == 4;
    }

    private static int o(boolean z, int i) {
        return z ? i : i + 8;
    }

    private static void p(amgr amgrVar, amgc amgcVar, akse akseVar, int i, float f2, akse akseVar2, amgd amgdVar) {
        amgf amgfVar = amgcVar.d;
        if (amgcVar.e) {
            int q = q(amgrVar, amgcVar, amgdVar, i);
            float f3 = amgrVar.h * f2;
            double d2 = f3 >= 0.0f ? 1.0d : -1.0d;
            double d3 = f3;
            Double.isNaN(d3);
            int min = ((int) Math.min(65535.0d, ((d2 * Math.min(d3 * d2, 131068.0d)) + 131068.0d) * 0.25d)) | ((e(akseVar2.b) << 16) & 16711680) | ((e(akseVar2.c) << 24) & (-16777216));
            if (amgfVar != null) {
                float f4 = akseVar.b;
                float f5 = akseVar.c;
                int i2 = amgfVar.a;
                int i3 = amgfVar.b;
                ByteBuffer byteBuffer = amgrVar.i;
                dbsk.s(byteBuffer);
                amgrVar.f(byteBuffer, f4, f5, 0.0f);
                byteBuffer.putInt(q);
                byteBuffer.putInt(min);
                byteBuffer.putInt(i2);
                byteBuffer.putInt(i3);
                amgrVar.f++;
                return;
            }
            float f6 = akseVar.b;
            float f7 = akseVar.c;
            ByteBuffer byteBuffer2 = amgrVar.i;
            dbsk.s(byteBuffer2);
            amgrVar.f(byteBuffer2, f6, f7, 0.0f);
            byteBuffer2.putInt(q);
            byteBuffer2.putInt(min);
            amgrVar.f++;
            return;
        }
        int q2 = q(amgrVar, amgcVar, amgdVar, i);
        int f8 = f(akseVar2.b);
        int f9 = f(akseVar2.c);
        int i4 = (f8 >> 8) | ((f9 << 8) & 16711680) | ((f9 << 24) & (-16777216)) | ((f8 << 8) & 65280);
        if (amgfVar != null) {
            float f10 = akseVar.b;
            float f11 = akseVar.c;
            int i5 = amgfVar.a;
            int i6 = amgfVar.b;
            ByteBuffer byteBuffer3 = amgrVar.i;
            dbsk.s(byteBuffer3);
            amgrVar.f(byteBuffer3, f10, f11, f2);
            byteBuffer3.putInt(q2);
            byteBuffer3.putInt(i4);
            byteBuffer3.putInt(i5);
            byteBuffer3.putInt(i6);
            amgrVar.f++;
            return;
        }
        float f12 = akseVar.b;
        float f13 = akseVar.c;
        ByteBuffer byteBuffer4 = amgrVar.i;
        dbsk.s(byteBuffer4);
        amgrVar.f(byteBuffer4, f12, f13, f2);
        byteBuffer4.putInt(q2);
        byteBuffer4.putInt(i4);
        amgrVar.f++;
    }

    private static int q(amgr amgrVar, amgc amgcVar, amgd amgdVar, int i) {
        int i2;
        int i3;
        if (amgrVar.b) {
            i2 = ((i << 24) & (-16777216)) | ((amgcVar.f << 8) & 65280);
            i3 = (((int) (amgdVar.b * 255.0f)) << 16) & 16711680;
        } else {
            i2 = (i << 24) & (-16777216);
            i3 = amgcVar.g;
        }
        return i2 | i3 | (amgdVar.a & 255);
    }

    private static void r(amgr amgrVar, amgc amgcVar, akse akseVar, akse akseVar2, akse akseVar3, akse akseVar4, float f2, amgd amgdVar, amgd amgdVar2, boolean z, boolean z2) {
        akse akseVar5;
        akse akseVar6;
        akse akseVar7;
        akse akseVar8;
        akse akseVar9;
        akse akseVar10;
        akse akseVar11;
        aksf aksfVar = f;
        akse d2 = aksfVar.d();
        d2.s(akseVar2);
        akse.n(d2, d2);
        akse d3 = aksfVar.d();
        d3.s(akseVar2);
        akse d4 = aksfVar.d();
        d4.r(0.0f, 0.0f);
        akse d5 = aksfVar.d();
        d5.s(akseVar3);
        akse.n(d5, d5);
        akse d6 = aksfVar.d();
        d6.s(akseVar3);
        akse d7 = aksfVar.d();
        d7.s(akseVar4);
        akse.n(d7, d7);
        akse d8 = aksfVar.d();
        d8.s(akseVar4);
        if (z2) {
            int[] iArr = d;
            akseVar5 = d8;
            akseVar6 = d7;
            p(amgrVar, amgcVar, akseVar, iArr[0], f2, d2, amgdVar);
            p(amgrVar, amgcVar, akseVar, iArr[1], f2, d3, amgdVar);
            p(amgrVar, amgcVar, akseVar, iArr[0], f2, d2, amgdVar);
            p(amgrVar, amgcVar, akseVar, iArr[2], f2, d4, amgdVar);
            akse akseVar12 = new akse();
            akse.n(akseVar2, akseVar12);
            akse akseVar13 = new akse();
            akse.n(akseVar3, akseVar13);
            s(amgrVar, amgcVar, akseVar, f2, amgdVar, akseVar12, akseVar13, iArr[0]);
            p(amgrVar, amgcVar, akseVar, iArr[3], f2, d5, amgdVar);
            p(amgrVar, amgcVar, akseVar, iArr[4], f2, d6, amgdVar);
            if (z) {
                p(amgrVar, amgcVar, akseVar, iArr[3], f2, d5, amgdVar2);
                p(amgrVar, amgcVar, akseVar, iArr[4], f2, d6, amgdVar2);
            }
            akseVar9 = d4;
            akseVar10 = d5;
            akseVar8 = d3;
            akseVar11 = d6;
            akseVar7 = d2;
        } else {
            akseVar5 = d8;
            akseVar6 = d7;
            int[] iArr2 = d;
            p(amgrVar, amgcVar, akseVar, iArr2[0], f2, d2, amgdVar);
            p(amgrVar, amgcVar, akseVar, iArr2[1], f2, d3, amgdVar);
            p(amgrVar, amgcVar, akseVar, iArr2[2], f2, d4, amgdVar);
            s(amgrVar, amgcVar, akseVar, f2, amgdVar, akseVar2, akseVar3, iArr2[4]);
            akseVar7 = d2;
            akseVar8 = d3;
            akseVar9 = d4;
            akseVar10 = d5;
            akseVar11 = d6;
            p(amgrVar, amgcVar, akseVar, iArr2[4], f2, d6, amgdVar);
            p(amgrVar, amgcVar, akseVar, iArr2[3], f2, akseVar10, amgdVar);
            p(amgrVar, amgcVar, akseVar, iArr2[4], f2, akseVar11, amgdVar);
            if (z) {
                p(amgrVar, amgcVar, akseVar, iArr2[3], f2, akseVar10, amgdVar2);
                p(amgrVar, amgcVar, akseVar, iArr2[4], f2, akseVar11, amgdVar2);
            }
        }
        aksfVar.h(akseVar7);
        aksfVar.h(akseVar8);
        aksfVar.h(akseVar9);
        aksfVar.h(akseVar10);
        aksfVar.h(akseVar11);
        aksfVar.h(akseVar6);
        aksfVar.h(akseVar5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r1 <= 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[LOOP:0: B:19:0x0087->B:20:0x0089, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void s(defpackage.amgr r17, defpackage.amgc r18, defpackage.akse r19, float r20, defpackage.amgd r21, defpackage.akse r22, defpackage.akse r23, int r24) {
        /*
            r0 = r22
            r7 = r18
            int r1 = r7.k
            r8 = 2
            r2 = 0
            if (r1 != 0) goto Lf
            akse[] r0 = new defpackage.akse[r2]
        Lc:
            r9 = r0
            goto L85
        Lf:
            float r3 = t(r22, r23)
            r4 = 1
            if (r1 != r4) goto L18
            r1 = 2
            goto L30
        L18:
            if (r1 != r8) goto L82
            float r1 = java.lang.Math.abs(r3)
            r5 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r5
            double r5 = (double) r1
            r9 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            java.lang.Double.isNaN(r5)
            double r5 = r5 / r9
            int r1 = (int) r5
            if (r1 > 0) goto L30
            goto L82
        L30:
            int r5 = r1 + (-1)
            akse[] r5 = new defpackage.akse[r5]
        L34:
            if (r4 >= r1) goto L80
            akse r6 = new akse
            r6.<init>()
            float r9 = (float) r4
            float r9 = r9 * r3
            float r10 = (float) r1
            float r9 = r9 / r10
            double r9 = (double) r9
            float r11 = r0.b
            double r11 = (double) r11
            double r13 = java.lang.Math.cos(r9)
            java.lang.Double.isNaN(r11)
            double r11 = r11 * r13
            float r13 = r0.c
            double r13 = (double) r13
            double r15 = java.lang.Math.sin(r9)
            java.lang.Double.isNaN(r13)
            double r13 = r13 * r15
            double r11 = r11 - r13
            float r11 = (float) r11
            r6.b = r11
            float r11 = r0.b
            double r11 = (double) r11
            double r13 = java.lang.Math.sin(r9)
            java.lang.Double.isNaN(r11)
            double r11 = r11 * r13
            float r13 = r0.c
            double r13 = (double) r13
            double r9 = java.lang.Math.cos(r9)
            java.lang.Double.isNaN(r13)
            double r13 = r13 * r9
            double r11 = r11 + r13
            float r9 = (float) r11
            r6.c = r9
            int r9 = r4 + (-1)
            r5[r9] = r6
            int r4 = r4 + 1
            goto L34
        L80:
            r9 = r5
            goto L85
        L82:
            akse[] r0 = new defpackage.akse[r2]
            goto Lc
        L85:
            int r10 = r9.length
            r11 = 0
        L87:
            if (r11 >= r10) goto La8
            r5 = r9[r11]
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r24
            r4 = r20
            r6 = r21
            p(r0, r1, r2, r3, r4, r5, r6)
            int[] r0 = defpackage.amgi.d
            r3 = r0[r8]
            akse r5 = defpackage.akse.a
            r0 = r17
            p(r0, r1, r2, r3, r4, r5, r6)
            int r11 = r11 + 1
            goto L87
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amgi.s(amgr, amgc, akse, float, amgd, akse, akse, int):void");
    }

    private static float t(akse akseVar, akse akseVar2) {
        return (float) Math.atan2(akse.b(akse.a, akseVar, akseVar2), akseVar.a(akseVar2));
    }

    private static akse u(akse akseVar, akse akseVar2) {
        akse akseVar3 = new akse();
        akse.i(akseVar, akseVar2, akseVar3);
        double abs = Math.abs(255.0d / Math.cos(t(akseVar, akseVar2) / 2.0f));
        akse.o(akseVar3, akseVar3);
        akse.m(akseVar3, (float) abs, akseVar3);
        return akseVar3;
    }

    private static void v(amgr amgrVar, amgc amgcVar, amgd amgdVar, amge amgeVar, amgg amggVar, float[] fArr, akse akseVar, boolean z) {
        int i;
        akse akseVar2;
        int i2;
        int i3 = amgeVar.l;
        boolean z2 = i3 >= amgeVar.j;
        float f2 = fArr[i3];
        amgeVar.i = f2;
        amgdVar.b = (f2 - amgdVar.d) / amgdVar.c;
        akse.t(amgeVar.c, amgeVar.b, amgeVar.g);
        if (amgcVar.l) {
            akse akseVar3 = amgeVar.g;
            akseVar3.b = a(akseVar3.b);
        }
        akse akseVar4 = amgeVar.g;
        akse akseVar5 = amgeVar.f;
        akse.p(akseVar4, akseVar5);
        akse.o(akseVar5, akseVar5);
        akse.m(akseVar5, 255.0f, akseVar5);
        boolean z3 = akse.b(akse.a, amgeVar.d, amgeVar.g) > 0.0f;
        akse.i(amgeVar.e, amgeVar.f, amgeVar.h);
        float a2 = amgeVar.f.a(amgeVar.h);
        if (a2 > 1.0f && amgeVar.d.a(amgeVar.g) >= 0.0f) {
            akse akseVar6 = amgeVar.h;
            akse.m(akseVar6, 65025.0f / a2, akseVar6);
            if (z3) {
                akse akseVar7 = amgeVar.b;
                akse akseVar8 = amgeVar.h;
                akseVar2 = amggVar.d;
                akse.i(akseVar7, akseVar8, akseVar2);
            } else {
                akse akseVar9 = amgeVar.b;
                akse akseVar10 = amgeVar.h;
                akseVar2 = amggVar.d;
                akse.t(akseVar9, akseVar10, akseVar2);
            }
            if (!amgcVar.m && m(amgeVar.b, amgeVar.a, akseVar2, amggVar.b, amggVar.c) < 0.5f && m(amgeVar.b, amgeVar.c, akseVar2, amggVar.b, amggVar.c) < 0.5f) {
                akse akseVar11 = amgeVar.b;
                akse akseVar12 = amgeVar.h;
                float f3 = amgdVar.e;
                akse akseVar13 = amggVar.a;
                x(akseVar12, f3, akseVar13);
                akse.i(akseVar11, akseVar13, akseVar);
                int[] iArr = c;
                int i4 = iArr[0];
                float f4 = amgeVar.i;
                akse akseVar14 = amgeVar.h;
                akse akseVar15 = amggVar.b;
                akse.n(akseVar14, akseVar15);
                p(amgrVar, amgcVar, akseVar, i4, f4, akseVar15, amgdVar);
                p(amgrVar, amgcVar, akseVar, iArr[1], amgeVar.i, amgeVar.h, amgdVar);
                if (z2) {
                    int i5 = amgeVar.k + 1;
                    amgeVar.k = i5;
                    int[] iArr2 = amgcVar.a;
                    if (i5 < iArr2.length) {
                        i2 = iArr2[i5];
                    } else {
                        i2 = amgcVar.n;
                    }
                    amgeVar.j = i2;
                    amgdVar.e = amgcVar.c[i5];
                    amgdVar.a = amgcVar.b[i5];
                    amgdVar.b = 0.0f;
                    float f5 = fArr[Math.min(fArr.length - 1, i2)];
                    float f6 = fArr[amgeVar.l];
                    amgdVar.c = f5 - f6;
                    amgdVar.d = f6;
                    akse akseVar16 = amgeVar.b;
                    akse akseVar17 = amgeVar.h;
                    float f7 = amgdVar.e;
                    akse akseVar18 = amggVar.a;
                    x(akseVar17, f7, akseVar18);
                    akse.i(akseVar16, akseVar18, akseVar);
                    int i6 = iArr[0];
                    float f8 = amgeVar.i;
                    akse akseVar19 = amgeVar.h;
                    akse akseVar20 = amggVar.b;
                    akse.n(akseVar19, akseVar20);
                    p(amgrVar, amgcVar, akseVar, i6, f8, akseVar20, amgdVar);
                    p(amgrVar, amgcVar, akseVar, iArr[1], amgeVar.i, amgeVar.h, amgdVar);
                }
                amgeVar.e.s(amgeVar.f);
                amgeVar.d.s(amgeVar.g);
                amgeVar.a.s(amgeVar.b);
                amgeVar.b.s(amgeVar.c);
            }
        }
        amgd amgdVar2 = new amgd(amgdVar);
        akse akseVar21 = amgeVar.b;
        akse akseVar22 = amgeVar.h;
        float f9 = amgdVar.e;
        akse akseVar23 = amggVar.a;
        x(akseVar22, f9, akseVar23);
        akse akseVar24 = amggVar.b;
        akse.i(akseVar21, akseVar23, akseVar24);
        if (z2) {
            int i7 = amgeVar.k + 1;
            amgeVar.k = i7;
            int[] iArr3 = amgcVar.a;
            if (i7 < iArr3.length) {
                i = iArr3[i7];
            } else {
                i = amgcVar.n;
            }
            amgeVar.j = i;
            amgdVar.e = amgcVar.c[i7];
            amgdVar.a = amgcVar.b[i7];
            amgdVar.b = 0.0f;
            float f10 = fArr[Math.min(fArr.length - 1, i)];
            float f11 = fArr[amgeVar.l];
            amgdVar.c = f10 - f11;
            amgdVar.d = f11;
        }
        amgeVar.h = u(amgeVar.e, amgeVar.f);
        if (z) {
            akse akseVar25 = amgeVar.f;
            akse akseVar26 = amgeVar.h;
            float f12 = amgeVar.i;
            akse akseVar27 = new akse(akseVar25);
            akse.n(akseVar27, akseVar27);
            akse akseVar28 = new akse(akseVar25);
            akse akseVar29 = new akse(akseVar26);
            akse.n(akseVar29, akseVar29);
            new akse(akseVar26);
            if (z3) {
                int[] iArr4 = d;
                p(amgrVar, amgcVar, akseVar24, iArr4[3], f12, akseVar27, amgdVar);
                amgrVar.d();
                p(amgrVar, amgcVar, akseVar24, iArr4[4], f12, akseVar28, amgdVar);
            } else {
                int[] iArr5 = d;
                p(amgrVar, amgcVar, akseVar24, iArr5[3], f12, akseVar27, amgdVar);
                amgrVar.d();
                p(amgrVar, amgcVar, akseVar24, iArr5[4], f12, akseVar28, amgdVar);
            }
        } else {
            r(amgrVar, amgcVar, akseVar24, amgeVar.e, amgeVar.f, amgeVar.h, amgeVar.i, amgdVar2, amgdVar, z2, z3);
        }
        amgeVar.e.s(amgeVar.f);
        amgeVar.d.s(amgeVar.g);
        amgeVar.a.s(amgeVar.b);
        amgeVar.b.s(amgeVar.c);
    }

    private static void w(float f2, float f3, akse akseVar, akse akseVar2) {
        aksf aksfVar = f;
        akse d2 = aksfVar.d();
        d2.r(f2, f3);
        akse.g(d2, akseVar, akseVar2);
        aksfVar.h(d2);
    }

    private static void x(akse akseVar, float f2, akse akseVar2) {
        if (f2 == 0.0f) {
            akseVar2.r(0.0f, 0.0f);
            return;
        }
        float c2 = akseVar.c();
        if (c2 == 0.0f) {
            akseVar2.s(akseVar);
        } else {
            akse.m(akseVar, f2 / c2, akseVar2);
        }
    }
}
