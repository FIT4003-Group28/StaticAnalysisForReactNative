package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budi  reason: default package */
/* loaded from: classes.dex */
public final class budi extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dvct".equals(cls.getName())) {
            dyib<dvct, dvcx> dyibVar = dhbl.a;
            if (dyibVar == null) {
                synchronized (dhbl.class) {
                    dyibVar = dhbl.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.mapsengine.v1.MobileMapsMapsEngineService", "GetMap");
                        c.e = true;
                        c.a = dyyq.b(dvct.f);
                        c.b = dyyq.b(dvcx.c);
                        dyibVar = c.a();
                        dhbl.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dvcd".equals(cls.getName())) {
            dyib<dvcd, dvch> dyibVar2 = dhbl.b;
            if (dyibVar2 == null) {
                synchronized (dhbl.class) {
                    dyibVar2 = dhbl.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.mapsengine.v1.MobileMapsMapsEngineService", "ListFeatures");
                        c2.e = true;
                        c2.a = dyyq.b(dvcd.e);
                        c2.b = dyyq.b(dvch.b);
                        dyibVar2 = c2.a();
                        dhbl.b = dyibVar2;
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
        hashSet.add(dvct.class);
        hashSet.add(dvcd.class);
        return hashSet;
    }
}
