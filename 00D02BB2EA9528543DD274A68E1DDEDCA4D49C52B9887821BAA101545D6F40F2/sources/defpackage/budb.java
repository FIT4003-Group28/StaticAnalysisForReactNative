package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budb  reason: default package */
/* loaded from: classes.dex */
public final class budb extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("duvz".equals(cls.getName())) {
            dyib<duvz, duwb> dyibVar = dhbe.b;
            if (dyibVar == null) {
                synchronized (dhbe.class) {
                    dyibVar = dhbe.b;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.localguide.v1.MobileMapsLocalGuideService", "GetLocalGuideSignUpPage");
                        c.e = true;
                        c.a = dyyq.b(duvz.c);
                        c.b = dyyq.b(duwb.f);
                        dyibVar = c.a();
                        dhbe.b = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("duvu".equals(cls.getName())) {
            dyib<duvu, duvx> dyibVar2 = dhbe.a;
            if (dyibVar2 == null) {
                synchronized (dhbe.class) {
                    dyibVar2 = dhbe.a;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.localguide.v1.MobileMapsLocalGuideService", "UpdateLocalGuidePrefs");
                        c2.e = true;
                        c2.a = dyyq.b(duvu.h);
                        c2.b = dyyq.b(duvx.h);
                        dyibVar2 = c2.a();
                        dhbe.a = dyibVar2;
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
        hashSet.add(duvz.class);
        hashSet.add(duvu.class);
        return hashSet;
    }
}
