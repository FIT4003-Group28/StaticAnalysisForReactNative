package defpackage;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: dcu  reason: default package */
/* loaded from: classes5.dex */
public final class dcu extends ges {
    public static final String a = gfu.b(dcu.class, gfu.ACTIVITY_FRAGMENT, new gfs[0]);
    public cjxo ad;
    @dzsi
    private cqkf<cqkp> ae;
    @dzsi
    private czz af;
    @dzsi
    private cze ag;
    @dzsi
    private dfen ah;
    public ddu b;
    public efg c;
    public cqkj d;
    public Application e;
    public dbsg<czo> f;
    public czj g;

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        dbsg<czc> dbsgVar = this.b.a;
        dbsk.l(dbsgVar.a());
        czy c = dbsgVar.b().c();
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        czx a2 = c.a(ggaVar, czh.CALIBRATOR);
        a2.d(this.g);
        this.af = a2.a();
        this.ae = this.d.c(new ddy(), null);
        czz czzVar = this.af;
        dbsk.s(czzVar);
        czzVar.n(new View.OnClickListener(this) { // from class: dct
            private final dcu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e();
            }
        });
        cqkf<cqkp> cqkfVar = this.ae;
        dbsk.s(cqkfVar);
        ViewGroup viewGroup2 = (ViewGroup) cqkfVar.c();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        czz czzVar2 = this.af;
        dbsk.s(czzVar2);
        viewGroup2.addView(czzVar2.a(), 1, layoutParams);
        return viewGroup2;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        czz czzVar = this.af;
        dbsk.s(czzVar);
        czzVar.d();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        czz czzVar = this.af;
        dbsk.s(czzVar);
        czzVar.e();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        czz czzVar = this.af;
        if (czzVar != null) {
            czzVar.g();
            this.af = null;
        }
        if (this.ae != null) {
            this.ae = null;
        }
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        this.f.b().c(czh.CALIBRATOR);
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        dbsg<czc> dbsgVar = this.b.a;
        dbsk.l(dbsgVar.a());
        dbsk.l(this.f.a());
        dbsgVar.b().d((gga) J(), this.f.b(), czh.CALIBRATOR);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxj.bq;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ad.a(1);
        efg efgVar = this.c;
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.x(new djb());
        egjVar.ag(null);
        egjVar.f(false);
        egf a2 = egf.a();
        a2.a = true;
        a2.k();
        egjVar.A(a2);
        czz czzVar = this.af;
        dbsk.s(czzVar);
        egjVar.J(czzVar.b());
        efgVar.a(egjVar.a());
        this.ag = this.b.a.b().a().a(this.e);
        czz czzVar2 = this.af;
        dbsk.s(czzVar2);
        daj m = czzVar2.m();
        cze czeVar = this.ag;
        dbsk.s(czeVar);
        this.ah = m.c(czeVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.ad.b();
        dfen dfenVar = this.ah;
        if (dfenVar != null) {
            dfenVar.a();
            this.ah = null;
        }
        cze czeVar = this.ag;
        if (czeVar != null) {
            czeVar.b();
            this.ag = null;
        }
    }
}
