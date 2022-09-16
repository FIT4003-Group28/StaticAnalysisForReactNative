package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: ddq  reason: default package */
/* loaded from: classes3.dex */
public abstract class ddq implements Runnable {
    public final Throwable b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ddq() {
        this(false);
        boolean z = dfz.a;
    }

    public abstract void a(ddq ddqVar);

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a(this);
        } catch (Throwable th) {
            if (this.b != null) {
                Log.w("LithoThreadTracing", "--- start debug trace");
                Log.w("LithoThreadTracing", "Thread tracing stacktrace", this.b);
                Log.w("LithoThreadTracing", "--- end debug trace");
            }
            throw th;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ddq(defpackage.ddq r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            java.lang.Throwable r1 = r3.b
            if (r1 == 0) goto Lb
            r0 = 1
            goto Lb
        L9:
            boolean r1 = defpackage.dfz.a
        Lb:
            r2.<init>(r0)
            java.lang.Throwable r0 = r2.b
            if (r0 == 0) goto L19
            if (r3 == 0) goto L19
            java.lang.Throwable r3 = r3.b
            r0.initCause(r3)
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddq.<init>(ddq):void");
    }

    private ddq(boolean z) {
        if (!z) {
            this.b = null;
            return;
        }
        Thread currentThread = Thread.currentThread();
        this.b = new Throwable("Runnable instantiated on thread id: " + currentThread.getId() + ", name: " + currentThread.getName());
    }
}
