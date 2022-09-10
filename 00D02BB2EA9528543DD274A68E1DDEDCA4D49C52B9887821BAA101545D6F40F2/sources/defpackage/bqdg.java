package defpackage;
/* compiled from: PG */
/* renamed from: bqdg  reason: default package */
/* loaded from: classes4.dex */
public final class bqdg {
    public final dbsg<cflq> a;
    public final bqdh b;

    public bqdg(dbsg<cfll> dbsgVar, bqdh bqdhVar) {
        this.a = dbsgVar.a() ? dbsg.i(dbsgVar.b().e()) : dbpy.a;
        this.b = bqdhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        if (r10 == r12.a()) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<defpackage.bqcw> a(java.util.List<defpackage.bqcw> r16, java.util.List<defpackage.bqcw> r17) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r16.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L125
            java.lang.Object r2 = r1.next()
            bqcw r2 = (defpackage.bqcw) r2
            java.util.Iterator r3 = r17.iterator()
        L19:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L120
            java.lang.Object r4 = r3.next()
            bqcw r4 = (defpackage.bqcw) r4
            bqgw r5 = r4.b()
            if (r5 == 0) goto L19
            dcdc r5 = r4.a()
            bqgw r4 = r4.b()
            defpackage.dbsk.s(r4)
            bqhr r4 = r4.c
            java.util.ArrayList r6 = new java.util.ArrayList
            dcdc r7 = r2.a()
            r6.<init>(r7)
            int r7 = r5.size()
            r8 = 0
        L46:
            if (r8 >= r7) goto L116
            java.lang.Object r9 = r5.get(r8)
            bqhj r9 = (defpackage.bqhj) r9
            dbsg r10 = r9.b()
            boolean r10 = r10.a()
            if (r10 == 0) goto L7c
            cflx r10 = r2.c()
            if (r10 == 0) goto L7c
            dbsg r10 = r9.b()
            java.lang.Object r10 = r10.b()
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            cflx r12 = r2.c()
            defpackage.dbsk.s(r12)
            long r12 = r12.a()
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L7c
            goto La5
        L7c:
            dbsg r10 = r9.d()
            boolean r10 = r10.a()
            if (r10 == 0) goto L112
            bqgw r10 = r2.b()
            if (r10 == 0) goto L112
            dbsg r10 = r9.d()
            java.lang.Object r10 = r10.b()
            bqhr r10 = (defpackage.bqhr) r10
            int r10 = r10.b
            bqgw r11 = r2.b()
            defpackage.dbsk.s(r11)
            bqhr r11 = r11.c
            int r11 = r11.b
            if (r10 != r11) goto L112
        La5:
            bqhh r10 = defpackage.bqhj.f()
            akqq r9 = r9.a()
            r10.c(r9)
            r10.e(r4)
            bqhj r9 = r10.a()
            dbrn r10 = defpackage.bqdb.a
            java.util.List r10 = defpackage.dchl.k(r6, r10)
            akrk r10 = defpackage.akrk.e(r10)
            alxh r11 = new alxh
            r11.<init>(r10)
            akqq r10 = r9.a()
            akra r10 = defpackage.akra.f(r10)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            akrn r10 = r11.b(r10, r12)
            if (r10 != 0) goto Ld7
            goto L112
        Ld7:
            int r11 = r10.d
            java.lang.Object r14 = r6.get(r11)
            bqhj r14 = (defpackage.bqhj) r14
            akqq r14 = r14.a()
            akra r15 = r10.a
            akqq r15 = r15.S()
            boolean r14 = defpackage.akqq.v(r14, r15, r12)
            if (r14 == 0) goto Lf3
            defpackage.bqdc.a(r6, r11, r4)
            goto L112
        Lf3:
            int r11 = r11 + 1
            java.lang.Object r14 = r6.get(r11)
            bqhj r14 = (defpackage.bqhj) r14
            akqq r14 = r14.a()
            akra r10 = r10.a
            akqq r10 = r10.S()
            boolean r10 = defpackage.akqq.v(r14, r10, r12)
            if (r10 == 0) goto L10f
            defpackage.bqdc.a(r6, r11, r4)
            goto L112
        L10f:
            r6.add(r11, r9)
        L112:
            int r8 = r8 + 1
            goto L46
        L116:
            dcdc r4 = defpackage.dcdc.r(r6)
            bqcw r2 = r2.h(r4)
            goto L19
        L120:
            r0.add(r2)
            goto L9
        L125:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqdg.a(java.util.List, java.util.List):java.util.List");
    }
}
