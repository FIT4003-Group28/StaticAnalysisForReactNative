package defpackage;

import java.io.Closeable;
import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: vjq  reason: default package */
/* loaded from: classes4.dex */
public final class vjq implements Closeable {
    private Semaphore a;

    public vjq(Semaphore semaphore) {
        this.a = semaphore;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Semaphore semaphore = this.a;
        if (semaphore != null) {
            semaphore.release();
            this.a = null;
        }
    }
}
