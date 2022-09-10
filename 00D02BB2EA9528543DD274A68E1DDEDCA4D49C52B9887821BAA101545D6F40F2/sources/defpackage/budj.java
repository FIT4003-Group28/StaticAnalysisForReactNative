package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budj  reason: default package */
/* loaded from: classes4.dex */
public final class budj extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhmv".equals(cls.getName())) {
            dyib<dhmv, dhmx> dyibVar = dhbm.c;
            if (dyibVar == null) {
                synchronized (dhbm.class) {
                    dyibVar = dhbm.c;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.merchant.v1.MobileMapsMerchantService", "BatchGetListingMetadata");
                        c.e = true;
                        c.a = dyyq.b(dhmv.e);
                        c.b = dyyq.b(dhmx.b);
                        dyibVar = c.a();
                        dhbm.c = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dhvw".equals(cls.getName())) {
            dyib<dhvw, dhvy> dyibVar2 = dhbm.b;
            if (dyibVar2 == null) {
                synchronized (dhbm.class) {
                    dyibVar2 = dhbm.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.merchant.v1.MobileMapsMerchantService", "DismissRecommendation");
                        c2.e = true;
                        c2.a = dyyq.b(dhvw.e);
                        c2.b = dyyq.b(dhvy.a);
                        dyibVar2 = c2.a();
                        dhbm.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dilw".equals(cls.getName())) {
            dyib<dilw, dily> dyibVar3 = dhbm.d;
            if (dyibVar3 == null) {
                synchronized (dhbm.class) {
                    dyibVar3 = dhbm.d;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.merchant.v1.MobileMapsMerchantService", "ListBusinessSummaries");
                        c3.e = true;
                        c3.a = dyyq.b(dilw.a);
                        c3.b = dyyq.b(dily.a);
                        dyibVar3 = c3.a();
                        dhbm.d = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dimc".equals(cls.getName())) {
            dyib<dimc, dime> dyibVar4 = dhbm.a;
            if (dyibVar4 == null) {
                synchronized (dhbm.class) {
                    dyibVar4 = dhbm.a;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.merchant.v1.MobileMapsMerchantService", "ListRecommendations");
                        c4.e = true;
                        c4.a = dyyq.b(dimc.e);
                        c4.b = dyyq.b(dime.b);
                        dyibVar4 = c4.a();
                        dhbm.a = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dhmv.class);
        hashSet.add(dhvw.class);
        hashSet.add(dilw.class);
        hashSet.add(dimc.class);
        return hashSet;
    }
}
