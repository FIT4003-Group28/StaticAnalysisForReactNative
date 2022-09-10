package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: sro  reason: default package */
/* loaded from: classes7.dex */
public final class sro {
    public static Set<String> a(amte amteVar, List<amub> list) {
        HashSet hashSet = new HashSet();
        for (dvxl dvxlVar : amteVar.k()) {
            hashSet.add(dvxlVar.d);
        }
        for (int i = 0; i < amteVar.a.A(); i++) {
            dovh z = amteVar.a.z(i);
            if ((z.a & 8) != 0) {
                douj doujVar = z.f;
                if (doujVar == null) {
                    doujVar = douj.h;
                }
                albv.d(hashSet, doujVar);
            }
        }
        for (amub amubVar : list) {
            dpfh dpfhVar = amubVar.z;
            if (dpfhVar != null && (dpfhVar.a & 32) != 0) {
                dozz dozzVar = dpfhVar.h;
                if (dozzVar == null) {
                    dozzVar = dozz.y;
                }
                hashSet.addAll(alca.j(dozzVar));
            }
            amve amveVar = amubVar.d;
            hashSet.addAll(vyb.O(amveVar));
            hashSet.addAll(vyb.P(amveVar));
            for (amvh amvhVar : amubVar.o) {
                dpke b = amvhVar.b();
                if (b != null && (b.a & 2) != 0) {
                    hashSet.add(b.c);
                }
            }
        }
        return hashSet;
    }
}
