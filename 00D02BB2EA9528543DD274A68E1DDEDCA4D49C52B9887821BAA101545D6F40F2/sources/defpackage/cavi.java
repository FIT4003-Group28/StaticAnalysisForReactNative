package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
/* compiled from: PG */
/* renamed from: cavi  reason: default package */
/* loaded from: classes4.dex */
public final class cavi extends hxf implements bzyv {
    public efg ad;
    public cafi ae;
    private cqkf<cavt> af;
    private jib ag = jhz.a().b();
    @dzsi
    private View.OnLayoutChangeListener ah;
    @dzsi
    public cavt b;
    @dzsi
    public View c;
    @dzsi
    public View d;
    cawy e;
    public cqkj f;
    public cavn g;

    @Override // defpackage.bzyv
    public final void a() {
        if (!this.aD) {
            return;
        }
        J().g().f();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void aj(@dzsi Bundle bundle) {
        cqjg cqjgVar;
        super.aj(bundle);
        View c = this.af.c();
        if (this.ae.p()) {
            cqjgVar = cawp.c;
        } else {
            cqjgVar = cawp.b;
        }
        View a = cqhu.a(c, cqjgVar);
        View view = null;
        this.c = a == null ? null : cqhu.a(a, bzxv.a);
        if (a != null) {
            view = cqhu.a(a, bzxv.b);
        }
        this.d = view;
        this.ah = new cavh(this);
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz e = this.ag.e();
        e.f(new jmn(getClass()));
        if (this.ae.p()) {
            e.q = irg.a();
            e.u = irg.b();
            e.i = cqrt.g(2131231588, irg.b());
            e.x = true;
        }
        jib b = e.b();
        this.ag = b;
        return b;
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<cavt> e = this.f.e(new cawp());
        this.af = e;
        return e.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        cawy cawyVar = (cawy) bvrs.b(this.o.getByteArray("contribution_stats_page"), (dssr) cawy.h.cu(7));
        dbsk.s(cawyVar);
        this.e = cawyVar;
        super.l(bundle);
        dqkn dqknVar = this.e.b;
        if (dqknVar == null) {
            dqknVar = dqkn.e;
        }
        if ((dqknVar.a & 1) != 0) {
            cawy cawyVar2 = this.e;
            if ((cawyVar2.a & 4) != 0) {
                cavn cavnVar = this.g;
                cavn.a(this, 1);
                cavn.a(this, 2);
                cavn.a(cawyVar2, 3);
                Resources a = cavnVar.a.a();
                cavn.a(a, 4);
                bzyt a2 = cavnVar.b.a();
                cavn.a(a2, 5);
                bzyu a3 = cavnVar.c.a();
                cavn.a(a3, 6);
                bzyo a4 = cavnVar.d.a();
                cavn.a(a4, 7);
                cavr a5 = cavnVar.e.a();
                cavn.a(a5, 8);
                cklf a6 = cavnVar.f.a();
                cavn.a(a6, 9);
                cafi a7 = cavnVar.g.a();
                cavn.a(a7, 10);
                ech a8 = cavnVar.h.a();
                cavn.a(a8, 11);
                this.b = new cavm(this, this, cawyVar2, a, a2, a3, a4, a5, a6, a7, a8);
            }
        }
        dqkn dqknVar2 = this.e.b;
        if (dqknVar2 == null) {
            dqknVar2 = dqkn.e;
        }
        if ((dqknVar2.a & 1) != 0) {
            jhz e = this.ag.e();
            dqkn dqknVar3 = this.e.b;
            if (dqknVar3 == null) {
                dqknVar3 = dqkn.e;
            }
            e.a = dqknVar3.b;
            jib b = e.b();
            this.ag = b;
            q(b);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        dqwa dqwaVar = this.e.d;
        if (dqwaVar == null) {
            dqwaVar = dqwa.g;
        }
        dqvy dqvyVar = dqwaVar.c;
        if (dqvyVar == null) {
            dqvyVar = dqvy.h;
        }
        return (dqvyVar.a & 16) != 0 ? this.e.c ? dtxl.eC : dtxy.oG : this.e.c ? dtxl.eD : dtxy.oH;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        View.OnLayoutChangeListener onLayoutChangeListener;
        super.s();
        this.af.e(this.b);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.w(this.P);
        egjVar.e(this);
        this.ad.a(egjVar.a());
        View view = this.c;
        if (view == null || (onLayoutChangeListener = this.ah) == null) {
            return;
        }
        view.addOnLayoutChangeListener(onLayoutChangeListener);
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        View.OnLayoutChangeListener onLayoutChangeListener;
        View view = this.c;
        if (view != null && (onLayoutChangeListener = this.ah) != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        this.af.e(null);
        super.u();
    }
}
