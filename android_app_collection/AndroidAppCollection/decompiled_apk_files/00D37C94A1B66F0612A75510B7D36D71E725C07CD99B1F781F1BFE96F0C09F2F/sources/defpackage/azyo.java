package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: azyo  reason: default package */
/* loaded from: classes2.dex */
final class azyo extends azvj implements Executor, azyr {
    private final azyn b;
    private final int d;
    private final String e;
    private final ConcurrentLinkedQueue f;
    private final azts g;

    public azyo(azyn azynVar, int i) {
        azynVar.getClass();
        this.b = azynVar;
        this.d = i;
        this.e = "Dispatchers.IO";
        this.f = new ConcurrentLinkedQueue();
        this.g = ayme.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(java.lang.Runnable r3, boolean r4) {
        /*
            r2 = this;
        L0:
            azts r0 = r2.g
            int r0 = r0.b()
            int r1 = r2.d
            if (r0 > r1) goto L10
            azyn r0 = r2.b
            r0.e(r3, r2, r4)
            return
        L10:
            java.util.concurrent.ConcurrentLinkedQueue r0 = r2.f
            r0.add(r3)
            azts r3 = r2.g
            int r3 = r3.a()
            int r0 = r2.d
            if (r3 < r0) goto L20
            return
        L20:
            java.util.concurrent.ConcurrentLinkedQueue r3 = r2.f
            java.lang.Object r3 = r3.poll()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            if (r3 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azyo.g(java.lang.Runnable, boolean):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // defpackage.azyr
    public final int e() {
        return 1;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        g(runnable, false);
    }

    @Override // defpackage.azyr
    public final void f() {
        Runnable runnable = (Runnable) this.f.poll();
        if (runnable != null) {
            this.b.e(runnable, this, true);
            return;
        }
        this.g.a();
        Runnable runnable2 = (Runnable) this.f.poll();
        if (runnable2 == null) {
            return;
        }
        g(runnable2, true);
    }

    @Override // defpackage.azur
    public final void st(azrd azrdVar, Runnable runnable) {
        azrdVar.getClass();
        g(runnable, false);
    }

    @Override // defpackage.azur
    public final String toString() {
        return this.e;
    }
}
