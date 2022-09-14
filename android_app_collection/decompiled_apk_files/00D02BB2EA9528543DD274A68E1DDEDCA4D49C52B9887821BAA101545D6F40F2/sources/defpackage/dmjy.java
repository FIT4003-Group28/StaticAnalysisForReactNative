package defpackage;

import defpackage.anmq;
import defpackage.dmki;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dmjy  reason: default package */
/* loaded from: classes6.dex */
public final class dmjy<P extends dmki<P, L>, L extends anmq> {
    public final dcdn<String, L> a;

    public dmjy(dcdn<String, L> dcdnVar) {
        this.a = dcdnVar;
    }

    public static <P extends dmki<P, L>, L extends anmq> P a(String str, P p, Iterable<P> iterable) {
        int i;
        dbpy<Object> dbpyVar;
        if (!p.e().a()) {
            return p;
        }
        L b = p.e().b();
        Iterator<P> it = iterable.iterator();
        loop0: while (true) {
            if (it.hasNext()) {
                P next = it.next();
                ArrayList arrayList = new ArrayList();
                dbsg<L> e = next.e();
                if (e.a()) {
                    arrayList.add(e.b());
                }
                arrayList.addAll(next.f());
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    anmq anmqVar = (anmq) arrayList.get(i2);
                    i2++;
                    if (str.equals(anmqVar.c())) {
                        anmqVar.f();
                        dbpyVar = dbpy.a;
                        break loop0;
                    }
                }
            } else {
                dbpyVar = dbpy.a;
                break;
            }
        }
        if (dbpyVar.a()) {
            b.k((anmq) dbpyVar.b());
            p = (P) p.l(b);
        }
        dccx F = dcdc.F();
        for (P p2 : iterable) {
            dbsg<L> e2 = p2.e();
            if (e2.a()) {
                F.g(e2.b());
            }
            F.i(p2.f());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        dcdc w = dcdc.w(dcln.a.g(dmjx.a).c(), F.f());
        int size2 = w.size();
        for (int i3 = 0; i3 < size2; i3++) {
            anmq anmqVar2 = (anmq) w.get(i3);
            if (!anmqVar2.c().isEmpty() && !linkedHashMap.containsKey(anmqVar2.c())) {
                linkedHashMap.put(anmqVar2.c(), anmqVar2);
            }
        }
        dcdc<anmq> r = dcdc.r(linkedHashMap.values());
        String c = b.c();
        dccx F2 = dcdc.F();
        for (anmq anmqVar3 : r) {
            if (!anmqVar3.c().equals(c)) {
                F2.g(anmqVar3);
            }
        }
        dcdc f = F2.f();
        HashSet hashSet = new HashSet();
        hashSet.add("");
        dccx F3 = dcdc.F();
        if (p.e().a()) {
            hashSet.add(p.e().b().c());
        }
        int size3 = f.size();
        for (i = 0; i < size3; i++) {
            anmq anmqVar4 = (anmq) f.get(i);
            if (hashSet.add(anmqVar4.c())) {
                F3.g(anmqVar4);
            }
        }
        return (P) p.k(F3.f());
    }

    public static <L extends anmq> void b(L l, Map<String, L> map) {
        String c = l.c();
        l.l();
        L l2 = map.get(c);
        if (l2 == null || !l2.g()) {
            map.put(c, l);
        }
    }
}
