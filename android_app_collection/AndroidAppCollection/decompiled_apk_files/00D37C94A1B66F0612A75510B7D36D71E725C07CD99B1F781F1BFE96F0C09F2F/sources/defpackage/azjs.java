package defpackage;
/* compiled from: PG */
/* renamed from: azjs  reason: default package */
/* loaded from: classes2.dex */
final class azjs implements ayom {
    private final azjr a;

    public azjs(azjr azjrVar) {
        this.a = azjrVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        azjr azjrVar = this.a;
        ayqi.c(azjrVar.c);
        azjrVar.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.a.lazySet(obj);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.g(this.a.d, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
    }
}
