package defpackage;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: ywr  reason: default package */
/* loaded from: classes4.dex */
public final class ywr {
    public static final int a = zgt.q(0, 2);
    public static final int b = zgt.q(2, 2);
    public static final int c = zgt.q(4, 6);
    public static final int d = zgt.q(10, 6);
    public static final int e = zgt.q(16, 2);
    public final ayoi f;
    private final azpm g;
    private final ScheduledExecutorService h;
    private volatile int i;

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(4:3|4|5|(7:16|17|8|9|10|11|12))|7|8|9|10|11|12|(1:(0))) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ywr() {
        /*
            r9 = this;
            java.lang.String r0 = "Couldn't invoke ThreadManager.currentRequestThreadFactory"
            ylk r1 = new ylk
            yli r2 = new yli
            r3 = 10
            java.lang.String r4 = "yt-shutdown"
            r2.<init>(r3, r4)
            r3 = 1
            r1.<init>(r3, r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            anlk r4 = new anlk
            r4.<init>()
            r4.c(r3)
            java.util.concurrent.ThreadFactory r3 = r1.getThreadFactory()
            r4.e(r3)
            java.util.concurrent.ThreadFactory r3 = defpackage.anlk.b(r4)
            r1.setThreadFactory(r3)
            java.util.concurrent.ScheduledExecutorService r3 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r1)
            r2.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 24
            r6.<init>(r5)
            java.lang.String r5 = "DelayedShutdownHook-for-"
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            ankz r5 = new ankz
            r5.<init>(r1, r2)
            r4.getClass()
            java.lang.String r1 = "com.google.appengine.runtime.environment"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r2 = 0
            if (r1 != 0) goto L61
            goto Lb3
        L61:
            java.lang.String r1 = "com.google.appengine.api.utils.SystemProperty"
            java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = "com.google.apphosting.api.ApiProxy"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r6 = "getCurrentEnvironment"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> Lb3
            java.lang.reflect.Method r1 = r1.getMethod(r6, r7)     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lb3
            r7 = 0
            java.lang.Object r1 = r1.invoke(r7, r6)     // Catch: java.lang.Throwable -> Lb3
            if (r1 == 0) goto Lb3
            java.lang.String r1 = "com.google.appengine.api.ThreadManager"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L94 java.lang.NoSuchMethodException -> L9e java.lang.ClassNotFoundException -> La5 java.lang.IllegalAccessException -> Lac
            java.lang.String r6 = "currentRequestThreadFactory"
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L94 java.lang.NoSuchMethodException -> L9e java.lang.ClassNotFoundException -> La5 java.lang.IllegalAccessException -> Lac
            java.lang.reflect.Method r1 = r1.getMethod(r6, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L94 java.lang.NoSuchMethodException -> L9e java.lang.ClassNotFoundException -> La5 java.lang.IllegalAccessException -> Lac
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L94 java.lang.NoSuchMethodException -> L9e java.lang.ClassNotFoundException -> La5 java.lang.IllegalAccessException -> Lac
            java.lang.Object r1 = r1.invoke(r7, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L94 java.lang.NoSuchMethodException -> L9e java.lang.ClassNotFoundException -> La5 java.lang.IllegalAccessException -> Lac
            java.util.concurrent.ThreadFactory r1 = (java.util.concurrent.ThreadFactory) r1     // Catch: java.lang.reflect.InvocationTargetException -> L94 java.lang.NoSuchMethodException -> L9e java.lang.ClassNotFoundException -> La5 java.lang.IllegalAccessException -> Lac
            goto Lb7
        L94:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = defpackage.amqs.a(r0)
            throw r0
        L9e:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0, r1)
            throw r2
        La5:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0, r1)
            throw r2
        Lac:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0, r1)
            throw r2
        Lb3:
            java.util.concurrent.ThreadFactory r1 = java.util.concurrent.Executors.defaultThreadFactory()
        Lb7:
            java.lang.Thread r0 = r1.newThread(r5)
            r0.setName(r4)     // Catch: java.lang.SecurityException -> Lbe
        Lbe:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            r1.addShutdownHook(r0)
            r9.<init>()
            r9.h = r3
            r9.i = r2
            int r0 = defpackage.ywr.b
            r1 = 2
            int r0 = defpackage.zgt.w(r2, r0, r1)
            long r0 = defpackage.zgt.x(r0, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            azpm r0 = defpackage.azpm.aI(r0)
            r9.g = r0
            azpx r0 = r0.aO()
            ayoi r0 = r0.R()
            r9.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywr.<init>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: all -> 0x00a2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0017, B:16:0x0048, B:18:0x0054, B:20:0x005c, B:23:0x0063, B:27:0x0077, B:29:0x008b, B:13:0x0024, B:15:0x003a), top: B:39:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(final int r10, int r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            azpm r0 = r9.g     // Catch: java.lang.Throwable -> La2
            java.lang.Object r0 = r0.aJ()     // Catch: java.lang.Throwable -> La2
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> La2
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> La2
            int r0 = defpackage.zgt.s(r0)     // Catch: java.lang.Throwable -> La2
            int r1 = defpackage.ywr.c     // Catch: java.lang.Throwable -> La2
            r2 = 0
            r3 = 1
            if (r10 == r1) goto L1b
            int r4 = defpackage.ywr.d     // Catch: java.lang.Throwable -> La2
            if (r10 != r4) goto L48
        L1b:
            r4 = -1
            if (r11 == r4) goto L23
            if (r11 != r3) goto L21
            goto L23
        L21:
            r4 = 0
            goto L24
        L23:
            r4 = 1
        L24:
            defpackage.aqxo.p(r4)     // Catch: java.lang.Throwable -> La2
            int r4 = defpackage.zgt.v(r0, r10)     // Catch: java.lang.Throwable -> La2
            int r4 = r4 + r11
            int r11 = java.lang.Math.max(r4, r2)     // Catch: java.lang.Throwable -> La2
            int r4 = defpackage.zgt.t(r10)     // Catch: java.lang.Throwable -> La2
            int r11 = java.lang.Math.min(r11, r4)     // Catch: java.lang.Throwable -> La2
            if (r11 != r3) goto L48
            java.util.concurrent.ScheduledExecutorService r4 = r9.h     // Catch: java.lang.Throwable -> La2
            ywq r5 = new ywq     // Catch: java.lang.Throwable -> La2
            r5.<init>()     // Catch: java.lang.Throwable -> La2
            r6 = 30
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> La2
            r4.schedule(r5, r6, r8)     // Catch: java.lang.Throwable -> La2
        L48:
            int r10 = defpackage.zgt.w(r0, r10, r11)     // Catch: java.lang.Throwable -> La2
            int r11 = defpackage.ywr.a     // Catch: java.lang.Throwable -> La2
            int r4 = defpackage.zgt.v(r10, r11)     // Catch: java.lang.Throwable -> La2
            if (r4 != 0) goto L62
            int r4 = defpackage.ywr.b     // Catch: java.lang.Throwable -> La2
            int r4 = defpackage.zgt.v(r10, r4)     // Catch: java.lang.Throwable -> La2
            if (r4 == 0) goto L62
            int r1 = defpackage.zgt.v(r10, r1)     // Catch: java.lang.Throwable -> La2
            if (r1 <= 0) goto L63
        L62:
            r2 = 1
        L63:
            r9.i = r2     // Catch: java.lang.Throwable -> La2
            int r1 = defpackage.ywr.e     // Catch: java.lang.Throwable -> La2
            int r2 = r9.i     // Catch: java.lang.Throwable -> La2
            int r10 = defpackage.zgt.w(r10, r1, r2)     // Catch: java.lang.Throwable -> La2
            int r1 = defpackage.zgt.v(r0, r11)     // Catch: java.lang.Throwable -> La2
            r2 = 3
            if (r1 == r2) goto La0
            if (r0 != r10) goto L77
            goto La0
        L77:
            azpm r1 = r9.g     // Catch: java.lang.Throwable -> La2
            long r3 = defpackage.zgt.x(r10, r0)     // Catch: java.lang.Throwable -> La2
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> La2
            r1.c(r0)     // Catch: java.lang.Throwable -> La2
            int r0 = defpackage.zgt.v(r10, r11)     // Catch: java.lang.Throwable -> La2
            r1 = 2
            if (r0 != r1) goto L9e
            int r11 = defpackage.zgt.w(r10, r11, r2)     // Catch: java.lang.Throwable -> La2
            azpm r0 = r9.g     // Catch: java.lang.Throwable -> La2
            long r10 = defpackage.zgt.x(r11, r10)     // Catch: java.lang.Throwable -> La2
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> La2
            r0.c(r10)     // Catch: java.lang.Throwable -> La2
            monitor-exit(r9)
            return
        L9e:
            monitor-exit(r9)
            return
        La0:
            monitor-exit(r9)
            return
        La2:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywr.a(int, int):void");
    }
}
