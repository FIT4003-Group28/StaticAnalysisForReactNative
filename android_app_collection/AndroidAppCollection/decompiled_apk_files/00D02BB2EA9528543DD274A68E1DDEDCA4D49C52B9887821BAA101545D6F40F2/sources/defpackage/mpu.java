package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: mpu  reason: default package */
/* loaded from: classes7.dex */
public class mpu implements mox {
    @dzsi
    public final axxb a;
    @dzsi
    public final axwi b;
    public final bvrb c;
    public ldm d;
    @dzsi
    public cqtd e;
    public boolean f;
    public cjtd g;
    private final kdi h;
    private final nop i;
    private final mpt j;
    private final mqf k;
    private final mqc l;
    private final mpn m;
    private final akfa n;
    private final Boolean o;
    private final kdk p;
    private final btvo q;

    public mpu(cqat cqatVar, ldm ldmVar, cqkj cqkjVar, final mpt mptVar, ksh kshVar, mor morVar, boolean z, npo npoVar, nop nopVar, kdi kdiVar, @dzsi axxb axxbVar, @dzsi axwi axwiVar, cqhn cqhnVar, bvrb bvrbVar, akfa akfaVar, boolean z2, kdk kdkVar, btvo btvoVar) {
        this.d = ldmVar;
        this.j = mptVar;
        this.i = nopVar;
        this.h = kdiVar;
        this.a = axxbVar;
        this.b = axwiVar;
        this.c = bvrbVar;
        this.n = akfaVar;
        this.o = Boolean.valueOf(!z2);
        this.p = kdkVar;
        this.q = btvoVar;
        mpn mpnVar = new mpn(kshVar, ldmVar, cjtd.a(dtxm.cT));
        this.m = mpnVar;
        Context context = cqkjVar.d;
        mptVar.getClass();
        Runnable runnable = new Runnable(mptVar) { // from class: mpo
            private final mpt a;

            {
                this.a = mptVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                mik mikVar = (mik) this.a;
                ldm b = ldm.b(mikVar.a.s.d);
                if (b == null) {
                    bvoo.h("parent was null for waypoint: %s", mikVar.a.s);
                    return;
                }
                mio mioVar = mikVar.a;
                nop nopVar2 = mioVar.m;
                kdi kdiVar2 = mioVar.l;
                ksr ksrVar = mioVar.e;
                vup vupVar = mioVar.f;
                kdk kdkVar2 = kdk.NOTHING;
                mnz mnzVar = mnz.PLACE_CARD_CHILD_ENTITY;
                mio mioVar2 = mikVar.a;
                nopVar2.k(kdiVar2.c(b, ksrVar, vupVar, kdkVar2, mnzVar, false, false, mioVar2.r, null, mioVar2.i, mioVar2.m));
            }
        };
        mptVar.getClass();
        Runnable runnable2 = new Runnable(mptVar) { // from class: mpp
            private final mpt a;

            {
                this.a = mptVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dnjf ad;
                mik mikVar = (mik) this.a;
                ilo iloVar = mikVar.a.s.d;
                if (iloVar == null || (ad = iloVar.ad()) == null) {
                    return;
                }
                if (ad.b.size() == 1) {
                    doex doexVar = ad.b.get(0);
                    ldm c = ldm.c(akqi.b(doexVar.d), doexVar.b);
                    mio mioVar = mikVar.a;
                    nop nopVar2 = mioVar.m;
                    kdi kdiVar2 = mioVar.l;
                    ksr ksrVar = mioVar.e;
                    vup vupVar = mioVar.f;
                    kdk kdkVar2 = kdk.NOTHING;
                    mnz mnzVar = mnz.PLACE_CARD_HOST_EV_STATION;
                    dcdc<ldm> dcdcVar = mikVar.a.r;
                    cjsz cjszVar = new cjsz(dtxm.cK);
                    mio mioVar2 = mikVar.a;
                    nopVar2.k(kdiVar2.c(c, ksrVar, vupVar, kdkVar2, mnzVar, false, false, dcdcVar, cjszVar, mioVar2.i, mioVar2.m));
                    return;
                }
                mio mioVar3 = mikVar.a;
                mioVar3.m.k(mioVar3.l.v(mioVar3.r, ad, new mij(mikVar), mikVar.a.m));
            }
        };
        mptVar.getClass();
        this.k = new mqf(context, cqatVar, ldmVar, kdkVar, npoVar, z, mpnVar, runnable, runnable2, new Runnable(mptVar) { // from class: mpq
            private final mpt a;

            {
                this.a = mptVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                mio mioVar = ((mik) this.a).a;
                koe.a(mioVar.m, mioVar.l, mioVar.s);
            }
        });
        this.l = new mqc(cqkjVar.d, ldmVar, mptVar, morVar);
        this.e = null;
        this.f = true;
        this.g = cjtd.a(dtxm.cS);
    }

    @Override // defpackage.mox
    public mpe a() {
        return this.k;
    }

    @Override // defpackage.mox
    public mpc b() {
        return this.l;
    }

    @Override // defpackage.mox
    public mow c() {
        return this.m;
    }

    @Override // defpackage.mox
    public Boolean d() {
        return Boolean.valueOf(npo.a(this.d));
    }

    @Override // defpackage.mox
    public cqkl e() {
        ((mik) this.j).a.m.b();
        return cqkl.a;
    }

    @Override // defpackage.mox
    public cqkl f() {
        ((mik) this.j).a.m.a();
        return cqkl.a;
    }

    @Override // defpackage.mox
    public cqkl g() {
        this.i.k(this.h.u(this.d));
        return cqkl.a;
    }

    @Override // defpackage.mox
    public Boolean h() {
        boolean z = false;
        if (this.n.j() == null) {
            return false;
        }
        if (this.q.getCarParameters().i && !this.f && this.n.j().u() && this.p != kdk.NAVIGATE) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mox
    public Boolean i() {
        return this.o;
    }

    @Override // defpackage.mox
    @dzsi
    public cqtd j() {
        if (this.d == null) {
            this.f = true;
        }
        return this.e;
    }

    @Override // defpackage.mox
    public cjtd k() {
        return this.g;
    }

    @Override // defpackage.mox
    public Boolean l() {
        return Boolean.valueOf(this.p == kdk.NAVIGATE);
    }

    public void m(ldm ldmVar) {
        this.d = ldmVar;
        this.k.f(ldmVar);
        this.m.e(ldmVar);
        if (this.q.getCarParameters().i && this.p != kdk.NAVIGATE) {
            this.c.b(new Runnable(this) { // from class: mpr
                private final mpu a;

                {
                    this.a = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r7 = this;
                        mpu r0 = r7.a
                        r1 = 1
                        r0.f = r1
                        axwi r2 = r0.b
                        if (r2 == 0) goto Ldc
                        baab r3 = defpackage.baab.FAVORITES
                        dehn r2 = r2.i(r3)
                        java.lang.Object r2 = defpackage.deha.s(r2)
                        baad r2 = (defpackage.baad) r2
                        axwi r3 = r0.b
                        baab r4 = defpackage.baab.WANT_TO_GO
                        dehn r3 = r3.i(r4)
                        java.lang.Object r3 = defpackage.deha.s(r3)
                        baad r3 = (defpackage.baad) r3
                        axwi r4 = r0.b
                        dehn r4 = r4.f()
                        java.lang.Object r4 = defpackage.deha.s(r4)
                        java.util.List r4 = (java.util.List) r4
                        if (r2 == 0) goto L45
                        java.lang.Boolean r2 = r0.o(r2)
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L45
                        dprc r1 = defpackage.dprc.FAVORITES_ENTITY_LIST
                        cqtd r1 = defpackage.nqu.ak(r1)
                        r0.e = r1
                        goto Ld0
                    L45:
                        if (r3 == 0) goto L5b
                        java.lang.Boolean r2 = r0.o(r3)
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L5b
                        dprc r1 = defpackage.dprc.WANT_TO_GO_ENTITY_LIST
                        cqtd r1 = defpackage.nqu.ak(r1)
                        r0.e = r1
                        goto Ld0
                    L5b:
                        ldm r2 = r0.d
                        ilo r2 = r2.d
                        r3 = 0
                        if (r2 == 0) goto L6b
                        axxb r5 = r0.a
                        if (r5 == 0) goto L6b
                        boolean r2 = r5.a(r2)     // Catch: defpackage.axxc -> L6b
                        goto L6c
                    L6b:
                        r2 = 0
                    L6c:
                        java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L7f
                        dprc r1 = defpackage.dprc.STARRED_ENTITY_LIST
                        cqtd r1 = defpackage.nqu.ak(r1)
                        r0.e = r1
                        goto Ld0
                    L7f:
                        int r2 = r4.size()
                        if (r2 <= 0) goto Lbf
                        java.util.Iterator r2 = r4.iterator()
                    L89:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto Lac
                        java.lang.Object r4 = r2.next()
                        baad r4 = (defpackage.baad) r4
                        baab r5 = r4.o()
                        baab r6 = defpackage.baab.CUSTOM
                        if (r5 != r6) goto L89
                        java.lang.Boolean r4 = r0.o(r4)
                        boolean r4 = r4.booleanValue()
                        if (r4 == 0) goto L89
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                        goto Lb0
                    Lac:
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
                    Lb0:
                        boolean r1 = r1.booleanValue()
                        if (r1 == 0) goto Lbf
                        dprc r1 = defpackage.dprc.CUSTOM_ENTITY_LIST
                        cqtd r1 = defpackage.nqu.ak(r1)
                        r0.e = r1
                        goto Ld0
                    Lbf:
                        r1 = 2131886184(0x7f120068, float:1.940694E38)
                        iuw r1 = defpackage.nqu.aG(r1)
                        r0.e = r1
                        ddho r1 = defpackage.dtxm.cR
                        cjtd r1 = defpackage.cjtd.a(r1)
                        r0.g = r1
                    Ld0:
                        bvrb r1 = r0.c
                        mps r2 = new mps
                        r2.<init>(r0)
                        bvrj r0 = defpackage.bvrj.UI_THREAD
                        r1.b(r2, r0)
                    Ldc:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mpr.run():void");
                }
            }, bvrj.BACKGROUND_THREADPOOL);
        }
        cqkx.p(this);
        this.f = false;
    }

    public void n() {
        this.l.a.f();
    }

    public final Boolean o(baad baadVar) {
        ilo iloVar = this.d.d;
        if (iloVar == null) {
            return false;
        }
        return Boolean.valueOf(baadVar.h(azxb.f(iloVar.ai(), iloVar.aj())));
    }
}
