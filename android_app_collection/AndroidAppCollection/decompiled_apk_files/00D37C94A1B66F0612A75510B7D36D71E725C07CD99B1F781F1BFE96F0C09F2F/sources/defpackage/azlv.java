package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azlv  reason: default package */
/* loaded from: classes2.dex */
final class azlv extends AtomicReference implements ayot, aypg {
    private static final long serialVersionUID = -5314538511045349925L;
    final ayot a;
    final ayqe b;

    public azlv(ayot ayotVar, ayqe ayqeVar) {
        this.a = ayotVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        try {
            ayov ayovVar = (ayov) this.b.a(th);
            ayrd.b(ayovVar, "The nextFunction returned a null SingleSource.");
            ayovVar.W(new azcm(this, this.a, 1));
        } catch (Throwable th2) {
            bapv.j(th2);
            this.a.b(new aypo(th, th2));
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) get());
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        this.a.sh(obj);
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.g(this, aypgVar)) {
            this.a.sj(this);
        }
    }
}
