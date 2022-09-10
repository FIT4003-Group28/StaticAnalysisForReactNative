package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buco  reason: default package */
/* loaded from: classes4.dex */
public final class buco extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhwa".equals(cls.getName())) {
            dyib<dhwa, dhwc> dyibVar = dhat.a;
            if (dyibVar == null) {
                synchronized (dhat.class) {
                    dyibVar = dhat.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.contributorzone.v1.MobileMapsContributorZoneService", "DismissUgcInfoCard");
                        c.e = true;
                        c.a = dyyq.b(dhwa.d);
                        c.b = dyyq.b(dhwc.a);
                        dyibVar = c.a();
                        dhat.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("diae".equals(cls.getName())) {
            dyib<diae, diag> dyibVar2 = dhat.b;
            if (dyibVar2 == null) {
                synchronized (dhat.class) {
                    dyibVar2 = dhat.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.contributorzone.v1.MobileMapsContributorZoneService", "GetContributorZoneContent");
                        c2.e = true;
                        c2.a = dyyq.b(diae.d);
                        c2.b = dyyq.b(diag.b);
                        dyibVar2 = c2.a();
                        dhat.b = dyibVar2;
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
        hashSet.add(dhwa.class);
        hashSet.add(diae.class);
        return hashSet;
    }
}
