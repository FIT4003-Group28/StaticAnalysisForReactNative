package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ajc  reason: default package */
/* loaded from: classes2.dex */
final class ajc<T> implements dehn<T> {
    final WeakReference<aiy<T>> a;
    public final aix<T> b = new ajb(this);

    public ajc(aiy<T> aiyVar) {
        this.a = new WeakReference<>(aiyVar);
    }

    @Override // defpackage.dehn
    public final void Pk(Runnable runnable, Executor executor) {
        this.b.Pk(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(Throwable th) {
        aix<T> aixVar = this.b;
        if (aix.b.e(aixVar, null, new air(th))) {
            aix.e(aixVar);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        aiy<T> aiyVar = this.a.get();
        boolean cancel = this.b.cancel(z);
        if (!cancel || aiyVar == null) {
            return cancel;
        }
        aiyVar.a = null;
        aiyVar.b = null;
        aiyVar.c.b(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
