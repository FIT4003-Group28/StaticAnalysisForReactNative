package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: qrw  reason: default package */
/* loaded from: classes7.dex */
public final class qrw implements qjp {
    private static final dcdn<qjj, bvjk> a;
    private final bvjj b;

    static {
        dcdg p = dcdn.p();
        p.f(qjj.TRAFFIC_TO_PLACE, bvjk.cx);
        p.f(qjj.TRANSIT_TO_PLACE, bvjk.cJ);
        p.f(qjj.TRANSIT_TO_PLACE_DISRUPTION, bvjk.cK);
        p.f(qjj.TIME_TO_LEAVE, bvjk.cy);
        a = p.b();
    }

    public qrw(bvjj bvjjVar) {
        this.b = bvjjVar;
    }

    @Override // defpackage.qjp
    public final boolean a(qjj qjjVar, String str) {
        dcdn<qjj, bvjk> dcdnVar = a;
        dbsk.p(dcdnVar.containsKey(qjjVar), "Commute notification type %s is not supported.", qjjVar);
        return this.b.F(dcdnVar.get(qjjVar), dcdc.e()).contains(str);
    }

    @Override // defpackage.qjp
    public final void b(qjj qjjVar, String str) {
        dcdn<qjj, bvjk> dcdnVar = a;
        dbsk.p(dcdnVar.containsKey(qjjVar), "Commute notification type %s is not supported.", qjjVar);
        bvjk bvjkVar = dcdnVar.get(qjjVar);
        List<String> F = this.b.F(bvjkVar, dcdc.e());
        if (F.contains(str)) {
            return;
        }
        dcba a2 = dcba.a(25);
        a2.addAll(F);
        a2.add(str);
        this.b.ah(bvjkVar, dchl.c(a2));
    }
}
