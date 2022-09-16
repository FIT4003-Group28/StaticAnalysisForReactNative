package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budy  reason: default package */
/* loaded from: classes.dex */
public final class budy extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("diea".equals(cls.getName())) {
            dyib<diea, dier> dyibVar = dhcb.a;
            if (dyibVar == null) {
                synchronized (dhcb.class) {
                    dyibVar = dhcb.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.posttrip.v1.MobileMapsPostTripService", "GetQuestions");
                        c.e = true;
                        c.a = dyyq.b(diea.c);
                        c.b = dyyq.b(dier.d);
                        dyibVar = c.a();
                        dhcb.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dkfh".equals(cls.getName())) {
            dyib<dkfh, dkfj> dyibVar2 = dhcb.b;
            if (dyibVar2 == null) {
                synchronized (dhcb.class) {
                    dyibVar2 = dhcb.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.posttrip.v1.MobileMapsPostTripService", "WriteAnswer");
                        c2.e = true;
                        c2.a = dyyq.b(dkfh.k);
                        c2.b = dyyq.b(dkfj.b);
                        dyibVar2 = c2.a();
                        dhcb.b = dyibVar2;
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
        hashSet.add(diea.class);
        hashSet.add(dkfh.class);
        return hashSet;
    }
}
