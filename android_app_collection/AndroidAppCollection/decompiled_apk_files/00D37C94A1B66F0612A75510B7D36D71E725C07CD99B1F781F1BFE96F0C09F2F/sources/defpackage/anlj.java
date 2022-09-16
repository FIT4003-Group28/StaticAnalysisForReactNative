package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: anlj  reason: default package */
/* loaded from: classes.dex */
final class anlj implements ThreadFactory {
    final /* synthetic */ ThreadFactory a;
    final /* synthetic */ String b;
    final /* synthetic */ AtomicLong c;
    final /* synthetic */ Boolean d;
    final /* synthetic */ Integer e;

    public anlj(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num) {
        this.a = threadFactory;
        this.b = str;
        this.c = atomicLong;
        this.d = bool;
        this.e = num;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        String str = this.b;
        if (str != null) {
            AtomicLong atomicLong = this.c;
            atomicLong.getClass();
            newThread.setName(anlk.a(str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        Boolean bool = this.d;
        if (bool != null) {
            newThread.setDaemon(bool.booleanValue());
        }
        Integer num = this.e;
        if (num != null) {
            newThread.setPriority(num.intValue());
        }
        return newThread;
    }
}
