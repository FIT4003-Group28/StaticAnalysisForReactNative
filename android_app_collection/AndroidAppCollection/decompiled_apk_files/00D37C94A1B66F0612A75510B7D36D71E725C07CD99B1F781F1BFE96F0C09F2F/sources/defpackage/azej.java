package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azej  reason: default package */
/* loaded from: classes2.dex */
final class azej extends AtomicReference implements Runnable, aypg {
    private static final long serialVersionUID = 6812032969491025141L;
    final Object a;
    final long b;
    final azek c;
    final AtomicBoolean d = new AtomicBoolean();

    public azej(Object obj, long j, azek azekVar) {
        this.a = obj;
        this.b = j;
        this.c = azekVar;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == ayqi.a;
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.compareAndSet(false, true)) {
            azek azekVar = this.c;
            long j = this.b;
            Object obj = this.a;
            if (j != azekVar.g) {
                return;
            }
            azekVar.a.c(obj);
            ayqi.c(this);
        }
    }
}
