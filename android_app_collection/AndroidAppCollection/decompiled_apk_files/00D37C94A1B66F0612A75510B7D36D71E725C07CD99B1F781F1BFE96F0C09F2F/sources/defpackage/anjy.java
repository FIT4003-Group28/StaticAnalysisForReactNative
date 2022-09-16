package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anjy  reason: default package */
/* loaded from: classes.dex */
public abstract class anjy extends amtj implements Future, ankt {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return e().cancel(z);
    }

    protected abstract ankt d();

    protected /* bridge */ /* synthetic */ Future e() {
        throw null;
    }

    @Override // defpackage.amtj
    protected /* bridge */ /* synthetic */ Object g() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return e().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return e().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return e().isDone();
    }

    @Override // defpackage.ankt
    public final void qY(Runnable runnable, Executor executor) {
        d().qY(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return e().get(j, timeUnit);
    }
}
