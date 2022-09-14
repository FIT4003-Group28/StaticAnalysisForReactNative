package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buem  reason: default package */
/* loaded from: classes.dex */
public final class buem extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dkfn".equals(cls.getName())) {
            dyib<dkfn, dkfp> dyibVar = dhcp.d;
            if (dyibVar == null) {
                synchronized (dhcp.class) {
                    dyibVar = dhcp.d;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.traffic.v1.MobileMapsTrafficService", "CreateAreaTrafficNotification");
                        c.e = true;
                        c.a = dyyq.b(dkfn.d);
                        c.b = dyyq.b(dkfp.a);
                        dyibVar = c.a();
                        dhcp.d = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dhlj".equals(cls.getName())) {
            dyib<dhlj, dhll> dyibVar2 = dhcp.c;
            if (dyibVar2 == null) {
                synchronized (dhcp.class) {
                    dyibVar2 = dhcp.c;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.traffic.v1.MobileMapsTrafficService", "GetAreaTraffic");
                        c2.e = true;
                        c2.a = dyyq.b(dhlj.c);
                        c2.b = dyyq.b(dhll.g);
                        dyibVar2 = c2.a();
                        dhcp.c = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dwnn".equals(cls.getName())) {
            dyib<dwnn, dwnp> dyibVar3 = dhcp.b;
            if (dyibVar3 == null) {
                synchronized (dhcp.class) {
                    dyibVar3 = dhcp.b;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.traffic.v1.MobileMapsTrafficService", "GetTrafficIncident");
                        c3.e = true;
                        c3.a = dyyq.b(dwnn.b);
                        c3.b = dyyq.b(dwnp.b);
                        dyibVar3 = c3.a();
                        dhcp.b = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dkcw".equals(cls.getName())) {
            dyib<dkcw, dkcy> dyibVar4 = dhcp.a;
            if (dyibVar4 == null) {
                synchronized (dhcp.class) {
                    dyibVar4 = dhcp.a;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.traffic.v1.MobileMapsTrafficService", "WriteTrafficIncident");
                        c4.e = true;
                        c4.a = dyyq.b(dkcw.i);
                        c4.b = dyyq.b(dkcy.b);
                        dyibVar4 = c4.a();
                        dhcp.a = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dkfn.class);
        hashSet.add(dhlj.class);
        hashSet.add(dwnn.class);
        hashSet.add(dkcw.class);
        return hashSet;
    }
}
