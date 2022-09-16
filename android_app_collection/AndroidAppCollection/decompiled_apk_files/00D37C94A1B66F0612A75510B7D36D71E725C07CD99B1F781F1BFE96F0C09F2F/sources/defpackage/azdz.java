package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azdz  reason: default package */
/* loaded from: classes2.dex */
public final class azdz extends AtomicReference implements ayom {
    private static final long serialVersionUID = -4823716997131257941L;
    final azea a;
    final int b;

    public azdz(azea azeaVar, int i) {
        this.a = azeaVar;
        this.b = i;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        azea azeaVar = this.a;
        if (azom.e(azeaVar.h, th)) {
            azeaVar.a();
            azeaVar.d();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.a.f(this.b, obj);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.g(this, aypgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r4 == r2.length) goto L18;
     */
    @Override // defpackage.ayom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sm() {
        /*
            r5 = this;
            azea r0 = r5.a
            int r1 = r5.b
            monitor-enter(r0)
            java.lang.Object[] r2 = r0.d     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        Lb:
            r1 = r2[r1]     // Catch: java.lang.Throwable -> L24
            r3 = 1
            if (r1 == 0) goto L18
            int r4 = r0.j     // Catch: java.lang.Throwable -> L24
            int r4 = r4 + r3
            r0.j = r4     // Catch: java.lang.Throwable -> L24
            int r2 = r2.length     // Catch: java.lang.Throwable -> L24
            if (r4 != r2) goto L1a
        L18:
            r0.g = r3     // Catch: java.lang.Throwable -> L24
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L20
            r0.a()
        L20:
            r0.d()
            return
        L24:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azdz.sm():void");
    }
}
