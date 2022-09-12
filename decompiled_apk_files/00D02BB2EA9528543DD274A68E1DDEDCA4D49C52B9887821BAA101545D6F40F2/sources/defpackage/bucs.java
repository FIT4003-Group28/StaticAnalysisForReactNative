package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bucs  reason: default package */
/* loaded from: classes.dex */
public final class bucs extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dwaw".equals(cls.getName())) {
            dyib<dwaw, dwbc> dyibVar = dhav.a;
            if (dyibVar == null) {
                synchronized (dhav.class) {
                    dyibVar = dhav.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.directions.v1.MobileMapsDirectionsService", "GetDirections");
                        c.e = true;
                        c.a = dyyq.b(dwaw.j);
                        c.b = dyyq.b(dwbc.g);
                        dyibVar = c.a();
                        dhav.a = dyibVar;
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
        hashSet.add(dwaw.class);
        return hashSet;
    }
}
