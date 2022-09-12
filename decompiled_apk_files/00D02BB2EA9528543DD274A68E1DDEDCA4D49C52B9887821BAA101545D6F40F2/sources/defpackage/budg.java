package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budg  reason: default package */
/* loaded from: classes.dex */
public final class budg extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dvbj".equals(cls.getName())) {
            dyib<dvbj, dvbp> dyibVar = dhbj.a;
            if (dyibVar == null) {
                synchronized (dhbj.class) {
                    dyibVar = dhbj.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.locationhistory.v1.MobileMapsLocationHistoryService", "GetTimelineSegment");
                        c.e = true;
                        c.a = dyyq.b(dvbj.c);
                        c.b = dyyq.b(dvbp.c);
                        dyibVar = c.a();
                        dhbj.a = dyibVar;
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
        hashSet.add(dvbj.class);
        return hashSet;
    }
}
