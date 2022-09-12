package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdnk  reason: default package */
/* loaded from: classes4.dex */
public final class cdnk {
    public final bqso a;
    public final cdjm b;
    public final bbtu c;
    public final cdnt d = new cdnt();
    private final dxio<bqlc> e;
    private final bqkt f;

    public cdnk(dxio<bqlc> dxioVar, bqkt bqktVar, bqso bqsoVar, cdjm cdjmVar, bbtu bbtuVar) {
        this.e = dxioVar;
        this.f = bqktVar;
        this.a = bqsoVar;
        this.b = cdjmVar;
        this.c = bbtuVar;
    }

    private static dqgr c(cdja cdjaVar) {
        cdja cdjaVar2 = cdja.UNKNOWN;
        int ordinal = cdjaVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return dqgr.DRAFT;
            }
            return dqgr.UNKNOWN_REVIEW_STATE;
        }
        return dqgr.PUBLISHED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(cdjd cdjdVar, ilo iloVar, dnqh dnqhVar, dbsg<cdph> dbsgVar, dhpj dhpjVar, mw<ilo> mwVar, Runnable runnable) {
        dxio<bqlc> dxioVar = this.e;
        dbsk.s(dxioVar);
        bqlc a = dxioVar.a();
        bqku c = bqla.c();
        cdsa cdsaVar = (cdsa) cdjdVar;
        int intValue = cdsaVar.b.e().c(0).intValue();
        cdja c2 = cdsaVar.a.c();
        final bqkw k = bqkx.k();
        k.f(intValue);
        k.e((String) cdsaVar.b.b().h(cdng.a).c(""));
        k.c(iloVar.ai());
        k.d(c(c2));
        k.b(cdsaVar.b.h());
        dbsg<eapy> f = cdsaVar.b.f();
        k.getClass();
        bvor.a(f, new mw(k) { // from class: cdnh
            private final bqkw a;

            {
                this.a = k;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                this.a.g((eapy) obj);
            }
        });
        c.b(k.h());
        final bqky h = bqkz.h();
        h.g((chbv) dbsg.j(this.a.b).c(chbv.OBEY_SERVER_RESPONSE));
        h.c(dhpjVar);
        h.d(dnqhVar);
        bvor.a(dbsgVar, new mw(this, h) { // from class: cdne
            private final cdnk a;
            private final bqky b;

            {
                this.a = this;
                this.b = h;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                cdnk cdnkVar = this.a;
                this.b.f(dbsg.j(cdnkVar.d.k().NV((cdph) obj)));
            }
        });
        if (cdsaVar.a.c().equals(cdja.PUBLISHED)) {
            bqks a2 = this.f.a(iloVar);
            a2.d(dcbg.b(cdsaVar.b.a()).s(new dbrn(this) { // from class: cdnf
                private final cdnk a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return ((cdji) obj).a(this.a.c);
                }
            }));
            h.e(a2);
            h.h(iloVar.br() ? 3 : 2);
        }
        c.c(h.a());
        a.b(c.d(), bwrs.a(iloVar), new cdni(this, mwVar, runnable));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, cdja cdjaVar, dnqh dnqhVar, ilo iloVar, mw<ilo> mwVar, Runnable runnable) {
        dxio<bqlc> dxioVar = this.e;
        dbsk.s(dxioVar);
        dxioVar.a().c(str, c(cdjaVar), dnqhVar, bwrs.a(iloVar), new cdnj(mwVar, runnable));
    }
}
