package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buea  reason: default package */
/* loaded from: classes.dex */
public final class buea extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dkzf".equals(cls.getName())) {
            dyib<dkzf, dkzh> dyibVar = dhcd.a;
            if (dyibVar == null) {
                synchronized (dhcd.class) {
                    dyibVar = dhcd.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.recommendedplace.v1.MobileMapsRecommendedPlaceService", "ListRecommendedPlaces");
                        c.e = true;
                        c.a = dyyq.b(dkzf.e);
                        c.b = dyyq.b(dkzh.c);
                        dyibVar = c.a();
                        dhcd.a = dyibVar;
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
        hashSet.add(dkzf.class);
        return hashSet;
    }
}
