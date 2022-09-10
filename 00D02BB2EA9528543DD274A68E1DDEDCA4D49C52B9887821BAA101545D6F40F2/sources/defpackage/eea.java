package defpackage;

import android.app.Activity;
import android.view.Window;
/* compiled from: PG */
/* renamed from: eea  reason: default package */
/* loaded from: classes.dex */
public final class eea implements efd {
    private final Activity a;
    private final btvo b;
    private final dxio<hwd> c;
    @dzsi
    private final akox d;
    private final dxio<hwe> e;
    private final dxio<glj> f;
    private final dxio<afwr> g;
    private final dxio<araj> h;
    private final dxio<qbt> i;
    private final dxio<anhg> j;
    private final dxio<anbj> k;
    private final dxio<arfm> l;
    private final dxio<ahwf> m;
    private final dxio<byej> n;
    private final ita o;
    private final dxio<auey> p;
    private final dxio<bnli> q;
    private final dxio<glk> r;
    private final btrm s;
    private final dxio<iqr> t;
    private final dxio<gcg> u;
    private final dxio<gce> v;

    public eea(Activity activity, btvo btvoVar, btrm btrmVar, @dzsi akox akoxVar, dxio<hwe> dxioVar, dxio<glj> dxioVar2, dxio<afwr> dxioVar3, dxio<araj> dxioVar4, dxio<qbt> dxioVar5, dxio<anhg> dxioVar6, dxio<anbj> dxioVar7, dxio<arfm> dxioVar8, dxio<ahwf> dxioVar9, dxio<byej> dxioVar10, dxio<hwd> dxioVar11, dxio<bnli> dxioVar12, ita itaVar, dxio<auey> dxioVar13, dxio<glk> dxioVar14, dxio<iqr> dxioVar15, dxio<gcg> dxioVar16, dxio<gce> dxioVar17) {
        this.a = activity;
        this.b = btvoVar;
        this.c = dxioVar11;
        this.d = akoxVar;
        this.e = dxioVar;
        this.f = dxioVar2;
        this.g = dxioVar3;
        this.h = dxioVar4;
        this.i = dxioVar5;
        this.j = dxioVar6;
        this.k = dxioVar7;
        this.l = dxioVar8;
        this.m = dxioVar9;
        this.n = dxioVar10;
        this.o = itaVar;
        this.s = btrmVar;
        this.p = dxioVar13;
        this.q = dxioVar12;
        this.r = dxioVar14;
        this.t = dxioVar15;
        this.u = dxioVar16;
        this.v = dxioVar17;
    }

    @Override // defpackage.efd
    public final void a(egf egfVar) {
        if (this.g.a().l().d(afwm.SATELLITE) || this.g.a().l().d(afwm.TERRAIN)) {
            this.d.F();
        } else if (this.b.getNavigationParameters().u()) {
            this.d.F();
        } else if (egfVar.g) {
            this.d.aj().O();
        } else {
            this.d.F();
        }
    }

    @Override // defpackage.efd
    public final void b(egf egfVar, boolean z) {
        this.d.aj();
        this.g.a().l().b(egfVar.l);
        this.k.a().e().a(egfVar.c);
        this.c.a().j();
        arbu m = this.h.a().m();
        if (!z) {
            Window window = this.a.getWindow();
            if (egfVar.a) {
                window.addFlags(4718720);
            } else {
                window.clearFlags(4718720);
            }
        }
        this.a.setVolumeControlStream(egfVar.b);
        this.f.a().d(egfVar.v);
        this.d.H(egfVar.j);
        this.c.a().p(egfVar.k);
        akox akoxVar = this.d;
        akoxVar.aj().s(egfVar.w);
        if (egfVar.n) {
            this.e.a().c();
            this.t.a().b();
        }
        if (egfVar.m && this.o.a(12)) {
            this.i.a().f().i();
        }
        if (this.o.a(35)) {
            if (egfVar.o) {
                this.j.a().n();
            }
            if (egfVar.p) {
                this.j.a().o();
            }
        }
        if (this.o.a(41)) {
            this.l.a().o(egfVar.q);
            this.l.a().p(egfVar.d);
        }
        boolean z2 = true;
        if (this.o.a(29)) {
            this.m.a().H(!egfVar.r);
        }
        if (this.o.a(66)) {
            this.q.a().b(egfVar.B);
            this.d.x = egfVar.B;
        }
        if (this.b.getVectorMapsParameters().o) {
            this.p.a().c(false);
        } else {
            this.p.a().c(egfVar.t);
        }
        if (this.u.a().a()) {
            this.v.a().i(!egfVar.t, this.a);
        }
        akox akoxVar2 = this.d;
        akoxVar2.w = egfVar.H;
        akoxVar2.aj().as().a(egfVar.F);
        this.d.A = egfVar.E;
        a(egfVar);
        this.s.b(new alhj(egfVar.d, egfVar.e));
        if (this.o.a(84)) {
            this.n.a().e(egfVar.f);
        }
        m.f().k(egfVar.h);
        m.f().i(egfVar.i);
        if (egfVar.h == ardz.NAVIGATION) {
            m.f().D();
        }
        if (egfVar.i == arbs.NAVIGATION) {
            z2 = false;
        }
        m.g(z2);
        if (!this.o.a(34) || !this.r.a().f()) {
            return;
        }
        this.r.a().e(egfVar.D);
    }
}
