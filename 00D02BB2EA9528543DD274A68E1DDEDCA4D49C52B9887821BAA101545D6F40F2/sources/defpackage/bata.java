package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bata  reason: default package */
/* loaded from: classes3.dex */
public class bata implements baqn {
    private final gga a;
    private final bakx b;
    private final batn c;
    private final bass d;
    private final barh e;
    private final axxe f;
    private final baql g;
    private final dcdc<baqe> h;
    private dcdc<baqk> i;

    public bata(gga ggaVar, cqhn cqhnVar, cqkj cqkjVar, axwg axwgVar, bass bassVar, barh barhVar, bakw bakwVar, batn batnVar, dxio<begg> dxioVar, dxio<axwo> dxioVar2, dxio<avik> dxioVar3, dxio<avij> dxioVar4, bakx bakxVar, axxe axxeVar) {
        this.a = ggaVar;
        this.b = bakxVar;
        this.c = batnVar;
        this.e = barhVar;
        this.d = bassVar;
        this.f = axxeVar;
        dsrj<drjp> dsrjVar = axxeVar.a().g;
        this.g = new basv(dsrjVar.isEmpty() ? "" : dsrjVar.get(0).a);
        dcdc z = dcbg.b(axxeVar.a().d).s(bast.a).z();
        if (axwgVar.d()) {
            btpc a = bakwVar.a.a();
            bakw.a(a, 1);
            bwqv a2 = bakwVar.b.a();
            bakw.a(a2, 2);
            befw a3 = bakwVar.c.a();
            bakw.a(a3, 3);
            dxio a4 = ((dxjh) bakwVar.d).a();
            bakw.a(a4, 4);
            bakw.a(z, 5);
            bakv bakvVar = new bakv(a, a2, a3, a4, z);
            this.h = dcdc.h(new baqu(z, ggaVar, cqhnVar, cqkjVar, bakvVar, dxioVar), new bare(z, ggaVar, cqhnVar, cqkjVar, bakvVar, dxioVar2, dxioVar), new baqz(z, ggaVar, cqhnVar, cqkjVar, bakvVar, dxioVar4, dxioVar3));
        } else {
            this.h = dcdc.e();
        }
        this.i = h(axxeVar.b());
    }

    private final dcdc<baqk> h(List<drjs> list) {
        dccx dccxVar = new dccx();
        int i = 0;
        while (i < list.size()) {
            int i2 = i - 1;
            drjs drjsVar = null;
            drjs drjsVar2 = i2 < 0 ? null : list.get(i2);
            drjs drjsVar3 = list.get(i);
            i++;
            if (i < list.size()) {
                drjsVar = list.get(i);
            }
            bass bassVar = this.d;
            bakx bakxVar = this.b;
            gga a = bassVar.a.a();
            bass.a(a, 1);
            cqhn a2 = bassVar.b.a();
            bass.a(a2, 2);
            bass.a(bassVar.c.a(), 3);
            gdc a3 = bassVar.d.a();
            bass.a(a3, 4);
            brvh a4 = bassVar.e.a();
            bass.a(a4, 5);
            bnjv a5 = bassVar.f.a();
            bass.a(a5, 6);
            bass.a(bakxVar, 7);
            bass.a(drjsVar3, 8);
            dccxVar.g(new basr(a, a2, a3, a4, a5, bakxVar, drjsVar3, drjsVar2, drjsVar));
        }
        return dccxVar.f();
    }

    @Override // defpackage.baqn
    public String a() {
        return this.f.a().c;
    }

    @Override // defpackage.baqn
    public String b() {
        if (this.f == axxe.a) {
            return "";
        }
        gga ggaVar = this.a;
        dpoj dpojVar = this.f.a().e;
        if (dpojVar == null) {
            dpojVar = dpoj.e;
        }
        dpoj dpojVar2 = this.f.a().f;
        if (dpojVar2 == null) {
            dpojVar2 = dpoj.e;
        }
        String o = batk.o(ggaVar, dpojVar, dpojVar2, 524312);
        return this.c.a(this.f.a()) ? this.a.getResources().getString(R.string.TRIP_CURRENT, o) : this.a.getResources().getString(R.string.TRIP_UPCOMING, o);
    }

    @Override // defpackage.baqn
    public baql c() {
        return this.g;
    }

    @Override // defpackage.baqn
    public List<baqe> d() {
        return this.h;
    }

    @Override // defpackage.baqn
    public cqkl e() {
        barh barhVar = this.e;
        gga a = barhVar.a.a();
        barh.a(a, 1);
        cqkj a2 = barhVar.b.a();
        barh.a(a2, 2);
        cklf a3 = barhVar.c.a();
        barh.a(a3, 3);
        new barg(a, a2, a3).d();
        return cqkl.a;
    }

    @Override // defpackage.baqn
    public List<baqk> f() {
        return this.i;
    }

    @Override // defpackage.baqn
    public void g(List<drjs> list) {
        this.i = h(list);
        cqkx.p(this);
    }
}
