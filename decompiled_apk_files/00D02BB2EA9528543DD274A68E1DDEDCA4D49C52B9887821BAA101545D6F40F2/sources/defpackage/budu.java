package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budu  reason: default package */
/* loaded from: classes.dex */
public final class budu extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("didc".equals(cls.getName())) {
            dyib<didc, dide> dyibVar = dhbx.a;
            if (dyibVar == null) {
                synchronized (dhbx.class) {
                    dyibVar = dhbx.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.placeinsights.v1.MobileMapsPlaceInsightsService", "GetPlaceInsights");
                        c.e = true;
                        c.a = dyyq.b(didc.c);
                        c.b = dyyq.b(dide.b);
                        dyibVar = c.a();
                        dhbx.a = dyibVar;
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
        hashSet.add(didc.class);
        return hashSet;
    }
}
