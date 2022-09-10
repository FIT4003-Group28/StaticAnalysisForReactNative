package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: pmn  reason: default package */
/* loaded from: classes7.dex */
public class pmn implements pls {
    private final dcdc<plp> a;

    public pmn(pmf pmfVar, String str, dqte dqteVar) {
        dccx F = dcdc.F();
        for (dqsx dqsxVar : dqteVar.b) {
            pml a = pmfVar.a.a();
            pmf.a(a, 1);
            pmf.a(str, 2);
            pmf.a(dqsxVar, 3);
            F.g(new pme(a, str, dqsxVar));
        }
        this.a = F.f();
    }

    @Override // defpackage.pls
    public List<cqix<?>> a() {
        return dcdc.q(dcbg.b(this.a).s(pmm.a));
    }
}
