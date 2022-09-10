package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: alst  reason: default package */
/* loaded from: classes.dex */
public final class alst {
    public final alsz a;
    @dzsi
    public altp b;
    public boolean d;
    @dzsi
    public volatile bnrs f;
    @dzsi
    private altt h;
    @dzsi
    private Set<altt> i;
    public final Map<alyh, Collection<altt>> c = dcjz.d();
    private final Collection<alyh> g = dcnm.c();
    public boolean e = true;

    public alst(alsz alszVar) {
        this.a = alszVar;
    }

    public final synchronized void b(Collection<alyh> collection, @dzsi akzh akzhVar) {
        this.g.clear();
        this.g.addAll(collection);
        HashSet c = dcnm.c();
        for (alyh alyhVar : this.c.keySet()) {
            if (!collection.contains(alyhVar)) {
                c.add(alyhVar);
            }
        }
        this.c.keySet().removeAll(c);
        if (!c.isEmpty()) {
            this.e = true;
        }
        this.a.a.f(collection);
        a(e(d(akzhVar)), f());
    }

    public final synchronized Collection<alyh> c() {
        HashSet c;
        c = dcnm.c();
        for (alyh alyhVar : this.g) {
            if (!this.c.containsKey(alyhVar)) {
                c.add(alyhVar);
            }
        }
        return c;
    }

    public final altt d(@dzsi akzh akzhVar) {
        akqp akqpVar;
        if (akzhVar == null || akzhVar.p().k < 18.0f) {
            return altt.d;
        }
        HashSet<altt> c = dcnm.c();
        for (Collection<altt> collection : this.c.values()) {
            c.addAll(collection);
        }
        akra akraVar = akzhVar.p().j;
        double d = akzhVar.p().k;
        double d2 = 8.0d;
        if (d > 19.0d) {
            Double.isNaN(d);
            d2 = 8.0d / Math.pow(2.0d, d - 19.0d);
        }
        akrp h = akrp.h(akraVar, (int) (akraVar.r() * d2));
        altt alttVar = altt.d;
        float f = 0.0f;
        for (altt alttVar2 : c) {
            if (alttVar2.b.k(h)) {
                if (alttVar2.c == null) {
                    alts altsVar = alttVar2.a;
                    akqp akqpVar2 = null;
                    if (altsVar != null && (akqpVar = altsVar.d) != null) {
                        akqpVar2 = akqpVar;
                    }
                    if (akqpVar2 != null) {
                        alttVar2.c = akqpVar2.a();
                    } else {
                        akrp i = alttVar2.b.i();
                        akra akraVar2 = new akra();
                        i.t(akraVar2);
                        alttVar2.c = akraVar2;
                    }
                }
                float A = alttVar2.c.A(akzhVar.p().j);
                if (alttVar == altt.d || A < f) {
                    alttVar = alttVar2;
                    f = A;
                }
            }
        }
        return alttVar;
    }

    @dzsi
    public final altt e(altt alttVar) {
        if (alttVar == this.h) {
            return null;
        }
        this.h = alttVar;
        return alttVar;
    }

    @dzsi
    public final Set<altt> f() {
        if (!this.e) {
            return null;
        }
        dcen N = dcep.N();
        for (Collection<altt> collection : this.c.values()) {
            N.i(collection);
        }
        dcep f = N.f();
        boolean z = !f.equals(this.i);
        this.i = f;
        alsz alszVar = this.a;
        HashSet c = dcnm.c();
        HashSet c2 = dcnm.c();
        Iterator<E> it = f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            alts altsVar = ((altt) it.next()).a;
            if (altsVar != null) {
                c.add(altsVar.a);
                dcdc<altu> dcdcVar = altsVar.b;
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    c2.add(dcdcVar.get(i).b());
                }
            }
        }
        alszVar.b.a.f(c);
        alszVar.c.a.f(c2);
        this.e = false;
        if (!z) {
            return null;
        }
        return this.i;
    }

    public final void a(@dzsi altt alttVar, @dzsi Set<altt> set) {
        boolean a;
        altg altgVar;
        boolean z;
        altu a2;
        btrm btrmVar;
        altp altpVar = this.b;
        if (altpVar != null) {
            if (alttVar != null) {
                alts altsVar = alttVar.a;
                if (altpVar.j()) {
                    synchronized (altpVar) {
                        altc altcVar = altpVar.a;
                        z = !dbsd.a(altcVar.a, altsVar);
                        altcVar.a = altsVar;
                        a2 = altpVar.a.a(altsVar);
                    }
                    if (z) {
                        synchronized (altpVar) {
                            altg altgVar2 = altpVar.e;
                            if (altgVar2 != null) {
                                altgVar2.a(altpVar.a);
                            }
                        }
                        altpVar.r(a2);
                        dcpd<alsp> it = altpVar.o().iterator();
                        while (it.hasNext()) {
                            it.next().a();
                        }
                        if (altsVar != null) {
                            altpVar.p(a2, altsVar, altpVar.b.a());
                        }
                    }
                    synchronized (altpVar) {
                        if (altsVar != null) {
                            if (!altsVar.c && (btrmVar = altpVar.c) != null) {
                                btrmVar.b(new alhd(new alhc(cjtd.a(dtyi.J))));
                            }
                        }
                    }
                }
            }
            if (set == null) {
                return;
            }
            altp altpVar2 = this.b;
            synchronized (altpVar2) {
                btrm btrmVar2 = altpVar2.c;
                if (btrmVar2 != null) {
                    btrmVar2.b(new alsr(set));
                }
                altc altcVar2 = altpVar2.a;
                a = true ^ dbsd.a(altcVar2.c, set);
                if (a) {
                    altcVar2.c.clear();
                    altcVar2.c.addAll(set);
                }
                if (a && (altgVar = altpVar2.e) != null) {
                    altgVar.a(altpVar2.a);
                }
            }
            if (!a) {
                return;
            }
            dcpd<alsp> it2 = altpVar2.o().iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
        }
    }
}
