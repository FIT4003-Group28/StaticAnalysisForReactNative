package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: vtw  reason: default package */
/* loaded from: classes7.dex */
public final class vtw implements amjm, alwb {
    private boolean B;
    private final boolean C;
    private final boolean D;
    private final boolean E;
    private alwc F;
    private final albl G;
    private final Rect H;
    @dzsi
    private alga J;
    private final bvrb K;
    public btrm a;
    public vtr b;
    public final boolean c;
    public final boolean d;
    private final akoq e;
    private final Resources f;
    private Context g;
    private akzh h;
    private boolean i;
    @dzsi
    private amuj j;
    @dzsi
    private aufb k;
    @dzsi
    private volatile amii l;
    private final List<vuj> m;
    @dzsi
    private final vty n;
    private final dcdc<vtv> p;
    private alez r;
    private final algf s;
    private final dcdc<alfz> w;
    private alfb z;
    private final Object o = new Object();
    private final Set<alez> q = new HashSet();
    private dcdn<amrc, Boolean> t = dcmn.a;
    private final Map<alez, Integer> u = dcjz.d();
    private final Map<alez, Integer> v = dcjz.d();
    private dcdc<amrc> x = dcdc.e();
    private alfa y = alfa.SHOW_ALTERNATES_ONLY;
    private boolean A = false;
    private volatile boolean I = true;

    /* JADX WARN: Removed duplicated region for block: B:76:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vtw(defpackage.albl r19, android.content.res.Resources r20, @defpackage.dzsi defpackage.amuo r21, defpackage.akoq r22, java.util.List<defpackage.vuj> r23, boolean r24, boolean r25, boolean r26, boolean r27, android.graphics.Rect r28, defpackage.atln r29, defpackage.algf r30, boolean r31, defpackage.bvrb r32, boolean r33, defpackage.alfb r34) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtw.<init>(albl, android.content.res.Resources, amuo, akoq, java.util.List, boolean, boolean, boolean, boolean, android.graphics.Rect, atln, algf, boolean, bvrb, boolean, alfb):void");
    }

    private final void l() {
        amii amiiVar = this.l;
        if (amiiVar != null) {
            amiiVar.k(this);
        }
    }

    private final void m() {
        boolean z;
        int i;
        dcdc<vtv> dcdcVar;
        int i2;
        int i3;
        alez alezVar;
        synchronized (this.o) {
            if (this.l != null && this.h != null && this.g != null && this.F != null) {
                if (this.t.size() != this.p.size()) {
                    dcdg p = dcdn.p();
                    dcdc<vtv> dcdcVar2 = this.p;
                    int size = dcdcVar2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            z = false;
                            break;
                        }
                        amub amubVar = dcdcVar2.get(i4).a.e;
                        if (amubVar != null && amubVar.al()) {
                            z = true;
                            break;
                        }
                        i4++;
                    }
                    vtr vtrVar = this.b;
                    if (vtrVar != null) {
                        vtrVar.a(dcft.o(this.p, vts.a));
                    }
                    dcdc<vtv> dcdcVar3 = this.p;
                    int size2 = dcdcVar3.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        vtv vtvVar = dcdcVar3.get(i5);
                        alez alezVar2 = vtvVar.a;
                        if (this.u.containsKey(alezVar2)) {
                            boolean contains = this.q.contains(alezVar2);
                            boolean z2 = alezVar2.e.K == amtz.OFFLINE;
                            int intValue = this.u.get(alezVar2).intValue();
                            if (this.z != alfb.DISTANCE) {
                                i = 0;
                            } else if (this.v.containsKey(alezVar2)) {
                                i = this.v.get(alezVar2).intValue();
                            }
                            boolean z3 = this.C && !contains && (alezVar = this.r) != null && this.u.containsKey(alezVar);
                            if (this.z == alfb.DISTANCE) {
                                z3 &= this.v.containsKey(this.r);
                            }
                            boolean z4 = z3;
                            if (z4) {
                                Integer num = this.u.get(this.r);
                                dbsk.s(num);
                                intValue -= num.intValue();
                                if (this.z == alfb.DISTANCE) {
                                    Integer num2 = this.v.get(this.r);
                                    dbsk.s(num2);
                                    i -= num2.intValue();
                                }
                            }
                            int i6 = intValue;
                            int i7 = i;
                            algf algfVar = this.s;
                            Context context = this.g;
                            dbsk.s(context);
                            dcdcVar = dcdcVar3;
                            i2 = size2;
                            i3 = i5;
                            aktc d = this.e.aC().d(algfVar.b(context, this.y, alezVar2, this.z, contains, this.D, alez.b(this.f, vtvVar.b), i6, i7, this.B, z4, this.C, this.A, z2, z), dmti.WORLD_ENCODING_LAT_LNG_E7);
                            d.Pt(new vtt(this, alezVar2));
                            vtu vtuVar = new vtu(this, alezVar2);
                            ArrayList a = dchl.a();
                            ArrayList a2 = dchl.a();
                            for (amtu amtuVar : this.G.a) {
                                if (amtuVar.j() && amtuVar.l() != null) {
                                    amub l = amtuVar.l();
                                    Collections.addAll(a2, l.o);
                                    akrk w = l.w();
                                    if (amtuVar.i()) {
                                        a.add(0, w);
                                    } else {
                                        a.add(w);
                                    }
                                }
                            }
                            alge b = alge.b(alezVar2, a, new alfx(this.H, a2), dbsg.i(vtuVar));
                            amrb g = amrc.g();
                            g.b(d);
                            g.c(b);
                            g.f(amsb.ROUTE_DURATION);
                            g.e(algm.a);
                            p.f(g.g(), Boolean.valueOf(contains));
                            i5 = i3 + 1;
                            dcdcVar3 = dcdcVar;
                            size2 = i2;
                        }
                        dcdcVar = dcdcVar3;
                        i2 = size2;
                        i3 = i5;
                        i5 = i3 + 1;
                        dcdcVar3 = dcdcVar;
                        size2 = i2;
                    }
                    this.t = p.b();
                    synchronized (this.o) {
                        if (this.y != alfa.SHOW_NONE) {
                            if (this.y == alfa.SHOW_ALTERNATES_ONLY) {
                                dcpd<Map.Entry<amrc, Boolean>> it = this.t.entrySet().iterator();
                                while (it.hasNext()) {
                                    Map.Entry<amrc, Boolean> next = it.next();
                                    boolean booleanValue = next.getValue().booleanValue();
                                    amrc key = next.getKey();
                                    if (!booleanValue) {
                                        this.e.ak().c(key);
                                    }
                                }
                            } else {
                                dcpd<amrc> it2 = this.t.keySet().iterator();
                                while (it2.hasNext()) {
                                    this.e.ak().c(it2.next());
                                }
                            }
                        }
                    }
                }
                if (this.x.isEmpty() && !this.w.isEmpty()) {
                    dccx F = dcdc.F();
                    if (!this.I && this.J != null) {
                        dcdc<alfz> dcdcVar4 = this.w;
                        int size3 = dcdcVar4.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            alfz alfzVar = dcdcVar4.get(i8);
                            alga algaVar = this.J;
                            dbsk.s(algaVar);
                            dmpn a3 = alfzVar.a(algaVar, true);
                            if (a3 != null) {
                                aktc d2 = this.e.aC().d(a3, dmti.WORLD_ENCODING_LAT_LNG_E7);
                                d2.Pu();
                                amrb g2 = amrc.g();
                                g2.b(d2);
                                g2.c(alfzVar.b);
                                g2.f(amsb.NAVIGATION_MANEUVER);
                                g2.e(alga.g);
                                F.g(g2.g());
                            }
                        }
                    }
                    this.x = F.f();
                    synchronized (this.o) {
                        dcpe<amrc> listIterator = this.x.listIterator();
                        while (listIterator.hasNext()) {
                            this.e.ak().c(listIterator.next());
                        }
                    }
                }
            }
        }
    }

    private final void n() {
        synchronized (this.o) {
            dcpd<amrc> it = this.t.keySet().iterator();
            while (it.hasNext()) {
                amrc next = it.next();
                this.e.ak().a(next.a());
                this.e.aC().e(next.a());
            }
            this.t = dcmn.a;
            dcpe<amrc> listIterator = this.x.listIterator();
            while (listIterator.hasNext()) {
                amrc next2 = listIterator.next();
                this.e.ak().a(next2.a());
                this.e.aC().e(next2.a());
            }
            this.x = dcdc.e();
        }
    }

    public final void a(alfa alfaVar, boolean z) {
        this.y = alfaVar;
        this.A = z;
        synchronized (this.o) {
            n();
            m();
        }
        for (vuj vujVar : this.m) {
            if (z != vujVar.d) {
                vujVar.d = z;
                vujVar.a();
                vtx vtxVar = vujVar.h;
                if (vtxVar != null) {
                    vtxVar.a = z;
                    vujVar.q.q();
                }
            }
        }
        l();
    }

    public final void b(akzh akzhVar, btrm btrmVar, Context context, alwc alwcVar) {
        Iterator<vuj> it;
        boolean e;
        List arrayList;
        if (this.i) {
            return;
        }
        this.J = new alga(this.e.aE(), this.f, this.E);
        Iterator<vuj> it2 = this.m.iterator();
        while (it2.hasNext()) {
            final vuj next = it2.next();
            next.o = btrmVar;
            akvz aE = next.r.aE();
            Resources resources = next.e;
            boolean z = next.c;
            next.l = new aley(aE, resources, next.s.getDirectionsExperimentsParameters().l);
            dccx F = dcdc.F();
            if (next.v != 3) {
                next.i.clear();
                int i = 0;
                int i2 = next.v == 1 ? 1 : 0;
                amub amubVar = next.n;
                btvo btvoVar = next.s;
                ArrayList<aldl> arrayList2 = new ArrayList();
                dqvj dqvjVar = amubVar.h;
                if (dqvjVar == dqvj.DRIVE || dqvjVar == dqvj.TWO_WHEELER) {
                    e = vyr.e(Arrays.asList(amubVar.o));
                } else {
                    if (dqvjVar == dqvj.BICYCLE || dqvjVar == dqvj.WALK) {
                        amve amveVar = amubVar.d;
                        if (amveVar.e() > 1 || (amveVar.e() == 1 && amveVar.d(0).e() > 1)) {
                            e = true;
                        }
                    }
                    e = false;
                }
                List<akra> y = amubVar.y();
                ArrayList arrayList3 = new ArrayList(amubVar.ai());
                dqvj dqvjVar2 = amubVar.h;
                if (dqvjVar2 == dqvj.DRIVE || dqvjVar2 == dqvj.TWO_WHEELER) {
                    it = it2;
                    amuo[] t = amubVar.t();
                    dbsk.a(t.length == amubVar.ai() + (-1));
                    arrayList3.add(new aldm(y.get(0), amubVar.ah(0)));
                    for (int i3 = 0; i3 < t.length; i3++) {
                        int i4 = t[i3].j;
                        if (i4 >= 0 && i4 < y.size()) {
                            arrayList3.add(new aldm(y.get(i4), amubVar.ah(i3 + 1)));
                        }
                    }
                } else {
                    amve amveVar2 = amubVar.d;
                    if (dqvjVar2 == dqvj.TAXI && amveVar2.e() == 0) {
                        arrayList3.add(new aldm(y.get(0)));
                    }
                    int i5 = 0;
                    while (i5 < amveVar2.e()) {
                        amtr d = amveVar2.d(i5);
                        Iterator<vuj> it3 = it2;
                        amve amveVar3 = amveVar2;
                        int i6 = 0;
                        while (i < d.e()) {
                            int i7 = i6 + 1;
                            amtr amtrVar = d;
                            int i8 = d.d(i).c(0, i6).j;
                            if (i8 >= 0 && i8 < y.size()) {
                                arrayList3.add(new aldm(y.get(i8)));
                            }
                            i++;
                            i6 = i7;
                            d = amtrVar;
                        }
                        i5++;
                        it2 = it3;
                        amveVar2 = amveVar3;
                        i = 0;
                    }
                    it = it2;
                    arrayList3.add(new aldm((akra) dcft.s(y)));
                }
                int i9 = i2 ^ 1;
                int size = i2 != 0 ? arrayList3.size() : arrayList3.size() - 1;
                int i10 = 0;
                while (true) {
                    int i11 = 2;
                    if (i9 >= size) {
                        break;
                    }
                    aldm aldmVar = (aldm) arrayList3.get(i9);
                    akqq S = aldmVar.a.S();
                    amvh amvhVar = aldmVar.b;
                    if (amvhVar != null && amvhVar.y) {
                        arrayList2.add(new alcq(S));
                        i10++;
                    } else if (e) {
                        arrayList2.add(new alcp(S, i9 - i10));
                    } else {
                        int size2 = arrayList3.size();
                        if (i9 == 0) {
                            i11 = 1;
                        } else if (i9 == size2 - 1) {
                            i11 = 3;
                        }
                        arrayList2.add(new aldj(S, i11));
                    }
                    i9++;
                }
                if (!amubVar.am()) {
                    arrayList = dcdc.e();
                } else {
                    arrayList = new ArrayList();
                    amvc as = amubVar.as();
                    int length = as.a.length;
                    for (int i12 = 0; i12 < length; i12++) {
                        dcdc<amvb> a = as.a(i12);
                        if (a != null) {
                            for (int i13 = 1; i13 < a.size() - 1; i13++) {
                                amvb amvbVar = a.get(i13);
                                arrayList.add(new alet(amvbVar.b.a.S(), aleq.b(amvbVar.f), 2));
                            }
                        }
                    }
                }
                arrayList2.addAll(arrayList);
                for (aldl aldlVar : arrayList2) {
                    F.g(next.f.a(aldlVar, bntp.POLYLINE_MEASLES.c()));
                }
            } else {
                it = it2;
            }
            next.g = F.f();
            next.h = new vtx(next.q, next.g, akzhVar, next.b, next.d);
            next.q.k(next.h);
            next.q.q();
            next.a.a();
            next.j.g();
            if (next.t != null && !next.k.isEmpty()) {
                next.u = new Runnable(next) { // from class: vug
                    private final vuj a;

                    {
                        this.a = next;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a();
                    }
                };
                next.t.e(next.u);
            }
            it2 = it;
        }
        vty vtyVar = this.n;
        if (vtyVar != null) {
            vtyVar.a.c().f(vtyVar.d);
            vtyVar.a.c().f(vtyVar.e);
        }
        this.a = btrmVar;
        this.g = context;
        this.h = akzhVar;
        this.F = alwcVar;
        this.b = new vtr(this.K, btrmVar);
        this.i = true;
        alwcVar.d(this);
        amuj amujVar = this.j;
        if (amujVar != null) {
            c(amujVar);
        }
        aufb aufbVar = this.k;
        if (aufbVar == null) {
            return;
        }
        d(aufbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00de A[Catch: all -> 0x0106, TryCatch #0 {, blocks: (B:6:0x0007, B:9:0x0013, B:11:0x001f, B:13:0x002b, B:15:0x0033, B:17:0x0052, B:19:0x0061, B:20:0x0064, B:22:0x006d, B:24:0x0079, B:26:0x007f, B:28:0x0087, B:32:0x00a3, B:34:0x00aa, B:36:0x00b3, B:38:0x00bf, B:40:0x00c5, B:41:0x00d3, B:46:0x00de, B:55:0x00f2, B:56:0x00f8, B:51:0x00e9, B:43:0x00d8), top: B:68:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2 A[Catch: all -> 0x0106, TryCatch #0 {, blocks: (B:6:0x0007, B:9:0x0013, B:11:0x001f, B:13:0x002b, B:15:0x0033, B:17:0x0052, B:19:0x0061, B:20:0x0064, B:22:0x006d, B:24:0x0079, B:26:0x007f, B:28:0x0087, B:32:0x00a3, B:34:0x00aa, B:36:0x00b3, B:38:0x00bf, B:40:0x00c5, B:41:0x00d3, B:46:0x00de, B:55:0x00f2, B:56:0x00f8, B:51:0x00e9, B:43:0x00d8), top: B:68:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.amuj r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtw.c(amuj):void");
    }

    public final void d(aufb aufbVar) {
        if (!this.i) {
            this.k = aufbVar;
            return;
        }
        boolean z = aufbVar.c;
        if (this.B != z) {
            this.B = z;
            synchronized (this.o) {
                n();
                alga algaVar = this.J;
                if (algaVar != null) {
                    algaVar.d();
                    this.J = null;
                }
                this.J = new alga(this.e.aE(), this.f, this.E);
                m();
            }
            l();
        }
        this.k = null;
    }

    @Override // defpackage.alwb
    public final void e(alwa alwaVar) {
        if (this.I) {
            this.I = false;
            synchronized (this.o) {
                n();
                m();
            }
            l();
        }
    }

    public final void f() {
        amii amiiVar;
        for (vuj vujVar : this.m) {
            if (vujVar.m && (amiiVar = vujVar.p) != null) {
                amiiVar.e();
            }
        }
    }

    @Override // defpackage.amjm
    public final void g(amjl amjlVar) {
        for (vuj vujVar : this.m) {
        }
    }

    @Override // defpackage.amjm
    public final void h(amii amiiVar) {
        for (vuj vujVar : this.m) {
            vujVar.h(amiiVar);
        }
        this.l = amiiVar;
        m();
    }

    @Override // defpackage.amjm
    public final void i(amii amiiVar) {
        n();
        for (vuj vujVar : this.m) {
            vujVar.i(amiiVar);
        }
        this.l = null;
    }

    public final void j() {
        vty vtyVar = this.n;
        if (vtyVar != null) {
            vtyVar.a.c().h(vtyVar.d);
            vtyVar.a.c().h(vtyVar.e);
            vty vtyVar2 = this.n;
            vtyVar2.a.c().a(vtyVar2.d);
            vtyVar2.a.c().a(vtyVar2.e);
            vtyVar2.a.e().j(vtyVar2.b);
            vtyVar2.a.e().j(vtyVar2.c);
        }
        this.i = false;
        alwc alwcVar = this.F;
        if (alwcVar != null) {
            alwcVar.e(this);
        }
        for (vuj vujVar : this.m) {
            vujVar.b();
        }
        synchronized (this.o) {
            dcpe<amrc> listIterator = this.x.listIterator();
            while (listIterator.hasNext()) {
                amrc next = listIterator.next();
                this.e.ak().a(next.a());
                this.e.aC().e(next.a());
            }
            alga algaVar = this.J;
            if (algaVar != null) {
                algaVar.d();
                this.J = null;
            }
        }
    }

    @Override // defpackage.amjm
    public final boolean k() {
        return true;
    }

    public final String toString() {
        return dbsc.b(this).toString();
    }
}
