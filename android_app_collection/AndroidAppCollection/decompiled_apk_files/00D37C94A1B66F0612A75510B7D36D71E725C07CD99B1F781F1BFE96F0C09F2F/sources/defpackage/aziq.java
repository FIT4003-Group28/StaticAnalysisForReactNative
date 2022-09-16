package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aziq  reason: default package */
/* loaded from: classes2.dex */
public final class aziq extends AtomicInteger implements ayom, aypg {
    static final azip a;
    private static final long serialVersionUID = -3491074160481096299L;
    final ayom b;
    final ayqe c;
    final int d;
    volatile boolean f;
    volatile boolean g;
    aypg h;
    volatile long j;
    final AtomicReference i = new AtomicReference();
    final azoj e = new azoj();

    static {
        azip azipVar = new azip(null, -1L, 1);
        a = azipVar;
        ayqi.c(azipVar);
    }

    public aziq(ayom ayomVar, ayqe ayqeVar, int i) {
        this.b = ayomVar;
        this.c = ayqeVar;
        this.d = i;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.f || !azom.e(this.e, th)) {
            azqc.d(th);
            return;
        }
        f();
        this.f = true;
        g();
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        azip azipVar;
        long j = this.j + 1;
        this.j = j;
        azip azipVar2 = (azip) this.i.get();
        if (azipVar2 != null) {
            ayqi.c(azipVar2);
        }
        try {
            ayok ayokVar = (ayok) this.c.a(obj);
            ayrd.b(ayokVar, "The ObservableSource returned is null");
            azip azipVar3 = new azip(this, j, this.d);
            do {
                azipVar = (azip) this.i.get();
                if (azipVar == a) {
                    return;
                }
            } while (!this.i.compareAndSet(azipVar, azipVar3));
            ayokVar.az(azipVar3);
        } catch (Throwable th) {
            bapv.j(th);
            this.h.qr();
            b(th);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.g;
    }

    final void f() {
        azip azipVar;
        azip azipVar2 = (azip) this.i.get();
        azip azipVar3 = a;
        if (azipVar2 == azipVar3 || (azipVar = (azip) this.i.getAndSet(azipVar3)) == azipVar3 || azipVar == null) {
            return;
        }
        ayqi.c(azipVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x000d, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r10 = this;
            int r0 = r10.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            ayom r0 = r10.b
            java.util.concurrent.atomic.AtomicReference r1 = r10.i
            r2 = 1
            r3 = 1
        Ld:
            boolean r4 = r10.g
            if (r4 == 0) goto L12
            return
        L12:
            boolean r4 = r10.f
            if (r4 == 0) goto L35
            java.lang.Object r4 = r1.get()
            azoj r5 = r10.e
            java.lang.Object r5 = r5.get()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L2e
            azoj r1 = r10.e
            java.lang.Throwable r1 = defpackage.azom.d(r1)
            r0.b(r1)
            return
        L2e:
            if (r4 == 0) goto L31
            goto L35
        L31:
            r0.sm()
            return
        L35:
            java.lang.Object r4 = r1.get()
            azip r4 = (defpackage.azip) r4
            if (r4 == 0) goto Lb5
            ayrn r5 = r4.d
            if (r5 == 0) goto Lb5
            boolean r6 = r4.e
            r7 = 0
            r8 = 0
            if (r6 == 0) goto L65
            boolean r6 = r5.j()
            azoj r9 = r10.e
            java.lang.Object r9 = r9.get()
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            if (r9 == 0) goto L5f
            azoj r1 = r10.e
            java.lang.Throwable r1 = defpackage.azom.d(r1)
            r0.b(r1)
            return
        L5f:
            if (r6 == 0) goto L65
            r1.compareAndSet(r4, r8)
            goto Ld
        L65:
            boolean r6 = r10.g
            if (r6 == 0) goto L6a
            return
        L6a:
            java.lang.Object r6 = r1.get()
            if (r4 != r6) goto Ld
            azoj r6 = r10.e
            java.lang.Object r6 = r6.get()
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto Lab
            boolean r6 = r4.e
            java.lang.Object r9 = r5.sl()     // Catch: java.lang.Throwable -> L81
            goto L99
        L81:
            r7 = move-exception
            defpackage.bapv.j(r7)
            azoj r9 = r10.e
            defpackage.azom.e(r9, r7)
            r1.compareAndSet(r4, r8)
            r10.f()
            aypg r7 = r10.h
            r7.qr()
            r10.f = r2
            r9 = r8
            r7 = 1
        L99:
            if (r6 == 0) goto La2
            if (r9 != 0) goto La7
            r1.compareAndSet(r4, r8)
            goto Ld
        La2:
            if (r9 != 0) goto La7
            if (r7 != 0) goto Ld
            goto Lb5
        La7:
            r0.c(r9)
            goto L65
        Lab:
            azoj r1 = r10.e
            java.lang.Throwable r1 = defpackage.azom.d(r1)
            r0.b(r1)
            return
        Lb5:
            int r3 = -r3
            int r3 = r10.addAndGet(r3)
            if (r3 != 0) goto Ld
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aziq.g():void");
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (!this.g) {
            this.g = true;
            this.h.qr();
            f();
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.h, aypgVar)) {
            this.h = aypgVar;
            this.b.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (!this.f) {
            this.f = true;
            g();
        }
    }
}
