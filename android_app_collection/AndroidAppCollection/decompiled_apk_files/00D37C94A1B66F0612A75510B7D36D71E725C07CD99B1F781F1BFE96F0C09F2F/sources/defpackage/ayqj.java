package defpackage;
/* compiled from: PG */
/* renamed from: ayqj  reason: default package */
/* loaded from: classes2.dex */
public enum ayqj implements ayri {
    INSTANCE,
    NEVER;

    public static void f(ayom ayomVar) {
        ayomVar.sj(INSTANCE);
        ayomVar.sm();
    }

    public static void g(Throwable th, ayns aynsVar) {
        aynsVar.sj(INSTANCE);
        aynsVar.b(th);
    }

    public static void h(Throwable th, ayom ayomVar) {
        ayomVar.sj(INSTANCE);
        ayomVar.b(th);
    }

    public static void i(Throwable th, ayot ayotVar) {
        ayotVar.sj(INSTANCE);
        ayotVar.b(th);
    }

    @Override // defpackage.ayrn
    public final void d() {
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this == INSTANCE;
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return true;
    }

    @Override // defpackage.ayrn
    public final boolean k(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.aypg
    public final void qr() {
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return i & 2;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        return null;
    }
}
