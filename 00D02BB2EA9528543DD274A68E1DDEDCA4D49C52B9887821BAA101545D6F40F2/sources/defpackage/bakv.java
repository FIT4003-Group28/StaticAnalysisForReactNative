package defpackage;
/* compiled from: PG */
/* renamed from: bakv  reason: default package */
/* loaded from: classes3.dex */
public final class bakv implements bwrr<ilo> {
    public final dxio<axwi> a;
    private final btpc b;
    private final bwqv c;
    private final befw d;
    @dzsi
    private bakt e;
    private final dcdn<drdg, bwrs<ilo>> f;

    public bakv(btpc btpcVar, bwqv bwqvVar, befw befwVar, dxio<axwi> dxioVar, dcdc<drdg> dcdcVar) {
        this.b = btpcVar;
        this.c = bwqvVar;
        this.d = befwVar;
        this.a = dxioVar;
        dcbg b = dcbg.b(dcdcVar);
        this.f = dcjz.n(b.a().iterator(), bakl.a);
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            drdg drdgVar = dcdcVar.get(i);
            this.c.g(f(drdgVar), this);
            e(drdgVar);
        }
    }

    public static baku b(drdg drdgVar, dccr<dltm> dccrVar) {
        final dpum dpumVar = drdgVar.f;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        dbsg r = dcbg.b(dccrVar).r(new dbsl(dpumVar) { // from class: bakp
            private final dpum a;

            {
                this.a = dpumVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int a;
                dpum dpumVar2 = this.a;
                dltm dltmVar = (dltm) obj;
                dlug dlugVar = dltmVar.c;
                if (dlugVar == null) {
                    dlugVar = dlug.c;
                }
                return bakv.c(dpumVar2, dlugVar) && (a = dltj.a(dltmVar.d)) != 0 && a == 6;
            }
        });
        if (r.a()) {
            return new baku(6, ((dltm) r.b()).f);
        }
        return dcbg.b(dccrVar).p(new dbsl(dpumVar) { // from class: bakq
            private final dpum a;

            {
                this.a = dpumVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int a;
                dpum dpumVar2 = this.a;
                dltm dltmVar = (dltm) obj;
                dlug dlugVar = dltmVar.c;
                if (dlugVar == null) {
                    dlugVar = dlug.c;
                }
                return bakv.c(dpumVar2, dlugVar) && (a = dltj.a(dltmVar.d)) != 0 && a == 2;
            }
        }) ? baku.b() : baku.a();
    }

    public static boolean c(dpum dpumVar, dlug dlugVar) {
        akqr a = akqs.a();
        dwzj dwzjVar = (dlugVar.a == 1 ? (dluc) dlugVar.b : dluc.d).b;
        if (dwzjVar == null) {
            dwzjVar = dwzj.d;
        }
        int i = dwzjVar.b;
        dwzj dwzjVar2 = (dlugVar.a == 1 ? (dluc) dlugVar.b : dluc.d).b;
        if (dwzjVar2 == null) {
            dwzjVar2 = dwzj.d;
        }
        a.d(akqq.c(i, dwzjVar2.c));
        dwzj dwzjVar3 = (dlugVar.a == 1 ? (dluc) dlugVar.b : dluc.d).c;
        if (dwzjVar3 == null) {
            dwzjVar3 = dwzj.d;
        }
        int i2 = dwzjVar3.b;
        dwzj dwzjVar4 = (dlugVar.a == 1 ? (dluc) dlugVar.b : dluc.d).c;
        if (dwzjVar4 == null) {
            dwzjVar4 = dwzj.d;
        }
        a.d(akqq.c(i2, dwzjVar4.c));
        return a.b().b(new akqq(dpumVar.b, dpumVar.c));
    }

    private final void e(drdg drdgVar) {
        befw befwVar = this.d;
        befu p = befv.p();
        p.j(f(drdgVar));
        p.l(true);
        p.k(true);
        befwVar.d(p.m());
    }

    private final bwrs<ilo> f(drdg drdgVar) {
        bwrs<ilo> bwrsVar = this.f.get(drdgVar);
        if (bwrsVar != null) {
            return bwrsVar;
        }
        ily ilyVar = new ily();
        ilyVar.w(drdgVar);
        return bwrs.a(ilyVar.d());
    }

    private final ilo g(drdg drdgVar) {
        ilo c = f(drdgVar).c();
        dbsk.s(c);
        return c;
    }

    private final boolean h(drdg drdgVar) {
        return i(g(drdgVar));
    }

    private static boolean i(@dzsi ilo iloVar) {
        return (iloVar == null || iloVar.ak() == null || !iloVar.f) ? false : true;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi ilo iloVar) {
        ilo iloVar2 = iloVar;
        if (this.e == null || !i(iloVar2)) {
            return;
        }
        bakt baktVar = this.e;
        dbsk.s(baktVar);
        baktVar.a(iloVar2);
        this.e = null;
    }

    public final void a(drdg drdgVar, bakt baktVar) {
        if (h(drdgVar)) {
            baktVar.a(g(drdgVar));
        } else if (!this.b.i()) {
            baktVar.a(null);
        } else {
            this.e = baktVar;
            e(drdgVar);
        }
    }

    public final void d(final drdg drdgVar, final barb barbVar) {
        if (h(drdgVar)) {
            deha.q(this.a.a().g(), new baks(g(drdgVar), barbVar), dege.a);
        } else if (!this.b.i()) {
            barbVar.a(null, null);
        } else {
            a(drdgVar, new bakt(this, drdgVar, barbVar) { // from class: bakm
                private final bakv a;
                private final drdg b;
                private final barb c;

                {
                    this.a = this;
                    this.b = drdgVar;
                    this.c = barbVar;
                }

                @Override // defpackage.bakt
                public final void a(ilo iloVar) {
                    this.a.d(this.b, this.c);
                }
            });
        }
    }
}
