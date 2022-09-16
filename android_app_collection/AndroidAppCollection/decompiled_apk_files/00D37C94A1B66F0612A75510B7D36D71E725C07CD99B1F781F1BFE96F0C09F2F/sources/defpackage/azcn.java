package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azcn  reason: default package */
/* loaded from: classes2.dex */
final class azcn extends AtomicReference implements ayod, aypg {
    private static final long serialVersionUID = 4603919676453758899L;
    final ayot a;
    final ayov b;

    public azcn(ayot ayotVar, ayov ayovVar) {
        this.a = ayotVar;
        this.b = ayovVar;
    }

    @Override // defpackage.ayod
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

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        this.a.sh(obj);
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.g(this, aypgVar)) {
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayod
    public final void sm() {
        aypg aypgVar = (aypg) get();
        if (aypgVar == ayqi.a || !compareAndSet(aypgVar, null)) {
            return;
        }
        this.b.W(new azcm(this.a, this));
    }
}
