package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzez  reason: default package */
/* loaded from: classes6.dex */
public final class dzez {
    public static final boolean a;
    public static final int b;
    static final AtomicReference<ScheduledExecutorService> c = new AtomicReference<>();
    static final Map<ScheduledThreadPoolExecutor, Object> d = new ConcurrentHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r2 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[LOOP:0: B:15:0x004e->B:22:0x007a, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[ORIG_RETURN, RETURN] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            defpackage.dzez.c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            defpackage.dzez.d = r0
            java.util.Properties r0 = java.lang.System.getProperties()
            dzex r1 = new dzex
            r1.<init>()
            java.lang.String r2 = "rx2.purge-enabled"
            boolean r3 = r0.containsKey(r2)
            r4 = 1
            if (r3 == 0) goto L2d
            java.lang.String r2 = r0.getProperty(r2)
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            r1.a = r2
            if (r2 == 0) goto L42
            goto L2f
        L2d:
            r1.a = r4
        L2f:
            java.lang.String r2 = "rx2.purge-period-seconds"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L42
            java.lang.String r0 = r0.getProperty(r2)     // Catch: java.lang.NumberFormatException -> L42
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L42
            r1.b = r0     // Catch: java.lang.NumberFormatException -> L42
            goto L44
        L42:
            r1.b = r4
        L44:
            boolean r0 = r1.a
            defpackage.dzez.a = r0
            int r1 = r1.b
            defpackage.dzez.b = r1
            if (r0 == 0) goto L7e
        L4e:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> r0 = defpackage.dzez.c
            java.lang.Object r1 = r0.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            if (r1 == 0) goto L59
            goto L7e
        L59:
            dzeu r1 = new dzeu
            java.lang.String r2 = "RxSchedulerPurge"
            r1.<init>(r2)
            java.util.concurrent.ScheduledExecutorService r5 = java.util.concurrent.Executors.newScheduledThreadPool(r4, r1)
            r1 = 0
            boolean r0 = r0.compareAndSet(r1, r5)
            if (r0 == 0) goto L7a
            dzey r6 = new dzey
            r6.<init>()
            int r0 = defpackage.dzez.b
            long r7 = (long) r0
            long r9 = (long) r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r5.scheduleAtFixedRate(r6, r7, r9, r11)
            return
        L7a:
            r5.shutdownNow()
            goto L4e
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzez.<clinit>():void");
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }
}
