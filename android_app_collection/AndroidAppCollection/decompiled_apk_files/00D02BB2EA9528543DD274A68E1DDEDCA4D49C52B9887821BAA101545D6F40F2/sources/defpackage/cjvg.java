package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjvg  reason: default package */
/* loaded from: classes.dex */
public final class cjvg implements crzp<btlu> {
    final /* synthetic */ cjvj a;

    public cjvg(cjvj cjvjVar) {
        this.a = cjvjVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        cjvj cjvjVar = this.a;
        btlu l = crzmVar.l();
        if (dbsd.a(cjvjVar.g, l)) {
            return;
        }
        dbsk.l(!btlu.a.equals(l));
        btlu btluVar = cjvjVar.g;
        cjvjVar.g = l;
        boolean p = btlu.p(l);
        boolean equals = btlu.a.equals(btluVar);
        boolean p2 = btlu.p(btluVar);
        if (!equals && !p2) {
            cjvjVar.T(btluVar);
            cjvjVar.S(btluVar, false);
            if (p) {
                cjvjVar.U(btluVar, ddda.ft);
            } else {
                cjvjVar.U(btluVar, ddda.fy);
            }
        } else if (p2) {
            cjvjVar.T(null);
            cjvjVar.S(null, false);
            cjvjVar.U(l, ddda.fs);
        } else {
            dbsk.l(equals);
            if (p) {
                cjvjVar.T(null);
                cjvjVar.S(null, false);
                return;
            }
            dbsk.s(l);
            if (btlu.n(l)) {
                cjvjVar.T(l);
                return;
            }
            btls btlsVar = btls.UNKNOWN;
            dukj dukjVar = dukj.APP_STARTED_COLD;
            int ordinal = l.e.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    cjvjVar.T(l);
                    return;
                } else if (ordinal != 2 && ordinal != 3) {
                    return;
                }
            }
            cjvjVar.T(null);
            cjvjVar.S(null, false);
            cjvjVar.U(l, ddda.fs);
        }
    }
}
