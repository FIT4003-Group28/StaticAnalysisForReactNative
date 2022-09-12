package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: axyz  reason: default package */
/* loaded from: classes3.dex */
public final class axyz {
    public final batm a;
    private final btrg b;
    private final Map<dpov, axyx> c = new HashMap();

    public axyz(btrg btrgVar, batm batmVar) {
        this.b = btrgVar;
        this.a = batmVar;
    }

    public final void a(axyy axyyVar, dpov dpovVar) {
        d(dpovVar).c(axyyVar);
    }

    public final void b(axyy axyyVar, dpov dpovVar) {
        d(dpovVar).d(axyyVar);
    }

    public final void c(dpov dpovVar) {
        axyx d = d(dpovVar);
        btrg btrgVar = this.b;
        dpqw dpqwVar = dpqw.COLLABORATOR_ENTITY_LIST;
        dibe bZ = dibg.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dibg dibgVar = (dibg) bZ.b;
        dpovVar.getClass();
        dibgVar.c = dpovVar;
        dibgVar.b = 1;
        dibg dibgVar2 = (dibg) bZ.b;
        dibgVar2.d = 2;
        int i = dibgVar2.a | 4;
        dibgVar2.a = i;
        dibgVar2.e = dpqwVar.f;
        dibgVar2.a = i | 8;
        dnqh h = btrg.h(ddda.ar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dibg dibgVar3 = (dibg) bZ.b;
        h.getClass();
        dibgVar3.f = h;
        dibgVar3.a |= 64;
        deha.q(deew.h(deew.h(degp.q(btrgVar.f(btrgVar.e, bZ.bK(), btqf.a, new bvqg() { // from class: btqg
            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                btzy btzyVar = (btzy) obj;
            }
        })), btrg.g(new bvqg() { // from class: btqi
            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                int i2 = ((dibi) obj).a;
            }
        }), dege.a), btqj.a, dege.a), new axyu(this, d, dpovVar), dege.a);
    }

    public final synchronized axyx d(dpov dpovVar) {
        axyx axyxVar = this.c.get(dpovVar);
        if (axyxVar == null) {
            axyx axyxVar2 = new axyx(this);
            this.c.put(dpovVar, axyxVar2);
            return axyxVar2;
        }
        return axyxVar;
    }
}
