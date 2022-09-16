package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bakk  reason: default package */
/* loaded from: classes3.dex */
public final class bakk extends ges implements bakx, egq {
    public axxf a;
    public balc ad;
    public batc ae;
    @dzsi
    public jjn af;
    @dzsi
    public baky ag;
    @dzsi
    public balb ah;
    private String ai;
    private axxe aj;
    @dzsi
    private bakj ak;
    @dzsi
    private baki al;
    @dzsi
    private gek am;
    @dzsi
    private cqkf<baqn> an;
    @dzsi
    private cqkf<baqm> ao;
    @dzsi
    private baqn ap;
    @dzsi
    private basz aq;
    public axwq b;
    public efg c;
    public cqkj d;
    public jkf e;
    public batb f;
    public bakz g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<baqn> cqkfVar = this.an;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        cqkf<baqm> cqkfVar2 = this.ao;
        dbsk.s(cqkfVar2);
        cqkfVar2.e(null);
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        if (!this.aD) {
            return;
        }
        baky bakyVar = this.ag;
        if (bakyVar != null) {
            jjn jjnVar = this.af;
            dbsk.s(jjnVar);
            bakyVar.P(bakyVar.a.l(), jjnVar, 0.0f);
        }
        balb balbVar = this.ah;
        if (balbVar != null) {
            jjn jjnVar2 = this.af;
            dbsk.s(jjnVar2);
            balbVar.a(jjnVar2);
        }
        View view = this.P;
        if (view == null) {
            return;
        }
        this.aF = view.findViewById(R.id.trip_reservations_page_header);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<baqm> c = this.d.c(new bapz(), null);
        this.ao = c;
        dbsk.s(c);
        c.e(this.aq);
        cqkf<baqn> c2 = this.d.c(new baqa(), null);
        this.an = c2;
        dbsk.s(c2);
        c2.e(this.ap);
        cqkf<baqn> cqkfVar = this.an;
        dbsk.s(cqkfVar);
        View c3 = cqkfVar.c();
        baki bakiVar = new baki(H());
        this.al = bakiVar;
        bakiVar.setShouldUseRoundedCornersShadow(false);
        this.al.setContent(c3);
        balc balcVar = this.ad;
        cqkf<baqm> cqkfVar2 = this.ao;
        dbsk.s(cqkfVar2);
        View c4 = cqkfVar2.c();
        gga a = balcVar.a.a();
        balc.a(a, 1);
        balc.a(c4, 2);
        this.ah = new balb(a, c4);
        bakz bakzVar = this.g;
        baqn baqnVar = this.ap;
        dbsk.s(baqnVar);
        baql c5 = baqnVar.c();
        bakz.a(bakzVar.a.a(), 1);
        jkf a2 = bakzVar.b.a();
        bakz.a(a2, 2);
        bakz.a(c5, 3);
        this.ag = new baky(a2, c5);
        return c3;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        Bundle bundle = this.o;
        String string = bundle == null ? null : bundle.getString("arg_trip_reservation_id");
        if (dbsj.d(string)) {
            return;
        }
        dcdc<drjs> b = this.aj.b();
        baqn baqnVar = this.ap;
        dbsk.s(baqnVar);
        List<baqk> f = baqnVar.f();
        if (b.size() != f.size()) {
            return;
        }
        for (int i = 0; i < b.size(); i++) {
            if (string.equals(b.get(i).d.J())) {
                f.get(i).d().g();
                bundle.putString("arg_trip_reservation_id", null);
                return;
            }
        }
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        basz baszVar = this.aq;
        if (baszVar != null) {
            baszVar.b();
            return true;
        }
        return false;
    }

    public final void g(dcdc<axxe> dcdcVar) {
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            axxe axxeVar = dcdcVar.get(i);
            i++;
            if (axxeVar.a().b.equals(this.ai)) {
                if (this.aj == null) {
                    this.aj = axxeVar;
                    this.ap = this.f.a(this, axxeVar);
                    this.aq = this.ae.a(axxeVar);
                    return;
                }
                this.aj = axxeVar;
                if (axxeVar.b().isEmpty()) {
                    e();
                    return;
                }
                baqn baqnVar = this.ap;
                dbsk.s(baqnVar);
                baqnVar.g(axxeVar.b());
                return;
            }
        }
        this.ap = this.f.a(this, axxe.a);
        this.aq = this.ae.a(axxe.a);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        this.ai = bundle.getString("arg_trip_id", "");
        axxf y = this.b.y();
        this.a = y;
        dcdc<axxe> h = y.b().h();
        dbsk.s(h);
        g(h);
        this.a.b().b(this, new aa(this) { // from class: bakh
            private final bakk a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.g((dcdc) obj);
            }
        });
        this.ak = new bakj(this);
        this.am = new gek(J(), this, this.e);
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        balb balbVar = this.ah;
        if (balbVar != null) {
            balbVar.b();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        gek gekVar = this.am;
        dbsk.s(gekVar);
        this.af = gekVar.a(jjn.EXPANDED);
        egj egjVar = new egj(this);
        egjVar.k(false);
        egjVar.at(null);
        egjVar.w(null);
        cqkf<baqm> cqkfVar = this.ao;
        egjVar.G(cqkfVar == null ? null : cqkfVar.c(), 5);
        egjVar.s(this.al);
        jjn jjnVar = this.af;
        dbsk.s(jjnVar);
        egjVar.ai(jjnVar);
        egjVar.ak(jkc.m, jkc.m);
        egjVar.D(0);
        bakj bakjVar = this.ak;
        dbsk.s(bakjVar);
        egjVar.t(bakjVar);
        egjVar.J(this);
        egjVar.e(this);
        egjVar.B(true);
        egjVar.av(null);
        this.c.a(egjVar.a());
        basz baszVar = this.aq;
        if (baszVar != null) {
            cqkx.p(baszVar);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putString("arg_trip_id", this.aj.a().b);
        bundle.putString("arg_trip_name", this.aj.a().c);
    }
}
