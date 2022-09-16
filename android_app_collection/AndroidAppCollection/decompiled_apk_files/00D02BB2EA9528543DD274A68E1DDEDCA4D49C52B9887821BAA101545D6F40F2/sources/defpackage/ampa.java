package defpackage;

import java.util.ArrayDeque;
import java.util.List;
/* compiled from: PG */
/* renamed from: ampa  reason: default package */
/* loaded from: classes.dex */
public final class ampa implements ampc {
    public static final /* synthetic */ int b = 0;
    private static final ArrayDeque<bvok> e = new ArrayDeque<>();
    private int c;
    private final List<alvn> d = dchl.a();
    public final List<alvn> a = dchl.a();

    private ampa() {
    }

    public static bvok a() {
        ArrayDeque<bvok> arrayDeque = e;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new bvok(1024);
            }
            return arrayDeque.pop();
        }
    }

    public static void b(bvok bvokVar) {
        bvokVar.d();
        ArrayDeque<bvok> arrayDeque = e;
        synchronized (arrayDeque) {
            arrayDeque.push(bvokVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x037a  */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ampa c(defpackage.alyh r31, defpackage.amqi r32, defpackage.alyr r33, defpackage.ampd r34, defpackage.alth r35, defpackage.bnrz r36, defpackage.bnuv r37, defpackage.ampw r38, defpackage.btrm r39, java.util.List<defpackage.bnsa> r40, defpackage.dbty<java.lang.Boolean> r41) {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ampa.c(alyh, amqi, alyr, ampd, alth, bnrz, bnuv, ampw, btrm, java.util.List, dbty):ampa");
    }

    public static void f(alvn alvnVar, akra akraVar, amxj amxjVar, boolean z) {
        int[] iArr;
        float[] fArr;
        float f;
        float f2;
        int i;
        aksc akscVar = alvnVar.g;
        int b2 = akscVar.b();
        int[] iArr2 = akscVar.d;
        if (b2 != 0) {
            if (iArr2 != null && iArr2.length < 2) {
                return;
            }
            int[] iArr3 = akscVar.a;
            int length = iArr3.length;
            if (length > 0) {
                fArr = akscVar.c;
                if (fArr == null || fArr.length < length) {
                    if ((length & 1) != 0) {
                        fArr = new float[0];
                    } else {
                        akxb a = akxc.a(iArr3);
                        akra akraVar2 = new akra(a.a, a.c, 0);
                        akra akraVar3 = new akra(a.b, a.d, 0);
                        double b3 = 1.0d / akxc.b(akraVar3.o(), akraVar2.o());
                        double k = 1.0d / (akraVar3.k() - akraVar2.k());
                        fArr = new float[length];
                        akra akraVar4 = new akra();
                        int i2 = 0;
                        while (i2 < (iArr3.length >> 1)) {
                            int i3 = i2 + i2;
                            int i4 = i3 + 1;
                            akraVar4.t(iArr3[i3], iArr3[i4]);
                            fArr[i3] = (float) (akxc.b(akraVar4.o(), akraVar2.o()) * b3);
                            fArr[i4] = (float) (1.0d - ((akraVar4.k() - akraVar2.k()) * k));
                            i2++;
                            iArr2 = iArr2;
                            iArr3 = iArr3;
                        }
                    }
                }
                iArr = iArr2;
            } else {
                iArr = iArr2;
                fArr = akscVar.c;
                if (fArr == null) {
                    float[] fArr2 = akscVar.b;
                    int length2 = fArr2.length;
                    if (length2 == 0 || (length2 & 1) != 0) {
                        fArr = new float[0];
                    } else {
                        fArr = new float[length2];
                        int i5 = length2 >> 1;
                        float[] fArr3 = new float[i5];
                        float[] fArr4 = new float[i5];
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < fArr2.length) {
                            fArr3[i7] = fArr2[i6];
                            fArr4[i7] = fArr2[i6 + 1];
                            i6 += 2;
                            i7++;
                        }
                        float a2 = dece.a(fArr3);
                        float b4 = dece.b(fArr3);
                        float a3 = dece.a(fArr4);
                        float f3 = 1.0f / (b4 - a2);
                        float b5 = 1.0f / (dece.b(fArr4) - a3);
                        for (int i8 = 0; i8 < (fArr2.length >> 1); i8++) {
                            int i9 = i8 + i8;
                            fArr[i9] = (fArr3[i8] - a2) * f3;
                            fArr[i9 + 1] = 1.0f - ((fArr4[i8] - a3) * b5);
                        }
                    }
                }
            }
            int[] iArr4 = akscVar.a;
            float[] fArr5 = akscVar.b;
            int i10 = b2 * 3;
            int length3 = iArr4.length;
            int i11 = akraVar.a;
            int i12 = akraVar.b;
            bvok bvokVar = new bvok();
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = iArr == null ? i13 : iArr[i13];
                boolean z2 = !z;
                if (length3 > 0) {
                    if (z2) {
                        i = amgi.b(iArr4[i14 + i14] - i11);
                    } else {
                        i = iArr4[i14 + i14] - i11;
                    }
                    f2 = i;
                    f = iArr4[(i14 + i14) + 1] - i12;
                } else {
                    int i15 = i14 + i14;
                    float a4 = amgi.a(fArr5[i15]);
                    f = fArr5[i15 + 1];
                    f2 = a4;
                }
                int i16 = i14 + i14;
                float f4 = fArr[i16];
                float f5 = fArr[i16 + 1];
                bvokVar.a(Float.floatToIntBits(f2));
                bvokVar.a(Float.floatToIntBits(f));
                bvokVar.a(Float.floatToIntBits(f4));
                bvokVar.a(Float.floatToIntBits(f5));
            }
            bnvn bnvnVar = new bnvn("client_area", bvokVar.c(), i10, 81, 4, 16, null, 0);
            bnvnVar.a(false);
            amxjVar.r(bnvnVar);
        }
    }

    public static boolean g(alxo alxoVar) {
        boolean z = alxoVar.f;
        alxl[] alxlVarArr = alxoVar.n;
        if (z || (r0 = alxlVarArr.length) == 0) {
            return false;
        }
        float f = 0.0f;
        for (alxl alxlVar : alxlVarArr) {
            float f2 = alxlVar.c;
            if (ampi.a(f2) || alxlVar.b()) {
                return false;
            }
            f = Math.max(f, f2);
        }
        return f != 0.0f;
    }

    private static void h(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, bvok bvokVar) {
        int length = iArr2.length;
        int[] e2 = bvokVar.e(length + length);
        int i5 = bvokVar.b;
        for (int i6 : iArr2) {
            int i7 = i6 + i6;
            int i8 = i5 + 1;
            e2[i5] = (((iArr[i7 + 1] - i2) >> i3) << 16) | ((char) ((iArr[i7] - i) >> i3));
            i5 = i8 + 1;
            e2[i8] = i4;
        }
        bvokVar.b = i5;
    }

    private static void i(int[] iArr, int i, int i2, int i3, int i4, bvok bvokVar) {
        int length = iArr.length >> 1;
        int[] e2 = bvokVar.e(length + length);
        int i5 = bvokVar.b;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = i6 + i6;
            int i8 = i5 + 1;
            e2[i5] = (((iArr[i7 + 1] - i2) >> i3) << 16) | ((char) ((iArr[i7] - i) >> i3));
            i5 = i8 + 1;
            e2[i8] = i4;
        }
        bvokVar.b = i5;
    }

    @Override // defpackage.ampc
    public final int d() {
        return this.c;
    }

    @Override // defpackage.ampc
    public final int e() {
        return 156;
    }
}
