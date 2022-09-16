package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: azmz  reason: default package */
/* loaded from: classes2.dex */
final class azmz extends ayoq {
    final AtomicBoolean a = new AtomicBoolean();
    private final aypf b = new aypf();
    private final azmy c;
    private final azna d;

    public azmz(azmy azmyVar) {
        azna aznaVar;
        this.c = azmyVar;
        if (!azmyVar.c.b) {
            while (true) {
                if (!azmyVar.b.isEmpty()) {
                    aznaVar = (azna) azmyVar.b.poll();
                    if (aznaVar != null) {
                        break;
                    }
                } else {
                    aznaVar = new azna(azmyVar.d);
                    azmyVar.c.d(aznaVar);
                    break;
                }
            }
        } else {
            aznaVar = aznb.d;
        }
        this.d = aznaVar;
    }

    @Override // defpackage.ayoq
    public final aypg c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.b.b) {
            return ayqj.INSTANCE;
        }
        return this.d.i(runnable, j, timeUnit, this.b);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.a.get();
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (this.a.compareAndSet(false, true)) {
            this.b.qr();
            azmy azmyVar = this.c;
            azna aznaVar = this.d;
            aznaVar.a = System.nanoTime() + azmyVar.a;
            azmyVar.b.offer(aznaVar);
        }
    }
}
