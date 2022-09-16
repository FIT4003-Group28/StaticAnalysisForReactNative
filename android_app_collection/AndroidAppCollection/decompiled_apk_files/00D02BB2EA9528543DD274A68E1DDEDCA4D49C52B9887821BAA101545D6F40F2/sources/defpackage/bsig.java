package defpackage;
/* compiled from: PG */
/* renamed from: bsig  reason: default package */
/* loaded from: classes4.dex */
public class bsig extends aeoe implements bsgt {
    private final aehr l;
    private final float m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bsig(android.app.Activity r14, defpackage.aenp r15, defpackage.aehr r16, defpackage.aeol r17, defpackage.cqat r18, defpackage.cqkj r19, defpackage.btvo r20, defpackage.cqhu r21, defpackage.aeqi r22, defpackage.ddho r23, defpackage.ddho r24, defpackage.aehu r25, boolean r26) {
        /*
            r13 = this;
            r12 = r13
            aeky r0 = defpackage.aekz.d()
            r1 = r0
            aekv r1 = (defpackage.aekv) r1
            r2 = r23
            r1.c = r2
            ddho r2 = defpackage.dtya.w
            r1.a = r2
            ddho r2 = defpackage.dtya.v
            r1.b = r2
            aekz r0 = r0.a()
            aeky r1 = defpackage.aekz.d()
            r2 = r1
            aekv r2 = (defpackage.aekv) r2
            r3 = r24
            r2.c = r3
            ddho r3 = defpackage.dtya.z
            r2.a = r3
            ddho r3 = defpackage.dtya.y
            r2.b = r3
            aekz r1 = r1.a()
            aekx r2 = defpackage.aela.d()
            r2.b(r0)
            r2.c(r1)
            r2.d()
            aela r9 = r2.a()
            r11 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r10 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r16
            r12.l = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsig.<init>(android.app.Activity, aenp, aehr, aeol, cqat, cqkj, btvo, cqhu, aeqi, ddho, ddho, aehu, boolean):void");
    }

    @Override // defpackage.aeoe, defpackage.aenl
    public Float l() {
        return Float.valueOf(this.m);
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void m(bsjm bsjmVar) {
        dnnn n = bsjmVar.n();
        if (!aehr.c(n)) {
            return;
        }
        dbsk.s(n);
        b(aehr.d(n));
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void n(bsjm bsjmVar) {
        eapg a = g().a();
        eapg a2 = h().a();
        if (this.c.getHotelBookingModuleParametersWithoutLogging().j && bsjmVar.n() != null) {
            dnnn n = bsjmVar.n();
            dbsk.s(n);
            if (aehr.d(n).equals(new aehu(a, a2))) {
                return;
            }
        }
        bsjmVar.p(this.l.f(a, a2));
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        if (this.c.getCategoricalSearchParameters().b()) {
            cqrp f = ibn.f();
            cqivVar.a(new aene(cqmn.a(cqgr.dz(f, f, f, f)), false), this);
            return;
        }
        cqivVar.a(new aemt(aems.WIDE), this);
    }
}
