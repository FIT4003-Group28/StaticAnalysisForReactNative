package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afaw  reason: default package */
/* loaded from: classes2.dex */
public final class afaw extends hxf implements afbb {
    public dxio<akfa> ad;
    public dxio<afef> ae;
    public aedv af;
    public dxio<ixr> ag;
    public acyp ah;
    public Executor ai;
    private dktk aj;
    private cqkf<?> ak;
    private final crzp<btlu> al = new afav(this);
    public afds b;
    public gfq c;
    public cjxo d;
    public cqkj e;
    public bwqv f;
    public efg g;

    public static afaw aR(bwqv bwqvVar, afdt afdtVar) {
        afaw afawVar = new afaw();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "promo_callback", afdtVar.f());
        bundle.putInt("promo_toolbar_title", afdtVar.a());
        bundle.putInt("promo_toolbar_title_content_description", afdtVar.b());
        bundle.putBoolean("promo_toolbar_navigation_button", afdtVar.c());
        bundle.putInt("promo_body_res_id", afdtVar.d());
        bundle.putSerializable("promo_selected_tab", afdtVar.g());
        bundle.putBoolean("promo_searchbox_enabled", afdtVar.h());
        afawVar.B(bundle);
        return afawVar;
    }

    @Override // defpackage.ges, defpackage.ggg
    public final /* bridge */ /* synthetic */ List aO() {
        return this.o.getBoolean("promo_searchbox_enabled", false) ? dcdc.f(gfs.HOMETAB) : dcdc.e();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        afds afdsVar = this.b;
        if (afdsVar != null) {
            gga ggaVar = this.aE;
            dbsk.s(ggaVar);
            afdsVar.Pn(ggaVar, false);
        }
        return false;
    }

    @Override // defpackage.hxf
    protected final jib g() {
        Bundle bundle = this.o;
        jhz a = jhz.a();
        a.a = Ro(bundle.getInt("promo_toolbar_title"));
        a.x = false;
        int i = bundle.getInt("promo_toolbar_title_content_description");
        if (i != 0) {
            a.n = Ro(i);
        }
        if (bundle.getBoolean("promo_toolbar_navigation_button")) {
            a.f(afat.a);
        } else {
            a.i = null;
            a.j = null;
            a.f(null);
        }
        return a.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, Bundle bundle) {
        if (this.aj != null) {
            this.ak = this.af.d(null);
        }
        cqkf e = this.e.e(new afba());
        e.e(new afbc(this.o.getInt("promo_body_res_id"), this));
        return e.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        try {
            this.b = (afds) this.f.d(afds.class, bundle2, "promo_callback");
            this.aj = (dktk) bundle2.getSerializable("promo_selected_tab");
        } catch (IOException unused) {
            gfq.l(this);
        }
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        cqkf<?> cqkfVar;
        super.s();
        if (btpf.a(J())) {
            this.d.a(7);
        }
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ad(false);
        egjVar.av(null);
        egjVar.ag(null);
        if (this.aj != null && (cqkfVar = this.ak) != null) {
            egjVar.av(cqkfVar.c());
        }
        if (this.o.getBoolean("promo_searchbox_enabled", false)) {
            dxio<ixr> dxioVar = this.ag;
            dbsk.s(dxioVar);
            ixr a = dxioVar.a();
            a.o(false);
            a.ak(false);
            a.al(true);
            egjVar.Z();
            egjVar.W(a);
        }
        if (this.ah.g()) {
            egjVar.h();
        }
        egjVar.f(true);
        egjVar.au();
        this.g.a(egjVar.a());
        this.ad.a().C().d(this.al, this.ai);
        if (this.aj != null) {
            this.af.b(this);
            aedv aedvVar = this.af;
            dktk dktkVar = this.aj;
            dbsk.s(dktkVar);
            aedvVar.g(dktkVar);
        }
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        if (btpf.a(J())) {
            this.d.b();
        }
        this.ad.a().C().c(this.al);
        super.u();
    }
}
