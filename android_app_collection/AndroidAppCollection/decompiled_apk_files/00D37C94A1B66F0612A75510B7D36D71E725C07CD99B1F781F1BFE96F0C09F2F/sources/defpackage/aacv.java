package defpackage;

import java.lang.Thread;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: aacv  reason: default package */
/* loaded from: classes.dex */
public final class aacv implements Thread.UncaughtExceptionHandler {
    public final azqb a;
    volatile Thread.UncaughtExceptionHandler b;
    public volatile boolean c;

    public aacv(azqb azqbVar) {
        this.a = azqbVar;
    }

    private final void b(ampg ampgVar) {
        try {
            ((yve) this.a.get()).b(ampgVar).get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            afus.c(2, 5, "Failed to store uncaught exception crash counter.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        b(ydy.n);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (!this.c) {
            b(ydy.m);
        }
        if (this.b != null) {
            this.b.uncaughtException(thread, th);
        }
    }
}
