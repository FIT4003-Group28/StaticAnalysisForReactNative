package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aywc  reason: default package */
/* loaded from: classes2.dex */
final class aywc extends AtomicReference implements ayns, aypg {
    private static final long serialVersionUID = 8606673141535671828L;
    final /* synthetic */ aywd a;

    public aywc(aywd aywdVar) {
        this.a = aywdVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        aywd aywdVar = this.a;
        aywdVar.d.f(this);
        aywdVar.b(th);
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
        aywd aywdVar = this.a;
        aywdVar.d.f(this);
        aywdVar.sm();
    }
}
