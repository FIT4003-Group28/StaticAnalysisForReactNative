package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: degy  reason: default package */
/* loaded from: classes.dex */
public final class degy<V> {
    private final boolean a;
    private final dcdc<dehn<? extends V>> b;

    public degy(boolean z, dcdc<dehn<? extends V>> dcdcVar) {
        this.a = z;
        this.b = dcdcVar;
    }

    public final <C> dehn<C> a(deff<C> deffVar, Executor executor) {
        return new degd(this.b, this.a, executor, deffVar);
    }

    public final <C> dehn<C> b(Callable<C> callable, Executor executor) {
        return new degd(this.b, this.a, executor, callable);
    }

    public final dehn<?> c(Runnable runnable, Executor executor) {
        return b(new degx(runnable), executor);
    }
}
