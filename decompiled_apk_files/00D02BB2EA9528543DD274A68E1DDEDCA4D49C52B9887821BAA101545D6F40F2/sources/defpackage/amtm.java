package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: amtm  reason: default package */
/* loaded from: classes2.dex */
public final class amtm {
    private volatile amti[] a;

    public amtm(amti[] amtiVarArr) {
        this.a = amtiVarArr;
    }

    @dzsi
    public static amtm a(amuo[] amuoVarArr) {
        int length;
        int length2 = amuoVarArr.length;
        if (length2 == 0) {
            return null;
        }
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = amuoVarArr.length;
            if (i >= length) {
                break;
            }
            i2 += amuoVarArr[i].k;
            iArr[i] = i2;
            i++;
        }
        int i3 = 0;
        for (int i4 = length - 1; i4 >= 0; i4--) {
            iArr2[i4] = i3;
            i3 += amuoVarArr[i4].m;
        }
        amti[] amtiVarArr = new amti[amuoVarArr.length];
        for (int i5 = 0; i5 < amuoVarArr.length; i5++) {
            amtiVarArr[i5] = new amti(iArr[i5], iArr2[i5], false);
        }
        return new amtm(amtiVarArr);
    }

    public static amti[] b(dpeq dpeqVar, int i) {
        dbsk.a(dpeqVar.b.size() >= 2);
        dsrj<dpco> dsrjVar = dpeqVar.b;
        int i2 = dsrjVar.get(0).c > 0 ? 1 : 0;
        amti[] amtiVarArr = new amti[dsrjVar.size() + i2];
        long j = ((dpco) dcft.s(dsrjVar)).c;
        if (i2 > 0) {
            amtiVarArr[0] = new amti(i, (int) j, true);
        }
        for (int i3 = 0; i3 < dsrjVar.size(); i3++) {
            amtiVarArr[i3 + i2] = new amti(dsrjVar.get(i3).b, (int) (j - dsrjVar.get(i3).c), true);
        }
        return amtiVarArr;
    }

    public static amtm c(dpeq dpeqVar, int i) {
        return new amtm(b(dpeqVar, i));
    }

    private final double g(final amtl amtlVar, double d, amtl amtlVar2) {
        dclu dcluVar = dcln.a;
        if (!amtlVar.c) {
            dcluVar = dcmw.a;
        }
        amti[] amtiVarArr = this.a;
        int i = (int) d;
        amti amtiVar = new amti(i, i, false);
        amtlVar.getClass();
        int binarySearch = Arrays.binarySearch(amtiVarArr, amtiVar, dcluVar.g(new dbrn(amtlVar) { // from class: amth
            private final amtl a;

            {
                this.a = amtlVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return Double.valueOf(this.a.a((amti) obj));
            }
        }));
        if (binarySearch >= 0) {
            amti amtiVar2 = this.a[binarySearch];
            if (amtlVar.a(amtiVar2) == d) {
                return amtlVar2.a(amtiVar2);
            }
            do {
                binarySearch++;
                if (binarySearch >= this.a.length) {
                    break;
                }
            } while (dcluVar.compare(Double.valueOf(amtlVar.a(this.a[binarySearch])), Double.valueOf(d)) < 0);
            binarySearch = (-binarySearch) - 1;
        }
        if (binarySearch == -1) {
            return amtlVar2.a(this.a[0]);
        }
        int i2 = (-(binarySearch + 1)) - 1;
        if (i2 >= this.a.length - 1) {
            return amtlVar2.a(this.a[this.a.length - 1]);
        }
        double a = amtlVar.a(this.a[i2]);
        int i3 = i2 + 1;
        double a2 = amtlVar.a(this.a[i3]);
        double d2 = a == a2 ? dcyn.a : (d - a) / (a2 - a);
        double a3 = amtlVar2.a(this.a[i2]);
        return a3 + (d2 * (amtlVar2.a(this.a[i3]) - a3));
    }

    public final double d(double d) {
        return g(amtl.DISTANCE_FROM_START_METERS, d, amtl.ETA_SECONDS);
    }

    public final double e(int i) {
        return g(amtl.ETA_SECONDS, i, amtl.DISTANCE_FROM_START_METERS);
    }

    public final Iterable<amti> f() {
        return Arrays.asList(this.a);
    }
}
