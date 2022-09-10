package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: pmk  reason: default package */
/* loaded from: classes7.dex */
public class pmk implements plr {
    private final dqsz a;
    private final dcdc<plq> b;

    public pmk(pmi pmiVar, String str, dqsz dqszVar) {
        this.a = dqszVar;
        dccx F = dcdc.F();
        for (dqsv dqsvVar : dqszVar.b) {
            gga a = pmiVar.a.a();
            pmi.a(a, 1);
            dxio a2 = ((dxjh) pmiVar.b).a();
            pmi.a(a2, 2);
            pmi.a(str, 3);
            pmi.a(dqsvVar, 4);
            F.g(new pmh(a, a2, str, dqsvVar));
        }
        this.b = F.f();
    }

    @Override // defpackage.plr
    public CharSequence a() {
        dgly dglyVar = this.a.a;
        if (dglyVar == null) {
            dglyVar = dgly.c;
        }
        return acls.a(dglyVar);
    }

    @Override // defpackage.plr
    public List<cqix<?>> b() {
        return dcdc.q(dcbg.b(this.b).s(pmj.a));
    }

    @Override // defpackage.plr
    @dzsi
    public plq c() {
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.get(0);
    }
}
