package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: aoaj  reason: default package */
/* loaded from: classes.dex */
public final class aoaj implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);
    private final /* synthetic */ int b;

    public aoaj(int i) {
        this.b = i;
    }

    public aoaj() {
    }

    public aoaj(int i, byte[] bArr) {
        this.b = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                Thread thread = new Thread(runnable);
                thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.a.getAndIncrement())));
                return thread;
            }
            ibx ibxVar = new ibx(runnable, 4, (short[]) null);
            return new Thread(ibxVar, "CrAsyncTask #" + this.a.getAndIncrement());
        }
        return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
    }
}
