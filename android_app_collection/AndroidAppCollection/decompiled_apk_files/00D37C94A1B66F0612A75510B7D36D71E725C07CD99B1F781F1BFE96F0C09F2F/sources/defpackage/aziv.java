package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aziv  reason: default package */
/* loaded from: classes2.dex */
final class aziv extends AtomicInteger implements ayom, aypg {
    private static final long serialVersionUID = 1418547743690811973L;
    final ayom a;
    final AtomicReference b = new AtomicReference();
    final aziu c = new aziu(this);
    final azoj d = new azoj();

    public aziv(ayom ayomVar) {
        this.a = ayomVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        ayqi.c(this.c);
        axzl.g(this.a, th, this, this.d);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        ayom ayomVar = this.a;
        azoj azojVar = this.d;
        if (get() != 0 || !compareAndSet(0, 1)) {
            return;
        }
        ayomVar.c(obj);
        if (decrementAndGet() == 0) {
            return;
        }
        Throwable d = azom.d(azojVar);
        if (d != null) {
            ayomVar.b(d);
        } else {
            ayomVar.sm();
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) this.b.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        ayqi.c(this.b);
        axzl.e(this.a, this, this.d);
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this.b);
        ayqi.c(this.c);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.g(this.b, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        ayqi.c(this.c);
        axzl.e(this.a, this, this.d);
    }
}
