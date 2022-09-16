package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azcq  reason: default package */
/* loaded from: classes2.dex */
final class azcq extends AtomicReference implements ayod, aypg {
    private static final long serialVersionUID = -2187421758664251153L;
    final ayod a;
    final azcp b = new azcp(this);

    public azcq(ayod ayodVar) {
        this.a = ayodVar;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        ayqi.c(this.b);
        if (getAndSet(ayqi.a) != ayqi.a) {
            this.a.b(th);
        } else {
            azqc.d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (ayqi.c(this)) {
            this.a.sm();
        }
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

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        ayqi.c(this.b);
        if (getAndSet(ayqi.a) != ayqi.a) {
            this.a.sh(obj);
        }
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    @Override // defpackage.ayod
    public final void sm() {
        ayqi.c(this.b);
        if (getAndSet(ayqi.a) != ayqi.a) {
            this.a.sm();
        }
    }
}
