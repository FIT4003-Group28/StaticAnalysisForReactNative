package defpackage;
/* compiled from: PG */
/* renamed from: cbef  reason: default package */
/* loaded from: classes4.dex */
final class cbef implements cbeo {
    final /* synthetic */ cbei a;

    public cbef(cbei cbeiVar) {
        this.a = cbeiVar;
    }

    @Override // defpackage.cbeo
    public final void a(String str) {
        cbdp cbdpVar = this.a.ay;
        if (str != null) {
            ily ilyVar = new ily();
            dvya bZ = dvyw.bv.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvyw dvywVar = (dvyw) bZ.b;
            str.getClass();
            dvywVar.a |= 8;
            dvywVar.h = str;
            ilyVar.E(bZ.bK());
            ilo d = ilyVar.d();
            dccx F = dcdc.F();
            for (bbtm bbtmVar : cbdpVar.k) {
                F.g(cbdpVar.e.b(bbtmVar));
            }
            dcdc f = F.f();
            bdhk c = bdhk.c(cbdpVar.m, null);
            if (!f.isEmpty()) {
                bbul a = cbdpVar.g.a();
                btlu j = cbdpVar.f.j();
                dbsk.s(j);
                a.h(j.s().name, dwyd.EVENTS_UGC, bbvh.e(d), f, cjqm.a);
            }
            if (!((bdhd) c).a.isEmpty()) {
                cbdpVar.h.a(c, str, false);
            }
        }
        this.a.aw.p(true);
    }

    @Override // defpackage.cbeo
    public final void b() {
        this.a.aw.p(false);
    }
}
