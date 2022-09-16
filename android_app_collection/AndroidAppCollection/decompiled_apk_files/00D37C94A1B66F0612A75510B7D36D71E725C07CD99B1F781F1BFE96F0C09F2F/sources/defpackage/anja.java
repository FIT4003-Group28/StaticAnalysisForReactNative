package defpackage;

import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anja  reason: default package */
/* loaded from: classes.dex */
public final class anja extends IdentityHashMap implements Closeable {
    public final anjb a = new anjb(this);
    private volatile boolean b;
    private volatile CountDownLatch c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Closeable closeable, Executor executor) {
        executor.getClass();
        if (closeable == null) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                put(closeable, executor);
            } else {
                anjd.f(closeable, executor);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            for (Map.Entry entry : entrySet()) {
                anjd.f((Closeable) entry.getKey(), (Executor) entry.getValue());
            }
            clear();
        }
    }
}
