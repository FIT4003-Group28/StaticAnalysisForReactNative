package defpackage;
/* compiled from: PG */
/* renamed from: aazw  reason: default package */
/* loaded from: classes2.dex */
public class aazw implements jbk {
    private static final cqss a = irg.b();
    private jib b;
    private boolean c;
    private cqss d = a;
    private String e = "";

    public aazw(gga ggaVar, cqhn cqhnVar) {
        jhz e = jib.f(ggaVar, "").e();
        e.q = cqta.f();
        e.x = true;
        e.o = cjtd.a(dtxo.bG);
        e.F = 1;
        this.b = e.b();
    }

    @Override // defpackage.jbk
    public jib NC() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.diwb r8) {
        /*
            r7 = this;
            ditt r0 = r8.e
            if (r0 != 0) goto L6
            ditt r0 = defpackage.ditt.n
        L6:
            java.lang.String r0 = r0.f
            int r1 = r8.a
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L1d
            int r1 = r8.n
            cqta r1 = defpackage.cqta.d(r1)
            cqss r2 = defpackage.ibl.i()
            iuv r1 = defpackage.iva.b(r1, r2)
            goto L1f
        L1d:
            cqss r1 = defpackage.aazw.a
        L1f:
            java.lang.String r2 = r8.o
            jib r3 = r7.b
            jhz r3 = r3.e()
            jib r4 = r7.b
            java.lang.CharSequence r4 = r4.u
            java.lang.String r4 = r4.toString()
            boolean r4 = r4.equals(r0)
            r5 = 1
            if (r4 != 0) goto L3a
            r3.a = r0
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            java.lang.String r4 = r7.e
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L5c
            r7.e = r2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L4f
            r0 = 0
            r3.c = r0
            goto L5b
        L4f:
            jic r0 = new jic
            ckqc r4 = defpackage.ckqc.FULLY_QUALIFIED
            r6 = 2131231180(0x7f0801cc, float:1.8078434E38)
            r0.<init>(r2, r4, r6)
            r3.c = r0
        L5b:
            r0 = 1
        L5c:
            cqss r2 = r7.d
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L6d
            r7.d = r1
            boolean r2 = r7.c
            if (r2 == 0) goto L6d
            r3.u = r1
            goto L6e
        L6d:
            r5 = r0
        L6e:
            jib r0 = r7.b
            cjtd r0 = r0.k
            cjta r0 = defpackage.cjtd.c(r0)
            ditt r8 = r8.e
            if (r8 != 0) goto L7c
            ditt r8 = defpackage.ditt.n
        L7c:
            java.lang.String r8 = r8.b
            r0.g(r8)
            cjtd r8 = r0.a()
            r3.o = r8
            jib r8 = r3.b()
            r7.b = r8
            if (r5 == 0) goto L92
            defpackage.cqkx.p(r7)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aazw.b(diwb):void");
    }

    public void c(jjn jjnVar) {
        boolean equals = jjnVar.equals(jjn.FULLY_EXPANDED);
        if (this.c == equals) {
            return;
        }
        this.c = equals;
        jhz e = this.b.e();
        e.g = equals ? irg.b() : null;
        e.u = equals ? this.d : jib.a;
        this.b = e.b();
        cqkx.p(this);
    }
}
