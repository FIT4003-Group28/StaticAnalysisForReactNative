package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: dzah  reason: default package */
/* loaded from: classes6.dex */
final class dzah implements Runnable, dzak {
    private final Handler a;
    private final Runnable b;
    private volatile boolean c;

    public dzah(Handler handler, Runnable runnable) {
        this.a = handler;
        this.b = runnable;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        this.c = true;
        this.a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            IllegalStateException illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.", th);
            dzfy.a(illegalStateException);
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
        }
    }
}
