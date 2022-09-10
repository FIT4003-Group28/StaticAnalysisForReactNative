package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bucx  reason: default package */
/* loaded from: classes.dex */
public final class bucx extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhyh".equals(cls.getName())) {
            dyib<dhyh, dhym> dyibVar = dhba.a;
            if (dyibVar == null) {
                synchronized (dhba.class) {
                    dyibVar = dhba.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.explore.v1.MobileMapsExploreService", "GetExploreContent");
                        c.e = true;
                        c.a = dyyq.b(dhyh.k);
                        c.b = dyyq.b(dhym.c);
                        dyibVar = c.a();
                        dhba.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dkem".equals(cls.getName())) {
            dyib<dkem, dkeo> dyibVar2 = dhba.b;
            if (dyibVar2 == null) {
                synchronized (dhba.class) {
                    dyibVar2 = dhba.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.explore.v1.MobileMapsExploreService", "GetVisualExplorePhotos");
                        c2.e = true;
                        c2.a = dyyq.b(dkem.i);
                        c2.b = dyyq.b(dkeo.b);
                        dyibVar2 = c2.a();
                        dhba.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dhyh.class);
        hashSet.add(dkem.class);
        return hashSet;
    }
}
