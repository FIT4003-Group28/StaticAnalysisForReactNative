package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: tnr  reason: default package */
/* loaded from: classes7.dex */
public final class tnr extends hxf implements ssr {
    private trn ad;
    public efg b;
    public dxio<akfa> c;
    public cqkj d;
    public tro e;
    public boolean f;
    @dzsi
    private cqkf<trd> g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.g = null;
        super.Qe();
    }

    @Override // defpackage.ssr
    public final ssq b() {
        return ssq.PREFERENCES;
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz a = jhz.a();
        a.i = cqrt.f(2131232205);
        a.f(new View.OnClickListener(this) { // from class: tnp
            private final tnr a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ff J = this.a.J();
                if (J == null) {
                    return;
                }
                J.onBackPressed();
            }
        });
        a.a = Rp(ssv.PREFERENCES_PAGE_TITLE);
        return a.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<trd> e = this.d.e(new tqe());
        this.g = e;
        return e.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("route_options_scroll")) {
            z = true;
        }
        this.f = z;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.ej;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        btlu btluVar;
        super.s();
        if (this.c.a().j() != null) {
            btluVar = this.c.a().j();
        } else {
            btluVar = btlu.b;
        }
        btlu btluVar2 = btluVar;
        tro troVar = this.e;
        dbsk.s(btluVar2);
        Activity activity = (Activity) ((dxjd) troVar.a).a;
        tro.a(activity, 1);
        trj a = troVar.b.a();
        tro.a(a, 2);
        toh a2 = troVar.c.a();
        tro.a(a2, 3);
        toi a3 = troVar.d.a();
        tro.a(a3, 4);
        tnv a4 = troVar.e.a();
        tro.a(a4, 5);
        cqhn a5 = troVar.f.a();
        tro.a(a5, 6);
        tro.a(btluVar2, 7);
        trn trnVar = new trn(activity, a, a2, a3, a4, a5, btluVar2);
        this.ad = trnVar;
        cqkf<trd> cqkfVar = this.g;
        if (cqkfVar != null) {
            cqkfVar.e(trnVar);
        }
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.x(egr.a);
        egjVar.J(new egq(this) { // from class: tnq
            private final tnr a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                View view;
                tnr tnrVar = this.a;
                if (tnrVar.f && (view = tnrVar.P) != null) {
                    NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.mod_app_bar_fullscreen_content_view);
                    View a6 = cqhu.a(view, tqe.a);
                    if (a6 == null) {
                        return;
                    }
                    nestedScrollView.t(a6.getBottom(), 500, false);
                    tnrVar.f = false;
                }
            }
        });
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        efg efgVar = this.b;
        egjVar.ag(null);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putBoolean("route_options_scroll", this.f);
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<trd> cqkfVar = this.g;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        this.ad.e();
        super.u();
    }
}
