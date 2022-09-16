package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azfr  reason: default package */
/* loaded from: classes2.dex */
final class azfr extends AtomicReference implements ayns, aypg {
    private static final long serialVersionUID = 8606673141535671828L;
    final /* synthetic */ azfs a;

    public azfr(azfs azfsVar) {
        this.a = azfsVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        azfs azfsVar = this.a;
        azfsVar.d.f(this);
        azfsVar.b(th);
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
        azfs azfsVar = this.a;
        azfsVar.d.f(this);
        azfsVar.sm();
    }
}
