package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bucw  reason: default package */
/* loaded from: classes.dex */
public final class bucw extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhoz".equals(cls.getName())) {
            dyib<dhoz, dhpd> dyibVar = dhaz.a;
            if (dyibVar == null) {
                synchronized (dhaz.class) {
                    dyibVar = dhaz.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.experience.v1.MobileMapsExperienceService", "GetCinemaData");
                        c.e = true;
                        c.a = dyyq.b(dhoz.c);
                        c.b = dyyq.b(dhpd.b);
                        dyibVar = c.a();
                        dhaz.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dils".equals(cls.getName())) {
            dyib<dils, dilu> dyibVar2 = dhaz.b;
            if (dyibVar2 == null) {
                synchronized (dhaz.class) {
                    dyibVar2 = dhaz.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.experience.v1.MobileMapsExperienceService", "ListExperiences");
                        c2.e = true;
                        c2.a = dyyq.b(dils.i);
                        c2.b = dyyq.b(dilu.f);
                        dyibVar2 = c2.a();
                        dhaz.b = dyibVar2;
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
        hashSet.add(dhoz.class);
        hashSet.add(dils.class);
        return hashSet;
    }
}
