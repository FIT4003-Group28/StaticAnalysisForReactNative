package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: cnik  reason: default package */
/* loaded from: classes5.dex */
public final class cnik implements cmwv {
    public cnii a;
    public final SparseArray<cnij> b = new SparseArray<>();
    public final Handler c;
    private final cmya d;

    public cnik(cmya cmyaVar, Looper looper) {
        this.d = cmyaVar;
        this.c = new cnih(this, looper);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    @Override // defpackage.cmwv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r6) {
        /*
            r5 = this;
            r0 = 0
            cmya r1 = r5.d     // Catch: java.lang.IllegalStateException -> L8 android.os.RemoteException -> Lc
            int[] r1 = r1.e()     // Catch: java.lang.IllegalStateException -> L8 android.os.RemoteException -> Lc
            goto Le
        L8:
            r1 = move-exception
            defpackage.cniy.c(r1)
        Lc:
            int[] r1 = new int[r0]
        Le:
            int r2 = r1.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L1b
            r4 = r1[r3]
            if (r6 != r4) goto L18
            r6 = 1
            return r6
        L18:
            int r3 = r3 + 1
            goto L10
        L1b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnik.a(int):boolean");
    }

    @Override // defpackage.cmwv
    public final int b() {
        try {
            return this.d.g();
        } catch (RemoteException unused) {
            return 0;
        } catch (IllegalStateException e) {
            cniy.c(e);
            return 0;
        }
    }

    @Override // defpackage.cmwv
    public final void c(cmwu cmwuVar, int i) {
        synchronized (this.b) {
            cnij cnijVar = this.b.get(i);
            if (cnijVar != null) {
                if (cnijVar.a.contains(cmwuVar)) {
                    cnijVar.a.remove(cmwuVar);
                }
                if (cnijVar.a.isEmpty()) {
                    try {
                        this.d.f(i, this.a);
                    } catch (RemoteException unused) {
                    }
                    this.b.remove(i);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r4.d.h(r6, r4.a) == false) goto L23;
     */
    @Override // defpackage.cmwv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.cmwu r5, int r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L4f
            r0 = 22
            if (r6 > r0) goto L4f
            android.util.SparseArray<cnij> r0 = r4.b
            monitor-enter(r0)
            cnii r1 = r4.a     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L14
            cnii r1 = new cnii     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L4c
            r4.a = r1     // Catch: java.lang.Throwable -> L4c
        L14:
            android.util.SparseArray<cnij> r1 = r4.b     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L4c
            cnij r1 = (defpackage.cnij) r1     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L2a
            cnij r1 = new cnij     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            android.util.SparseArray<cnij> r2 = r4.b     // Catch: java.lang.Throwable -> L4c
            r2.put(r6, r1)     // Catch: java.lang.Throwable -> L4c
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            java.util.LinkedList<cmwu> r3 = r1.a     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r3.contains(r5)     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L38
            java.util.LinkedList<cmwu> r1 = r1.a     // Catch: java.lang.Throwable -> L4c
            r1.add(r5)     // Catch: java.lang.Throwable -> L4c
        L38:
            if (r2 == 0) goto L4a
            cmya r5 = r4.d     // Catch: android.os.RemoteException -> L44 java.lang.IllegalStateException -> L46 java.lang.Throwable -> L4c
            cnii r1 = r4.a     // Catch: android.os.RemoteException -> L44 java.lang.IllegalStateException -> L46 java.lang.Throwable -> L4c
            boolean r5 = r5.h(r6, r1)     // Catch: android.os.RemoteException -> L44 java.lang.IllegalStateException -> L46 java.lang.Throwable -> L4c
            if (r5 != 0) goto L4a
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return
        L46:
            r5 = move-exception
            defpackage.cniy.c(r5)     // Catch: java.lang.Throwable -> L4c
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return
        L4c:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            throw r5
        L4f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 31
            r0.<init>(r1)
            java.lang.String r1 = "invalid sensor type "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnik.d(cmwu, int):void");
    }
}
