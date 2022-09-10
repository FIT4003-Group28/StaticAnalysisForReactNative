package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bucg  reason: default package */
/* loaded from: classes.dex */
public final class bucg extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("djwe".equals(cls.getName())) {
            dyib<djwe, djwg> dyibVar = dham.a;
            if (dyibVar == null) {
                synchronized (dham.class) {
                    dyibVar = dham.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.booking.v1.MobileMapsBookingService", "GetUserStream");
                        c.e = true;
                        c.a = dyyq.b(djwe.d);
                        c.b = dyyq.b(djwg.b);
                        dyibVar = c.a();
                        dham.a = dyibVar;
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
        hashSet.add(djwe.class);
        return hashSet;
    }
}
