package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cezg  reason: default package */
/* loaded from: classes4.dex */
public class cezg {
    public final befw a;
    private final Map<String, ilo> b = new aif();
    private final dcka<String, bwrr<ilo>> c = dbyv.N();
    private final cfgv d;
    private final bwqv e;

    public cezg(cfgv cfgvVar, befw befwVar, bwqv bwqvVar) {
        this.d = cfgvVar;
        this.a = befwVar;
        this.e = bwqvVar;
    }

    public final synchronized ilo a(String str) {
        ilo iloVar;
        iloVar = this.b.get(str);
        if (iloVar == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append("FeatureId ");
            sb.append(str);
            sb.append(" was requested, but not loaded.");
            throw new IllegalArgumentException(sb.toString());
        }
        return iloVar;
    }

    public final synchronized void b() {
        dlnu dlnuVar;
        dbsg dbsgVar;
        ilo d;
        for (dlny dlnyVar : this.d.a().d) {
            dlnv dlnvVar = dlnyVar.d;
            if (dlnvVar == null) {
                dlnvVar = dlnv.f;
            }
            if (dlnvVar.b == 3) {
                dlnv dlnvVar2 = dlnyVar.d;
                if (dlnvVar2 == null) {
                    dlnvVar2 = dlnv.f;
                }
                if (dlnvVar2.b == 3) {
                    dlnuVar = (dlnu) dlnvVar2.c;
                } else {
                    dlnuVar = dlnu.c;
                }
                String str = dlnuVar.b;
                if (!this.b.containsKey(str)) {
                    Map<String, ilo> map = this.b;
                    Iterator it = Collections.unmodifiableList(((cfgj) this.d.a.b).e).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            dbsgVar = dbpy.a;
                            break;
                        }
                        dvyw dvywVar = (dvyw) it.next();
                        if (str.equals(dvywVar.g)) {
                            dbsgVar = dbsg.i(dvywVar);
                            break;
                        }
                    }
                    if (dbsgVar.a()) {
                        ily ilyVar = new ily();
                        ilyVar.E((dvyw) dbsgVar.b());
                        d = ilyVar.d();
                    } else {
                        ily ilyVar2 = new ily();
                        ilyVar2.k(str);
                        ilyVar2.u = "";
                        d = ilyVar2.d();
                        bwrs<ilo> a = bwrs.a(d);
                        befu p = befv.p();
                        p.j(a);
                        p.g(true);
                        p.k(false);
                        dnqg bZ = dnqh.p.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dnqh.b((dnqh) bZ.b);
                        ((befp) p).a = bZ.bK();
                        befv m = p.m();
                        this.e.f(a, new bwrr(this) { // from class: cezf
                            private final cezg a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.bwrr
                            public final void PV(Object obj) {
                                this.a.c((ilo) obj);
                            }
                        }, false);
                        this.a.d(m);
                    }
                    map.put(str, d);
                }
            }
        }
    }

    public final synchronized void c(@dzsi ilo iloVar) {
        if (iloVar == null) {
            return;
        }
        cfgv cfgvVar = this.d;
        dvyw h = iloVar.h();
        int i = 0;
        while (true) {
            if (i < ((cfgj) cfgvVar.a.b).e.size()) {
                if (((cfgj) cfgvVar.a.b).e.get(i).g.equals(h.g)) {
                    cfgi cfgiVar = cfgvVar.a;
                    if (cfgiVar.c) {
                        cfgiVar.bF();
                        cfgiVar.c = false;
                    }
                    cfgj cfgjVar = (cfgj) cfgiVar.b;
                    h.getClass();
                    cfgjVar.b();
                    cfgjVar.e.set(i, h);
                } else {
                    i++;
                }
            } else {
                cfgi cfgiVar2 = cfgvVar.a;
                if (cfgiVar2.c) {
                    cfgiVar2.bF();
                    cfgiVar2.c = false;
                }
                cfgj cfgjVar2 = (cfgj) cfgiVar2.b;
                h.getClass();
                cfgjVar2.b();
                cfgjVar2.e.add(h);
            }
        }
        this.b.put(iloVar.ai().o(), iloVar);
        for (bwrr bwrrVar : ((dbxj) this.c).f(iloVar.ai().o())) {
            bwrrVar.PV(iloVar);
        }
        ((dbxj) this.c).g(iloVar.ai().o());
    }
}
