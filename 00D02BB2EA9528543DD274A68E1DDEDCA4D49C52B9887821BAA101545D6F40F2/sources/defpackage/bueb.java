package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bueb  reason: default package */
/* loaded from: classes.dex */
public final class bueb extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dvpl".equals(cls.getName())) {
            dyib<dvpl, dvpn> dyibVar = dhce.a;
            if (dyibVar == null) {
                synchronized (dhce.class) {
                    dyibVar = dhce.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.restaurant.v1.MobileMapsRestaurantService", "CreateReservation");
                        c.e = true;
                        c.a = dyyq.b(dvpl.a);
                        c.b = dyyq.b(dvpn.a);
                        dyibVar = c.a();
                        dhce.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dvpp".equals(cls.getName())) {
            dyib<dvpp, dvpr> dyibVar2 = dhce.b;
            if (dyibVar2 == null) {
                synchronized (dhce.class) {
                    dyibVar2 = dhce.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.restaurant.v1.MobileMapsRestaurantService", "SearchAvailability");
                        c2.e = true;
                        c2.a = dyyq.b(dvpp.a);
                        c2.b = dyyq.b(dvpr.a);
                        dyibVar2 = c2.a();
                        dhce.b = dyibVar2;
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
        hashSet.add(dvpl.class);
        hashSet.add(dvpp.class);
        return hashSet;
    }
}
