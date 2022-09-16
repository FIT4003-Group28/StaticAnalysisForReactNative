package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: rid  reason: default package */
/* loaded from: classes4.dex */
final class rid implements ThreadFactory {
    private final ThreadFactory a = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
