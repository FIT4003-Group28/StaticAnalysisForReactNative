package defpackage;

import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import java.util.HashMap;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cyvw  reason: default package */
/* loaded from: classes5.dex */
public final class cyvw {
    public static final void a(Iterable<cyvs> iterable, dcna dcnaVar) {
        for (cyvs cyvsVar : iterable) {
            synchronized (cyvsVar.e) {
                HashMap hashMap = new HashMap();
                dcpe<cyvi> listIterator = cyvsVar.o.listIterator();
                while (listIterator.hasNext()) {
                    cyvi next = listIterator.next();
                    String k = next.k();
                    cyvi cyviVar = (cyvi) hashMap.get(k);
                    if (cyviVar == null) {
                        hashMap.put(k, next);
                    } else if (next.b().i > cyviVar.b().i) {
                        next.b().k(cyviVar.b());
                        hashMap.put(k, next);
                    } else {
                        cyviVar.b().k(next.b());
                    }
                }
                dccx dccxVar = new dccx();
                dcpe<cyvi> listIterator2 = cyvsVar.o.listIterator();
                while (listIterator2.hasNext()) {
                    cyvi next2 = listIterator2.next();
                    if (hashMap.get(next2.k()) == next2) {
                        dccxVar.g(next2);
                    }
                }
                cyvsVar.o = dccxVar.f();
            }
            dcdc<cyvi> a = cyvsVar.a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                dcnaVar.n(a.get(i).k(), cyvsVar);
            }
            dcdc<InAppNotificationTarget> g = cyvsVar.g();
            int size2 = g.size();
            for (int i2 = 0; i2 < size2; i2++) {
                dcnaVar.n(g.get(i2).k(), cyvsVar);
            }
        }
    }

    public static final Set<cyvs> b(cyvs cyvsVar, dcna dcnaVar) {
        if (dcnaVar.D()) {
            return dcmr.a;
        }
        dcen N = dcep.N();
        dcdc<cyvi> a = cyvsVar.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            N.i(dcnaVar.c(a.get(i).k()));
        }
        dcdc<InAppNotificationTarget> g = cyvsVar.g();
        int size2 = g.size();
        for (int i2 = 0; i2 < size2; i2++) {
            N.i(dcnaVar.c(g.get(i2).k()));
        }
        return N.f();
    }
}
