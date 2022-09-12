package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budk  reason: default package */
/* loaded from: classes.dex */
public final class budk extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dick".equals(cls.getName())) {
            dyib<dick, dicm> dyibVar = dhbn.a;
            if (dyibVar == null) {
                synchronized (dhbn.class) {
                    dyibVar = dhbn.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.navigationsatelliteephemeris.v1.MobileMapsNavigationSatelliteEphemerisService", "GetNavigationSatelliteEphemeris");
                        c.e = true;
                        c.a = dyyq.b(dick.a);
                        c.b = dyyq.b(dicm.a);
                        dyibVar = c.a();
                        dhbn.a = dyibVar;
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
        hashSet.add(dick.class);
        return hashSet;
    }
}
