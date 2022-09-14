package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: akxv  reason: default package */
/* loaded from: classes.dex */
public final class akxv {
    public final btrm c;
    public final dbty<Boolean> d;
    public final anat e;
    private final dxio<akox> l;
    private final dxio<akzh> m;
    private final ckcw n;
    private final akwu o;
    @dzsi
    private akra f = null;
    private float g = 0.0f;
    @dzsi
    private dplf h = null;
    @dzsi
    private Set<akxq> i = null;
    private final List<akra> j = new ArrayList();
    public volatile akuc a = new amjh(dcmn.a, 0);
    public final akxs b = new akxs(this);
    private final Set<akxt> k = new HashSet();

    public akxv(dxio<akox> dxioVar, dxio<akzh> dxioVar2, btrm btrmVar, ckcw ckcwVar, dbty<Boolean> dbtyVar, akwu akwuVar, anat anatVar) {
        this.l = dxioVar;
        this.m = dxioVar2;
        this.c = btrmVar;
        this.n = ckcwVar;
        this.d = dbtyVar;
        this.o = akwuVar;
        this.e = anatVar;
    }

    private final synchronized void g(List<dnpo> list) {
        int av = this.l.a().aj().av();
        int i = 1;
        if (av != 1 && k(this.m.a(), list) != null) {
            if (true != h(list)) {
                i = 2;
            }
            if (av == 2) {
                ((ckco) this.n.a(ckgh.bD)).a(akxu.a(i));
            } else if (av == 3) {
                ((ckco) this.n.a(ckgh.bE)).a(akxu.a(i));
            } else if (av == 4) {
                ((ckco) this.n.a(ckgh.bF)).a(akxu.a(i));
            } else if (av == 5) {
                ((ckco) this.n.a(ckgh.bG)).a(akxu.a(i));
            }
        }
    }

    private static boolean h(List<dnpo> list) {
        for (dnpo dnpoVar : list) {
            int a = dnpl.a(dnpoVar.h);
            if (a == 0) {
                a = 1;
            }
            if (ctz.a(new dsrh(dnpoVar.d, dnpo.e)) && (a == 1 || a == 2)) {
                return true;
            }
        }
        return false;
    }

    private final Set<akxq> i() {
        EnumSet noneOf = EnumSet.noneOf(akxq.class);
        if (this.l.a().u()) {
            noneOf.add(akxq.BICYCLING_MUTATOR);
        }
        if (this.l.a().s()) {
            noneOf.add(akxq.TRAFFIC_MUTATOR);
        }
        if (this.l.a().t()) {
            noneOf.add(akxq.TRANSIT_MUTATOR);
        }
        if (this.l.a().I()) {
            noneOf.add(akxq.TERRAIN_MUTATOR);
        }
        return noneOf;
    }

    private final dplf j() {
        return this.l.a().w() ? dplf.SATELLITE : dplf.MAP;
    }

    @dzsi
    private final ddhn k(akzh akzhVar, List<dnpo> list) {
        akra akraVar;
        if (this.f == null) {
            return ddda.Ks;
        }
        if (!dbsd.a(this.i, i())) {
            return ddda.Kv;
        }
        if (!dbsd.a(this.h, j())) {
            return ddda.Kp;
        }
        akra g = akzhVar.g();
        if (Math.abs(this.g - akzhVar.p().k) < 1.0d) {
            double abs = Math.abs(g.a - akraVar.a) / akyx.e(akzhVar);
            double abs2 = Math.abs(g.b - akraVar.b) / akyx.e(akzhVar);
            double y = akzhVar.y();
            double z = akzhVar.z();
            if (abs >= y || abs2 >= z) {
                return ddda.Kt;
            }
            Double.isNaN(y);
            Double.isNaN(abs);
            Double.isNaN(z);
            Double.isNaN(abs2);
            Double.isNaN(y);
            Double.isNaN(z);
            if ((y - abs) * (z - abs2) <= y * z * 0.5d) {
                return ddda.Kt;
            }
            if (this.o.a().f()) {
                return null;
            }
            for (dnpo dnpoVar : list) {
                if (!this.k.contains(akxt.d(dnpoVar))) {
                    return ddda.Kr;
                }
            }
            return null;
        }
        return ddda.Kw;
    }

    public final synchronized void a() {
        this.c.a(this.b);
    }

    public final synchronized void b() {
        c(cjqm.a);
    }

    public final synchronized void c(cjqm cjqmVar) {
        ddhn k;
        boolean h;
        if (!cjqmVar.equals(cjqm.a)) {
            ((ckcn) this.n.a(ckgh.ax)).a();
        }
        dcdc<dnpo> e = e(f());
        if (!this.l.a().U() && !cjqmVar.a().a()) {
            if (this.l.a().aj().av() == 3) {
                h = this.o.a().g();
            } else {
                h = this.o.a().h();
            }
            if (!h) {
                g(e);
                return;
            }
        }
        if (cjqmVar.a().a()) {
            k = ddda.Ku;
        } else {
            k = k(this.m.a(), e);
        }
        if (k == null && this.o.a().i()) {
            k = ddda.Kq;
        }
        if (k == null) {
            return;
        }
        alim d = d(k, e);
        this.e.a(d);
        this.c.b(d);
    }

    public final synchronized alim d(ddhn ddhnVar, dcdc<dnpo> dcdcVar) {
        int i;
        dplf j;
        dhjx Z;
        dntk bK;
        dpxj bZ;
        int i2;
        akqp f;
        Set<akxq> i3 = i();
        dntj bZ2 = dntk.c.bZ();
        Iterator<akxq> it = i3.iterator();
        while (true) {
            int i4 = 3;
            int i5 = 2;
            if (it.hasNext()) {
                int ordinal = it.next().ordinal();
                if (ordinal == 0) {
                    dmyq dmyqVar = (dmyq) dmyu.d.bZ();
                    if (dmyqVar.c) {
                        dmyqVar.bF();
                        dmyqVar.c = false;
                    }
                    dmyu dmyuVar = (dmyu) dmyqVar.b;
                    dmyuVar.b = 19;
                    dmyuVar.a |= 1;
                    bZ2.a(dmyqVar);
                } else if (ordinal == 1) {
                    dmyq dmyqVar2 = (dmyq) dmyu.d.bZ();
                    if (dmyqVar2.c) {
                        dmyqVar2.bF();
                        dmyqVar2.c = false;
                    }
                    dmyu dmyuVar2 = (dmyu) dmyqVar2.b;
                    dmyuVar2.b = 14;
                    dmyuVar2.a |= 1;
                    bZ2.a(dmyqVar2);
                } else if (ordinal == 2) {
                    dmyq dmyqVar3 = (dmyq) dmyu.d.bZ();
                    if (dmyqVar3.c) {
                        dmyqVar3.bF();
                        dmyqVar3.c = false;
                    }
                    dmyu dmyuVar3 = (dmyu) dmyqVar3.b;
                    dmyuVar3.b = 27;
                    dmyuVar3.a |= 1;
                    bZ2.a(dmyqVar3);
                } else if (ordinal == 3) {
                    dmwu dmwuVar = (dmwu) dmwx.g.bZ();
                    if (dmwuVar.c) {
                        dmwuVar.bF();
                        dmwuVar.c = false;
                    }
                    dmwx dmwxVar = (dmwx) dmwuVar.b;
                    dmwxVar.b = 3;
                    dmwxVar.a |= 1;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dntk dntkVar = (dntk) bZ2.b;
                    dmwx dmwxVar2 = (dmwx) dmwuVar.bK();
                    dmwxVar2.getClass();
                    dsrj<dmwx> dsrjVar = dntkVar.a;
                    if (!dsrjVar.a()) {
                        dntkVar.a = dsqw.cl(dsrjVar);
                    }
                    dntkVar.a.add(dmwxVar2);
                } else {
                    throw null;
                }
            } else {
                alad p = this.m.a().p();
                if (p.l != 0.0f || p.m != 0.0f || !this.d.a().booleanValue()) {
                    this.j.clear();
                    i = 0;
                } else {
                    if (this.g >= p.k || this.j.isEmpty()) {
                        i2 = 0;
                    } else {
                        akqs m = akyx.m(this.l.a().Y(this.m.a().p()));
                        int i6 = 0;
                        for (akra akraVar : this.j) {
                            if (m.b(akraVar.S())) {
                                i6++;
                            }
                        }
                        int size = dcdcVar.size();
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < size) {
                            dnpo dnpoVar = dcdcVar.get(i7);
                            int a = dnpl.a(dnpoVar.h);
                            if (a != 0 && a == 4) {
                                i7++;
                                i4 = 3;
                            }
                            int a2 = dnpl.a(dnpoVar.h);
                            if (a2 != 0 && a2 == i4) {
                                i7++;
                                i4 = 3;
                            }
                            akxo akxoVar = new akxo(dnpoVar.b, 2, dnpoVar.d.size() > 0 ? dnpo.e.a(Integer.valueOf(dnpoVar.d.f(0))).N : -1);
                            if (this.k.contains(akxt.d(dnpoVar)) || this.k.contains(akxoVar)) {
                                i8++;
                            }
                            i7++;
                            i4 = 3;
                        }
                        i2 = Math.max(0, i6 - i8);
                    }
                    this.j.clear();
                    if (this.a != null) {
                        for (akud akudVar : this.a.a()) {
                            if (akudVar.c() != akuf.REPRESSED && akudVar.c() != akuf.TRUMPED && (f = akudVar.d().f()) != null) {
                                this.j.add(f.a());
                            }
                        }
                    }
                    i = i2;
                }
                this.f = this.m.a().g();
                this.g = p.k;
                j = j();
                this.h = j;
                this.i = i3;
                this.k.clear();
                int size2 = dcdcVar.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    this.k.add(akxt.d(dcdcVar.get(i9)));
                }
                if (true == h(dcdcVar)) {
                    i5 = 1;
                }
                ((ckco) this.n.a(ckgh.bH)).a(akxu.a(i5));
                if (ddhnVar == ddda.Ku) {
                    ((ckcn) this.n.a(ckgh.az)).a();
                }
                Z = this.l.a().Z();
                bK = bZ2.bK();
                bZ = dpxk.c.bZ();
                if (this.l.a().t()) {
                    dpww bZ3 = dpwx.c.bZ();
                    dpwz dpwzVar = dpwz.MAP_CONTENT_TRANSIT;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dpwx dpwxVar = (dpwx) bZ3.b;
                    dpwxVar.b = dpwzVar.q;
                    dpwxVar.a |= 1;
                    bZ.a(bZ3);
                }
                if (this.l.a().s()) {
                    dpww bZ4 = dpwx.c.bZ();
                    dpwz dpwzVar2 = dpwz.MAP_CONTENT_DRIVING;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dpwx dpwxVar2 = (dpwx) bZ4.b;
                    dpwxVar2.b = dpwzVar2.q;
                    dpwxVar2.a |= 1;
                    bZ.a(bZ4);
                }
                if (this.l.a().aj().i()) {
                    dpww bZ5 = dpwx.c.bZ();
                    dpwz dpwzVar3 = dpwz.MAP_CONTENT_EXPLORE;
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dpwx dpwxVar3 = (dpwx) bZ5.b;
                    dpwxVar3.b = dpwzVar3.q;
                    dpwxVar3.a |= 1;
                    bZ.a(bZ5);
                }
                if (this.l.a().I()) {
                    dpww bZ6 = dpwx.c.bZ();
                    dpwz dpwzVar4 = dpwz.MAP_CONTENT_TERRAIN;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dpwx dpwxVar4 = (dpwx) bZ6.b;
                    dpwxVar4.b = dpwzVar4.q;
                    dpwxVar4.a |= 1;
                    bZ.a(bZ6);
                }
                if (this.l.a().u()) {
                    dpww bZ7 = dpwx.c.bZ();
                    dpwz dpwzVar5 = dpwz.MAP_CONTENT_BIKE;
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    dpwx dpwxVar5 = (dpwx) bZ7.b;
                    dpwxVar5.b = dpwzVar5.q;
                    dpwxVar5.a |= 1;
                    bZ.a(bZ7);
                }
                if (this.l.a().w()) {
                    dpww bZ8 = dpwx.c.bZ();
                    dpwz dpwzVar6 = dpwz.MAP_CONTENT_SATELLITE;
                    if (bZ8.c) {
                        bZ8.bF();
                        bZ8.c = false;
                    }
                    dpwx dpwxVar6 = (dpwx) bZ8.b;
                    dpwxVar6.b = dpwzVar6.q;
                    dpwxVar6.a |= 1;
                    bZ.a(bZ8);
                }
                if (this.l.a().s != null && this.l.a().s.g() != null) {
                    dpww bZ9 = dpwx.c.bZ();
                    dpwz dpwzVar7 = dpwz.MAP_CONTENT_INDOOR;
                    if (bZ9.c) {
                        bZ9.bF();
                        bZ9.c = false;
                    }
                    dpwx dpwxVar7 = (dpwx) bZ9.b;
                    dpwxVar7.b = dpwzVar7.q;
                    dpwxVar7.a |= 1;
                    bZ.a(bZ9);
                }
                if (this.l.a().x) {
                    dpxg bZ10 = dpxh.c.bZ();
                    if (bZ10.c) {
                        bZ10.bF();
                        bZ10.c = false;
                    }
                    dpxh dpxhVar = (dpxh) bZ10.b;
                    dpxhVar.b = 1;
                    dpxhVar.a |= 1;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dpxk dpxkVar = (dpxk) bZ.b;
                    dpxh bK2 = bZ10.bK();
                    bK2.getClass();
                    dsrj<dpxh> dsrjVar2 = dpxkVar.b;
                    if (!dsrjVar2.a()) {
                        dpxkVar.b = dsqw.cl(dsrjVar2);
                    }
                    dpxkVar.b.add(bK2);
                }
                if (this.l.a().x()) {
                    dpww bZ11 = dpwx.c.bZ();
                    dpwz dpwzVar8 = dpwz.MAP_CONTENT_THREE_DIMENSIONAL;
                    if (bZ11.c) {
                        bZ11.bF();
                        bZ11.c = false;
                    }
                    dpwx dpwxVar8 = (dpwx) bZ11.b;
                    dpwxVar8.b = dpwzVar8.q;
                    dpwxVar8.a |= 1;
                    bZ.a(bZ11);
                }
                if (this.l.a().v()) {
                    dpww bZ12 = dpwx.c.bZ();
                    dpwz dpwzVar9 = dpwz.MAP_CONTENT_STREET_VIEW;
                    if (bZ12.c) {
                        bZ12.bF();
                        bZ12.c = false;
                    }
                    dpwx dpwxVar9 = (dpwx) bZ12.b;
                    dpwxVar9.b = dpwzVar9.q;
                    dpwxVar9.a |= 1;
                    bZ.a(bZ12);
                }
                if (this.l.a().y()) {
                    dpww bZ13 = dpwx.c.bZ();
                    dpwz dpwzVar10 = dpwz.MAP_CONTENT_COVID19;
                    if (bZ13.c) {
                        bZ13.bF();
                        bZ13.c = false;
                    }
                    dpwx dpwxVar10 = (dpwx) bZ13.b;
                    dpwxVar10.b = dpwzVar10.q;
                    dpwxVar10.a |= 1;
                    bZ.a(bZ13);
                }
                if (this.l.a().A != dpwz.UNKNOWN_MAP_CONTENT_TYPE) {
                    dpww bZ14 = dpwx.c.bZ();
                    dpwz dpwzVar11 = this.l.a().A;
                    if (bZ14.c) {
                        bZ14.bF();
                        bZ14.c = false;
                    }
                    dpwx dpwxVar11 = (dpwx) bZ14.b;
                    dpwxVar11.b = dpwzVar11.q;
                    dpwxVar11.a |= 1;
                    bZ.a(bZ14);
                }
            }
        }
        return new alim(ddhnVar, Z, j, bK, dcdcVar, bZ.bK(), this.a, i);
    }

    public final synchronized dcdc<dnpo> e(List<dnpo> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (dnpo dnpoVar : list) {
            if (new dsrh(dnpoVar.d, dnpo.e).contains(dnow.SPOTLIT_PIN) && (dnpoVar.a & 1) != 0) {
                arrayList2.add(dnpoVar);
            }
            arrayList.add(dnpoVar);
        }
        if (arrayList2.isEmpty()) {
            return dcdc.r(arrayList);
        }
        dnpo[] dnpoVarArr = new dnpo[arrayList2.size()];
        for (int i = 0; i < arrayList2.size(); i++) {
            dnpo dnpoVar2 = (dnpo) arrayList2.get(i);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                dnpo dnpoVar3 = (dnpo) arrayList.get(i2);
                if (!new dsrh(dnpoVar3.d, dnpo.e).contains(dnow.SPOTLIT_PIN) && dnpoVar3.b.equals(dnpoVar2.b)) {
                    dnpoVarArr[i] = dnpoVar3;
                }
            }
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            dnpo dnpoVar4 = dnpoVarArr[i3];
            if (dnpoVar4 != null) {
                arrayList.remove(arrayList2.get(i3));
                arrayList.remove(dnpoVar4);
                dnox ca = dnpo.t.ca(dnpoVar4);
                ca.b(dnow.SPOTLIT_PIN);
                arrayList.add(ca.bK());
            }
        }
        return dcdc.r(arrayList);
    }

    public final dcdc<dnpo> f() {
        dnpn dnpnVar;
        dccx F = dcdc.F();
        if (this.a != null) {
            for (akud akudVar : this.a.a()) {
                dmpn a = akudVar.a();
                if (anar.a(a)) {
                    akuf c = akudVar.c();
                    akuf akufVar = akuf.PLACED_FULLY;
                    int ordinal = c.ordinal();
                    int i = 2;
                    if (ordinal == 0) {
                        i = 1;
                    } else if (ordinal != 1) {
                        i = ordinal != 2 ? 3 : 4;
                    }
                    if (akudVar.c().ordinal() == 3) {
                        dnpnVar = dnpn.TRUMPED;
                    } else {
                        dnpnVar = dnpn.UNKNOWN_REASON;
                    }
                    F.g(anar.b(a, i, dnpnVar));
                }
            }
        }
        return F.f();
    }
}
