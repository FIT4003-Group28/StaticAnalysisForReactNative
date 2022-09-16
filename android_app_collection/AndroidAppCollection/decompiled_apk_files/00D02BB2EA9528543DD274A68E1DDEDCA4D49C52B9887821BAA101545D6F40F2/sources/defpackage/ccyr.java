package defpackage;
/* compiled from: PG */
/* renamed from: ccyr  reason: default package */
/* loaded from: classes4.dex */
public class ccyr implements ccxd {
    public final ff a;
    public final dxio<cclq> b;
    private final gft e;
    private final chhr f;
    private final ccrh g;
    private final cctx h;
    private final ccyc i;
    public final ccxw c = new ccxw();
    private dbsg<chmz> j = dbpy.a;
    public ccwm d = ccwm.j;

    public ccyr(ff ffVar, dxio<cclq> dxioVar, ccyl ccylVar, chhr chhrVar, ccrh ccrhVar, cctx cctxVar, gft gftVar) {
        this.a = ffVar;
        this.b = dxioVar;
        this.e = gftVar;
        this.f = chhrVar;
        this.g = ccrhVar;
        this.h = cctxVar;
        this.i = new ccyc(ccylVar);
    }

    @Override // defpackage.ccxd
    public cqkl a(@dzsi cjqm cjqmVar) {
        if (((ges) this.e).aD) {
            ccrh ccrhVar = this.g;
            dgfb b = dgfb.b(this.d.h);
            if (b == null) {
                b = dgfb.UNKNOWN_OFFERING_TYPE;
            }
            ccwm ccwmVar = this.d;
            int i = ccwmVar.e + ccwmVar.f;
            int i2 = ccwmVar.i;
            int i3 = ccwmVar.g;
            cjst d = cjsu.d();
            d.d(ddda.eo);
            cjry e = cjrz.e();
            e.b(ddcu.B);
            dddf bZ = dddg.g.bZ();
            dddj bZ2 = dddk.h.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dddk dddkVar = (dddk) bZ2.b;
            dddkVar.b = b.f;
            int i4 = dddkVar.a | 1;
            dddkVar.a = i4;
            int i5 = i4 | 4;
            dddkVar.a = i5;
            dddkVar.d = i;
            int i6 = i5 | 8;
            dddkVar.a = i6;
            dddkVar.e = i2;
            dddkVar.a = i6 | 16;
            dddkVar.f = i3;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dddg dddgVar = (dddg) bZ.b;
            dddk bK = bZ2.bK();
            bK.getClass();
            dddgVar.f = bK;
            dddgVar.a |= 128;
            ((cjrn) e).b = bZ.bK();
            d.f(e.a());
            ccrh.b(d, cjqmVar);
            ccrhVar.l.l(d.e());
            jmw.d(this.a, null);
            this.a.g().f();
        }
        return cqkl.a;
    }

    @Override // defpackage.ccxd
    public Boolean b() {
        return Boolean.valueOf(this.i.a());
    }

    @Override // defpackage.ccxd
    public cqkl c() {
        this.i.b(true);
        return cqkl.a;
    }

    @Override // defpackage.ccxd
    public ccxb d() {
        return this.i.c;
    }

    @Override // defpackage.ccxd
    public ccxb e() {
        return this.i.d;
    }

    @Override // defpackage.ccxd
    public ccxb f() {
        return this.i.e;
    }

    @Override // defpackage.ccxd
    @dzsi
    public chmz g() {
        return this.j.f();
    }

    @Override // defpackage.ccxd
    public ccxc h() {
        return this.c;
    }

    public void i(ccwb ccwbVar, ccwm ccwmVar) {
        boolean z = true;
        if (1 != ((ccwmVar.a & 1) ^ 1)) {
            z = false;
        }
        dbsk.l(z);
        this.d = ccwmVar;
        this.i.a = new ccyp(this);
        final ccyc ccycVar = this.i;
        dbsk.a(ccyb.c(ccwbVar));
        ccycVar.d.z(new ccyh(ccycVar) { // from class: ccxx
            private final ccyc a;

            {
                this.a = ccycVar;
            }

            @Override // defpackage.ccyh
            public final void a() {
                this.a.b(false);
            }
        });
        ccycVar.d.B(new ccyj(ccycVar) { // from class: ccxy
            private final ccyc a;

            {
                this.a = ccycVar;
            }

            @Override // defpackage.ccyj
            public final void a() {
                ccyc ccycVar2 = this.a;
                if (ccycVar2.a()) {
                    ccwb ccwbVar2 = ccycVar2.b;
                    int i = ccwbVar2.c;
                    ccvz a = ccwi.e.a(Integer.valueOf(ccwbVar2.b.get(i).d.f(ccycVar2.b.d)));
                    if (a.equals(ccvz.OFFERING_NAME) || a.equals(ccvz.OFFERING_NAME_WITH_SUGGEST)) {
                        ccya ccyaVar = ccycVar2.a;
                        ccwk ccwkVar = ccycVar2.b.e;
                        if (ccwkVar == null) {
                            ccwkVar = ccwk.m;
                        }
                        ccyaVar.c(ccwkVar);
                    }
                    ccycVar2.b(true);
                }
            }
        });
        ccycVar.b = ccwbVar;
        if (ccwbVar.c != 0 || ccwbVar.d != 0) {
            ccycVar.a.d(6);
        } else {
            ccycVar.a.d(2);
        }
        ccycVar.c(ccyb.a, ccwbVar);
    }

    public void k(final ccyq ccyqVar) {
        this.i.d.A(new ccyi(ccyqVar) { // from class: ccym
            private final ccyq a;

            {
                this.a = ccyqVar;
            }

            @Override // defpackage.ccyi
            public final void a(dgfb dgfbVar, String str, String str2, ccxa ccxaVar) {
                ccko cckoVar = ((cckn) this.a).a;
                if (!cckoVar.aD) {
                    return;
                }
                cckoVar.a.a().i(dgfbVar, str, str2, ccxaVar, ccme.f, cckoVar);
            }
        });
    }

    public ccyc l() {
        return this.i;
    }

    public ccwm m() {
        return this.d;
    }

    public void n(ccwu ccwuVar, dgfg dgfgVar) {
        this.i.d.G(ccwuVar.b, dgfgVar);
    }

    public final void o() {
        bbud bbudVar;
        if ((this.d.a & 4) != 0) {
            ily ilyVar = new ily();
            ilyVar.k(this.d.d);
            bbudVar = bbud.c(ilyVar.d());
        } else {
            bbudVar = null;
        }
        ccwm ccwmVar = this.d;
        djhq c = cctx.c(dgfb.UNKNOWN_OFFERING_TYPE, 2, new bbvj(bbudVar, ccwmVar.e, ccwmVar.f), this.d.g);
        dsqp dsqpVar = (dsqp) c.cu(5);
        dsqpVar.bC(c);
        djgx djgxVar = (djgx) dsqpVar;
        djgw b = chiw.b(true, false, false);
        if (djgxVar.c) {
            djgxVar.bF();
            djgxVar.c = false;
        }
        djhq djhqVar = (djhq) djgxVar.b;
        djhq djhqVar2 = djhq.j;
        b.getClass();
        djhqVar.b = b;
        djhqVar.a = 1 | djhqVar.a;
        this.h.a(djgxVar.bK(), new cctw(this) { // from class: ccyn
            private final ccyr a;

            {
                this.a = this;
            }

            @Override // defpackage.cctw
            public final void a(djgl djglVar) {
                ccyr ccyrVar = this.a;
                ccwm ccwmVar2 = ccyrVar.d;
                dsqp dsqpVar2 = (dsqp) ccwmVar2.cu(5);
                dsqpVar2.bC(ccwmVar2);
                ccwl ccwlVar = (ccwl) dsqpVar2;
                if (ccwlVar.c) {
                    ccwlVar.bF();
                    ccwlVar.c = false;
                }
                ccwm ccwmVar3 = (ccwm) ccwlVar.b;
                ccwm ccwmVar4 = ccwm.j;
                djglVar.getClass();
                ccwmVar3.b = djglVar;
                ccwmVar3.a |= 1;
                ccyrVar.d = ccwlVar.bK();
                ccyrVar.p();
                cqkx.p(ccyrVar);
            }
        });
    }

    public final void p() {
        chhr chhrVar = this.f;
        djgl djglVar = this.d.b;
        if (djglVar == null) {
            djglVar = djgl.g;
        }
        djgl djglVar2 = djglVar;
        ddho ddhoVar = dtxx.i;
        ddho ddhoVar2 = dtxx.j;
        final Runnable runnable = new Runnable(this) { // from class: ccyo
            private final ccyr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(null);
            }
        };
        this.j = dbsg.i(chhrVar.d.a(djglVar2, new chlr(runnable) { // from class: chhq
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // defpackage.chlr
            public final void q(boolean z) {
                this.a.run();
            }
        }, ddhoVar, ddhoVar2, null, chhrVar.e));
    }

    public void j(ccwm ccwmVar) {
        this.d = ccwmVar;
        if (!ccwmVar.c) {
            if ((ccwmVar.a & 1) == 0) {
                o();
            } else {
                p();
            }
            ccxw ccxwVar = this.c;
            ccxwVar.h = null;
            ccxwVar.i = ccxw.f(ccxw.g);
            ccxwVar.j = null;
            ccxwVar.l = ccxw.f(ccxw.f);
            ccxwVar.k = null;
            return;
        }
        a(null);
    }
}
