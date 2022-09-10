package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bueh  reason: default package */
/* loaded from: classes.dex */
public final class bueh extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhzg".equals(cls.getName())) {
            dyib<dhzg, dhzi> dyibVar = dhck.a;
            if (dyibVar == null) {
                synchronized (dhck.class) {
                    dyibVar = dhck.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.shopping.v1.MobileMapsShoppingService", "GetAreaShoppingData");
                        c.e = true;
                        c.a = dyyq.b(dhzg.a);
                        c.b = dyyq.b(dhzi.a);
                        dyibVar = c.a();
                        dhck.a = dyibVar;
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
        hashSet.add(dhzg.class);
        return hashSet;
    }
}
