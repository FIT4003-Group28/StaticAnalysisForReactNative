package defpackage;
/* compiled from: PG */
/* renamed from: bvuh  reason: default package */
/* loaded from: classes4.dex */
public final class bvuh implements bvvq {
    @dzsi
    public gn b;
    private final bvvw d;
    public final crzo<Void> a = new crzo<>();
    public dbsg<bvui> c = dbpy.a;

    public bvuh(bvvw bvvwVar) {
        this.d = bvvwVar;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [bwce, bvxh] */
    /* JADX WARN: Type inference failed for: r0v9, types: [bwce, bvxh] */
    @Override // defpackage.bvvq
    public final void a(bvvs bvvsVar, ddho ddhoVar) {
        ?? g;
        if (!this.c.a() || this.c.b().c || (g = this.c.b().g()) == 0 || !g.b().equals(bvvsVar.a())) {
            if (this.c.a()) {
                bvui b = this.c.b();
                if (b.aD) {
                    b.am();
                } else {
                    ?? g2 = b.g();
                    if (g2 != 0) {
                        g2.e().destroy();
                    }
                }
            }
            bwce bwceVar = (bwce) this.d.m(bvvsVar, false);
            if (bwceVar != null) {
                bvui bvuiVar = new bvui();
                bvuiVar.b = bwceVar;
                bvtr.b(bwceVar, ddhoVar, bvuiVar);
                this.c = dbsg.i(bvuiVar);
            }
            dbsg.i(ddhoVar);
        }
    }

    @Override // defpackage.bvvq
    public final void b(int i) {
        gn gnVar = this.b;
        dbsg<bvui> dbsgVar = this.c;
        if (gnVar == null || !dbsgVar.a()) {
            return;
        }
        bvui b = dbsgVar.b();
        if (!b.I) {
            gz b2 = gnVar.b();
            b2.C(i, b, "PARTIAL_WEB_VIEW_FRAGMENT_TAG");
            b2.g();
            return;
        }
        gz b3 = gnVar.b();
        b3.A(b);
        b3.f();
    }

    @Override // defpackage.bvvq
    public final void c() {
        gn gnVar = this.b;
        dbsg<bvui> dbsgVar = this.c;
        if (gnVar == null || !dbsgVar.a()) {
            return;
        }
        bvui b = dbsgVar.b();
        if (b.I || !b.d) {
            return;
        }
        gz b2 = gnVar.b();
        b2.t(b);
        b2.r();
    }

    @Override // defpackage.bvvq
    public final void d() {
        this.a.a(null);
    }
}
