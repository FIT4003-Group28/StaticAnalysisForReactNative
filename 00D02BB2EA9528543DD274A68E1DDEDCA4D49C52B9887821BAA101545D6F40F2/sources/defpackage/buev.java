package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buev  reason: default package */
/* loaded from: classes.dex */
public final class buev extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dwjr".equals(cls.getName())) {
            dyib<dwjr, dwjt> dyibVar = dhcz.a;
            if (dyibVar == null) {
                synchronized (dhcz.class) {
                    dyibVar = dhcz.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.viewport.v1.MobileMapsViewportService", "GetViewportMetadata");
                        c.e = true;
                        c.a = dyyq.b(dwjr.c);
                        c.b = dyyq.b(dwjt.b);
                        dyibVar = c.a();
                        dhcz.a = dyibVar;
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
        hashSet.add(dwjr.class);
        return hashSet;
    }
}
