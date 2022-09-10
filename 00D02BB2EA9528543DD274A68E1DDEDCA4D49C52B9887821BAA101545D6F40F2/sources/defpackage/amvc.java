package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: amvc  reason: default package */
/* loaded from: classes2.dex */
public final class amvc {
    public final amuz[] a;

    public amvc(amub amubVar) {
        boolean z;
        dbsk.a(amubVar.h.equals(dqvj.TRANSIT));
        amve amveVar = amubVar.d;
        dbsk.l(amveVar.b.length == 1);
        amtr amtrVar = amveVar.b[0];
        amuz[] amuzVarArr = new amuz[amtrVar.e()];
        for (int i = 0; i < amtrVar.e(); i++) {
            amuq d = amtrVar.d(i);
            amuz amuzVar = null;
            if (d.f()) {
                ArrayList arrayList = new ArrayList();
                dphe g = d.g();
                int c = bvoa.c(g.f, -12417548);
                dpgw dpgwVar = g.c;
                arrayList.add(dpgwVar == null ? dpgw.r : dpgwVar);
                arrayList.addAll(g.j);
                dpgw dpgwVar2 = g.d;
                arrayList.add(dpgwVar2 == null ? dpgw.r : dpgwVar2);
                amuz amuzVar2 = new amuz();
                amvb amvbVar = null;
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    dpgw dpgwVar3 = (dpgw) arrayList.get(i2);
                    dnoh dnohVar = dpgwVar3.i;
                    dnohVar = dnohVar == null ? dnoh.d : dnohVar;
                    akra e = akra.e(dnohVar.b, dnohVar.c);
                    int i3 = i2;
                    List<akrn> aC = amubVar.aC(e, e.r() * 150.0d, 0, 10, false);
                    if (aC.isEmpty()) {
                        new amuy(dpgwVar3);
                    } else if (amvbVar == null) {
                        amvbVar = amuzVar2.a(i3, aC.get(0), arrayList.size(), amubVar, dpgwVar3, c, 0.0f);
                    } else {
                        Iterator<akrn> it = aC.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            akrn next = it.next();
                            double M = amubVar.M(next);
                            if (M > amvbVar.c) {
                                amvbVar = amuzVar2.a(i3, next, arrayList.size(), amubVar, dpgwVar3, c, (float) (M - amvbVar.c));
                                z = true;
                                break;
                            }
                        }
                        if (!z) {
                            new amuy(dpgwVar3);
                        }
                    }
                    i2 = i3 + 1;
                }
                amuzVar = amuzVar2;
            }
            amuzVarArr[i] = amuzVar;
        }
        this.a = amuzVarArr;
    }

    public final dcdc<amvb> a(int i) {
        amuz amuzVar = this.a[i];
        if (amuzVar == null) {
            return null;
        }
        return dcdc.r(amuzVar.a);
    }
}
