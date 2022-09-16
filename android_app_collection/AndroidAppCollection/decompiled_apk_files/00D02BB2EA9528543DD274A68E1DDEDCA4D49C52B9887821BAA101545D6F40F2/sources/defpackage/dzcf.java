package defpackage;
/* compiled from: PG */
/* renamed from: dzcf  reason: default package */
/* loaded from: classes6.dex */
final class dzcf<T> implements dyzw<T> {
    final dyzq a;

    public dzcf(dyzq dyzqVar) {
        this.a = dyzqVar;
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        this.a.a(dzakVar);
    }

    @Override // defpackage.dyzw
    public final void c(T t) {
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        this.a.c(th);
    }

    @Override // defpackage.dyzw
    public final void e() {
        this.a.b();
    }
}
