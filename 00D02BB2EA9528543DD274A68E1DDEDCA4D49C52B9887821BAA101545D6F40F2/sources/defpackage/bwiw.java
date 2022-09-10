package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bwiw  reason: default package */
/* loaded from: classes4.dex */
public final class bwiw {
    public static final dcqe a = dcqe.c("bwiw");
    public bwiv b;

    public bwiw(bwiv bwivVar) {
        this.b = bwivVar;
    }

    public static double a(dths dthsVar, List<dgrt> list, akqs akqsVar) {
        dths dthsVar2 = dths.VIEWPORT;
        int ordinal = dthsVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return d(list);
            }
            if (ordinal == 2) {
                return (akqsVar.g() + d(list)) - e(list, akqsVar);
            }
            return ordinal != 3 ? dcyn.a : e(list, akqsVar);
        }
        return akqsVar.g();
    }

    private static boolean c(akqq akqqVar, akqq akqqVar2) {
        return ((int) (akqqVar.a * 100000.0d)) == ((int) (akqqVar2.a * 100000.0d)) && ((int) (akqqVar.b * 100000.0d)) == ((int) (akqqVar2.b * 100000.0d));
    }

    private static double d(List<dgrt> list) {
        double d = dcyn.a;
        for (dgrt dgrtVar : list) {
            d += akqs.d(dgrtVar).g();
        }
        return d;
    }

    private static double e(List<dgrt> list, akqs akqsVar) {
        double d = dcyn.a;
        for (dgrt dgrtVar : list) {
            d += akqs.h(akqs.d(dgrtVar), akqsVar);
        }
        return d;
    }

    public final void b(bwiv bwivVar) {
        akqs akqsVar = this.b.b;
        akqs akqsVar2 = bwivVar.b;
        if (((akqsVar == null && akqsVar2 == null) || (akqsVar != null && akqsVar2 != null && c(akqsVar.a, akqsVar2.a) && c(akqsVar.b, akqsVar2.b))) && dbsd.a(this.b.c, bwivVar.c)) {
            float f = this.b.d;
        }
        this.b = bwivVar;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("cacheContext=");
        sb.append(valueOf);
        return sb.toString();
    }
}
