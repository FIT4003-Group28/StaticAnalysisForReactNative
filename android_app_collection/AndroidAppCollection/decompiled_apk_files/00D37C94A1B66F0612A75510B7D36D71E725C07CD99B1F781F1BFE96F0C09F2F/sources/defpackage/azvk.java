package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: azvk  reason: default package */
/* loaded from: classes2.dex */
public final class azvk extends azvj {
    private final Executor b;

    public azvk(Executor executor) {
        this.b = executor;
        azxn.a(executor);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof azvk) && ((azvk) obj).b == this.b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.b);
    }

    @Override // defpackage.azur
    public final void st(azrd azrdVar, Runnable runnable) {
        azrdVar.getClass();
        try {
            this.b.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            azww.b(azrdVar, cancellationException);
            azur azurVar = azvd.a;
            azvd.b.st(azrdVar, runnable);
        }
    }

    @Override // defpackage.azur
    public final String toString() {
        return this.b.toString();
    }
}
