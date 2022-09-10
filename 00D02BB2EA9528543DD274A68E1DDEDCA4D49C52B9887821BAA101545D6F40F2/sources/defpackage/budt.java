package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budt  reason: default package */
/* loaded from: classes.dex */
public final class budt extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dvzj".equals(cls.getName())) {
            dyib<dvzj, dvzl> dyibVar = dhbw.a;
            if (dyibVar == null) {
                synchronized (dhbw.class) {
                    dyibVar = dhbw.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.place.v1.MobileMapsPlaceService", "GetPlace");
                        c.e = true;
                        c.a = dyyq.b(dvzj.y);
                        c.b = dyyq.b(dvzl.g);
                        dyibVar = c.a();
                        dhbw.a = dyibVar;
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
        hashSet.add(dvzj.class);
        return hashSet;
    }
}
