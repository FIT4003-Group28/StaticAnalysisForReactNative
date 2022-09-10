package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bsjm  reason: default package */
/* loaded from: classes4.dex */
public class bsjm implements Serializable {
    public static final dcep<Integer> a;
    private static final dbrn<dspd, djnh> d = new bsjk();
    private static final dbrn<djnh, dspd> e = new bsjl();
    private static final dspd f;
    public final Map<Integer, Set<dspd>> b;
    public final List<bvrt<djml>> c;
    private final List<bvrt<djkr>> g;
    private boolean h;
    @dzsi
    private dspd i;
    @dzsi
    private bvrt<dnnn> j;

    static {
        djmu bZ = djmv.c.bZ();
        djob bZ2 = djoe.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djoe djoeVar = (djoe) bZ2.b;
        djoeVar.b = 1;
        djoeVar.a = 1 | djoeVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djmv djmvVar = (djmv) bZ.b;
        djoe bK = bZ2.bK();
        bK.getClass();
        djmvVar.b = bK;
        djmvVar.a = 12;
        f = bZ.bK().bR();
        a = dcep.B(20);
    }

    public bsjm() {
        this.b = new HashMap();
        this.c = new ArrayList();
        this.g = new ArrayList();
    }

    @dzsi
    private final djkr x(int i) {
        for (bvrt<djkr> bvrtVar : this.g) {
            djkr e2 = bvrtVar.e((dssr) djkr.d.cu(7), djkr.d);
            int a2 = djne.a(e2.b);
            if (a2 == 0) {
                a2 = 1;
                continue;
            }
            if (a2 == i) {
                return e2;
            }
        }
        return null;
    }

    public final void a(djnk djnkVar) {
        this.b.clear();
        this.h = false;
        for (djni djniVar : djnkVar.c) {
            int i = djniVar.b;
            if (i != 14) {
                if (i == 25 && djniVar.equals(bsji.a(3))) {
                    this.h = true;
                }
                if (djniVar.b == 18 && djniVar.c.size() > 0) {
                    dbsg<djlp> a2 = bsli.a(djniVar.c.get(0).b);
                    if (a2.a()) {
                        dnnh bZ = dnnn.l.bZ();
                        dqxb bZ2 = dqxc.c.bZ();
                        int i2 = a2.b().b;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dqxc dqxcVar = (dqxc) bZ2.b;
                        dqxcVar.a = 1 | dqxcVar.a;
                        dqxcVar.b = i2;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dnnn dnnnVar = (dnnn) bZ.b;
                        dqxc bK = bZ2.bK();
                        bK.getClass();
                        dnnnVar.j = bK;
                        dnnnVar.a |= 4096;
                        p(bZ.bK());
                    }
                }
                this.b.put(Integer.valueOf(djniVar.b), dcnm.i(dcft.o(djniVar.c, e)));
            }
        }
        this.c.clear();
        for (djml djmlVar : djnkVar.d) {
            if (djmlVar.c != 14) {
                this.c.add(bvrt.b(djmlVar));
            }
        }
        this.g.clear();
        for (djkr djkrVar : djnkVar.b) {
            int a3 = djne.a(djkrVar.b);
            if (a3 == 0 || a3 != 15) {
                this.g.add(bvrt.b(djkrVar));
            }
        }
        this.i = djnkVar.e;
    }

    public final djnk b() {
        djnj bZ = djnk.f.bZ();
        for (Map.Entry<Integer, Set<dspd>> entry : this.b.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                djnf bZ2 = djni.d.bZ();
                int intValue = entry.getKey().intValue();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                djni djniVar = (djni) bZ2.b;
                djniVar.a |= 1;
                djniVar.b = intValue;
                Iterable o = dcft.o(entry.getValue(), d);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                djni djniVar2 = (djni) bZ2.b;
                djniVar2.b();
                dsod.bv(o, djniVar2.c);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djnk djnkVar = (djnk) bZ.b;
                djni bK = bZ2.bK();
                bK.getClass();
                djnkVar.c();
                djnkVar.c.add(bK);
            }
        }
        for (bvrt<djkr> bvrtVar : this.g) {
            djkr e2 = bvrtVar.e((dssr) djkr.d.cu(7), djkr.d);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djnk djnkVar2 = (djnk) bZ.b;
            e2.getClass();
            djnkVar2.b();
            djnkVar2.b.add(e2);
        }
        for (bvrt<djml> bvrtVar2 : this.c) {
            djml e3 = bvrtVar2.e((dssr) djml.j.cu(7), djml.j);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djnk djnkVar3 = (djnk) bZ.b;
            e3.getClass();
            djnkVar3.d();
            djnkVar3.d.add(e3);
        }
        dspd dspdVar = this.i;
        if (dspdVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djnk djnkVar4 = (djnk) bZ.b;
            dspdVar.getClass();
            djnkVar4.a |= 1;
            djnkVar4.e = dspdVar;
        }
        return bZ.bK();
    }

    public final Set<dspd> c(int i) {
        Set<dspd> set = this.b.get(Integer.valueOf(i));
        return set != null ? set : dcmr.a;
    }

    public final void d(int i, dspd dspdVar) {
        Set<dspd> set = this.b.get(Integer.valueOf(i));
        if (set != null) {
            set.remove(dspdVar);
        }
        t();
    }

    public final void e(int i) {
        Set<dspd> set = this.b.get(Integer.valueOf(i));
        if (set != null) {
            set.clear();
        }
        t();
    }

    public final boolean f() {
        for (Set<dspd> set : this.b.values()) {
            if (!set.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        return !this.c.isEmpty() || !this.g.isEmpty() || this.j != null || this.h;
    }

    public final boolean h(int i, dspd dspdVar) {
        Set<dspd> set = this.b.get(Integer.valueOf(i));
        return set != null && set.contains(dspdVar);
    }

    public final boolean i(int i) {
        Set<dspd> set = this.b.get(Integer.valueOf(i));
        return set != null && !set.isEmpty();
    }

    public final List<djml> j() {
        dccx dccxVar = new dccx();
        for (bvrt<djml> bvrtVar : this.c) {
            dccxVar.g(bvrtVar.e((dssr) djml.j.cu(7), djml.j));
        }
        return dccxVar.f();
    }

    public final boolean k(djml djmlVar) {
        return h(djmlVar.c, djmlVar.b);
    }

    public final boolean l(int i, dspd dspdVar) {
        for (djml djmlVar : j()) {
            if (djmlVar.c == i && djmlVar.b.equals(dspdVar)) {
                return true;
            }
        }
        return false;
    }

    @dzsi
    public final dwix m() {
        dnnn n = n();
        if (n != null) {
            dwiw bZ = dwix.h.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwix dwixVar = (dwix) bZ.b;
            n.getClass();
            dwixVar.b = n;
            dwixVar.a |= 1;
            return bZ.bK();
        }
        return null;
    }

    @dzsi
    public final dnnn n() {
        return (dnnn) bvrt.f(this.j, (dssr) dnnn.l.cu(7), dnnn.l);
    }

    public final void o(@dzsi dnnn dnnnVar) {
        this.j = bvrt.a(dnnnVar);
    }

    public final void p(dnnn dnnnVar) {
        if (n() != null) {
            dnnn n = n();
            dbsk.s(n);
            dsqp dsqpVar = (dsqp) n.cu(5);
            dsqpVar.bC(n);
            dnnh dnnhVar = (dnnh) dsqpVar;
            dnnhVar.bC(dnnnVar);
            dnnnVar = dnnhVar.bK();
        }
        o(dnnnVar);
    }

    public final boolean q() {
        return h(16, f);
    }

    public final boolean r() {
        return h(25, bsji.a);
    }

    public final boolean s() {
        return l(25, bsji.a);
    }

    public final void t() {
        Iterator<bvrt<djml>> it = this.c.iterator();
        while (it.hasNext()) {
            djml e2 = it.next().e((dssr) djml.j.cu(7), djml.j);
            if (!k(e2) && e2.c != 15) {
                djmk b = djmk.b(e2.g);
                if (b == null) {
                    b = djmk.ALWAYS_SHOW;
                }
                if (b == djmk.SHOW_ONLY_WHEN_APPLIED) {
                    it.remove();
                }
            }
        }
    }

    public final void u(int i, dspd dspdVar, int i2) {
        Map<Integer, Set<dspd>> map = this.b;
        Integer valueOf = Integer.valueOf(i);
        Set<dspd> set = map.get(valueOf);
        if (set == null) {
            set = new LinkedHashSet<>();
            this.b.put(valueOf, set);
        }
        dcep<Integer> dcepVar = a;
        if (dcepVar.contains(valueOf)) {
            dcpd<Integer> it = dcepVar.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (intValue != i) {
                    e(intValue);
                }
            }
            t();
        }
        if (i2 != 3) {
            set.clear();
            t();
        }
        set.add(dspdVar);
    }

    public final List<djkt> v(int i) {
        djkr x = x(i);
        return x != null ? x.c : dcdc.e();
    }

    public final boolean w(int i) {
        return x(i) != null;
    }

    public bsjm(bsjm bsjmVar) {
        this.b = new HashMap();
        for (Map.Entry<Integer, Set<dspd>> entry : bsjmVar.b.entrySet()) {
            this.b.put(entry.getKey(), dcnm.i(entry.getValue()));
        }
        this.c = new ArrayList(bsjmVar.c);
        this.g = new ArrayList(bsjmVar.g);
        this.i = bsjmVar.i;
        this.j = bsjmVar.j;
        this.h = bsjmVar.h;
    }
}
