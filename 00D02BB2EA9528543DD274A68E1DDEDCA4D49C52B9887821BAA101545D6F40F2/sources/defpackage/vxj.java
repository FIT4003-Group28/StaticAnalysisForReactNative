package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: vxj  reason: default package */
/* loaded from: classes7.dex */
public final class vxj {
    public static int a(dpbw dpbwVar, Context context) {
        return b(dpbwVar).b(context);
    }

    public static cqss b(dpbw dpbwVar) {
        cqss p = ibm.p();
        dpbw dpbwVar2 = dpbw.UNKNOWN;
        int ordinal = dpbwVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                return xje.b;
            }
            if (ordinal != 4) {
                return p;
            }
        }
        return xje.a;
    }

    public static dpbw c(doyp doypVar) {
        dgaw dgawVar;
        dgaw dgawVar2 = null;
        if ((doypVar.a & 1) != 0) {
            dgawVar = doypVar.b;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
        } else {
            dgawVar = null;
        }
        if ((doypVar.a & 64) != 0 && (dgawVar2 = doypVar.e) == null) {
            dgawVar2 = dgaw.g;
        }
        dpbw b = dpbw.b(doypVar.c);
        if (b == null) {
            b = dpbw.UNKNOWN;
        }
        return e(dgawVar, dgawVar2, b);
    }

    public static dpbw d(vwt vwtVar) {
        return e(vwtVar.a(), vwtVar.b(), vwtVar.c());
    }

    public static dpbw e(@dzsi dgaw dgawVar, @dzsi dgaw dgawVar2, dpbw dpbwVar) {
        return (dpbwVar == dpbw.EARLY || dpbwVar == dpbw.LATE) ? (dgawVar == null || dgawVar2 == null) ? dpbw.REALTIME_ONLY : Math.abs(dgawVar.b - dgawVar2.b) >= 60 ? dpbwVar : dpbw.ON_TIME : dpbwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(dpbw dpbwVar) {
        return !dpbwVar.equals(dpbw.UNKNOWN);
    }
}
