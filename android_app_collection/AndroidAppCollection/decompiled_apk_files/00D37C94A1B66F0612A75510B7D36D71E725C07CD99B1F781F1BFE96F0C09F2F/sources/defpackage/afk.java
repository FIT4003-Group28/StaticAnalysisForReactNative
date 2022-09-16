package defpackage;

import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afk  reason: default package */
/* loaded from: classes.dex */
public final class afk implements ankt {
    private final Throwable a;

    public afk() {
    }

    public afk(Throwable th) {
        this.a = th;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        throw new ExecutionException(this.a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // defpackage.ankt
    public final void qY(Runnable runnable, Executor executor) {
        hz.g(runnable);
        hz.g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Log.e("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    public final String toString() {
        return super.toString() + "[status=FAILURE, cause=[" + this.a + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        hz.g(timeUnit);
        get();
        return null;
    }
}
