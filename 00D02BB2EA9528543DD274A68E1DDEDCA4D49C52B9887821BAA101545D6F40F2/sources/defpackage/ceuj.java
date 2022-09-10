package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ceuj  reason: default package */
/* loaded from: classes4.dex */
public class ceuj extends ceve<dkcs, dkcu> {
    public final akfa a;
    public final bvjj b;
    public final cklf c;
    private final cesk h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ceuj(android.app.Activity r9, defpackage.cqhn r10, defpackage.akfa r11, defpackage.bvjj r12, defpackage.btvo r13, defpackage.cklf r14, defpackage.ceev r15, defpackage.nvh r16, defpackage.ceuo r17, defpackage.cgrc r18, java.lang.String r19) {
        /*
            r8 = this;
            r7 = r8
            r0 = r15
            r1 = r18
            dkcs r2 = defpackage.dkcs.c
            dsqp r2 = r2.bZ()
            dkcr r2 = (defpackage.dkcr) r2
            dwpa r3 = r13.getUgcOfferingsParameters()
            boolean r3 = r3.i()
            boolean r4 = r2.c
            if (r4 == 0) goto L1e
            r2.bF()
            r4 = 0
            r2.c = r4
        L1e:
            MessageType extends dsqw<MessageType, BuilderType> r4 = r2.b
            dkcs r4 = (defpackage.dkcs) r4
            int r5 = r4.a
            r6 = 2
            r5 = r5 | r6
            r4.a = r5
            r4.b = r3
            dsqw r2 = r2.bK()
            dkcs r2 = (defpackage.dkcs) r2
            ceeu r3 = new ceeu
            dzsj<buvc> r4 = r0.a
            java.lang.Object r4 = r4.a()
            buvc r4 = (defpackage.buvc) r4
            r5 = 1
            defpackage.ceev.a(r4, r5)
            dzsj<cese> r0 = r0.b
            java.lang.Object r0 = r0.a()
            cese r0 = (defpackage.cese) r0
            defpackage.ceev.a(r0, r6)
            r0 = 3
            defpackage.ceev.a(r1, r0)
            r0 = 4
            defpackage.ceev.a(r2, r0)
            r3.<init>(r4, r1, r2)
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r16
            r5 = r17
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r11
            r7.a = r0
            r0 = r12
            r7.b = r0
            r0 = r14
            r7.c = r0
            ceui r0 = new ceui
            r0.<init>(r8)
            r7.h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceuj.<init>(android.app.Activity, cqhn, akfa, bvjj, btvo, cklf, ceev, nvh, ceuo, cgrc, java.lang.String):void");
    }

    @Override // defpackage.ceey
    public void c(btzy btzyVar) {
        this.f.g();
    }

    @Override // defpackage.cesp
    public void g(cqiv cqivVar) {
        if (!this.b.o(bvjk.gO, this.a.j(), false)) {
            cqivVar.a(new cegg(), this.h);
        }
        cqivVar.a(new cegl(), this);
    }

    @Override // defpackage.cesp
    public cjtd i() {
        return cjtd.a(dtxl.eR);
    }

    @Override // defpackage.ceve
    protected final nvg j() {
        return this.d.a(nxl.CONTRIBUTIONS_EDITS_PAGE, new nxa(this) { // from class: ceuh
            private final ceuj a;

            {
                this.a = this;
            }

            @Override // defpackage.nxa
            public final void c() {
                ceuj ceujVar = this.a;
                ceujVar.e.c();
                ceujVar.f.h();
                cqkx.p(ceujVar);
            }
        });
    }

    @Override // defpackage.cevg
    public void k(Bundle bundle) {
        this.e.d(bundle);
        this.f.j(bundle);
    }

    @Override // defpackage.cevg
    public void l(Bundle bundle) {
        this.e.e(bundle);
        this.f.k(bundle);
    }

    @Override // defpackage.ceey
    /* renamed from: m */
    public void b(dkcu dkcuVar) {
        this.e.b(dkcuVar.b, dkcuVar.c);
        cqkx.p(this);
    }
}
