package defpackage;
/* compiled from: PG */
/* renamed from: dzch  reason: default package */
/* loaded from: classes6.dex */
final class dzch<T> implements dzab<T> {
    final dyzq a;

    public dzch(dyzq dyzqVar) {
        this.a = dyzqVar;
    }

    @Override // defpackage.dzab
    public final void a(dzak dzakVar) {
        this.a.a(dzakVar);
    }

    @Override // defpackage.dzab
    public final void b(Throwable th) {
        this.a.c(th);
    }

    @Override // defpackage.dzab
    public final void c(T t) {
        this.a.b();
    }
}
