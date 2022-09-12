package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzda  reason: default package */
/* loaded from: classes6.dex */
final class dzda<T> extends AtomicReference<dzak> implements Runnable, dzak {
    private static final long serialVersionUID = 6812032969491025141L;
    final T a;
    final long b;
    final dzdb<T> c;
    final AtomicBoolean d = new AtomicBoolean();

    public dzda(T t, long j, dzdb<T> dzdbVar) {
        this.a = t;
        this.b = j;
        this.c = dzdbVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        dzbd.e(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.compareAndSet(false, true)) {
            dzdb<T> dzdbVar = this.c;
            long j = this.b;
            T t = this.a;
            if (j != dzdbVar.f) {
                return;
            }
            dzdbVar.a.c(t);
            dzbd.e(this);
        }
    }
}
