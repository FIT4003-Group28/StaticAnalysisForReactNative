package defpackage;

import java.util.HashSet;
import java.util.Map;
/* compiled from: PG */
/* renamed from: tlp  reason: default package */
/* loaded from: classes7.dex */
final class tlp extends tll {
    private volatile transient dcdc<amve> j;
    private volatile transient dcdc<amve> k;
    private volatile transient int l;
    private volatile transient boolean m;
    private volatile transient dcdn<amve, Integer> n;
    private volatile transient dbsg<amve> o;
    private volatile transient boolean p;
    private volatile transient boolean q;
    private volatile transient boolean r;
    private volatile transient boolean s;
    private volatile transient boolean t;
    private volatile transient boolean u;
    private volatile transient amsy v;
    private volatile transient amsy w;

    public tlp(int i, int i2, dcdc<Integer> dcdcVar, tme tmeVar, String str, tly tlyVar, dcdn<Integer, amve> dcdnVar, int i3, boolean z, dbsg<tli> dbsgVar) {
        super(i, i2, dcdcVar, tmeVar, str, tlyVar, dcdnVar, i3, z, dbsgVar);
    }

    @Override // defpackage.tlv
    public final dcdc<amve> l() {
        dcdc<amve> m;
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    if (this.h.a()) {
                        tli b = this.h.b();
                        m = m();
                        dcdn<amve, Integer> o = o();
                        tly tlyVar = this.d;
                        if (tlyVar.a() == tlx.TRAVEL_MODE) {
                            dccx F = dcdc.F();
                            HashSet hashSet = new HashSet();
                            int size = m.size();
                            for (int i = 0; i < size; i++) {
                                amve amveVar = m.get(i);
                                dbsg j = dbsg.j(b.a.a(amveVar, 0));
                                if (j.a() && !((wuv) j.b()).e()) {
                                    amuk b2 = ((wuv) j.b()).b();
                                    if (!hashSet.contains(b2)) {
                                        if (tlyVar.g().containsKey(b2.c())) {
                                            Integer num = tlyVar.g().get(b2.c());
                                            dbsk.s(num);
                                            if (!num.equals(o.get(amveVar))) {
                                            }
                                        }
                                        hashSet.add(b2);
                                        F.g(amveVar);
                                    }
                                }
                                F.g(amveVar);
                            }
                            m = F.f();
                        }
                    } else {
                        m = m();
                    }
                    this.j = m;
                    if (this.j == null) {
                        throw new NullPointerException("filteredTrips() cannot return null");
                    }
                }
            }
        }
        return this.j;
    }

    @Override // defpackage.tlv
    public final dcdc<amve> m() {
        if (this.k == null) {
            synchronized (this) {
                if (this.k == null) {
                    dccx F = dcdc.F();
                    amve amveVar = this.e.get(Integer.valueOf(((tll) this).a));
                    dbsk.s(amveVar);
                    F.g(amveVar);
                    dcdc<Integer> dcdcVar = this.b;
                    int size = dcdcVar.size();
                    for (int i = 0; i < size; i++) {
                        int intValue = dcdcVar.get(i).intValue();
                        if (intValue != ((tll) this).a) {
                            amve amveVar2 = this.e.get(Integer.valueOf(intValue));
                            dbsk.s(amveVar2);
                            F.g(amveVar2);
                        }
                    }
                    this.k = F.f();
                    if (this.k == null) {
                        throw new NullPointerException("trips() cannot return null");
                    }
                }
            }
        }
        return this.k;
    }

    @Override // defpackage.tlv
    public final int n() {
        if (!this.m) {
            synchronized (this) {
                if (!this.m) {
                    this.l = Math.min(l().size(), this.f);
                    this.m = true;
                }
            }
        }
        return this.l;
    }

    @Override // defpackage.tlv
    public final dcdn<amve, Integer> o() {
        if (this.n == null) {
            synchronized (this) {
                if (this.n == null) {
                    dcdg p = dcdn.p();
                    dcpd<Map.Entry<Integer, amve>> it = this.e.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<Integer, amve> next = it.next();
                        p.f(next.getValue(), next.getKey());
                    }
                    this.n = p.b();
                    if (this.n == null) {
                        throw new NullPointerException("invertedTripsAndIndices() cannot return null");
                    }
                }
            }
        }
        return this.n;
    }

    @Override // defpackage.tlv
    public final dbsg<amve> p() {
        if (this.o == null) {
            synchronized (this) {
                if (this.o == null) {
                    this.o = dbsg.j(this.e.get(Integer.valueOf(((tll) this).a)));
                    if (this.o == null) {
                        throw new NullPointerException("getPrimaryTrip() cannot return null");
                    }
                }
            }
        }
        return this.o;
    }

    @Override // defpackage.tlv
    public final boolean q() {
        if (!this.q) {
            synchronized (this) {
                if (!this.q) {
                    this.p = this.d.h().equals(Integer.valueOf(((tll) this).a));
                    this.q = true;
                }
            }
        }
        return this.p;
    }

    @Override // defpackage.tlv
    public final boolean r() {
        if (!this.s) {
            synchronized (this) {
                if (!this.s) {
                    boolean z = false;
                    if (this.g && l().size() > n()) {
                        z = true;
                    }
                    this.r = z;
                    this.s = true;
                }
            }
        }
        return this.r;
    }

    @Override // defpackage.tlv
    public final boolean s() {
        if (!this.u) {
            synchronized (this) {
                if (!this.u) {
                    this.t = !this.g;
                    this.u = true;
                }
            }
        }
        return this.t;
    }

    @Override // defpackage.tlv
    public final amsy t() {
        if (this.v == null) {
            synchronized (this) {
                if (this.v == null) {
                    this.v = this.c.e();
                    if (this.v == null) {
                        throw new NullPointerException("directions() cannot return null");
                    }
                }
            }
        }
        return this.v;
    }

    @Override // defpackage.tlv
    public final amsy u() {
        if (this.w == null) {
            synchronized (this) {
                if (this.w == null) {
                    dvzu dvzuVar = t().a().b;
                    if (dvzuVar == null) {
                        dvzuVar = dvzu.F;
                    }
                    dsqp dsqpVar = (dsqp) dvzuVar.cu(5);
                    dsqpVar.bC(dvzuVar);
                    dvzo dvzoVar = (dvzo) dsqpVar;
                    if (dvzoVar.c) {
                        dvzoVar.bF();
                        dvzoVar.c = false;
                    }
                    ((dvzu) dvzoVar.b).e = dvzu.ck();
                    if (dvzoVar.c) {
                        dvzoVar.bF();
                        dvzoVar.c = false;
                    }
                    ((dvzu) dvzoVar.b).v = dvzu.ck();
                    dcdc<Integer> dcdcVar = this.b;
                    int size = dcdcVar.size();
                    for (int i = 0; i < size; i++) {
                        amve amveVar = this.e.get(Integer.valueOf(dcdcVar.get(i).intValue()));
                        dbsk.s(amveVar);
                        dvzoVar.e(amveVar.a);
                    }
                    dwbc dwbcVar = t().a;
                    dsqp dsqpVar2 = (dsqp) dwbcVar.cu(5);
                    dsqpVar2.bC(dwbcVar);
                    dwaz dwazVar = (dwaz) dsqpVar2;
                    dwaa a = t().a();
                    dsqp dsqpVar3 = (dsqp) a.cu(5);
                    dsqpVar3.bC(a);
                    dvzz dvzzVar = (dvzz) dsqpVar3;
                    if (dvzzVar.c) {
                        dvzzVar.bF();
                        dvzzVar.c = false;
                    }
                    dwaa dwaaVar = (dwaa) dvzzVar.b;
                    dvzu bK = dvzoVar.bK();
                    bK.getClass();
                    dwaaVar.b = bK;
                    dwaaVar.a |= 1;
                    if (dwazVar.c) {
                        dwazVar.bF();
                        dwazVar.c = false;
                    }
                    dwbc dwbcVar2 = (dwbc) dwazVar.b;
                    dwaa bK2 = dvzzVar.bK();
                    dwbc dwbcVar3 = dwbc.g;
                    bK2.getClass();
                    dwbcVar2.b = bK2;
                    dwbcVar2.a |= 1;
                    this.w = new amsy((dwbc) dwazVar.bK());
                    if (this.w == null) {
                        throw new NullPointerException("strippedDirections() cannot return null");
                    }
                }
            }
        }
        return this.w;
    }
}
