package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dmle  reason: default package */
/* loaded from: classes.dex */
public final class dmle {
    public static double a(int i, List<dpuq> list, dpuq dpuqVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                return b(list);
            }
            if (i2 != 2) {
                return c(dpuqVar, list);
            }
            return (dmlc.a(dpuqVar) + b(list)) - c(dpuqVar, list);
        }
        return dmlc.a(dpuqVar);
    }

    private static double b(List<dpuq> list) {
        double d = dcyn.a;
        for (dpuq dpuqVar : list) {
            d += dmlc.a(dpuqVar);
        }
        return d;
    }

    private static double c(dpuq dpuqVar, List<dpuq> list) {
        dcvu c;
        double d = dcyn.a;
        for (dpuq dpuqVar2 : list) {
            dcvu c2 = dmlc.c(dpuqVar2);
            dcvu c3 = dmlc.c(dpuqVar);
            dcuu j = c2.a.j(c3.a);
            dcva dcvaVar = c2.b;
            dcva dcvaVar2 = c3.b;
            dcva dcvaVar3 = new dcva(dcvaVar);
            if (dcvaVar2.i()) {
                dcvaVar3.b();
            } else if (dcvaVar3.l(dcvaVar2.a)) {
                if (!dcvaVar3.l(dcvaVar2.b)) {
                    dcvaVar3.a(dcvaVar2.a, dcvaVar3.b, true);
                } else if (dcvaVar2.k() < dcvaVar3.k()) {
                    dcvaVar3.a(dcvaVar2.a, dcvaVar2.b, true);
                }
            } else if (dcvaVar3.l(dcvaVar2.b)) {
                dcvaVar3.a(dcvaVar3.a, dcvaVar2.b, true);
            } else if (!dcvaVar2.l(dcvaVar3.a)) {
                dcvaVar3.b();
            }
            if (j.d() || dcvaVar3.i()) {
                c = dcvu.c();
            } else {
                c = new dcvu(j, dcvaVar3);
            }
            d += c.t();
        }
        return d;
    }
}
