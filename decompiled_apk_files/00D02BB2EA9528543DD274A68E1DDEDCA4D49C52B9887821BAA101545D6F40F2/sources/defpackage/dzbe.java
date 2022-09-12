package defpackage;
/* compiled from: PG */
/* renamed from: dzbe  reason: default package */
/* loaded from: classes6.dex */
public enum dzbe implements dzbn<Object> {
    INSTANCE,
    NEVER;

    public static void b(Throwable th, dyzw<?> dyzwVar) {
        dyzwVar.b(INSTANCE);
        dyzwVar.d(th);
    }

    public static void c(Throwable th, dyzq dyzqVar) {
        dyzqVar.a(INSTANCE);
        dyzqVar.c(th);
    }

    @Override // defpackage.dzbq
    public final boolean SO() {
        return true;
    }

    @Override // defpackage.dzbq
    public final Object SP() {
        return null;
    }

    @Override // defpackage.dzak
    public final void SQ() {
    }

    @Override // defpackage.dzbq
    public final void f() {
    }

    @Override // defpackage.dzbq
    public final void g(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.dzbo
    public final int h() {
        return 2;
    }
}
