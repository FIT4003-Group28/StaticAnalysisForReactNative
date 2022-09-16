package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: arfg  reason: default package */
/* loaded from: classes2.dex */
public final class arfg extends itb implements arfm {
    public final dxio<qbt> a;
    @dzsi
    public ared c;
    private final gga e;
    private final btrm f;
    private final dxio<akfa> g;
    private final dxio<hwd> h;
    private final aree i;
    private final alhv k;
    private Handler o;
    private cryz<akox> r;
    final bwrs<arfk> b = bwrs.a(arfk.b);
    public boolean d = false;
    private boolean j = true;
    private final Runnable p = new arfe(this);
    private final alht q = new arff(this);

    public arfg(gga ggaVar, btrm btrmVar, dxio<akfa> dxioVar, dxio<hwd> dxioVar2, dxio<qbt> dxioVar3, aree areeVar, alhv alhvVar) {
        this.e = ggaVar;
        this.f = btrmVar;
        this.g = dxioVar;
        this.h = dxioVar2;
        this.a = dxioVar3;
        this.i = areeVar;
        this.k = alhvVar;
    }

    private final void H(ared aredVar) {
        if (E()) {
            j();
        }
        this.c = aredVar;
        if (this.d) {
            aredVar.d();
        }
        D();
        s();
    }

    @dzsi
    private final btlu I() {
        return this.g.a().j();
    }

    private final void J() {
        bvrj.UI_THREAD.c();
        ared aredVar = this.c;
        if (aredVar != null) {
            bvrj.UI_THREAD.c();
            if (aredVar.e) {
                aredVar.f();
                aredVar.i();
            }
            aredVar.f = true;
            this.c = null;
        }
    }

    @Override // defpackage.arfm
    public final void B(dvcj dvcjVar) {
        arhi arhiVar = new arhi();
        Bundle bundle = new Bundle();
        bundle.putByteArray("feature_details_proto", dvcjVar.bS());
        arhiVar.B(bundle);
        this.e.D(arhiVar);
    }

    @Override // defpackage.arfm
    public final bwrs<arfk> C() {
        return this.b;
    }

    public final void D() {
        if (E()) {
            if (w()) {
                ared aredVar = this.c;
                aredVar.h = true;
                aredVar.g();
                return;
            }
            this.c.f();
        }
    }

    public final boolean E() {
        return this.c != null && this.d;
    }

    public final void F(alar alarVar) {
        if (!this.j || !w()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("clickable", alarVar);
        this.e.D((ges) gfp.a(aret.class, bundle));
    }

    @Override // defpackage.arfm
    public final void G() {
        t();
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        this.o = new Handler();
        btrm btrmVar = this.f;
        dceq a = dcet.a();
        a.b(gds.class, new arfh(0, gds.class, this, bvrj.UI_THREAD));
        a.b(alho.class, new arfh(1, alho.class, this, bvrj.UI_THREAD));
        a.b(alic.class, new arfh(2, alic.class, this, bvrj.UI_THREAD));
        a.b(alil.class, new arfh(3, alil.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        this.k.b(this.q);
        e();
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        this.r = bvqj.d(this.h.a().n(), new bvqg(this) { // from class: arfd
            private final arfg a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                arfg arfgVar = this.a;
                akox akoxVar = (akox) obj;
                if (!arfgVar.d) {
                    arfgVar.d = true;
                    ared aredVar = arfgVar.c;
                    if (aredVar == null) {
                        return;
                    }
                    aredVar.d();
                    arfgVar.D();
                }
            }
        }, dege.a);
        D();
    }

    @Override // defpackage.itb
    public final void Nu() {
        J();
        this.f.a(this);
        this.k.c(this.q);
        super.Nu();
    }

    @Override // defpackage.itb
    public final void Po() {
        super.Po();
        D();
        this.o.removeCallbacks(this.p);
        cryz<akox> cryzVar = this.r;
        if (cryzVar != null) {
            cryzVar.c();
            this.r = null;
        }
        if (E()) {
            this.c.h();
        }
    }

    public final void e() {
        if (this.c == null) {
            aree areeVar = this.i;
            ared l = ared.l(areeVar.a, areeVar.b.a().e(), areeVar.c, areeVar.d, areeVar.g, areeVar.e, areeVar.f.a(), I(), this.b, new arej(areeVar.a, areeVar.f.a(), areeVar.h));
            this.c = l;
            if (l == null || !this.d) {
                return;
            }
            l.d();
        }
    }

    @Override // defpackage.arfm
    public final void f(String str) {
        bvrj.UI_THREAD.c();
        aree areeVar = this.i;
        btlu I = I();
        bwrs<arfk> bwrsVar = this.b;
        arej arejVar = new arej(areeVar.a, areeVar.f.a(), areeVar.h);
        Activity activity = areeVar.a;
        akox e = areeVar.b.a().e();
        H(new ared(activity, areeVar.g, areeVar.e, areeVar.c, areeVar.d, e, I, ared.c(str), bwrsVar, true, true, null, null, areeVar.f.a(), arejVar));
    }

    @Override // defpackage.arfm
    public final void i(dvct dvctVar, dvcx dvcxVar) {
        bvrj.UI_THREAD.c();
        aree areeVar = this.i;
        btlu I = I();
        bwrs<arfk> bwrsVar = this.b;
        arej arejVar = new arej(areeVar.a, areeVar.f.a(), areeVar.h);
        Activity activity = areeVar.a;
        akox e = areeVar.b.a().e();
        bvrb bvrbVar = areeVar.c;
        cqat cqatVar = areeVar.d;
        buqd buqdVar = areeVar.g;
        bvjj bvjjVar = areeVar.e;
        arfm a = areeVar.f.a();
        dfqs dfqsVar = dvctVar.b;
        if (dfqsVar == null) {
            dfqsVar = dfqs.c;
        }
        H(new ared(activity, buqdVar, bvjjVar, bvrbVar, cqatVar, e, I, ared.c(dfqsVar.b), bwrsVar, true, true, dvctVar, dvcxVar, a, arejVar));
    }

    public final void j() {
        bvrj.UI_THREAD.c();
        J();
        this.b.d(arfk.b);
        t();
    }

    @Override // defpackage.arfm
    public final void k() {
        ared aredVar = this.c;
        if (aredVar != null) {
            aredVar.d.am(bvjk.fa, aredVar.a, null);
        }
        j();
    }

    @Override // defpackage.arfm
    public final void l() {
        if (E()) {
            ared aredVar = this.c;
            dvcx dvcxVar = aredVar.j;
            if (dvcxVar != null) {
                aredVar.k(dvcxVar);
            } else {
                aredVar.g = true;
            }
        }
    }

    @Override // defpackage.arfm
    public final void m(boolean z) {
        arfk arfkVar;
        if (E()) {
            ared aredVar = this.c;
            bvrj.UI_THREAD.c();
            arfk c = aredVar.b.c();
            boolean z2 = false;
            dbsk.l(c.c == arfj.MAP_LOADED);
            if (z == c.f) {
                arfkVar = c;
            } else {
                dcdn<String, Boolean> dcdnVar = c.g;
                if (z) {
                    dcpd<Boolean> it = dcdnVar.values().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().booleanValue()) {
                                break;
                            }
                        } else {
                            dcdg p = dcdn.p();
                            dvcr dvcrVar = c.e().b;
                            if (dvcrVar == null) {
                                dvcrVar = dvcr.h;
                            }
                            for (dvcl dvclVar : dvcrVar.e) {
                                dxdm dxdmVar = dvclVar.b;
                                if (dxdmVar == null) {
                                    dxdmVar = dxdm.e;
                                }
                                String str = dxdmVar.d;
                                boolean z3 = dvclVar.d;
                                p.f(str, Boolean.valueOf(z3));
                                z2 |= z3;
                            }
                            dcdnVar = p.b();
                            if (!z2) {
                                dcdg p2 = dcdn.p();
                                dvcr dvcrVar2 = c.e().b;
                                if (dvcrVar2 == null) {
                                    dvcrVar2 = dvcr.h;
                                }
                                for (dvcl dvclVar2 : dvcrVar2.e) {
                                    dxdm dxdmVar2 = dvclVar2.b;
                                    if (dxdmVar2 == null) {
                                        dxdmVar2 = dxdm.e;
                                    }
                                    p2.f(dxdmVar2.d, true);
                                }
                                dcdnVar = p2.b();
                            }
                        }
                    }
                }
                arfkVar = new arfk(c.c, c.d, c.e(), z, dcdnVar);
            }
            if (!dbsd.a(c, arfkVar)) {
                aredVar.b.d(arfkVar);
                for (String str2 : aredVar.c.keySet()) {
                    aredVar.j(str2);
                }
            }
        }
        if (!z) {
            t();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.arfm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arfg.n(java.lang.String, boolean):void");
    }

    @Override // defpackage.arfm
    public final void o(boolean z) {
        if (E()) {
            ared aredVar = this.c;
            if (aredVar.i == z) {
                return;
            }
            aredVar.i = z;
            for (String str : aredVar.c.keySet()) {
                aredVar.j(str);
            }
        }
    }

    @Override // defpackage.arfm
    public final void p(boolean z) {
        this.j = z;
    }

    @Override // defpackage.arfm
    public final void q() {
        this.e.D(new arey());
    }

    @Override // defpackage.arfm
    public final void r() {
        this.e.D(new aref());
    }

    @Override // defpackage.arfm
    public final void s() {
        if (this.e.K() instanceof arfl) {
            return;
        }
        this.e.D(new arfb());
    }

    public final boolean t() {
        if (this.e.g().J() || !(this.e.K() instanceof arfl)) {
            return false;
        }
        this.e.g().f();
        return true;
    }
}
