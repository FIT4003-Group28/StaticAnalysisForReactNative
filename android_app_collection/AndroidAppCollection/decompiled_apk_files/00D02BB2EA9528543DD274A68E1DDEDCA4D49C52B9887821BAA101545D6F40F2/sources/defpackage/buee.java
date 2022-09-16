package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buee  reason: default package */
/* loaded from: classes.dex */
public final class buee extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dlzm".equals(cls.getName())) {
            dyib<dlzm, dlzs> dyibVar = dhch.a;
            if (dyibVar == null) {
                synchronized (dhch.class) {
                    dyibVar = dhch.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.ridesharing.v1.MobileMapsRidesharingService", "GetTripEstimates");
                        c.e = true;
                        c.a = dyyq.b(dlzm.e);
                        c.b = dyyq.b(dlzs.c);
                        dyibVar = c.a();
                        dhch.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dlzu".equals(cls.getName())) {
            dyib<dlzu, dlzy> dyibVar2 = dhch.b;
            if (dyibVar2 == null) {
                synchronized (dhch.class) {
                    dyibVar2 = dhch.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.ridesharing.v1.MobileMapsRidesharingService", "GetUserConsent");
                        c2.e = true;
                        c2.a = dyyq.b(dlzu.a);
                        c2.b = dyyq.b(dlzy.b);
                        dyibVar2 = c2.a();
                        dhch.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dmao".equals(cls.getName())) {
            dyib<dmao, dmaq> dyibVar3 = dhch.c;
            if (dyibVar3 == null) {
                synchronized (dhch.class) {
                    dyibVar3 = dhch.c;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.ridesharing.v1.MobileMapsRidesharingService", "UpdateUserConsent");
                        c3.e = true;
                        c3.a = dyyq.b(dmao.b);
                        c3.b = dyyq.b(dmaq.a);
                        dyibVar3 = c3.a();
                        dhch.c = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dlzm.class);
        hashSet.add(dlzu.class);
        hashSet.add(dmao.class);
        return hashSet;
    }
}
