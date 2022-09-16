package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayui  reason: default package */
/* loaded from: classes2.dex */
public final class ayui extends ayua implements ayoa {
    static final ayug[] c = new ayug[0];
    static final ayug[] d = new ayug[0];
    final AtomicBoolean e;
    final AtomicReference f;
    volatile long g;
    final ayuh h;
    ayuh i;
    int j;
    Throwable k;
    volatile boolean l;

    public ayui(aynx aynxVar) {
        super(aynxVar);
        this.e = new AtomicBoolean();
        ayuh ayuhVar = new ayuh();
        this.h = ayuhVar;
        this.i = ayuhVar;
        this.f = new AtomicReference(c);
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        ayug[] ayugVarArr;
        ayug[] ayugVarArr2;
        ayug ayugVar = new ayug(bameVar, this);
        bameVar.f(ayugVar);
        do {
            ayugVarArr = (ayug[]) this.f.get();
            if (ayugVarArr == d) {
                break;
            }
            int length = ayugVarArr.length;
            ayugVarArr2 = new ayug[length + 1];
            System.arraycopy(ayugVarArr, 0, ayugVarArr2, 0, length);
            ayugVarArr2[length] = ayugVar;
        } while (!this.f.compareAndSet(ayugVarArr, ayugVarArr2));
        if (this.e.get() || !this.e.compareAndSet(false, true)) {
            ar(ayugVar);
        } else {
            this.b.ac(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0013 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ar(defpackage.ayug r15) {
        /*
            r14 = this;
            int r0 = r15.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            long r0 = r15.f
            int r2 = r15.e
            ayuh r3 = r15.d
            java.util.concurrent.atomic.AtomicLong r4 = r15.c
            bame r5 = r15.a
            r6 = 1
            r7 = 1
        L13:
            boolean r8 = r14.l
            long r9 = r14.g
            r11 = 0
            if (r8 == 0) goto L2c
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 != 0) goto L30
            r15.d = r11
            java.lang.Throwable r15 = r14.k
            if (r15 == 0) goto L28
            r5.b(r15)
            return
        L28:
            r5.sm()
            return
        L2c:
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 == 0) goto L56
        L30:
            long r8 = r4.get()
            r12 = -9223372036854775808
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 != 0) goto L3d
            r15.d = r11
            return
        L3d:
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 == 0) goto L56
            r8 = 16
            if (r2 != r8) goto L4a
            ayuh r2 = r3.b
            r3 = 0
            r3 = r2
            r2 = 0
        L4a:
            java.lang.Object[] r8 = r3.a
            r8 = r8[r2]
            r5.c(r8)
            int r2 = r2 + r6
            r8 = 1
            long r0 = r0 + r8
            goto L13
        L56:
            r15.f = r0
            r15.e = r2
            r15.d = r3
            int r7 = -r7
            int r7 = r15.addAndGet(r7)
            if (r7 != 0) goto L13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayui.ar(ayug):void");
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.l) {
            azqc.d(th);
            return;
        }
        this.k = th;
        this.l = true;
        for (ayug ayugVar : (ayug[]) this.f.getAndSet(d)) {
            ar(ayugVar);
        }
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        int i = this.j;
        if (i == 16) {
            ayuh ayuhVar = new ayuh();
            ayuhVar.a[0] = obj;
            this.j = 1;
            this.i.b = ayuhVar;
            this.i = ayuhVar;
        } else {
            this.i.a[i] = obj;
            this.j = i + 1;
        }
        this.g++;
        for (ayug ayugVar : (ayug[]) this.f.get()) {
            ar(ayugVar);
        }
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        bamfVar.sp(Long.MAX_VALUE);
    }

    @Override // defpackage.bame
    public final void sm() {
        this.l = true;
        for (ayug ayugVar : (ayug[]) this.f.getAndSet(d)) {
            ar(ayugVar);
        }
    }
}
