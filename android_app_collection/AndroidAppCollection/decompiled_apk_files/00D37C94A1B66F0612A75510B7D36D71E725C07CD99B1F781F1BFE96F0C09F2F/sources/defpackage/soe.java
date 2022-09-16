package defpackage;

import android.util.Log;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: soe  reason: default package */
/* loaded from: classes4.dex */
final class soe implements Runnable {
    private final Runnable a;
    private final /* synthetic */ int b;

    public soe(Runnable runnable) {
        this.a = runnable;
    }

    public soe(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    public final String toString() {
        if (this.b == 0) {
            return this.a.toString();
        }
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            try {
                this.a.run();
                return;
            } catch (Throwable th) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                return;
            }
        }
        try {
            this.a.run();
        } catch (Throwable th2) {
            soc.a.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ErrorLoggingExecutorService$LoggingRunnable", "run", "Uncaught exception from runnable", th2);
            Log.e("ErrorLoggingExecutor", "Uncaught exception from runnable", th2);
        }
    }
}
