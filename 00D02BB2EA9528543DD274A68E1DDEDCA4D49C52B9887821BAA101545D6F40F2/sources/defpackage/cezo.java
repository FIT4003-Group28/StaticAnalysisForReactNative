package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cezo  reason: default package */
/* loaded from: classes4.dex */
public final class cezo extends itb implements cezv {
    private final dxio<cezn> a;
    private final gga b;
    private final cfgw c;
    private final cezl d;

    public cezo(dxio dxioVar, cezl cezlVar, gga ggaVar, cfgw cfgwVar) {
        this.a = dxioVar;
        this.d = cezlVar;
        this.b = ggaVar;
        this.c = cfgwVar;
    }

    @Override // defpackage.cezv
    public final <C extends fd & cezu> boolean e(dlno dlnoVar, List<cfgf> list, C c) {
        if (!this.d.a(dlnoVar) || !cfgp.a(dlnoVar.c, list).a()) {
            return false;
        }
        cfgw cfgwVar = this.c;
        ((ckhe) cfgwVar.a.a(ckkp.a)).a();
        ((ckhe) cfgwVar.a.a(ckkp.b)).a();
        gga ggaVar = this.b;
        cezn a = this.a.a();
        dhjx Y = a.a.Y(a.a.n());
        gn gnVar = a.b;
        gnVar.H(cezj.a);
        gz b = gnVar.b();
        C c2 = c;
        b.y(c2, cezj.a);
        b.g();
        cezj cezjVar = new cezj();
        cezjVar.F(c2, 0);
        cfgi bZ = cfgj.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cfgj cfgjVar = (cfgj) bZ.b;
        Y.getClass();
        cfgjVar.c = Y;
        int i = cfgjVar.a | 2;
        cfgjVar.a = i;
        dlnoVar.getClass();
        cfgjVar.b = dlnoVar;
        cfgjVar.a = i | 1;
        bZ.b(list);
        cezjVar.B(bvrs.d(bZ.bK()));
        ggaVar.D(cezjVar);
        return true;
    }

    @Override // defpackage.cezv
    public final <C extends fd & cezu> void f(dlno dlnoVar, C c) {
        e(dlnoVar, dcdc.e(), c);
    }
}
