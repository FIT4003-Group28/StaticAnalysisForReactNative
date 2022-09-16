package defpackage;
/* compiled from: PG */
/* renamed from: bzek  reason: default package */
/* loaded from: classes4.dex */
public abstract class bzek {
    final dbsz<bzek> a;
    public final bzdg b;
    @dzsi
    protected final cqat c;
    private boolean d;
    @dzsi
    private eaow e;
    @dzsi
    private eaow f;
    private long g;

    public bzek(dbsz<bzek> dbszVar, bzdg bzdgVar, @dzsi cqat cqatVar) {
        this.a = dbszVar;
        this.b = bzdgVar;
        this.c = cqatVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int a(amuo amuoVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract bzdh b();

    public abstract void c();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract bzek d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean e(cray crayVar);

    public abstract eaow f();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void g();

    public boolean h() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean i();

    protected abstract void j(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m() {
        cqat cqatVar = this.c;
        if (cqatVar != null) {
            this.g = cqatVar.e();
            this.e = f();
        }
        this.a.NU(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(ddsd ddsdVar) {
        eaow eaowVar = this.e;
        if (eaowVar != null) {
            int g = (int) eaowVar.g();
            if (ddsdVar.c) {
                ddsdVar.bF();
                ddsdVar.c = false;
            }
            ddsg ddsgVar = (ddsg) ddsdVar.b;
            ddsg ddsgVar2 = ddsg.q;
            ddsgVar.a |= 4;
            ddsgVar.d = g;
        }
        eaow eaowVar2 = this.f;
        if (eaowVar2 != null) {
            int g2 = (int) eaowVar2.g();
            if (ddsdVar.c) {
                ddsdVar.bF();
                ddsdVar.c = false;
            }
            ddsg ddsgVar3 = (ddsg) ddsdVar.b;
            ddsg ddsgVar4 = ddsg.q;
            ddsgVar3.a |= 8;
            ddsgVar3.e = g2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(Throwable th) {
        String g = dbue.g(th);
        if (!h()) {
            r(p(g), 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final bzdq p(String str) {
        return new bzdq(this.a, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(int i) {
        dbsk.l(!this.d);
        this.d = true;
        cqat cqatVar = this.c;
        if (cqatVar != null) {
            this.f = eaow.e(cqatVar.e() - this.g);
        }
        j(i);
        c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(bzek bzekVar, int i) {
        s(bzekVar, i, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(bzek bzekVar, int i, boolean z) {
        if (!this.d) {
            q(i);
        }
        bzekVar.g();
        if (z) {
            bzekVar.m();
        }
    }
}
