package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwrk  reason: default package */
/* loaded from: classes.dex */
public final class cwrk implements cwsz {
    private final dzsj<cxai> a;
    private final cwuc b;
    private final dzsj<dehq> c;
    private final dzsj<cwvg> d;
    private final dzsj<cwxq> e;
    private final dzsj<cwyp> f;
    private final dzsj<cwzp> g;
    private final dzsj<cxan> h;
    private final dzsj<dbsg<cxdi>> i;

    public cwrk(dzsj<cxai> dzsjVar, cwuc cwucVar, dzsj<dehq> dzsjVar2, dzsj<cwvg> dzsjVar3, dzsj<cwxq> dzsjVar4, dzsj<cwyp> dzsjVar5, dzsj<cwzp> dzsjVar6, dzsj<cxan> dzsjVar7, dzsj<dbsg<cxdi>> dzsjVar8) {
        this.a = dzsjVar;
        this.b = cwucVar;
        this.c = dzsjVar2;
        this.d = dzsjVar3;
        this.e = dzsjVar4;
        this.f = dzsjVar5;
        this.g = dzsjVar6;
        this.h = dzsjVar7;
        this.i = dzsjVar8;
    }

    @Override // defpackage.cwsz
    public final dbty<dehq> a() {
        final dzsj<dehq> dzsjVar = this.c;
        dzsjVar.getClass();
        return new dbty(dzsjVar) { // from class: cwrj
            private final dzsj a;

            {
                this.a = dzsjVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.a();
            }
        };
    }

    @Override // defpackage.cwsz
    public final void b() {
        this.b.a();
    }

    @Override // defpackage.cwsz
    public final boolean c(cwud cwudVar) {
        return this.b.b(cwudVar);
    }

    @Override // defpackage.cwsz
    public final dehn<Void> d(Runnable runnable) {
        try {
            runnable.run();
            return dehk.a;
        } catch (RuntimeException e) {
            return deha.b(e);
        }
    }

    @Override // defpackage.cwsz
    public final void e() {
        this.g.a().a();
    }

    @Override // defpackage.cwsz
    public final void f(String str) {
        cwtl.a(this.g.a().c(str));
    }

    @Override // defpackage.cwsz
    public final void g(String str) {
        this.g.a().d(str);
    }

    @Override // defpackage.cwsz
    public final void h(cxaj cxajVar) {
        cwtl.a(this.h.a().a(cxajVar));
    }

    @Override // defpackage.cwsz
    public final void i(String str) {
        dbsg<cxdi> a = ((cxdb) this.i).a();
        if (a.a()) {
            a.b().c(str);
        }
    }

    @Override // defpackage.cwsz
    public final void j(String str) {
        dbsg<cxdi> a = ((cxdb) this.i).a();
        if (a.a()) {
            a.b().d(str);
        }
    }

    @Override // defpackage.cwsz
    public final cxdh k() {
        dbsg<cxdi> a = ((cxdb) this.i).a();
        if (a.a()) {
            return a.b().a();
        }
        return cxdh.b;
    }

    @Override // defpackage.cwsz
    public final void l() {
        this.e.a().a();
    }

    @Override // defpackage.cwsz
    public final void m(String str) {
        ((cwyu) this.f).a().a(str);
    }

    @Override // defpackage.cwsz
    public final void n(String str, boolean z, @dzsi dzze dzzeVar) {
        cwtl.a(((cwyu) this.f).a().c(str, z, dzzeVar));
    }

    @Override // defpackage.cwsz
    public final void o(String str) {
        ((cwyu) this.f).a().d(str);
    }

    @Override // defpackage.cwsz
    public final boolean p() {
        return ((cwsm) this.a).a().b() == 3;
    }

    @Override // defpackage.cwsz
    public final void q(String str) {
        ((cwvz) this.d).a().f(str);
    }

    @Override // defpackage.cwsz
    public final void r(String str) {
        s(str, null);
    }

    @Override // defpackage.cwsz
    public final void s(String str, @dzsi dzze dzzeVar) {
        cwtl.a(this.g.a().e(str, dzzeVar));
    }

    @Override // defpackage.cwsz
    public final void t(String str) {
        cwtl.a(((cwvz) this.d).a().d(str, true));
    }

    @Override // defpackage.cwsz
    public final void u(String str, dzze dzzeVar) {
        cwtl.a(((cwvz) this.d).a().e(str, true, dzzeVar));
    }

    @Override // defpackage.cwsz
    public final void v(String str, int i) {
        w(str, null, null, i);
    }

    @Override // defpackage.cwsz
    public final void w(String str, @dzsi String str2, @dzsi dzze dzzeVar, int i) {
        dbsg<cxdi> a = ((cxdb) this.i).a();
        if (a.a()) {
            cwtl.a(a.b().f(str, str2, dzzeVar, i));
        }
    }

    @Override // defpackage.cwsz
    public final void x(String str, @dzsi dzze dzzeVar) {
        cwtl.a(this.g.a().f(str, dzzeVar));
    }

    @Override // defpackage.cwsz
    public final void y(@dzsi cxdh cxdhVar, String str, int i) {
        dbsg<cxdi> a = ((cxdb) this.i).a();
        if (a.a()) {
            cwtl.a(a.b().e(cxdhVar, str, i));
        }
    }
}
