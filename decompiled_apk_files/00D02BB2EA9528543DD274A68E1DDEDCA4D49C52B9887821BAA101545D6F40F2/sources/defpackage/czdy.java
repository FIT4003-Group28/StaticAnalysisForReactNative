package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: czdy  reason: default package */
/* loaded from: classes5.dex */
public final class czdy {
    public final AtomicReference<CountDownLatch> a = new AtomicReference<>(new CountDownLatch(1));
    public final AtomicReference<czdx> b = new AtomicReference<>(czdx.o(cyes.FAILED_UNKNOWN));
    public final AtomicBoolean c = new AtomicBoolean(false);
    final czfj d;

    public czdy(czfj czfjVar) {
        this.d = czfjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final czdx a() {
        czdx czdxVar = this.b.get();
        if (czdxVar.e() > 0 && czdxVar.q()) {
            this.b.compareAndSet(czdxVar, czdx.o(cyes.FAILED_UNKNOWN));
        }
        return this.b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final czdx b(boolean z) {
        if (z) {
            this.a.get().await();
        }
        return a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        r5.a = r4.d.a(r5.c());
        r5.c().size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        r5 = r4.c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.czdx r5, boolean r6) {
        /*
            r4 = this;
        L0:
            r0 = 1
            czdx r1 = r4.a()     // Catch: java.lang.Throwable -> L52
            java.util.UUID r2 = r1.m()     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L1a
            java.util.UUID r2 = r1.m()     // Catch: java.lang.Throwable -> L52
            java.util.UUID r3 = r5.m()     // Catch: java.lang.Throwable -> L52
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L1a
            r6 = 0
        L1a:
            if (r6 != 0) goto L34
            boolean r2 = r1.s(r5)     // Catch: java.lang.Throwable -> L52
            if (r2 != 0) goto L23
            goto L34
        L23:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.c
        L25:
            r5.set(r0)
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> r5 = r4.a
            java.lang.Object r5 = r5.get()
            java.util.concurrent.CountDownLatch r5 = (java.util.concurrent.CountDownLatch) r5
            r5.countDown()
            return
        L34:
            java.util.concurrent.atomic.AtomicReference<czdx> r2 = r4.b     // Catch: java.lang.Throwable -> L52
            boolean r1 = r2.compareAndSet(r1, r5)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L0
            czfj r6 = r4.d     // Catch: java.lang.Throwable -> L52
            dcdc r1 = r5.c()     // Catch: java.lang.Throwable -> L52
            czfi r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L52
            r5.a = r6     // Catch: java.lang.Throwable -> L52
            dcdc r5 = r5.c()     // Catch: java.lang.Throwable -> L52
            r5.size()     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.c
            goto L25
        L52:
            r5 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.c
            r6.set(r0)
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.CountDownLatch> r6 = r4.a
            java.lang.Object r6 = r6.get()
            java.util.concurrent.CountDownLatch r6 = (java.util.concurrent.CountDownLatch) r6
            r6.countDown()
            goto L65
        L64:
            throw r5
        L65:
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czdy.c(czdx, boolean):void");
    }
}
