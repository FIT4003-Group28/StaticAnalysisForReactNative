package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: qyo  reason: default package */
/* loaded from: classes4.dex */
public final class qyo implements ThreadFactory {
    private final String a;
    private final ThreadFactory b = Executors.defaultThreadFactory();

    public qyo(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(new qyp(runnable));
        newThread.setName(this.a);
        return newThread;
    }
}
