package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: amjg  reason: default package */
/* loaded from: classes.dex */
final class amjg implements Comparator<amkk> {
    private final List<amkk> a = new ArrayList();
    private final IdentityHashMap<amkk, Integer> b;

    public amjg(List<amkk> list, dbsl<amkk> dbslVar) {
        this.b = new IdentityHashMap<>(list.size());
        dzls dzlsVar = new dzls();
        int i = Integer.MAX_VALUE;
        for (amkk amkkVar : list) {
            if (dbslVar.a(amkkVar)) {
                long d = amkkVar.d();
                if (!dzlsVar.f(d) || dzlsVar.i(d) < amkkVar.a().h) {
                    dzlsVar.a(d, amkkVar.a().h);
                }
            }
            if (amkkVar.w() && akxf.G(amkkVar.a())) {
                i = Math.min(i, amkkVar.a().h);
                this.a.add(amkkVar);
            }
        }
        dzls dzlsVar2 = new dzls();
        Collections.sort(this.a, amjf.a);
        int i2 = 0;
        while (i2 < this.a.size()) {
            dzlsVar2.a(this.a.get(i2).d(), i);
            i2++;
            i++;
        }
        for (amkk amkkVar2 : list) {
            int i3 = amkkVar2.a().h;
            if (amkkVar2.w()) {
                if (dzlsVar.f(amkkVar2.d())) {
                    i3 = dzlsVar.i(amkkVar2.d());
                } else if (dzlsVar2.f(amkkVar2.d()) && akxf.G(amkkVar2.a())) {
                    i3 = dzlsVar2.i(amkkVar2.d());
                }
            }
            this.b.put(amkkVar2, Integer.valueOf(i3));
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(amkk amkkVar, amkk amkkVar2) {
        amkk amkkVar3 = amkkVar;
        amkk amkkVar4 = amkkVar2;
        dbzx h = dbzx.b.h(amkkVar3.O(), amkkVar4.O()).h(amkkVar3.T(), amkkVar4.T()).h(amkkVar3.S(), amkkVar4.S());
        Integer num = this.b.get(amkkVar3);
        dbsk.s(num);
        Integer num2 = this.b.get(amkkVar4);
        dbsk.s(num2);
        dbzx a = h.a(num, num2).h(amkkVar3.w(), amkkVar4.w()).a(amkkVar3.e(), amkkVar4.e());
        dmlq dmlqVar = amkkVar3.a().d;
        if (dmlqVar == null) {
            dmlqVar = dmlq.e;
        }
        int i = dmlqVar.bC;
        if (i == 0) {
            i = dsst.a.b(dmlqVar).c(dmlqVar);
            dmlqVar.bC = i;
        }
        dmlq dmlqVar2 = amkkVar4.a().d;
        if (dmlqVar2 == null) {
            dmlqVar2 = dmlq.e;
        }
        int i2 = dmlqVar2.bC;
        if (i2 == 0) {
            i2 = dsst.a.b(dmlqVar2).c(dmlqVar2);
            dmlqVar2.bC = i2;
        }
        dbzx c = a.c(i, i2);
        dmrf dmrfVar = amkkVar3.a().e;
        if (dmrfVar == null) {
            dmrfVar = dmrf.f;
        }
        int i3 = dmrfVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(dmrfVar).c(dmrfVar);
            dmrfVar.bC = i3;
        }
        dmrf dmrfVar2 = amkkVar4.a().e;
        if (dmrfVar2 == null) {
            dmrfVar2 = dmrf.f;
        }
        int i4 = dmrfVar2.bC;
        if (i4 == 0) {
            i4 = dsst.a.b(dmrfVar2).c(dmrfVar2);
            dmrfVar2.bC = i4;
        }
        return c.c(i3, i4).h(amkkVar3.x(), amkkVar4.x()).c(amkkVar3.hashCode(), amkkVar4.hashCode()).i();
    }
}
