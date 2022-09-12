package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bngr  reason: default package */
/* loaded from: classes3.dex */
public class bngr implements bneq {
    private static final dcqe p = dcqe.b();
    public bnft a;
    public cebl b;
    public bngk c;
    public bnfq d;
    public bhug e;
    private final bwrs<cdjd> f;
    private final View.OnClickListener g;
    private final bwqv h;
    private final bnfu i;
    private final cebm j;
    private final bngl k;
    private final bnfr l;
    private final bhuh m;
    private final dxio<bkpi> n;
    private final bwrs<ilo> o;

    public bngr(bwqv bwqvVar, cqhn cqhnVar, bnfu bnfuVar, cebm cebmVar, bngl bnglVar, bnfr bnfrVar, bhuh bhuhVar, dxio<bkpi> dxioVar, bwrs<ilo> bwrsVar, cdjd cdjdVar) {
        this.h = bwqvVar;
        this.i = bnfuVar;
        this.j = cebmVar;
        this.k = bnglVar;
        this.l = bnfrVar;
        this.m = bhuhVar;
        this.n = dxioVar;
        this.o = bwrsVar;
        bwrs<cdjd> a = bwrs.a(cdjdVar);
        this.f = a;
        u();
        bwqvVar.f(a, new bngn(new bngm(this)), false);
        this.g = new bngo(this);
        dzvx.b(cjtd.b, "Ue3LoggingCommonParams.EMPTY");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        cdjd q = q();
        if (q != null) {
            bnfu bnfuVar = this.i;
            bwrs<ilo> bwrsVar = this.o;
            gga a = bnfuVar.a.a();
            bnfu.a(a, 1);
            dxio a2 = ((dxjh) bnfuVar.b).a();
            bnfu.a(a2, 2);
            dxio a3 = ((dxjh) bnfuVar.c).a();
            bnfu.a(a3, 3);
            cebu a4 = bnfuVar.d.a();
            bnfu.a(a4, 4);
            ceet a5 = bnfuVar.e.a();
            bnfu.a(a5, 5);
            bngj a6 = bnfuVar.f.a();
            bnfu.a(a6, 6);
            bnfu.a(bwrsVar, 7);
            bnfu.a(q, 8);
            h(new bnft(a, a2, a3, a4, a5, a6, bwrsVar, q));
            j(this.j.a(this.o, q, new bngp(this)));
            bqsq a7 = this.k.a.a();
            bngl.a(a7, 1);
            bngl.a(q, 2);
            l(new bngk(a7, q));
            bnfr bnfrVar = this.l;
            bwrs<ilo> bwrsVar2 = this.o;
            iyj a8 = bnfrVar.a.a();
            bnfr.a(a8, 1);
            ixv a9 = bnfrVar.b.a();
            bnfr.a(a9, 2);
            ixb a10 = bnfrVar.c.a();
            bnfr.a(a10, 3);
            bnfr.a(bwrsVar2, 4);
            bnfr.a(q, 5);
            n(new bnfq(a8, a9, a10, bwrsVar2, q));
            bhuh bhuhVar = this.m;
            ilo c = this.o.c();
            p(bhuhVar.a(q, c != null ? c.bf() : null, false, this.o, new bngq(this, q)));
            return;
        }
        bvoo.h("Post is null", new Object[0]);
    }

    @Override // defpackage.bneq
    public View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.bneq
    /* renamed from: g */
    public bnft a() {
        bnft bnftVar = this.a;
        if (bnftVar == null) {
            dzvx.a("headerViewModel");
        }
        return bnftVar;
    }

    public void h(bnft bnftVar) {
        this.a = bnftVar;
    }

    @Override // defpackage.bneq
    /* renamed from: i */
    public cebl b() {
        cebl ceblVar = this.b;
        if (ceblVar == null) {
            dzvx.a("thumbsListViewModel");
        }
        return ceblVar;
    }

    public void j(cebl ceblVar) {
        this.b = ceblVar;
    }

    @Override // defpackage.bneq
    /* renamed from: k */
    public bngk c() {
        bngk bngkVar = this.c;
        if (bngkVar == null) {
            dzvx.a("textViewModel");
        }
        return bngkVar;
    }

    public void l(bngk bngkVar) {
        this.c = bngkVar;
    }

    @Override // defpackage.bneq
    /* renamed from: m */
    public bnfq d() {
        bnfq bnfqVar = this.d;
        if (bnfqVar == null) {
            dzvx.a("actionViewModel");
        }
        return bnfqVar;
    }

    public void n(bnfq bnfqVar) {
        this.d = bnfqVar;
    }

    @Override // defpackage.bneq
    /* renamed from: o */
    public bhug e() {
        bhug bhugVar = this.e;
        if (bhugVar == null) {
            dzvx.a("ownerResponseViewModel");
        }
        return bhugVar;
    }

    public void p(bhug bhugVar) {
        this.e = bhugVar;
    }

    public final cdjd q() {
        return this.f.c();
    }

    public final void r(cdjd cdjdVar) {
        this.f.d(cdjdVar);
    }
}
