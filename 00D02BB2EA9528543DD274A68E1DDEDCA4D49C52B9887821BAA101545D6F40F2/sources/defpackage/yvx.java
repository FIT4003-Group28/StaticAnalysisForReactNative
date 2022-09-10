package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: yvx  reason: default package */
/* loaded from: classes7.dex */
public class yvx implements yvp {
    public final qbt a;
    public final bvsl b;
    public final akqi c;
    public final drij d;
    public final qdi e;
    public String f = "";
    @dzsi
    public cqtd g;
    @dzsi
    public dbty<Boolean> h;
    private final Activity i;
    private final List<yvs> j;
    private final boolean k;
    private final int l;
    private final dcdc<dpce> m;
    @dzsi
    private final xiv n;
    @dzsi
    private final doza o;
    @dzsi
    private final cjtd p;
    private final ddho q;
    private final ddho r;

    public yvx(Activity activity, qbt qbtVar, bvsl bvslVar, akqi akqiVar, drij drijVar, List<yvs> list, boolean z, int i, dcdc<dpce> dcdcVar, dcdc<dpce> dcdcVar2, ddho ddhoVar, ddho ddhoVar2, @dzsi xiv xivVar, @dzsi doza dozaVar, @dzsi String str) {
        this.i = activity;
        this.a = qbtVar;
        this.c = akqiVar;
        this.b = bvslVar;
        this.d = drijVar;
        this.j = dcdc.r(list);
        this.k = z;
        this.l = i;
        this.e = qdi.a(dcdcVar);
        this.m = dcdcVar2;
        this.q = ddhoVar;
        this.r = ddhoVar2;
        this.n = xivVar;
        this.o = true != alca.y(dozaVar, doza.INFORMATION) ? null : dozaVar;
        cjta b = cjtd.b();
        b.d = dtyc.dK;
        if (str != null) {
            b.g(str);
        }
        this.p = b.a();
    }

    @Override // defpackage.yvn
    public int a() {
        return this.l;
    }

    @Override // defpackage.yvn
    public dcdc<String> b() {
        dccx F = dcdc.F();
        for (yvs yvsVar : this.j) {
            yvt b = yvsVar.b();
            if (b != null) {
                F.g(dbsj.e(b.h()));
            }
            F.i(dcbg.b(yvsVar.c()).s(yvw.a));
        }
        return F.f();
    }

    @Override // defpackage.yvn
    public drij c() {
        return this.d;
    }

    @Override // defpackage.yvn
    @dzsi
    public cqtd d() {
        return this.g;
    }

    @Override // defpackage.yvp
    public String e() {
        return this.d.b;
    }

    @Override // defpackage.yvp
    public List<yvs> f() {
        return this.j;
    }

    @Override // defpackage.yvp
    public Boolean g() {
        dbty<Boolean> dbtyVar = this.h;
        return Boolean.valueOf(dbtyVar != null ? dbtyVar.a().booleanValue() : false);
    }

    @Override // defpackage.yvp
    @dzsi
    public zcv h() {
        zcv a = this.n.a();
        if (a == null || !a.a().equals(doza.INFORMATION)) {
            return a;
        }
        return null;
    }

    public int hashCode() {
        Object[] objArr = new Object[1];
        dpsn dpsnVar = this.d.c;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        objArr[0] = dpsnVar;
        return Arrays.hashCode(objArr);
    }

    @Override // defpackage.yvp
    @dzsi
    public String i() {
        if (this.j.isEmpty()) {
            return this.i.getString(R.string.TRANSIT_SEEKER_NO_UPCOMING_DEPARTURES_TEXT);
        }
        return null;
    }

    @Override // defpackage.yvp
    public String j() {
        if (g().booleanValue()) {
            return this.i.getString(R.string.TRANSIT_SEEKER_LINE_STATION_TAB_ACTIVATED_STATUS_TEXT, new Object[]{e()});
        }
        return this.i.getString(R.string.TRANSIT_SEEKER_LINE_STATION_TAB_INACTIVATED_STATUS_TEXT, new Object[]{e()});
    }

    @Override // defpackage.yvp
    @dzsi
    public cqtd k() {
        doza dozaVar = this.o;
        if (dozaVar == null) {
            return null;
        }
        return cqrt.f(alca.b(dozaVar));
    }

    @Override // defpackage.yvp
    @dzsi
    public String l() {
        doza dozaVar = this.o;
        if (dozaVar == null) {
            return null;
        }
        return alca.h(this.i, dozaVar);
    }

    @Override // defpackage.yvp
    @dzsi
    public cjtd m() {
        return this.p;
    }

    public boolean n() {
        return this.k;
    }

    public ddho o() {
        return this.q;
    }

    public void p() {
        if (!this.j.isEmpty()) {
            ((yvs) dcft.s(this.j)).m(cqrp.d(75.0d));
            ((yvs) dcft.s(this.j)).k(cqrp.d(18.0d));
        }
    }

    @dzsi
    public String q() {
        return this.f;
    }

    @Override // defpackage.yvn
    public dcdc<dpce> r() {
        return this.m;
    }

    @Override // defpackage.yvn
    public String s() {
        return null;
    }

    @Override // defpackage.yvn
    public void t() {
    }

    @Override // defpackage.yvn
    public void u() {
    }

    @Override // defpackage.yvn
    @dzsi
    public cjtd v() {
        return cjtd.a(this.r);
    }

    @Override // defpackage.yvn
    public long w() {
        return 0L;
    }

    @Override // defpackage.yvn
    public yvm x() {
        return yvm.DRAW_ALL;
    }

    public dcep<String> y() {
        return dcbg.b(f()).s(yvv.a).B();
    }

    public int z(dpum dpumVar) {
        akqq f = akqq.f(dpumVar);
        dpum dpumVar2 = this.d.d;
        if (dpumVar2 == null) {
            dpumVar2 = dpum.d;
        }
        return (int) akqo.e(f, akqq.f(dpumVar2));
    }
}
