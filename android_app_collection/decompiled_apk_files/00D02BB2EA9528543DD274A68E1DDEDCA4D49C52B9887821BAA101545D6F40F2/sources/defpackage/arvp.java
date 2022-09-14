package defpackage;
/* compiled from: PG */
/* renamed from: arvp  reason: default package */
/* loaded from: classes2.dex */
final class arvp implements arvv {
    final /* synthetic */ arvq a;
    final /* synthetic */ arxm b;

    public arvp(arvq arvqVar, arxm arxmVar) {
        this.a = arvqVar;
        this.b = arxmVar;
    }

    @Override // defpackage.arvv
    public final void a(dxfd dxfdVar) {
        if (this.a.b.getAndSet(true)) {
            return;
        }
        this.a.a.a();
        this.b.a();
    }

    @Override // defpackage.arvv
    public final void b(Throwable th) {
        if (this.a.b.getAndSet(true)) {
            return;
        }
        this.a.a.a();
        if ((th instanceof dxfm) || (th instanceof dxfe) || (th instanceof dxff)) {
            this.b.b();
        } else {
            this.b.a();
        }
    }
}
