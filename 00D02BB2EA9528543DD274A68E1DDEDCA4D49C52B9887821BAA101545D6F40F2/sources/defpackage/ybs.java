package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.style.TypefaceSpan;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ybs  reason: default package */
/* loaded from: classes7.dex */
public final class ybs {
    public static final vtj a = vtj.TRANSIT_AUTO;
    private static final TypefaceSpan l = new TypefaceSpan("sans-serif");
    private static final TypefaceSpan m = new TypefaceSpan("sans-serif-medium");
    public final Context b;
    public final cqhn c;
    public final cqhu d;
    public final ydf e;
    public final Executor f;
    public final btvo g;
    public final bvjj h;
    public final byyp i;
    public final dxio<qbt> j;
    public final zrt k;
    private final wvb n;
    private final cqat o;

    public ybs(Activity activity, cqhn cqhnVar, cqhu cqhuVar, ydf ydfVar, Executor executor, btvo btvoVar, bvjj bvjjVar, byyp byypVar, wvb wvbVar, cqat cqatVar, dxio<qbt> dxioVar, zrt zrtVar) {
        this.b = activity;
        this.c = cqhnVar;
        this.d = cqhuVar;
        this.e = ydfVar;
        this.f = executor;
        this.g = btvoVar;
        this.h = bvjjVar;
        this.i = byypVar;
        this.n = wvbVar;
        this.o = cqatVar;
        this.j = dxioVar;
        this.k = zrtVar;
    }

    @dzsi
    public static cjtd e(cjta cjtaVar, ddho ddhoVar, @dzsi String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        cjtaVar.d = ddhoVar;
        return cjtaVar.a();
    }

    public static boolean f(vwh vwhVar, int i) {
        for (Integer num : vwhVar.i) {
            if (i == num.intValue()) {
                return true;
            }
        }
        return false;
    }

    @dzsi
    public static jhk g(@dzsi douj doujVar) {
        if (doujVar != null) {
            return new jhk(doujVar.c, a, dbsg.i(doujVar.e), dbpy.a, dbpy.a);
        }
        return null;
    }

    @dzsi
    public static jhk h(dpdy dpdyVar) {
        return g(alcf.g(dpdyVar));
    }

    public static List<dpce> i(dpdy dpdyVar) {
        return alcf.w(dpdyVar, false);
    }

    public static List j() {
        return dcdc.F().f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static CharSequence k(dpdy dpdyVar, int i, Context context, boolean z, btvo btvoVar) {
        Spannable spannable;
        Resources resources = context.getResources();
        if (!btvoVar.getTransitPagesParameters().A || !p(dpdyVar)) {
            dphe dpheVar = dpdyVar.e;
            if (dpheVar == null) {
                dpheVar = dphe.x;
            }
            String m2 = m(dpdyVar, i, resources);
            String n = n(dpheVar, i, resources);
            if (n == null) {
                if (m2 == null) {
                    return null;
                }
                bvsv a2 = new bvsx(resources).a(resources.getString(R.string.TRANSIT_SEGMENT_TRANSIT_RIDE_STOPS, m2));
                a2.j(l);
                return a2.c();
            }
            if (z) {
                n = resources.getString(R.string.TRANSIT_GUIDANCE_APPROXIMATE_DURATION, n);
            }
            StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 2);
            sb.append("(");
            sb.append(n);
            sb.append(")");
            String sb2 = sb.toString();
            bvsx bvsxVar = new bvsx(resources);
            bvsv a3 = bvsxVar.a(m2);
            TypefaceSpan typefaceSpan = l;
            a3.j(typefaceSpan);
            Spannable c = a3.c();
            bvsu c2 = bvsxVar.c(R.string.TRANSIT_SEGMENT_TRANSIT_RIDE_STOPS_DURATION);
            bvsw bvswVar = new bvsw();
            bvswVar.d(typefaceSpan);
            c2.b(bvswVar);
            c2.a(c, sb2);
            return c2.c();
        }
        Resources resources2 = context.getResources();
        dphe dpheVar2 = dpdyVar.e;
        if (dpheVar2 == null) {
            dpheVar2 = dphe.x;
        }
        String n2 = n(dpheVar2, i, context.getResources());
        if (n2 != null) {
            dphd dphdVar = dpheVar2.r;
            if (dphdVar == null) {
                dphdVar = dphd.f;
            }
            bvsv a4 = new bvsx(context.getResources()).a(n2);
            dpbw b = dpbw.b(dphdVar.b);
            if (b == null) {
                b = dpbw.UNKNOWN;
            }
            a4.l(vxj.a(b, context));
            a4.j(m);
            spannable = a4.c();
        } else {
            spannable = null;
        }
        String m3 = m(dpdyVar, i, resources2);
        if (spannable == null) {
            return null;
        }
        bvsu c3 = new bvsx(resources2).c(R.string.TRANSIT_SEGMENT_WITH_ESTIMATED_TRAVEL_TIME_AND_STOPS_DESCRIPTION);
        c3.a(spannable, m3);
        return c3.c();
    }

    @dzsi
    public static String l(dpdy dpdyVar, Context context, btvo btvoVar) {
        if (btvoVar.getTransitPagesParameters().A) {
            dphe dpheVar = dpdyVar.e;
            if (dpheVar == null) {
                dpheVar = dphe.x;
            }
            dphd dphdVar = dpheVar.r;
            if (dphdVar == null) {
                dphdVar = dphd.f;
            }
            if (!p(dpdyVar)) {
                return null;
            }
            dpbw dpbwVar = dpbw.UNKNOWN;
            dpbw b = dpbw.b(dphdVar.b);
            if (b == null) {
                b = dpbw.UNKNOWN;
            }
            int ordinal = b.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                return context.getString(R.string.TRANSIT_SEGMENT_WITH_NORMAL_TRAFFIC_DESCRIPTION);
            }
            if (ordinal != 3) {
                return null;
            }
            Resources resources = context.getResources();
            dgas dgasVar = dphdVar.c;
            if (dgasVar == null) {
                dgasVar = dgas.e;
            }
            return context.getString(R.string.TRANSIT_SEGMENT_WITH_HEAVY_TRAFFIC_DESCRIPTION, bvtb.e(resources, dgasVar.b, bvsz.ABBREVIATED).toString());
        }
        return null;
    }

    private static String m(dpdy dpdyVar, int i, Resources resources) {
        dphe dpheVar = dpdyVar.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        dotv dotvVar = dpheVar.l.get(i);
        return alcg.b(resources, Math.min(dpheVar.j.size() + 1, dotvVar.d - dotvVar.c));
    }

    @dzsi
    private static String n(dphe dpheVar, int i, Resources resources) {
        dgas dgasVar = dpheVar.l.get(i).e;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        if ((dgasVar.a & 1) != 0) {
            return bvtb.e(resources, dgasVar.b, bvsz.ABBREVIATED).toString();
        }
        return null;
    }

    @dzsi
    private final ybr o(@dzsi dpgw dpgwVar) {
        wuz b;
        dpol dpolVar;
        dvvs dvvsVar;
        String str;
        String str2;
        boolean z;
        if (dpgwVar == null) {
            return null;
        }
        String str3 = dpgwVar.n;
        if (dbsj.d(str3) || (b = this.n.b(akqi.b(str3))) == null) {
            return null;
        }
        dvvo c = b.c();
        acrm acrmVar = new acrm(this.b);
        if ((c.a & 2) != 0) {
            String str4 = c.c;
            dvvs dvvsVar2 = c.d;
            if (dvvsVar2 == null) {
                dvvsVar2 = dvvs.g;
            }
            acrmVar.d(dvvsVar2, true, c.c);
            str = str4;
            str2 = "";
            z = true;
        } else {
            long b2 = this.o.b();
            String d = b.d();
            dsrj<dvvq> dsrjVar = c.b;
            eaol eaolVar = new eaol(b2, eaou.j(d));
            switch (eaolVar.B()) {
                case 1:
                    dpolVar = dpol.MONDAY;
                    break;
                case 2:
                    dpolVar = dpol.TUESDAY;
                    break;
                case 3:
                    dpolVar = dpol.WEDNESDAY;
                    break;
                case 4:
                    dpolVar = dpol.THURSDAY;
                    break;
                case 5:
                    dpolVar = dpol.FRIDAY;
                    break;
                case 6:
                    dpolVar = dpol.SATURDAY;
                    break;
                case 7:
                    dpolVar = dpol.SUNDAY;
                    break;
                default:
                    dpolVar = dpol.DAY_OF_WEEK_UNSPECIFIED;
                    break;
            }
            Iterator<dvvq> it = dsrjVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    dvvq next = it.next();
                    dpol b3 = dpol.b(next.b);
                    if (b3 == null) {
                        b3 = dpol.DAY_OF_WEEK_UNSPECIFIED;
                    }
                    if (b3.equals(dpolVar)) {
                        int C = eaolVar.C();
                        Iterator<dvvs> it2 = next.c.iterator();
                        while (it2.hasNext()) {
                            dvvsVar = it2.next();
                            if (dvvsVar.b == C) {
                            }
                        }
                    }
                }
            }
            dvvsVar = null;
            if (dvvsVar == null) {
                return null;
            }
            String str5 = dvvsVar.d;
            String str6 = dvvsVar.e;
            acrmVar.d(dvvsVar, false, null);
            str = str5;
            str2 = str6;
            z = false;
        }
        qcf d2 = qcg.d();
        d2.b(c);
        d2.d(dpgwVar.b);
        d2.c(new byee((dgfs) null, b.d(), false, false));
        final qcg a2 = d2.a();
        return new ybr(this.b, acrmVar, z, str, str2, new View.OnClickListener(this, a2) { // from class: ybq
            private final ybs a;
            private final qcg b;

            {
                this.a = this;
                this.b = a2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ybs ybsVar = this.a;
                ybsVar.j.a().H(this.b);
            }
        }, this.g.getTransitPagesParameters().e);
    }

    private static boolean p(dpdy dpdyVar) {
        dphe dpheVar = dpdyVar.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        if ((dpheVar.a & 262144) != 0) {
            dphe dpheVar2 = dpdyVar.e;
            if (dpheVar2 == null) {
                dpheVar2 = dphe.x;
            }
            dphd dphdVar = dpheVar2.r;
            if (dphdVar == null) {
                dphdVar = dphd.f;
            }
            int a2 = dpbu.a(dphdVar.d);
            return a2 != 0 && a2 == 3;
        }
        return false;
    }

    public final void a(ybz ybzVar, dpdy dpdyVar) {
        dphe dpheVar = dpdyVar.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        dpgw dpgwVar = dpheVar.d;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        ybzVar.H = o(dpgwVar);
        dpgw dpgwVar2 = dpheVar.c;
        if (dpgwVar2 == null) {
            dpgwVar2 = dpgw.r;
        }
        ybzVar.G = o(dpgwVar2);
    }

    public final boolean b() {
        return this.g.getDirectionsPageParameters() != null && this.g.getDirectionsPageParameters().l;
    }

    public final void c(ybz ybzVar, int i, dpdy dpdyVar, int i2, cjta cjtaVar, dpbp dpbpVar) {
        String str;
        int i3;
        amup amupVar;
        dphe dpheVar = dpdyVar.e;
        if (dpheVar == null) {
            dpheVar = dphe.x;
        }
        boolean z = i2 == dpheVar.l.size() + (-1);
        ybzVar.J = z;
        if (z) {
            dphe dpheVar2 = dpdyVar.e;
            if (dpheVar2 == null) {
                dpheVar2 = dphe.x;
            }
            dpgw dpgwVar = dpheVar2.d;
            if (dpgwVar == null) {
                dpgwVar = dpgw.r;
            }
            dpgw dpgwVar2 = dpgwVar;
            if (b() && (i3 = i + 1) >= 0 && i3 < dpbpVar.c.size()) {
                dpdy dpdyVar2 = dpbpVar.c.get(i3);
                int size = dpdyVar2.d.size();
                do {
                    size--;
                    if (size >= 0) {
                        amupVar = amux.h(dpdyVar2.d.get(size), null, null).a().w;
                    }
                } while (amupVar == null);
                str = amupVar.c();
                ybzVar.w = xzy.k(this.b.getResources(), dpgwVar2, false, this.g, str, e(cjtaVar, dtxn.aK, str));
            }
            str = null;
            ybzVar.w = xzy.k(this.b.getResources(), dpgwVar2, false, this.g, str, e(cjtaVar, dtxn.aK, str));
        }
    }

    public final void d(ybz ybzVar, dpdy dpdyVar) {
        int a2;
        if (this.g.getTransitPagesParameters().y) {
            dphe dpheVar = dpdyVar.e;
            if (dpheVar == null) {
                dpheVar = dphe.x;
            }
            dpjb dpjbVar = dpheVar.t;
            if (dpjbVar == null) {
                dpjbVar = dpjb.e;
            }
            dpzb f = xkn.f(dpjbVar);
            dpyy g = xkn.g(f);
            if (f != null && (a2 = dpza.a(f.b)) != 0 && a2 == 2) {
                String string = this.b.getString(R.string.TRANSIT_OCCUPANCY_PREDICTED_BY_UGC_DISCLAIMER);
                ybzVar.B = new acpc(string, string, cqrt.g(2131232728, ibm.p()));
            }
            if (g == null) {
                return;
            }
            ybzVar.y = xkn.c(g);
            ybzVar.z = xkn.d(f, this.b);
        }
    }
}
