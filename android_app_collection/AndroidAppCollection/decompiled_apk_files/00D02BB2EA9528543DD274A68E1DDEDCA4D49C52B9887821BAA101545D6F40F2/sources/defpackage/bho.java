package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: bho  reason: default package */
/* loaded from: classes3.dex */
final class bho implements ThreadFactory {
    private int a = 0;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("WorkManager-WorkTimer-thread-" + this.a);
        this.a = this.a + 1;
        return newThread;
    }
}
