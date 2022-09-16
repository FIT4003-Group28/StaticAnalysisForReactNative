package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budn  reason: default package */
/* loaded from: classes.dex */
public final class budn extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dvgc".equals(cls.getName())) {
            dyib<dvgc, dvgg> dyibVar = dhbq.b;
            if (dyibVar == null) {
                synchronized (dhbq.class) {
                    dyibVar = dhbq.b;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.offlinemap.v1.MobileMapsOfflineMapService", "GetOfflineMapSize");
                        c.e = true;
                        c.a = dyyq.b(dvgc.e);
                        c.b = dyyq.b(dvgg.c);
                        dyibVar = c.a();
                        dhbq.b = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dvfk".equals(cls.getName())) {
            dyib<dvfk, dvfo> dyibVar2 = dhbq.a;
            if (dyibVar2 == null) {
                synchronized (dhbq.class) {
                    dyibVar2 = dhbq.a;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.offlinemap.v1.MobileMapsOfflineMapService", "UpdateOfflineMaps");
                        c2.e = true;
                        c2.a = dyyq.b(dvfk.a);
                        c2.b = dyyq.b(dvfo.c);
                        dyibVar2 = c2.a();
                        dhbq.a = dyibVar2;
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
        hashSet.add(dvgc.class);
        hashSet.add(dvfk.class);
        return hashSet;
    }
}
