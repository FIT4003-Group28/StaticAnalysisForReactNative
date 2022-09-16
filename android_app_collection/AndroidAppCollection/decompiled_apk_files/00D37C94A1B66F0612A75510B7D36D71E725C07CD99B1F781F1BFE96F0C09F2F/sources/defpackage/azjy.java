package defpackage;

import java.util.concurrent.atomic.AtomicLongArray;
/* compiled from: PG */
/* renamed from: azjy  reason: default package */
/* loaded from: classes2.dex */
final class azjy implements bamf {
    final int a;
    final int b;
    final /* synthetic */ azjz c;

    public azjy(azjz azjzVar, int i, int i2) {
        this.c = azjzVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.bamf
    public final void si() {
        if (this.c.b.compareAndSet(this.a + this.b, 0L, 1L)) {
            azjz azjzVar = this.c;
            int i = this.b;
            if (azjzVar.b.decrementAndGet(i + i) != 0) {
                return;
            }
            azjzVar.k = true;
            azjzVar.f.si();
            if (azjzVar.getAndIncrement() != 0) {
                return;
            }
            azjzVar.g.d();
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        long j2;
        if (azof.h(j)) {
            AtomicLongArray atomicLongArray = this.c.b;
            do {
                j2 = atomicLongArray.get(this.a);
                if (j2 == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLongArray.compareAndSet(this.a, j2, ayno.c(j2, j)));
            if (this.c.l.get() != this.b) {
                return;
            }
            this.c.d();
        }
    }
}
