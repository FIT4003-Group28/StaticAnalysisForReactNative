package defpackage;
/* compiled from: PG */
/* renamed from: iwn  reason: default package */
/* loaded from: classes6.dex */
public class iwn implements aesc {
    @dzsi
    protected final aeue a;
    protected final boolean b;
    private final eeu c;
    private final dzsj<aesb> d;
    private final dzsj<begg> e;

    public iwn(eeu eeuVar, dzsj<aesb> dzsjVar, dzsj<begg> dzsjVar2, @dzsi aeue aeueVar, @dzsi dhiz dhizVar, boolean z) {
        this.c = eeuVar;
        this.a = aeueVar;
        this.b = z;
        this.d = dzsjVar;
        this.e = dzsjVar2;
    }

    @Override // defpackage.jbi
    /* renamed from: a */
    public String m() {
        aeue aeueVar = this.a;
        return aeueVar != null ? aeueVar.a() : "";
    }

    @Override // defpackage.jbf
    @dzsi
    /* renamed from: b */
    public String l() {
        aeue aeueVar = this.a;
        return aeueVar != null ? aeueVar.b() : "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        if (!this.c.b() || this.a == null || !this.b) {
            return;
        }
        aesb a = this.d.a();
        a.j(this.a);
        a.D((ilo) bwrs.b(this.a.f()), 3, i());
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return null;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (!this.c.b() || this.a == null) {
            return cqkl.a;
        }
        c();
        if (this.b) {
            this.d.a().C(this.a, jjn.COLLAPSED);
        }
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        aeue aeueVar = this.a;
        if (aeueVar == null) {
            return null;
        }
        cjta c = cjtd.c(aeueVar.e());
        c.d = i();
        return c.a();
    }

    public ddho i() {
        return dtxy.fC;
    }

    @Override // defpackage.aesc
    public cqkl j() {
        if (!this.c.b() || this.a == null) {
            return cqkl.a;
        }
        this.d.a().D((ilo) bwrs.b(this.a.f()), 2, dtxy.fy);
        ilo iloVar = (ilo) bwrs.b(this.e.a().e());
        if (iloVar == null) {
            return cqkl.a;
        }
        ily g = iloVar.g();
        g.m = false;
        ilo d = g.d();
        begj begjVar = new begj();
        begjVar.b(d);
        begjVar.c = jjn.COLLAPSED;
        this.e.a().o(begjVar, true, null);
        return cqkl.a;
    }

    @Override // defpackage.aesc
    @dzsi
    public cjtd k() {
        aeue aeueVar = this.a;
        if (aeueVar == null) {
            return null;
        }
        cjta c = cjtd.c(aeueVar.e());
        c.d = dtxy.kn;
        return c.a();
    }
}
