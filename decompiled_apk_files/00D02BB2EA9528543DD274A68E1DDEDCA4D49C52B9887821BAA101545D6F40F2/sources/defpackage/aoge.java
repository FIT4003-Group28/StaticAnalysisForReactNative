package defpackage;

import java.io.Serializable;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aoge  reason: default package */
/* loaded from: classes2.dex */
public class aoge implements Serializable {
    public final String a;
    public final dbsg<String> b;
    public final bvrt<dqfw> c;
    public final aofn d;
    public final boolean e;
    public transient aohd f;
    private final bvrt<duzv> g;
    @dzsi
    private transient dcdc<aogx> h;
    @dzsi
    private transient dcdc<aogj> i;
    @dzsi
    private transient aogu j;
    @dzsi
    private transient aogb k;
    @dzsi
    private transient dbsg<dvay> l;
    @dzsi
    private transient dbsg<dvyw> m;

    public aoge(bvrt<duzv> bvrtVar, String str, dbsg<String> dbsgVar, bvrt<dqfw> bvrtVar2, aofn aofnVar, boolean z) {
        this.g = bvrtVar;
        dbsk.s(str);
        this.a = str;
        this.d = aofnVar;
        this.b = dbsgVar;
        this.c = bvrtVar2;
        this.e = z;
    }

    private final void l(dvay dvayVar, dccx<aogj> dccxVar) {
        dbsg dbsgVar;
        akqq j;
        if (dvayVar.b != 7 || ((dvat) dvayVar.c).b.size() == 0) {
            dbsgVar = dbpy.a;
        } else {
            dvas dvasVar = (dvayVar.b == 7 ? (dvat) dvayVar.c : dvat.g).b.get(0);
            dvyw dvywVar = dvasVar.b;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            if (dvywVar.g.isEmpty()) {
                dbsgVar = dbpy.a;
            } else {
                int a = dqjn.a(dvayVar.n);
                if (a == 0) {
                    a = 3;
                }
                int a2 = dqkl.a((dvayVar.b == 7 ? (dvat) dvayVar.c : dvat.g).f);
                if (a2 == 0) {
                    a2 = 1;
                }
                aofs aofsVar = new aofs();
                dvap dvapVar = dvayVar.e;
                if (dvapVar == null) {
                    dvapVar = dvap.d;
                }
                String e = aoha.d(dvapVar).e();
                if (e == null) {
                    throw new NullPointerException("Null name");
                }
                aofsVar.a = e;
                dvyw dvywVar2 = dvasVar.b;
                if (dvywVar2 == null) {
                    dvywVar2 = dvyw.bv;
                }
                String str = dvywVar2.i;
                if (str == null) {
                    throw new NullPointerException("Null title");
                }
                aofsVar.b = str;
                if ((dvasVar.a & 4) != 0) {
                    dpum dpumVar = dvasVar.d;
                    if (dpumVar == null) {
                        dpumVar = dpum.d;
                    }
                    j = akqq.f(dpumVar);
                } else {
                    dhjz dhjzVar = dvywVar.e;
                    if (dhjzVar == null) {
                        dhjzVar = dhjz.e;
                    }
                    j = akqq.j(dhjzVar);
                }
                if (j == null) {
                    throw new NullPointerException("Null location");
                }
                aofsVar.c = j;
                String str2 = "";
                String str3 = a2 == 5 ? str2 : a == 2 ? dvasVar.e : dvasVar.f;
                if (str3 == null) {
                    throw new NullPointerException("Null iconUrl");
                }
                aofsVar.d = str3;
                String str4 = dvywVar.g;
                if (str4 == null) {
                    throw new NullPointerException("Null featureId");
                }
                aofsVar.e = str4;
                cjta b = cjtd.b();
                b.d = a == 2 ? dtyi.aw : dtyi.as;
                b.b = this.a;
                b.g((dvayVar.a & 1) != 0 ? dvayVar.d : null);
                aofsVar.f = b.a();
                if (aofsVar.a == null) {
                    str2 = " name";
                }
                if (aofsVar.b == null) {
                    str2 = str2.concat(" title");
                }
                if (aofsVar.c == null) {
                    str2 = String.valueOf(str2).concat(" location");
                }
                if (aofsVar.d == null) {
                    str2 = String.valueOf(str2).concat(" iconUrl");
                }
                if (aofsVar.e == null) {
                    str2 = String.valueOf(str2).concat(" featureId");
                }
                if (aofsVar.f == null) {
                    str2 = String.valueOf(str2).concat(" ue3Params");
                }
                if (!str2.isEmpty()) {
                    String valueOf = String.valueOf(str2);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                }
                dbsgVar = dbsg.i(new aoft(aofsVar.a, aofsVar.b, aofsVar.c, aofsVar.d, aofsVar.e, aofsVar.f));
            }
        }
        if (dbsgVar.a()) {
            dccxVar.g((aogj) dbsgVar.b());
        }
    }

    private static dvyw m(dvas dvasVar) {
        dvyw dvywVar = dvasVar.b;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        dsqp dsqpVar = (dsqp) dvywVar.cu(5);
        dsqpVar.bC(dvywVar);
        dvya dvyaVar = (dvya) dsqpVar;
        String str = dvasVar.c;
        if (dvyaVar.c) {
            dvyaVar.bF();
            dvyaVar.c = false;
        }
        dvyw dvywVar2 = (dvyw) dvyaVar.b;
        str.getClass();
        dvywVar2.a |= 16;
        dvywVar2.i = str;
        return dvyaVar.bK();
    }

    public final duzv a() {
        return this.g.e((dssr) duzv.k.cu(7), duzv.k);
    }

    public final dcdc<dvay> b() {
        return dcdc.r(a().c);
    }

    public final dcdc<dvay> c() {
        dvav dvavVar;
        dccx F = dcdc.F();
        for (dvay dvayVar : a().c) {
            dvax dvaxVar = dvax.UNKNOWN;
            dvax b = dvax.b(dvayVar.m);
            if (b == null) {
                b = dvax.UNKNOWN;
            }
            int ordinal = b.ordinal();
            if (ordinal == 2 || ordinal == 3) {
                F.g(dvayVar);
            } else if (ordinal == 4) {
                if (dvayVar.b == 14) {
                    dvavVar = (dvav) dvayVar.c;
                } else {
                    dvavVar = dvav.e;
                }
                F.i(dvavVar.b);
            }
        }
        return F.f();
    }

    public final dcdc<aogx> d() {
        if (this.h == null) {
            ((aogd) btsr.a(aogd.class)).sw(this);
            dccx F = dcdc.F();
            dcdc<dvay> b = b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                dvay dvayVar = b.get(i);
                dvax dvaxVar = dvax.UNKNOWN;
                dvax b2 = dvax.b(dvayVar.m);
                if (b2 == null) {
                    b2 = dvax.UNKNOWN;
                }
                int ordinal = b2.ordinal();
                if (ordinal == 2) {
                    F.g(new aohb(dvayVar));
                } else if (ordinal == 4) {
                    aogw a = this.f.a.a();
                    aohd.a(a, 1);
                    aohd.a(dvayVar, 2);
                    F.g(new aohc(a, dvayVar));
                }
            }
            this.h = F.f();
        }
        dcdc<aogx> dcdcVar = this.h;
        dbsk.s(dcdcVar);
        return dcdcVar;
    }

    public final aogu e() {
        if (this.j == null) {
            dvab dvabVar = a().d;
            if (dvabVar == null) {
                dvabVar = dvab.b;
            }
            this.j = aogu.a(dvabVar, c());
        }
        aogu aoguVar = this.j;
        dbsk.s(aoguVar);
        return aoguVar;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof aoge)) {
            return false;
        }
        if (obj != this) {
            return dbsd.a(a(), ((aoge) obj).a());
        }
        return true;
    }

    public final dcdc<aogj> f() {
        if (this.i == null) {
            dccx<aogj> F = dcdc.F();
            for (dvay dvayVar : a().c) {
                l(dvayVar, F);
                for (dvay dvayVar2 : dvayVar.o) {
                    l(dvayVar2, F);
                }
            }
            this.i = F.f();
        }
        dcdc<aogj> dcdcVar = this.i;
        dbsk.s(dcdcVar);
        return dcdcVar;
    }

    public final aogb g() {
        if (this.k == null) {
            dngs dngsVar = a().b;
            if (dngsVar == null) {
                dngsVar = dngs.h;
            }
            this.k = aogb.e(dngsVar);
        }
        aogb aogbVar = this.k;
        dbsk.s(aogbVar);
        return aogbVar;
    }

    public final dbsg<dqfw> h() {
        return aogv.a(this.c);
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final dbsg<Integer> i(aoha aohaVar) {
        dcdc<dvay> b = b();
        for (int i = 0; i < b.size(); i++) {
            dvap dvapVar = b.get(i).e;
            if (dvapVar == null) {
                dvapVar = dvap.d;
            }
            if (aohaVar.equals(aoha.d(dvapVar))) {
                return dbsg.i(Integer.valueOf(i));
            }
        }
        return dbpy.a;
    }

    public final dbsg<dvay> j() {
        dbsg<dvay> dbsgVar;
        if (this.l == null) {
            dcdc<dvay> b = b();
            int size = b.size();
            while (true) {
                size--;
                if (size >= 0) {
                    dvay dvayVar = b.get(size);
                    if (!dvayVar.r) {
                        dvax b2 = dvax.b(dvayVar.m);
                        if (b2 == null) {
                            b2 = dvax.UNKNOWN;
                        }
                        if (b2 == dvax.STOP) {
                            dbsgVar = dbsg.i(dvayVar);
                            break;
                        }
                    }
                } else {
                    dbsgVar = dbpy.a;
                    break;
                }
            }
            this.l = dbsgVar;
        }
        dbsg<dvay> dbsgVar2 = this.l;
        dbsk.s(dbsgVar2);
        return dbsgVar2;
    }

    public final dbsg<dvyw> k() {
        dbsg<dvyw> dbsgVar;
        if (this.m == null) {
            dcdc<dvay> c = c();
            if (!c.isEmpty()) {
                dvay dvayVar = (dvay) dcft.s(c);
                if (dvayVar.b != 7 || !dvayVar.r) {
                    dbsgVar = dbpy.a;
                } else {
                    dvat dvatVar = (dvat) dvayVar.c;
                    duzt duztVar = dvatVar.c;
                    if (duztVar == null) {
                        duztVar = duzt.c;
                    }
                    if ((duztVar.a & 1) == 0) {
                        Iterator<dvay> it = dvayVar.o.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                dbsgVar = dbpy.a;
                                break;
                            }
                            dvay next = it.next();
                            if (next.b == 7) {
                                dvat dvatVar2 = (dvat) next.c;
                                duzt duztVar2 = dvatVar2.c;
                                if (duztVar2 == null) {
                                    duztVar2 = duzt.c;
                                }
                                if ((duztVar2.a & 1) != 0) {
                                    dbsgVar = dbsg.i(m(dvatVar2.b.get(0)));
                                    break;
                                }
                            }
                        }
                    } else {
                        dbsgVar = dbsg.i(m(dvatVar.b.get(0)));
                    }
                }
            } else {
                dbsgVar = dbpy.a;
            }
            this.m = dbsgVar;
        }
        dbsg<dvyw> dbsgVar2 = this.m;
        dbsk.s(dbsgVar2);
        return dbsgVar2;
    }
}
