package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afox  reason: default package */
/* loaded from: classes.dex */
public final class afox implements afwo {
    static final dcdn<afwm, Collection<afwm>> a;
    private static final dcdc<afwm> c;
    private final afow d;
    private final bvjj e;
    private final akox f;
    private final Map<afwm, Collection<afwm>> g;
    private EnumSet<afwm> h;
    private EnumSet<afwm> i;
    private afwn[] j;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(afwm.BICYCLING, dcep.C(afwm.THREE_DIMENSIONAL, afwm.COVID19));
        dcdgVar.f(afwm.TRAFFIC, dcep.D(afwm.TRANSIT, afwm.THREE_DIMENSIONAL, afwm.COVID19));
        dcdgVar.f(afwm.TRANSIT, dcep.D(afwm.TRAFFIC, afwm.THREE_DIMENSIONAL, afwm.COVID19));
        dcdgVar.f(afwm.SATELLITE, dcep.D(afwm.TERRAIN, afwm.THREE_DIMENSIONAL, afwm.COVID19));
        dcdgVar.f(afwm.TERRAIN, dcep.D(afwm.SATELLITE, afwm.THREE_DIMENSIONAL, afwm.COVID19));
        dcdgVar.f(afwm.STREETVIEW, dcep.C(afwm.THREE_DIMENSIONAL, afwm.COVID19));
        dcdgVar.f(afwm.THREE_DIMENSIONAL, dcep.G(afwm.BICYCLING, afwm.TRAFFIC, afwm.TRANSIT, afwm.SATELLITE, afwm.TERRAIN, afwm.STREETVIEW, afwm.COVID19));
        dcdgVar.f(afwm.COVID19, dcep.G(afwm.BICYCLING, afwm.TRAFFIC, afwm.TRANSIT, afwm.TERRAIN, afwm.SATELLITE, afwm.STREETVIEW, afwm.THREE_DIMENSIONAL));
        a = dcdgVar.b();
        c = dcdc.m(afwm.TRAFFIC, afwm.TRANSIT, afwm.BICYCLING, afwm.SATELLITE, afwm.TERRAIN, afwm.COVID19, afwm.STREETVIEW, afwm.THREE_DIMENSIONAL);
    }

    public afox(afow afowVar, bvjj bvjjVar, akox akoxVar, Map<afwm, Collection<afwm>> map) {
        dbsk.s(afowVar);
        this.d = afowVar;
        dbsk.s(bvjjVar);
        this.e = bvjjVar;
        dbsk.s(akoxVar);
        this.f = akoxVar;
        this.g = map;
        EnumSet<afwm> I = bvjjVar.I(bvjk.dT, afwm.class);
        this.h = I;
        if (I.contains(afwm.REALTIME)) {
            this.h.remove(afwm.REALTIME);
        }
        if (this.h.contains(afwm.STREETVIEW)) {
            this.h.remove(afwm.STREETVIEW);
        }
        if (this.h.contains(afwm.THREE_DIMENSIONAL)) {
            this.h.remove(afwm.THREE_DIMENSIONAL);
        }
        if (this.h.contains(afwm.COVID19)) {
            this.h.remove(afwm.COVID19);
        }
        this.i = EnumSet.copyOf((EnumSet) this.h);
        dbsk.s(this.h);
        this.j = new afwn[0];
    }

    private final void k(boolean z) {
        afwn[] afwnVarArr;
        boolean b;
        EnumSet<afwm> copyOf = EnumSet.copyOf((EnumSet) this.i);
        dbsk.s(this.j);
        if (this.j.length == 0) {
            this.i.clear();
            this.i.addAll(this.h);
        } else {
            EnumSet noneOf = EnumSet.noneOf(afwm.class);
            int i = 0;
            for (afwn afwnVar : this.j) {
                bvjj bvjjVar = this.e;
                bvjk c2 = afwnVar.c();
                if (c2 == null) {
                    b = afwnVar.b();
                } else {
                    b = bvjjVar.m(c2, afwnVar.b());
                }
                if (b) {
                    noneOf.add(afwnVar.a());
                } else {
                    this.i.remove(afwnVar.a());
                }
            }
            dcdc<afwm> dcdcVar = c;
            int size = dcdcVar.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                afwm afwmVar = dcdcVar.get(i);
                if (noneOf.contains(afwmVar) && this.g.containsKey(afwmVar)) {
                    noneOf.removeAll(this.g.get(afwmVar));
                    break;
                }
                i++;
            }
            Iterator it = noneOf.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                afwm afwmVar2 = (afwm) it.next();
                if (!this.i.contains(afwmVar2)) {
                    this.i.add(afwmVar2);
                    if (this.g.containsKey(afwmVar2)) {
                        this.i.removeAll(this.g.get(afwmVar2));
                        break;
                    }
                }
            }
        }
        if (z || !this.i.equals(copyOf)) {
            n(copyOf, z);
        }
        m();
    }

    private final EnumSet<afwm> l(EnumSet<afwm> enumSet, afwm afwmVar, boolean z) {
        EnumSet<afwm> copyOf = EnumSet.copyOf((EnumSet) enumSet);
        if (z) {
            if (this.g.containsKey(afwmVar)) {
                copyOf.removeAll(this.g.get(afwmVar));
            }
            copyOf.add(afwmVar);
        } else {
            copyOf.remove(afwmVar);
        }
        return copyOf;
    }

    private final void m() {
        boolean contains = this.i.contains(afwm.TRAFFIC);
        if (this.f.s() != contains) {
            this.f.aj().w(contains);
        }
        boolean contains2 = this.i.contains(afwm.BICYCLING);
        if (this.f.u() != contains2) {
            this.f.aj().D(contains2);
        }
        boolean contains3 = this.i.contains(afwm.TRANSIT);
        if (this.f.t() != contains3) {
            this.f.aj().C(contains3);
        }
        boolean contains4 = this.i.contains(afwm.THREE_DIMENSIONAL);
        if (this.f.x() != contains4) {
            this.f.aj().F(contains4);
        }
        boolean contains5 = this.i.contains(afwm.COVID19);
        if (this.f.y() != contains5) {
            this.f.aj().G(contains5);
        }
        boolean contains6 = this.i.contains(afwm.REALTIME);
        if (this.f.aj().h() != contains6) {
            this.f.aj().z(contains6);
        }
        boolean contains7 = this.i.contains(afwm.STREETVIEW);
        if (this.f.v() != contains7) {
            this.f.aj().E(contains7);
        }
        if (this.i.contains(afwm.SATELLITE)) {
            if (!this.f.w()) {
                this.f.aj().H();
            }
        } else if (this.i.contains(afwm.TERRAIN)) {
            if (!this.f.I()) {
                this.f.aj().J();
            }
        } else {
            this.f.E();
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            sb.append(((afwm) it.next()).name());
            sb.append(" ");
        }
        bvpm.a("enabledLayers", sb.toString());
    }

    private final void n(EnumSet<afwm> enumSet, boolean z) {
        EnumSet copyOf = EnumSet.copyOf((EnumSet) this.i);
        this.d.a(dcnm.n(dcnm.p(enumSet, copyOf), dcnm.p(copyOf, enumSet)), copyOf, z);
    }

    public final void a() {
        dbsk.s(this.j);
        k(true);
    }

    @Override // defpackage.afwo
    public final void b(afwn... afwnVarArr) {
        dbsk.s(afwnVarArr);
        this.j = afwnVarArr;
        k(false);
    }

    @Override // defpackage.afwo
    public final boolean c(afwm afwmVar, boolean z) {
        afwn[] afwnVarArr;
        EnumSet<afwm> l = l(this.i, afwmVar, z);
        afwn[] afwnVarArr2 = this.j;
        int length = afwnVarArr2.length;
        int i = 0;
        while (true) {
            if (i < length) {
                afwn afwnVar = afwnVarArr2[i];
                boolean contains = l.contains(afwnVar.a());
                if (afwnVar.c() == null && afwnVar.b() != contains) {
                    break;
                }
                i++;
            } else {
                afwn[] afwnVarArr3 = this.j;
                int length2 = afwnVarArr3.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        if (afwnVarArr3[i2].a() == afwmVar) {
                            break;
                        }
                        i2++;
                    } else {
                        this.h = l(this.h, afwmVar, z);
                        break;
                    }
                }
                EnumSet<afwm> copyOf = EnumSet.copyOf((EnumSet) this.i);
                this.i = l;
                n(copyOf, false);
            }
        }
        boolean contains2 = this.i.contains(afwmVar);
        m();
        if (contains2 == z) {
            for (afwn afwnVar2 : this.j) {
                bvjj bvjjVar = this.e;
                boolean contains3 = this.i.contains(afwnVar2.a());
                bvjk c2 = afwnVar2.c();
                if (c2 != null) {
                    bvjjVar.S(c2, contains3);
                }
            }
            this.e.aj(bvjk.dT, this.h);
        }
        return contains2;
    }

    @Override // defpackage.afwo
    public final boolean d(afwm afwmVar) {
        return this.i.contains(afwmVar);
    }

    @Override // defpackage.afwo
    public final void e(afwm afwmVar) {
        c(afwmVar, !d(afwmVar));
    }

    @Override // defpackage.afwo
    public final void f(boolean z) {
        c(afwm.BICYCLING, z);
    }

    @Override // defpackage.afwo
    public final void g(boolean z) {
        c(afwm.SATELLITE, z);
    }

    @Override // defpackage.afwo
    public final void h(boolean z) {
        c(afwm.TERRAIN, z);
    }

    @Override // defpackage.afwo
    public final void i(boolean z) {
        c(afwm.TRAFFIC, z);
    }

    @Override // defpackage.afwo
    public final void j(boolean z) {
        c(afwm.TRANSIT, z);
    }
}
