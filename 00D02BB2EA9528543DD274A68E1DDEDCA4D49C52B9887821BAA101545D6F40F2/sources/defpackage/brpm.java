package defpackage;
/* compiled from: PG */
/* renamed from: brpm  reason: default package */
/* loaded from: classes4.dex */
public final class brpm {
    public final ckcw a;
    public final btvo b;
    public final bwqv c;
    public final cjqy d;
    public final brat e;
    private final dxio<begg> f;

    public brpm(ckcw ckcwVar, btvo btvoVar, bwqv bwqvVar, dxio<begg> dxioVar, cjqy cjqyVar, brat bratVar) {
        this.a = ckcwVar;
        this.b = btvoVar;
        this.c = bwqvVar;
        this.f = dxioVar;
        this.d = cjqyVar;
        this.e = bratVar;
    }

    public final void a(brlu brluVar) {
        if (!this.b.getPlaceSheetParameters().V() || !b(brluVar, brluVar.F(), brlt.FIRST_RESULT)) {
            return;
        }
        ((ckco) this.a.a(ckix.d)).a(ckiw.a(1));
    }

    public final boolean b(brlu brluVar, @dzsi ilo iloVar, brlt brltVar) {
        bwrs<ilo> bwrsVar;
        synchronized (brluVar) {
            bwrsVar = null;
            if (iloVar != null) {
                int n = brluVar.n(iloVar);
                if (n >= 0) {
                    bwrsVar = brluVar.i(n);
                }
            }
        }
        ilo iloVar2 = (ilo) bwrs.b(bwrsVar);
        if (bwrsVar == null || iloVar2 == null || (iloVar2.f && !iloVar2.j())) {
            return false;
        }
        befu p = befv.p();
        p.j(bwrsVar);
        p.e(true);
        dnqh cc = iloVar2.cc(cjqm.a);
        dsqp dsqpVar = (dsqp) cc.cu(5);
        dsqpVar.bC(cc);
        dnqg dnqgVar = (dnqg) dsqpVar;
        if (dnqgVar.c) {
            dnqgVar.bF();
            dnqgVar.c = false;
        }
        dnqh dnqhVar = (dnqh) dnqgVar.b;
        dnqh dnqhVar2 = dnqh.p;
        dnqhVar.a |= 2048;
        dnqhVar.j = true;
        befp befpVar = (befp) p;
        befpVar.a = dnqgVar.bK();
        befpVar.b = bdyb.bM(this.b);
        befpVar.g = begi.SEARCH_LIST_RESULT;
        boolean r = this.f.a().r(p.m());
        if (r) {
            synchronized (brluVar.r) {
                if (!brluVar.r.containsKey(bwrsVar)) {
                    brluVar.r.put(bwrsVar, brltVar);
                }
            }
        }
        return r;
    }
}
