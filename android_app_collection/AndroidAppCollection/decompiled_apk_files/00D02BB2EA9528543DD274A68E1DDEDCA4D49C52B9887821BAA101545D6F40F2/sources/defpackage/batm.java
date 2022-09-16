package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: batm  reason: default package */
/* loaded from: classes.dex */
public final class batm {
    private final dehp a;
    private final Executor b;

    public batm(dehp dehpVar, Executor executor) {
        this.a = dehpVar;
        this.b = executor;
    }

    public final void a(Runnable runnable) {
        if (bvrj.UI_THREAD.b()) {
            runnable.run();
        } else {
            this.b.execute(runnable);
        }
    }

    public final dehn<Void> b(Runnable runnable) {
        if (bvrj.BACKGROUND_THREADPOOL.b()) {
            runnable.run();
            return deha.a(null);
        }
        return deew.h(this.a.a(runnable), batl.a, dege.a);
    }

    public final <T> dehn<T> c(Callable<T> callable) {
        if (bvrj.BACKGROUND_THREADPOOL.b()) {
            try {
                return deha.a(callable.call());
            } catch (Exception e) {
                return deha.b(e);
            }
        }
        return this.a.c(callable);
    }
}
