package defpackage;
/* compiled from: PG */
/* renamed from: aoof  reason: default package */
/* loaded from: classes2.dex */
public class aoof extends aoob implements aony {
    private final anry b;
    private final izw c;
    private final gga d;
    private final ges e;
    private final bwqv f;
    private dbsg<anow> g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aoof(defpackage.dvay r13, defpackage.aoge r14, boolean r15, defpackage.jkf r16, final defpackage.anri r17, defpackage.anrz r18, defpackage.aoiq r19, defpackage.fd r20, defpackage.gga r21, defpackage.bwqv r22, defpackage.cqhn r23) {
        /*
            r12 = this;
            r7 = r12
            r8 = r17
            r0 = 0
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r18
            anry r9 = r4.a(r13, r14, r15, r0)
            r10 = r20
            ges r10 = (defpackage.ges) r10
            r0 = r12
            r1 = r9
            r2 = r16
            r3 = r19
            r4 = r10
            r5 = r21
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.b = r9
            ivb r0 = new ivb
            dccx r1 = defpackage.dcdc.F()
            boolean r2 = r9.d()
            if (r2 == 0) goto L4f
            r9.getClass()
            aooc r2 = new aooc
            r2.<init>(r9)
            izx r2 = r8.a(r2, r9)
            r1.g(r2)
            izx r2 = r8.c(r9)
            r1.g(r2)
            izx r2 = r8.e(r9)
            r1.g(r2)
            dcdc r1 = r1.f()
            goto Lbe
        L4f:
            boolean r2 = r9.e()
            if (r2 == 0) goto L97
            izx r2 = r8.c(r9)
            r1.g(r2)
            r9.getClass()
            aood r2 = new aood
            r2.<init>(r9)
            ivd r3 = new ivd
            cqss r4 = r8.a
            r5 = 2131231584(0x7f080360, float:1.8079253E38)
            cqtd r4 = defpackage.cqrt.h(r5, r4)
            r5 = 2131954984(0x7f130d28, float:1.9546483E38)
            cqvf r5 = defpackage.cqrt.l(r5)
            cqss r6 = r8.b
            anrb r11 = new anrb
            r11.<init>(r8, r2)
            ddho r2 = defpackage.dtyc.ax
            cjtd r2 = r9.R(r2)
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r11
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r1.g(r3)
            dcdc r1 = r1.f()
            goto Lbe
        L97:
            boolean r2 = r9.c()
            if (r2 == 0) goto Lac
            r9.getClass()
            aooe r2 = new aooe
            r2.<init>(r9)
            izx r2 = r8.b(r2, r9)
            r1.g(r2)
        Lac:
            izx r2 = r8.e(r9)
            r1.g(r2)
            izx r2 = r8.c(r9)
            r1.g(r2)
            dcdc r1 = r1.f()
        Lbe:
            r2 = 0
            r0.<init>(r1, r2)
            r7.c = r0
            r0 = r21
            r7.d = r0
            r7.e = r10
            r0 = r22
            r7.f = r0
            dbpy<java.lang.Object> r0 = defpackage.dbpy.a
            r7.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoof.<init>(dvay, aoge, boolean, jkf, anri, anrz, aoiq, fd, gga, bwqv, cqhn):void");
    }

    @Override // defpackage.aony
    @dzsi
    public anow a() {
        if (!dcdc.r(new dsrh(this.b.g.p, dvay.q)).contains(dvax.STOP)) {
            return null;
        }
        if (!this.g.a()) {
            bxko bxkoVar = new bxko();
            bxkoVar.c(bxla.ADD_A_PLACE_SUGGESTION);
            this.g = dbsg.i(new anox(this.d, this.b, aosb.b(this.e, this.f, null, bxkoVar)));
        }
        return this.g.b();
    }

    @Override // defpackage.aony
    public aoiu c() {
        return this.b.E();
    }

    @Override // defpackage.aony
    public boolean d() {
        return this.b.C();
    }

    @Override // defpackage.aony
    public izw e() {
        return this.c;
    }

    @Override // defpackage.aoob
    protected final /* bridge */ /* synthetic */ anrr f() {
        return this.b;
    }

    @Override // defpackage.aoob, defpackage.aony
    public dcdc<jbf> l() {
        return dcdc.e();
    }

    @Override // defpackage.aoob
    public void t(dvyw dvywVar) {
        anry anryVar = this.b;
        anryVar.o.l(anryVar.g, dvywVar);
    }

    public cqkl w() {
        this.b.Y();
        return cqkl.a;
    }
}
