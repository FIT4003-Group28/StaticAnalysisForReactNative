package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: albu  reason: default package */
/* loaded from: classes2.dex */
public final class albu {
    public static final int[] a = {0, 4, 8, 16};
    public static final int[] b = {12, 14, 17, 19};
    private static final int[] c = {2, 3, 5, 8};
    private static final int[] d = {3, 5, 7, 10};
    private static final int[] e = {0, 0, 0, 0};
    private static final dcdc<Integer> f = dcdc.e();

    public static dmqx a(int i, int i2, bntp bntpVar) {
        return f(i, i2, f, bntpVar, c, d, a);
    }

    public static dmqx b(List<albt> list, List<dmsk> list2, bntp bntpVar) {
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        for (albt albtVar : list) {
            dmqj bZ = dmqk.j.bZ();
            for (dmsk dmskVar : list2) {
                int a2 = albtVar.a() * 8;
                if (dmskVar.c) {
                    dmskVar.bF();
                    dmskVar.c = false;
                }
                dmsl dmslVar = (dmsl) dmskVar.b;
                dmsl dmslVar2 = dmsl.l;
                dmslVar.a |= 4;
                dmslVar.d = a2;
                bZ.a(dmskVar);
            }
            int i = bntpVar.k;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmqk dmqkVar = (dmqk) bZ.b;
            dmqkVar.a |= 4;
            dmqkVar.c = i;
            dmoo dmooVar = (dmoo) dmop.h.bZ();
            int b2 = albtVar.b();
            if (dmooVar.c) {
                dmooVar.bF();
                dmooVar.c = false;
            }
            dmop dmopVar = (dmop) dmooVar.b;
            dmopVar.a |= 1;
            dmopVar.b = b2;
            dmqk bK = bZ.bK();
            bK.getClass();
            dmopVar.e = bK;
            dmopVar.a |= 8;
            dmqtVar.a(dmooVar);
        }
        return (dmqx) dmqtVar.bK();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dmqx c(int i, int i2, int i3, List<Integer> list, bntp bntpVar, @dzsi String str, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        List<albt> list2;
        int i4;
        boolean z;
        int length = iArr.length;
        int length2 = iArr4.length;
        boolean z2 = false;
        dbsk.a(length == length2);
        dbsk.a(iArr2.length == length2);
        dbsk.a(iArr3.length == length2);
        List<albt> e2 = e(iArr, iArr4);
        List<albt> e3 = e(iArr2, iArr4);
        List<albt> e4 = e(iArr3, iArr4);
        dbsk.l(e2.size() == e3.size());
        dbsk.l(e2.size() == e4.size());
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        int i5 = 0;
        while (i5 < e2.size()) {
            albt albtVar = e2.get(i5);
            albt albtVar2 = e3.get(i5);
            albt albtVar3 = e4.get(i5);
            dbsk.l(albtVar.b() == albtVar2.b());
            dbsk.l(albtVar.b() == albtVar3.b());
            dmqj bZ = dmqk.j.bZ();
            dmsk bZ2 = dmsl.l.bZ();
            int a2 = albtVar3.a() * 8;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = z2;
            }
            dmsl dmslVar = (dmsl) bZ2.b;
            int i6 = dmslVar.a | 4;
            dmslVar.a = i6;
            dmslVar.d = a2;
            dmslVar.a = i6 | 1;
            dmslVar.b = i;
            bZ.a(bZ2);
            dmsk bZ3 = dmsl.l.bZ();
            int a3 = albtVar2.a() * 8;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = z2;
            }
            dmsl dmslVar2 = (dmsl) bZ3.b;
            int i7 = dmslVar2.a | 4;
            dmslVar2.a = i7;
            dmslVar2.d = a3;
            dmslVar2.a = i7 | 1;
            dmslVar2.b = i2;
            bZ.a(bZ3);
            dmsk bZ4 = dmsl.l.bZ();
            int a4 = albtVar.a() * 8;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = z2;
            }
            dmsl dmslVar3 = (dmsl) bZ4.b;
            int i8 = dmslVar3.a | 4;
            dmslVar3.a = i8;
            dmslVar3.d = a4;
            dmslVar3.a = i8 | 1;
            dmslVar3.b = i3;
            bZ4.a(list);
            bZ.a(bZ4);
            int i9 = bntpVar.k;
            if (bZ.c) {
                bZ.bF();
                bZ.c = z2;
            }
            dmqk dmqkVar = (dmqk) bZ.b;
            dmqkVar.a |= 4;
            dmqkVar.c = i9;
            if (str == null) {
                list2 = e2;
                dmsk bZ5 = dmsl.l.bZ();
                if (bZ5.c) {
                    bZ5.bF();
                    i4 = 0;
                    bZ5.c = false;
                } else {
                    i4 = 0;
                }
                dmsl dmslVar4 = (dmsl) bZ5.b;
                int i10 = dmslVar4.a | 4;
                dmslVar4.a = i10;
                int i11 = i4 == 1 ? 1 : 0;
                int i12 = i4 == 1 ? 1 : 0;
                int i13 = i4 == 1 ? 1 : 0;
                int i14 = i4 == 1 ? 1 : 0;
                dmslVar4.d = i11;
                dmslVar4.a = i10 | 1;
                dmslVar4.b = i4;
                bZ.a(bZ5);
                z = i4;
            } else {
                dmsk bZ6 = dmsl.l.bZ();
                int a5 = albtVar.a() * 8;
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                dmsl dmslVar5 = (dmsl) bZ6.b;
                list2 = e2;
                int i15 = dmslVar5.a | 4;
                dmslVar5.a = i15;
                dmslVar5.d = a5;
                str.getClass();
                dmslVar5.a = i15 | 32;
                dmslVar5.g = str;
                bZ.a(bZ6);
                z = 0;
            }
            dmoo dmooVar = (dmoo) dmop.h.bZ();
            int b2 = albtVar.b();
            if (dmooVar.c) {
                dmooVar.bF();
                dmooVar.c = z;
            }
            dmop dmopVar = (dmop) dmooVar.b;
            dmopVar.a |= 1;
            dmopVar.b = b2;
            dmqk bK = bZ.bK();
            bK.getClass();
            dmopVar.e = bK;
            dmopVar.a |= 8;
            dmqtVar.a(dmooVar);
            i5++;
            e2 = list2;
            z2 = false;
        }
        return (dmqx) dmqtVar.bK();
    }

    public static dmqx d(int i, bntp bntpVar, int[] iArr, int[] iArr2, int[] iArr3) {
        return f(-1, i, f, bntpVar, iArr, iArr2, iArr3);
    }

    public static List<albt> e(int[] iArr, int[] iArr2) {
        dbsk.l(iArr.length == iArr2.length);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iArr.length; i++) {
            arrayList.add(new albs(Math.round(iArr[i]), iArr2[i]));
        }
        return arrayList;
    }

    private static dmqx f(int i, int i2, List<Integer> list, bntp bntpVar, int[] iArr, int[] iArr2, int[] iArr3) {
        return c(0, i, i2, list, bntpVar, null, iArr, iArr2, e, iArr3);
    }
}
