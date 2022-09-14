package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bues  reason: default package */
/* loaded from: classes.dex */
public final class bues extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhru".equals(cls.getName())) {
            dyib<dhru, dhry> dyibVar = dhcv.a;
            if (dyibVar == null) {
                synchronized (dhcv.class) {
                    dyibVar = dhcv.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.url.v1.MobileMapsUrlService", "CreateShareableUrl");
                        c.e = true;
                        c.a = dyyq.b(dhru.g);
                        c.b = dyyq.b(dhry.c);
                        dyibVar = c.a();
                        dhcv.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dvta".equals(cls.getName())) {
            dyib<dvta, dvte> dyibVar2 = dhcv.b;
            if (dyibVar2 == null) {
                synchronized (dhcv.class) {
                    dyibVar2 = dhcv.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.url.v1.MobileMapsUrlService", "CreateShortUrl");
                        c2.e = true;
                        c2.a = dyyq.b(dvta.c);
                        c2.b = dyyq.b(dvte.c);
                        dyibVar2 = c2.a();
                        dhcv.b = dyibVar2;
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
        hashSet.add(dhru.class);
        hashSet.add(dvta.class);
        return hashSet;
    }
}
