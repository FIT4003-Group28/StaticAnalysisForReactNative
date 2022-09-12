package defpackage;
/* compiled from: PG */
/* renamed from: kfe  reason: default package */
/* loaded from: classes.dex */
public final class kfe {
    public boolean a;
    public boolean b;
    @dzsi
    public cnif c;
    private final btrm f;
    public int e = 1;
    public final kfd d = new kfd(this);

    public kfe(btrm btrmVar) {
        dbsk.s(btrmVar);
        this.f = btrmVar;
    }

    public static /* synthetic */ void d(kfe kfeVar) {
        kfeVar.b = false;
    }

    public final boolean a() {
        return this.e == 3;
    }

    public final void b() {
        bvrj.UI_THREAD.c();
        if (this.e != 3 && !c(true)) {
            this.b = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0.d.g(r0.a) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(boolean r5) {
        /*
            r4 = this;
            cnif r0 = r4.c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r4.a     // Catch: defpackage.cmwm -> L39
            if (r2 != 0) goto L1f
            cmxu r2 = r0.d     // Catch: android.os.RemoteException -> L15 java.lang.IllegalStateException -> L1a defpackage.cmwm -> L39
            cnie r0 = r0.a     // Catch: android.os.RemoteException -> L15 java.lang.IllegalStateException -> L1a defpackage.cmwm -> L39
            boolean r0 = r2.g(r0)     // Catch: android.os.RemoteException -> L15 java.lang.IllegalStateException -> L1a defpackage.cmwm -> L39
            if (r0 == 0) goto L39
            goto L1f
        L15:
            r5 = move-exception
            defpackage.cniy.b(r5)     // Catch: defpackage.cmwm -> L39
            goto L39
        L1a:
            r5 = move-exception
            defpackage.cniy.c(r5)     // Catch: defpackage.cmwm -> L39
            goto L39
        L1f:
            r0 = 1
            r4.a = r0     // Catch: defpackage.cmwm -> L39
            r4.e(r0)     // Catch: defpackage.cmwm -> L39
            cnif r2 = r4.c     // Catch: defpackage.cmwm -> L39
            cmxu r3 = r2.d     // Catch: android.os.RemoteException -> L2f java.lang.IllegalStateException -> L34 defpackage.cmwm -> L39
            cnie r2 = r2.a     // Catch: android.os.RemoteException -> L2f java.lang.IllegalStateException -> L34 defpackage.cmwm -> L39
            r3.i(r2, r5)     // Catch: android.os.RemoteException -> L2f java.lang.IllegalStateException -> L34 defpackage.cmwm -> L39
            goto L38
        L2f:
            r5 = move-exception
            defpackage.cniy.b(r5)     // Catch: defpackage.cmwm -> L39
            goto L38
        L34:
            r5 = move-exception
            defpackage.cniy.c(r5)     // Catch: defpackage.cmwm -> L39
        L38:
            return r0
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfe.c(boolean):boolean");
    }

    public final void e(int i) {
        int i2 = this.e;
        this.e = i;
        boolean z = true;
        boolean z2 = i == 3;
        if (i2 != 3) {
            z = false;
        }
        if (z2 == z) {
            return;
        }
        this.f.b(new jzs(z2));
    }
}
