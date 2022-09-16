package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: roj  reason: default package */
/* loaded from: classes7.dex */
public final class roj extends rmi<sba> {
    public sgq ad;
    public int ae;
    private ztt af;
    public sgr g;

    @Override // defpackage.rmi, defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        ztt zttVar = new ztt(H(), 65.0f);
        this.af = zttVar;
        zttVar.setContent(this.f);
        this.af.setShouldUseRoundedCornersShadow(false);
        this.af.Y(H().getResources().getConfiguration());
        return null;
    }

    @Override // defpackage.rmi
    protected final cqiw<sba> g() {
        return new rzh();
    }

    @Override // defpackage.rmi
    protected final /* bridge */ /* synthetic */ sba q() {
        Bundle bundle = this.o;
        List list = (List) bundle.getSerializable("waypoints");
        dbsk.s(list);
        dcdc r = dcdc.r(list);
        amte amteVar = (amte) bundle.getSerializable("directionsStorageItem");
        int i = bundle.getInt("selectedDirectionsStorageItemIndex");
        this.ae = bundle.getInt("legIndex");
        roh rohVar = new roh(this);
        sgr sgrVar = this.g;
        String Rp = Rp(R.string.COMMUTE_SETUP_TRANSIT_ROUTE_PICKER_TITLE);
        String Rp2 = Rp(R.string.COMMUTE_SETUP_TRANSIT_ROUTE_PICKER_BUTTON_TITLE);
        cqhn a = sgrVar.a.a();
        sgr.a(a, 1);
        shc a2 = sgrVar.b.a();
        sgr.a(a2, 2);
        sgr.a(Rp, 3);
        sgr.a(Rp2, 4);
        sgr.a(r, 5);
        sgr.a(amteVar, 6);
        sgr.a(rohVar, 8);
        sgq sgqVar = new sgq(a, a2, Rp, Rp2, r, amteVar, i, rohVar);
        this.ad = sgqVar;
        return sgqVar;
    }

    @Override // defpackage.rmi, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ad.b();
    }

    @Override // defpackage.rmi, defpackage.ges, defpackage.fd
    public final void u() {
        this.ad.c();
        super.u();
    }

    @Override // defpackage.rmi
    protected final egu w(egj egjVar) {
        egjVar.s(this.af);
        egjVar.ai(jjn.FULLY_EXPANDED);
        egjVar.ak(jkc.q, jkc.q);
        egf a = egf.a();
        a.l(false);
        egjVar.A(a);
        egjVar.J(new egq(this) { // from class: rog
            private final roj a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                this.a.ad.k();
            }
        });
        return egjVar.a();
    }
}
