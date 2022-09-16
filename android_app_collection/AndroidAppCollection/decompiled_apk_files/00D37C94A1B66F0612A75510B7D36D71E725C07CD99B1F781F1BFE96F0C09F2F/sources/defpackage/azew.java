package defpackage;
/* compiled from: PG */
/* renamed from: azew  reason: default package */
/* loaded from: classes2.dex */
final class azew extends ayrp implements ayom {
    private static final long serialVersionUID = 4109457741734051389L;
    final ayom a;
    final aypv b;
    aypg c;
    ayri d;
    boolean e;

    public azew(ayom ayomVar, aypv aypvVar) {
        this.a = ayomVar;
        this.b = aypvVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.a.b(th);
        f();
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayrn
    public final void d() {
        this.d.d();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c.e();
    }

    final void f() {
        if (compareAndSet(0, 1)) {
            try {
                this.b.a();
            } catch (Throwable th) {
                bapv.j(th);
                azqc.d(th);
            }
        }
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return this.d.j();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.c.qr();
        f();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.c, aypgVar)) {
            this.c = aypgVar;
            if (aypgVar instanceof ayri) {
                this.d = (ayri) aypgVar;
            }
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        ayri ayriVar = this.d;
        boolean z = false;
        if (ayriVar == null || (i & 4) != 0) {
            return 0;
        }
        int sk = ayriVar.sk(i);
        if (sk != 0) {
            if (sk == 1) {
                z = true;
            }
            this.e = z;
        }
        return sk;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        Object sl = this.d.sl();
        if (sl != null || !this.e) {
            return sl;
        }
        f();
        return null;
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.a.sm();
        f();
    }
}
