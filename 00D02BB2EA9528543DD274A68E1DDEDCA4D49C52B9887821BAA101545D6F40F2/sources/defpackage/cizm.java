package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cizm  reason: default package */
/* loaded from: classes4.dex */
public class cizm implements cizl, crzp {
    private final gga a;
    private final ciyx b;
    private final crzm<chtq> c;
    private final ciym d;
    private final boolean e;

    public cizm(gga ggaVar, cqhn cqhnVar, Executor executor, cizc cizcVar, ciyn ciynVar, btvo btvoVar, chrx chrxVar, crzm<chtq> crzmVar, crzm<chty> crzmVar2, crzm<chvi> crzmVar3, btlu btluVar) {
        this.a = ggaVar;
        this.c = crzmVar;
        Executor a = cizcVar.a.a();
        cizc.a(a, 1);
        cqhn a2 = cizcVar.b.a();
        cizc.a(a2, 2);
        cqhu a3 = cizcVar.c.a();
        cizc.a(a3, 3);
        cchz a4 = cizcVar.d.a();
        cizc.a(a4, 4);
        amfi a5 = cizcVar.e.a();
        cizc.a(a5, 5);
        jlp a6 = cizcVar.f.a();
        cizc.a(a6, 6);
        gce a7 = cizcVar.g.a();
        cizc.a(a7, 7);
        cizc.a(chrxVar, 8);
        cizc.a(crzmVar3, 9);
        cizc.a(btluVar, 10);
        this.b = new cizb(a, a2, a3, a4, a5, a6, a7, chrxVar, crzmVar3, btluVar);
        gga a8 = ciynVar.a.a();
        ciyn.a(a8, 1);
        cqhn a9 = ciynVar.b.a();
        ciyn.a(a9, 2);
        cqhu a10 = ciynVar.c.a();
        ciyn.a(a10, 3);
        bvrb a11 = ciynVar.d.a();
        ciyn.a(a11, 4);
        Executor a12 = ciynVar.e.a();
        ciyn.a(a12, 5);
        ciyn.a(crzmVar2, 6);
        this.d = new ciym(a8, a9, a10, a11, a12, crzmVar2);
        dhpt dhptVar = btvoVar.getContributionsPageParameters().h;
        this.e = (dhptVar == null ? dhpt.w : dhptVar).c;
        crzmVar.b(this, executor);
    }

    @Override // defpackage.crzp
    public void On(crzm<chtq> crzmVar) {
        cqkx.p(this);
    }

    @Override // defpackage.cizl
    public ciyx b() {
        return this.b;
    }

    @Override // defpackage.cizl
    public cqkl c() {
        this.a.onBackPressed();
        return cqkl.a;
    }

    @Override // defpackage.cizl
    public cqtd d() {
        chtq l = this.c.l();
        dbsk.s(l);
        if (l.a() == drrx.UNKNOWN_MODE) {
            return cqrt.g(2131231588, ibm.p());
        }
        return cqrt.g(2131231591, ibm.p());
    }

    @Override // defpackage.cizl
    public cjtd e() {
        chtq l = this.c.l();
        dbsk.s(l);
        chxj chxjVar = chxj.RATING;
        drrx drrxVar = drrx.UNKNOWN_MODE;
        switch (l.a().ordinal()) {
            case 1:
                cjta b = cjtd.b();
                b.d = dtxl.hw;
                return b.a();
            case 2:
                cjta b2 = cjtd.b();
                b2.d = dtxl.hC;
                return b2.a();
            case 3:
                cjta b3 = cjtd.b();
                b3.d = dtxl.fR;
                return b3.a();
            case 4:
                cjta b4 = cjtd.b();
                b4.d = dtxl.hO;
                return b4.a();
            case 5:
                cjta b5 = cjtd.b();
                b5.d = dtxl.hu;
                return b5.a();
            case 6:
                cjta b6 = cjtd.b();
                b6.d = dtxl.gu;
                return b6.a();
            case 7:
                cjta b7 = cjtd.b();
                b7.d = dtxl.gw;
                return b7.a();
            default:
                cjta b8 = cjtd.b();
                b8.d = dtxl.gu;
                return b8.a();
        }
    }

    @Override // defpackage.cizl
    public ciyl f() {
        return this.d;
    }

    @Override // defpackage.cizl
    public Boolean g() {
        return Boolean.valueOf(this.e);
    }
}
