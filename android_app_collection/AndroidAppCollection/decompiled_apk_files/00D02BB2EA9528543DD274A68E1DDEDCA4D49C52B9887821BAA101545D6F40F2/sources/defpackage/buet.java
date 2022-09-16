package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buet  reason: default package */
/* loaded from: classes.dex */
public final class buet extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("djhq".equals(cls.getName())) {
            dyib<djhq, djhs> dyibVar = dhcw.a;
            if (dyibVar == null) {
                synchronized (dhcw.class) {
                    dyibVar = dhcw.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.usercontributions.v1.MobileMapsUserContributionsService", "GetPostContributionThanksPage");
                        c.e = true;
                        c.a = dyyq.b(djhq.j);
                        c.b = dyyq.b(djhs.d);
                        dyibVar = c.a();
                        dhcw.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dwtm".equals(cls.getName())) {
            dyib<dwtm, dwul> dyibVar2 = dhcw.b;
            if (dyibVar2 == null) {
                synchronized (dhcw.class) {
                    dyibVar2 = dhcw.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.usercontributions.v1.MobileMapsUserContributionsService", "ListUserContributions");
                        c2.e = true;
                        c2.a = dyyq.b(dwtm.l);
                        c2.b = dyyq.b(dwul.t);
                        dyibVar2 = c2.a();
                        dhcw.b = dyibVar2;
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
        hashSet.add(djhq.class);
        hashSet.add(dwtm.class);
        return hashSet;
    }
}
