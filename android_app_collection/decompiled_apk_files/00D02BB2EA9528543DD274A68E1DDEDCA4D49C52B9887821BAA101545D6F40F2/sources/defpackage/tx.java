package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: tx  reason: default package */
/* loaded from: classes7.dex */
public final class tx {
    private static final Comparator<tr> a = new to();

    public static ts a(tp tpVar) {
        return b(tpVar, true);
    }

    public static ts b(tp tpVar, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        tv tvVar;
        tw twVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        tv tvVar2;
        tr trVar;
        int i;
        tw twVar2;
        tw twVar3;
        int a2;
        int i2;
        int i3;
        int a3;
        int i4;
        int i5;
        int i6;
        int a4 = tpVar.a();
        int b = tpVar.b();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new tv(a4, b));
        int i7 = a4 + b;
        int i8 = 1;
        int i9 = (i7 + 1) / 2;
        int i10 = i9 + i9 + 1;
        int[] iArr = new int[i10];
        int i11 = i10 >> 1;
        int[] iArr2 = new int[i10];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            tv tvVar3 = (tv) arrayList6.remove(arrayList6.size() - 1);
            if (tvVar3.a() > 0 && tvVar3.b() > 0) {
                int a5 = ((tvVar3.a() + tvVar3.b()) + i8) / 2;
                tq.b(i8, tvVar3.a, iArr, i11);
                tq.b(i8, tvVar3.b, iArr2, i11);
                int i12 = 0;
                while (i12 < a5) {
                    int abs = Math.abs(tvVar3.a() - tvVar3.b()) % 2;
                    int a6 = tvVar3.a() - tvVar3.b();
                    int i13 = -i12;
                    int i14 = i13;
                    while (true) {
                        if (i14 > i12) {
                            arrayList = arrayList7;
                            arrayList2 = arrayList6;
                            i = a5;
                            twVar2 = null;
                            break;
                        }
                        if (i14 != i13 && (i14 == i12 || tq.a(i14 + 1, iArr, i11) <= tq.a(i14 - 1, iArr, i11))) {
                            a3 = tq.a(i14 - 1, iArr, i11);
                            i4 = a3 + 1;
                        } else {
                            a3 = tq.a(i14 + 1, iArr, i11);
                            i4 = a3;
                        }
                        i = a5;
                        arrayList2 = arrayList6;
                        int i15 = (tvVar3.c + (i4 - tvVar3.a)) - i14;
                        if (i12 == 0 || i4 != a3) {
                            arrayList = arrayList7;
                            i5 = i15;
                        } else {
                            i5 = i15 - 1;
                            arrayList = arrayList7;
                        }
                        while (i4 < tvVar3.b && i15 < tvVar3.d && tpVar.c(i4, i15)) {
                            i4++;
                            i15++;
                        }
                        tq.b(i14, i4, iArr, i11);
                        if (abs == 1) {
                            int i16 = a6 - i14;
                            i6 = abs;
                            if (i16 >= i13 + 1 && i16 <= i12 - 1 && tq.a(i16, iArr2, i11) <= i4) {
                                twVar2 = new tw();
                                twVar2.a = a3;
                                twVar2.b = i5;
                                twVar2.c = i4;
                                twVar2.d = i15;
                                twVar2.e = false;
                                break;
                            }
                        } else {
                            i6 = abs;
                        }
                        i14 += 2;
                        a5 = i;
                        arrayList6 = arrayList2;
                        arrayList7 = arrayList;
                        abs = i6;
                    }
                    if (twVar2 != null) {
                        twVar = twVar2;
                        tvVar = tvVar3;
                        i8 = 1;
                        break;
                    }
                    int a7 = (tvVar3.a() - tvVar3.b()) % 2;
                    int a8 = tvVar3.a() - tvVar3.b();
                    int i17 = i13;
                    while (true) {
                        if (i17 > i12) {
                            tvVar = tvVar3;
                            i8 = 1;
                            twVar3 = null;
                            break;
                        }
                        if (i17 != i13 && (i17 == i12 || tq.a(i17 + 1, iArr2, i11) >= tq.a(i17 - 1, iArr2, i11))) {
                            a2 = tq.a(i17 - 1, iArr2, i11);
                            i2 = a2 - 1;
                        } else {
                            a2 = tq.a(i17 + 1, iArr2, i11);
                            i2 = a2;
                        }
                        int i18 = tvVar3.d - ((tvVar3.b - i2) - i17);
                        int i19 = (i12 == 0 || i2 != a2) ? i18 : i18 + 1;
                        while (i2 > tvVar3.a && i18 > tvVar3.c) {
                            int i20 = i2 - 1;
                            tvVar = tvVar3;
                            int i21 = i18 - 1;
                            if (!tpVar.c(i20, i21)) {
                                break;
                            }
                            i2 = i20;
                            i18 = i21;
                            tvVar3 = tvVar;
                        }
                        tvVar = tvVar3;
                        tq.b(i17, i2, iArr2, i11);
                        if (a7 == 0 && (i3 = a8 - i17) >= i13 && i3 <= i12 && tq.a(i3, iArr, i11) >= i2) {
                            twVar3 = new tw();
                            twVar3.a = i2;
                            twVar3.b = i18;
                            twVar3.c = a2;
                            twVar3.d = i19;
                            i8 = 1;
                            twVar3.e = true;
                            break;
                        }
                        i17 += 2;
                        tvVar3 = tvVar;
                    }
                    if (twVar3 != null) {
                        twVar = twVar3;
                        break;
                    }
                    i12++;
                    a5 = i;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList;
                    tvVar3 = tvVar;
                }
            }
            arrayList = arrayList7;
            arrayList2 = arrayList6;
            tvVar = tvVar3;
            twVar = null;
            if (twVar != null) {
                if (twVar.a() > 0) {
                    int i22 = twVar.d;
                    int i23 = twVar.b;
                    int i24 = i22 - i23;
                    int i25 = twVar.c;
                    int i26 = twVar.a;
                    int i27 = i25 - i26;
                    if (i24 == i27) {
                        trVar = new tr(i26, i23, i27);
                    } else if (twVar.e) {
                        trVar = new tr(i26, i23, twVar.a());
                    } else if (i24 <= i27) {
                        trVar = new tr(i26 + 1, i23, twVar.a());
                    } else {
                        trVar = new tr(i26, i23 + 1, twVar.a());
                    }
                    arrayList5.add(trVar);
                }
                if (arrayList.isEmpty()) {
                    tvVar2 = new tv();
                    arrayList4 = arrayList;
                } else {
                    arrayList4 = arrayList;
                    tvVar2 = (tv) arrayList4.remove(arrayList.size() - 1);
                }
                tv tvVar4 = tvVar;
                tvVar2.a = tvVar4.a;
                tvVar2.c = tvVar4.c;
                tvVar2.b = twVar.a;
                tvVar2.d = twVar.b;
                arrayList3 = arrayList2;
                arrayList3.add(tvVar2);
                int i28 = tvVar4.b;
                int i29 = tvVar4.d;
                tvVar4.a = twVar.c;
                tvVar4.c = twVar.d;
                arrayList3.add(tvVar4);
            } else {
                arrayList3 = arrayList2;
                arrayList4 = arrayList;
                arrayList4.add(tvVar);
            }
            arrayList7 = arrayList4;
            arrayList6 = arrayList3;
        }
        Collections.sort(arrayList5, a);
        return new ts(tpVar, arrayList5, iArr, iArr2, z);
    }
}
