package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: degq  reason: default package */
/* loaded from: classes6.dex */
final class degq<V> extends degp<V> {
    private final dehn<V> a;

    public degq(dehn<V> dehnVar) {
        dbsk.s(dehnVar);
        this.a = dehnVar;
    }

    @Override // defpackage.dees, defpackage.dehn
    public final void Pk(Runnable runnable, Executor executor) {
        this.a.Pk(runnable, executor);
    }

    @Override // defpackage.dees, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.dees, java.util.concurrent.Future
    public final V get() {
        return this.a.get();
    }

    @Override // defpackage.dees, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.dees, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.dees
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.dees, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
