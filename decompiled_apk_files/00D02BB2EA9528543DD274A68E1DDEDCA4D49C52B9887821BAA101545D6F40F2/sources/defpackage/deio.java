package defpackage;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: deio  reason: default package */
/* loaded from: classes.dex */
final class deio implements ThreadFactory {
    final /* synthetic */ ThreadFactory a;
    final /* synthetic */ String b;
    final /* synthetic */ AtomicLong c;
    final /* synthetic */ Boolean d;
    final /* synthetic */ Integer e;

    public deio(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num) {
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
            newThread.setName(String.format(Locale.ROOT, str, Long.valueOf(this.c.getAndIncrement())));
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
