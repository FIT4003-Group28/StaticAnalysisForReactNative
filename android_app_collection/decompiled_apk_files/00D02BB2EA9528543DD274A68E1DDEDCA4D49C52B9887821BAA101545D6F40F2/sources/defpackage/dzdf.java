package defpackage;
/* compiled from: PG */
/* renamed from: dzdf  reason: default package */
/* loaded from: classes6.dex */
final class dzdf<T> implements dyzw, dzak {
    final dyzw<? super T> a;
    dzak b;

    public dzdf(dyzw<? super T> dyzwVar) {
        this.a = dyzwVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        this.b.SQ();
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        if (dzbd.c(this.b, dzakVar)) {
            this.b = dzakVar;
            this.a.b(this);
        }
    }

    @Override // defpackage.dyzw
    public final void c(T t) {
        this.a.c(t);
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        this.a.d(th);
    }

    @Override // defpackage.dyzw
    public final void e() {
        this.a.e();
    }
}
