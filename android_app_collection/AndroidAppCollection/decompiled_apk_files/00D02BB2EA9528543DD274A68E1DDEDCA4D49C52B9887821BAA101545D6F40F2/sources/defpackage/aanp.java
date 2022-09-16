package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aanp  reason: default package */
/* loaded from: classes2.dex */
public class aanp implements aanh {
    private dcdc<cqix<?>> a = dcdc.e();
    private final pms b;
    private final pma c;
    private final plv d;
    private diwb e;

    public aanp(pms pmsVar, pma pmaVar, plv plvVar) {
        this.b = pmsVar;
        this.c = pmaVar;
        this.d = plvVar;
    }

    @Override // defpackage.aanh
    public List<cqix<?>> a() {
        return dcdc.r(this.a);
    }

    public void b(diwb diwbVar) {
        dqtf dqtfVar;
        dqst dqstVar;
        dqsq dqsqVar;
        if (diwbVar.equals(this.e)) {
            return;
        }
        this.e = diwbVar;
        dqth dqthVar = diwbVar.T;
        if (dqthVar == null) {
            dqthVar = dqth.b;
        }
        dccx F = dcdc.F();
        for (dqtg dqtgVar : dqthVar.a) {
            int i = dqtgVar.a;
            if (i == 2) {
                pli pliVar = new pli();
                pms pmsVar = this.b;
                ditt dittVar = this.e.e;
                if (dittVar == null) {
                    dittVar = ditt.n;
                }
                String str = dittVar.b;
                if (dqtgVar.a == 2) {
                    dqtfVar = (dqtf) dqtgVar.b;
                } else {
                    dqtfVar = dqtf.d;
                }
                gga a = pmsVar.a.a();
                pms.a(a, 1);
                cqhn a2 = pmsVar.b.a();
                pms.a(a2, 2);
                cjqy a3 = pmsVar.c.a();
                pms.a(a3, 3);
                pmo a4 = pmsVar.d.a();
                pms.a(a4, 4);
                brba a5 = pmsVar.e.a();
                pms.a(a5, 5);
                dxio a6 = ((dxjh) pmsVar.f).a();
                pms.a(a6, 6);
                pms.a(str, 7);
                pms.a(dqtfVar, 8);
                F.g(cqgr.fT(pliVar, new pmr(a, a2, a3, a4, a5, a6, str, dqtfVar)));
            } else if (i == 3) {
                pkb pkbVar = new pkb();
                pma pmaVar = this.c;
                ditt dittVar2 = this.e.e;
                if (dittVar2 == null) {
                    dittVar2 = ditt.n;
                }
                String str2 = dittVar2.b;
                if (dqtgVar.a == 3) {
                    dqstVar = (dqst) dqtgVar.b;
                } else {
                    dqstVar = dqst.c;
                }
                pml a7 = pmaVar.a.a();
                pma.a(a7, 1);
                pma.a(pmaVar.b.a(), 2);
                pma.a(str2, 3);
                pma.a(dqstVar, 4);
                F.g(cqgr.fT(pkbVar, new plz(a7, str2, dqstVar)));
            } else if (i == 1) {
                pjg pjgVar = new pjg();
                plv plvVar = this.d;
                ditt dittVar3 = this.e.e;
                if (dittVar3 == null) {
                    dittVar3 = ditt.n;
                }
                String str3 = dittVar3.b;
                if (dqtgVar.a == 1) {
                    dqsqVar = (dqsq) dqtgVar.b;
                } else {
                    dqsqVar = dqsq.c;
                }
                pmc a8 = plvVar.a.a();
                plv.a(a8, 1);
                plv.a(str3, 2);
                plv.a(dqsqVar, 3);
                F.g(cqgr.fT(pjgVar, new plu(a8, str3, dqsqVar)));
            }
        }
        this.a = F.f();
    }

    @Override // defpackage.aakt
    public Boolean c() {
        return Boolean.valueOf(!this.a.isEmpty());
    }
}
