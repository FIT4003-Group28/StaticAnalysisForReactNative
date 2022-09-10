package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.apps.maps.R;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ynz  reason: default package */
/* loaded from: classes7.dex */
public class ynz implements yno {
    public static final /* synthetic */ int a = 0;
    private static final dcdn<dqvh, Pair<Integer, ddho>> b;
    private static final Comparator<ynq<dqvh>> c;
    private static final Comparator<ynq<drsm>> d;
    private final bvrt<dwao> e;
    private transient zrz f;
    private final yot<dqvh> g;
    private final yow h;
    private final yot<dqtz> i;
    private final yot<drsm> j;
    private transient ymn k;
    private transient yzs l;
    private transient vwv m;

    static {
        dcdg p = dcdn.p();
        p.f(dqvh.TRANSIT_VEHICLE_TYPE_BUS, new Pair(Integer.valueOf((int) R.string.TRANSIT_TYPE_FILTER_BUS), dtya.eL));
        p.f(dqvh.TRANSIT_VEHICLE_TYPE_FERRY, new Pair(Integer.valueOf((int) R.string.TRANSIT_TYPE_FILTER_FERRY), dtya.eM));
        p.f(dqvh.TRANSIT_VEHICLE_TYPE_RAIL, new Pair(Integer.valueOf((int) R.string.DIRECTIONS_TRANSIT_OPTIONS_PREFERRED_RAIL_TRANSIT_MODE_TEXT), dtya.eN));
        p.f(dqvh.TRANSIT_VEHICLE_TYPE_SUBWAY, new Pair(Integer.valueOf((int) R.string.TRANSIT_TYPE_FILTER_SUBWAY), dtya.eO));
        p.f(dqvh.TRANSIT_VEHICLE_TYPE_TRAIN, new Pair(Integer.valueOf((int) R.string.TRANSIT_TYPE_FILTER_TRAIN), dtya.eP));
        p.f(dqvh.TRANSIT_VEHICLE_TYPE_TRAM, new Pair(Integer.valueOf((int) R.string.DIRECTIONS_TRANSIT_OPTIONS_PREFERRED_TRAM_LIGHT_RAIL_TRANSIT_MODE_TEXT), dtya.eQ));
        b = p.b();
        c = dcln.a.g(ynu.a);
        d = dcln.a.g(ynv.a);
    }

    public ynz(Context context, dwao dwaoVar, douz douzVar, ymn ymnVar, yzs yzsVar, vwv vwvVar, zrz zrzVar) {
        yot<dqvh> yotVar;
        boolean z;
        boolean z2;
        boolean z3;
        yot<drsm> yotVar2;
        ddho ddhoVar;
        yot<dqtz> yotVar3;
        this.e = bvrt.b(dwaoVar);
        this.k = ymnVar;
        this.m = vwvVar;
        this.f = zrzVar;
        this.l = yzsVar;
        int i = 1;
        if (vwvVar.a()) {
            yotVar = new yot<>("", dcdc.e());
        } else {
            dcfa T = dcfc.T(c);
            dcpd<dqvh> it = b.keySet().iterator();
            while (it.hasNext()) {
                dqvh next = it.next();
                Iterator<douy> it2 = douzVar.b.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    dqvh b2 = dqvh.b(it2.next().a);
                    if (b2 == null) {
                        b2 = dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN;
                        continue;
                    }
                    if (b2 == next) {
                        z = true;
                        break;
                    }
                }
                dwbk dwbkVar = dwaoVar.f;
                Iterator<dpgs> it3 = (dwbkVar == null ? dwbk.s : dwbkVar).j.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z2 = false;
                        break;
                    }
                    dqvh b3 = dqvh.b(it3.next().b);
                    if (b3 == null) {
                        b3 = dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN;
                        continue;
                    }
                    if (b3 == next) {
                        z2 = true;
                        break;
                    }
                }
                if (z) {
                    z3 = z2;
                } else if (z2) {
                    z3 = true;
                }
                Pair<Integer, ddho> pair = b.get(next);
                dbsk.s(pair);
                T.k(new yny(this, next, context.getString(((Integer) pair.first).intValue()), (ddho) pair.second, z3));
            }
            yotVar = new yot<>(context.getString(R.string.DIRECTIONS_TRANSIT_OPTIONS_PREFERRED_MODE_CAPTION), T.f());
        }
        this.g = yotVar;
        int i2 = 2;
        if (!vwvVar.b()) {
            yotVar2 = new yot<>("", dcdc.e());
        } else {
            dcfa T2 = dcfc.T(d);
            dwbk dwbkVar2 = dwaoVar.f;
            dwbh dwbhVar = (dwbkVar2 == null ? dwbk.s : dwbkVar2).o;
            dwbg dwbgVar = (dwbhVar == null ? dwbh.g : dwbhVar).b;
            dwbgVar = dwbgVar == null ? dwbg.g : dwbgVar;
            yis yisVar = this.k.a().b;
            dcep<drsm> f = ynf.f(yisVar == null ? yis.b : yisVar);
            for (yoc yocVar : yoc.a(dwbgVar)) {
                drsm drsmVar = yocVar.g;
                String string = context.getString(yocVar.f.intValue());
                int ordinal = yocVar.ordinal();
                if (ordinal == 0) {
                    ddhoVar = dtya.eu;
                } else if (ordinal == i) {
                    ddhoVar = dtya.ev;
                } else if (ordinal == i2) {
                    ddhoVar = dtya.ew;
                } else if (ordinal == 3) {
                    ddhoVar = dtya.ex;
                } else if (ordinal != 4) {
                    throw new IllegalArgumentException();
                } else {
                    ddhoVar = dtya.ey;
                }
                T2.k(new ynw(this, drsmVar, string, ddhoVar, !f.contains(yocVar.g)));
                f = f;
                i2 = 2;
                i = 1;
            }
            yotVar2 = new yot<>(context.getString(R.string.DIRECTIONS_TRANSIT_OPTIONS_CONNECTING_MODES_CAPTION), T2.f());
        }
        this.j = yotVar2;
        boolean z4 = vwvVar.m;
        boolean j = dcft.j(douzVar.d, ynt.a);
        if (!z4 || !j) {
            yotVar3 = new yot<>("", dcdc.e());
        } else {
            dwbk dwbkVar3 = dwaoVar.f;
            boolean c2 = yyw.c((dwbkVar3 == null ? dwbk.s : dwbkVar3).m);
            dcen N = dcep.N();
            N.b(new ynx(this, dqtz.IC_FARE, context.getString(R.string.DIRECTIONS_TRANSIT_OPTIONS_SHOW_IC_FARES_OPTION_TEXT), dtya.eK, c2));
            yotVar3 = new yot<>(context.getString(R.string.DIRECTIONS_TRANSIT_OPTIONS_FARES_OPTIONS_CAPTION), N.f());
        }
        this.i = yotVar3;
        HashSet d2 = dcnm.d(zeg.BEST_ROUTE, zeg.FEWER_TRANSFERS, zeg.LESS_WALKING);
        if (!vwvVar.e) {
            d2.add(zeg.PREFER_ACCESSIBLE);
        }
        if (vwvVar.l && douzVar.e) {
            d2.add(zeg.LOWEST_COST);
        }
        dwbk dwbkVar4 = dwaoVar.f;
        dqvb b4 = dqvb.b((dwbkVar4 == null ? dwbk.s : dwbkVar4).i);
        this.h = new yow(d2, b4 == null ? dqvb.TRANSIT_BEST : b4, new yov(this) { // from class: ynr
            private final ynz a;

            {
                this.a = this;
            }

            @Override // defpackage.yov
            public final void a() {
                cqkx.p(this.a);
            }
        });
    }

    @Override // defpackage.yno
    public zeh b() {
        return this.h;
    }

    @Override // defpackage.yno
    public cqkl e() {
        dwao e = this.e.e((dssr) dwao.R.cu(7), dwao.R);
        dwbk dwbkVar = e.f;
        if (dwbkVar == null) {
            dwbkVar = dwbk.s;
        }
        dwbd ca = dwbk.s.ca(dwbkVar);
        if (!this.m.a()) {
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            ((dwbk) ca.b).j = dwbk.ck();
            for (ynq<dqvh> ynqVar : this.g.a()) {
                if (ynqVar.b().booleanValue()) {
                    dpgr bZ = dpgs.c.bZ();
                    dqvh l = ynqVar.l();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dpgs dpgsVar = (dpgs) bZ.b;
                    dpgsVar.b = l.h;
                    dpgsVar.a |= 1;
                    ca.c(bZ.bK());
                }
            }
        }
        dqvb k = this.h.k();
        if (k != null) {
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dwbk dwbkVar2 = (dwbk) ca.b;
            dwbkVar2.i = k.f;
            dwbkVar2.a |= 256;
        }
        if (this.i.c().booleanValue()) {
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            ((dwbk) ca.b).m = dwbk.ck();
            dpgm bZ2 = dpgn.c.bZ();
            dqtz dqtzVar = dqtz.IC_FARE;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpgn dpgnVar = (dpgn) bZ2.b;
            dpgnVar.b = dqtzVar.d;
            dpgnVar.a |= 1;
            dpgn bK = bZ2.bK();
            dpgm bZ3 = dpgn.c.bZ();
            dqtz dqtzVar2 = dqtz.NORMAL_FARE;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dpgn dpgnVar2 = (dpgn) bZ3.b;
            dpgnVar2.b = dqtzVar2.d;
            dpgnVar2.a |= 1;
            dpgn bK2 = bZ3.bK();
            if (((ynq) dcft.c(this.i.a())).b().booleanValue()) {
                ca.b(bK);
                ca.b(bK2);
            } else {
                ca.b(bK2);
                ca.b(bK);
            }
        }
        if (this.j.c().booleanValue()) {
            yir bZ4 = yis.b.bZ();
            EnumSet noneOf = EnumSet.noneOf(drsm.class);
            yip bZ5 = yiq.c.bZ();
            for (ynq<drsm> ynqVar2 : this.j.a()) {
                noneOf.add(ynqVar2.l());
                if (!ynqVar2.b().booleanValue()) {
                    drsm l2 = ynqVar2.l();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    yiq yiqVar = (yiq) bZ5.b;
                    yiqVar.b = Integer.valueOf(l2.j);
                    yiqVar.a = 2;
                    bZ4.b(bZ5.bK());
                }
            }
            yis yisVar = this.k.a().b;
            if (yisVar == null) {
                yisVar = yis.b;
            }
            for (yiq yiqVar2 : yisVar.a) {
                if (yiqVar2.a == 2) {
                    drsm b2 = drsm.b(((Integer) yiqVar2.b).intValue());
                    if (b2 == null) {
                        b2 = drsm.UNSPECIFIED_NON_TRANSIT_MODE;
                    }
                    if (!noneOf.contains(b2)) {
                    }
                }
                bZ4.b(yiqVar2);
            }
            yis bK3 = bZ4.bK();
            this.k.e(bK3);
            dwbh b3 = this.l.b(bK3);
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dwbk dwbkVar3 = (dwbk) ca.b;
            b3.getClass();
            dwbkVar3.o = b3;
            dwbkVar3.a |= 32768;
        }
        zrz zrzVar = this.f;
        dwal ca2 = dwao.R.ca(e);
        if (ca2.c) {
            ca2.bF();
            ca2.c = false;
        }
        dwao dwaoVar = (dwao) ca2.b;
        dwbk bK4 = ca.bK();
        bK4.getClass();
        dwaoVar.f = bK4;
        dwaoVar.a |= 2;
        zrzVar.w(ca2.bK());
        return cqkl.a;
    }

    @Override // defpackage.yno
    public cqkl f() {
        this.f.x();
        return cqkl.a;
    }

    @Override // defpackage.yno
    public void g(zrz zrzVar, ymn ymnVar, yzs yzsVar, vwv vwvVar) {
        this.f = zrzVar;
        this.k = ymnVar;
        this.l = yzsVar;
        this.m = vwvVar;
        this.h.h(new yov(this) { // from class: yns
            private final ynz a;

            {
                this.a = this;
            }

            @Override // defpackage.yov
            public final void a() {
                cqkx.p(this.a);
            }
        });
    }

    @Override // defpackage.yno
    /* renamed from: h */
    public yot<dqvh> a() {
        return this.g;
    }

    @Override // defpackage.yno
    /* renamed from: i */
    public yot<dqtz> c() {
        return this.i;
    }

    @Override // defpackage.yno
    /* renamed from: j */
    public yot<drsm> d() {
        return this.j;
    }
}
