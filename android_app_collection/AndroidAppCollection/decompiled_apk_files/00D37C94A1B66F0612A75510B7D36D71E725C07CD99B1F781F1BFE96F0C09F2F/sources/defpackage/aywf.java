package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aywf  reason: default package */
/* loaded from: classes2.dex */
final class aywf extends AtomicReference implements ayns, aypg {
    private static final long serialVersionUID = 8606673141535671828L;
    final /* synthetic */ aywg a;

    public aywf(aywg aywgVar) {
        this.a = aywgVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        aywg aywgVar = this.a;
        aywgVar.d.f(this);
        aywgVar.b(th);
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
        aywg aywgVar = this.a;
        aywgVar.d.f(this);
        aywgVar.sm();
    }
}
