package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budd  reason: default package */
/* loaded from: classes.dex */
public final class budd extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dija".equals(cls.getName())) {
            dyib<dija, dijg> dyibVar = dhbg.a;
            if (dyibVar == null) {
                synchronized (dhbg.class) {
                    dyibVar = dhbg.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.localproducts.v1.MobileMapsLocalProductsService", "InstoreSuggest");
                        c.e = true;
                        c.a = dyyq.b(dija.d);
                        c.b = dyyq.b(dijg.b);
                        dyibVar = c.a();
                        dhbg.a = dyibVar;
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
        hashSet.add(dija.class);
        return hashSet;
    }
}
