package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ccvw  reason: default package */
/* loaded from: classes4.dex */
public class ccvw implements ccvs {
    private final btvo a;
    private final ccvu b;
    private final dgfb c;
    private final ccvv d;
    private dcdc<ccvr> e = dcdc.e();

    public ccvw(btvo btvoVar, ccrh ccrhVar, ccvu ccvuVar, dgfb dgfbVar, ccvv ccvvVar) {
        this.a = btvoVar;
        this.b = ccvuVar;
        this.c = dgfbVar;
        this.d = ccvvVar;
    }

    @Override // defpackage.ccvs
    public List<? extends ccvr> a() {
        return this.e;
    }

    @Override // defpackage.ccvs
    public cjtd b() {
        dgfb dgfbVar = this.c;
        if (ccrh.f.containsKey(dgfbVar)) {
            return ccrh.f.get(dgfbVar);
        }
        return cjtd.b;
    }

    @Override // defpackage.ccvs
    public Boolean c() {
        return Boolean.valueOf(this.a.getUgcOfferingsParameters().l());
    }

    public void d(List<dwfl> list) {
        dccx F = dcdc.F();
        for (int i = 0; i < list.size(); i++) {
            ccvu ccvuVar = this.b;
            dgfb dgfbVar = this.c;
            dwfl dwflVar = list.get(i);
            ccvv ccvvVar = this.d;
            btvo a = ccvuVar.a.a();
            ccvu.a(a, 1);
            gga a2 = ccvuVar.b.a();
            ccvu.a(a2, 2);
            ccrh a3 = ccvuVar.c.a();
            ccvu.a(a3, 3);
            ccvu.a(dgfbVar, 4);
            ccvu.a(dwflVar, 5);
            ccvu.a(ccvvVar, 7);
            F.g(new ccvt(a, a2, a3, dgfbVar, dwflVar, i, ccvvVar));
        }
        this.e = F.f();
    }
}
