package defpackage;
/* compiled from: PG */
/* renamed from: ayro  reason: default package */
/* loaded from: classes2.dex */
public abstract class ayro implements ayom, ayri {
    protected final ayom a;
    protected aypg b;
    protected ayri c;
    protected boolean d;
    protected int e;

    public ayro(ayom ayomVar) {
        this.a = ayomVar;
    }

    @Override // defpackage.ayom
    public void b(Throwable th) {
        if (this.d) {
            azqc.d(th);
            return;
        }
        this.d = true;
        this.a.b(th);
    }

    @Override // defpackage.ayrn
    public void d() {
        this.c.d();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int f(int i) {
        ayri ayriVar = this.c;
        if (ayriVar == null || (i & 4) != 0) {
            return 0;
        }
        int sk = ayriVar.sk(i);
        if (sk != 0) {
            this.e = sk;
        }
        return sk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(Throwable th) {
        bapv.j(th);
        this.b.qr();
        b(th);
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return this.c.j();
    }

    @Override // defpackage.ayrn
    public final boolean k(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.b.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.b, aypgVar)) {
            this.b = aypgVar;
            if (aypgVar instanceof ayri) {
                this.c = (ayri) aypgVar;
            }
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public void sm() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.sm();
    }
}
