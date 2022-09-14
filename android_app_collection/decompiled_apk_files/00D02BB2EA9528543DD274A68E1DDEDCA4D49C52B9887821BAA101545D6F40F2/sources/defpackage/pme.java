package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: pme  reason: default package */
/* loaded from: classes7.dex */
public class pme implements plp {
    private final dqsx a;
    private final dcdc<plr> b;

    public pme(pml pmlVar, String str, dqsx dqsxVar) {
        this.a = dqsxVar;
        dccx F = dcdc.F();
        for (dqsz dqszVar : dqsxVar.b) {
            F.g(pmlVar.a(str, dqszVar));
        }
        this.b = F.f();
    }

    @Override // defpackage.plp
    public CharSequence a() {
        return this.a.a;
    }

    @Override // defpackage.plp
    public List<cqix<?>> b() {
        return dcdc.q(dcbg.b(this.b).s(pmd.a));
    }
}
