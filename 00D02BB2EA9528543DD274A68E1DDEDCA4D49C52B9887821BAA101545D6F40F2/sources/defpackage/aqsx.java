package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqsx  reason: default package */
/* loaded from: classes2.dex */
public final class aqsx extends hxf {
    private cqkf<aquw> ad;
    private String ae = "";
    private String af = "";
    private String ag = "";
    private ddce ah = ddce.SETTING_ENTRY_TYPE_UNSPECIFIED;
    public ff b;
    public dxio<aqvv> c;
    public efg d;
    public cqkj e;
    public dxio<cpv> f;
    private aquw g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((aqsy) btsx.b(aqsy.class, this)).ch(this);
    }

    @Override // defpackage.ges
    public final void Oo(View view) {
        if (w().a()) {
            this.f.a().c(w().b(), 8);
        } else {
            this.f.a().a(view);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.ad.e(null);
        this.g.e();
        super.Qe();
    }

    @Override // defpackage.hxf
    protected final jib g() {
        String str;
        Bundle bundle = this.o;
        if (bundle != null) {
            this.ae = bundle.getString("business_listing_id", "");
            this.af = bundle.getString("business_listing_name", "");
            this.ag = bundle.getString("business_listing_address", "");
            this.ah = ddce.b(bundle.getInt("entry_point", ddce.SETTING_ENTRY_TYPE_UNSPECIFIED.e));
        }
        ff ffVar = this.b;
        if (this.af.equals("")) {
            str = this.b.getString(R.string.MESSAGING_SETTINGS_TITLE);
        } else {
            str = this.af;
        }
        jhz e = jib.g(ffVar, str).e();
        e.b = this.ag;
        e.v = ibm.o();
        e.D = 1;
        return e.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        this.ad = this.e.d(new aquf(), null, false);
        String str = this.ae;
        dbsk.s(str);
        aqvu a = this.c.a().a(str, this.ah);
        this.g = a;
        a.a();
        this.ad.e(this.g);
        return this.ad.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxk.P;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.e(this);
        egjVar.j(false);
        this.d.a(egjVar.a());
    }
}
