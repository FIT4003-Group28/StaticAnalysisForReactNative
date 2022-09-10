package defpackage;
/* compiled from: PG */
/* renamed from: cfzv  reason: default package */
/* loaded from: classes4.dex */
final class cfzv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ilo a(btvo btvoVar, dwmk dwmkVar, dbsg<docg> dbsgVar) {
        dwlh dwlhVar = dwmkVar.c;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        final ily ilyVar = new ily();
        dniu dniuVar = dwlhVar.b;
        if (dniuVar == null) {
            dniuVar = dniu.i;
        }
        ilyVar.k(dniuVar.b);
        ilyVar.F(dwlhVar.c);
        if ((dwmkVar.a & 8) != 0 && dwmkVar.f != 0) {
            docc bZ = docg.M.bZ();
            int i = dwmkVar.f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            docg docgVar = (docg) bZ.b;
            docgVar.a |= 512;
            docgVar.q = i;
            ilyVar.v(bZ.bK());
        }
        for (dwle dwleVar : dwlhVar.g) {
            if (!dwleVar.c.isEmpty()) {
                ilyVar.e(dwleVar.c);
            }
        }
        if (btvoVar.getEnableFeatureParameters().aB) {
            dpum dpumVar = dwlhVar.d;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            ilyVar.q(akqq.f(dpumVar));
        }
        if ((dwmkVar.a & 4096) != 0) {
            doch bZ2 = docm.i.bZ();
            String str = dwmkVar.n;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            docm docmVar = (docm) bZ2.b;
            str.getClass();
            docmVar.a |= 8;
            docmVar.e = str;
            ilyVar.B(bZ2.bK());
        }
        bvor.a(dbsgVar, new mw(ilyVar) { // from class: cfzu
            private final ily a;

            {
                this.a = ilyVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.u((docg) obj);
            }
        });
        ilyVar.H(dwlhVar.j);
        ilyVar.q = dwlhVar.k;
        return ilyVar.d();
    }
}
