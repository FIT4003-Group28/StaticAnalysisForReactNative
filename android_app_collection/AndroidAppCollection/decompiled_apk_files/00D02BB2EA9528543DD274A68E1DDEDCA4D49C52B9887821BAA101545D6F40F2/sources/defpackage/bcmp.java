package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bcmp  reason: default package */
/* loaded from: classes3.dex */
public final class bcmp implements bbup {
    final /* synthetic */ bcmu a;

    public bcmp(bcmu bcmuVar) {
        this.a = bcmuVar;
    }

    @Override // defpackage.bbup
    public final void c() {
    }

    @Override // defpackage.bbup
    public final void j() {
        dbsg dbsgVar;
        this.a.K();
        if (!this.a.p.isEmpty()) {
            bcmu bcmuVar = this.a;
            bbuq bbuqVar = bcmuVar.l;
            if ((bbuqVar instanceof ckna) && ((ckna) bbuqVar).j) {
                if (bcmuVar.k.n(bcmuVar.m)) {
                    bcmu bcmuVar2 = this.a;
                    dweu dweuVar = bcmuVar2.o;
                    if (dweuVar.j) {
                        bcbx a = bcmuVar2.f.a();
                        if (a != null) {
                            dcdc<bclt> d = a.d();
                            int size = d.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    dbsgVar = dbpy.a;
                                    break;
                                }
                                bclt bcltVar = d.get(i);
                                i++;
                                if (bcltVar.k().equals(dweuVar.d)) {
                                    dbsgVar = dbsg.i(bcltVar);
                                    break;
                                }
                            }
                        } else {
                            dbsgVar = dbpy.a;
                        }
                        dwfl e = this.a.l.e(0);
                        if (e != null && dbsgVar.a()) {
                            bclt bcltVar2 = (bclt) dbsgVar.b();
                            bcltVar2.f(e);
                            bcltVar2.g(false);
                            bcltVar2.h(this.a.p.get(0).j().toString());
                        }
                    }
                }
                bcmu bcmuVar3 = this.a;
                bcmuVar3.k.a(bcmuVar3.m);
            }
        }
        if (!this.a.h.c()) {
            cqkx.p(this.a);
        } else if (this.a.r == null) {
            bvoo.h("For the collections UI, always register a mediaFetchedListener.", new Object[0]);
        } else {
            this.a.r.d();
        }
    }

    @Override // defpackage.bbup
    public final void k(dbsg<bttq> dbsgVar) {
        bclf.c(((bclf) this.a.j).b);
        bcmu bcmuVar = this.a;
        bcmuVar.q = bccu.a(dcdc.r(bcmuVar.p), this.a.q);
        cqkx.p(this.a);
    }
}
