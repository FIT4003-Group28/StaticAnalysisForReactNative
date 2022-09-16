package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: akxa  reason: default package */
/* loaded from: classes.dex */
public final class akxa {
    public final aksp a;
    public final akty b;
    public final akvz c;
    private final aktz d;

    public akxa(akto aktoVar) {
        this.a = aktoVar.b();
        this.b = aktoVar.d();
        this.d = aktoVar.c();
        this.c = aktoVar.e();
    }

    public static double[] a(List<akra> list) {
        int size = list.size();
        double[] dArr = new double[size + size];
        for (int i = 0; i < list.size(); i++) {
            akra akraVar = list.get(i);
            int i2 = i + i;
            dArr[i2] = akraVar.k();
            dArr[i2 + 1] = akraVar.o();
        }
        return dArr;
    }

    private static int[] f(int[] iArr, int i) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = iArr[i2] + i;
        }
        return iArr2;
    }

    private static dmqd g(double[] dArr, int i, int i2, int i3, int i4, int i5) {
        dspd b = akxh.b(dArr);
        dmqd dmqdVar = (dmqd) dmqg.p.bZ();
        if (dmqdVar.c) {
            dmqdVar.bF();
            dmqdVar.c = false;
        }
        dmqg dmqgVar = (dmqg) dmqdVar.b;
        b.getClass();
        int i6 = dmqgVar.a | 1;
        dmqgVar.a = i6;
        dmqgVar.b = b;
        int i7 = i6 | 2;
        dmqgVar.a = i7;
        dmqgVar.c = dArr.length >> 1;
        dmqgVar.f = i3 - 1;
        int i8 = i7 | 4;
        dmqgVar.a = i8;
        dmqgVar.g = i4 - 1;
        int i9 = i8 | 8;
        dmqgVar.a = i9;
        dmqgVar.h = i5 - 1;
        int i10 = i9 | 16;
        dmqgVar.a = i10;
        int i11 = i10 | 1024;
        dmqgVar.a = i11;
        dmqgVar.n = i;
        dmqgVar.a = i11 | 2048;
        dmqgVar.o = i2;
        return dmqdVar;
    }

    private static dmqg h(double[] dArr, int[] iArr, Collection<akuh> collection, int i, int i2, int i3, int i4, float f, @dzsi double[] dArr2, @dzsi double[] dArr3) {
        int i5;
        int length = iArr.length;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i6 >= length) {
                break;
            }
            if (iArr[i6] == 0) {
                z = false;
            }
            dbsk.m(z, "A lineBreak of 0 is implied and should not be present in the list.");
            i6++;
        }
        dbsk.m(dArr2 == null || dArr2.length == 2, "previousVertex should either be null or only contain one latitude, longitude pair");
        dbsk.m(dArr3 == null || dArr3.length == 2, "nextVertex should either be null or only contain one latitude, longitude pair");
        int length2 = iArr.length;
        double[] dArr4 = new double[dArr.length + length2 + length2];
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < dArr.length; i9 += 2) {
            int i10 = i9 + i7;
            dArr4[i10] = dArr[i9];
            int i11 = i9 + 1;
            dArr4[i10 + 1] = dArr[i11];
            if (i8 < iArr.length && i9 / 2 == (i5 = iArr[i8])) {
                dArr4[i10 + 2] = dArr[i9];
                dArr4[i10 + 3] = dArr[i11];
                iArr[i8] = i5 + (i7 / 2) + 1;
                i8++;
                i7 += 2;
            }
        }
        dmqd g = g(dArr4, 0, i, 2, 2, 1);
        for (int i12 : iArr) {
            if (g.c) {
                g.bF();
                g.c = false;
            }
            dmqg dmqgVar = (dmqg) g.b;
            dmqg dmqgVar2 = dmqg.p;
            dsrf dsrfVar = dmqgVar.d;
            if (!dsrfVar.a()) {
                dmqgVar.d = dsqw.cg(dsrfVar);
            }
            dmqgVar.d.h(i12);
        }
        if (dcft.k(collection, akwz.a)) {
            for (akuh akuhVar : collection) {
                dmpz b = akuhVar.b();
                if (b != null) {
                    g.i(dmqa.f, b);
                }
            }
        } else {
            for (akuh akuhVar2 : collection) {
                long a = akuhVar2.a();
                if (g.c) {
                    g.bF();
                    g.c = false;
                }
                dmqg dmqgVar3 = (dmqg) g.b;
                dmqg dmqgVar4 = dmqg.p;
                dsri dsriVar = dmqgVar3.e;
                if (!dsriVar.a()) {
                    dmqgVar3.e = dsqw.ci(dsriVar);
                }
                dmqgVar3.e.d(a);
            }
        }
        g.k(akvj.e, Float.valueOf(f));
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmqg dmqgVar5 = (dmqg) g.b;
        dmqg dmqgVar6 = dmqg.p;
        dmqgVar5.a |= 32;
        dmqgVar5.i = 4;
        if (dArr2 != null) {
            g.k(alwu.f, akxh.b(dArr2));
        }
        if (dArr3 != null) {
            g.k(alwu.g, akxh.b(dArr3));
        }
        return (dmqg) g.bK();
    }

    public final akta b(double d, double d2, int i, float f, boolean z, akuh akuhVar, boolean z2, boolean z3, int i2, int i3) {
        float[] fArr;
        double d3;
        int length;
        alwr alwrVar;
        int i4 = i;
        dmmt dmmtVar = (dmmt) dmmu.l.bZ();
        dmra bZ = dmrb.n.bZ();
        double d4 = dcyn.a;
        if (i4 == 4) {
            float[] fArr2 = {0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
            float cos = (float) Math.cos(dcyn.a);
            float sin = (float) Math.sin(dcyn.a);
            for (int i5 = 0; i5 < 11; i5 += 2) {
                float f2 = fArr2[i5];
                int i6 = i5 + 1;
                float f3 = fArr2[i6];
                fArr2[i5] = (f2 * cos) - (f3 * sin);
                fArr2[i6] = (f3 * cos) + (f2 * sin);
            }
            fArr = fArr2;
            d3 = 0.0d;
            i4 = 4;
        } else {
            int i7 = i4 + 2;
            fArr = new float[i7 + i7];
            float f4 = 0.0f;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            double d5 = i4;
            Double.isNaN(d5);
            float f5 = (float) (6.283185307179586d / d5);
            int i8 = 0;
            int i9 = 2;
            while (i8 < i4) {
                int i10 = i9 + 1;
                double d6 = f4;
                fArr[i9] = (float) Math.cos(d6);
                i9 = i10 + 1;
                fArr[i10] = (float) Math.sin(d6);
                f4 += f5;
                i8++;
                d4 = dcyn.a;
            }
            d3 = d4;
            fArr[i9] = (float) Math.cos(d3);
            fArr[i9 + 1] = (float) Math.sin(d3);
        }
        if (z) {
            int length2 = fArr.length;
            float[] fArr3 = new float[length2];
            float cos2 = (float) Math.cos(d3);
            float sin2 = (float) Math.sin(d3);
            for (int i11 = 0; i11 < fArr.length - 1; i11 += 2) {
                float f6 = fArr[i11];
                int i12 = i11 + 1;
                float f7 = fArr[i12];
                fArr3[i11] = (((f6 * cos2) - (f7 * sin2)) + 1.0f) * 0.5f;
                fArr3[i12] = 1.0f - ((((f7 * cos2) + (f6 * sin2)) + 1.0f) * 0.5f);
            }
            for (int i13 = 0; i13 < length2; i13++) {
                float f8 = fArr3[i13];
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmrb dmrbVar = (dmrb) bZ.b;
                dsre dsreVar = dmrbVar.d;
                if (!dsreVar.a()) {
                    dmrbVar.d = dsqw.cj(dsreVar);
                }
                dmrbVar.d.g(f8);
            }
        }
        float f9 = f * 0.5f;
        int i14 = 0;
        while (true) {
            length = fArr.length;
            if (i14 >= length) {
                break;
            }
            fArr[i14] = fArr[i14] * f9;
            i14++;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length * 4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.asFloatBuffer().put(fArr);
        dspd A = dspd.A(allocate);
        int i15 = length >> 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmrb dmrbVar2 = (dmrb) bZ.b;
        int i16 = dmrbVar2.a | 2;
        dmrbVar2.a = i16;
        dmrbVar2.e = i15;
        A.getClass();
        int i17 = i16 | 1;
        dmrbVar2.a = i17;
        dmrbVar2.b = A;
        dmrbVar2.a = i17 | 4;
        dmrbVar2.g = 0;
        if (z3) {
            bZ.a(0);
            bZ.a(i4 + 1);
        }
        if (dmmtVar.c) {
            dmmtVar.bF();
            dmmtVar.c = false;
        }
        dmmu dmmuVar = (dmmu) dmmtVar.b;
        dmrb bK = bZ.bK();
        bK.getClass();
        dmmuVar.b = bK;
        dmmuVar.a |= 1;
        if (dmmtVar.c) {
            dmmtVar.bF();
            dmmtVar.c = false;
        }
        dmmu dmmuVar2 = (dmmu) dmmtVar.b;
        dmmuVar2.a |= 4;
        dmmuVar2.d = z3;
        dmpz b = akuhVar.b();
        if (b != null) {
            dmmtVar.k(dmqa.a, b);
        } else if (akuhVar.a() != -1) {
            int a = akuhVar.a();
            if (dmmtVar.c) {
                dmmtVar.bF();
                dmmtVar.c = false;
            }
            dmmu dmmuVar3 = (dmmu) dmmtVar.b;
            dmmuVar3.a |= 128;
            dmmuVar3.h = a;
        }
        if (dmmtVar.c) {
            dmmtVar.bF();
            dmmtVar.c = false;
        }
        dmmu dmmuVar4 = (dmmu) dmmtVar.b;
        int i18 = dmmuVar4.a | 512;
        dmmuVar4.a = i18;
        dmmuVar4.j = i3;
        dmmuVar4.a = i18 | 1024;
        dmmuVar4.k = 0;
        dsqv<dmmu, alwr> dsqvVar = alwu.e;
        if (i2 == 3) {
            alwrVar = alwr.DRAW_OVER_LABELS_AND_CALLOUTS;
        } else {
            alwrVar = alwr.DRAW_OVER_LABELS;
        }
        dmmtVar.k(dsqvVar, alwrVar);
        akta b2 = this.a.b((dmmu) dmmtVar.bK(), akuhVar);
        aksz d7 = b2.d();
        d7.b(akra.e(d, d2));
        b2.c(d7);
        if (z2) {
            this.a.c(b2);
        }
        return b2;
    }

    public final akte c(List<akra> list, akuh akuhVar, int i, int i2, int i3, int i4, int i5) {
        dmqd g = g(a(list), i, i2, i3, i4, i5);
        dmpz b = akuhVar.b();
        if (b != null) {
            g.k(dmqa.e, b);
        } else if (akuhVar.a() != -1) {
            int a = akuhVar.a();
            if (g.c) {
                g.bF();
                g.c = false;
            }
            dmqg dmqgVar = (dmqg) g.b;
            dmqg dmqgVar2 = dmqg.p;
            dmqgVar.a |= 256;
            dmqgVar.l = a;
        }
        return this.d.c((dmqg) g.bK(), dmti.WORLD_ENCODING_LAT_LNG_DOUBLE);
    }

    public final List<akte> d(List<akra> list, int[] iArr, Collection<akuh> collection, int i, int i2, int i3, int i4, float f) {
        double[] a = a(list);
        char c = 1;
        dbsk.m(!collection.isEmpty(), "At least one style must be provided.");
        char c2 = 0;
        dbsk.m(iArr.length == collection.size() + (-1), "The number of linebreaks must equal numberOfStyles-1");
        ArrayList arrayList = new ArrayList(collection);
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        alsn alsnVar = (alsn) arrayList.get(0);
        hashSet.add(alsnVar);
        for (int i5 = 1; i5 < arrayList.size(); i5++) {
            alsn alsnVar2 = (alsn) arrayList.get(i5);
            if (!alsnVar.q(alsnVar2, false) || (!hashSet.contains(alsnVar2) && hashSet.size() == 8)) {
                arrayList2.add(Integer.valueOf(i5));
                hashSet.clear();
                alsnVar = alsnVar2;
            }
            hashSet.add(alsnVar2);
        }
        ArrayList<dmqg> arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        double[] dArr = null;
        int i6 = 0;
        int i7 = 0;
        float f2 = f;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            int i8 = intValue - 1;
            int i9 = iArr[i8];
            int i10 = i9 + i9;
            int i11 = i10 + 2;
            double[] copyOfRange = Arrays.copyOfRange(a, i6, i11);
            int[] f3 = f(Arrays.copyOfRange(iArr, i7, i8), -(i6 / 2));
            List subList = arrayList.subList(i7, intValue);
            double[] dArr2 = new double[2];
            dArr2[c2] = a[i11];
            dArr2[c] = a[i10 + 3];
            arrayList3.add(h(copyOfRange, f3, subList, i, 2, 2, 1, f2, dArr, dArr2));
            int length = copyOfRange.length;
            float f4 = 0.0f;
            if (length >= 4 && (length & 1) == 0) {
                int[] w = akra.w(copyOfRange[c2], copyOfRange[1]);
                int i12 = 1;
                for (int i13 = 1; i12 < (copyOfRange.length >> i13); i13 = 1) {
                    int i14 = i12 + i12;
                    int[] w2 = akra.w(copyOfRange[i14], copyOfRange[i14 + i13]);
                    float f5 = w[c2] - w2[c2];
                    float f6 = w[1] - w2[1];
                    double d = f4;
                    double sqrt = Math.sqrt((f5 * f5) + (f6 * f6));
                    Double.isNaN(d);
                    f4 = (float) (d + sqrt);
                    i12++;
                    it = it;
                    w = w2;
                    c2 = 0;
                }
            }
            Iterator it2 = it;
            f2 += f4;
            int length2 = copyOfRange.length;
            c = 1;
            double[] dArr3 = {copyOfRange[length2 - 4], copyOfRange[length2 - 3]};
            it = it2;
            dArr = dArr3;
            i6 = i10;
            i7 = intValue;
            c2 = 0;
        }
        arrayList3.add(h(Arrays.copyOfRange(a, i6, a.length), f(Arrays.copyOfRange(iArr, i7, iArr.length), -(i6 / 2)), arrayList.subList(i7, collection.size()), i, 2, 2, 1, f2, dArr, null));
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        for (dmqg dmqgVar : arrayList3) {
            arrayList4.add(this.d.c(dmqgVar, dmti.WORLD_ENCODING_LAT_LNG_DOUBLE));
        }
        return arrayList4;
    }

    public final akta e(double d, double d2, int i, float f, boolean z, akuh akuhVar, boolean z2) {
        return b(d, d2, i, f, z, akuhVar, true, z2, 2, 0);
    }
}
