package defpackage;
/* compiled from: PG */
/* renamed from: azhk  reason: default package */
/* loaded from: classes3.dex */
public final class azhk<T> extends btrh<T> {
    public azhk(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        final gds gdsVar = (gds) obj;
        final azhi azhiVar = ((azhf) this.a).a;
        azhiVar.k.b(new Runnable(azhiVar, gdsVar) { // from class: azgz
            private final azhi a;
            private final gds b;

            {
                this.a = azhiVar;
                this.b = gdsVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[Catch: all -> 0x00c5, TryCatch #2 {, blocks: (B:4:0x0007, B:6:0x0011, B:8:0x0013, B:10:0x001a, B:12:0x0020, B:15:0x0042, B:17:0x0046, B:19:0x0062, B:20:0x0068, B:21:0x006a, B:27:0x0082, B:34:0x00a3, B:35:0x00a4, B:37:0x00b1, B:39:0x00b3, B:41:0x00b9, B:42:0x00c3, B:14:0x0036), top: B:54:0x0007 }] */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00b1 A[Catch: all -> 0x00c5, DONT_GENERATE, TryCatch #2 {, blocks: (B:4:0x0007, B:6:0x0011, B:8:0x0013, B:10:0x001a, B:12:0x0020, B:15:0x0042, B:17:0x0046, B:19:0x0062, B:20:0x0068, B:21:0x006a, B:27:0x0082, B:34:0x00a3, B:35:0x00a4, B:37:0x00b1, B:39:0x00b3, B:41:0x00b9, B:42:0x00c3, B:14:0x0036), top: B:54:0x0007 }] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b3 A[Catch: all -> 0x00c5, TryCatch #2 {, blocks: (B:4:0x0007, B:6:0x0011, B:8:0x0013, B:10:0x001a, B:12:0x0020, B:15:0x0042, B:17:0x0046, B:19:0x0062, B:20:0x0068, B:21:0x006a, B:27:0x0082, B:34:0x00a3, B:35:0x00a4, B:37:0x00b1, B:39:0x00b3, B:41:0x00b9, B:42:0x00c3, B:14:0x0036), top: B:54:0x0007 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r8 = this;
                    azhi r0 = r8.a
                    gds r1 = r8.b
                    java.lang.Object r7 = r0.A
                    monitor-enter(r7)
                    btlu r2 = r0.F     // Catch: java.lang.Throwable -> Lc5
                    btlu r1 = r1.a     // Catch: java.lang.Throwable -> Lc5
                    boolean r3 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lc5
                    if (r3 == 0) goto L13
                    monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc5
                    return
                L13:
                    boolean r2 = r2.r()     // Catch: java.lang.Throwable -> Lc5
                    r3 = 1
                    if (r2 == 0) goto L36
                    java.lang.Long r2 = r0.h()     // Catch: java.lang.Throwable -> Lc5
                    if (r2 == 0) goto L34
                    java.util.concurrent.atomic.AtomicLong r4 = r0.E     // Catch: java.lang.Throwable -> Lc5
                    long r5 = r2.longValue()     // Catch: java.lang.Throwable -> Lc5
                    r4.set(r5)     // Catch: java.lang.Throwable -> Lc5
                    deig<java.lang.Boolean> r2 = r0.H     // Catch: java.lang.Throwable -> Lc5
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> Lc5
                    r2.j(r4)     // Catch: java.lang.Throwable -> Lc5
                    r2 = 0
                    goto L42
                L34:
                    r2 = 1
                    goto L42
                L36:
                    java.util.concurrent.atomic.AtomicLong r2 = r0.E     // Catch: java.lang.Throwable -> Lc5
                    r4 = -9223372036854775808
                    r2.set(r4)     // Catch: java.lang.Throwable -> Lc5
                    r2 = 0
                    r0.g(r2)     // Catch: java.lang.Throwable -> Lc5
                    goto L34
                L42:
                    r0.F = r1     // Catch: java.lang.Throwable -> Lc5
                    if (r2 == 0) goto La4
                    r0.d()     // Catch: java.lang.Throwable -> Lc5
                    java.util.Set<java.lang.Long> r2 = r0.C     // Catch: java.lang.Throwable -> Lc5
                    r2.clear()     // Catch: java.lang.Throwable -> Lc5
                    java.util.concurrent.ConcurrentMap<java.lang.Long, axxd> r2 = r0.D     // Catch: java.lang.Throwable -> Lc5
                    r2.clear()     // Catch: java.lang.Throwable -> Lc5
                    bati r2 = r0.G     // Catch: java.lang.Throwable -> Lc5
                    java.util.concurrent.atomic.AtomicBoolean r2 = r2.a     // Catch: java.lang.Throwable -> Lc5
                    r2.set(r3)     // Catch: java.lang.Throwable -> Lc5
                    deig<java.lang.Boolean> r2 = r0.H     // Catch: java.lang.Throwable -> Lc5
                    boolean r2 = r2.isDone()     // Catch: java.lang.Throwable -> Lc5
                    if (r2 == 0) goto L68
                    deig r2 = defpackage.deig.d()     // Catch: java.lang.Throwable -> Lc5
                    r0.H = r2     // Catch: java.lang.Throwable -> Lc5
                L68:
                    java.lang.Object r2 = r0.z     // Catch: defpackage.axxc -> La4 java.lang.Throwable -> Lc5
                    monitor-enter(r2)     // Catch: defpackage.axxc -> La4 java.lang.Throwable -> Lc5
                    azks r3 = r0.b     // Catch: java.lang.Throwable -> La1
                    azol r4 = r3.d     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> La1
                    azkr r5 = new azkr     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> La1
                    r5.<init>(r3)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> La1
                    r4.a(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> La1
                L77:
                    azof r3 = r0.a     // Catch: java.lang.Throwable -> La1
                    aznw r4 = new aznw     // Catch: defpackage.azom -> L98 java.lang.Throwable -> La1
                    r4.<init>(r3)     // Catch: defpackage.azom -> L98 java.lang.Throwable -> La1
                    defpackage.aznn.g(r4)     // Catch: defpackage.azom -> L98 java.lang.Throwable -> La1
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> La1
                    dxio<axwp> r2 = r0.x     // Catch: defpackage.axxc -> La4 java.lang.Throwable -> Lc5
                    java.lang.Object r2 = r2.a()     // Catch: defpackage.axxc -> La4 java.lang.Throwable -> Lc5
                    axwp r2 = (defpackage.axwp) r2     // Catch: defpackage.axxc -> La4 java.lang.Throwable -> Lc5
                    r2.h()     // Catch: defpackage.axxc -> La4 java.lang.Throwable -> Lc5
                    btrm r2 = r0.c     // Catch: defpackage.axxc -> La4 java.lang.Throwable -> Lc5
                    r3 = 2
                    azrh r3 = defpackage.azrh.b(r3)     // Catch: defpackage.axxc -> La4 java.lang.Throwable -> Lc5
                    r2.b(r3)     // Catch: defpackage.axxc -> La4 java.lang.Throwable -> Lc5
                    goto La4
                L98:
                    r3 = move-exception
                    axxc r4 = new axxc     // Catch: java.lang.Throwable -> La1
                    java.lang.String r5 = "Sync transaction error."
                    r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> La1
                    throw r4     // Catch: java.lang.Throwable -> La1
                La1:
                    r3 = move-exception
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> La1
                    throw r3     // Catch: defpackage.axxc -> La4 java.lang.Throwable -> Lc5
                La4:
                    bati r2 = r0.G     // Catch: java.lang.Throwable -> Lc5
                    r2.a()     // Catch: java.lang.Throwable -> Lc5
                    azhj r2 = r0.e     // Catch: java.lang.Throwable -> Lc5
                    boolean r2 = r2.c()     // Catch: java.lang.Throwable -> Lc5
                    if (r2 != 0) goto Lb3
                    monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc5
                    return
                Lb3:
                    boolean r1 = r1.l()     // Catch: java.lang.Throwable -> Lc5
                    if (r1 == 0) goto Lc3
                    dcep<azxm<?>> r1 = defpackage.azxm.n     // Catch: java.lang.Throwable -> Lc5
                    r2 = 0
                    r4 = 0
                    r5 = 1
                    r6 = 1
                    r0.i(r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc5
                Lc3:
                    monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc5
                    return
                Lc5:
                    r0 = move-exception
                    monitor-exit(r7)     // Catch: java.lang.Throwable -> Lc5
                    goto Lc9
                Lc8:
                    throw r0
                Lc9:
                    goto Lc8
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.azgz.run():void");
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }
}
