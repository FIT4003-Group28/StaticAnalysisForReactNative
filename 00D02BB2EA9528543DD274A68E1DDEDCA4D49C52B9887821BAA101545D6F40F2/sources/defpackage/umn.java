package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.text.Html;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: umn  reason: default package */
/* loaded from: classes7.dex */
public class umn extends umg implements ume {
    private static final cqtd d = cqrt.h(2131232228, ibm.t());
    private static final cqtd e = cqtt.h(cqrt.h(2131231715, ibm.V()), 1.2f);
    private static final cqtd f = cqrt.h(2131231715, ibm.t());
    private static final cqtd g = iut.a(cqtt.h(iup.c(R.raw.transfer, ibm.t()), 0.8f));
    private static final cqtd h = cqrt.g(2131232505, ibm.c());
    private static final cqtd i = cqrt.g(2131232508, ibm.c());
    private final Activity j;
    private final dpdy k;
    private final List<umb> l;
    private Boolean m;

    public umn(Activity activity, cqhn cqhnVar, dxio<bwsh> dxioVar, vtn vtnVar, qbv qbvVar, dpdy dpdyVar, boolean z, boolean z2, List<umb> list) {
        super(cqhnVar, dxioVar, vtnVar, qbvVar, z, z2);
        this.m = false;
        this.j = activity;
        this.k = dpdyVar;
        this.l = list;
        dphe dpheVar = dpdyVar.e;
        String str = null;
        if (((dpheVar == null ? dphe.x : dpheVar).a & 256) != 0) {
            dphe dpheVar2 = dpdyVar.e;
            dpce dpceVar = (dpheVar2 == null ? dphe.x : dpheVar2).i;
            dpceVar = dpceVar == null ? dpce.f : dpceVar;
            dquc dqucVar = dquc.SVG;
            douj e2 = alcf.e(dpceVar);
            if (e2 != null) {
                Iterator<doui> it = e2.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    doui next = it.next();
                    dquc b = dquc.b(next.c);
                    if (b == null) {
                        b = dquc.PNG;
                        continue;
                    }
                    if (b == dqucVar) {
                        str = next.b;
                        break;
                    }
                }
            }
        }
        if (str != null) {
            B(str, false);
        } else {
            this.c = d;
        }
    }

    @dzsi
    private static CharSequence C(@dzsi String str, boolean z, Resources resources) {
        if (dbsj.d(str)) {
            return null;
        }
        bvsx bvsxVar = new bvsx(resources);
        bvsu c = bvsxVar.c(true != z ? R.string.TRANSIT_EXIT_VIA : R.string.TRANSIT_ENTER_VIA);
        c.a(bvsxVar.a(str).c());
        return c.c();
    }

    @Override // defpackage.umg, defpackage.umc
    public /* bridge */ /* synthetic */ Boolean a() {
        return super.a();
    }

    @Override // defpackage.umg, defpackage.umc
    public /* bridge */ /* synthetic */ Boolean b() {
        return super.b();
    }

    @Override // defpackage.umg, defpackage.umc
    public /* bridge */ /* synthetic */ void c(dwfl dwflVar) {
        super.c(dwflVar);
    }

    @Override // defpackage.umg, defpackage.umc
    public /* bridge */ /* synthetic */ Boolean d() {
        return super.d();
    }

    @Override // defpackage.umg, defpackage.umc
    @dzsi
    public /* bridge */ /* synthetic */ jic e() {
        return super.e();
    }

    @Override // defpackage.umg, defpackage.umc
    public /* bridge */ /* synthetic */ cqkl f() {
        return super.f();
    }

    @Override // defpackage.umc
    public CharSequence g() {
        Activity activity = this.j;
        Object[] objArr = new Object[1];
        dphe dpheVar = this.k.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        dpgw dpgwVar = dpheVar.d;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        objArr[0] = dpgwVar.b;
        return activity.getString(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_STREETVIEW, objArr);
    }

    @Override // defpackage.umc
    @dzsi
    public cqtd h() {
        return this.c;
    }

    @Override // defpackage.umg, defpackage.umc
    public /* bridge */ /* synthetic */ Boolean i() {
        return super.i();
    }

    @Override // defpackage.ume
    public CharSequence j() {
        View findViewById;
        dpdv dpdvVar = this.k.m;
        if (dpdvVar == null) {
            dpdvVar = dpdv.e;
        }
        if (dpdvVar.b.size() > 0) {
            alcb a = alcc.a();
            a.a = this.j;
            View o = cqkx.o(this);
            Integer num = null;
            if (o != null && (findViewById = o.findViewById(p().intValue())) != null) {
                num = Integer.valueOf((findViewById.getWidth() * 8) / 10);
            }
            a.g = num;
            alcc a2 = a.a();
            dpdv dpdvVar2 = this.k.m;
            if (dpdvVar2 == null) {
                dpdvVar2 = dpdv.e;
            }
            return a2.b(dpdvVar2.b);
        }
        dpdv dpdvVar3 = this.k.m;
        if (dpdvVar3 == null) {
            dpdvVar3 = dpdv.e;
        }
        return Html.fromHtml(dpdvVar3.a);
    }

    @Override // defpackage.ume
    public CharSequence k() {
        dpdv dpdvVar = this.k.m;
        if (dpdvVar == null) {
            dpdvVar = dpdv.e;
        }
        return Html.fromHtml(dpdvVar.c);
    }

    @Override // defpackage.ume
    public cqtd l() {
        return this.a.booleanValue() ? e : f;
    }

    @Override // defpackage.ume
    public String m() {
        dpdv dpdvVar = this.k.m;
        if (dpdvVar == null) {
            dpdvVar = dpdv.e;
        }
        return dpdvVar.d;
    }

    @Override // defpackage.ume
    public cqtd n() {
        return g;
    }

    @Override // defpackage.ume
    public cqss o() {
        dphe dpheVar = this.k.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        return ycz.b(dpheVar.l.get(0));
    }

    @Override // defpackage.ume
    public Integer p() {
        return Integer.valueOf((int) R.id.informal_transit_step_text);
    }

    @Override // defpackage.ume
    @dzsi
    public CharSequence q() {
        dphe dpheVar = this.k.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        dpgw dpgwVar = dpheVar.c;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        return C(dpgwVar.l, true, this.j.getResources());
    }

    @Override // defpackage.ume
    @dzsi
    public CharSequence r() {
        dphe dpheVar = this.k.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        dpgw dpgwVar = dpheVar.d;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        return C(dpgwVar.l, false, this.j.getResources());
    }

    @Override // defpackage.ume
    public CharSequence s() {
        Activity activity = this.j;
        Object[] objArr = new Object[1];
        dphe dpheVar = this.k.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        objArr[0] = Integer.valueOf(dpheVar.e);
        return activity.getString(R.string.INFORMAL_TRANSIT_INTERMEDIATE_STOPS, objArr);
    }

    @Override // defpackage.ume
    public cqtd t() {
        return w().booleanValue() ? i : h;
    }

    @Override // defpackage.ume
    public List<umb> u() {
        return this.l;
    }

    @Override // defpackage.ume
    public Integer v() {
        dphe dpheVar = this.k.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        return Integer.valueOf(dpheVar.e);
    }

    @Override // defpackage.ume
    public Boolean w() {
        return this.m;
    }

    @Override // defpackage.ume
    public cqkl x() {
        this.m = Boolean.valueOf(!this.m.booleanValue());
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.ume
    @dzsi
    public cqtd y() {
        dphe dpheVar = this.k.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        dpjb dpjbVar = dpheVar.t;
        if (dpjbVar == null) {
            dpjbVar = dpjb.e;
        }
        dpzb dpzbVar = dpjbVar.c;
        if (dpzbVar == null) {
            dpzbVar = dpzb.d;
        }
        dpyy b = dpyy.b(dpzbVar.c);
        if (b == null) {
            b = dpyy.OCCUPANCY_RATE_UNKNOWN;
        }
        return xkn.c(b);
    }

    @Override // defpackage.ume
    @dzsi
    public CharSequence z() {
        dphe dpheVar = this.k.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        dpjb dpjbVar = dpheVar.t;
        if (dpjbVar == null) {
            dpjbVar = dpjb.e;
        }
        dpzb dpzbVar = dpjbVar.c;
        if (dpzbVar == null) {
            dpzbVar = dpzb.d;
        }
        return xkn.d(dpzbVar, this.j);
    }
}
