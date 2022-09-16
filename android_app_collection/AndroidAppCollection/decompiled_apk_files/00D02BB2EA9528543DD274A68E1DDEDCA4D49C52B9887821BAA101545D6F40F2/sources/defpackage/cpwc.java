package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cpwc  reason: default package */
/* loaded from: classes5.dex */
public final class cpwc {
    public static <T, D> void a(cpvi<T, D> cpviVar, cpve<T, D> cpveVar, cpvi<T, D> cpviVar2, cpve<T, D> cpveVar2) {
        Double valueOf = Double.valueOf((double) dcyn.a);
        if (cpviVar2 != null) {
            cpve<T, R> d = cpviVar2.d(cpvf.a);
            cpve<T, R> e = cpviVar2.e(cpvf.b, valueOf);
            HashMap a = cpwj.a();
            int i = -1;
            for (T t : cpviVar2.e) {
                i++;
                D a2 = cpveVar2.a(t, i, cpviVar2);
                Double d2 = (Double) d.a(t, i, cpviVar2);
                Double d3 = (Double) e.a(t, i, cpviVar2);
                a.put(a2, Double.valueOf(d2 != null ? d2.doubleValue() + d3.doubleValue() : d3.doubleValue()));
            }
            cpviVar.i(cpvf.b, new cpwa(cpveVar, a));
            return;
        }
        cpviVar.j(cpvf.b, valueOf);
    }
}
