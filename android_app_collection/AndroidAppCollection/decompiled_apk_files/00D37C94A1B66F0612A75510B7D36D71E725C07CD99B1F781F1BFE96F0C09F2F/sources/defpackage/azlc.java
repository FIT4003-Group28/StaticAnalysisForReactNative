package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azlc  reason: default package */
/* loaded from: classes2.dex */
final class azlc extends AtomicReference implements ayot, aypg {
    private static final long serialVersionUID = 3258103020495908596L;
    final ayot a;
    final ayqe b;

    public azlc(ayot ayotVar, ayqe ayqeVar) {
        this.a = ayotVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.b(th);
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
        try {
            ayov ayovVar = (ayov) this.b.a(obj);
            ayrd.b(ayovVar, "The single returned by the mapper is null");
            if (e()) {
                return;
            }
            ayovVar.W(new azcm(this, this.a, 2));
        } catch (Throwable th) {
            bapv.j(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.g(this, aypgVar)) {
            this.a.sj(this);
        }
    }
}
