package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: degr  reason: default package */
/* loaded from: classes.dex */
public abstract class degr<V> extends dcbq implements Future<V> {
    @Override // defpackage.dcbq
    protected /* bridge */ /* synthetic */ Object SC() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return g().cancel(z);
    }

    protected abstract Future<? extends V> g();

    public V get() {
        return g().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return g().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return g().isDone();
    }

    public V get(long j, TimeUnit timeUnit) {
        return g().get(j, timeUnit);
    }
}
