package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aydz  reason: default package */
/* loaded from: classes3.dex */
public class aydz implements aydl {
    private dpre c;
    private final akfa e;
    private final aydi f;
    private LinkedHashMap<String, aydj> a = new LinkedHashMap<>();
    private dcdc<aydj> b = dcdc.e();
    private boolean d = false;

    public aydz(akfa akfaVar, aydi aydiVar) {
        this.e = akfaVar;
        this.f = aydiVar;
    }

    private static void k(dccx<aydj> dccxVar, aydj aydjVar) {
        if (aydjVar != null) {
            dccxVar.g(aydjVar);
        }
    }

    @Override // defpackage.aydl
    public List<aydj> a() {
        return this.b;
    }

    @Override // defpackage.aydl
    public Boolean b() {
        return Boolean.valueOf(!this.b.isEmpty());
    }

    @Override // defpackage.aydl
    public Boolean c() {
        boolean z = true;
        if (this.b.size() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aydl
    public aydj d(String str) {
        if (this.a.containsKey(str)) {
            return this.a.get(str);
        }
        return null;
    }

    @Override // defpackage.aydl
    public List<aydj> e() {
        return f().booleanValue() ? this.b.subList(0, 3) : this.b;
    }

    @Override // defpackage.aydl
    public Boolean f() {
        return Boolean.valueOf(this.b.size() > 4);
    }

    @Override // defpackage.aydl
    public aydi g() {
        this.f.b(f().booleanValue() ? this.b.size() - 3 : 0);
        return this.f;
    }

    @Override // defpackage.aydl
    public void h(dpre dpreVar) {
        this.c = dpreVar;
    }

    @Override // defpackage.aydl
    public void i(boolean z) {
        this.d = z;
    }

    @Override // defpackage.aydl
    public void j(Iterable<dpre> iterable) {
        aydk aydkVar;
        btlu j = this.e.j();
        final aydj aydjVar = null;
        String j2 = (j == null || btlu.i(j) != btlt.GOOGLE) ? null : j.j();
        dpre dpreVar = this.c;
        String str = dpreVar == null ? null : dpreVar.d;
        if (str != null && str.equals(j2)) {
            dbuh.d(j);
            dbuh.d(this.c);
            dpre dpreVar2 = this.c;
            dsqp dsqpVar = (dsqp) dpreVar2.cu(5);
            dsqpVar.bC(dpreVar2);
            dprd dprdVar = (dprd) dsqpVar;
            String e = dbsj.e(j.v());
            if (dprdVar.c) {
                dprdVar.bF();
                dprdVar.c = false;
            }
            dpre dpreVar3 = (dpre) dprdVar.b;
            dpre dpreVar4 = dpre.e;
            e.getClass();
            dpreVar3.a |= 1;
            dpreVar3.b = e;
            String e2 = dbsj.e(j.i);
            if (dprdVar.c) {
                dprdVar.bF();
                dprdVar.c = false;
            }
            dpre dpreVar5 = (dpre) dprdVar.b;
            e2.getClass();
            dpreVar5.a |= 2;
            dpreVar5.c = e2;
            this.c = dprdVar.bK();
        }
        dpre dpreVar6 = this.c;
        if (dpreVar6 != null) {
            iterable = dcbg.d(iterable, dcdc.f(dpreVar6));
        }
        dcdc<dpre> w = dcdc.w(aydw.a, iterable);
        LinkedHashMap<String, aydj> linkedHashMap = this.a;
        dcep L = dcep.L(dcft.o(w, aydy.a));
        LinkedHashMap<String, aydj> linkedHashMap2 = new LinkedHashMap<>();
        for (Map.Entry<String, aydj> entry : linkedHashMap.entrySet()) {
            if (L.contains(entry.getKey())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (dpre dpreVar7 : w) {
            dpre dpreVar8 = this.c;
            if (dpreVar8 == null || !dpreVar7.d.equals(dpreVar8.d)) {
                aydkVar = aydk.COLLABORATOR;
            } else {
                aydkVar = aydk.OWNER;
            }
            if (linkedHashMap.containsKey(dpreVar7.d)) {
                aydj aydjVar2 = linkedHashMap2.get(dpreVar7.d);
                if (aydjVar2 != null) {
                    aydjVar2.d(dpreVar7, aydkVar);
                }
            } else {
                linkedHashMap2.put(dpreVar7.d, new aydv(dpreVar7, aydkVar));
            }
        }
        if (!dchl.m(dcdc.r(this.a.keySet()), dcdc.r(linkedHashMap2.keySet()))) {
            this.a = linkedHashMap2;
            dccx dccxVar = new dccx();
            final aydj aydjVar3 = j2 == null ? null : this.a.get(j2);
            if (str != null) {
                aydjVar = this.a.get(str);
            }
            if (aydjVar3 == aydjVar) {
                k(dccxVar, aydjVar3);
            } else if (this.d) {
                k(dccxVar, aydjVar);
                k(dccxVar, aydjVar3);
            } else {
                k(dccxVar, aydjVar3);
                k(dccxVar, aydjVar);
            }
            dccxVar.i(dcft.i(this.a.values(), new dbsl(aydjVar, aydjVar3) { // from class: aydx
                private final aydj a;
                private final aydj b;

                {
                    this.a = aydjVar;
                    this.b = aydjVar3;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    aydj aydjVar4 = (aydj) obj;
                    return (aydjVar4 == this.a || aydjVar4 == this.b) ? false : true;
                }
            }));
            this.b = dccxVar.f();
            cqkx.p(this);
        }
    }
}
