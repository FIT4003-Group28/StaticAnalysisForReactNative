package defpackage;

import android.view.View;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: drd  reason: default package */
/* loaded from: classes6.dex */
public final class drd {
    public final ahjq a;
    public final dxio<qbt> b;
    public final dxio<ascb> c;
    @dzsi
    public ilo d = null;

    public drd(final gga ggaVar, ahjq ahjqVar, dxio<qbt> dxioVar, dxio<ascb> dxioVar2, dkn dknVar, View view) {
        this.a = ahjqVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        dknVar.a(view, cjtd.a(dtxj.bM));
        dknVar.b(view, new View.OnClickListener(this, ggaVar) { // from class: drc
            private final drd a;
            private final gga b;

            {
                this.a = this;
                this.b = ggaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                drd drdVar = this.a;
                gga ggaVar2 = this.b;
                ilo iloVar = drdVar.d;
                if (iloVar == null) {
                    return;
                }
                ggaVar2.g().h(dpn.a, 1);
                GmmLocation a = drdVar.a.a();
                dbsk.s(a);
                akqq aj = iloVar.aj();
                dbsk.s(aj);
                double e = akqo.e(a.B(), aj);
                qcw x = qcx.x();
                x.r(amvh.i(ggaVar2.getApplicationContext()));
                x.s(dqvj.WALK);
                x.u(iloVar.d());
                duqb bZ = duqc.f.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                duqc.c((duqc) bZ.b);
                x.t(bZ.bK());
                x.s(dqvj.WALK);
                qcx a2 = x.a();
                if (e > 15000.0d) {
                    drdVar.b.a().m(a2);
                } else {
                    drdVar.c.a().d(a2, asca.FOR_TESTING_ONLY);
                }
            }
        });
    }
}
