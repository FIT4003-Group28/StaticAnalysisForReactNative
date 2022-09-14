package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: xhy  reason: default package */
/* loaded from: classes7.dex */
public final class xhy implements xib {
    private final cqat a;
    private final xih b;

    public xhy(cqat cqatVar, xih xihVar) {
        this.a = cqatVar;
        this.b = xihVar;
    }

    @Override // defpackage.xib
    public final List<xia> a(Iterable<? extends wpv> iterable, @dzsi ddho ddhoVar) {
        eaou b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TreeMap treeMap = new TreeMap();
        long b2 = this.a.b();
        wpv wpvVar = (wpv) dcft.r(iterable, null);
        if (wpvVar == null) {
            b = shu.b(b2);
        } else {
            eapr ab = wpvVar.ab();
            if (ab != null) {
                b = ab.v();
            } else {
                b = shu.b(b2);
            }
        }
        eapg eapgVar = new eapg(b2, b);
        for (wpv wpvVar2 : iterable) {
            eapg G = wpvVar2.G();
            if (G == null || G.equals(eapgVar)) {
                arrayList2.add(wpvVar2);
            } else if (G.C(eapgVar)) {
                arrayList.add(wpvVar2);
            } else {
                if (!treeMap.containsKey(wpvVar2.G())) {
                    treeMap.put(G, new ArrayList());
                }
                List list = (List) treeMap.get(G);
                dbsk.s(list);
                list.add(wpvVar2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList.isEmpty()) {
            arrayList3.add(xia.c(dbpy.a, dcdc.r(arrayList)));
        }
        if (!arrayList2.isEmpty()) {
            arrayList3.add(xia.c(arrayList.isEmpty() ? dbpy.a : dbsg.i(this.b.a(eapgVar, eapgVar, ddhoVar)), dcdc.r(arrayList2)));
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            arrayList3.add(xia.c(dbsg.i(this.b.a(eapgVar, (eapg) entry.getKey(), ddhoVar)), dcdc.r((Collection) entry.getValue())));
        }
        return arrayList3;
    }
}
