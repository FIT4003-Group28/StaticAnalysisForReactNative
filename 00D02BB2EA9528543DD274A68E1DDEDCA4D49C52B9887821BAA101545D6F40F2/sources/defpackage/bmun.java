package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmun  reason: default package */
/* loaded from: classes3.dex */
public final class bmun {
    public static final dcqe a = dcqe.c("bmun");
    static final double b = Math.pow(2.0d, -11.0d);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dbsg<Double> b(List<eaov> list, dcdc<Double> dcdcVar) {
        double d;
        int size = list.size();
        double d2 = 1.0d;
        if (size == 0) {
            return dbsg.i(Double.valueOf(1.0d));
        }
        int i = ((eaov) Collections.min(list)).p;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += list.get(i4).p;
        }
        double d3 = dcyn.a;
        while (i2 < size) {
            int i5 = size * i;
            double d4 = i5;
            double doubleValue = dcdcVar.get(i2).doubleValue();
            Double.isNaN(d4);
            double d5 = i;
            Double.isNaN(d5);
            double d6 = (d4 * doubleValue) - d5;
            double d7 = list.get(i2).p - i;
            double doubleValue2 = dcdcVar.get(i2).doubleValue();
            int i6 = i3;
            double d8 = i5 - i3;
            Double.isNaN(d8);
            Double.isNaN(d7);
            double d9 = d7 + (doubleValue2 * d8);
            if (d9 > dcyn.a) {
                d3 = Math.max(d3, d6 / d9);
            } else if (d9 < dcyn.a) {
                d2 = Math.min(d2, d6 / d9);
            } else if (d9 == dcyn.a) {
                double doubleValue3 = dcdcVar.get(i2).doubleValue();
                Double.isNaN(size);
                if ((doubleValue3 * d) - 1.0d > dcyn.a) {
                    return dbpy.a;
                }
            } else {
                continue;
            }
            i2++;
            i3 = i6;
        }
        return d2 >= d3 ? dbsg.i(Double.valueOf(d2)) : dbpy.a;
    }

    public static double c(double d) {
        if (d < dcyn.a) {
            return dcyn.a;
        }
        if (d <= 1.0d) {
            return d;
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
        r2.add(java.lang.Integer.valueOf(r7));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bmuf a(java.util.List<defpackage.dosf> r16, defpackage.dbrn<defpackage.eapd, defpackage.eapg> r17, defpackage.eapg r18) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmun.a(java.util.List, dbrn, eapg):bmuf");
    }
}
