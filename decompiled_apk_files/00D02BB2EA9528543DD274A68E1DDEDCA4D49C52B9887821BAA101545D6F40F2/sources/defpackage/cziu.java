package defpackage;

import java.io.Closeable;
import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: cziu  reason: default package */
/* loaded from: classes5.dex */
public final class cziu implements Closeable {
    @dzsi
    public Semaphore a;

    public cziu(@dzsi Semaphore semaphore) {
        this.a = semaphore;
    }

    public final Semaphore a() {
        Semaphore semaphore = this.a;
        this.a = null;
        return semaphore;
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
