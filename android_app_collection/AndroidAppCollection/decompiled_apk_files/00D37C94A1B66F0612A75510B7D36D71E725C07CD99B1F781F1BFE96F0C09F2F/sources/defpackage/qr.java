package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: qr  reason: default package */
/* loaded from: classes4.dex */
public final class qr {
    private static final Comparator a = new wd(1);

    public static qo a(qn qnVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        qp qpVar;
        qq qqVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        qp qpVar2;
        cmf cmfVar;
        int i;
        qq qqVar2;
        qq qqVar3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int b = qnVar.b();
        int a2 = qnVar.a();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new qp(b, a2));
        int i9 = b + a2;
        int i10 = 1;
        int i11 = (i9 + 1) / 2;
        int i12 = i11 + i11 + 1;
        int[] iArr = new int[i12];
        int i13 = i12 >> 1;
        int[] iArr2 = new int[i12];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            qp qpVar3 = (qp) arrayList6.remove(arrayList6.size() - 1);
            if (qpVar3.b() > 0 && qpVar3.a() > 0) {
                int b2 = ((qpVar3.b() + qpVar3.a()) + i10) / 2;
                int i14 = i13 + 1;
                iArr[i14] = qpVar3.a;
                iArr2[i14] = qpVar3.b;
                int i15 = 0;
                while (i15 < b2) {
                    int abs = Math.abs(qpVar3.b() - qpVar3.a()) % 2;
                    int b3 = qpVar3.b() - qpVar3.a();
                    int i16 = -i15;
                    int i17 = i16;
                    while (true) {
                        if (i17 > i15) {
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            i = b2;
                            qqVar2 = null;
                            break;
                        }
                        if (i17 != i16 && (i17 == i15 || iArr[i17 + 1 + i13] <= iArr[(i17 - 1) + i13])) {
                            i5 = iArr[(i17 - 1) + i13];
                            i6 = i5 + 1;
                        } else {
                            i5 = iArr[i17 + 1 + i13];
                            i6 = i5;
                        }
                        i = b2;
                        arrayList = arrayList6;
                        int i18 = (qpVar3.c + (i6 - qpVar3.a)) - i17;
                        if (i15 == 0 || i6 != i5) {
                            arrayList2 = arrayList7;
                            i7 = i18;
                        } else {
                            i7 = i18 - 1;
                            arrayList2 = arrayList7;
                        }
                        while (i6 < qpVar3.b && i18 < qpVar3.d && qnVar.d(i6, i18)) {
                            i6++;
                            i18++;
                        }
                        iArr[i17 + i13] = i6;
                        if (abs == 1) {
                            int i19 = b3 - i17;
                            i8 = abs;
                            if (i19 >= i16 + 1 && i19 <= i15 - 1 && iArr2[i19 + i13] <= i6) {
                                qqVar2 = new qq();
                                qqVar2.a = i5;
                                qqVar2.b = i7;
                                qqVar2.c = i6;
                                qqVar2.d = i18;
                                qqVar2.e = false;
                                break;
                            }
                        } else {
                            i8 = abs;
                        }
                        i17 += 2;
                        b2 = i;
                        arrayList6 = arrayList;
                        arrayList7 = arrayList2;
                        abs = i8;
                    }
                    if (qqVar2 != null) {
                        qqVar = qqVar2;
                        qpVar = qpVar3;
                        break;
                    }
                    int b4 = (qpVar3.b() - qpVar3.a()) % 2;
                    int b5 = qpVar3.b() - qpVar3.a();
                    int i20 = i16;
                    while (true) {
                        if (i20 > i15) {
                            qpVar = qpVar3;
                            qqVar3 = null;
                            break;
                        }
                        if (i20 != i16 && (i20 == i15 || iArr2[i20 + 1 + i13] >= iArr2[(i20 - 1) + i13])) {
                            i2 = iArr2[(i20 - 1) + i13];
                            i3 = i2 - 1;
                        } else {
                            i2 = iArr2[i20 + 1 + i13];
                            i3 = i2;
                        }
                        int i21 = qpVar3.d - ((qpVar3.b - i3) - i20);
                        int i22 = (i15 == 0 || i3 != i2) ? i21 : i21 + 1;
                        while (i3 > qpVar3.a && i21 > qpVar3.c) {
                            int i23 = i3 - 1;
                            qpVar = qpVar3;
                            int i24 = i21 - 1;
                            if (!qnVar.d(i23, i24)) {
                                break;
                            }
                            i3 = i23;
                            i21 = i24;
                            qpVar3 = qpVar;
                        }
                        qpVar = qpVar3;
                        iArr2[i20 + i13] = i3;
                        if (b4 == 0 && (i4 = b5 - i20) >= i16 && i4 <= i15 && iArr[i4 + i13] >= i3) {
                            qqVar3 = new qq();
                            qqVar3.a = i3;
                            qqVar3.b = i21;
                            qqVar3.c = i2;
                            qqVar3.d = i22;
                            qqVar3.e = true;
                            break;
                        }
                        i20 += 2;
                        qpVar3 = qpVar;
                    }
                    if (qqVar3 != null) {
                        qqVar = qqVar3;
                        break;
                    }
                    i15++;
                    b2 = i;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                    qpVar3 = qpVar;
                }
            }
            arrayList = arrayList6;
            arrayList2 = arrayList7;
            qpVar = qpVar3;
            qqVar = null;
            if (qqVar != null) {
                if (qqVar.a() > 0) {
                    int i25 = qqVar.d;
                    int i26 = qqVar.b;
                    int i27 = i25 - i26;
                    int i28 = qqVar.c;
                    int i29 = qqVar.a;
                    int i30 = i28 - i29;
                    if (i27 == i30) {
                        cmfVar = new cmf(i29, i26, i30);
                    } else if (qqVar.e) {
                        cmfVar = new cmf(i29, i26, qqVar.a());
                    } else if (i27 <= i30) {
                        cmfVar = new cmf(i29 + 1, i26, qqVar.a());
                    } else {
                        cmfVar = new cmf(i29, i26 + 1, qqVar.a());
                    }
                    arrayList5.add(cmfVar);
                }
                if (arrayList2.isEmpty()) {
                    qpVar2 = new qp();
                    arrayList4 = arrayList2;
                } else {
                    arrayList4 = arrayList2;
                    qpVar2 = (qp) arrayList4.remove(arrayList2.size() - 1);
                }
                qp qpVar4 = qpVar;
                qpVar2.a = qpVar4.a;
                qpVar2.c = qpVar4.c;
                qpVar2.b = qqVar.a;
                qpVar2.d = qqVar.b;
                arrayList3 = arrayList;
                arrayList3.add(qpVar2);
                int i31 = qpVar4.b;
                int i32 = qpVar4.d;
                qpVar4.a = qqVar.c;
                qpVar4.c = qqVar.d;
                arrayList3.add(qpVar4);
            } else {
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                arrayList4.add(qpVar);
            }
            arrayList7 = arrayList4;
            arrayList6 = arrayList3;
            i10 = 1;
        }
        Collections.sort(arrayList5, a);
        return new qo(qnVar, arrayList5, iArr, iArr2);
    }
}
