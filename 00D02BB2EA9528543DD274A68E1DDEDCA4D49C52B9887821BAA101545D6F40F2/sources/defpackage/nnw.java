package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: nnw  reason: default package */
/* loaded from: classes7.dex */
public final class nnw extends nor {
    public final cqkj a;
    public final noo b;
    public final alav c;
    public final noa d;
    @dzsi
    public amfq e;
    private final not f;
    private final amfi g;
    private final asmp h;
    private final cjtg i;
    private final cqkf<nny> j;
    @dzsi
    private btzc k;
    private final kxs l;
    private final nnz m;
    private final btzi<dwnn, dwnp> n;
    private final bvgl o;

    public nnw(alav alavVar, kxu kxuVar, cqkj cqkjVar, not notVar, cjqy cjqyVar, cjqq cjqqVar, amfi amfiVar, noo nooVar, jzp jzpVar, asmp asmpVar, bvgl bvglVar) {
        super(cjqyVar, cjqqVar);
        this.i = new cjsz(dtxm.eC);
        nnt nntVar = new nnt(this);
        this.m = nntVar;
        this.n = new nnu(this);
        dbsk.s(alavVar);
        this.c = alavVar;
        dbsk.s(cqkjVar);
        this.a = cqkjVar;
        dbsk.s(notVar);
        this.f = notVar;
        dbsk.s(amfiVar);
        this.g = amfiVar;
        dbsk.s(nooVar);
        this.b = nooVar;
        dbsk.s(asmpVar);
        this.h = asmpVar;
        dbsk.s(bvglVar);
        this.o = bvglVar;
        cqkf<nny> d = cqkjVar.d(new nns(), notVar.a(), false);
        this.j = d;
        this.d = new noa(nntVar, jzpVar, alavVar.q);
        View c = d.c();
        kxn k = kxo.k();
        k.k();
        this.l = new kxs(c, k, kxuVar);
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
    }

    @Override // defpackage.non
    public final noq b() {
        k();
        this.l.a();
        this.h.p(dcdc.f(this.c.r), false, false, 1, false);
        l();
        s(this.i);
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.j.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        t();
        this.e = null;
        btzc btzcVar = this.k;
        if (btzcVar != null) {
            btzcVar.a();
        }
        this.h.q();
        this.l.b();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
    }

    @Override // defpackage.non
    public final String g() {
        return "TrafficIncidentOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.f.b(noeVar, this.j.c());
    }

    public final void k() {
        this.j.e(this.d);
    }

    public final void l() {
        btzc btzcVar = this.k;
        if (btzcVar != null) {
            btzcVar.a();
        }
        dwnm bZ = dwnn.b.bZ();
        bZ.a(this.c.a.a());
        this.k = this.o.a(bZ.bK(), this.n, bvrj.UI_THREAD);
        m(this.c.a.g());
        this.d.l();
        k();
    }

    public final void m(@dzsi String str) {
        if (dbsj.d(str)) {
            this.d.m(cqtt.c());
            return;
        }
        this.e = new nnv(this);
        this.d.m(bynw.c(bynw.a(str), this.g, this.e));
    }
}
