package defpackage;

import java.util.PriorityQueue;
/* compiled from: PG */
/* renamed from: crkp  reason: default package */
/* loaded from: classes5.dex */
public final class crkp {
    @dzsi
    public cqzw a;
    public final PriorityQueue<crko> b = new PriorityQueue<>();
    private final bvjj c;
    private final btrm d;
    private final cqat e;

    public crkp(bvjj bvjjVar, btrm btrmVar, cqat cqatVar) {
        this.c = bvjjVar;
        this.d = btrmVar;
        this.e = cqatVar;
    }

    public final void a() {
        this.a = null;
        this.b.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
        if ((r2.longValue() + r4) > r7.e.b()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r7 = this;
            cqzw r0 = r7.a
            if (r0 != 0) goto L5
            return
        L5:
            double r0 = r0.b
            int r0 = (int) r0
            java.util.PriorityQueue<crko> r1 = r7.b
            java.lang.Object r1 = r1.peek()
            crko r1 = (defpackage.crko) r1
            if (r1 != 0) goto L13
            return
        L13:
            int r2 = r1.b
            if (r2 > r0) goto Ldd
            int r0 = r0 - r2
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 > r2) goto Ld5
            dpdf r0 = r1.a
            bvjj r1 = r7.c
            bvjk r2 = defpackage.bvjk.gy
            vvo r3 = defpackage.vvo.b
            r4 = 7
            java.lang.Object r3 = r3.cu(r4)
            dssr r3 = (defpackage.dssr) r3
            vvo r4 = defpackage.vvo.b
            dssj r1 = r1.L(r2, r3, r4)
            vvo r1 = (defpackage.vvo) r1
            int r2 = r0.a
            r2 = r2 & 8
            if (r2 == 0) goto L6d
            dssd<java.lang.String, java.lang.Long> r2 = r1.a
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            dpdc r3 = r0.h
            if (r3 != 0) goto L45
            dpdc r3 = defpackage.dpdc.c
        L45:
            java.lang.String r3 = r3.a
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            dpdc r5 = r0.h
            if (r5 != 0) goto L4f
            dpdc r5 = defpackage.dpdc.c
        L4f:
            int r5 = r5.b
            long r5 = (long) r5
            long r4 = r4.toMillis(r5)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L6d
            long r2 = r2.longValue()
            long r2 = r2 + r4
            cqat r4 = r7.e
            long r4 = r4.b()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L77
        L6d:
            btrm r2 = r7.d
            crmb r3 = new crmb
            r3.<init>(r0)
            r2.b(r3)
        L77:
            int r2 = r0.a
            r2 = r2 & 8
            if (r2 == 0) goto Lcf
            dpdc r0 = r0.h
            if (r0 != 0) goto L83
            dpdc r0 = defpackage.dpdc.c
        L83:
            java.util.HashMap r2 = new java.util.HashMap
            dssd<java.lang.String, java.lang.Long> r1 = r1.a
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r2.<init>(r1)
            java.lang.String r0 = r0.a
            cqat r1 = r7.e
            long r3 = r1.b()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.put(r0, r1)
            bvjj r0 = r7.c
            bvjk r1 = defpackage.bvjk.gy
            vvo r3 = defpackage.vvo.b
            dsqp r3 = r3.bZ()
            vvm r3 = (defpackage.vvm) r3
            boolean r4 = r3.c
            if (r4 == 0) goto Lb3
            r3.bF()
            r4 = 0
            r3.c = r4
        Lb3:
            MessageType extends dsqw<MessageType, BuilderType> r4 = r3.b
            vvo r4 = (defpackage.vvo) r4
            dssd<java.lang.String, java.lang.Long> r5 = r4.a
            boolean r6 = r5.a
            if (r6 != 0) goto Lc3
            dssd r5 = r5.a()
            r4.a = r5
        Lc3:
            dssd<java.lang.String, java.lang.Long> r4 = r4.a
            r4.putAll(r2)
            dsqw r2 = r3.bK()
            r0.al(r1, r2)
        Lcf:
            java.util.PriorityQueue<crko> r0 = r7.b
            r0.poll()
            return
        Ld5:
            java.util.PriorityQueue<crko> r0 = r7.b
            r0.poll()
            r7.b()
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crkp.b():void");
    }
}
