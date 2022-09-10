package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmui  reason: default package */
/* loaded from: classes3.dex */
public final class bmui implements bmtm {
    private final dcdc<eapg> a;
    private final eapg b;

    public bmui(dcdc<eapg> dcdcVar, eapg eapgVar) {
        dbsk.a(dcmw.a.p(dcdcVar));
        if (!dcdcVar.isEmpty()) {
            dbsk.a(eapgVar.compareTo(dcdcVar.get(0)) >= 0);
        }
        this.a = dcdcVar;
        this.b = eapgVar;
    }

    @Override // defpackage.bmtm
    public final bmtl a(double d, dcdc<bmth> dcdcVar) {
        dcdc f;
        double doubleValue;
        dbsk.a(dcdcVar.size() == this.a.size());
        dccx F = dcdc.F();
        boolean z = !this.a.isEmpty() && this.a.get(0).equals(this.b);
        int i = 0;
        while (i < dcdcVar.size()) {
            if (z) {
                if (dcdcVar.size() > 1 && i == 0) {
                    i = 0;
                } else if (dcdcVar.size() > 1 && i == 1) {
                    F.g(Double.valueOf((0.5d * d) + Math.max((double) dcyn.a, dcdcVar.get(0).c() - d) + Math.max((double) dcyn.a, dcdcVar.get(1).c() - d)));
                }
                i++;
            }
            F.g(Double.valueOf((d * 0.5d) + dcdcVar.get(i).c()));
            i++;
        }
        dcdc<eapg> dcdcVar2 = this.a;
        eapg eapgVar = this.b;
        final dcdc f2 = F.f();
        final double d2 = bmun.b;
        if (dcdcVar2.isEmpty()) {
            f = dcdc.e();
        } else {
            int i2 = dcdcVar2.get(0).compareTo(eapgVar) != 0 ? 1 : 0;
            dccx F2 = dcdc.F();
            if (i2 != 0) {
                F2.g(eaov.c(dcdcVar2.get(0), eapgVar));
            }
            for (int i3 = 1; i3 < dcdcVar2.size(); i3++) {
                F2.g(eaov.c(dcdcVar2.get(i3), dcdcVar2.get(i3 - 1)));
            }
            final dcdc f3 = F2.f();
            if (!f3.isEmpty() && (i2 == 0 || f3.size() != 1)) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 <= f3.size(); i4++) {
                    arrayList.add(Integer.valueOf(i4));
                }
                int binarySearch = Collections.binarySearch(dchl.k(arrayList, new dbrn(f3, f2, d2) { // from class: bmuk
                    private final List a;
                    private final dcdc b;
                    private final double c;

                    {
                        this.a = f3;
                        this.b = f2;
                        this.c = d2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        List list = this.a;
                        dcdc dcdcVar3 = this.b;
                        double d3 = this.c;
                        int i5 = 0;
                        dbsg<Double> b = bmun.b(list.subList(0, ((Integer) obj).intValue()), dcdcVar3);
                        if (!b.a() || b.b().doubleValue() < d3) {
                            i5 = 2;
                        }
                        return Integer.valueOf(i5);
                    }
                }), 1);
                dbsk.l(binarySearch < 0);
                int i5 = (-binarySearch) - 2;
                if (i5 == 0) {
                    f = dcdc.f(Double.valueOf((double) dcyn.a));
                } else {
                    dbsg<Double> b = bmun.b(f3.subList(0, i5), f2);
                    if (!b.a()) {
                        bvoo.h("Inexistent alpha.", new Object[0]);
                        doubleValue = 0.0d;
                    } else {
                        doubleValue = b.b().doubleValue();
                    }
                    List<E> subList = f3.subList(0, i5);
                    int i6 = ((eaov) Collections.min(subList)).p;
                    double c = bmun.c(doubleValue);
                    ArrayList arrayList2 = new ArrayList(subList.size());
                    Iterator it = subList.iterator();
                    if (it.hasNext()) {
                        arrayList2.add(Long.valueOf(((eaov) it.next()).p));
                        while (it.hasNext()) {
                            arrayList2.add(Long.valueOf(((Long) arrayList2.get(arrayList2.size() - 1)).longValue() + ((eaov) it.next()).p));
                        }
                    }
                    dcdcVar2.subList(0, Math.min(dcdcVar2.size(), (i5 + 1) - i2));
                    dccx F3 = dcdc.F();
                    F3.g(Double.valueOf((double) dcyn.a));
                    double d3 = i6;
                    double size = arrayList2.size();
                    double longValue = ((Long) dcft.s(arrayList2)).longValue() - (arrayList2.size() * i6);
                    Double.isNaN(longValue);
                    Double.isNaN(d3);
                    Double.isNaN(size);
                    double d4 = size + ((longValue * c) / d3);
                    int i7 = 0;
                    while (i7 < arrayList2.size() - 1) {
                        int i8 = i7 + 1;
                        double d5 = i8;
                        double longValue2 = ((Long) arrayList2.get(i7)).longValue() - (i6 * i8);
                        Double.isNaN(longValue2);
                        Double.isNaN(d3);
                        Double.isNaN(d5);
                        F3.g(Double.valueOf(bmun.c((d5 + ((longValue2 * c) / d3)) / d4)));
                        i7 = i8;
                        i6 = i6;
                    }
                    F3.g(Double.valueOf(1.0d));
                    dcdc f4 = F3.f();
                    f = dcdc.r(dchl.k(f4.subList(i2, f4.size()), bmul.a));
                }
            } else {
                f = dcdc.f(Double.valueOf((double) dcyn.a));
            }
        }
        boolean z2 = !f.isEmpty() && eaov.c((eapt) dcft.p(this.a, f.size() + (-1)), this.b).p < 7;
        dbsk.a(f.size() <= this.a.size());
        return bmtl.c(dcdc.r(dchl.k(f, bmuh.a)), z2);
    }
}
