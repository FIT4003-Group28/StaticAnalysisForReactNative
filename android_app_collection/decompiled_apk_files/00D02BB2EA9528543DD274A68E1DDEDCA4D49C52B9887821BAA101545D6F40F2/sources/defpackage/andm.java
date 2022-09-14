package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: andm  reason: default package */
/* loaded from: classes2.dex */
public final class andm extends ges {
    public aefv a;
    public anqv ad;
    public cjqy ae;
    public ioj af;
    public ahjq ag;
    public btrm ah;
    public dxio<araj> ai;
    public bvnx aj;
    protected anfi ak;
    private cqkf<jbk> al;
    private cqkf<anfc> am;
    private jbk an;
    private View ao;
    private akzy ap;
    private ioi aq;
    @dzsi
    private ddho ar;
    public boolean b = false;
    @dzsi
    public ilo c;
    public dxio<akpm> d;
    public efg e;
    public cqkj f;
    public gfq g;

    private final void aU() {
        if (this.a == null) {
            return;
        }
        int a = jmj.a(J(), true != btpf.c(J()).f ? 180 : 136);
        this.a.setMinExposurePixels(a);
        this.a.h(a);
    }

    public static andm g(anee aneeVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("args", aneeVar);
        andm andmVar = new andm();
        andmVar.B(bundle);
        return andmVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.aq.f();
        super.Qe();
    }

    public final void aJ() {
        gfq.l(this);
    }

    public final void aR(akqq akqqVar) {
        aS(Collections.emptyList(), anfb.LOADING);
        this.ad.a(akqqVar, new andk(this));
    }

    public final void aS(List<dvas> list, anfb anfbVar) {
        if (list.size() > 6) {
            list = list.subList(0, Math.min(6, list.size()));
        }
        List<ilo> k = dchl.k(list, andf.a);
        ArrayList arrayList = new ArrayList();
        ilo iloVar = this.c;
        if (iloVar != null) {
            arrayList.add(iloVar);
        }
        for (ilo iloVar2 : k) {
            ilo iloVar3 = this.c;
            if (iloVar3 == null || !iloVar3.q().equals(iloVar2.q()) || (iloVar3.aj() != null ? !iloVar3.aj().equals(iloVar2.aj()) : iloVar2.aj() != null)) {
                arrayList.add(iloVar2);
            }
            if (arrayList.size() >= 6) {
                break;
            }
        }
        this.ak.i(arrayList);
        this.ak.j(anfbVar);
        cqkx.p(this.ak);
        ioi ioiVar = this.aq;
        if (ioiVar != null) {
            ioiVar.e(dcdc.r(arrayList), dcaf.a(dclz.g(0, Integer.valueOf(arrayList.size())), dcat.a).v(), false);
        }
    }

    public final void aT(ilo iloVar) {
        akqq aj = iloVar.aj();
        if (aj != null) {
            this.c = iloVar;
            this.d.a().q(akyt.g(aj), new andl(this));
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.al = this.f.c(new hxj(), null);
        this.am = this.f.c(new aney(), null);
        this.ao = layoutInflater.inflate(R.layout.floating_pin_layout, (ViewGroup) null);
        return super.ag(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        w();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        akqq q = q();
        if (q != null) {
            aR(q);
            this.c = null;
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        anee aneeVar = (anee) this.o.getSerializable("args");
        this.ar = aneeVar.r();
        super.l(bundle);
        andg andgVar = new andg(this);
        this.ap = new andh(this);
        this.aq = this.af.a(new andi(this), true, dtxl.w, dtxl.w);
        this.an = new anfe(aneeVar.a(), aneeVar.c(), andgVar);
        this.ak = new anfi(J(), andgVar, this.aq, 6, new Runnable(this) { // from class: ande
            private final andm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.i();
            }
        });
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aU();
    }

    @Override // defpackage.ges
    public final ddho p() {
        ddho ddhoVar = this.ar;
        dbsk.s(ddhoVar);
        return ddhoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final akqq q() {
        alad n = this.d.a().n();
        if (n == null) {
            return null;
        }
        return n.i;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        aefv aefvVar;
        super.s();
        this.aq.a();
        this.d.a().ab(this.ap);
        btrm btrmVar = this.ah;
        dceq a = dcet.a();
        a.b(ardp.class, new andn(ardp.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        this.al.e(this.an);
        this.am.e(this.ak);
        this.a = (aefv) this.am.c();
        aU();
        this.a.l(new andj(this));
        this.ai.a().m().l(alae.a);
        akzn akznVar = new akzn(this.aj);
        alad n = this.d.a().n();
        alaa b = alad.b(n);
        b.f = alae.a;
        akznVar.a(n, b.a());
        akznVar.p(0L);
        this.d.a().r(akznVar);
        i();
        egf a2 = egf.a();
        a2.x = false;
        a2.l(false);
        egj egjVar = new egj(this);
        egjVar.A(a2);
        egjVar.F(this.al.c());
        egjVar.D(ise.b.e(J()));
        egjVar.f(false);
        egjVar.ag(null);
        egjVar.k(true);
        egjVar.I(2);
        egjVar.w(null);
        egjVar.M(this.ao);
        egjVar.H(this.a);
        if (this.aD && (aefvVar = this.a) != null) {
            egjVar.N(aefvVar.u());
        }
        this.e.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.al.e(null);
        this.d.a().ac(this.ap);
        this.ah.a(this);
        this.aq.b();
        super.u();
    }

    public final void w() {
        Nz(null);
        aJ();
    }
}
