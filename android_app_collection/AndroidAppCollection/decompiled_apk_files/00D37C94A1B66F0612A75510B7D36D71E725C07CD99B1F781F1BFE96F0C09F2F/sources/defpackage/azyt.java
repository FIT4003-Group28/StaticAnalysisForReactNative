package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azyt  reason: default package */
/* loaded from: classes2.dex */
public final class azyt {
    public static final long a;
    public static final int b;
    public static final int c;
    public static final long d;

    static {
        long c2;
        long c3;
        c2 = azrp.c("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        a = c2;
        azrp.e("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12);
        int e = azrp.e("kotlinx.coroutines.scheduler.core.pool.size", azst.f(azyh.a, 2), 1, 0, 8);
        b = e;
        c = azrp.e("kotlinx.coroutines.scheduler.max.pool.size", azst.h(azyh.a * 128, e, 2097150), 0, 2097150, 4);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c3 = azrp.c("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE);
        d = timeUnit.toNanos(c3);
    }
}
