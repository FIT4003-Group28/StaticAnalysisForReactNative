package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anjx  reason: default package */
/* loaded from: classes.dex */
public final class anjx extends anko {
    private final ankt a;

    public anjx(ankt anktVar) {
        anktVar.getClass();
        this.a = anktVar;
    }

    @Override // defpackage.anie, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.anie, java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.anie, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.anie, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.anie, defpackage.ankt
    public final void qY(Runnable runnable, Executor executor) {
        this.a.qY(runnable, executor);
    }

    @Override // defpackage.anie
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.anie, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
