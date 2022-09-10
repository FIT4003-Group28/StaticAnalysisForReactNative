package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: criv  reason: default package */
/* loaded from: classes5.dex */
final class criv implements arpl {
    final /* synthetic */ criw a;

    public criv(criw criwVar) {
        this.a = criwVar;
    }

    @Override // defpackage.arpl
    public final void a(dwbq dwbqVar, dwbs dwbsVar, long j, @dzsi bttq bttqVar) {
        dwbu dwbuVar;
        dpfh dpfhVar;
        crjn crjnVar;
        dpfh dpfhVar2;
        bvrj.NAVIGATION_INTERNAL.c();
        int i = 0;
        if (bttqVar != null) {
            criw criwVar = this.a;
            if (!criwVar.l) {
                long min = Math.min(criwVar.g.a(), this.a.a);
                criw criwVar2 = this.a;
                criwVar2.k = criwVar2.b.b() + min;
                this.a.c.a(new Runnable(this) { // from class: criu
                    private final criv a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        criw criwVar3 = this.a.a;
                        if (!criwVar3.j) {
                            return;
                        }
                        criwVar3.f(criwVar3.m);
                    }
                }, bvrj.NAVIGATION_INTERNAL, min);
            } else {
                criwVar.k = criwVar.b.b() + this.a.a;
            }
            for (crjh crjhVar : this.a.d.a) {
                if (crjhVar.b.j()) {
                    crjhVar.b.f(crjhVar.a);
                    if (crjhVar.b.i(crjhVar.a)) {
                        crjhVar.b.c.c = false;
                    }
                    crjhVar.b.k();
                }
            }
            return;
        }
        criw criwVar3 = this.a;
        criwVar3.l = true;
        long b = criwVar3.b.b();
        criw criwVar4 = this.a;
        criwVar3.k = b + criwVar4.a;
        criwVar4.g.b();
        crjn crjnVar2 = this.a.f;
        dwbsVar.b.size();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < dwbsVar.b.size()) {
            dwbo dwboVar = dwbsVar.b.get(i2);
            amuh a = crjnVar2.b.a(dwbqVar, dwboVar, j);
            if (a == null || a.n() || !a.j()) {
                crjnVar = crjnVar2;
            } else {
                Iterator<amub> it = a.iterator();
                while (it.hasNext()) {
                    if (!it.next().L) {
                        bvoo.h("Routes must be navigable", new Object[i]);
                    }
                }
                dvzu dvzuVar = dwboVar.b;
                if (dvzuVar == null) {
                    dvzuVar = dvzu.F;
                }
                if ((dvzuVar.a & 262144) != 0) {
                    dvzu dvzuVar2 = dwboVar.b;
                    if (dvzuVar2 == null) {
                        dvzuVar2 = dvzu.F;
                    }
                    dpfh dpfhVar3 = dvzuVar2.A;
                    if (dpfhVar3 == null) {
                        dpfhVar3 = dpfh.l;
                    }
                    dpfhVar2 = dpfhVar3;
                } else {
                    dpfhVar2 = null;
                }
                amub k = a.k();
                k.l().p();
                k.N();
                crjp crjpVar = crjnVar2.c;
                amvh l = k.l();
                btrm btrmVar = crjpVar.a;
                cqat cqatVar = crjpVar.b;
                btwd btwdVar = crjpVar.c;
                craw crawVar = crjpVar.d;
                dbsk.a(!a.n());
                dbsk.a(a.j());
                dccx F = dcdc.F();
                Iterator<amub> it2 = a.iterator();
                while (it2.hasNext()) {
                    F.g(cqzw.a(it2.next(), btrmVar, btwdVar, null, crawVar));
                    crjnVar2 = crjnVar2;
                }
                crjnVar = crjnVar2;
                dcdc f = F.f();
                arrayList.add(new crjo(l, dpfhVar2, cqatVar, f, (cqzw) f.get(a.b())));
            }
            i2++;
            crjnVar2 = crjnVar;
            i = 0;
        }
        int i3 = -1;
        int i4 = (dwbsVar.a & 1) != 0 ? dwbsVar.c : -1;
        if (i4 < dwbsVar.b.size()) {
            i3 = i4;
        }
        amtq c = amtq.c(i3, arrayList);
        crjo crjoVar = (crjo) c.b();
        if (crjoVar == null || (dpfhVar = crjoVar.b) == null) {
            dwbuVar = dwbu.e;
        } else {
            dwbt bZ = dwbu.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwbu dwbuVar2 = (dwbu) bZ.b;
            dpfhVar.getClass();
            dwbuVar2.b = dpfhVar;
            int i5 = dwbuVar2.a | 1;
            dwbuVar2.a = i5;
            int i6 = c.c;
            dwbuVar2.a = i5 | 2;
            dwbuVar2.c = i6;
            dwbuVar = bZ.bK();
        }
        crjm crjmVar = new crjm(c, dwbuVar);
        criw criwVar5 = this.a;
        dwbu dwbuVar3 = crjmVar.b;
        criwVar5.h = dwbuVar3.d;
        criwVar5.d.clear();
        criwVar5.d.addAll(crjmVar.a);
        for (crjh crjhVar2 : criwVar5.d.a) {
            if (crjhVar2.b.i(crjhVar2.a) && !crjhVar2.a.isEmpty()) {
                cqzw cqzwVar = crjhVar2.a.get(0).e;
                amub amubVar = cqzwVar.g;
                crji crjiVar = crjhVar2.b;
                crka crkaVar = crjiVar.b;
                if (!crkaVar.a) {
                    crkaVar.d(crjiVar.a, amubVar, true, cqzwVar.b);
                }
            }
            if (crjhVar2.b.j()) {
                crjhVar2.b.f(crjhVar2.a);
                if (crjhVar2.b.i(crjhVar2.a)) {
                    crji crjiVar2 = crjhVar2.b;
                    List<dozz> list = crjiVar2.j.h;
                    if (list != null) {
                        crjiVar2.c.i = dcdc.r(list);
                    }
                    crjhVar2.b.c.c = true;
                }
                crjhVar2.b.k();
            }
        }
        if ((dwbuVar3.a & 1) == 0) {
            return;
        }
        dpfh dpfhVar4 = dwbuVar3.b;
        if (dpfhVar4 == null) {
            dpfhVar4 = dpfh.l;
        }
        int i7 = dwbuVar3.c;
        if (i7 < 0) {
            return;
        }
        crjo crjoVar2 = criwVar5.d.get(i7);
        amuh a2 = crjoVar2.a();
        if (!a2.j() || criwVar5.n) {
            return;
        }
        criwVar5.n = true;
        long j2 = a2.k().f;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        dpfc dpfcVar = dpfhVar4.j;
        if (dpfcVar == null) {
            dpfcVar = dpfc.b;
        }
        criwVar5.e.e(crqb.m(1, crqa.d(crjoVar2.b(), a2, dpfhVar4), j2 + timeUnit.toMillis(dpfcVar.a), null, null));
    }
}
