package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: bcqc  reason: default package */
/* loaded from: classes3.dex */
public class bcqc extends ges implements bcpd {
    private dcdc<bczw> a = dcdc.e();
    public cqkj ae;
    public efg af;
    public eeu ag;
    public gfq ah;
    public bcrm ai;
    public bddg aj;
    public dxio<bbuu> ak;
    protected bddf al;
    public bdcn am;
    private cqkf<bdau> b;

    public static Bundle aV(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("INITIAL_INDEX", i);
        return bundle;
    }

    @Override // defpackage.ges, defpackage.gfw
    public void Qn(@dzsi Object obj) {
        if (obj instanceof bdvs) {
            bdvs bdvsVar = (bdvs) obj;
            this.ak.a().b(bdvsVar.a(), bdvsVar.b());
            cqkx.p(this.al);
        }
    }

    public final void aX(dcdc<bczw> dcdcVar) {
        this.a = dcdcVar;
        bddf bddfVar = this.al;
        if (bddfVar != null) {
            bddfVar.c(dcdcVar);
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        int i;
        try {
            this.ak.a();
        } catch (NullPointerException e) {
            bvoo.i(e);
        }
        this.b = this.ae.c(new bcwp(), null);
        this.am = new bdcn(this, this.b.c(), bcze.b, bctq.a);
        bddf bddfVar = this.al;
        if (bddfVar != null) {
            i = bddfVar.e().intValue();
        } else {
            i = this.o.getInt("INITIAL_INDEX", 0);
            if (bundle != null) {
                i = bundle.getInt("INITIAL_INDEX", i);
            }
        }
        int i2 = i;
        bcrl a = this.ai.a(true, this);
        bddg bddgVar = this.aj;
        dcdc<bczw> dcdcVar = this.a;
        bddg.a(dcdcVar, 1);
        bddg.a(a, 3);
        bddg.a(this, 4);
        Activity activity = (Activity) ((dxjd) bddgVar.a).a;
        bddg.a(activity, 5);
        btvo a2 = bddgVar.b.a();
        bddg.a(a2, 6);
        ckcw a3 = bddgVar.c.a();
        bddg.a(a3, 7);
        cjqy a4 = bddgVar.d.a();
        bddg.a(a4, 8);
        cjqq a5 = bddgVar.e.a();
        bddg.a(a5, 9);
        bdfe a6 = bddgVar.f.a();
        bddg.a(a6, 10);
        bdcm a7 = bddgVar.g.a();
        bddg.a(a7, 11);
        bdcj a8 = bddgVar.h.a();
        bddg.a(a8, 12);
        ckmm a9 = bddgVar.i.a();
        bddg.a(a9, 13);
        bddz a10 = bddgVar.j.a();
        bddg.a(a10, 14);
        cqhn a11 = bddgVar.k.a();
        bddg.a(a11, 15);
        bddb a12 = bddgVar.l.a();
        bddg.a(a12, 16);
        bdcp a13 = bddgVar.m.a();
        bddg.a(a13, 17);
        bdai a14 = bddgVar.n.a();
        bddg.a(a14, 18);
        bdag a15 = bddgVar.o.a();
        bddg.a(a15, 19);
        bcrp a16 = bddgVar.p.a();
        bddg.a(a16, 20);
        dbsg<bcrr> a17 = bddgVar.q.a();
        bddg.a(a17, 21);
        this.al = new bddf(dcdcVar, i2, a, this, activity, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17);
        ((ViewPager) cqkx.e(this.b.c(), bcze.a, ViewPager.class)).setOffscreenPageLimit(2);
        return this.b.c();
    }

    @Override // defpackage.bcpd
    public final void d(int i) {
        View findViewById;
        View view = this.P;
        if (view == null) {
            return;
        }
        try {
            ckos.b(view, i, -1).c();
        } catch (IllegalArgumentException unused) {
            ff J = J();
            if (J == null || (findViewById = J.findViewById(16908290)) == null) {
                return;
            }
            ckos.b(findViewById, i, -1).c();
        }
    }

    @Override // defpackage.ges, defpackage.gfo
    public boolean e() {
        gfq.l(this);
        return true;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.fk;
    }

    @Override // defpackage.ges, defpackage.fd
    public void s() {
        super.s();
        this.al.i();
        this.b.e(this.al);
        if (this.D == null && this.ag.h()) {
            efg efgVar = this.af;
            egj egjVar = new egj(this);
            egjVar.w(this.P);
            egjVar.x(egr.b);
            egjVar.ag(null);
            egjVar.e(this.al);
            egjVar.f(false);
            egf a = egf.a();
            a.s = this.al.k().booleanValue();
            egjVar.A(a);
            egjVar.J(new bcqb(this));
            efgVar.a(egjVar.a());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public void t(Bundle bundle) {
        super.t(bundle);
        bundle.putInt("INITIAL_INDEX", this.al.e().intValue());
    }

    @Override // defpackage.ges, defpackage.fd
    public void u() {
        this.al.j();
        this.b.e(null);
        this.am.f();
        super.u();
    }
}
