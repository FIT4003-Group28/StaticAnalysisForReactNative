package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anji  reason: default package */
/* loaded from: classes.dex */
public abstract class anji extends anks {
    private final Executor a;
    final /* synthetic */ anjj b;

    public anji(anjj anjjVar, Executor executor) {
        this.b = anjjVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(Object obj);

    @Override // defpackage.anks
    public final void d(Throwable th) {
        this.b.c = null;
        if (th instanceof ExecutionException) {
            this.b.e(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.b.cancel(false);
        } else {
            this.b.e(th);
        }
    }

    @Override // defpackage.anks
    public final void e(Object obj) {
        this.b.c = null;
        c(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        try {
            this.a.execute(this);
        } catch (RejectedExecutionException e) {
            this.b.e(e);
        }
    }

    @Override // defpackage.anks
    public final boolean g() {
        return this.b.isDone();
    }
}
