package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: rol  reason: default package */
/* loaded from: classes7.dex */
public final class rol extends rmf<sbb> {
    private static final afwn[] af = {afwn.e(afwm.TRANSIT, true)};
    public sgx a;
    public sgw ae;
    private ztt ag;
    @dzsi
    private ddho ah;
    private final egq ai = new rok(this);

    public static rol aR(rzp rzpVar, dndr dndrVar, dndr dndrVar2) {
        rol rolVar = new rol();
        Bundle i = rzpVar.i();
        i.putInt("source_alias", dndrVar.h);
        i.putInt("dest_alias", dndrVar2.h);
        rolVar.B(i);
        return rolVar;
    }

    @Override // defpackage.rmf, defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        ztt zttVar = new ztt(H(), 65.0f);
        this.ag = zttVar;
        zttVar.setContent(w());
        this.ag.setShouldUseRoundedCornersShadow(false);
        this.ag.Y(H().getResources().getConfiguration());
        return null;
    }

    @Override // defpackage.rmf
    protected final cqiw<sbb> g() {
        return new rtw();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rmf
    public final egu i(egj egjVar) {
        aljk aljkVar = new aljk();
        aljkVar.a(true);
        aljkVar.l = false;
        egjVar.ag(null);
        egjVar.s(this.ag);
        egjVar.ai(jjn.FULLY_EXPANDED);
        egjVar.ak(jkc.q, jkc.q);
        egjVar.z(aljkVar);
        egf a = egf.a();
        a.l = af;
        a.l(false);
        egjVar.A(a);
        egjVar.J(this.ai);
        return egjVar.a();
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return this.ah;
    }

    @Override // defpackage.rmf
    protected final /* bridge */ /* synthetic */ sbb q(rzp rzpVar) {
        ddho ddhoVar;
        Bundle bundle = this.o;
        dndr b = bundle != null ? dndr.b(bundle.getInt("source_alias", 0)) : dndr.HOME;
        dndr b2 = bundle != null ? dndr.b(bundle.getInt("dest_alias", 1)) : dndr.WORK;
        sgx sgxVar = this.a;
        Activity activity = (Activity) ((dxjd) sgxVar.a).a;
        sgx.a(activity, 1);
        cqhn a = sgxVar.b.a();
        sgx.a(a, 2);
        qqh a2 = sgxVar.c.a();
        sgx.a(a2, 3);
        sfd a3 = sgxVar.d.a();
        sgx.a(a3, 4);
        eeu a4 = sgxVar.e.a();
        sgx.a(a4, 5);
        shc a5 = sgxVar.f.a();
        sgx.a(a5, 6);
        sgt a6 = sgxVar.g.a();
        sgx.a(a6, 7);
        dxio a7 = ((dxjh) sgxVar.h).a();
        sgx.a(a7, 8);
        dxio a8 = ((dxjh) sgxVar.i).a();
        sgx.a(a8, 9);
        ros a9 = sgxVar.j.a();
        sgx.a(a9, 10);
        btvo a10 = sgxVar.k.a();
        sgx.a(a10, 11);
        sgx.a(rzpVar, 12);
        sgx.a(b, 13);
        sgx.a(b2, 14);
        this.ae = new sgw(activity, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, rzpVar, b, b2);
        rzm rzmVar = (rzm) rzpVar;
        if (rzmVar.b != ror.TRANSIT_ROUTE_TO_WORK) {
            if (rzmVar.b == ror.TRANSIT_ROUTE_TO_HOME) {
                ddhoVar = dtxl.dN;
            }
            return this.ae;
        }
        ddhoVar = dtxl.dQ;
        this.ah = ddhoVar;
        return this.ae;
    }

    @Override // defpackage.rmf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ae.d();
    }

    @Override // defpackage.rmf, defpackage.ges, defpackage.fd
    public final void u() {
        this.ae.e();
        super.u();
    }
}
