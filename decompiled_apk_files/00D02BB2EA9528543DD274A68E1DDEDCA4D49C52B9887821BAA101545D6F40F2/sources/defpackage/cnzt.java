package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cnzt  reason: default package */
/* loaded from: classes5.dex */
public final class cnzt<T> {
    private final ArrayBlockingQueue<T> a = new ArrayBlockingQueue<>(1);
    private boolean b = false;
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(T t) {
        if (!this.b) {
            this.b = true;
            this.a.offer(t);
            return;
        }
        throw new RuntimeException("BlockingChannel can be written only once.");
    }

    public final T b(long j) {
        if (!this.c) {
            this.c = true;
            return this.a.poll(j, TimeUnit.MILLISECONDS);
        }
        throw new RuntimeException("BlockingChannel can be read only once.");
    }
}
