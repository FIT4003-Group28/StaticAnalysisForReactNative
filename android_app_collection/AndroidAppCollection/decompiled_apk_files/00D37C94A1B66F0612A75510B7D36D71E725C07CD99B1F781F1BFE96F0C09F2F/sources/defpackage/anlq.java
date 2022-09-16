package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
/* compiled from: PG */
/* renamed from: anlq  reason: default package */
/* loaded from: classes.dex */
public final class anlq extends anjv implements RunnableFuture {
    private volatile anks a;

    public anlq(aniq aniqVar) {
        this.a = new anlo(this, aniqVar);
    }

    public static anlq f(aniq aniqVar) {
        return new anlq(aniqVar);
    }

    public static anlq g(Callable callable) {
        return new anlq(callable);
    }

    public static anlq h(Runnable runnable, Object obj) {
        return new anlq(Executors.callable(runnable, obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anie
    public final String c() {
        anks anksVar = this.a;
        if (anksVar != null) {
            String valueOf = String.valueOf(anksVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
            sb.append("task=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        return super.c();
    }

    @Override // defpackage.anie
    protected final void qu() {
        anks anksVar;
        if (p() && (anksVar = this.a) != null) {
            anksVar.h();
        }
        this.a = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        anks anksVar = this.a;
        if (anksVar != null) {
            anksVar.run();
        }
        this.a = null;
    }

    public anlq(Callable callable) {
        this.a = new anlp(this, callable);
    }
}
