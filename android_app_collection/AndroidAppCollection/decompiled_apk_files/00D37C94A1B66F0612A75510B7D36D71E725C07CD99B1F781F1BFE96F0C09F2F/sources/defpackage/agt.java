package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agt  reason: default package */
/* loaded from: classes.dex */
public final class agt implements ankt {
    final WeakReference a;
    public final ago b = new ags(this);

    public agt(agp agpVar) {
        this.a = new WeakReference(agpVar);
    }

    public final boolean b(Throwable th) {
        ago agoVar = this.b;
        ago.g(th);
        if (ago.b.d(agoVar, null, new agi(th))) {
            ago.e(agoVar);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        agp agpVar = (agp) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (!cancel || agpVar == null) {
            return cancel;
        }
        agpVar.a = null;
        agpVar.b = null;
        agpVar.c.f(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
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

    @Override // defpackage.ankt
    public final void qY(Runnable runnable, Executor executor) {
        this.b.qY(runnable, executor);
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
