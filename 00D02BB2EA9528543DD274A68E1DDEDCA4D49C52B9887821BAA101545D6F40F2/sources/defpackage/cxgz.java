package defpackage;
/* compiled from: PG */
/* renamed from: cxgz  reason: default package */
/* loaded from: classes5.dex */
public class cxgz implements cxgm {
    public final cxhm a;
    final cxih b;
    public final cqat c;
    private final cxgl d;
    private final cxgq e;

    public cxgz(cxhm cxhmVar, cxih cxihVar, cxgl cxglVar, cqat cqatVar, cxgq cxgqVar) {
        this.a = cxhmVar;
        this.b = cxihVar;
        this.d = cxglVar;
        this.c = cqatVar;
        this.e = cxgqVar;
    }

    private final <T> dehn<T> e(dehn<T> dehnVar, final int i, final long j, final dskf dskfVar) {
        return dbae.d(dehnVar, Exception.class, new defg(this, i, j, dskfVar) { // from class: cxgy
            private final cxgz a;
            private final long b;
            private final dskf c;
            private final int d;

            {
                this.a = this;
                this.d = i;
                this.b = j;
                this.c = dskfVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                cxgz cxgzVar = this.a;
                int i2 = this.d;
                long j2 = this.b;
                Exception exc = (Exception) obj;
                cxgzVar.b.b(i2, cxgzVar.c.e() - j2, this.c);
                throw exc;
            }
        }, dege.a);
    }

    @Override // defpackage.cxgm
    public final dehn<Boolean> a(final dskf dskfVar) {
        c();
        final long e = this.c.e();
        return dbae.b(e(this.a.a(), 3003, e, dskfVar), new dbrn(this, dskfVar, e) { // from class: cxgv
            private final cxgz a;
            private final dskf b;
            private final long c;

            {
                this.a = this;
                this.b = dskfVar;
                this.c = e;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
                if (r3.c != false) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
                if (r3.b != false) goto L35;
             */
            @Override // defpackage.dbrn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r12) {
                /*
                    r11 = this;
                    cxgz r0 = r11.a
                    dskf r6 = r11.b
                    long r1 = r11.c
                    cxhl r12 = (defpackage.cxhl) r12
                    dslt r3 = r12.a()
                    dsrj<dsls> r4 = r3.b
                    java.util.Iterator r4 = r4.iterator()
                L12:
                    boolean r5 = r4.hasNext()
                    r7 = 0
                    r8 = 1
                    if (r5 == 0) goto L68
                    java.lang.Object r5 = r4.next()
                    dsls r5 = (defpackage.dsls) r5
                    int r9 = r5.a
                    int r10 = r6.w
                    if (r9 != r10) goto L12
                    boolean r4 = r5.b
                    if (r4 == 0) goto L68
                    int r4 = r3.a
                    r4 = r4 & r8
                    if (r4 == 0) goto L66
                    int r4 = r6.ordinal()
                    r5 = 3
                    if (r4 == r5) goto L51
                    r5 = 4
                    if (r4 == r5) goto L3a
                    goto L66
                L3a:
                    dsla r4 = r3.c
                    if (r4 != 0) goto L40
                    dsla r4 = defpackage.dsla.d
                L40:
                    int r4 = r4.a
                    r4 = r4 & 2
                    if (r4 == 0) goto L66
                    dsla r3 = r3.c
                    if (r3 != 0) goto L4c
                    dsla r3 = defpackage.dsla.d
                L4c:
                    boolean r3 = r3.c
                    if (r3 == 0) goto L68
                    goto L66
                L51:
                    dsla r4 = r3.c
                    if (r4 != 0) goto L57
                    dsla r4 = defpackage.dsla.d
                L57:
                    int r4 = r4.a
                    r4 = r4 & r8
                    if (r4 == 0) goto L66
                    dsla r3 = r3.c
                    if (r3 != 0) goto L62
                    dsla r3 = defpackage.dsla.d
                L62:
                    boolean r3 = r3.b
                    if (r3 == 0) goto L68
                L66:
                    r3 = 1
                    goto L69
                L68:
                    r3 = 0
                L69:
                    cxih r4 = r0.b
                    cqat r0 = r0.c
                    long r9 = r0.e()
                    long r9 = r9 - r1
                    dsld r0 = r12.b()
                    dslt r12 = r12.a()
                    dsrj<dsls> r12 = r12.b
                    java.util.Iterator r12 = r12.iterator()
                L80:
                    boolean r1 = r12.hasNext()
                    if (r1 == 0) goto L93
                    java.lang.Object r1 = r12.next()
                    dsls r1 = (defpackage.dsls) r1
                    int r1 = r1.a
                    int r2 = r6.w
                    if (r1 != r2) goto L80
                    r7 = 1
                L93:
                    java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
                    java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
                    r2 = 3003(0xbbb, float:4.208E-42)
                    r3 = 1
                    r1 = r4
                    r4 = r9
                    r7 = r0
                    r9 = r12
                    r1.c(r2, r3, r4, r6, r7, r8, r9)
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cxgv.a(java.lang.Object):java.lang.Object");
            }
        }, dege.a);
    }

    @Override // defpackage.cxgm
    public final dehn<Void> b() {
        dehn e;
        c();
        final long e2 = this.c.e();
        cxhm cxhmVar = this.a;
        synchronized (((cxid) cxhmVar).a) {
            final cxid cxidVar = (cxid) cxhmVar;
            e = ((cxid) cxhmVar).e(new deff(cxidVar) { // from class: cxhv
                private final cxid a;

                {
                    this.a = cxidVar;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    cxid cxidVar2 = this.a;
                    return cxid.c(cxidVar2.d(cxidVar2.b(cxik.FORCED_SYNC)));
                }
            });
        }
        return dbae.b(d(e, 3006, e2), new dbrn(this, e2) { // from class: cxgw
            private final cxgz a;
            private final long b;

            {
                this.a = this;
                this.b = e2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cxgz cxgzVar = this.a;
                Void r13 = (Void) obj;
                cxgzVar.b.c(3006, true, cxgzVar.c.e() - this.b, null, null, null, null);
                return null;
            }
        }, dege.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c5, code lost:
        if (r3 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxgz.c():void");
    }

    public final <T> dehn<T> d(dehn<T> dehnVar, int i, long j) {
        return e(dehnVar, i, j, null);
    }
}
