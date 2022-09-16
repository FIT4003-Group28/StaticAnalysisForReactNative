package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azdc  reason: default package */
/* loaded from: classes2.dex */
public final class azdc extends AtomicInteger implements ayoa, bamf {
    static final azdb a = new azdb(null);
    private static final long serialVersionUID = -5402190102429853762L;
    final bame b;
    final ayqe c;
    final azoj d = new azoj();
    final AtomicLong e = new AtomicLong();
    final AtomicReference f = new AtomicReference();
    bamf g;
    volatile boolean h;
    volatile boolean i;
    long j;

    public azdc(bame bameVar, ayqe ayqeVar) {
        this.b = bameVar;
        this.c = ayqeVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (azom.e(this.d, th)) {
            d();
            this.h = true;
            g();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        azdb azdbVar;
        azdb azdbVar2 = (azdb) this.f.get();
        if (azdbVar2 != null) {
            ayqi.c(azdbVar2);
        }
        try {
            ayov ayovVar = (ayov) this.c.a(obj);
            ayrd.b(ayovVar, "The mapper returned a null SingleSource");
            azdb azdbVar3 = new azdb(this);
            do {
                azdbVar = (azdb) this.f.get();
                if (azdbVar == a) {
                    return;
                }
            } while (!this.f.compareAndSet(azdbVar, azdbVar3));
            ayovVar.W(azdbVar3);
        } catch (Throwable th) {
            bapv.j(th);
            this.g.si();
            this.f.getAndSet(a);
            b(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        AtomicReference atomicReference = this.f;
        azdb azdbVar = a;
        azdb azdbVar2 = (azdb) atomicReference.getAndSet(azdbVar);
        if (azdbVar2 == null || azdbVar2 == azdbVar) {
            return;
        }
        ayqi.c(azdbVar2);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.g, bamfVar)) {
            this.g = bamfVar;
            this.b.f(this);
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r11 = this;
            int r0 = r11.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            bame r0 = r11.b
            azoj r1 = r11.d
            java.util.concurrent.atomic.AtomicReference r2 = r11.f
            java.util.concurrent.atomic.AtomicLong r3 = r11.e
            long r4 = r11.j
            r6 = 1
        L12:
            boolean r7 = r11.i
            if (r7 == 0) goto L17
            return
        L17:
            java.lang.Object r7 = r1.get()
            if (r7 == 0) goto L25
            java.lang.Throwable r1 = defpackage.azom.d(r1)
            r0.b(r1)
            return
        L25:
            boolean r7 = r11.h
            java.lang.Object r8 = r2.get()
            azdb r8 = (defpackage.azdb) r8
            if (r7 == 0) goto L3f
            if (r8 != 0) goto L41
            java.lang.Throwable r1 = defpackage.azom.d(r1)
            if (r1 == 0) goto L3b
            r0.b(r1)
            return
        L3b:
            r0.sm()
            return
        L3f:
            if (r8 == 0) goto L5b
        L41:
            java.lang.Object r7 = r8.b
            if (r7 == 0) goto L5b
            long r9 = r3.get()
            int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r7 != 0) goto L4e
            goto L5b
        L4e:
            r7 = 0
            r2.compareAndSet(r8, r7)
            java.lang.Object r7 = r8.b
            r0.c(r7)
            r7 = 1
            long r4 = r4 + r7
            goto L12
        L5b:
            r11.j = r4
            int r6 = -r6
            int r6 = r11.addAndGet(r6)
            if (r6 != 0) goto L12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azdc.g():void");
    }

    @Override // defpackage.bamf
    public final void si() {
        this.i = true;
        this.g.si();
        d();
    }

    @Override // defpackage.bame
    public final void sm() {
        this.h = true;
        g();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        ayno.a(this.e, j);
        g();
    }
}
