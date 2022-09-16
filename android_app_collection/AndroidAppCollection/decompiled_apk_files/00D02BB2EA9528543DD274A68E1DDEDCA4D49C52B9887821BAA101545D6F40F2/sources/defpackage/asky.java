package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: asky  reason: default package */
/* loaded from: classes2.dex */
public final class asky {
    public final akox a;
    public final cqat b;
    @dzsi
    public akqs c;
    public long d;
    public long e;
    private final Resources f;

    public asky(akox akoxVar, Resources resources, cqat cqatVar) {
        this.a = akoxVar;
        dbsk.t(resources, "resources");
        this.f = resources;
        this.b = cqatVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        if ((r7.d + r2) > r7.b.e()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a() {
        /*
            r7 = this;
            monitor-enter(r7)
            akqs r0 = r7.c     // Catch: java.lang.Throwable -> L66
            r1 = 0
            if (r0 == 0) goto L35
            long r2 = r7.e     // Catch: java.lang.Throwable -> L66
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto Lf
            goto L1e
        Lf:
            long r4 = r7.d     // Catch: java.lang.Throwable -> L66
            long r4 = r4 + r2
            cqat r2 = r7.b     // Catch: java.lang.Throwable -> L66
            long r2 = r2.e()     // Catch: java.lang.Throwable -> L66
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L1e
        L1c:
            r0 = r1
            goto L35
        L1e:
            akqq r2 = r0.c()     // Catch: java.lang.Throwable -> L66
            akqq r3 = new akqq     // Catch: java.lang.Throwable -> L66
            r4 = 0
            r3.<init>(r4, r4)     // Catch: java.lang.Throwable -> L66
            r4 = 4647503709213818880(0x407f400000000000, double:500.0)
            boolean r2 = defpackage.akqq.v(r2, r3, r4)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L35
            goto L1c
        L35:
            r7.c = r0     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L48
            akox r0 = r7.a     // Catch: java.lang.Throwable -> L66
            alad r0 = r0.n()     // Catch: java.lang.Throwable -> L66
            akqq r1 = r0.i     // Catch: java.lang.Throwable -> L66
            float r0 = r0.k     // Catch: java.lang.Throwable -> L66
            akyc r0 = defpackage.akyt.l(r1, r0)     // Catch: java.lang.Throwable -> L66
            goto L5c
        L48:
            android.content.res.Resources r1 = r7.f     // Catch: java.lang.Throwable -> L66
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Throwable -> L66
            int r1 = r1.widthPixels     // Catch: java.lang.Throwable -> L66
            android.content.res.Resources r2 = r7.f     // Catch: java.lang.Throwable -> L66
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L66
            int r2 = r2.heightPixels     // Catch: java.lang.Throwable -> L66
            akyc r0 = defpackage.akyt.r(r0, r1, r2)     // Catch: java.lang.Throwable -> L66
        L5c:
            akox r1 = r7.a     // Catch: java.lang.Throwable -> L66
            r2 = 1
            r1.w = r2     // Catch: java.lang.Throwable -> L66
            r1.p(r0)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r7)
            return
        L66:
            r0 = move-exception
            monitor-exit(r7)
            goto L6a
        L69:
            throw r0
        L6a:
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asky.a():void");
    }
}
