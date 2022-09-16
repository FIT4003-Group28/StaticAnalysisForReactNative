package defpackage;
/* compiled from: PG */
/* renamed from: aznt  reason: default package */
/* loaded from: classes2.dex */
public abstract class aznt implements ayre, ayrk {
    protected final ayre d;
    protected bamf e;
    protected ayrk f;
    protected boolean g;
    protected int h;

    public aznt(ayre ayreVar) {
        this.d = ayreVar;
    }

    @Override // defpackage.bame
    public void b(Throwable th) {
        if (this.g) {
            azqc.d(th);
            return;
        }
        this.g = true;
        this.d.b(th);
    }

    @Override // defpackage.ayrn
    public final void d() {
        this.f.d();
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.e, bamfVar)) {
            this.e = bamfVar;
            if (bamfVar instanceof ayrk) {
                this.f = (ayrk) bamfVar;
            }
            this.d.f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g(int i) {
        ayrk ayrkVar = this.f;
        if (ayrkVar == null || (i & 4) != 0) {
            return 0;
        }
        int sk = ayrkVar.sk(i);
        if (sk != 0) {
            this.h = sk;
        }
        return sk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(Throwable th) {
        bapv.j(th);
        this.e.si();
        b(th);
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return this.f.j();
    }

    @Override // defpackage.ayrn
    public final boolean k(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.bamf
    public final void si() {
        this.e.si();
    }

    @Override // defpackage.bame
    public void sm() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.d.sm();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        this.e.sp(j);
    }
}
