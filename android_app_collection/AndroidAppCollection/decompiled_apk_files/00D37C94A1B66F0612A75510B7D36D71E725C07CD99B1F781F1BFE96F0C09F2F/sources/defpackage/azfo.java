package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azfo  reason: default package */
/* loaded from: classes2.dex */
final class azfo extends AtomicReference implements ayns, aypg {
    private static final long serialVersionUID = 8606673141535671828L;
    final /* synthetic */ azfp a;

    public azfo(azfp azfpVar) {
        this.a = azfpVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        azfp azfpVar = this.a;
        azfpVar.d.f(this);
        azfpVar.b(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        azfp azfpVar = this.a;
        azfpVar.d.f(this);
        azfpVar.sm();
    }
}
