package defpackage;
/* compiled from: PG */
/* renamed from: cbs  reason: default package */
/* loaded from: classes2.dex */
public final class cbs {
    private static final ccv a = ccv.a("a");
    private static final ccv b = ccv.a("fc", "sc", "sw", "t");

    public static cai a(ccw ccwVar, bwx bwxVar) {
        ccwVar.j();
        cai caiVar = null;
        while (ccwVar.p()) {
            if (ccwVar.c(a) == 0) {
                ccwVar.j();
                bzy bzyVar = null;
                bzy bzyVar2 = null;
                bzz bzzVar = null;
                bzz bzzVar2 = null;
                while (ccwVar.p()) {
                    int c = ccwVar.c(b);
                    if (c == 0) {
                        bzyVar = lg.i(ccwVar, bwxVar);
                    } else if (c == 1) {
                        bzyVar2 = lg.i(ccwVar, bwxVar);
                    } else if (c == 2) {
                        bzzVar = lg.j(ccwVar, bwxVar);
                    } else if (c == 3) {
                        bzzVar2 = lg.j(ccwVar, bwxVar);
                    } else {
                        ccwVar.n();
                        ccwVar.o();
                    }
                }
                ccwVar.l();
                caiVar = new cai(bzyVar, bzyVar2, bzzVar, bzzVar2);
            } else {
                ccwVar.n();
                ccwVar.o();
            }
        }
        ccwVar.l();
        return caiVar == null ? new cai(null, null, null, null) : caiVar;
    }
}
