package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import com.google.android.apps.maps.R;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: ygt  reason: default package */
/* loaded from: classes7.dex */
public class ygt implements yfs {
    private static final xiv i = new ygn();
    private static final dcqe j = dcqe.c("ygt");
    public float a;
    public final Activity b;
    public final cqat c;
    public final cqkn<yfr> d;
    public djxn e;
    public final dcdc<ygs> f;
    @dzsi
    public final drhn g;
    @dzsi
    public cqtd h;
    private final cqss k;
    @dzsi
    private final jhk l;
    private final xiy m;
    private final cjtd n;
    @dzsi
    private final CharSequence o;
    private final dcdc<xhv> p;
    private final vtk q = new ygo(this);

    public ygt(Activity activity, cqat cqatVar, xiy xiyVar, xhx xhxVar, cqhn cqhnVar, xaz xazVar, djxn djxnVar, @dzsi CharSequence charSequence, int i2, cqkn<yfr> cqknVar, ygj ygjVar) {
        cqss w;
        this.b = activity;
        this.c = cqatVar;
        this.m = xiyVar;
        this.d = cqknVar;
        dphe dpheVar = djxnVar.b;
        this.p = dcbg.b(dcbg.b((dpheVar == null ? dphe.x : dpheVar).l).s(ygk.a).t(ygl.a).B()).s(new ygp(xhxVar)).z();
        this.e = djxnVar;
        this.o = charSequence;
        dphe dpheVar2 = djxnVar.b;
        if (((dpheVar2 == null ? dphe.x : dpheVar2).a & 16) == 0) {
            w = ibm.w();
        } else {
            dphe dpheVar3 = djxnVar.b;
            w = cqta.d(Color.parseColor((dpheVar3 == null ? dphe.x : dpheVar3).f));
        }
        this.k = w;
        dccx F = dcdc.F();
        dphe dpheVar4 = djxnVar.b;
        dphe dpheVar5 = dpheVar4 == null ? dphe.x : dpheVar4;
        dpgw dpgwVar = dpheVar5.c;
        F.g(new ygs(this, dpgwVar == null ? dpgw.r : dpgwVar, ygjVar, 0, o(djxnVar, 0)));
        int i3 = 0;
        while (i3 < dpheVar5.j.size()) {
            int i4 = i3 + 1;
            F.g(new ygs(this, dpheVar5.j.get(i3), ygjVar, i4, o(djxnVar, i4)));
            i3 = i4;
        }
        dpgw dpgwVar2 = dpheVar5.d;
        boolean z = true;
        F.g(new ygs(this, dpgwVar2 == null ? dpgw.r : dpgwVar2, ygjVar, dpheVar5.j.size() + 1, o(djxnVar, dpheVar5.j.size() + 1)));
        dcdc<ygs> f = F.f();
        this.f = f;
        dphe dpheVar6 = djxnVar.b;
        this.l = vyb.T(dpheVar6 == null ? dphe.x : dpheVar6, vtj.TRANSIT_AUTO);
        cjta b = cjtd.b();
        b.d = dtyc.dw;
        b.i(i2);
        this.n = b.a();
        this.a = r(cqatVar, f);
        dphe dpheVar7 = djxnVar.b;
        String str = (dpheVar7 == null ? dphe.x : dpheVar7).m;
        dphe dpheVar8 = djxnVar.b;
        dpjb dpjbVar = (dpheVar8 == null ? dphe.x : dpheVar8).t;
        drhn i5 = xazVar.i(str, dpjbVar == null ? dpjb.e : dpjbVar);
        this.g = i5;
        drhh b2 = i5 != null ? xazVar.b(i5) : null;
        if (i5 == null || b2 == null) {
            this.h = null;
        } else {
            this.h = xazVar.c(b2, (!xaz.h(i5) || !xazVar.f()) ? false : z, false, this.q);
        }
    }

    @dzsi
    public static Float m(dclz<Float> dclzVar, dclz<Integer> dclzVar2, float f) {
        if (dclzVar.o().floatValue() - dclzVar.n().floatValue() <= 0.0f || !dclzVar.a(Float.valueOf(f))) {
            return null;
        }
        return Float.valueOf(dclzVar2.n().intValue() + ((dclzVar2.o().intValue() - dclzVar2.n().intValue()) * ((f - dclzVar.n().floatValue()) / (dclzVar.o().floatValue() - dclzVar.n().floatValue()))));
    }

    private final xiv o(djxn djxnVar, int i2) {
        if (i2 != djxnVar.e) {
            return i;
        }
        CharSequence charSequence = this.o;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if ((djxnVar.a & 2) == 0) {
            linkedHashSet.addAll(GmmNotice.g(djxnVar.c));
            return this.m.a(dcdc.r(linkedHashSet), charSequence, cjtd.a(dtyc.dq));
        }
        xiy xiyVar = this.m;
        dozz dozzVar = djxnVar.d;
        if (dozzVar == null) {
            dozzVar = dozz.y;
        }
        GmmNotice f = GmmNotice.f(dozzVar);
        dcdc<GmmNotice> g = GmmNotice.g(djxnVar.c);
        cjtd a = cjtd.a(dtyc.dq);
        eeu a2 = xiyVar.a.a();
        xiy.b(a2, 1);
        dxio a3 = ((dxjh) xiyVar.b).a();
        xiy.b(a3, 2);
        zrt a4 = xiyVar.d.a();
        xiy.b(a4, 3);
        xiy.b(f, 4);
        xiy.b(g, 5);
        return new xix(a2, a3, a4, f, g, charSequence, a);
    }

    private final void p(int i2, dpgw dpgwVar) {
        ygs ygsVar = this.f.get(i2);
        if (ygsVar.a.n.equals(dpgwVar.n)) {
            ygsVar.l(dpgwVar);
        } else {
            bvoo.h("Stops don't match.", new Object[0]);
        }
    }

    @dzsi
    private static Integer q(dcdc<? extends yfr> dcdcVar, dcdc<? extends yfr> dcdcVar2, yfr yfrVar) {
        dbsk.a(dcdcVar.size() >= dcdcVar2.size());
        Integer num = null;
        int i2 = 0;
        for (int i3 = 0; i3 < dcdcVar.size(); i3++) {
            yfr yfrVar2 = dcdcVar.get(i3);
            if (i2 >= dcdcVar2.size()) {
                return null;
            }
            if (dbsd.a(yfrVar2.c(), dcdcVar2.get(i2).c())) {
                if (dcdcVar2.get(i2).equals(yfrVar)) {
                    return Integer.valueOf(i3);
                }
                num = Integer.valueOf(i2);
                i2++;
            }
            if (yfrVar2.equals(yfrVar)) {
                return num;
            }
        }
        return null;
    }

    private static float r(cqat cqatVar, List<ygs> list) {
        int intValue;
        dcdc z = dcbg.b(list).o(ygm.a).z();
        eapd eapdVar = new eapd(cqatVar.b());
        if (z.size() < 2) {
            return Float.NaN;
        }
        int i2 = 0;
        eaqc ab = ((ygs) z.get(0)).ab();
        dbsk.s(ab);
        if (eapdVar.x(ab)) {
            return 0.0f;
        }
        eaqc ab2 = ((ygs) dcft.s(z)).ab();
        dbsk.s(ab2);
        if (eapdVar.w(ab2)) {
            return Float.NaN;
        }
        eaqc o = ((ygs) dcft.s(z)).o();
        dbsk.s(o);
        if (eapdVar.x(o)) {
            while (i2 < z.size() - 1) {
                ygs ygsVar = (ygs) z.get(i2);
                i2++;
                ygs ygsVar2 = (ygs) z.get(i2);
                eaqc ab3 = ygsVar.ab();
                dbsk.s(ab3);
                eaqc o2 = ygsVar2.o();
                dbsk.s(o2);
                if (!eapdVar.x(ab3)) {
                    if (eapdVar.x(o2)) {
                        eaow eaowVar = new eaow(ab3, eapdVar);
                        eaow eaowVar2 = new eaow(ab3, o2);
                        if (eaowVar2.q(eaow.d(1L))) {
                            eaowVar2.toString();
                        }
                        long g = eaowVar.g();
                        long g2 = eaowVar2.g();
                        int i3 = ygsVar.b;
                        return i3 + ((ygsVar2.b - i3) * (((float) g) / ((float) g2)));
                    }
                } else {
                    intValue = ygsVar.b;
                }
            }
            return Float.NaN;
        }
        intValue = ((ygs) dcft.s(z)).e().intValue();
        return intValue;
    }

    @Override // defpackage.yfs
    public cjtd a() {
        return this.n;
    }

    @Override // defpackage.yfs
    public boolean b(djxn djxnVar) {
        dphe dpheVar = djxnVar.b;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        String str = dpheVar.m;
        dphe dpheVar2 = this.e.b;
        if (dpheVar2 == null) {
            dpheVar2 = dphe.x;
        }
        boolean equals = str.equals(dpheVar2.m);
        int i2 = 0;
        if (equals) {
            dphe dpheVar3 = djxnVar.b;
            if (dpheVar3 == null) {
                dpheVar3 = dphe.x;
            }
            int size = dpheVar3.j.size();
            dphe dpheVar4 = this.e.b;
            if (dpheVar4 == null) {
                dpheVar4 = dphe.x;
            }
            if (size == dpheVar4.j.size()) {
                dphe dpheVar5 = djxnVar.b;
                if (dpheVar5 == null) {
                    dpheVar5 = dphe.x;
                }
                dpgw dpgwVar = dpheVar5.c;
                if (dpgwVar == null) {
                    dpgwVar = dpgw.r;
                }
                p(0, dpgwVar);
                while (true) {
                    dphe dpheVar6 = djxnVar.b;
                    if (dpheVar6 == null) {
                        dpheVar6 = dphe.x;
                    }
                    if (i2 >= dpheVar6.j.size()) {
                        break;
                    }
                    int i3 = i2 + 1;
                    dphe dpheVar7 = djxnVar.b;
                    if (dpheVar7 == null) {
                        dpheVar7 = dphe.x;
                    }
                    p(i3, dpheVar7.j.get(i2));
                    i2 = i3;
                }
                int size2 = this.f.size() - 1;
                dphe dpheVar8 = djxnVar.b;
                if (dpheVar8 == null) {
                    dpheVar8 = dphe.x;
                }
                dpgw dpgwVar2 = dpheVar8.d;
                if (dpgwVar2 == null) {
                    dpgwVar2 = dpgw.r;
                }
                p(size2, dpgwVar2);
                this.e = djxnVar;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yfs
    public dcdc<? extends yfr> c() {
        return this.f;
    }

    @Override // defpackage.yfs
    @dzsi
    public jhk d() {
        return this.l;
    }

    @Override // defpackage.yfs
    public void e() {
        float r = r(this.c, this.f);
        if (!Float.isNaN(r)) {
            double d = r;
            cqkx.p(this.f.get((int) Math.floor(d)));
            cqkx.p(this.f.get((int) Math.ceil(d)));
        } else if (!Float.isNaN(this.a)) {
            cqkx.p(this);
        }
        this.a = r;
    }

    @Override // defpackage.yfs
    public Integer f() {
        return Integer.valueOf(this.e.e);
    }

    @Override // defpackage.yfs
    @dzsi
    public Integer g() {
        djxn djxnVar = this.e;
        if ((djxnVar.a & 8) != 0) {
            return Integer.valueOf(djxnVar.f);
        }
        return null;
    }

    @Override // defpackage.yfs
    public Integer h() {
        return Integer.valueOf(this.f.size());
    }

    @Override // defpackage.yfs
    @dzsi
    public Integer i() {
        aag n = n();
        if (n != null) {
            return Integer.valueOf(n.ad());
        }
        return null;
    }

    @Override // defpackage.yfs
    public void j(yfs yfsVar) {
        Integer q;
        if (equals(yfsVar)) {
            return;
        }
        Integer i2 = yfsVar.i();
        aag n = n();
        dcdc<? extends yfr> c = yfsVar.c();
        if (i2 == null || n == null || i2.intValue() < 0 || i2.intValue() >= c.size()) {
            return;
        }
        yfr yfrVar = c.get(i2.intValue());
        if (this.f.size() >= yfsVar.c().size()) {
            q = q(this.f, yfsVar.c(), yfrVar);
        } else {
            q = q(yfsVar.c(), this.f, yfrVar);
        }
        if (q == null) {
            q = Integer.valueOf(this.e.e);
        }
        n.P(q.intValue(), 0);
    }

    @Override // defpackage.yfs
    public cqss k() {
        return this.k;
    }

    @Override // defpackage.yfs
    public dcdc<xhv> l() {
        return this.p;
    }

    @dzsi
    final aag n() {
        RecyclerView recyclerView;
        View o = cqkx.o(this);
        if (o == null || (recyclerView = (RecyclerView) o.findViewById(R.id.transit_line_departures_list)) == null) {
            return null;
        }
        return (aag) recyclerView.l;
    }
}
