package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buce  reason: default package */
/* loaded from: classes.dex */
public final class buce extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhkf".equals(cls.getName())) {
            dyib<dhkf, dhkh> dyibVar = dhak.a;
            if (dyibVar == null) {
                synchronized (dhak.class) {
                    dyibVar = dhak.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.ads.v1.MobileMapsAdsService", "BlockAdDomain");
                        c.e = true;
                        c.a = dyyq.b(dhkf.d);
                        c.b = dyyq.b(dhkh.a);
                        dyibVar = c.a();
                        dhak.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("djio".equals(cls.getName())) {
            dyib<djio, djiq> dyibVar2 = dhak.b;
            if (dyibVar2 == null) {
                synchronized (dhak.class) {
                    dyibVar2 = dhak.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.ads.v1.MobileMapsAdsService", "ListPromotedPinAds");
                        c2.e = true;
                        c2.a = dyyq.b(djio.e);
                        c2.b = dyyq.b(djiq.d);
                        dyibVar2 = c2.a();
                        dhak.b = dyibVar2;
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
        hashSet.add(dhkf.class);
        hashSet.add(djio.class);
        return hashSet;
    }
}
