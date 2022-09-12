package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wro  reason: default package */
/* loaded from: classes7.dex */
public class wro implements wpt {
    private static final dcqe i = dcqe.c("wro");
    public final Context a;
    public final btvo b;
    public final axyp c;
    public final boolean d;
    public final dxio<afha> e;
    public String f;
    public ilo g;
    private final begg j;
    private final axwy k;
    private final dxio<qbt> l;
    private final vtn m;
    private final akqi n;
    @dzsi
    private dopk o;
    @dzsi
    private djyo p;
    public cjtd h = cjtd.b;
    private final Set<Integer> q = new HashSet();

    public wro(Activity activity, dxio<qbt> dxioVar, begg beggVar, axwy axwyVar, dxio<afha> dxioVar2, vtn vtnVar, btvo btvoVar, axyp axypVar, ilo iloVar, akqi akqiVar, String str, boolean z) {
        this.a = activity;
        this.j = beggVar;
        this.k = axwyVar;
        this.c = axypVar;
        this.l = dxioVar;
        this.e = dxioVar2;
        this.m = vtnVar;
        this.n = akqiVar;
        this.b = btvoVar;
        this.g = iloVar;
        this.f = str;
        this.d = z;
    }

    private final Bitmap l(dopk dopkVar) {
        List<douj> i2 = albv.i(dopkVar);
        douj doujVar = i2.size() == 1 ? i2.get(0) : null;
        if (doujVar != null) {
            Drawable b = this.m.b(doujVar.c, vtj.TRANSIT_AUTO, null);
            if (b != null) {
                return yzi.e(b, cqrp.d(36.0d), this.a.getResources().getColor(R.color.qu_daynight_grey_100), cqrp.d(48.0d), this.a);
            }
            Bitmap d = yzi.d(dqvj.TRANSIT, this.a);
            dbsk.s(d);
            return d;
        }
        Bitmap d2 = yzi.d(dqvj.TRANSIT, this.a);
        dbsk.s(d2);
        return d2;
    }

    @Override // defpackage.wpt
    public List<wps> a() {
        dccx F = dcdc.F();
        if (this.d) {
            F.g(new wrk(this, cqrt.i(vyt.j, ibm.x()), this.a.getString(R.string.TRANSIT_STATION_MORE_INFO_ACTION_MENU_ITEM), cjqg.o(this.h, dtyc.eZ)));
        }
        F.g(new wri(this, cqrt.i(vyt.i, ibm.x()), this.a.getString(R.string.TRANSIT_STATION_ACTION_DIRECTIONS), cjqg.o(this.h, dtyc.eT)));
        if (this.d && this.b.getTransitPagesParameters().u && this.g.aj() != null) {
            axyo a = this.c.a(this.g);
            F.g(new wrj(this, a.c(), a.e().a(this.a), cjqg.o(this.h, dtyc.fd)));
        }
        if (f() && e()) {
            F.g(new wrm(this, cqrt.i(vyt.l, ibm.x()), this.a.getString(R.string.TRANSIT_STATION_CREATE_SHORTCUT_ACTION_MENU_ITEM), cjqg.o(this.h, dtyc.eL)));
        }
        if (d()) {
            F.g(new wrl(this, cqrt.i(vyt.k, ibm.x()), this.a.getString(R.string.TRANSIT_STATION_SCHEMATIC_MAP_ACTION_MENU_ITEM), cjqg.o(this.h, dtyc.ff)));
        }
        return F.f();
    }

    public void b(ilo iloVar) {
        this.g = iloVar;
    }

    public void c(dopk dopkVar) {
        this.f = dopkVar.b;
        this.p = null;
        this.q.clear();
        if ((dopkVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
            doou doouVar = dopkVar.q;
            if (doouVar == null) {
                doouVar = doou.h;
            }
            djyo b = wkd.b(doouVar);
            this.p = b;
            if (b != null) {
                for (djym djymVar : b.g) {
                    for (djyu djyuVar : djymVar.e) {
                        this.q.add(Integer.valueOf(djyuVar.b));
                    }
                }
            }
        }
        this.h = wse.a(dopkVar);
        this.o = dopkVar;
    }

    public final boolean d() {
        dopk dopkVar;
        if (this.p == null || (dopkVar = this.o) == null) {
            return false;
        }
        for (doph dophVar : dopkVar.e) {
            for (Integer num : this.q) {
                if (bzlx.a(num.intValue(), dophVar.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean e() {
        return this.b.getTransitPagesParameters().c;
    }

    public final boolean f() {
        return this.o != null;
    }

    public final void g() {
        djyo djyoVar = this.p;
        if (djyoVar != null) {
            this.l.a().F(djyoVar);
        }
    }

    public final void h() {
        amvg amvgVar = new amvg();
        amvgVar.b = this.f;
        amvgVar.c = this.n;
        amvgVar.z = true;
        amvh a = amvgVar.a();
        qcw x = qcx.x();
        x.r(amvh.i(this.a));
        x.u(a);
        this.l.a().m(x.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        begj begjVar = new begj();
        begjVar.b(this.g);
        begjVar.c = jjn.EXPANDED;
        begjVar.I = false;
        begjVar.D = true;
        begjVar.F = true;
        begjVar.n = true;
        begjVar.a = begi.BASE_MAP_POI;
        this.j.o(begjVar, false, null);
    }

    public final void j() {
        this.k.j(bwrs.a(this.g));
    }

    public final void k() {
        dopk dopkVar = this.o;
        if (dopkVar != null) {
            Context context = this.a;
            String str = dopkVar.b;
            String str2 = dopkVar.d;
            dnoh dnohVar = dopkVar.g;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            akqq e = akqq.e(dnohVar);
            String str3 = (dopkVar.a & 8192) != 0 ? dopkVar.n : null;
            Intent putExtra = bzgy.d(context, str, str2).putExtra("STATION_LOCATION", e.a()).putExtra("HOMESCREEN_SHORTCUT", true);
            if (str3 != null) {
                putExtra.putExtra("STATION_VED", str3);
            }
            putExtra.setAction("android.intent.action.VIEW");
            if (!ako.a() || !jk.a(this.a)) {
                Intent f = yzi.f(this.a, dopkVar.d, dopkVar.b, l(dopkVar), putExtra);
                f.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                deha.q(this.e.a().I(this.a, f), new wrn(this), dege.a);
                return;
            }
            Context context2 = this.a;
            this.e.a().t(context2, yzi.h(context2, dopkVar.d, dopkVar.b, l(dopkVar), putExtra), null);
            return;
        }
        bvoo.h("Create shortcut clicked before it should be visible", new Object[0]);
    }
}
