package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bbpi  reason: default package */
/* loaded from: classes3.dex */
class bbpi implements bbni {
    public boolean a = false;
    private final bbmo b;
    private final bbpk c;
    private final Executor d;

    public bbpi(bbpk bbpkVar, bbmo bbmoVar, Executor executor) {
        this.b = bbmoVar;
        this.c = bbpkVar;
        this.d = executor;
    }

    @Override // defpackage.bbni
    public cqkl a() {
        dehn a;
        this.a = true;
        cqkx.p(this);
        bbpk bbpkVar = this.c;
        final bbnc bbncVar = bbpkVar.a;
        final bbmo e = e();
        if (bbncVar.f.e(e.b()) == -1) {
            a = deha.a(bbncVar.f);
        } else {
            btrg btrgVar = bbncVar.a;
            final dpov dpovVar = ((bbmk) bbncVar.f).a.b;
            if (dpovVar == null) {
                dpovVar = dpov.f;
            }
            dcdc f = dcdc.f(e.a());
            dhtx bZ = dhty.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhty dhtyVar = (dhty) bZ.b;
            dpovVar.getClass();
            dhtyVar.b = dpovVar;
            dhtyVar.a = 1 | dhtyVar.a;
            dhty dhtyVar2 = (dhty) bZ.b;
            dsrj<dppl> dsrjVar = dhtyVar2.c;
            if (!dsrjVar.a()) {
                dhtyVar2.c = dsqw.cl(dsrjVar);
            }
            dsod.bv(f, dhtyVar2.c);
            dnqh h = btrg.h(ddda.al);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhty dhtyVar3 = (dhty) bZ.b;
            h.getClass();
            dhtyVar3.d = h;
            dhtyVar3.a |= 2;
            a = deew.h(degp.q(deew.h(deew.h(degp.q(btrgVar.f(btrgVar.d, bZ.bK(), btqk.a, btql.a)), btrg.g(btqm.a), dege.a), new dbrn(dpovVar) { // from class: btqn
                private final dpov a;

                {
                    this.a = dpovVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    dhua dhuaVar = (dhua) obj;
                    return this.a;
                }
            }, dege.a)), new dbrn(bbncVar, e) { // from class: bbmx
                private final bbnc a;
                private final bbmo b;

                {
                    this.a = bbncVar;
                    this.b = e;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    bbnc bbncVar2 = this.a;
                    bbmo bbmoVar = this.b;
                    dpov dpovVar2 = (dpov) obj;
                    bbmn bbmnVar = bbncVar2.f;
                    int e2 = bbmnVar.e(bbmoVar.b());
                    if (e2 != -1) {
                        dpot dpotVar = ((bbmk) bbmnVar).a;
                        dsqp dsqpVar = (dsqp) dpotVar.cu(5);
                        dsqpVar.bC(dpotVar);
                        dpoq dpoqVar = (dpoq) dsqpVar;
                        if (dpoqVar.c) {
                            dpoqVar.bF();
                            dpoqVar.c = false;
                        }
                        dpot dpotVar2 = (dpot) dpoqVar.b;
                        dpotVar2.b();
                        dpotVar2.h.remove(e2);
                        bbmnVar = bbmn.c(dpoqVar.bK());
                    }
                    bbncVar2.f = bbmnVar;
                    return bbncVar2.f;
                }
            }, bbncVar.c);
        }
        deha.q(a, new bbpj(bbpkVar, this), bbpkVar.b);
        a.Pk(new Runnable(this) { // from class: bbph
            private final bbpi a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbpi bbpiVar = this.a;
                bbpiVar.a = false;
                cqkx.p(bbpiVar);
            }
        }, this.d);
        return cqkl.a;
    }

    @Override // defpackage.bbni
    public String b() {
        return this.b.c();
    }

    @Override // defpackage.bbni
    public String c() {
        return this.b.d();
    }

    @Override // defpackage.bbni
    public Boolean d() {
        return Boolean.valueOf(this.a);
    }

    public bbmo e() {
        return this.b;
    }
}
