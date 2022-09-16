package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bued  reason: default package */
/* loaded from: classes.dex */
public final class bued extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dvrc".equals(cls.getName())) {
            dyib<dvrc, dvre> dyibVar = dhcg.a;
            if (dyibVar == null) {
                synchronized (dhcg.class) {
                    dyibVar = dhcg.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.riddler.v1.MobileMapsRiddlerService", "ListFollowOnQuestions");
                        c.e = true;
                        c.a = dyyq.b(dvrc.d);
                        c.b = dyyq.b(dvre.g);
                        dyibVar = c.a();
                        dhcg.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dwcs".equals(cls.getName())) {
            dyib<dwcs, dwcu> dyibVar2 = dhcg.b;
            if (dyibVar2 == null) {
                synchronized (dhcg.class) {
                    dyibVar2 = dhcg.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.riddler.v1.MobileMapsRiddlerService", "WriteAnswer");
                        c2.e = true;
                        c2.a = dyyq.b(dwcs.e);
                        c2.b = dyyq.b(dwcu.a);
                        dyibVar2 = c2.a();
                        dhcg.b = dyibVar2;
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
        hashSet.add(dvrc.class);
        hashSet.add(dwcs.class);
        return hashSet;
    }
}
