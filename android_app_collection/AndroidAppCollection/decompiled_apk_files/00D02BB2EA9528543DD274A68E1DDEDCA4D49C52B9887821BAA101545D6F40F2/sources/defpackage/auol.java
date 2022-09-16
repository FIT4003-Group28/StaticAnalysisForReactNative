package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: auol  reason: default package */
/* loaded from: classes2.dex */
public final class auol extends hxf {
    public Activity ad;
    @dzsi
    private cqkf<aura> ae;
    @dzsi
    private cqkf<?> af;
    private aurp ag;
    public cqkj b;
    public efg c;
    public aedv d;
    public dxio<afwt> e;
    public dxio<bsvm> f;
    public aurq g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<aura> cqkfVar = this.ae;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.ae = null;
        }
        cqkf<?> cqkfVar2 = this.af;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
            this.af = null;
        }
        super.Qe();
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhm jhmVar = new jhm();
        jhmVar.c = cqrt.f(2131232419);
        jhmVar.b = Ro(R.string.NOTIFICATIONS_SETTINGS_CONTENT_DESCRIPTION);
        jhmVar.h = 1;
        jhmVar.f = cjtd.a(dtxs.z);
        jhmVar.d(new View.OnClickListener(this) { // from class: auoj
            private final auol a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f.a().n();
            }
        });
        jho c = jhmVar.c();
        jhz a = jhz.a();
        a.a = Ro(R.string.INBOX_TAB_BUTTON);
        a.g = ibm.p();
        a.i = cqrt.f(2131231686);
        a.f(new View.OnClickListener(this) { // from class: auok
            private final auol a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e.a().p();
            }
        });
        a.j = cqrt.l(R.string.ACCESSIBILITY_MENU);
        a.o = cjtd.a(dtxs.A);
        a.z = 1;
        a.c(c);
        return a.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        this.af = this.d.d(null);
        this.ag = this.g.a(this.ad, this);
        cqkf<aura> e = this.b.e(new aupy());
        this.ae = e;
        e.e(this.ag);
        return this.ae.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        aJ();
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtxs.y;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.d.b(this);
        dbsg<ModAppBar> w = w();
        if (w.a()) {
            w.b().b();
        }
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        cqkf<?> cqkfVar = this.af;
        if (cqkfVar != null) {
            egjVar.av(cqkfVar.c());
        }
        this.c.a(egjVar.a());
        this.ag.o();
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        this.d.c(this);
        super.u();
    }
}
