package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deiv  reason: default package */
/* loaded from: classes.dex */
public final class deiv<V> extends dego<V> implements RunnableFuture<V> {
    private volatile dehm<?> a;

    public deiv(deff<V> deffVar) {
        this.a = new deit(this, deffVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> deiv<V> d(deff<V> deffVar) {
        return new deiv<>(deffVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> deiv<V> f(Callable<V> callable) {
        return new deiv<>(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> deiv<V> g(Runnable runnable, V v) {
        return new deiv<>(Executors.callable(runnable, v));
    }

    @Override // defpackage.dees
    protected final void OO() {
        dehm<?> dehmVar;
        if (i() && (dehmVar = this.a) != null) {
            dehmVar.g();
        }
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dees
    public final String OP() {
        dehm<?> dehmVar = this.a;
        if (dehmVar != null) {
            String valueOf = String.valueOf(dehmVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
            sb.append("task=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        return super.OP();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        dehm<?> dehmVar = this.a;
        if (dehmVar != null) {
            dehmVar.run();
        }
        this.a = null;
    }

    public deiv(Callable<V> callable) {
        this.a = new deiu(this, callable);
    }
}
