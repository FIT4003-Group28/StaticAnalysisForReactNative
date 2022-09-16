package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azhg  reason: default package */
/* loaded from: classes2.dex */
public final class azhg implements ayok {
    private final AtomicReference a;

    public azhg(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0008, code lost:
        continue;
     */
    @Override // defpackage.ayok
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void az(defpackage.ayom r6) {
        /*
            r5 = this;
            azhe r0 = new azhe
            r0.<init>(r6)
            r6.sj(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference r6 = r5.a
            java.lang.Object r6 = r6.get()
            azhf r6 = (defpackage.azhf) r6
            if (r6 == 0) goto L18
            boolean r1 = r6.e()
            if (r1 == 0) goto L28
        L18:
            azhf r1 = new azhf
            java.util.concurrent.atomic.AtomicReference r2 = r5.a
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r2 = r5.a
            boolean r6 = r2.compareAndSet(r6, r1)
            if (r6 == 0) goto L8
            r6 = r1
        L28:
            java.util.concurrent.atomic.AtomicReference r1 = r6.d
            java.lang.Object r1 = r1.get()
            azhe[] r1 = (defpackage.azhe[]) r1
            azhe[] r2 = defpackage.azhf.b
            if (r1 == r2) goto L8
            int r2 = r1.length
            int r3 = r2 + 1
            azhe[] r3 = new defpackage.azhe[r3]
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r2)
            r3[r2] = r0
            java.util.concurrent.atomic.AtomicReference r2 = r6.d
            boolean r1 = r2.compareAndSet(r1, r3)
            if (r1 == 0) goto L28
            r1 = 0
            boolean r1 = r0.compareAndSet(r1, r6)
            if (r1 != 0) goto L51
            r6.f(r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azhg.az(ayom):void");
    }
}
