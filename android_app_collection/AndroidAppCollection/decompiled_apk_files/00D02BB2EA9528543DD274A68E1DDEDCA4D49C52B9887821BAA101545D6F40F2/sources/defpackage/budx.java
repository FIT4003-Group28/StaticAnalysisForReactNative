package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budx  reason: default package */
/* loaded from: classes.dex */
public final class budx extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("djcq".equals(cls.getName())) {
            dyib<djcq, djcu> dyibVar = dhca.a;
            if (dyibVar == null) {
                synchronized (dhca.class) {
                    dyibVar = dhca.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.placevisit.v1.MobileMapsPlaceVisitService", "GetPlaceVisitStats");
                        c.e = true;
                        c.a = dyyq.b(djcq.h);
                        c.b = dyyq.b(djcu.f);
                        dyibVar = c.a();
                        dhca.a = dyibVar;
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
        hashSet.add(djcq.class);
        return hashSet;
    }
}
