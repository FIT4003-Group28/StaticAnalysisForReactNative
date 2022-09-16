package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azlx  reason: default package */
/* loaded from: classes2.dex */
final class azlx extends AtomicReference implements Runnable, ayot, aypg {
    private static final long serialVersionUID = 7000911171163930287L;
    final ayot a;
    final ayqm b = new ayqm();
    final ayov c;

    public azlx(ayot ayotVar, ayov ayovVar) {
        this.a = ayotVar;
        this.c = ayovVar;
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
        ayqi.c(this.b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.W(this);
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        this.a.sh(obj);
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }
}
