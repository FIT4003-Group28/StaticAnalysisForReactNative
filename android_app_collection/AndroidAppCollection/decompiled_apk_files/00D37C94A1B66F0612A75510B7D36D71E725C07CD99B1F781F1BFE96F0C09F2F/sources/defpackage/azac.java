package defpackage;
/* compiled from: PG */
/* renamed from: azac  reason: default package */
/* loaded from: classes2.dex */
final class azac implements ayoa {
    private final azad a;

    public azac(azad azadVar) {
        this.a = azadVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        azad azadVar = this.a;
        azof.f(azadVar.c);
        azadVar.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.a.lazySet(obj);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.g(this.a.e, bamfVar)) {
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.bame
    public final void sm() {
    }
}
