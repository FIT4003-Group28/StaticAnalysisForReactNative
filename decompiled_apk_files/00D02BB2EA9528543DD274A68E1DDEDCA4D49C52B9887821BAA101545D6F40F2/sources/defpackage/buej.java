package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buej  reason: default package */
/* loaded from: classes.dex */
public final class buej extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dwjn".equals(cls.getName())) {
            dyib<dwjn, dwjp> dyibVar = dhcm.a;
            if (dyibVar == null) {
                synchronized (dhcm.class) {
                    dyibVar = dhcm.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.suggest.v1.MobileMapsSuggestService", "Suggest");
                        c.e = true;
                        c.a = dyyq.b(dwjn.p);
                        c.b = dyyq.b(dwjp.h);
                        dyibVar = c.a();
                        dhcm.a = dyibVar;
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
        hashSet.add(dwjn.class);
        return hashSet;
    }
}
