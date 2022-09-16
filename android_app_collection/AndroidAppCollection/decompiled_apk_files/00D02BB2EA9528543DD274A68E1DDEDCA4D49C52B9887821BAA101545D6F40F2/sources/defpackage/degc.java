package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: degc  reason: default package */
/* loaded from: classes.dex */
public abstract class degc<T> extends dehm<T> {
    private final Executor a;
    final /* synthetic */ degd b;

    public degc(degd degdVar, Executor executor) {
        this.b = degdVar;
        dbsk.s(executor);
        this.a = executor;
    }

    public abstract void b(T t);

    @Override // defpackage.dehm
    public final boolean d() {
        return this.b.isDone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.k(e);
        }
    }

    @Override // defpackage.dehm
    public final void f(T t, Throwable th) {
        degd degdVar = this.b;
        degdVar.c = null;
        if (th != null) {
            if (th instanceof ExecutionException) {
                degdVar.k(th.getCause());
                return;
            } else if (th instanceof CancellationException) {
                degdVar.cancel(false);
                return;
            } else {
                degdVar.k(th);
                return;
            }
        }
        b(t);
    }
}
