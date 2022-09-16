package defpackage;
/* compiled from: PG */
/* renamed from: dzbr  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzbr<T, R> implements dyzw, dzbn {
    protected final dyzw<? super R> a;
    protected dzak b;
    protected dzbn<T> c;
    protected boolean d;

    public dzbr(dyzw<? super R> dyzwVar) {
        this.a = dyzwVar;
    }

    @Override // defpackage.dzbq
    public final boolean SO() {
        return this.c.SO();
    }

    @Override // defpackage.dzak
    public final void SQ() {
        this.b.SQ();
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        if (dzbd.c(this.b, dzakVar)) {
            this.b = dzakVar;
            if (dzakVar instanceof dzbn) {
                this.c = (dzbn) dzakVar;
            }
            this.a.b(this);
        }
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        if (this.d) {
            dzfy.a(th);
            return;
        }
        this.d = true;
        this.a.d(th);
    }

    @Override // defpackage.dyzw
    public final void e() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.e();
    }

    @Override // defpackage.dzbq
    public final void f() {
        this.c.f();
    }

    @Override // defpackage.dzbq
    public final void g(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(Throwable th) {
        dzas.a(th);
        this.b.SQ();
        d(th);
    }
}
