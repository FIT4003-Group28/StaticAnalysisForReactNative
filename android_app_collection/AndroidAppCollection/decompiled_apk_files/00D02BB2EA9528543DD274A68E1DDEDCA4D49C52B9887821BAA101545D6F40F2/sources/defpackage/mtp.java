package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: mtp  reason: default package */
/* loaded from: classes7.dex */
public class mtp implements mtg {
    public final dcdc<ldm> a;
    public final bvqg<ldm> b;
    private final Context c;
    private final bvsl d;
    private final myg e;
    private final noo f;
    private final msx g;
    private final boolean h;
    private boolean i = true;
    private mto j = x(false);
    @dzsi
    private mzm k = null;
    private dcdc<mzk> l = dcdc.e();

    public mtp(Context context, bvsl bvslVar, myg mygVar, noo nooVar, dcdc<ldm> dcdcVar, msx msxVar, bvqg<ldm> bvqgVar, msv msvVar) {
        boolean z = true;
        this.c = context;
        this.d = bvslVar;
        this.e = mygVar;
        this.f = nooVar;
        this.b = bvqgVar;
        this.a = dcdcVar;
        this.g = msxVar;
        this.h = msvVar == msv.INTENT_MULTIPLE_WAYPOINTS ? false : z;
    }

    private static mto x(boolean z) {
        return new mto(mtf.LOADING_SPINNER, Integer.valueOf(true != z ? R.string.CAR_LOADING_ROUTE : R.string.CAR_WAITING_FOR_LOCATION), false, false, R.string.CAR_START_NAVIGATION, cjtd.b, nqu.H(), null, null, null);
    }

    @Override // defpackage.mtg
    public mtf a() {
        return this.j.a;
    }

    @Override // defpackage.mtg
    public Boolean b(mtf mtfVar) {
        return Boolean.valueOf(a() == mtfVar);
    }

    @Override // defpackage.mtg
    @dzsi
    public mzd c() {
        return this.k;
    }

    @Override // defpackage.mtg
    public dcdc<? extends mzc> d() {
        return this.l;
    }

    @Override // defpackage.mtg
    @dzsi
    public String e() {
        if (this.j.b == null) {
            return null;
        }
        return this.c.getResources().getString(this.j.b.intValue());
    }

    @Override // defpackage.mtg
    public String f() {
        amub amubVar = this.j.i;
        if (amubVar == null) {
            return "";
        }
        return bvtb.e(this.c.getResources(), amubVar.ax(), bvsz.ABBREVIATED).toString();
    }

    @Override // defpackage.mtg
    public cqss g() {
        amub amubVar = this.j.i;
        if (amubVar == null) {
            return nql.b(dpej.DELAY_NODATA);
        }
        return nql.b(amubVar.O);
    }

    @Override // defpackage.mtg
    public Boolean h() {
        amub amubVar = this.j.i;
        boolean z = false;
        if (amubVar == null) {
            return false;
        }
        if (eaow.d(amubVar.ax()).b / 3600000 > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mtg
    public String i() {
        amub amubVar = this.j.i;
        if (amubVar == null) {
            return "";
        }
        return this.d.c(amubVar.D, amubVar.I, true, true);
    }

    @Override // defpackage.mtg
    public Boolean j() {
        int a;
        amub b = this.g.b();
        boolean z = false;
        if (b == null) {
            return false;
        }
        amve amveVar = b.d;
        if (b.aw()) {
            int i = 0;
            while (true) {
                if (i < amveVar.e()) {
                    doub doubVar = amveVar.d(i).c;
                    if (doubVar != null && (a = doua.a(doubVar.d)) != 0 && a == 2) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mtg
    public Boolean k() {
        return Boolean.valueOf(this.j.c);
    }

    @Override // defpackage.mtg
    public Boolean l() {
        return Boolean.valueOf(this.j.d);
    }

    @Override // defpackage.mtg
    public Boolean m() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.mtg
    public cqtd n() {
        return this.j.g;
    }

    @Override // defpackage.mtg
    @dzsi
    public cqtd o() {
        return this.j.h;
    }

    @Override // defpackage.mtg
    public String p() {
        return this.c.getResources().getString(this.j.e);
    }

    @Override // defpackage.mtg
    public cjtd q() {
        return this.j.f;
    }

    @Override // defpackage.mtg
    public cqkl r() {
        Runnable runnable = this.j.j;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.mtg
    public Boolean s() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.mtg
    public cqkl t() {
        this.f.b();
        return cqkl.a;
    }

    @Override // defpackage.mtg
    public cqkl u() {
        this.f.a();
        return cqkl.a;
    }

    public void v() {
        msw mswVar = msw.LOADING_DIRECTIONS;
        int ordinal = this.g.a().ordinal();
        boolean z = true;
        if (ordinal == 0) {
            this.j = x(this.g.e());
        } else if (ordinal == 1) {
            mtf mtfVar = mtf.ERROR_ICON;
            Integer valueOf = Integer.valueOf((int) R.string.CAR_ERROR_FETCHING_DIRECTIONS);
            cjtd a = cjtd.a(dtxm.dp);
            cqtd B = nqu.B();
            cqtd aU = nqu.aU();
            final msx msxVar = this.g;
            msxVar.getClass();
            this.j = new mto(mtfVar, valueOf, true, false, R.string.CAR_RETRY, a, B, aU, null, new Runnable(msxVar) { // from class: mtm
                private final msx a;

                {
                    this.a = msxVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d();
                }
            });
        } else if (ordinal == 2) {
            this.j = new mto(mtf.ERROR_ICON, Integer.valueOf((int) R.string.CAR_ROUTE_LOADING_FAILED), false, false, R.string.CAR_START_NAVIGATION, cjtd.a(dtxm.f14do), nqu.H(), nqu.aU(), null, null);
        } else if (ordinal == 3) {
            mtf mtfVar2 = mtf.DESTINATIONS_LIST;
            cjtd a2 = cjtd.a(dtxm.f14do);
            cqtd H = nqu.H();
            amub b = this.g.b();
            final msx msxVar2 = this.g;
            msxVar2.getClass();
            this.j = new mto(mtfVar2, null, true, false, R.string.CAR_START_NAVIGATION, a2, H, null, b, new Runnable(msxVar2) { // from class: mtl
                private final msx a;

                {
                    this.a = msxVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c();
                }
            });
        } else if (ordinal == 4) {
            this.j = new mto(mtf.DESTINATIONS_LIST, null, false, true, R.string.CAR_LOADING_DISABLED_ACTION_BUTTON, cjtd.b, nqu.H(), null, this.g.b(), null);
        } else if (ordinal == 5) {
            mtf mtfVar3 = mtf.DESTINATIONS_LIST;
            Integer valueOf2 = Integer.valueOf((int) R.string.GENERIC_ERROR_MESSAGE);
            cjtd a3 = cjtd.a(dtxm.dq);
            cqtd B2 = nqu.B();
            amub b2 = this.g.b();
            final msx msxVar3 = this.g;
            msxVar3.getClass();
            this.j = new mto(mtfVar3, valueOf2, true, false, R.string.CAR_RETRY, a3, B2, null, b2, new Runnable(msxVar3) { // from class: mtn
                private final msx a;

                {
                    this.a = msxVar3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c();
                }
            });
        }
        amub amubVar = this.j.i;
        if (amubVar == null) {
            this.k = null;
            this.l = dcdc.e();
            return;
        }
        mzl a4 = this.e.a(amubVar);
        mzm mzmVar = this.k;
        if (mzmVar == null) {
            this.k = new mzm(a4);
        } else {
            mzmVar.b(a4);
        }
        dcdc<mzj> b3 = this.e.b(amubVar);
        final int i = 0;
        if (this.l.isEmpty()) {
            dccx F = dcdc.F();
            while (i < b3.size()) {
                F.g(new mzk(b3.get(i), new mzi(this) { // from class: mtj
                    private final mtp a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.mzi
                    public final void a(int i2) {
                        mtp mtpVar = this.a;
                        mtpVar.b.NU(mtpVar.a.get(i2));
                    }
                }, new dbty(i) { // from class: mtk
                    private final int a;

                    {
                        this.a = i;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        int i2 = this.a;
                        cjta b4 = cjtd.b();
                        b4.d = dtxm.dn;
                        b4.i(i2);
                        return b4.a();
                    }
                }));
                i++;
            }
            this.l = F.f();
            return;
        }
        if (b3.size() != this.l.size()) {
            z = false;
        }
        dbsk.l(z);
        while (i < b3.size()) {
            this.l.get(i).i(b3.get(i));
            i++;
        }
    }

    public void w(boolean z) {
        this.i = z;
    }
}
