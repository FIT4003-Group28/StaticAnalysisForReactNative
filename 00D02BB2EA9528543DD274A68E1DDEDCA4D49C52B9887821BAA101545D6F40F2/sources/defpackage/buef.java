package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buef  reason: default package */
/* loaded from: classes.dex */
public final class buef extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dwir".equals(cls.getName())) {
            dyib<dwir, dwiv> dyibVar = dhci.a;
            if (dyibVar == null) {
                synchronized (dhci.class) {
                    dyibVar = dhci.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.search.v1.MobileMapsSearchService", "Search");
                        c.e = true;
                        c.a = dyyq.b(dwir.R);
                        c.b = dyyq.b(dwiv.M);
                        dyibVar = c.a();
                        dhci.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dwir.class);
        return hashSet;
    }
}
