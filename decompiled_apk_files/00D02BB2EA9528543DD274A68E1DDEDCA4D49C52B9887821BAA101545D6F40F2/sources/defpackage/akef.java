package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akef  reason: default package */
/* loaded from: classes2.dex */
public final class akef extends ges implements akft {
    private static final dcqe al = dcqe.c("akef");
    @dzsi
    public akee a;
    public gfq ad;
    public cjxo ae;
    public Executor af;
    public bwqv ag;
    public aedv ah;
    public akfp ai;
    public dxio<ixr> aj;
    public acyp ak;
    private final crzp<btlu> am = new aked(this);
    @dzsi
    private dktk an;
    @dzsi
    private cqkf<akfx> ao;
    @dzsi
    private ViewTreeObserver.OnScrollChangedListener ap;
    @dzsi
    public akfo b;
    cqkf<?> c;
    public dxio<akfa> d;
    public akfc e;
    public efg f;
    public cqkj g;

    public static akef aJ(bwqv bwqvVar, @dzsi akee akeeVar, int i, int i2, int i3, int i4, @dzsi dktk dktkVar, boolean z) {
        akef akefVar = new akef();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "login_promo_callback", akeeVar);
        bundle.putInt("login_promo_title_res_id", i);
        bundle.putInt("login_promo_body_res_id", i2);
        bundle.putInt("login_promo_app_bar_title_res_id", i3);
        bundle.putInt("login_promo_app_bar_title_content_description_res_id", i4);
        bundle.putSerializable("login_promo_selected_tab_type", dktkVar);
        bundle.putBoolean("login_promo_searchbox_enabled", z);
        akefVar.B(bundle);
        return akefVar;
    }

    public static akef g(bwqv bwqvVar, @dzsi akee akeeVar) {
        return aJ(bwqvVar, akeeVar, R.string.LOGIN_PROMPT_PANEL_OOB_TITLE, R.string.SAVE_PLACE_PROMOTION_MESSAGE, R.string.SIGN_IN, 0, null, false);
    }

    public static akef i(bwqv bwqvVar, @dzsi akee akeeVar, int i, int i2) {
        return aJ(bwqvVar, akeeVar, i, i2, R.string.SIGN_IN, 0, null, false);
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((akeg) btsx.b(akeg.class, this)).bW(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<akfx> cqkfVar = this.ao;
        if (cqkfVar != null) {
            ViewTreeObserver viewTreeObserver = cqkfVar.c().findViewById(R.id.fullscreen_login_promo_layout_scroll_view).getViewTreeObserver();
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.ap;
            dbsk.s(onScrollChangedListener);
            viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
            this.ap = null;
            cqkf<akfx> cqkfVar2 = this.ao;
            dbsk.s(cqkfVar2);
            cqkfVar2.e(null);
        }
        this.ao = null;
        this.b = null;
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.ggg
    public final /* bridge */ /* synthetic */ List aO() {
        return this.o.getBoolean("login_promo_searchbox_enabled", false) ? dcdc.f(gfs.HOMETAB) : dcdc.e();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        this.ao = this.g.c(new glr(), (ViewGroup) this.P);
        akfp akfpVar = this.ai;
        int i = this.o.getInt("login_promo_title_res_id");
        int i2 = this.o.getInt("login_promo_body_res_id");
        int i3 = this.o.getInt("login_promo_app_bar_title_res_id");
        int i4 = this.o.getInt("login_promo_app_bar_title_content_description_res_id");
        cqtv d = this.an != null ? aece.a : cqrp.d(dcyn.a);
        cjtd a = cjtd.a(dtxp.af);
        cjtd a2 = cjtd.a(dtxp.ae);
        boolean z = this.o.getBoolean("login_promo_searchbox_enabled", false);
        gga a3 = akfpVar.a.a();
        akfp.a(a3, 1);
        cqhn a4 = akfpVar.b.a();
        akfp.a(a4, 2);
        akfp.a(this, 3);
        akfp.a(d, 9);
        akfo akfoVar = new akfo(a3, a4, this, false, i, i2, i3, i4, d, a, a2, z);
        this.b = akfoVar;
        akfoVar.e(true);
        if (this.an != null) {
            this.c = this.ah.d(viewGroup);
        }
        cqkf<akfx> cqkfVar = this.ao;
        if (cqkfVar == null) {
            return null;
        }
        cqkfVar.e(this.b);
        View c = this.ao.c();
        final View findViewById = c.findViewById(R.id.fullscreen_login_promo_layout_scroll_view);
        this.ap = new ViewTreeObserver.OnScrollChangedListener(this, findViewById) { // from class: akeb
            private final akef a;
            private final View b;

            {
                this.a = this;
                this.b = findViewById;
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                akfo akfoVar2;
                akef akefVar = this.a;
                View view = this.b;
                if (!view.getViewTreeObserver().isAlive() || (akfoVar2 = akefVar.b) == null) {
                    return;
                }
                akfoVar2.a(view.getScrollY() != 0);
            }
        };
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.ap;
        dbsk.s(onScrollChangedListener);
        viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
        return c;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        akee akeeVar = this.a;
        if (akeeVar != null) {
            gga ggaVar = this.aE;
            dbsk.s(ggaVar);
            akeeVar.a(ggaVar, false);
        }
        return false;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        try {
            this.a = (akee) this.ag.d(akee.class, bundle2, "login_promo_callback");
            this.an = (dktk) bundle2.getSerializable("login_promo_selected_tab_type");
        } catch (IOException unused) {
            bvoo.h("Error reading login callback from storage.", new Object[0]);
            gfq.l(this);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyb.dI;
    }

    @Override // defpackage.akft
    public final void q() {
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        cqkf<?> cqkfVar;
        super.s();
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ad(false);
        egjVar.av(null);
        egjVar.ag(null);
        if (this.an != null && (cqkfVar = this.c) != null) {
            egjVar.av(cqkfVar.c());
        }
        if (this.o.getBoolean("login_promo_searchbox_enabled", false)) {
            dxio<ixr> dxioVar = this.aj;
            dbsk.s(dxioVar);
            ixr a = dxioVar.a();
            a.o(false);
            a.ak(false);
            a.al(true);
            egjVar.Z();
            egjVar.W(a);
        }
        egjVar.f(true);
        egjVar.au();
        if (this.ak.g()) {
            egjVar.h();
        }
        this.f.a(egjVar.a());
        this.d.a().C().d(this.am, this.af);
        if (this.an != null) {
            this.ah.b(this);
            aedv aedvVar = this.ah;
            dktk dktkVar = this.an;
            dbsk.s(dktkVar);
            aedvVar.g(dktkVar);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        if (btpf.a(J())) {
            this.ae.b();
        }
        this.d.a().C().c(this.am);
        super.u();
    }

    @Override // defpackage.akft
    public final void w() {
        if (!this.aD) {
            return;
        }
        this.e.k(null, null);
    }
}
