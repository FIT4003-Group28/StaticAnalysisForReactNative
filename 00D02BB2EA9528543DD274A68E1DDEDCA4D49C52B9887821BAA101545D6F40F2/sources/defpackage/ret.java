package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ret  reason: default package */
/* loaded from: classes7.dex */
public class ret implements reh {
    private final CharSequence A;
    private final vtk B;
    public final Activity a;
    public final amve b;
    @dzsi
    public cqtd c;
    public final dxio<axvy> d;
    public final cklf e;
    private final amte f;
    @dzsi
    private final CharSequence g;
    private final zmg h;
    private final dxio<qbt> i;
    private final dxio<ascb> j;
    private final bvso k;
    private final int l;
    @dzsi
    private final rfm m;
    private final long n;
    private final cjtd o;
    private final btvo p;
    @dzsi
    private final CharSequence q;
    private final List<zdn> r;
    private boolean s;
    private boolean t;
    private final boolean u;
    private final isd v;
    @dzsi
    private final zsd w;
    private final vpd x;
    @dzsi
    private final dqek y;
    private final dbsg<wcn> z;

    public ret(Activity activity, cqhn cqhnVar, vtn vtnVar, dxio<qbt> dxioVar, dxio<ascb> dxioVar2, bvso bvsoVar, isd isdVar, dxio<axvy> dxioVar3, cklf cklfVar, zse zseVar, btwd btwdVar, btvo btvoVar, vpd vpdVar, amte amteVar, int i, @dzsi rfm rfmVar, boolean z, boolean z2, long j, @dzsi dqek dqekVar, dbsg<wcn> dbsgVar) {
        String string;
        CharSequence b;
        String o;
        cqtd f;
        res resVar = new res(this);
        this.B = resVar;
        this.a = activity;
        this.f = amteVar;
        this.i = dxioVar;
        this.j = dxioVar2;
        this.k = bvsoVar;
        this.p = btvoVar;
        amve m = amteVar.a.m(i);
        this.b = m;
        this.l = i;
        if (E(m)) {
            string = activity.getString(R.string.COMMUTE_IMMERSIVE_YOUR_SAVED_ROUTE);
        } else if (m.A(2)) {
            string = activity.getString(R.string.COMMUTE_IMMERSIVE_YOUR_USUAL_ROUTE);
        } else if (i == 0) {
            string = activity.getString(R.string.COMMUTE_IMMERSIVE_BEST_ROUTE);
        } else {
            string = activity.getString(R.string.COMMUTE_IMMERSIVE_ALTERNATE_ROUTE);
        }
        this.A = string;
        this.m = rfmVar;
        this.n = j;
        this.y = dqekVar;
        this.s = z;
        this.u = z2;
        this.v = isdVar;
        this.d = dxioVar3;
        this.e = cklfVar;
        boolean d = amteVar.a.d();
        int e = cqrp.d(14.0d).e(activity);
        if (d) {
            bvsx bvsxVar = new bvsx(activity.getResources());
            float f2 = e;
            Spannable f3 = bvsxVar.f(itd.c().a(activity), f2, f2);
            bvsu c = bvsxVar.c(R.string.NO_TRAFFIC_DATA);
            bvsv a = bvsxVar.a(f3);
            a.g(" ");
            a.f(c);
            b = a.c();
        } else {
            alcb a2 = alcc.a();
            a2.a = activity;
            a2.b = vtnVar;
            a2.d = e;
            b = a2.a().b(m.q().m);
        }
        this.g = b;
        dozz dozzVar = m.f().g;
        dozzVar = dozzVar == null ? dozz.y : dozzVar;
        dozy b2 = dozy.b(dozzVar.f);
        zsd zsdVar = null;
        this.c = ((b2 == null ? dozy.UNKNOWN : b2) != dozy.TRAFFIC_TREND || (o = alca.o(dozzVar, false)) == null || (f = vtnVar.f(o, bvlw.b, resVar)) == null) ? null : cqrt.i(f, cqrt.c(D(m)));
        cjta b3 = cjtd.b();
        b3.d = dtxl.bE;
        b3.g(m.m());
        this.o = b3.a();
        this.q = m.b().c.isEmpty() ? null : activity.getString(R.string.VIA_ROADS_CLAUSE, m.b().c);
        amub b4 = amteVar.b(i, activity);
        dbsk.s(b4);
        this.r = zry.c(vtnVar, b4.e, null);
        this.h = new zmg(activity, m.d(0));
        if ((m.f().a & 8) != 0) {
            dpfx dpfxVar = m.f().i;
            zsdVar = zseVar.a(dpfxVar == null ? dpfx.f : dpfxVar, false);
        }
        this.w = zsdVar;
        this.x = vpdVar;
        this.z = dbsgVar;
    }

    public static int D(amve amveVar) {
        return vyb.Y(vyb.e(amveVar), iva.a().booleanValue());
    }

    protected static boolean E(amve amveVar) {
        return amveVar.B(2, 3);
    }

    @Override // defpackage.reh
    public List<zdn> A() {
        return this.r;
    }

    @Override // defpackage.reh
    public Boolean B() {
        dphv b = dphv.b(this.b.a.z);
        if (b == null) {
            b = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
        }
        boolean z = false;
        if ((vph.g(b) != vpc.MANILA || this.x.d(vpc.MANILA)) && vph.g(b) != vpc.SANTIAGO) {
            if (b != dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION && b != dphv.NONE) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    @Override // defpackage.reh
    public CharSequence C() {
        dbsg dbsgVar;
        dphv b = dphv.b(this.b.a.z);
        if (b == null) {
            b = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
        }
        dphv dphvVar = b;
        Resources resources = this.a.getResources();
        if (this.x.d(vpc.MANILA)) {
            dbsgVar = dbsg.i(Integer.valueOf((int) R.string.MANILA_TODAY_WARNING));
        } else {
            dbsgVar = dbpy.a;
        }
        CharSequence j = vph.j(resources, dphvVar, R.string.ODD_PLATE_DAY, R.string.EVEN_PLATE_DAY, R.string.RODIZIO_TODAY_WARNING, dbsgVar);
        return j == null ? g() : j;
    }

    @Override // defpackage.reh
    public Boolean a() {
        return Boolean.valueOf(this.s);
    }

    @Override // defpackage.reh
    public void b(boolean z) {
        if (z != this.s) {
            this.s = z;
            cqkx.p(this);
        }
    }

    @Override // defpackage.reh
    public Boolean c() {
        return Boolean.valueOf(this.t);
    }

    @Override // defpackage.reh
    public void d(boolean z) {
        if (z != this.t) {
            this.t = z;
            cqkx.p(this);
        }
    }

    @Override // defpackage.reh
    public Boolean e() {
        return Boolean.valueOf(this.u);
    }

    @Override // defpackage.reh
    public Boolean f() {
        return Boolean.valueOf(this.b.A(2));
    }

    @Override // defpackage.reh
    public CharSequence g() {
        if (w().booleanValue()) {
            wcn x = x();
            dbsk.s(x);
            boolean booleanValue = x.d().booleanValue();
            boolean E = E(this.b);
            if (booleanValue && !E) {
                return this.a.getString(R.string.COMMUTE_IMMERSIVE_YOUR_SAVED_ROUTE);
            }
            if (!booleanValue && E) {
                return this.a.getString(R.string.COMMUTE_IMMERSIVE_ALTERNATE_ROUTE);
            }
        }
        return this.A;
    }

    @Override // defpackage.reh
    public CharSequence h() {
        return !this.b.B(2, 3) ? TextUtils.concat(this.A, "  •  ", this.a.getString(R.string.COMMUTE_IMMERSIVE_REGULAR_ROUTES_BASED_ON_LOCATION_HISTORY)) : this.A;
    }

    @Override // defpackage.reh
    public CharSequence i() {
        bvso bvsoVar = this.k;
        dbsi<bvsn, Integer> a = bvsoVar.a(TimeUnit.MILLISECONDS.toSeconds(this.n));
        bvsn bvsnVar = bvsn.UNKNOWN;
        int ordinal = a.a.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return bvsoVar.a.getResources().getQuantityString(R.plurals.REAL_TIME_DATA_UPDATED_HOURS_AGO_NOTICE, a.b.intValue(), a.b);
            }
            if (ordinal == 3) {
                return bvsoVar.a.getResources().getQuantityString(R.plurals.REAL_TIME_DATA_UPDATED_MINUTES_AGO_NOTICE, a.b.intValue(), a.b);
            }
            return ordinal != 4 ? "" : bvsoVar.a.getString(R.string.REAL_TIME_DATA_UPDATED_NOW_NOTICE);
        }
        return bvsoVar.a.getResources().getQuantityString(R.plurals.REAL_TIME_DATA_UPDATED_DAYS_AGO_NOTICE, a.b.intValue(), a.b);
    }

    @Override // defpackage.reh
    public CharSequence j() {
        bvso bvsoVar = this.k;
        dbsi<bvsn, Integer> a = bvsoVar.a(TimeUnit.MILLISECONDS.toSeconds(this.n));
        bvsn bvsnVar = bvsn.UNKNOWN;
        int ordinal = a.a.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return bvsoVar.a.getResources().getQuantityString(R.plurals.REAL_TIME_DATA_UPDATED_HOURS_AGO_NOTICE, a.b.intValue(), a.b);
            }
            if (ordinal == 3) {
                return bvsoVar.a.getResources().getQuantityString(R.plurals.REAL_TIME_DATA_UPDATED_MINUTES_AGO_CONTENT_DESCRIPTION, a.b.intValue(), a.b);
            }
            return ordinal != 4 ? "" : bvsoVar.a.getString(R.string.REAL_TIME_DATA_UPDATED_NOW_NOTICE);
        }
        return bvsoVar.a.getResources().getQuantityString(R.plurals.REAL_TIME_DATA_UPDATED_DAYS_AGO_NOTICE, a.b.intValue(), a.b);
    }

    @Override // defpackage.reh
    public CharSequence k() {
        Activity activity = this.a;
        zmg zmgVar = this.h;
        amve amveVar = this.b;
        String a = zmgVar.a();
        if (a == null) {
            a = "";
        }
        bvsv a2 = new bvsx(activity.getResources()).a(a);
        a2.m(D(amveVar));
        a2.i();
        return a2.c();
    }

    @Override // defpackage.reh
    @dzsi
    public CharSequence l() {
        return this.q;
    }

    @Override // defpackage.reh
    public cqkl m() {
        rfm rfmVar = this.m;
        if (rfmVar != null) {
            rfmVar.a(this.l);
        }
        return cqkl.a;
    }

    @Override // defpackage.reh
    public cqkl n() {
        this.j.a().a(this.f, this.l, asca.COMMUTE_IMMERSIVE, false);
        return cqkl.a;
    }

    @Override // defpackage.reh
    public cqkl o() {
        this.i.a().o(this.f, this.l, this.n);
        return cqkl.a;
    }

    @Override // defpackage.reh
    public final cqkl p(View view) {
        isc a = this.v.a(view);
        Activity activity = this.a;
        ArrayList arrayList = new ArrayList();
        if (!this.p.getDirectionsExperimentsParameters().g) {
            jhm jhmVar = new jhm();
            jhmVar.a = activity.getString(R.string.COMMUTE_IMMERSIVE_DONT_SHOW_REGULAR_ROUTES);
            jhmVar.f = cjtd.a(dtxl.by);
            jhmVar.d(new View.OnClickListener(this) { // from class: rep
                private final ret a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    final ret retVar = this.a;
                    retVar.d.a().i(false);
                    dafk b = ckos.b(retVar.a.findViewById(16908290), R.string.COMMUTE_IMMERSIVE_NO_LONGER_SHOWING_REGULAR_ROUTES_TOAST, 0);
                    b.t(R.string.UNDO, new View.OnClickListener(retVar) { // from class: rer
                        private final ret a;

                        {
                            this.a = retVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            this.a.d.a().i(true);
                        }
                    });
                    b.c();
                }
            });
            arrayList.add(jhmVar.c());
        }
        jhm jhmVar2 = new jhm();
        jhmVar2.a = activity.getString(R.string.COMMUTE_IMMERSIVE_ABOUT_REGULAR_ROUTES);
        jhmVar2.f = cjtd.a(dtxl.bx);
        jhmVar2.d(new View.OnClickListener(this) { // from class: req
            private final ret a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.e.a("regular_routes");
            }
        });
        arrayList.add(jhmVar2.c());
        a.a(arrayList);
        a.show();
        return cqkl.a;
    }

    @Override // defpackage.reh
    public cjtd q() {
        return this.o;
    }

    @Override // defpackage.reh
    public Boolean r() {
        boolean z = true;
        if (!Boolean.valueOf(this.a.getResources().getConfiguration().screenHeightDp > 640).booleanValue() || !a().booleanValue() || this.w == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.reh
    @dzsi
    public zec s() {
        return this.w;
    }

    @Override // defpackage.reh
    public Boolean t() {
        return Boolean.valueOf(this.y == dqek.LOCATION_HISTORY);
    }

    @Override // defpackage.reh
    public CharSequence u() {
        return this.y == dqek.LOCATION_HISTORY ? this.a.getString(R.string.ATTRIBUTION_LOCATION_HISTORY) : "";
    }

    @Override // defpackage.reh
    public Integer v() {
        return Integer.valueOf(this.l);
    }

    @Override // defpackage.reh
    public Boolean w() {
        return Boolean.valueOf(this.z.a());
    }

    @Override // defpackage.reh
    @dzsi
    public wcn x() {
        if (w().booleanValue()) {
            return this.z.b();
        }
        return null;
    }

    @Override // defpackage.reh
    @dzsi
    public cqtd y() {
        return this.c;
    }

    @Override // defpackage.reh
    @dzsi
    public CharSequence z() {
        return this.g;
    }
}
