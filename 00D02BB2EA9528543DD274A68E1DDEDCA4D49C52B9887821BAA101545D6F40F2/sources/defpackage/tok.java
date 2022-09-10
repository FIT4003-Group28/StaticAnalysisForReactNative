package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: tok  reason: default package */
/* loaded from: classes7.dex */
final class tok {
    private final ConcurrentHashMap<dqvj, tol> a = new ConcurrentHashMap<>();

    public final synchronized void a(dqvj dqvjVar, eapd eapdVar) {
        this.a.putIfAbsent(dqvjVar, new tol());
        tol tolVar = this.a.get(dqvjVar);
        dbsk.s(tolVar);
        eapd a = tol.a(eapdVar);
        tolVar.c.put(a, Integer.valueOf((tolVar.c.containsKey(a) ? tolVar.c.get(a).intValue() : 0) + 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized tqz b() {
        tqv bZ;
        bZ = tqz.b.bZ();
        for (Map.Entry<dqvj, tol> entry : this.a.entrySet()) {
            tqw bZ2 = tqy.d.bZ();
            dqvj key = entry.getKey();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            tqy tqyVar = (tqy) bZ2.b;
            tqyVar.b = key.k;
            tqyVar.a |= 1;
            eapd f = eapd.a().f(tol.b);
            for (Map.Entry<eapd, Integer> entry2 : entry.getValue().c.entrySet()) {
                if (entry2.getKey().w(f)) {
                    long j = entry2.getKey().a;
                    int intValue = entry2.getValue().intValue();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    tqy tqyVar2 = (tqy) bZ2.b;
                    dssd<Long, Integer> dssdVar = tqyVar2.c;
                    if (!dssdVar.a) {
                        tqyVar2.c = dssdVar.a();
                    }
                    tqyVar2.c.put(Long.valueOf(j), Integer.valueOf(intValue));
                }
            }
            tqy bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            tqz tqzVar = (tqz) bZ.b;
            bK.getClass();
            dsrj<tqy> dsrjVar = tqzVar.a;
            if (!dsrjVar.a()) {
                tqzVar.a = dsqw.cl(dsrjVar);
            }
            tqzVar.a.add(bK);
        }
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(tqz tqzVar) {
        for (tqy tqyVar : tqzVar.a) {
            ConcurrentHashMap<dqvj, tol> concurrentHashMap = this.a;
            dqvj c = dqvj.c(tqyVar.b);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            concurrentHashMap.putIfAbsent(c, new tol());
            ConcurrentHashMap<dqvj, tol> concurrentHashMap2 = this.a;
            dqvj c2 = dqvj.c(tqyVar.b);
            if (c2 == null) {
                c2 = dqvj.DRIVE;
            }
            tol tolVar = concurrentHashMap2.get(c2);
            dbsk.s(tolVar);
            for (Map.Entry entry : Collections.unmodifiableMap(tqyVar.c).entrySet()) {
                eapd eapdVar = new eapd(entry.getKey());
                if (tolVar.c.containsKey(eapdVar)) {
                    HashMap<eapd, Integer> hashMap = tolVar.c;
                    hashMap.put(eapdVar, Integer.valueOf(hashMap.get(eapdVar).intValue() + ((Integer) entry.getValue()).intValue()));
                } else {
                    tolVar.c.put(eapdVar, (Integer) entry.getValue());
                }
            }
        }
    }

    public final synchronized dbsg<dqvj> d(eapd eapdVar) {
        Iterator<Map.Entry<dqvj, tol>> it;
        tol tolVar;
        Iterator<eapd> it2;
        double d;
        dbsg<dqvj> dbsgVar = dbpy.a;
        Iterator<Map.Entry<dqvj, tol>> it3 = this.a.entrySet().iterator();
        double d2 = dcyn.a;
        double d3 = dcyn.a;
        while (it3.hasNext()) {
            Map.Entry<dqvj, tol> next = it3.next();
            tol value = next.getValue();
            Iterator<eapd> it4 = value.c.keySet().iterator();
            double d4 = dcyn.a;
            while (it4.hasNext()) {
                eapd next2 = it4.next();
                if (value.c.containsKey(next2) && !next2.w(eapdVar)) {
                    int intValue = value.c.get(next2).intValue();
                    it = it3;
                    eaow eaowVar = new eaow(next2, tol.a(eapdVar));
                    double d5 = intValue;
                    it2 = it4;
                    tolVar = value;
                    double pow = Math.pow(0.800000011920929d, Math.abs(eaowVar.g() % tol.a.g()));
                    Double.isNaN(d5);
                    d = d5 * pow;
                    d4 += d;
                    value = tolVar;
                    it3 = it;
                    it4 = it2;
                }
                it = it3;
                tolVar = value;
                it2 = it4;
                d = dcyn.a;
                d4 += d;
                value = tolVar;
                it3 = it;
                it4 = it2;
            }
            Iterator<Map.Entry<dqvj, tol>> it5 = it3;
            d3 += d4;
            if (d4 > d2) {
                dbsgVar = dbsg.i(next.getKey());
                d2 = d4;
            }
            it3 = it5;
        }
        if (d2 / d3 < 0.6000000238418579d || d3 < 3.0d) {
            return dbpy.a;
        }
        return dbsgVar;
    }
}
