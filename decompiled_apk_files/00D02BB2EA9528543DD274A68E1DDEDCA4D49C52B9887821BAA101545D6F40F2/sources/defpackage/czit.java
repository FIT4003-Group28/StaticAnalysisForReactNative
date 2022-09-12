package defpackage;

import java.io.Closeable;
import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: czit  reason: default package */
/* loaded from: classes5.dex */
public final class czit implements Closeable {
    private Semaphore a;

    public czit(Semaphore semaphore) {
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
