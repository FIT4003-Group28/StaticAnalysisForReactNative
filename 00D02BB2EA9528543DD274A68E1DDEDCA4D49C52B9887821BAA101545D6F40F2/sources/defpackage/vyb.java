package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vyb  reason: default package */
/* loaded from: classes7.dex */
public final class vyb {
    private static final dcdn<dpbw, donz> a = dcdn.n(dpbw.ON_TIME, donz.ON_TIME, dpbw.EARLY, donz.CHANGED, dpbw.LATE, donz.CHANGED, dpbw.REALTIME_ONLY, donz.ON_TIME);

    public static String A(Resources resources, amve amveVar, @dzsi dgas dgasVar) {
        bvsz bvszVar;
        if (dgasVar == null || (dgasVar.a & 1) == 0) {
            return "";
        }
        int i = dgasVar.b;
        dqvj c = dqvj.c(amveVar.b().b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        dpbw dpbwVar = dpbw.UNKNOWN;
        dpej dpejVar = dpej.DELAY_NODATA;
        int ordinal = c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                bvszVar = bvsz.ONE_DIRECTION_TAB_TRANSIT;
            } else if (ordinal != 5) {
                bvszVar = bvsz.ONE_DIRECTION_TAB_DEFAULT;
            }
            return bvtb.e(resources, i, bvszVar).toString();
        }
        bvszVar = bvsz.ONE_DIRECTION_TAB_DRIVE;
        return bvtb.e(resources, i, bvszVar).toString();
    }

    @dzsi
    public static String B(Context context, amve amveVar) {
        if ((amveVar.n().a & 2) != 0) {
            return context.getString(R.string.TRANSIT_EVERY, amveVar.n().c);
        }
        return null;
    }

    @dzsi
    public static dgas C(amve amveVar) {
        dpie dpieVar = amveVar.a;
        if ((dpieVar.a & 2048) != 0) {
            dgas dgasVar = dpieVar.n;
            return dgasVar == null ? dgas.e : dgasVar;
        }
        return null;
    }

    public static boolean D(amve amveVar) {
        if (amveVar.c()) {
            dqvj c = dqvj.c(amveVar.b().b);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            return c == dqvj.TRANSIT;
        }
        return false;
    }

    @dzsi
    public static amuq E(amve amveVar) {
        if (!D(amveVar)) {
            return null;
        }
        int e = amveVar.e();
        for (int i = 0; i < e; i++) {
            amtr d = amveVar.d(i);
            int e2 = d.e();
            for (int i2 = 0; i2 < e2; i2++) {
                amuq d2 = d.d(i2);
                dqvj c = dqvj.c(d2.a().b);
                if (c == null) {
                    c = dqvj.DRIVE;
                }
                if (c == dqvj.TRANSIT) {
                    return d2;
                }
            }
        }
        return null;
    }

    @dzsi
    public static String F(Context context, long j) {
        if (j > 0) {
            return DateUtils.formatDateTime(context, j, 98331);
        }
        return null;
    }

    @dzsi
    public static CharSequence G(Context context, dphe dpheVar) {
        dpgw dpgwVar = dpheVar.c;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        if ((dpgwVar.a & 16) != 0) {
            dgaw dgawVar = dpgwVar.f;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
            String h = bvtb.h(context, dgawVar);
            bvsx bvsxVar = new bvsx(context.getResources());
            dpbw dpbwVar = dpbw.UNKNOWN;
            dpej dpejVar = dpej.DELAY_NODATA;
            dqvj dqvjVar = dqvj.DRIVE;
            dpbw b = dpbw.b(dpgwVar.p);
            if (b == null) {
                b = dpbw.UNKNOWN;
            }
            int ordinal = b.ordinal();
            if (ordinal == 1) {
                bvsv a2 = bvsxVar.a(h);
                a2.l(irg.u().b(context));
                a2.i();
                return a2.c();
            } else if (ordinal != 2 && ordinal != 3) {
                return h;
            } else {
                bvsu c = bvsxVar.c(R.string.TRANSIT_REALTIME_DEPARTURE_TIME);
                bvsv a3 = bvsxVar.a(h);
                a3.l(irg.y().b(context));
                a3.i();
                c.a(a3);
                return c.c();
            }
        }
        return null;
    }

    @dzsi
    public static String H(Context context, amve amveVar, boolean z) {
        int i;
        if (!amveVar.c()) {
            return null;
        }
        dpci dpciVar = amveVar.b().f;
        if (dpciVar == null) {
            dpciVar = dpci.i;
        }
        dgaw dgawVar = dpciVar.b;
        if (dgawVar == null) {
            dgawVar = dgaw.g;
        }
        dgaw dgawVar2 = dpciVar.c;
        if (dgawVar2 == null) {
            dgawVar2 = dgaw.g;
        }
        if ((dgawVar.a & 1) == 0 || (i = dgawVar2.a & 1) == 0) {
            return null;
        }
        return (!z || i == 0) ? bvtb.p(dgawVar.b, vxs.c(dgawVar), dgawVar2.b, vxs.c(dgawVar2)) : context.getString(R.string.ARRIVE_AT_TIME, bvtb.h(context, dgawVar2));
    }

    @dzsi
    public static CharSequence I(Context context, amve amveVar, long j, boolean z) {
        amuq amuqVar;
        dpej dpejVar;
        if (!amveVar.c()) {
            return null;
        }
        dpci dpciVar = amveVar.b().f;
        if (dpciVar == null) {
            dpciVar = dpci.i;
        }
        dgaw dgawVar = dpciVar.e;
        if (dgawVar == null) {
            dgawVar = dgaw.g;
        }
        dgaw dgawVar2 = dpciVar.f;
        if (dgawVar2 == null) {
            dgawVar2 = dgaw.g;
        }
        if ((dgawVar.a & 1) == 0 || (dgawVar2.a & 1) == 0) {
            return null;
        }
        vxg vxgVar = new vxg(amveVar);
        vxe vxeVar = vxgVar.a;
        if (vxeVar == null || (amuqVar = vxeVar.a) == null || !vxg.g(amuqVar)) {
            if (!vxgVar.h(false)) {
                long j2 = dgawVar.b;
                eaou c = vxs.c(dgawVar);
                long j3 = dgawVar2.b;
                eaou c2 = vxs.c(dgawVar2);
                eaol eaolVar = new eaol(j, c);
                eaol eaolVar2 = new eaol(TimeUnit.SECONDS.toMillis(j2), c);
                eaol eaolVar3 = new eaol(TimeUnit.SECONDS.toMillis(j3), c2);
                eaom eaomVar = eaom.a;
                return (eaomVar.compare(eaolVar, eaolVar2) == 0 && eaomVar.compare(eaolVar, eaolVar3) == 0) ? String.format("%s – %s", bvtb.l(j2, c), bvtb.l(j3, c2)) : eaomVar.compare(eaolVar, eaolVar2) == 0 ? String.format("%s – %s (%s)", bvtb.l(j2, c), bvtb.l(j3, c2), vya.a(j3, c2)) : eaomVar.compare(eaolVar2, eaolVar3) == 0 ? String.format("%s (%s) – %s", bvtb.l(j2, c), vya.a(j2, c), bvtb.l(j3, c2)) : String.format("%s (%s) – %s (%s)", bvtb.l(j2, c), vya.a(j2, c), bvtb.l(j3, c2), vya.a(j3, c2));
            }
            return ab(context, dgawVar.b, vxs.c(dgawVar));
        }
        if (!z) {
            vxe vxeVar2 = vxgVar.a;
            if (vxeVar2 == null) {
                dpejVar = dpej.DELAY_NODATA;
            } else {
                amuq amuqVar2 = vxeVar2.a;
                if (amuqVar2 == null || !vxg.g(amuqVar2)) {
                    amuq amuqVar3 = vxgVar.a.b;
                    if (amuqVar3 == null || !vxg.g(amuqVar3)) {
                        dpejVar = dpej.DELAY_NODATA;
                    } else {
                        dpejVar = vxg.i(vxgVar.a.b);
                    }
                } else {
                    dpejVar = vxg.i(vxgVar.a.a);
                }
            }
            String j4 = j(context, dpejVar);
            if (j4 != null) {
                bvsv a2 = new bvsx(context.getResources()).a(context.getString(R.string.LEAVE_BY_TIME, bvtb.l(dgawVar.b, vxs.c(dgawVar))));
                a2.g(" · ");
                a2.g(j4);
                return a2.c();
            }
        }
        return ab(context, dgawVar.b, vxs.c(dgawVar));
    }

    @dzsi
    public static String J(Context context, amve amveVar) {
        dpej dpejVar;
        vxg vxgVar = new vxg(amveVar);
        vxe vxeVar = vxgVar.a;
        if (vxeVar == null) {
            dpejVar = dpej.DELAY_NODATA;
        } else {
            amuq amuqVar = vxeVar.b;
            if (amuqVar == null || !vxg.g(amuqVar)) {
                amuq amuqVar2 = vxgVar.a.a;
                if (amuqVar2 == null || !vxg.g(amuqVar2)) {
                    dpejVar = dpej.DELAY_NODATA;
                } else {
                    dpejVar = vxg.i(vxgVar.a.a);
                }
            } else {
                dpejVar = vxg.i(vxgVar.a.b);
            }
        }
        return j(context, dpejVar);
    }

    @dzsi
    public static donz K(dpht dphtVar, dpbw dpbwVar) {
        if (dbsd.a(dphtVar, dpht.CANCELLED)) {
            return donz.CANCELED;
        }
        return a.get(dpbwVar);
    }

    public static boolean L(amve[] amveVarArr) {
        for (amve amveVar : amveVarArr) {
            int g = amveVar.g();
            boolean z = false;
            for (int i = 0; i < g; i++) {
                z |= dbqa.e(amveVar.a.l.get(i), "JP");
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static boolean M(amve amveVar) {
        return (amveVar.a.a & 1024) != 0 && amveVar.o() == dpht.CANCELLED;
    }

    public static String N(Context context, amub amubVar) {
        dpbw dpbwVar = dpbw.UNKNOWN;
        dpej dpejVar = dpej.DELAY_NODATA;
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = amubVar.h.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                String str = amubVar.p;
                return dbsj.d(str) ? "" : context.getString(R.string.VIA_ROADS_IN_BICYCLING, str);
            } else if (ordinal == 2) {
                String str2 = amubVar.p;
                return dbsj.d(str2) ? "" : context.getString(R.string.VIA_ROADS_IN_WALKING, str2);
            } else if (ordinal == 5) {
                dpej N = amubVar.N();
                String str3 = amubVar.p;
                if (dbsj.d(str3)) {
                    return k(context, N);
                }
                int ordinal2 = N.ordinal();
                if (ordinal2 == 1) {
                    return context.getString(R.string.VIA_HEAVY_TRAFFIC_ROADS_IN_TWO_WHEELER, str3);
                }
                if (ordinal2 == 2) {
                    return context.getString(R.string.VIA_NORMAL_TRAFFIC_ROADS_IN_TWO_WHEELER, str3);
                }
                if (ordinal2 == 3) {
                    return context.getString(R.string.VIA_LIGHT_TRAFFIC_ROADS_IN_TWO_WHEELER, str3);
                }
                return context.getString(R.string.VIA_ROADS_IN_TWO_WHEELER, str3);
            } else {
                throw new IllegalArgumentException();
            }
        }
        return m(context, amubVar.N(), amubVar.p);
    }

    public static List<String> O(amve amveVar) {
        dsrj<dozz> dsrjVar;
        ArrayList a2 = dchl.a();
        if (amveVar.p()) {
            a2.addAll(alca.j(amveVar.q()));
        }
        if (amveVar.f().c) {
            dsrjVar = amveVar.f().e;
        } else {
            dsrjVar = amveVar.f().d;
        }
        for (dozz dozzVar : dsrjVar) {
            a2.addAll(alca.j(dozzVar));
        }
        return a2;
    }

    public static Set<String> P(amve amveVar) {
        HashSet hashSet = new HashSet();
        if (amveVar.c()) {
            ac(amveVar.b(), hashSet);
        }
        for (int i = 0; i < amveVar.e(); i++) {
            amtr d = amveVar.d(i);
            if (d.b()) {
                ac(d.a(), hashSet);
            }
            for (int i2 = 0; i2 < d.e(); i2++) {
                amuq d2 = d.d(i2);
                if (d2.b()) {
                    ac(d2.a(), hashSet);
                }
                for (int i3 = 0; i3 < d2.d(); i3++) {
                    dpec dpecVar = d2.a.d.get(i3).c;
                    if (dpecVar == null) {
                        dpecVar = dpec.o;
                    }
                    if (dpecVar != null) {
                        ac(dpecVar, hashSet);
                    }
                }
            }
        }
        return hashSet;
    }

    @dzsi
    public static dozz Q(amve amveVar, @dzsi Set<dozy> set) {
        int e = amveVar.e();
        dozz dozzVar = null;
        for (int i = 0; i < e; i++) {
            amtr d = amveVar.d(i);
            int e2 = d.e();
            for (int i2 = 0; i2 < e2; i2++) {
                dpec a2 = d.d(i2).a();
                int size = a2.j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    dozz dozzVar2 = a2.j.get(i3);
                    if ((dozzVar2.a & 8) != 0) {
                        dozy b = dozy.b(dozzVar2.f);
                        if (b == null) {
                            b = dozy.UNKNOWN;
                        }
                        if (set.contains(b)) {
                        }
                    }
                    if (dozzVar == null || alca.y(R(dozzVar2), R(dozzVar))) {
                        dozzVar = dozzVar2;
                    }
                }
            }
        }
        return dozzVar;
    }

    public static doza R(dozz dozzVar) {
        if ((dozzVar.a & 4) != 0) {
            doza b = doza.b(dozzVar.e);
            return b == null ? doza.INFORMATION : b;
        }
        return doza.ALERT;
    }

    @dzsi
    public static String S(dozz dozzVar) {
        int i = dozzVar.a;
        if ((i & 16) != 0) {
            return dozzVar.g;
        }
        if ((i & 32) == 0) {
            return null;
        }
        return dozzVar.h;
    }

    @dzsi
    public static jhk T(dphe dpheVar, vtj vtjVar) {
        String str;
        String str2;
        if ((dpheVar.a & 256) != 0) {
            dpce dpceVar = dpheVar.i;
            if (dpceVar == null) {
                dpceVar = dpce.f;
            }
            String a2 = alcf.a(dpceVar);
            str = alcf.c(dpceVar);
            str2 = a2;
        } else {
            str = null;
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        return new jhk(str2, vtjVar, dbsg.j(str), dbpy.a, dbpy.a);
    }

    @dzsi
    public static Integer U(dphe dpheVar) {
        int c = bvoa.c(dpheVar.f, 0);
        if (c == 0) {
            return null;
        }
        return Integer.valueOf(c);
    }

    @dzsi
    public static vxz V(dpbw dpbwVar) {
        if (dpbwVar == dpbw.UNKNOWN) {
            return null;
        }
        if (dpbwVar == dpbw.REALTIME_ONLY) {
            return vxz.REALTIME_DATA_AVAILABLE;
        }
        return dpbwVar == dpbw.ON_TIME ? vxz.ON_TIME : vxz.CHANGED;
    }

    @dzsi
    public static dgas W(amtr... amtrVarArr) {
        int i;
        int i2 = 0;
        int i3 = 0;
        for (amtr amtrVar : amtrVarArr) {
            dgas e = vxp.e(amtrVar.a());
            if (e == null) {
                return null;
            }
            int i4 = e.b;
            i2 += i4;
            i3 = ((e.a & 4) == 0 || (i = e.d) <= 0) ? i3 + i4 : i3 + i;
        }
        dgar bZ = dgas.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgas dgasVar = (dgas) bZ.b;
        int i5 = dgasVar.a | 1;
        dgasVar.a = i5;
        dgasVar.b = i2;
        dgasVar.a = i5 | 4;
        dgasVar.d = i3;
        return bZ.bK();
    }

    @dzsi
    public static CharSequence X(vxw vxwVar, List<vwt> list, @dzsi String str, @dzsi String str2, Context context) {
        bvsu bvsuVar;
        bvsu bvsuVar2;
        bvsv b = vxwVar.b(list, context);
        if (b != null && str2 != null) {
            bvsx bvsxVar = new bvsx(context.getResources());
            bvsv a2 = bvsxVar.a(b.c());
            a2.g(" ");
            bvsu c = bvsxVar.c(R.string.TRANSIT_FROM_STATION);
            c.a(str2);
            a2.f(c);
            return a2.c();
        } else if (b == null) {
            bvsx bvsxVar2 = new bvsx(context.getResources());
            if (str != null) {
                bvsuVar = bvsxVar2.c(R.string.TRANSIT_EVERY);
                bvsuVar.a(str);
            } else {
                bvsuVar = null;
            }
            if (str2 != null) {
                bvsuVar2 = bvsxVar2.c(R.string.TRANSIT_FROM_STATION);
                bvsuVar2.a(str2);
            } else {
                bvsuVar2 = null;
            }
            if (bvsuVar != null && bvsuVar2 != null) {
                bvsu c2 = bvsxVar2.c(R.string.TRANSIT_PERIODICITY_WITH_FROM_STATION);
                c2.a(bvsuVar, bvsuVar2);
                return c2.c();
            } else if (bvsuVar != null) {
                return bvsuVar.c();
            } else {
                if (bvsuVar2 != null) {
                    return bvsuVar2.c();
                }
                return null;
            }
        } else {
            return b.c();
        }
    }

    public static int Y(@dzsi dpej dpejVar, boolean z) {
        if (dpejVar == null) {
            dpejVar = dpej.DELAY_NODATA;
        }
        if (z) {
            dpbw dpbwVar = dpbw.UNKNOWN;
            dqvj dqvjVar = dqvj.DRIVE;
            int ordinal = dpejVar.ordinal();
            return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? R.color.directions_unknowntraffic_nightmode_text : R.color.directions_greentraffic_nightmode_text : R.color.directions_yellowtraffic_nightmode_text : R.color.directions_redtraffic_nightmode_text;
        }
        dpbw dpbwVar2 = dpbw.UNKNOWN;
        dqvj dqvjVar2 = dqvj.DRIVE;
        int ordinal2 = dpejVar.ordinal();
        return ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? R.color.directions_unknowntraffic_text : R.color.directions_greentraffic_text : R.color.directions_yellowtraffic_text : R.color.directions_redtraffic_text;
    }

    public static void Z(@dzsi amub amubVar) {
        if (amubVar != null) {
            dqvj dqvjVar = dqvj.TRANSIT;
        }
        if (amubVar != null) {
            dqvj dqvjVar2 = dqvj.DRIVE;
        }
        if (amubVar != null) {
            dqvj dqvjVar3 = dqvj.DRIVE;
        }
    }

    public static dcdc<vwt> a(List<doyp> list) {
        return dcbg.b(list).s(vxy.a).z();
    }

    private static dpec aa(amve amveVar) {
        return amveVar.e() > 1 ? amveVar.d(0).a() : amveVar.b();
    }

    private static CharSequence ab(Context context, long j, eaou eaouVar) {
        return context.getString(R.string.LEAVE_BY_TIME, bvtb.l(j, eaouVar));
    }

    private static void ac(@dzsi dpec dpecVar, Set<String> set) {
        if (dpecVar == null || dpecVar.j.size() <= 0) {
            return;
        }
        for (dozz dozzVar : dpecVar.j) {
            set.addAll(alca.j(dozzVar));
        }
    }

    @dzsi
    public static dqvj b(amve amveVar) {
        if ((amveVar.b().a & 1) != 0) {
            dqvj c = dqvj.c(amveVar.b().b);
            return c == null ? dqvj.DRIVE : c;
        }
        return null;
    }

    @dzsi
    public static String c(Context context, dqvj dqvjVar) {
        dpbw dpbwVar = dpbw.UNKNOWN;
        dpej dpejVar = dpej.DELAY_NODATA;
        int ordinal = dqvjVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return context.getString(R.string.BICYCLING_TRAVEL_MODE_LABEL);
            }
            if (ordinal == 2) {
                return context.getString(R.string.WALKING_TRAVEL_MODE_LABEL);
            }
            if (ordinal == 3) {
                return context.getString(R.string.TRANSIT_TRAVEL_MODE_LABEL);
            }
            if (ordinal == 5) {
                return context.getString(R.string.TWO_WHEELER_TRAVEL_MODE_LABEL);
            }
            if (ordinal == 8) {
                return context.getString(R.string.BIKESHARING_TRAVEL_MODE_LABEL);
            }
            return null;
        }
        return context.getString(R.string.DRIVING_TRAVEL_MODE_LABEL);
    }

    public static dpej d(amve amveVar) {
        doxd doxdVar = amveVar.b().k;
        if (doxdVar == null) {
            doxdVar = doxd.l;
        }
        if ((doxdVar.a & 4) == 0) {
            return dpej.DELAY_NODATA;
        }
        doxd doxdVar2 = amveVar.b().k;
        if (doxdVar2 == null) {
            doxdVar2 = doxd.l;
        }
        dpej b = dpej.b(doxdVar2.c);
        return b == null ? dpej.DELAY_NODATA : b;
    }

    public static dpej e(amve amveVar) {
        doxd doxdVar;
        if (amveVar.e() > 1) {
            doxdVar = amveVar.d(0).a().k;
            if (doxdVar == null) {
                doxdVar = doxd.l;
            }
        } else {
            doxdVar = amveVar.b().k;
            if (doxdVar == null) {
                doxdVar = doxd.l;
            }
        }
        if ((doxdVar.a & 4) != 0) {
            dpej b = dpej.b(doxdVar.c);
            return b == null ? dpej.DELAY_NODATA : b;
        }
        return dpej.DELAY_NODATA;
    }

    @dzsi
    public static String f(@dzsi amve amveVar) {
        String str = null;
        if (amveVar != null && amveVar.c() && (amveVar.b().a & 2) != 0) {
            str = amveVar.b().c;
        }
        return dbsj.f(str);
    }

    @dzsi
    public static String g(@dzsi amve amveVar) {
        if (amveVar == null) {
            return null;
        }
        return dbsj.f(aa(amveVar).c);
    }

    public static int h(Resources resources, @dzsi dpej dpejVar, boolean z) {
        return resources.getColor(Y(dpejVar, z));
    }

    public static CharSequence i(Resources resources, CharSequence charSequence, dpej dpejVar, boolean z) {
        if (dpejVar == dpej.DELAY_NODATA) {
            return charSequence;
        }
        int h = h(resources, dpejVar, z);
        bvsv a2 = new bvsx(resources).a(charSequence);
        a2.l(h);
        return a2.c();
    }

    @dzsi
    public static String j(Context context, dpej dpejVar) {
        dpbw dpbwVar = dpbw.UNKNOWN;
        dpej dpejVar2 = dpej.DELAY_NODATA;
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = dpejVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return context.getString(R.string.NORMAL_TRAFFIC);
            }
            if (ordinal == 3) {
                return context.getString(R.string.LIGHT_TRAFFIC);
            }
            return null;
        }
        return context.getString(R.string.HEAVY_TRAFFIC);
    }

    public static String k(Context context, dpej dpejVar) {
        dpbw dpbwVar = dpbw.UNKNOWN;
        dpej dpejVar2 = dpej.DELAY_NODATA;
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = dpejVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return context.getString(R.string.ROUTE_WITH_NORMAL_TRAFFIC);
            }
            return ordinal != 3 ? "" : context.getString(R.string.ROUTE_WITH_LIGHT_TRAFFIC);
        }
        return context.getString(R.string.ROUTE_WITH_HEAVY_TRAFFIC);
    }

    public static String l(Context context, dpej dpejVar, @dzsi String str) {
        if (dbsj.d(str)) {
            return k(context, dpejVar);
        }
        dpbw dpbwVar = dpbw.UNKNOWN;
        dpej dpejVar2 = dpej.DELAY_NODATA;
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = dpejVar.ordinal();
        if (ordinal == 1) {
            return context.getString(R.string.VIA_HEAVY_TRAFFIC_ROADS, str);
        }
        if (ordinal == 2) {
            return context.getString(R.string.VIA_NORMAL_TRAFFIC_ROADS, str);
        }
        if (ordinal == 3) {
            return context.getString(R.string.VIA_LIGHT_TRAFFIC_ROADS, str);
        }
        return context.getString(R.string.VIA_ROADS, str);
    }

    public static String m(Context context, dpej dpejVar, @dzsi String str) {
        if (dbsj.d(str)) {
            return k(context, dpejVar);
        }
        dpbw dpbwVar = dpbw.UNKNOWN;
        dpej dpejVar2 = dpej.DELAY_NODATA;
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = dpejVar.ordinal();
        if (ordinal == 1) {
            return context.getString(R.string.VIA_HEAVY_TRAFFIC_ROADS_IN_DRIVING, str);
        }
        if (ordinal == 2) {
            return context.getString(R.string.VIA_NORMAL_TRAFFIC_ROADS_IN_DRIVING, str);
        }
        if (ordinal == 3) {
            return context.getString(R.string.VIA_LIGHT_TRAFFIC_ROADS_IN_DRIVING, str);
        }
        return context.getString(R.string.VIA_ROADS_IN_DRIVING, str);
    }

    @dzsi
    public static String n(Context context, bvsl bvslVar, amve amveVar) {
        String str = null;
        if (amveVar.c() && amveVar.e() > 0) {
            dpec b = amveVar.b();
            dqvj c = dqvj.c(b.b);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            if (c == dqvj.TRANSIT) {
                amuq E = E(amveVar);
                bvsi bvsiVar = new bvsi(context);
                if (E != null) {
                    dpgw dpgwVar = E.g().c;
                    if (dpgwVar == null) {
                        dpgwVar = dpgw.r;
                    }
                    String str2 = dpgwVar.b;
                    CharSequence G = G(context, E.g());
                    if (G != null) {
                        if (str2.isEmpty()) {
                            str2 = context.getString(R.string.ACCESSIBILITY_NEXT_DEPARTURES_AT, G.toString());
                        } else {
                            str2 = context.getString(R.string.ACCESSIBILITY_NEXT_DEPARTURES_AT_WITH_STATION, str2, G.toString());
                        }
                    }
                    bvsiVar.d(str2);
                }
                if ((b.a & 1024) != 0) {
                    dquh dquhVar = b.m;
                    if (dquhVar == null) {
                        dquhVar = dquh.c;
                    }
                    if ((2 & dquhVar.a) != 0) {
                        str = dquhVar.b;
                    }
                }
                bvsiVar.d(str);
                bvsiVar.d(vxp.b(b, context.getResources(), bvsz.ABBREVIATED));
                return bvsiVar.toString();
            } else if (c == dqvj.WALK) {
                return vxp.a(bvslVar, b);
            }
        }
        return null;
    }

    public static boolean o(@dzsi amve amveVar) {
        if (amveVar == null) {
            return false;
        }
        return vxp.c(amveVar.b());
    }

    public static dbsg<doxk> p(@dzsi amve amveVar) {
        if (amveVar == null) {
            return dbpy.a;
        }
        for (doxk doxkVar : amveVar.u().a) {
            int a2 = doxj.a(doxkVar.b);
            if (a2 != 0 && a2 == 2 && doxkVar.a.size() > 0) {
                return dbsg.i(doxkVar);
            }
        }
        return dbpy.a;
    }

    public static boolean q(@dzsi amve amveVar) {
        if (amveVar == null) {
            return false;
        }
        return vxp.c(aa(amveVar));
    }

    public static boolean r(amve amveVar) {
        return amveVar != null && vxp.d(amveVar.b());
    }

    public static boolean s(@dzsi amve amveVar) {
        if (amveVar == null) {
            return false;
        }
        return vxp.d(aa(amveVar));
    }

    @dzsi
    @Deprecated
    public static cjtd t(@dzsi amve amveVar) {
        String str = null;
        if (amveVar == null || (!amveVar.j() && !amveVar.l())) {
            return null;
        }
        cjta b = cjtd.b();
        if (amveVar.l()) {
            str = amveVar.m();
        }
        b.g(str);
        return b.d();
    }

    public static cjtd u(amve amveVar, ddho ddhoVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        if (amveVar.l()) {
            b.g(amveVar.m());
        }
        return b.a();
    }

    public static boolean v(amve amveVar) {
        return amveVar.c() && (amveVar.b().a & 32) != 0;
    }

    public static List<dpgh> w(amve amveVar) {
        dpgy dpgyVar = amveVar.b().g;
        if (dpgyVar == null) {
            dpgyVar = dpgy.c;
        }
        return dpgyVar.b;
    }

    @dzsi
    public static dgas x(@dzsi amve amveVar) {
        if (amveVar == null) {
            return null;
        }
        dqvj c = dqvj.c(amveVar.b().b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        if (c != dqvj.TRANSIT || (amveVar.w().a & 1) == 0) {
            if (c == dqvj.FLY) {
                doxr doxrVar = amveVar.b().l;
                if (doxrVar == null) {
                    doxrVar = doxr.k;
                }
                if ((doxrVar.a & 64) != 0) {
                    doxr doxrVar2 = amveVar.b().l;
                    if (doxrVar2 == null) {
                        doxrVar2 = doxr.k;
                    }
                    dgas dgasVar = doxrVar2.h;
                    return dgasVar == null ? dgas.e : dgasVar;
                }
            }
            return vxp.e(amveVar.b());
        }
        dgas dgasVar2 = amveVar.w().b;
        return dgasVar2 == null ? dgas.e : dgasVar2;
    }

    @dzsi
    public static dgas y(@dzsi amve amveVar) {
        if (amveVar == null) {
            return null;
        }
        return vxp.e(aa(amveVar));
    }

    public static String z(Resources resources, amve amveVar) {
        return A(resources, amveVar, y(amveVar));
    }
}
