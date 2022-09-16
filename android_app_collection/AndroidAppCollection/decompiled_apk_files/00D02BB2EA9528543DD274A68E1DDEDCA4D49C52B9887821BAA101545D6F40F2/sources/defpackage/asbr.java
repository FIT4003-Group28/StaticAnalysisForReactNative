package defpackage;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.ScheduledFuture;
/* compiled from: PG */
/* renamed from: asbr  reason: default package */
/* loaded from: classes2.dex */
public class asbr {
    public final cqat a;
    public boolean b = false;
    @dzsi
    public ScheduledFuture<?> c;
    private final bvjj d;
    private final btrm e;
    private final dehq f;
    private final long g;
    private final long h;
    private final long i;
    private final PriorityQueue<Long> j;

    public asbr(bvjj bvjjVar, btrm btrmVar, cqat cqatVar, btvo btvoVar, dehq dehqVar) {
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        this.j = priorityQueue;
        this.c = null;
        dkxh P = btvoVar.getUgcParameters().P();
        this.a = cqatVar;
        this.e = btrmVar;
        this.d = bvjjVar;
        long j = P.b;
        this.h = j;
        this.i = P.c;
        this.f = dehqVar;
        long j2 = P.a;
        if (j2 >= j) {
            this.g = j2;
        } else {
            this.g = j;
        }
        priorityQueue.clear();
        priorityQueue.addAll(((asbv) bvjjVar.L(bvjk.iY, (dssr) asbv.b.cu(7), asbv.b)).a);
        while (this.j.size() > this.i) {
            this.j.poll();
        }
        long e = this.a.e();
        Iterator<Long> it = this.j.iterator();
        if (!it.hasNext() || e >= it.next().longValue()) {
            b(e);
        } else {
            this.j.clear();
        }
    }

    private final synchronized long c(long j) {
        Iterator<Long> it = this.j.iterator();
        while (this.j.size() >= this.i) {
            long longValue = (it.next().longValue() + this.g) - j;
            if (longValue > 0) {
                return longValue;
            }
            it.remove();
        }
        return 0L;
    }

    public final boolean a() {
        long e = this.a.e();
        if (c(e) > 0) {
            return false;
        }
        this.j.add(Long.valueOf(e));
        b(e);
        bvjj bvjjVar = this.d;
        bvjk bvjkVar = bvjk.iY;
        asbu bZ = asbv.b.bZ();
        PriorityQueue<Long> priorityQueue = this.j;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        asbv asbvVar = (asbv) bZ.b;
        dsri dsriVar = asbvVar.a;
        if (!dsriVar.a()) {
            asbvVar.a = dsqw.ci(dsriVar);
        }
        dsod.bv(priorityQueue, asbvVar.a);
        bvjjVar.al(bvjkVar, bZ.bK());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r2 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.c(r7)     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            boolean r3 = r6.b     // Catch: java.lang.Throwable -> L5f
            if (r2 == r3) goto L39
            r6.b = r2     // Catch: java.lang.Throwable -> L5f
            btrm r3 = r6.e     // Catch: java.lang.Throwable -> L5f
            asbs r5 = new asbs     // Catch: java.lang.Throwable -> L5f
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            r3.b(r5)     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L3b
            java.util.concurrent.ScheduledFuture<?> r7 = r6.c     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L28
            r7.cancel(r4)     // Catch: java.lang.Throwable -> L5f
        L28:
            dehq r7 = r6.f     // Catch: java.lang.Throwable -> L5f
            asbq r8 = new asbq     // Catch: java.lang.Throwable -> L5f
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L5f
            dehu r7 = r7.d(r8, r0, r2)     // Catch: java.lang.Throwable -> L5f
            r6.c = r7     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r6)
            return
        L39:
            if (r2 != 0) goto L5d
        L3b:
            java.util.PriorityQueue<java.lang.Long> r0 = r6.j     // Catch: java.lang.Throwable -> L5f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5f
        L41:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L5f
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L5f
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L5f
            long r3 = r6.h     // Catch: java.lang.Throwable -> L5f
            long r1 = r1 + r3
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 >= 0) goto L59
            goto L5d
        L59:
            r0.remove()     // Catch: java.lang.Throwable -> L5f
            goto L41
        L5d:
            monitor-exit(r6)
            return
        L5f:
            r7 = move-exception
            monitor-exit(r6)
            goto L63
        L62:
            throw r7
        L63:
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asbr.b(long):void");
    }
}
