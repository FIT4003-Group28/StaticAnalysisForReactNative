package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.views.map.MapViewContainer;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bpyt  reason: default package */
/* loaded from: classes4.dex */
public final class bpyt extends ges implements egq {
    public bpzy a;
    public efg ad;
    public bomt ae;
    public bpsq af;
    public cpv ag;
    public bpzb ah;
    public akzh ai;
    @dzsi
    private bpzx aj;
    @dzsi
    private bqgw ak;
    @dzsi
    private cqkf<bqik> al;
    @dzsi
    private bomu am;
    private bpza an;
    @dzsi
    private hwb ao;
    public dzsj<ache> b;
    public bnyj c;
    public bvrb d;
    public akpm e;
    public hwe f;
    public cqkj g;

    public static bpyt g(bqgw bqgwVar) {
        dbsk.b(!bqgwVar.f().isEmpty(), "model must contain at least one point");
        Bundle bundle = new Bundle();
        i(bundle, bqgwVar, bomu.NAME);
        bpyt bpytVar = new bpyt();
        bpytVar.B(bundle);
        return bpytVar;
    }

    private static void i(Bundle bundle, bqgw bqgwVar, @dzsi bomu bomuVar) {
        bqhw bZ = bqhx.d.bZ();
        bqhm c = bqgwVar.c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bqhx bqhxVar = (bqhx) bZ.b;
        bqhv bK = c.bK();
        bK.getClass();
        bqhxVar.b = bK;
        bqhxVar.a |= 1;
        if (bomuVar != null) {
            int i = bomuVar.i;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bqhx bqhxVar2 = (bqhx) bZ.b;
            bqhxVar2.a |= 2;
            bqhxVar2.c = i;
        }
        bvrs.k(bundle, "state", bZ.bK());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ges
    public final void Oo(View view) {
        if (this.aD) {
            this.ag.f(view, H().getString(R.string.MISSING_ROAD_DETAILS_TITLE));
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<bqik> cqkfVar = this.al;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.al = null;
        }
        super.Qe();
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        cqkf<bqik> cqkfVar = this.al;
        dbsk.s(cqkfVar);
        MapViewContainer mapViewContainer = (MapViewContainer) cqkx.e(cqkfVar.c(), bqik.i, MapViewContainer.class);
        if (mapViewContainer != null) {
            bqgw bqgwVar = this.ak;
            dbsk.s(bqgwVar);
            List<akqq> f = bqgwVar.f();
            akqr a = akqs.a();
            for (akqq akqqVar : f) {
                a.d(akqqVar);
            }
            akqs b = a.b();
            double l = akqo.l(b, (int) (mapViewContainer.getHeight() * 0.8f), (int) (mapViewContainer.getWidth() * 0.8f), this.ai.B());
            akpm akpmVar = this.e;
            akyc i = akyt.i(b.c(), (float) l);
            i.b = 0;
            akpmVar.p(i);
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<bqik> c = this.g.c(new bqej(), null);
        this.al = c;
        bpzx bpzxVar = this.aj;
        dbsk.s(bpzxVar);
        c.e(bpzxVar);
        cqkf<bqik> cqkfVar = this.al;
        dbsk.s(cqkfVar);
        return cqkfVar.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        hwb hwbVar = this.ao;
        if (hwbVar != null) {
            this.f.j(hwbVar);
        }
        boms.a(this.d, this.b.a());
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        bpzx bpzxVar = this.aj;
        return bpzxVar != null && bpzxVar.g.a(bpzxVar.i());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        bqhx bqhxVar = (bqhx) bvrs.f(bundle != null ? bundle : this.o, "state", (dssr) bqhx.d.cu(7));
        dbsk.s(bqhxVar);
        bqhv bqhvVar = bqhxVar.b;
        if (bqhvVar == null) {
            bqhvVar = bqhv.i;
        }
        this.ak = bqgw.a(bqhvVar);
        if ((bqhxVar.a & 2) != 0) {
            this.am = bomu.a(bqhxVar.c);
        }
        this.b.a().t(true);
        bpzy bpzyVar = this.a;
        bqgw bqgwVar = this.ak;
        dbsk.s(bqgwVar);
        bomt bomtVar = this.ae;
        dzsj<boxa> dzsjVar = bpzyVar.a;
        bpyh a = bpzyVar.b.a();
        bpzy.a(a, 2);
        bnyd a2 = bpzyVar.c.a();
        bpzy.a(a2, 3);
        ff ffVar = (ff) ((dxjd) bpzyVar.d).a;
        bpzy.a(ffVar, 4);
        bpzy.a(bpzyVar.e.a(), 5);
        cqhn a3 = bpzyVar.f.a();
        bpzy.a(a3, 6);
        eeu a4 = bpzyVar.g.a();
        bpzy.a(a4, 7);
        bpto a5 = bpzyVar.h.a();
        bpzy.a(a5, 8);
        acwo a6 = bpzyVar.i.a();
        bpzy.a(a6, 9);
        bvrb a7 = bpzyVar.j.a();
        bpzy.a(a7, 10);
        booa a8 = bpzyVar.k.a();
        bpzy.a(a8, 11);
        bpzy.a(bqgwVar, 12);
        bpzy.a(bomtVar, 13);
        this.aj = new bpzx(dzsjVar, a, a2, ffVar, a3, a4, a5, a6, a7, a8, bqgwVar, bomtVar);
        bqgw bqgwVar2 = this.ak;
        dbsk.s(bqgwVar2);
        List<akqq> f = bqgwVar2.f();
        if (f.size() == 1) {
            this.ao = this.f.i(akpp.o(f.get(0)), true);
        } else {
            bpzb bpzbVar = this.ah;
            bqgw bqgwVar3 = this.ak;
            dbsk.s(bqgwVar3);
            this.an = bpzbVar.a(bqgwVar3, bpyy.LINE_ONLY);
        }
        this.af.d(bundle);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.cp;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.c.a(this);
        bpsq bpsqVar = this.af;
        bpso c = bpsp.c();
        c.b(true);
        bpsqVar.a(c.a());
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.e(this);
        bpza bpzaVar = this.an;
        if (bpzaVar == null) {
            akpm akpmVar = this.e;
            bqgw bqgwVar = this.ak;
            dbsk.s(bqgwVar);
            akyc i = akyt.i(bqgwVar.f().get(0), 17.0f);
            i.b = 0;
            akpmVar.p(i);
        } else {
            bpzaVar.a();
            egjVar.J(this);
            egf a = egf.a();
            a.l = new afwn[]{afwn.e(afwm.BICYCLING, false), afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.TRANSIT, false)};
            a.h = ardz.NONE;
            egjVar.A(a);
        }
        this.ad.a(egjVar.a());
        if (this.am == bomu.NAME) {
            this.ae.b(bqik.j);
        } else if (this.am == bomu.OTHER_NOTES) {
            this.ae.b(bqik.l);
        } else {
            this.ae.a();
        }
        this.am = null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        bomu bomuVar;
        super.t(bundle);
        cqjg cqjgVar = this.ae.b;
        if (cqjgVar == bqik.j) {
            bomuVar = bomu.NAME;
        } else {
            bomuVar = cqjgVar == bqik.l ? bomu.OTHER_NOTES : null;
        }
        bqgw bqgwVar = this.ak;
        dbsk.s(bqgwVar);
        i(bundle, bqgwVar, bomuVar);
        this.af.c(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.af.b();
        bpza bpzaVar = this.an;
        if (bpzaVar != null) {
            bpzaVar.e();
        }
        super.u();
    }
}
