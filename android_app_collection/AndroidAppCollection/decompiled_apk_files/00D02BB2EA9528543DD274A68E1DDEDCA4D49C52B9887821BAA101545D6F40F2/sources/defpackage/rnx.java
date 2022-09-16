package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rnx  reason: default package */
/* loaded from: classes7.dex */
public final class rnx extends rmf<sai> {
    public sdt a;
    private sds ae;

    public static rnx aR(rzp rzpVar, dndr dndrVar, dndr dndrVar2) {
        rnx rnxVar = new rnx();
        Bundle i = rzpVar.i();
        i.putInt("source_alias", dndrVar.h);
        i.putInt("dest_alias", dndrVar2.h);
        rnxVar.B(i);
        return rnxVar;
    }

    private static boolean aS(rzp rzpVar) {
        return rzpVar.b().equals(ror.TRANSIT_ROUTE_BUILDER_TO_HOME) || rzpVar.b().equals(ror.TRANSIT_ROUTE_BUILDER_TO_WORK);
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof roe) {
            roe roeVar = (roe) obj;
            dopk a = roeVar.a();
            if (a == null) {
                return;
            }
            if (roeVar.b()) {
                this.ae.E(a, roeVar.c());
            } else {
                this.ae.F(a, roeVar.c());
            }
        } else if (!(obj instanceof roi)) {
        } else {
            roi roiVar = (roi) obj;
            this.ae.G(roiVar.a(), roiVar.b());
        }
    }

    @Override // defpackage.rmf
    protected final cqiw<sai> g() {
        return new rxt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rmf
    public final egu i(egj egjVar) {
        egjVar.ag(w());
        egjVar.ai(jjn.FULLY_EXPANDED);
        egjVar.ak(jkc.q, jkc.q);
        return egjVar.a();
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return aS(this.ae.t()) ? dtxl.dl : dtxl.dk;
    }

    @Override // defpackage.rmf
    protected final /* bridge */ /* synthetic */ sai q(rzp rzpVar) {
        Bundle bundle = this.o;
        dndr b = bundle != null ? dndr.b(bundle.getInt("source_alias", 0)) : dndr.HOME;
        dndr b2 = bundle != null ? dndr.b(bundle.getInt("dest_alias", 1)) : dndr.WORK;
        sdu sduVar = aS(rzpVar) ? sdu.TRANSIT_ONLY : sdu.PARK_AND_RIDE;
        sdt sdtVar = this.a;
        Application a = sdtVar.a.a();
        sdt.a(a, 1);
        cqhn a2 = sdtVar.b.a();
        sdt.a(a2, 2);
        sfd a3 = sdtVar.c.a();
        sdt.a(a3, 3);
        sec a4 = sdtVar.d.a();
        sdt.a(a4, 4);
        see a5 = sdtVar.e.a();
        sdt.a(a5, 5);
        seg a6 = sdtVar.f.a();
        sdt.a(a6, 6);
        sgm a7 = sdtVar.g.a();
        sdt.a(a7, 7);
        sic a8 = sdtVar.h.a();
        sdt.a(a8, 8);
        ros a9 = sdtVar.i.a();
        sdt.a(a9, 9);
        ahjq a10 = sdtVar.j.a();
        sdt.a(a10, 10);
        sgt a11 = sdtVar.k.a();
        sdt.a(a11, 11);
        rzv a12 = sdtVar.l.a();
        sdt.a(a12, 12);
        Executor a13 = sdtVar.m.a();
        sdt.a(a13, 13);
        sdc a14 = sdtVar.n.a();
        sdt.a(a14, 14);
        she a15 = sdtVar.o.a();
        sdt.a(a15, 15);
        rzs a16 = sdtVar.p.a();
        sdt.a(a16, 16);
        scr a17 = sdtVar.q.a();
        sdt.a(a17, 17);
        btvo a18 = sdtVar.r.a();
        sdt.a(a18, 18);
        sdt.a(rzpVar, 19);
        sdt.a(b, 20);
        sdt.a(b2, 21);
        sdt.a(this, 22);
        sdt.a(this, 23);
        sdt.a(sduVar, 24);
        sds sdsVar = new sds(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, rzpVar, b, b2, this, this, sduVar);
        this.ae = sdsVar;
        return sdsVar;
    }

    @Override // defpackage.rmf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        dbsk.t(this.ae, "ViewModel should have been initialized.");
        this.ae.x();
    }

    @Override // defpackage.rmf, defpackage.ges, defpackage.fd
    public final void u() {
        dbsk.t(this.ae, "ViewModel should have been initialized.");
        this.ae.D();
        super.u();
    }
}
