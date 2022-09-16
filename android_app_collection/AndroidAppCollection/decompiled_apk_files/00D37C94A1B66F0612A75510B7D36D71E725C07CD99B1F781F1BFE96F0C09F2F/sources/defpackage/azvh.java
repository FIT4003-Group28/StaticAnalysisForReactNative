package defpackage;
/* compiled from: PG */
/* renamed from: azvh  reason: default package */
/* loaded from: classes2.dex */
public abstract class azvh extends azvg {
    public final aztu e = ayme.f(null);
    public final aztu f = ayme.f(null);
    private final aztr b = ayme.d(false);

    @Override // defpackage.azvg
    protected final void g() {
        azwe azweVar = azwe.a;
        azwe.b.set(null);
        this.b.c();
        boolean z = azuy.a;
        aztu aztuVar = this.e;
        while (true) {
            Object obj = aztuVar.a;
            if (obj == null) {
                if (this.e.c(null, azvi.a)) {
                    break;
                }
            } else if (!(obj instanceof azya)) {
                if (obj == azvi.a) {
                    break;
                }
                azya azyaVar = new azya(8, true);
                azyaVar.a((Runnable) obj);
                if (this.e.c(obj, azyaVar)) {
                    break;
                }
            } else {
                ((azya) obj).d();
                break;
            }
        }
        do {
        } while (k() <= 0);
        System.nanoTime();
        babq babqVar = (babq) this.f.a;
        if (babqVar == null) {
            return;
        }
        synchronized (babqVar) {
            throw null;
        }
    }

    public final long k() {
        if (i()) {
            return 0L;
        }
        Runnable runnable = null;
        if (((babq) this.f.a) != null) {
            throw null;
        }
        aztu aztuVar = this.e;
        while (true) {
            Object obj = aztuVar.a;
            if (obj == null) {
                break;
            } else if (!(obj instanceof azya)) {
                if (obj == azvi.a) {
                    break;
                } else if (this.e.c(obj, null)) {
                    runnable = (Runnable) obj;
                    break;
                }
            } else {
                azya azyaVar = (azya) obj;
                Object b = azyaVar.b();
                if (b != azya.a) {
                    runnable = (Runnable) b;
                    break;
                }
                this.e.c(obj, azyaVar.c());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        azxl azxlVar = this.d;
        if (((azxlVar != null && !azxlVar.a()) ? 0L : Long.MAX_VALUE) == 0) {
            return 0L;
        }
        Object obj2 = this.e.a;
        if (obj2 != null) {
            if (!(obj2 instanceof azya)) {
                if (obj2 != azvi.a) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            } else if (!((azya) obj2).e()) {
                return 0L;
            }
        }
        babq babqVar = (babq) this.f.a;
        if (babqVar != null) {
            synchronized (babqVar) {
            }
            return Long.MAX_VALUE;
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        defpackage.azuz.b.l(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.Runnable r6) {
        /*
            r5 = this;
            aztu r0 = r5.e
        L2:
            java.lang.Object r1 = r0.a
            aztr r2 = r5.b
            boolean r2 = r2.a()
            if (r2 == 0) goto Ld
            goto L5e
        Ld:
            if (r1 != 0) goto L19
            aztu r1 = r5.e
            r2 = 0
            boolean r1 = r1.c(r2, r6)
            if (r1 == 0) goto L2
            goto L50
        L19:
            boolean r2 = r1 instanceof defpackage.azya
            r3 = 1
            if (r2 == 0) goto L34
            r2 = r1
            azya r2 = (defpackage.azya) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L50
            if (r4 == r3) goto L2a
            goto L5e
        L2a:
            aztu r3 = r5.e
            azya r2 = r2.c()
            r3.c(r1, r2)
            goto L2
        L34:
            azyg r2 = defpackage.azvi.a
            if (r1 == r2) goto L5e
            azya r2 = new azya
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r6)
            aztu r3 = r5.e
            boolean r1 = r3.c(r1, r2)
            if (r1 == 0) goto L2
        L50:
            java.lang.Thread r6 = r5.c()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r6) goto L5d
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L5d:
            return
        L5e:
            azuz r0 = defpackage.azuz.b
            r0.l(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azvh.l(java.lang.Runnable):void");
    }

    @Override // defpackage.azur
    public final void st(azrd azrdVar, Runnable runnable) {
        azrdVar.getClass();
        l(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean m() {
        azxl azxlVar = this.d;
        if (azxlVar != null && !azxlVar.a()) {
            return false;
        }
        if (((babq) this.f.a) == null) {
            Object obj = this.e.a;
            if (obj == null) {
                return true;
            }
            return obj instanceof azya ? ((azya) obj).e() : obj == azvi.a;
        }
        throw null;
    }
}
