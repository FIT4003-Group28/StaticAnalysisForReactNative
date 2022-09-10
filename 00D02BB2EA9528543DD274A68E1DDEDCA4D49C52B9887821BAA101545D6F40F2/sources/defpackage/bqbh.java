package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bqbh  reason: default package */
/* loaded from: classes4.dex */
public final class bqbh extends ges implements egq {
    public bqbn a;
    public bpsq ad;
    public araj ae;
    public bqbb af;
    public cpv ag;
    public bqdh ah;
    public akzh ai;
    private bqbm aj;
    private bqhg ak;
    @dzsi
    private cqkf<bqim> al;
    private bokk am;
    private bqba an;
    public dzsj<ache> b;
    public bnyj c;
    public bvrb d;
    public akpm e;
    public cqkj f;
    public efg g;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ges
    public final void Oo(View view) {
        if (this.aD) {
            this.ag.f(view, H().getString(R.string.MISSING_ROAD_DETAILS_TITLE));
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bqim> cqkfVar = this.al;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.al = null;
        }
        super.Qe();
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        int i;
        if (!this.ai.A().d()) {
            return;
        }
        akqr a = akqs.a();
        bqhg bqhgVar = this.ak;
        dbsk.s(bqhgVar);
        dcdc<bqgw> a2 = bqhgVar.a();
        int size = a2.size();
        int i2 = 0;
        while (i2 < size) {
            Iterator<akqq> it = a2.get(i2).f().iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    a.d(it.next());
                }
            }
            i2 = i;
        }
        akqs b = a.b();
        double l = akqo.l(b, (int) (this.ai.A().b() * 0.8f), (int) (this.ai.A().a() * 0.8f), this.ai.B());
        akpm akpmVar = this.e;
        akyc i3 = akyt.i(b.c(), (float) l);
        i3.b = 0;
        akpmVar.p(i3);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bqim> c = this.f.c(new bqgl(), null);
        this.al = c;
        bqbm bqbmVar = this.aj;
        dbsk.s(bqbmVar);
        c.e(bqbmVar);
        cqkf<bqim> cqkfVar = this.al;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        boms.a(this.d, this.b.a());
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        bqbm bqbmVar = this.aj;
        dbsk.s(bqbmVar);
        return bqbmVar.d();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        bokm bokmVar = (bokm) bvrs.f(bundle != null ? bundle : this.o, "NOTE_PROTO_KEY", (dssr) bokm.n.cu(7));
        dbsk.s(bokmVar);
        this.am = bokk.a(bokmVar);
        bqif bqifVar = (bqif) bvrs.f(this.o, "MODEL_PROTO_KEY", (dssr) bqif.f.cu(7));
        dbsk.s(bqifVar);
        dnqe dnqeVar = (dnqe) bvrs.g(this.o, "CLIENT_STATE_PROTO_KEY", (dssr) dnqe.i.cu(7), dnqe.i);
        this.ak = bqhg.f(bqifVar);
        this.b.a().t(true);
        bqbn bqbnVar = this.a;
        bokk bokkVar = this.am;
        bqhg bqhgVar = this.ak;
        bpyk a = bqbnVar.a.a();
        bqbn.a(a, 1);
        bnyd a2 = bqbnVar.b.a();
        bqbn.a(a2, 2);
        ff ffVar = (ff) ((dxjd) bqbnVar.c).a;
        bqbn.a(ffVar, 3);
        bqbn.a(bqbnVar.d.a(), 4);
        eeu a3 = bqbnVar.e.a();
        bqbn.a(a3, 5);
        bptg a4 = bqbnVar.f.a();
        bqbn.a(a4, 6);
        bpto a5 = bqbnVar.g.a();
        bqbn.a(a5, 7);
        booa a6 = bqbnVar.h.a();
        bqbn.a(a6, 8);
        bqbn.a(bokkVar, 9);
        bqbn.a(bqhgVar, 10);
        bqbn.a(dnqeVar, 11);
        this.aj = new bqbm(a, a2, ffVar, a3, a4, a5, a6, bokkVar, bqhgVar, dnqeVar);
        this.an = this.af.a(this.ak, new bqbg());
        this.ad.d(bundle);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.cx;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.c.a(this);
        bpsq bpsqVar = this.ad;
        bpso c = bpsp.c();
        c.b(true);
        bpsqVar.a(c.a());
        this.ae.m().e();
        this.ae.m().h(amwd.OFF);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.e(this);
        this.an.c();
        egjVar.J(this);
        egf a = egf.a();
        a.l = new afwn[]{afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.TRANSIT, false)};
        a.h = ardz.NONE;
        egjVar.A(a);
        this.g.a(egjVar.a());
        bqdh bqdhVar = this.ah;
        if (bqdhVar.b.a && bqdhVar.a.a()) {
            bqdhVar.a.b().c(bqdhVar);
        }
        bqhg bqhgVar = this.ak;
        if (bqhgVar != null) {
            dcdc<bqgw> a2 = bqhgVar.a();
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                bqdh bqdhVar2 = this.ah;
                List<akqq> f = a2.get(i).f();
                if (bqdhVar2.b.a) {
                    akqr a3 = akqs.a();
                    for (akqq akqqVar : f) {
                        a3.d(akqqVar);
                    }
                    akqs b = a3.b();
                    if (bqdhVar2.a.a()) {
                        bqdhVar2.c.addAll(bqdhVar2.a.b().a(dcdc.f(b)));
                    } else {
                        bqdhVar2.e = true;
                    }
                }
            }
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bvrs.k(bundle, "NOTE_PROTO_KEY", this.am.b().bK());
        this.ad.c(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ad.b();
        bqba bqbaVar = this.an;
        dbsk.s(bqbaVar);
        bqbaVar.e();
        bqdh bqdhVar = this.ah;
        if (bqdhVar.b.a && bqdhVar.a.a()) {
            bqdhVar.a.b().d(bqdhVar);
        }
        super.u();
    }
}
