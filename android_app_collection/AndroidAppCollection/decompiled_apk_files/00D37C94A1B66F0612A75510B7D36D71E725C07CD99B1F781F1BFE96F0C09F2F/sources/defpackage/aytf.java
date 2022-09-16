package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: aytf  reason: default package */
/* loaded from: classes2.dex */
final class aytf extends AtomicInteger implements ayns {
    private static final long serialVersionUID = -8360547806504310570L;
    final ayns a;
    final AtomicBoolean b;
    final aypf c;

    public aytf(ayns aynsVar, AtomicBoolean atomicBoolean, aypf aypfVar) {
        this.a = aynsVar;
        this.b = atomicBoolean;
        this.c = aypfVar;
        lazySet(3);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.c.qr();
        if (this.b.compareAndSet(false, true)) {
            this.a.b(th);
        } else {
            azqc.d(th);
        }
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        this.c.d(aypgVar);
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        if (decrementAndGet() != 0 || !this.b.compareAndSet(false, true)) {
            return;
        }
        this.a.sm();
    }
}
