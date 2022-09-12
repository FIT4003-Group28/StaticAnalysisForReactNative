package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sqk  reason: default package */
/* loaded from: classes7.dex */
public class sqk implements sng {
    public static final /* synthetic */ int l = 0;
    private static final cjtd z;
    public final Activity a;
    @dzsi
    public final cpv b;
    @dzsi
    public dspd c;
    @dzsi
    public amvh d;
    @dzsi
    public final amvh e;
    public final String f;
    public final dxio<qbt> g;
    public boolean h;
    public final Runnable i;
    public boolean j;
    public boolean k;
    private final CharSequence m;
    @dzsi
    private final CharSequence n;
    private CharSequence o;
    private dcdc<zdu> p;
    @dzsi
    private zcv q;
    private final sps r;
    @dzsi
    private final cqhn s;
    @dzsi
    private final gga t;
    private final Executor u;
    private final dxio<wdt> v;
    private cjtd w;
    private cjtd x;
    private CharSequence y;

    static {
        cjta b = cjtd.b();
        b.d = dtyc.fQ;
        z = b.a();
    }

    public sqk(Activity activity, dxio<qbt> dxioVar, vxw vxwVar, btpc btpcVar, zuz zuzVar, zrt zrtVar, dxio<wdt> dxioVar2, cqhn cqhnVar, gga ggaVar, Executor executor, cpv cpvVar, bvjj bvjjVar, int i, sph sphVar, @dzsi dnvk dnvkVar, sps spsVar, Runnable runnable) {
        amvh b;
        zrs a;
        dpci dpciVar;
        dgaw dgawVar;
        dgaw dgawVar2;
        dpbw dpbwVar;
        this.o = "";
        this.p = dcdc.e();
        this.q = null;
        this.h = true;
        this.w = cjtd.b;
        this.x = cjtd.b;
        this.y = "";
        this.a = activity;
        this.g = dxioVar;
        this.v = dxioVar2;
        this.t = ggaVar;
        this.u = executor;
        this.b = cpvVar;
        this.f = sphVar.a().a();
        this.r = spsVar;
        this.s = cqhnVar;
        this.d = spsVar == sps.DIRECTIONS_LOCATION_DISABLED ? sphVar.a().b().a() : null;
        if (dnvkVar != null) {
            dpjx dpjxVar = dnvkVar.c;
            b = amvh.M(dpjxVar == null ? dpjx.n : dpjxVar, activity);
        } else {
            b = sphVar.a().b().b();
        }
        this.e = b;
        String a2 = spt.a(activity, sphVar, b);
        this.m = a2;
        dspd d = sphVar.a().b().d();
        dbsk.s(d);
        this.c = d;
        this.i = runnable;
        String b2 = sphVar.b();
        cjta b3 = cjtd.b();
        b3.d = dtyb.ao;
        b3.g(b2);
        b3.i(i);
        this.w = b3.a();
        cjta b4 = cjtd.b();
        b4.d = dtyb.an;
        b4.g(b2);
        b4.i(i);
        this.x = b4.a();
        if (spsVar == sps.DIRECTIONS_COMPLETELY_LOADED) {
            cjta b5 = cjtd.b();
            b5.d = dtyb.aq;
            b5.g(b2);
            b5.i(i);
            b5.a();
        }
        if (dnvkVar != null) {
            dnvj dnvjVar = dnvkVar.d;
            if (!(dnvjVar == null ? dnvj.c : dnvjVar).b.isEmpty()) {
                dnvj dnvjVar2 = dnvkVar.d;
                dnvi dnviVar = (dnvjVar2 == null ? dnvj.c : dnvjVar2).b.get(0);
                this.p = zsa.b(dnviVar.c, vtj.TRANSIT_AUTO);
                boolean isEmpty = dnviVar.g.isEmpty();
                this.h = isEmpty;
                this.j = (isEmpty && !spsVar.g) || bvjjVar.m(bvjk.kw, false);
                this.k = false;
                this.y = activity.getString(R.string.GO_TAB_UNPIN_BUTTON_CONTENT_DESC, new Object[]{a2});
                dozz dozzVar = dnviVar.h;
                doza b6 = doza.b((dozzVar == null ? dozz.y : dozzVar).e);
                if ((b6 == null ? doza.INFORMATION : b6) != doza.INFORMATION || this.h) {
                    dozz dozzVar2 = dnviVar.h;
                    GmmNotice f = GmmNotice.f(dozzVar2 == null ? dozz.y : dozzVar2);
                    boolean z2 = this.h;
                    cjta b7 = cjtd.b();
                    b7.d = z2 ? dtyb.ap : dtyb.am;
                    a = zrtVar.a(f, false, 0, b7.a(), null);
                } else {
                    a = null;
                }
                this.q = a;
                if (this.h) {
                    dbsk.s(a);
                    this.n = a.e();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (dnvh dnvhVar : dnviVar.g) {
                    if ((dnvhVar.a & 2) != 0) {
                        dpciVar = dnvhVar.c;
                        if (dpciVar == null) {
                            dpciVar = dpci.i;
                        }
                    } else {
                        dpciVar = null;
                    }
                    if (dpciVar == null || (dpciVar.a & 16) == 0) {
                        dgawVar = null;
                    } else {
                        dgawVar = dpciVar.e;
                        if (dgawVar == null) {
                            dgawVar = dgaw.g;
                        }
                    }
                    if (dpciVar == null || (dpciVar.a & 1) == 0) {
                        dgawVar2 = null;
                    } else {
                        dgawVar2 = dpciVar.b;
                        if (dgawVar2 == null) {
                            dgawVar2 = dgaw.g;
                        }
                    }
                    if ((dnvhVar.a & 1) != 0) {
                        int a3 = dnvg.a(dnvhVar.b);
                        int i2 = (a3 == 0 ? 1 : a3) - 1;
                        if (i2 == 1) {
                            dpbwVar = dpbw.ON_TIME;
                        } else if (i2 == 2) {
                            dpbwVar = dpbw.EARLY;
                        } else if (i2 != 3) {
                            dpbwVar = dpbw.UNKNOWN;
                        } else {
                            dpbwVar = dpbw.LATE;
                        }
                    } else {
                        dpbwVar = dpbw.UNKNOWN;
                    }
                    arrayList.add(new vwp(dgawVar, dgawVar2, dpbwVar));
                }
                dpbw dpbwVar2 = dpbw.UNKNOWN;
                Iterator it = dcft.v(arrayList, 2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    dpbw d2 = vxj.d((vwt) it.next());
                    if (d2 != dpbw.UNKNOWN) {
                        dpbwVar2 = d2;
                        break;
                    }
                }
                dpbwVar2 = !btpcVar.i() ? dpbw.UNKNOWN : dpbwVar2;
                dpgw dpgwVar = dnviVar.e;
                this.n = vyb.X(vxwVar, arrayList, null, (dpgwVar == null ? dpgw.r : dpgwVar).b, activity);
                bvsx bvsxVar = new bvsx(activity.getResources());
                dpci dpciVar2 = dnviVar.b;
                dgaw dgawVar3 = (dpciVar2 == null ? dpci.i : dpciVar2).f;
                bvsv a4 = bvsxVar.a(bvtb.h(activity, dgawVar3 == null ? dgaw.g : dgawVar3));
                a4.l(vxj.a(dpbwVar2, activity));
                this.o = a4.c();
                return;
            }
        }
        this.n = "";
    }

    @Override // defpackage.sng
    public dcdc<zdu> a() {
        return this.p;
    }

    @Override // defpackage.sng
    @dzsi
    public CharSequence b() {
        return this.n;
    }

    @Override // defpackage.sng
    @dzsi
    public zcv c() {
        return this.q;
    }

    @Override // defpackage.sng
    public cqtd d() {
        return cqrt.g(2131232304, ibl.H());
    }

    @Override // defpackage.sng
    public cqkl e() {
        if (this.j && !this.f.isEmpty()) {
            this.j = false;
            this.k = true;
            deha.q(this.v.a().b(this.f), new sqj(this), this.u);
            t();
        }
        return cqkl.a;
    }

    @Override // defpackage.sng
    public cjtd f() {
        return z;
    }

    @Override // defpackage.sng
    public CharSequence g() {
        return this.y;
    }

    @Override // defpackage.snf
    public CharSequence h() {
        return this.m;
    }

    public int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.snf
    public CharSequence i() {
        return this.o;
    }

    @Override // defpackage.snf
    public cjtd j() {
        return this.w;
    }

    @Override // defpackage.snf
    public cjtd k() {
        return this.x;
    }

    @Override // defpackage.snf
    public Boolean l() {
        return Boolean.valueOf(this.e != null);
    }

    @Override // defpackage.snf
    @dzsi
    public cqtd m() {
        return cqrt.f(alca.b(doza.INFORMATION));
    }

    @Override // defpackage.snf
    @dzsi
    public CharSequence n() {
        if (this.r != sps.DIRECTIONS_LOCATION_DISABLED) {
            return this.a.getText(R.string.SAVED_DATA_OFFLINE_TEXT);
        }
        return null;
    }

    @Override // defpackage.snf
    public CharSequence o() {
        return this.a.getText(R.string.SAVED_TRANSIT_DATA_ERROR_TEXT);
    }

    @Override // defpackage.snf
    public View.OnClickListener p() {
        return this.e == null ? sqh.a : new View.OnClickListener(this) { // from class: sqi
            private final sqk a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qbs qbsVar;
                sqk sqkVar = this.a;
                sqkVar.i.run();
                qbt a = sqkVar.g.a();
                qcw x = qcx.x();
                x.s(dqvj.TRANSIT);
                x.h(sqkVar.c);
                x.l(sqkVar.f);
                amvh amvhVar = sqkVar.d;
                if (amvhVar == null) {
                    amvhVar = amvh.i(sqkVar.a);
                }
                x.r(amvhVar);
                x.u(sqkVar.e);
                x.q(false);
                if (sqkVar.h) {
                    qbsVar = qbs.DEFAULT;
                } else {
                    qbsVar = qbs.TRANSIT_TRIP_DETAILS;
                }
                x.k(qbsVar);
                x.p(true);
                a.m(x.a());
            }
        };
    }

    @Override // defpackage.snf
    public Boolean q() {
        boolean z2 = true;
        if (this.r != sps.DIRECTIONS_ERROR && this.r != sps.DIRECTIONS_LOCATION_DISABLED) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    @Override // defpackage.sng
    public Boolean r() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.sng
    public Boolean s() {
        return Boolean.valueOf(this.k);
    }

    public final void t() {
        if (this.s != null) {
            cqkx.p(this);
        }
    }

    public final void u(int i) {
        gga ggaVar = this.t;
        if (ggaVar == null || !ggaVar.aZ) {
            return;
        }
        ckos.a(ggaVar.findViewById(16908290), this.t.getString(i), 0).c();
    }

    public sqk(Activity activity, dxio<qbt> dxioVar, dxio<wdt> dxioVar2, Executor executor) {
        this.o = "";
        this.p = dcdc.e();
        this.q = null;
        this.h = true;
        this.w = cjtd.b;
        this.x = cjtd.b;
        this.y = "";
        this.a = activity;
        this.g = dxioVar;
        this.v = dxioVar2;
        this.f = "";
        this.m = "";
        this.e = null;
        this.r = sps.TRIP_LOADING;
        this.s = null;
        this.n = "";
        this.j = false;
        this.k = false;
        this.y = "";
        this.t = null;
        this.b = null;
        this.u = executor;
        this.i = sqg.a;
    }
}
