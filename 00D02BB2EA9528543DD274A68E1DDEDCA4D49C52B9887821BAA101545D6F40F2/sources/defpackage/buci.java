package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buci  reason: default package */
/* loaded from: classes.dex */
public final class buci extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhnf".equals(cls.getName())) {
            dyib<dhnf, dhnl> dyibVar = dhao.a;
            if (dyibVar == null) {
                synchronized (dhao.class) {
                    dyibVar = dhao.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.businesscategories.v1.MobileMapsBusinessCategoriesService", "GetBusinessCategories");
                        c.e = true;
                        c.a = dyyq.b(dhnf.c);
                        c.b = dyyq.b(dhnl.b);
                        dyibVar = c.a();
                        dhao.a = dyibVar;
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
        hashSet.add(dhnf.class);
        return hashSet;
    }
}
