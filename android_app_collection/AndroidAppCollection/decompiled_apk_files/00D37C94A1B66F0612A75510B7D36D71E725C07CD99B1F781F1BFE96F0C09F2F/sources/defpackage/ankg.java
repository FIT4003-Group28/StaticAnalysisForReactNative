package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ankg  reason: default package */
/* loaded from: classes.dex */
public final class ankg {
    private final boolean a;
    private final amuk b;

    public ankg(boolean z, amuk amukVar) {
        this.a = z;
        this.b = amukVar;
    }

    public final ankt a(Callable callable, Executor executor) {
        return new anjj(this.b, this.a, executor, callable);
    }

    public final ankt b(aniq aniqVar, Executor executor) {
        return new anjj(this.b, this.a, executor, aniqVar);
    }

    public final ankt c(Runnable runnable, Executor executor) {
        return a(new baoy(runnable, 1), executor);
    }
}
