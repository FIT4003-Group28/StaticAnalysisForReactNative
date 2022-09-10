package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bucp  reason: default package */
/* loaded from: classes.dex */
public final class bucp extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhwm".equals(cls.getName())) {
            dyib<dhwm, dhwq> dyibVar = dhau.a;
            if (dyibVar == null) {
                synchronized (dhau.class) {
                    dyibVar = dhau.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.creatorprofile.v1.MobileMapsCreatorProfileService", "EditCreatorProfile");
                        c.e = true;
                        c.a = dyyq.b(dhwm.d);
                        c.b = dyyq.b(dhwq.d);
                        dyibVar = c.a();
                        dhau.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("diai".equals(cls.getName())) {
            dyib<diai, diak> dyibVar2 = dhau.b;
            if (dyibVar2 == null) {
                synchronized (dhau.class) {
                    dyibVar2 = dhau.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.creatorprofile.v1.MobileMapsCreatorProfileService", "GetCreatorProfile");
                        c2.e = true;
                        c2.a = dyyq.b(diai.h);
                        c2.b = dyyq.b(diak.g);
                        dyibVar2 = c2.a();
                        dhau.b = dyibVar2;
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
        hashSet.add(dhwm.class);
        hashSet.add(diai.class);
        return hashSet;
    }
}
