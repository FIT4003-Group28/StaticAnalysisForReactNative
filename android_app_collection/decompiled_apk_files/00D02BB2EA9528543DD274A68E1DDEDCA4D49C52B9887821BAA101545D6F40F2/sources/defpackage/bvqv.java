package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/* compiled from: PG */
/* renamed from: bvqv  reason: default package */
/* loaded from: classes.dex */
final class bvqv<V> extends FutureTask<V> {
    public bvqv(Runnable runnable, V v) {
        super(runnable, v);
    }

    public final void a(V v) {
        set(v);
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        if (!isCancelled()) {
            try {
                get();
                th = null;
            } catch (ExecutionException e) {
                th = e.getCause();
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                return;
            }
            super.setException(th);
            if (th instanceof bvqw) {
                throw ((bvqw) th);
            }
            throw new bvqw(th);
        }
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        super.setException(th);
    }
}
