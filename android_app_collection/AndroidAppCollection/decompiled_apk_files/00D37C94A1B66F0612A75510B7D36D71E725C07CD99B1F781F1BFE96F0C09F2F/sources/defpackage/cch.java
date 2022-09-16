package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cch  reason: default package */
/* loaded from: classes2.dex */
public final class cch {
    private static final ccv b = ccv.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    static final ccv a = ccv.a("id", "layers", "w", "h", "p", "u");
    private static final ccv c = ccv.a("list");
    private static final ccv d = ccv.a("cm", "tm", "dr");

    public static bwx a(ccw ccwVar) {
        HashMap hashMap;
        ArrayList arrayList;
        age ageVar;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        HashMap hashMap2;
        ArrayList arrayList2;
        float a2 = cdh.a();
        agb agbVar = new agb();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        age ageVar2 = new age();
        bwx bwxVar = new bwx();
        ccwVar.j();
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        while (ccwVar.p()) {
            float f6 = f5;
            int i6 = 1;
            switch (ccwVar.c(b)) {
                case 0:
                    i4 = ccwVar.b();
                    f5 = f6;
                case 1:
                    i5 = ccwVar.b();
                    f5 = f6;
                case 2:
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    f3 = (float) ccwVar.a();
                    f5 = f6;
                    hashMap5 = hashMap2;
                    arrayList4 = arrayList2;
                case 3:
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    f4 = ((float) ccwVar.a()) - 0.01f;
                    f5 = f6;
                    hashMap5 = hashMap2;
                    arrayList4 = arrayList2;
                case 4:
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    f5 = (float) ccwVar.a();
                    hashMap5 = hashMap2;
                    arrayList4 = arrayList2;
                case 5:
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    ageVar = ageVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    String[] split = ccwVar.h().split("\\.");
                    if (!cdh.m(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]))) {
                        bwxVar.d("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    ageVar2 = ageVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                case 6:
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    ageVar = ageVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    ccwVar.i();
                    int i7 = 0;
                    while (ccwVar.p()) {
                        cbg b2 = ccg.b(ccwVar, bwxVar);
                        if (b2.u == 3) {
                            i7++;
                        }
                        arrayList3.add(b2);
                        agbVar.k(b2.d, b2);
                        if (i7 > 4) {
                            StringBuilder sb = new StringBuilder(157);
                            sb.append("You have ");
                            sb.append(i7);
                            sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                            cda.a(sb.toString());
                        }
                    }
                    ccwVar.k();
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    ageVar2 = ageVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                case 7:
                    ccwVar.i();
                    while (ccwVar.p()) {
                        ArrayList arrayList5 = new ArrayList();
                        agb agbVar2 = new agb();
                        ccwVar.j();
                        ArrayList arrayList6 = arrayList4;
                        age ageVar3 = ageVar2;
                        float f7 = f4;
                        String str = null;
                        String str2 = null;
                        int i8 = 0;
                        HashMap hashMap6 = hashMap5;
                        int i9 = 0;
                        while (ccwVar.p()) {
                            float f8 = f3;
                            int c2 = ccwVar.c(a);
                            if (c2 != 0) {
                                int i10 = i5;
                                if (c2 != 1) {
                                    if (c2 == 2) {
                                        i8 = ccwVar.b();
                                    } else if (c2 == 3) {
                                        i9 = ccwVar.b();
                                    } else if (c2 != 4) {
                                        if (c2 == 5) {
                                            ccwVar.h();
                                        } else {
                                            ccwVar.n();
                                            ccwVar.o();
                                        }
                                        i3 = i4;
                                    } else {
                                        str = ccwVar.h();
                                    }
                                    f3 = f8;
                                    i5 = i10;
                                } else {
                                    ccwVar.i();
                                    while (ccwVar.p()) {
                                        cbg b3 = ccg.b(ccwVar, bwxVar);
                                        agbVar2.k(b3.d, b3);
                                        arrayList5.add(b3);
                                        i4 = i4;
                                    }
                                    i3 = i4;
                                    ccwVar.k();
                                }
                                f3 = f8;
                                i5 = i10;
                                i4 = i3;
                            } else {
                                str2 = ccwVar.h();
                                f3 = f8;
                            }
                        }
                        float f9 = f3;
                        int i11 = i4;
                        int i12 = i5;
                        ccwVar.l();
                        if (str != null) {
                            bxo bxoVar = new bxo(i8, i9, str2, str);
                            hashMap4.put(bxoVar.c, bxoVar);
                        } else {
                            hashMap3.put(str2, arrayList5);
                        }
                        hashMap5 = hashMap6;
                        arrayList4 = arrayList6;
                        ageVar2 = ageVar3;
                        f4 = f7;
                        f3 = f9;
                        i5 = i12;
                        i4 = i11;
                    }
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    ageVar = ageVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    ccwVar.k();
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    ageVar2 = ageVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                case 8:
                    ccwVar.j();
                    while (ccwVar.p()) {
                        if (ccwVar.c(c) == 0) {
                            ccwVar.i();
                            while (ccwVar.p()) {
                                bzs a3 = cbz.a(ccwVar);
                                hashMap5.put(a3.b, a3);
                            }
                            ccwVar.k();
                        } else {
                            ccwVar.n();
                            ccwVar.o();
                        }
                    }
                    ccwVar.l();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    ageVar = ageVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    ageVar2 = ageVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                case 9:
                    ccwVar.i();
                    while (ccwVar.p()) {
                        bzt a4 = cby.a(ccwVar, bwxVar);
                        ageVar2.k(a4.hashCode(), a4);
                    }
                    ccwVar.k();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    ageVar = ageVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    ageVar2 = ageVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                case 10:
                    ccwVar.i();
                    while (ccwVar.p()) {
                        ccwVar.j();
                        while (ccwVar.p()) {
                            int c3 = ccwVar.c(d);
                            if (c3 == 0) {
                                ccwVar.h();
                            } else if (c3 == i6) {
                                ccwVar.a();
                            } else if (c3 == 2) {
                                ccwVar.a();
                            } else {
                                ccwVar.n();
                                ccwVar.o();
                            }
                            i6 = 1;
                        }
                        ccwVar.l();
                        arrayList4.add(new ael());
                        i6 = 1;
                    }
                    ccwVar.k();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    ageVar = ageVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    ageVar2 = ageVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
                default:
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    ageVar = ageVar2;
                    f = f3;
                    f2 = f4;
                    i = i4;
                    i2 = i5;
                    ccwVar.n();
                    ccwVar.o();
                    f5 = f6;
                    hashMap5 = hashMap;
                    arrayList4 = arrayList;
                    ageVar2 = ageVar;
                    f4 = f2;
                    f3 = f;
                    i5 = i2;
                    i4 = i;
            }
        }
        bwxVar.g = new Rect(0, 0, (int) (i4 * a2), (int) (i5 * a2));
        bwxVar.h = f3;
        bwxVar.i = f4;
        bwxVar.j = f5;
        bwxVar.f = arrayList3;
        bwxVar.e = agbVar;
        bwxVar.a = hashMap3;
        bwxVar.b = hashMap4;
        bwxVar.d = ageVar2;
        bwxVar.c = hashMap5;
        return bwxVar;
    }
}
