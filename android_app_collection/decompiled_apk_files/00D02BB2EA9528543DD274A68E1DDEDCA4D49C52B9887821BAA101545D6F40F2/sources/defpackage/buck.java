package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buck  reason: default package */
/* loaded from: classes.dex */
public final class buck extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dvvu".equals(cls.getName())) {
            dyib<dvvu, dvvw> dyibVar = dhaq.a;
            if (dyibVar == null) {
                synchronized (dhaq.class) {
                    dyibVar = dhaq.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.categories.v1.MobileMapsCategoriesService", "ListCategories");
                        c.e = true;
                        c.a = dyyq.b(dvvu.f);
                        c.b = dyyq.b(dvvw.b);
                        dyibVar = c.a();
                        dhaq.a = dyibVar;
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
        hashSet.add(dvvu.class);
        return hashSet;
    }
}
