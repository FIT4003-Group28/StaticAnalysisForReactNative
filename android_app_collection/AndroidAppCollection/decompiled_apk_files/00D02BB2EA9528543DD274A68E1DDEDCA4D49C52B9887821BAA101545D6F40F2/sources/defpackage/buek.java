package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buek  reason: default package */
/* loaded from: classes.dex */
public final class buek extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("duyc".equals(cls.getName())) {
            dyib<duyc, duye> dyibVar = dhcn.a;
            if (dyibVar == null) {
                synchronized (dhcn.class) {
                    dyibVar = dhcn.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.timeline.v1.MobileMapsTimelineService", "CreateTimelineEdit");
                        c.e = true;
                        c.a = dyyq.b(duyc.h);
                        c.b = dyyq.b(duye.d);
                        dyibVar = c.a();
                        dhcn.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("duxy".equals(cls.getName())) {
            dyib<duxy, duya> dyibVar2 = dhcn.b;
            if (dyibVar2 == null) {
                synchronized (dhcn.class) {
                    dyibVar2 = dhcn.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.timeline.v1.MobileMapsTimelineService", "DeleteLocationHistory");
                        c2.e = true;
                        c2.a = dyyq.b(duxy.f);
                        c2.b = dyyq.b(duya.d);
                        dyibVar2 = c2.a();
                        dhcn.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dign".equals(cls.getName())) {
            dyib<dign, digr> dyibVar3 = dhcn.e;
            if (dyibVar3 == null) {
                synchronized (dhcn.class) {
                    dyibVar3 = dhcn.e;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.timeline.v1.MobileMapsTimelineService", "GetTimelineEntryPoints");
                        c3.e = true;
                        c3.a = dyyq.b(dign.g);
                        c3.b = dyyq.b(digr.d);
                        dyibVar3 = c3.a();
                        dhcn.e = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("duzc".equals(cls.getName())) {
            dyib<duzc, duzk> dyibVar4 = dhcn.d;
            if (dyibVar4 == null) {
                synchronized (dhcn.class) {
                    dyibVar4 = dhcn.d;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.timeline.v1.MobileMapsTimelineService", "GetTimeline");
                        c4.e = true;
                        c4.a = dyyq.b(duzc.h);
                        c4.b = dyyq.b(duzk.h);
                        dyibVar4 = c4.a();
                        dhcn.d = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("dvbj".equals(cls.getName())) {
            dyib<dvbj, dvbp> dyibVar5 = dhcn.c;
            if (dyibVar5 == null) {
                synchronized (dhcn.class) {
                    dyibVar5 = dhcn.c;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.timeline.v1.MobileMapsTimelineService", "GetTimelineSegment");
                        c5.e = true;
                        c5.a = dyyq.b(dvbj.c);
                        c5.b = dyyq.b(dvbp.c);
                        dyibVar5 = c5.a();
                        dhcn.c = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(duyc.class);
        hashSet.add(duxy.class);
        hashSet.add(dign.class);
        hashSet.add(duzc.class);
        hashSet.add(dvbj.class);
        return hashSet;
    }
}
