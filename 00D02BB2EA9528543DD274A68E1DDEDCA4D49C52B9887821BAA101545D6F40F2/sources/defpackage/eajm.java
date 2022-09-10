package defpackage;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: eajm  reason: default package */
/* loaded from: classes6.dex */
public final class eajm extends AbstractList<eajc> implements RandomAccess {
    public final eajc[] a;
    public final int[] b;

    private eajm(eajc[] eajcVarArr, int[] iArr) {
        this.a = eajcVarArr;
        this.b = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ca, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.eajm a(defpackage.eajc... r10) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eajm.a(eajc[]):eajm");
    }

    private static void b(long j, eaiz eaizVar, int i, List<eajc> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i2 < i3) {
            for (int i9 = i2; i9 < i3; i9++) {
                if (list.get(i9).h() < i) {
                    throw new AssertionError();
                }
            }
            eajc eajcVar = list.get(i2);
            eajc eajcVar2 = list.get(i3 - 1);
            if (i == eajcVar.h()) {
                int intValue = list2.get(i2).intValue();
                int i10 = i2 + 1;
                i5 = i10;
                i4 = intValue;
                eajcVar = list.get(i10);
            } else {
                i4 = -1;
                i5 = i2;
            }
            if (eajcVar.g(i) != eajcVar2.g(i)) {
                int i11 = 1;
                for (int i12 = i5 + 1; i12 < i3; i12++) {
                    if (list.get(i12 - 1).g(i) != list.get(i12).g(i)) {
                        i11++;
                    }
                }
                long c = j + c(eaizVar) + 2 + i11 + i11;
                eaizVar.O(i11);
                eaizVar.O(i4);
                for (int i13 = i5; i13 < i3; i13++) {
                    byte g = list.get(i13).g(i);
                    if (i13 == i5 || g != list.get(i13 - 1).g(i)) {
                        eaizVar.O(g & 255);
                    }
                }
                eaiz eaizVar2 = new eaiz();
                int i14 = i5;
                while (i14 < i3) {
                    byte g2 = list.get(i14).g(i);
                    int i15 = i14 + 1;
                    int i16 = i15;
                    while (true) {
                        if (i16 >= i3) {
                            i7 = i3;
                            break;
                        } else if (g2 != list.get(i16).g(i)) {
                            i7 = i16;
                            break;
                        } else {
                            i16++;
                        }
                    }
                    if (i15 != i7 || i + 1 != list.get(i14).h()) {
                        eaizVar.O((int) (-(c(eaizVar2) + c)));
                        i8 = i7;
                        b(c, eaizVar2, i + 1, list, i14, i7, list2);
                    } else {
                        eaizVar.O(list2.get(i14).intValue());
                        i8 = i7;
                    }
                    i14 = i8;
                }
                eaizVar.a(eaizVar2, eaizVar2.b);
                return;
            }
            int min = Math.min(eajcVar.h(), eajcVar2.h());
            int i17 = 0;
            for (int i18 = i; i18 < min && eajcVar.g(i18) == eajcVar2.g(i18); i18++) {
                i17++;
            }
            long c2 = 1 + j + c(eaizVar) + 2 + i17;
            eaizVar.O(-i17);
            eaizVar.O(i4);
            int i19 = i;
            while (true) {
                i6 = i + i17;
                if (i19 >= i6) {
                    break;
                }
                eaizVar.O(eajcVar.g(i19) & 255);
                i19++;
            }
            if (i5 + 1 == i3) {
                if (i6 != list.get(i5).h()) {
                    throw new AssertionError();
                }
                eaizVar.O(list2.get(i5).intValue());
                return;
            }
            eaiz eaizVar3 = new eaiz();
            eaizVar.O((int) (-(c(eaizVar3) + c2)));
            b(c2, eaizVar3, i6, list, i5, i3, list2);
            eaizVar.a(eaizVar3, eaizVar3.b);
            return;
        }
        throw new AssertionError();
    }

    private static int c(eaiz eaizVar) {
        return (int) (eaizVar.b / 4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.length;
    }
}
