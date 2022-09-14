package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvrf  reason: default package */
/* loaded from: classes.dex */
public final class bvrf implements bvrb {
    static final dcep<bvrj> a;
    private static final int b;
    private static final int c;
    private static final int d;
    private final bvre e;
    private final bvre f;
    private final bvre g;
    private final bvre h;
    private final bvre i;
    private final bvre j;
    private final bvre k;
    private final bvre l;
    private final cqat m;
    private final bvrg n;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        b = availableProcessors;
        int i = availableProcessors + availableProcessors + (availableProcessors / 2);
        c = i;
        d = Math.max(4, Math.min(8, i));
        a = dcnm.a(bvrj.UI_THREAD, bvrj.BACKGROUND_THREADPOOL, bvrj.LOW_PRIORITY_BACKGROUND_THREADPOOL, bvrj.DOWNLOADER_THREADPOOL, bvrj.TILE_PREP_THREADPOOL, bvrj.ROAD_GRAPH_TILE_PREP_THREADPOOL, bvrj.LAYOUT_INFLATER_THREADPOOL);
    }

    public bvrf(Context context, cqat cqatVar) {
        int i = d;
        bvrg bvrgVar = new bvrg();
        this.m = cqatVar;
        bvqp bvqpVar = new bvqp(context, bvrj.BACKGROUND_THREADPOOL);
        bvrj.BACKGROUND_THREADPOOL.name();
        this.e = new bvre(i, bvqpVar);
        bvqp bvqpVar2 = new bvqp(context, bvrj.DOWNLOADER_THREADPOOL);
        bvrj.DOWNLOADER_THREADPOOL.name();
        int i2 = 3;
        this.f = new bvre(3, bvqpVar2);
        int i3 = b;
        int min = Math.min(i3, true != ((ActivityManager) context.getSystemService("activity")).isLowRamDevice() ? 3 : 1);
        bvqp bvqpVar3 = new bvqp(context, bvrj.LOW_PRIORITY_BACKGROUND_THREADPOOL);
        bvrj.LOW_PRIORITY_BACKGROUND_THREADPOOL.name();
        this.g = new bvre(min, bvqpVar3);
        i2 = i3 <= 4 ? 1 : i2;
        bvqp bvqpVar4 = new bvqp(context, bvrj.TILE_PREP_THREADPOOL);
        bvrj.TILE_PREP_THREADPOOL.name();
        this.h = new bvre(i2, bvqpVar4);
        bvqp bvqpVar5 = new bvqp(context, bvrj.NETWORK_THREADPOOL);
        bvrj.NETWORK_THREADPOOL.name();
        this.j = new bvre(5, bvqpVar5);
        bvqp bvqpVar6 = new bvqp(context, bvrj.LOCATION_FRESHNESS_WAITING_THREADPOOL);
        bvrj.LOCATION_FRESHNESS_WAITING_THREADPOOL.name();
        this.k = new bvre(2, bvqpVar6);
        bvqp bvqpVar7 = new bvqp(context, bvrj.OFFLINE_REGION_PROCESSING_THREADPOOL);
        bvrj.OFFLINE_REGION_PROCESSING_THREADPOOL.name();
        this.l = new bvre(2, bvqpVar7);
        bvqp bvqpVar8 = new bvqp(context, bvrj.ROAD_GRAPH_TILE_PREP_THREADPOOL);
        bvrj.ROAD_GRAPH_TILE_PREP_THREADPOOL.name();
        this.i = new bvre(1, bvqpVar8);
        this.n = bvrgVar;
        bvrgVar.a(bvrj.UI_THREAD, new bvql(Looper.getMainLooper()));
    }

    @dzsi
    private final bvql k(bvrj bvrjVar) {
        return this.n.a.get(bvrjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    @Override // defpackage.bvrb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Runnable r5, defpackage.bvrj r6, long r7) {
        /*
            r4 = this;
            bvrj r0 = defpackage.bvrj.CURRENT
            int r0 = r6.ordinal()
            r1 = 0
            if (r0 == 0) goto Lc8
            r3 = 7
            if (r0 == r3) goto L97
            r3 = 18
            if (r0 == r3) goto L94
            r3 = 2
            if (r0 == r3) goto L97
            r3 = 3
            if (r0 == r3) goto L91
            r3 = 4
            if (r0 == r3) goto L8e
            switch(r0) {
                case 10: goto L8b;
                case 11: goto L7c;
                case 12: goto L79;
                case 13: goto L76;
                default: goto L1d;
            }
        L1d:
            bvql r0 = r4.k(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = java.lang.String.valueOf(r6)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 27
            r2.<init>(r1)
            java.lang.String r1 = "No executor registered for "
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            defpackage.dbsk.t(r0, r6)
            android.os.Handler r6 = r0.a
            boolean r6 = r6.postDelayed(r5, r7)
            if (r6 == 0) goto L4c
            return
        L4c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 88
            r8.<init>(r7)
            java.lang.String r7 = "Tried to schedule "
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = ", but its executor is not accepting work (probably already shut down)."
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r6.<init>(r5)
            throw r6
        L76:
            bvre r6 = r4.l
            goto L99
        L79:
            bvre r6 = r4.h
            goto L99
        L7c:
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto L83
            bvre r6 = r4.k
            goto L99
        L83:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Can't schedule a delayed task on Threads.LOCATION_FRESHNESS_WAITING_THREADPOOL"
            r5.<init>(r6)
            throw r5
        L8b:
            bvre r6 = r4.j
            goto L99
        L8e:
            bvre r6 = r4.g
            goto L99
        L91:
            bvre r6 = r4.f
            goto L99
        L94:
            bvre r6 = r4.i
            goto L99
        L97:
            bvre r6 = r4.e
        L99:
            boolean r0 = r5 instanceof defpackage.bvqx
            if (r0 != 0) goto Lb5
            bvqy r0 = new bvqy
            cqat r1 = r4.m
            r0.<init>(r5, r1, r7)
            boolean r5 = r6.isShutdown()
            if (r5 != 0) goto Lc7
            java.util.concurrent.BlockingQueue r5 = r6.getQueue()
            r5.add(r0)
            r6.prestartCoreThread()
            return
        Lb5:
            bvqx r5 = (defpackage.bvqx) r5
            boolean r7 = r6.isShutdown()
            if (r7 != 0) goto Lc7
            java.util.concurrent.BlockingQueue r7 = r6.getQueue()
            r7.add(r5)
            r6.prestartCoreThread()
        Lc7:
            return
        Lc8:
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto Ld0
            r5.run()
            return
        Ld0:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Can't schedule a delayed task on Threads.CURRENT"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvrf.a(java.lang.Runnable, bvrj, long):void");
    }

    @Override // defpackage.bvrb
    public final void b(Runnable runnable, bvrj bvrjVar) {
        a(runnable, bvrjVar, 0L);
    }

    @Override // defpackage.bvrb
    public final void c(Runnable runnable, bvrj bvrjVar) {
        Semaphore semaphore = new Semaphore(0);
        a(new bvrd(runnable, semaphore), bvrjVar, 0L);
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.bvrb
    public final boolean d(bvrj bvrjVar) {
        if (bvrjVar == bvrj.BACKGROUND_THREADPOOL || bvrjVar == bvrj.DOWNLOADER_THREADPOOL || bvrjVar == bvrj.LOW_PRIORITY_BACKGROUND_THREADPOOL || bvrjVar == bvrj.TILE_PREP_THREADPOOL || bvrjVar == bvrj.OFFLINE_REGION_PROCESSING_THREADPOOL) {
            return false;
        }
        return bvrjVar.b();
    }

    @Override // defpackage.bvrb
    public final boolean e(bvrj bvrjVar, Object obj) {
        if (a.contains(bvrjVar)) {
            return true;
        }
        bvrg bvrgVar = this.n;
        synchronized (bvrgVar.b) {
            if (!bvrgVar.a.containsKey(bvrjVar)) {
                return false;
            }
            bvrgVar.b.n(bvrjVar, obj);
            return true;
        }
    }

    @Override // defpackage.bvrb
    public final void f(bvrj bvrjVar, Object obj) {
        boolean G;
        if (a.contains(bvrjVar)) {
            return;
        }
        bvrg bvrgVar = this.n;
        synchronized (bvrgVar.b) {
            G = bvrgVar.b.G(bvrjVar, obj);
        }
        dbsk.j(G, "Thread %s isn't acquired by object %s", bvrjVar, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    @Override // defpackage.bvrb
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.concurrent.Executor g(defpackage.bvrj r3) {
        /*
            r2 = this;
            bvrj r0 = defpackage.bvrj.CURRENT
            int r0 = r3.ordinal()
            r1 = 2
            if (r0 == r1) goto L33
            r1 = 3
            if (r0 == r1) goto L30
            r1 = 4
            if (r0 == r1) goto L2d
            r1 = 7
            if (r0 == r1) goto L33
            r1 = 18
            if (r0 == r1) goto L2a
            switch(r0) {
                case 10: goto L27;
                case 11: goto L24;
                case 12: goto L21;
                case 13: goto L1e;
                default: goto L19;
            }
        L19:
            bvql r3 = r2.k(r3)
            goto L35
        L1e:
            bvre r3 = r2.l
            goto L35
        L21:
            bvre r3 = r2.h
            goto L35
        L24:
            bvre r3 = r2.k
            goto L35
        L27:
            bvre r3 = r2.j
            return r3
        L2a:
            bvre r3 = r2.i
            goto L35
        L2d:
            bvre r3 = r2.g
            goto L35
        L30:
            bvre r3 = r2.f
            goto L35
        L33:
            bvre r3 = r2.e
        L35:
            if (r3 != 0) goto L39
            r3 = 0
            return r3
        L39:
            bvrc r0 = new bvrc
            cqat r1 = r2.m
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvrf.g(bvrj):java.util.concurrent.Executor");
    }

    @Override // defpackage.bvrb
    public final Executor h() {
        Executor g = g(bvrj.UI_THREAD);
        dbsk.s(g);
        return g;
    }

    @Override // defpackage.bvrb
    public final bvrg i() {
        return this.n;
    }

    @Override // defpackage.bvrb
    public final void j() {
        bvre bvreVar;
        try {
            this.e.shutdown();
            this.e.awaitTermination(1L, TimeUnit.SECONDS);
            bvreVar = this.e;
        } catch (InterruptedException unused) {
            bvreVar = this.e;
        } catch (Throwable th) {
            this.e.shutdownNow();
            throw th;
        }
        bvreVar.shutdownNow();
    }
}
