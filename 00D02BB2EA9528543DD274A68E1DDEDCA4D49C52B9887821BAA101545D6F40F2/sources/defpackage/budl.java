package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budl  reason: default package */
/* loaded from: classes.dex */
public final class budl extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dimg".equals(cls.getName())) {
            dyib<dimg, dimi> dyibVar = dhbo.a;
            if (dyibVar == null) {
                synchronized (dhbo.class) {
                    dyibVar = dhbo.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.notification.v1.MobileMapsNotificationService", "ListNotifications");
                        c.e = true;
                        c.a = dyyq.b(dimg.a);
                        c.b = dyyq.b(dimi.a);
                        dyibVar = c.a();
                        dhbo.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dutm".equals(cls.getName())) {
            dyib<dutm, duto> dyibVar2 = dhbo.c;
            if (dyibVar2 == null) {
                synchronized (dhbo.class) {
                    dyibVar2 = dhbo.c;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.notification.v1.MobileMapsNotificationService", "RegisterDevice");
                        c2.e = true;
                        c2.a = dyyq.b(dutm.k);
                        c2.b = dyyq.b(duto.b);
                        dyibVar2 = c2.a();
                        dhbo.c = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dutu".equals(cls.getName())) {
            dyib<dutu, dutw> dyibVar3 = dhbo.d;
            if (dyibVar3 == null) {
                synchronized (dhbo.class) {
                    dyibVar3 = dhbo.d;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.notification.v1.MobileMapsNotificationService", "UnregisterDevice");
                        c3.e = true;
                        c3.a = dyyq.b(dutu.a);
                        c3.b = dyyq.b(dutw.a);
                        dyibVar3 = c3.a();
                        dhbo.d = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dkbk".equals(cls.getName())) {
            dyib<dkbk, dkbm> dyibVar4 = dhbo.b;
            if (dyibVar4 == null) {
                synchronized (dhbo.class) {
                    dyibVar4 = dhbo.b;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.notification.v1.MobileMapsNotificationService", "UpdateNotifications");
                        c4.e = true;
                        c4.a = dyyq.b(dkbk.a);
                        c4.b = dyyq.b(dkbm.a);
                        dyibVar4 = c4.a();
                        dhbo.b = dyibVar4;
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
        hashSet.add(dimg.class);
        hashSet.add(dutm.class);
        hashSet.add(dutu.class);
        hashSet.add(dkbk.class);
        return hashSet;
    }
}
