package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budr  reason: default package */
/* loaded from: classes.dex */
public final class budr extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dvoj".equals(cls.getName())) {
            dyib<dvoj, dvon> dyibVar = dhbu.b;
            if (dyibVar == null) {
                synchronized (dhbu.class) {
                    dyibVar = dhbu.b;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.personalsuggestactivity.v1.MobileMapsPersonalSuggestActivityService", "DeleteActivity");
                        c.e = true;
                        c.a = dyyq.b(dvoj.d);
                        c.b = dyyq.b(dvon.d);
                        dyibVar = c.a();
                        dhbu.b = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dvor".equals(cls.getName())) {
            dyib<dvor, dvov> dyibVar2 = dhbu.a;
            if (dyibVar2 == null) {
                synchronized (dhbu.class) {
                    dyibVar2 = dhbu.a;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.personalsuggestactivity.v1.MobileMapsPersonalSuggestActivityService", "GetActivitySource");
                        c2.e = true;
                        c2.a = dyyq.b(dvor.e);
                        c2.b = dyyq.b(dvov.e);
                        dyibVar2 = c2.a();
                        dhbu.a = dyibVar2;
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
        hashSet.add(dvoj.class);
        hashSet.add(dvor.class);
        return hashSet;
    }
}
