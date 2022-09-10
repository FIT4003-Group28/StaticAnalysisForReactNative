package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aoqj  reason: default package */
/* loaded from: classes2.dex */
public final class aoqj extends anns implements anrs, aorn, auzu {
    public anpf a;
    public bwqv ad;
    public apke ae;
    public anqs af;
    public aorm ag;
    public apkv ah;
    public cqkj ai;
    public efg aj;
    public bvjj ak;
    public jkf al;
    public aplg am;
    public aoug an;
    @dzsi
    public aouf ao;
    private angu<aogb, aoge> ap;
    private apkj aq;
    private apku ar;
    private anhu as;
    @dzsi
    private View at;
    private cqkf<aork> au;
    private gek av;
    public apjy b;
    public angp c;
    public aoqh d;
    public angv e;
    public aoqi f;
    public aotx g;

    private final void aR() {
        if (!this.aD) {
            return;
        }
        this.as = anhu.NO;
        this.at = null;
        this.ao = null;
        aS();
    }

    private final void aS() {
        egj egjVar = new egj(this);
        egjVar.k(false);
        egjVar.at(null);
        egjVar.r(this.ar.a());
        egjVar.Y(true);
        egjVar.t(jjk.a(this.ar, this.ae, this.aq, this.am));
        egjVar.w(null);
        egjVar.J(new aoqg(this));
        egjVar.ay(this.P, R.id.header);
        egjVar.ai(this.av.a(jjn.EXPANDED));
        egf h = egf.h();
        h.h = this.af.a();
        egjVar.A(h);
        View view = this.at;
        if (view != null) {
            egjVar.av(view);
        }
        this.aj.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<aork> cqkfVar = this.au;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof dvyw) {
            this.ag.g((dvyw) obj);
        } else if (!(obj instanceof ilo)) {
        } else {
            this.ag.g(((ilo) obj).h());
        }
    }

    @Override // defpackage.anrs
    public final aogb a() {
        return this.ap.a();
    }

    @Override // defpackage.auzu
    public final void aJ() {
        aR();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        if (this.ao != null) {
            cqkf c = this.ai.c(new auzt(), null);
            c.e(this.ao);
            this.at = c.c();
        }
        cqkf<aork> c2 = this.ai.c(new aorj(), viewGroup);
        this.au = c2;
        c2.e(this.ag);
        return this.au.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.c.b(this.d);
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        this.b.a();
        return true;
    }

    @Override // defpackage.aorn
    public final void g() {
        aosb.a(this, this.ad, null).run();
    }

    @Override // defpackage.aorn
    public final void i(akqq akqqVar) {
        this.a.a(akqqVar, this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        aoge aogeVar;
        super.l(bundle);
        if (bundle != null && bundle.containsKey("day-details")) {
            try {
                aogeVar = (aoge) this.ad.d(aoge.class, bundle, "day-details");
            } catch (IOException e) {
                e.getMessage();
                aogeVar = null;
            }
            if (aogeVar != null) {
                aogeVar.g();
                this.e.g(aogeVar);
            }
        }
        this.ap = this.e.a(q().a());
        this.aq = new apkj();
        this.c.a(this.d);
        this.ar = this.ah.a(this.ag.e());
        this.as = (anhu) this.o.getSerializable("show-opt-out");
        if (bundle != null && bundle.containsKey("show-opt-out")) {
            this.as = (anhu) bundle.getSerializable("show-opt-out");
        }
        if (aouf.k(this.ak, this.as)) {
            this.ao = this.an.a(this, this.as);
        }
        this.av = new gek(J(), this, this.al);
    }

    public final aoha q() {
        return (aoha) this.o.getSerializable("segment-identifier");
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        aS();
        this.ap.c(this.f);
        this.ar.b();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putSerializable("show-opt-out", this.as);
        angs<aoge> b = this.ap.b();
        if (b.e()) {
            aoge f = b.f();
            f.g();
            this.ad.c(bundle, "day-details", f);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.g.d();
        this.ap.d(this.f);
        this.ar.c();
        super.u();
    }

    @Override // defpackage.auzu
    public final void w() {
        aR();
    }
}
