package defpackage;
/* compiled from: PG */
/* renamed from: aull  reason: default package */
/* loaded from: classes2.dex */
public final class aull implements ausp {
    public final cvkt a;
    public final cqat b;
    private final bvrb c;
    private final ausp d;
    private final ault e;

    public aull(bvrb bvrbVar, cvkt cvktVar, ausp auspVar, ault aultVar, cqat cqatVar) {
        this.c = bvrbVar;
        this.a = cvktVar;
        this.d = auspVar;
        this.e = aultVar;
        this.b = cqatVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        r4.e.d(r3.a, r3.b);
     */
    @Override // defpackage.ausp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final android.content.Intent r5, final java.lang.Runnable r6) {
        /*
            r4 = this;
            java.lang.String r0 = "chime_account"
            java.lang.String r1 = "chime_thread_id"
            cvkt r2 = r4.a
            boolean r2 = r2.a(r5)
            if (r2 != 0) goto L47
            boolean r2 = defpackage.aush.c(r5)     // Catch: java.lang.RuntimeException -> L41
            r3 = 0
            if (r2 != 0) goto L14
            goto L36
        L14:
            boolean r2 = r5.hasExtra(r1)     // Catch: java.lang.RuntimeException -> L41
            if (r2 == 0) goto L36
            boolean r2 = r5.hasExtra(r0)     // Catch: java.lang.RuntimeException -> L41
            if (r2 != 0) goto L21
            goto L36
        L21:
            ausg r3 = new ausg     // Catch: java.lang.RuntimeException -> L41
            java.lang.String r1 = r5.getStringExtra(r1)     // Catch: java.lang.RuntimeException -> L41
            java.lang.String r1 = defpackage.dbsj.e(r1)     // Catch: java.lang.RuntimeException -> L41
            java.lang.String r0 = r5.getStringExtra(r0)     // Catch: java.lang.RuntimeException -> L41
            java.lang.String r0 = defpackage.dbsj.e(r0)     // Catch: java.lang.RuntimeException -> L41
            r3.<init>(r1, r0)     // Catch: java.lang.RuntimeException -> L41
        L36:
            if (r3 == 0) goto L41
            ault r0 = r4.e     // Catch: java.lang.RuntimeException -> L41
            java.lang.String r1 = r3.a     // Catch: java.lang.RuntimeException -> L41
            java.lang.String r2 = r3.b     // Catch: java.lang.RuntimeException -> L41
            r0.d(r1, r2)     // Catch: java.lang.RuntimeException -> L41
        L41:
            ausp r0 = r4.d
            r0.a(r5, r6)
            return
        L47:
            bvrb r0 = r4.c
            aulk r1 = new aulk
            r1.<init>(r4, r5, r6)
            bvrj r5 = defpackage.bvrj.BACKGROUND_THREADPOOL
            r0.b(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aull.a(android.content.Intent, java.lang.Runnable):void");
    }
}
