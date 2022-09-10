package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: alux  reason: default package */
/* loaded from: classes2.dex */
public final class alux extends alvf {
    private final Set<alyh> f;
    private final akra g;
    private akzh h;
    private aksi i;
    private float j;
    private final float k;
    private boolean l;

    public alux(akry akryVar, int i, alyx alyxVar) {
        super(akryVar, alyxVar);
        this.f = dcnm.c();
        this.g = new akra();
        this.l = true;
        this.k = i * i;
    }

    private final void e(List<alyh> list, alyh alyhVar, akra akraVar, boolean z) {
        akzh akzhVar;
        dbsk.s(this.i);
        if (!z || this.i.o(alyhVar.f())) {
            dbsk.s(this.h);
            int i = alyhVar.a;
            int i2 = 536870912 >> i;
            this.g.t(alyhVar.e + i2, alyhVar.f + i2);
            float round = Math.round((((i2 + i2) * this.h.n()) * akzhVar.z()) / this.h.t(this.g, true));
            if (Math.round(round * this.j * round) <= this.k || i >= 30) {
                list.add(alyhVar);
                f(alyhVar);
                return;
            }
            List<alyh> b = b(alyhVar, akraVar);
            if (b.isEmpty()) {
                list.add(alyhVar);
                f(alyhVar);
                return;
            }
            for (alyh alyhVar2 : b) {
                e(list, alyhVar2, akraVar, true);
            }
        }
    }

    private final void f(alyh alyhVar) {
        if (!this.l || this.f.contains(alyhVar)) {
            return;
        }
        this.l = false;
        this.b++;
    }

    @Override // defpackage.alvb
    public final synchronized long d(akzh akzhVar, List<alyh> list) {
        list.clear();
        bnrs f = akzhVar.f();
        if (f == this.d && !this.f.isEmpty()) {
            list.addAll(this.f);
            return this.b;
        }
        this.l = true;
        aksi r = akzhVar.r();
        this.i = r;
        akqk akqkVar = r.b;
        int b = g(akzhVar.g()).b(akyx.c(akzhVar, akqkVar.h().y(akqkVar.g()), akzhVar.y()));
        this.h = akzhVar;
        double d = akzhVar.p().l;
        Double.isNaN(d);
        this.j = (float) Math.cos(d * 0.017453292519943295d);
        ArrayList a = dchl.a();
        alyh.k(this.i.c, b, a, null);
        for (int i = 0; i < a.size(); i++) {
            e(list, (alyh) a.get(i), akzhVar.g(), false);
        }
        this.f.clear();
        this.f.addAll(list);
        h(list, akzhVar.p().j);
        this.d = f;
        return this.b;
    }
}
