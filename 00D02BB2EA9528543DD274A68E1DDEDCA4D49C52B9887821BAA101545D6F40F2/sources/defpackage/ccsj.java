package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ccsj  reason: default package */
/* loaded from: classes4.dex */
public final class ccsj {
    private static final dcqe g = dcqe.c("ccsj");
    public final ccrh a;
    public final ccst b;
    public final cctx c;
    public final ccsf d;
    public bwrs<ilo> e = bwrs.a(null);
    public dbsg<djgl> f = dbpy.a;
    private final Executor h;
    private final bbtk i;
    private final bbul j;
    private final chhr k;
    private final ccrf l;
    private final akfa m;
    private final ccru n;

    /* JADX INFO: Access modifiers changed from: protected */
    public ccsj(Executor executor, bbtk bbtkVar, bbul bbulVar, chhr chhrVar, ccrh ccrhVar, ccrf ccrfVar, akfa akfaVar, ccst ccstVar, ccru ccruVar, cctx cctxVar, ccsf ccsfVar) {
        this.h = executor;
        this.i = bbtkVar;
        this.j = bbulVar;
        this.k = chhrVar;
        this.a = ccrhVar;
        this.l = ccrfVar;
        this.m = akfaVar;
        this.b = ccstVar;
        this.n = ccruVar;
        this.c = cctxVar;
        this.d = ccsfVar;
    }

    public final void a() {
        if (!this.f.a()) {
            return;
        }
        boolean a = this.d.a();
        this.d.b();
        if (!a) {
            return;
        }
        this.k.b(this.f.b(), dtyc.R, dtyc.S, (ilo) bwrs.b(this.e));
        this.f = dbpy.a;
    }

    public final void b(final ccsi ccsiVar) {
        dehn a;
        ilo c = this.e.c();
        dbsk.s(c);
        String o = this.m.o();
        if (o == null) {
            this.d.b();
            return;
        }
        int e = ccsiVar.e();
        int i = e - 1;
        if (e == 0) {
            throw null;
        }
        if (i == 1) {
            dcbg b = dcbg.b(ccsiVar.c());
            final bbtk bbtkVar = this.i;
            bbtkVar.getClass();
            dcdc<bbtj> z = b.s(new dbrn(bbtkVar) { // from class: ccsa
                private final bbtk a;

                {
                    this.a = bbtkVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return this.a.b((bbtm) obj);
                }
            }).z();
            if (!z.isEmpty()) {
                this.j.h(o, dwyd.OFFERING, bbvh.e(c).f(dgpu.LOCAL), z, cjqm.a);
                this.n.b(dcbg.b(z).s(ccsb.a).z(), new bvqg(this, ccsiVar) { // from class: ccsc
                    private final ccsj a;
                    private final ccsi b;

                    {
                        this.a = this;
                        this.b = ccsiVar;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        ccsj ccsjVar = this.a;
                        ccsi ccsiVar2 = this.b;
                        ccrh ccrhVar = ccsjVar.a;
                        dehn<dhrc> c2 = ccsjVar.b.c(ccsiVar2.a(), ccsiVar2.f(), (List) obj);
                        dgfb b2 = dgfb.b(ccsiVar2.a().b);
                        if (b2 == null) {
                            b2 = dgfb.UNKNOWN_OFFERING_TYPE;
                        }
                        ccrhVar.c(c2, b2, ccsiVar2.f());
                    }
                });
            } else {
                dcdc z2 = dcbg.b(ccsiVar.a().e).s(ccsd.a).z();
                ccrh ccrhVar = this.a;
                dehn<dhrc> c2 = this.b.c(ccsiVar.a(), ccsiVar.f(), z2);
                dgfb b2 = dgfb.b(ccsiVar.a().b);
                if (b2 == null) {
                    b2 = dgfb.UNKNOWN_OFFERING_TYPE;
                }
                ccrhVar.c(c2, b2, ccsiVar.f());
            }
            a = deha.a(c(ccsiVar, z));
        } else if (i == 2) {
            dbsk.g(ccsiVar.b().a(), "Edit submissions need to include the edited offering: %s", ccsiVar);
            int f = ccsiVar.f();
            int i2 = f - 1;
            if (f == 0) {
                throw null;
            }
            if (i2 != 4 && i2 != 6) {
                Object[] objArr = new Object[1];
                int f2 = ccsiVar.f();
                int i3 = f2 - 1;
                if (f2 != 0) {
                    objArr[0] = Integer.valueOf(i3);
                    bvoo.h("Unsupported edit origin: %d", objArr);
                    a = deha.a(dbpy.a);
                } else {
                    throw null;
                }
            } else {
                ccrh ccrhVar2 = this.a;
                dgfb b3 = dgfb.b(ccsiVar.b().b().e);
                if (b3 == null) {
                    b3 = dgfb.UNKNOWN_OFFERING_TYPE;
                }
                ccrhVar2.a(b3);
                a = deew.h(this.l.a(new dbty(this, ccsiVar) { // from class: ccry
                    private final ccsj a;
                    private final ccsi b;

                    {
                        this.a = this;
                        this.b = ccsiVar;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        ccsj ccsjVar = this.a;
                        ccsi ccsiVar2 = this.b;
                        ccst ccstVar = ccsjVar.b;
                        ccln b4 = ccsiVar2.b().b();
                        ccxa ccxaVar = ccsiVar2.a().c;
                        if (ccxaVar == null) {
                            ccxaVar = ccxa.f;
                        }
                        String str = ccxaVar.b;
                        String str2 = ccsiVar2.a().f;
                        dgfg dgfgVar = ccsiVar2.a().l;
                        if (dgfgVar == null) {
                            dgfgVar = dgfg.d;
                        }
                        return ccstVar.a(b4, str, str2, dgfgVar);
                    }
                }), new dbrn(this, ccsiVar) { // from class: ccrz
                    private final ccsj a;
                    private final ccsi b;

                    {
                        this.a = this;
                        this.b = ccsiVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        djoz djozVar = (djoz) obj;
                        return this.a.c(this.b, dcdc.e());
                    }
                }, dege.a);
            }
        } else {
            bvoo.h("Unsupported submission: %s", ccsiVar);
            a = deha.a(dbpy.a);
        }
        bvqj.e(a, new bvqg(this) { // from class: ccrx
            private final ccsj a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                final ccsj ccsjVar = this.a;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar == null || !dbsgVar.a()) {
                    ccsjVar.d.b();
                } else {
                    ccsjVar.c.a((djhq) dbsgVar.b(), new cctw(ccsjVar) { // from class: ccse
                        private final ccsj a;

                        {
                            this.a = ccsjVar;
                        }

                        @Override // defpackage.cctw
                        public final void a(djgl djglVar) {
                            ccsj ccsjVar2 = this.a;
                            ccsjVar2.f = dbsg.i(djglVar);
                            ccsjVar2.a();
                        }
                    });
                }
            }
        }, this.h);
    }

    public final dbsg<djhq> c(ccsi ccsiVar, dcdc<bbtj> dcdcVar) {
        if (!ccsiVar.d()) {
            return dbpy.a;
        }
        dgfb b = dgfb.b(ccsiVar.a().b);
        if (b == null) {
            b = dgfb.UNKNOWN_OFFERING_TYPE;
        }
        ilo c = this.e.c();
        dbsk.s(c);
        bbvj bbvjVar = new bbvj(c.ai(), dcdcVar);
        return dbsg.i(cctx.c(b, ccsiVar.f(), bbvjVar, bbvjVar.b));
    }
}
