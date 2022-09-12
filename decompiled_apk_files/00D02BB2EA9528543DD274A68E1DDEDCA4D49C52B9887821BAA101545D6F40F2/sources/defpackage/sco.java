package defpackage;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sco  reason: default package */
/* loaded from: classes7.dex */
public class sco implements sag {
    protected final cqkn<sae> A;
    protected final cqkn<sae> B;
    private final sbz C;
    private final boolean D;
    public final dxio<sim> a;
    protected final Application b;
    protected final sic c;
    protected final btvo d;
    protected final ros e;
    protected final qjk f;
    protected final axvy g;
    protected final Executor h;
    protected final Executor i;
    protected final saf j;
    protected final jmn k;
    public final axwq l;
    @dzsi
    public final wbx m;
    public final Activity n;
    protected final List<sad> o;
    protected final List<sca> p;
    protected final sca q;
    protected final sca r;
    @dzsi
    protected final sca s;
    @dzsi
    protected final sca t;
    @dzsi
    protected final sca u;
    protected final sca v;
    protected final sca w;
    @dzsi
    protected final scb x;
    @dzsi
    protected scb y;
    protected cqkn<sad> z;

    public sco(Application application, btvo btvoVar, qjk qjkVar, axvy axvyVar, cqhn cqhnVar, sic sicVar, ros rosVar, sbz sbzVar, dxio<sim> dxioVar, Executor executor, Executor executor2, saf safVar, axwq axwqVar, @dzsi wbx wbxVar, Activity activity, fd fdVar) {
        this(application, btvoVar, qjkVar, axvyVar, sicVar, rosVar, sbzVar, dxioVar, executor, executor2, safVar, axwqVar, wbxVar, activity, fdVar, true);
    }

    @SafeVarargs
    private static <T> void c(List<T> list, @dzsi T... tArr) {
        for (T t : tArr) {
            if (t != null) {
                list.add(t);
            }
        }
    }

    protected static cqkn<sad> f(ror rorVar, ros rosVar) {
        return new scg(rosVar, rorVar);
    }

    public static boolean i(@dzsi azva azvaVar) {
        return (azvaVar == null || (azvaVar.e == null && azvaVar.c == null)) ? false : true;
    }

    public static String z(Throwable th) {
        try {
            throw th;
        } catch (qsk | qsl | sil unused) {
            return "";
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz e = jib.g(this.n, this.b.getString(R.string.COMMUTE_SETTINGS_TITLE)).e();
        e.f(this.k);
        e.x = false;
        e.l = cqrt.l(R.string.ACCESSIBILITY_OVERFLOW_MENU).a(this.n);
        e.z = 0;
        jhm a = jhm.a();
        a.a = this.b.getString(R.string.CLEAR_COMMUTE_SETTINGS_MENU_ITEM);
        a.f = cjtd.a(dtxl.bW);
        a.h = 0;
        a.d(new View.OnClickListener(this) { // from class: sce
            private final sco a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e.r();
            }
        });
        e.c(a.c());
        return e.b();
    }

    @Override // defpackage.sag
    public List<sad> b() {
        return this.o;
    }

    public final boolean d() {
        if (this.j.b()) {
            return EnumSet.of(domw.COMBINE_FREQUENT_TRIPS_WITH_LOCATION_HISTORY, domw.UNKNOWN_COMMUTE_TIME_MIXING_POLICY).contains(this.g.f());
        }
        return false;
    }

    public final boolean e() {
        if (!this.D || this.f.f() == domy.BIKING) {
            this.y = null;
            return false;
        }
        if (this.y == null) {
            scb scbVar = new scb(null, this.b.getString(R.string.COMMUTE_SETTINGS_NOTIFICATION_TOGGLE_TITLE), this.b.getString(R.string.COMMUTE_SETTINGS_NOTIFICATION_TOGGLE_DESCRIPTION), this.B, dtxl.bY);
            this.y = scbVar;
            scbVar.f = true;
            scbVar.u(true);
            this.y.C(this.g.d());
        }
        return true;
    }

    protected final cqkn<sad> g(final Map<domy, ror> map, final ros rosVar) {
        return new cqkn(this, map, rosVar) { // from class: scc
            private final sco a;
            private final Map b;
            private final ros c;

            {
                this.a = this;
                this.b = map;
                this.c = rosVar;
            }

            @Override // defpackage.cqkn
            public final void a(cqkp cqkpVar, View view) {
                sco scoVar = this.a;
                Map map2 = this.b;
                ros rosVar2 = this.c;
                if (!((sad) cqkpVar).k().booleanValue()) {
                    qjk qjkVar = scoVar.f;
                    dbsk.s(qjkVar);
                    ror rorVar = (ror) map2.get(qjkVar.f());
                    dbsk.b(rorVar != null, "Unsupported screen type found");
                    dbsk.s(rorVar);
                    rosVar2.n(rorVar);
                }
            }
        };
    }

    public void h() {
        deha.q(this.f.w(), new scl(this), this.h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String j(dndr dndrVar) {
        if (!sif.b(this.d) || this.f.f() != domy.MULTIMODAL) {
            return this.b.getString(R.string.TRANSIT_ROUTE_OTHER);
        }
        return this.b.getString(R.string.SETTING_NOT_SET_TEXT);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(sca scaVar, @dzsi String str, dndr dndrVar) {
        String m;
        if (!TextUtils.isEmpty(str)) {
            scaVar.b = str;
            if (dndrVar == dndr.WORK) {
                m = sht.l(this.b, str);
            } else {
                m = sht.m(this.b, str);
            }
            scaVar.d = m;
            cqkx.p(this);
            return;
        }
        u(scaVar, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(sca scaVar, String str) {
        scaVar.b = str;
        scaVar.d = str;
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v() {
        dbsk.s(this.t);
        dbsk.s(this.s);
        boolean z = false;
        boolean z2 = this.f.f() == domy.TRANSIT;
        if (sif.b(this.d)) {
            z2 |= this.f.f() == domy.MULTIMODAL;
        }
        this.s.e = z2;
        this.t.e = z2;
        if (w() && this.f.f() == domy.UNKNOWN_TRAVEL_MODE) {
            z = true;
        }
        this.w.e = !z;
    }

    public final boolean w() {
        donb h = this.f.h();
        return h.equals(donb.EXPLICIT) || h.equals(donb.UNKNOWN_PROVENANCE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        dktt dkttVar = this.d.getPassiveAssistParameters().a().am;
        if (dkttVar == null) {
            dkttVar = dktt.z;
        }
        if (!dkttVar.w) {
            boolean z = true;
            for (sca scaVar : this.p) {
                if (scaVar.i().booleanValue()) {
                    if (!z) {
                        scaVar.w(true);
                        scaVar.v(false);
                    } else {
                        scaVar.w(false);
                        scaVar.v(!scaVar.r().booleanValue());
                        if (!scaVar.r().booleanValue()) {
                            z = false;
                        }
                    }
                }
            }
            return;
        }
        sca scaVar2 = null;
        boolean z2 = false;
        boolean z3 = true;
        for (sca scaVar3 : this.p) {
            if (scaVar3.i().booleanValue()) {
                if (true == scaVar3.t().booleanValue()) {
                    scaVar2 = scaVar3;
                }
                if (z3 || scaVar3.s().booleanValue()) {
                    scaVar3.w(false);
                    scaVar3.v(!scaVar3.r().booleanValue());
                    if (!scaVar3.r().booleanValue()) {
                        z3 = false;
                    } else if (scaVar3.s().booleanValue()) {
                        z2 = true;
                    }
                } else {
                    scaVar3.w(true);
                    scaVar3.v(false);
                }
            }
        }
        if (!z2 || scaVar2 == null) {
            return;
        }
        scaVar2.w(false);
        scaVar2.v(!scaVar2.r().booleanValue());
    }

    public void y() {
        sbz sbzVar = this.C;
        sbzVar.e.d(dndr.HOME, sbzVar.g.a());
        sbzVar.e.d(dndr.WORK, sbzVar.g.a());
        this.C.a(new Runnable(this) { // from class: scf
            private final sco a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.h();
            }
        });
    }

    public sco(Application application, btvo btvoVar, qjk qjkVar, axvy axvyVar, sic sicVar, ros rosVar, sbz sbzVar, dxio<sim> dxioVar, Executor executor, Executor executor2, saf safVar, axwq axwqVar, @dzsi wbx wbxVar, Activity activity, fd fdVar, boolean z) {
        this.z = new sch(this);
        sci sciVar = new sci(this);
        this.A = sciVar;
        this.B = new scj(this);
        this.b = application;
        this.c = sicVar;
        this.e = rosVar;
        this.C = sbzVar;
        this.d = btvoVar;
        this.f = qjkVar;
        this.g = axvyVar;
        this.a = dxioVar;
        this.l = axwqVar;
        this.h = executor;
        this.i = executor2;
        this.k = new jmn(fdVar.getClass());
        this.j = safVar;
        this.m = wbxVar;
        this.n = activity;
        this.D = z;
        sca scaVar = new sca(cqrt.f(2131232292), application.getString(R.string.HOME_LINK), f(ror.HOME, rosVar), dtxl.dr);
        this.q = scaVar;
        scaVar.z(application.getString(R.string.SET_HOME_LOCATION));
        scaVar.x(true);
        sca scaVar2 = new sca(cqrt.f(2131232467), application.getString(R.string.WORK_LINK), f(ror.WORK, rosVar), dtxl.dx);
        this.r = scaVar2;
        scaVar2.z(application.getString(R.string.SET_WORK_LOCATION));
        scaVar2.x(true);
        sca scaVar3 = null;
        sca scaVar4 = new sca(null, application.getString(R.string.TRAVEL_MODE_LINK), f(ror.TRAVEL_MODE, rosVar), dtxl.dw);
        this.v = scaVar4;
        scaVar4.z(application.getString(R.string.TRAVEL_MODE_PROMPT));
        scaVar4.y(true);
        dcdg p = dcdn.p();
        p.f(domy.TRANSIT, ror.TRANSIT_ROUTE_TO_WORK);
        dcdg p2 = dcdn.p();
        p2.f(domy.TRANSIT, ror.TRANSIT_ROUTE_TO_HOME);
        if (sif.b(btvoVar)) {
            p.f(domy.MULTIMODAL, ror.MULTIMODAL_ROUTE_TO_WORK);
            p2.f(domy.MULTIMODAL, ror.MULTIMODAL_ROUTE_TO_HOME);
        }
        sca scaVar5 = new sca(null, application.getString(R.string.ROUTE_TO_WORK_TITLE), g(p.b(), rosVar), dtxl.dv);
        scaVar5.e = false;
        scaVar5.f = true;
        scaVar5.z(application.getString(R.string.TRANSIT_ROUTE_PROMPT));
        this.s = scaVar5;
        scaVar5.u(true);
        sca scaVar6 = new sca(null, application.getString(R.string.ROUTE_TO_HOME_TITLE), g(p2.b(), rosVar), dtxl.du);
        scaVar6.e = false;
        scaVar6.f = true;
        scaVar6.z(application.getString(R.string.TRANSIT_ROUTE_PROMPT));
        this.t = scaVar6;
        scaVar6.u(true);
        if (wbxVar != null) {
            sca scaVar7 = new sca(null, application.getString(R.string.CLEAR_SAVED_PERSONAL_DRIVING_ROUTES_LINK), this.z, dtxl.dq);
            scaVar7.e = wbxVar.a();
            scaVar7.f = false;
            scaVar7.u(true);
            scaVar3 = scaVar7;
        }
        this.u = scaVar3;
        sca scaVar8 = new sca(cqrt.f(2131232473), application.getString(R.string.COMMUTE_TIMES_LINK), f(ror.SCHEDULE, rosVar), dtxl.dt);
        this.w = scaVar8;
        scaVar8.z(application.getString(R.string.COMMUTE_TIMES_PROMPT));
        scb scbVar = new scb(null, application.getString(R.string.ADAPT_TO_ROUTINE_TITLE), application.getString(R.string.ADAPT_TO_ROUTINE_DESCRIPTION), sciVar, dtxl.dp);
        this.x = scbVar;
        scbVar.f = true;
        scbVar.u(true);
        scbVar.C(d());
        e();
        ArrayList arrayList = new ArrayList();
        this.o = arrayList;
        c(arrayList, scaVar, scaVar2, scaVar4, scaVar5, scaVar6, scaVar3, scaVar8, this.y, scbVar);
        ArrayList arrayList2 = new ArrayList();
        this.p = arrayList2;
        c(arrayList2, scaVar, scaVar2, scbVar, scaVar4, scaVar8, scaVar5, scaVar6);
    }
}
