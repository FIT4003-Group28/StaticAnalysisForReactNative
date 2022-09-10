package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bgue  reason: default package */
/* loaded from: classes3.dex */
public final class bgue extends hxf {
    private cqkf<bgvl> ad;
    private dgcm ae;
    public efg b;
    public cqkj c;
    public bgvq d;
    public bwqv e;
    public bvjj f;
    private bgvp g;

    public bgue() {
        dbsk.l(true);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.ad.e(null);
        super.Qe();
    }

    @Override // defpackage.hxf
    protected final jib g() {
        ff J = J();
        dgcm dgcmVar = this.ae;
        String str = "";
        if (dgcmVar != null) {
            int a = dgco.a(dgcmVar.a);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                str = Rp(R.string.MERCHANT_PANEL_EDIT_PROFILE_LABEL);
            } else if (i == 2) {
                str = Rp(R.string.MERCHANT_PANEL_PROMOTE_LABEL);
            } else if (i == 3) {
                str = Rp(R.string.MERCHANT_PANEL_CUSTOMERS_LABEL);
            }
        }
        return jib.g(J, str);
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, Bundle bundle) {
        cqkf<bgvl> e = this.c.e(new bguj());
        this.ad = e;
        e.e(this.g);
        return this.ad.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = bundle == null ? this.o : bundle;
        this.ae = (dgcm) bvrs.e(bundle2, dgcm.class, (dssr) dgcm.c.cu(7));
        try {
            bwrs e = this.e.e(ilo.class, bundle2, "PLACEMARK_REF_KEY");
            dgcm dgcmVar = this.ae;
            if (dgcmVar != null && e != null) {
                bgvq bgvqVar = this.d;
                bgvq.a(dgcmVar, 1);
                bgvq.a(e, 2);
                bgvo a = bgvqVar.a.a();
                bgvq.a(a, 3);
                this.g = new bgvp(dgcmVar, e, a);
            }
            q(g());
            if (bundle != null) {
                return;
            }
            this.f.P(bvjk.jq);
        } catch (IOException e2) {
            throw new IllegalArgumentException("Cannot create MerchantActionsListFragment without a placemark", e2);
        }
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (this.f.m(bvjk.jq, false)) {
            this.f.P(bvjk.jq);
            Q().e();
            return;
        }
        efg efgVar = this.b;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.e(this);
        efgVar.a(egjVar.a());
    }
}
