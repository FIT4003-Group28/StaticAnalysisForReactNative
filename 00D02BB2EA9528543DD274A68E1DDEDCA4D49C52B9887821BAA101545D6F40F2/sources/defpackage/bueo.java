package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bueo  reason: default package */
/* loaded from: classes.dex */
public final class bueo extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("djti".equals(cls.getName())) {
            dyib<djti, djtk> dyibVar = dhcr.a;
            if (dyibVar == null) {
                synchronized (dhcr.class) {
                    dyibVar = dhcr.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugccontentfeedback.v1.MobileMapsUgcContentFeedbackService", "SubmitUgcContentFeedback");
                        c.e = true;
                        c.a = dyyq.b(djti.f);
                        c.b = dyyq.b(djtk.a);
                        dyibVar = c.a();
                        dhcr.a = dyibVar;
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
        hashSet.add(djti.class);
        return hashSet;
    }
}
