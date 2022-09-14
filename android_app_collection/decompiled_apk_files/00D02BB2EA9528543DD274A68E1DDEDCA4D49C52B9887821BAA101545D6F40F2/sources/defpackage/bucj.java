package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bucj  reason: default package */
/* loaded from: classes.dex */
public final class bucj extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhvs".equals(cls.getName())) {
            dyib<dhvs, dhvu> dyibVar = dhap.c;
            if (dyibVar == null) {
                synchronized (dhap.class) {
                    dyibVar = dhap.c;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.businessmessaging.v1.MobileMapsBusinessMessagingService", "DisableBusinessMessaging");
                        c.e = true;
                        c.a = dyyq.b(dhvs.c);
                        c.b = dyyq.b(dhvu.a);
                        dyibVar = c.a();
                        dhap.c = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dhws".equals(cls.getName())) {
            dyib<dhws, dhwu> dyibVar2 = dhap.b;
            if (dyibVar2 == null) {
                synchronized (dhap.class) {
                    dyibVar2 = dhap.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.businessmessaging.v1.MobileMapsBusinessMessagingService", "EnableBusinessMessaging");
                        c2.e = true;
                        c2.a = dyyq.b(dhws.c);
                        c2.b = dyyq.b(dhwu.b);
                        dyibVar2 = c2.a();
                        dhap.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dhzk".equals(cls.getName())) {
            dyib<dhzk, dhzm> dyibVar3 = dhap.d;
            if (dyibVar3 == null) {
                synchronized (dhap.class) {
                    dyibVar3 = dhap.d;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.businessmessaging.v1.MobileMapsBusinessMessagingService", "GetBatchBusinessMessagingState");
                        c3.e = true;
                        c3.a = dyyq.b(dhzk.a);
                        c3.b = dyyq.b(dhzm.a);
                        dyibVar3 = c3.a();
                        dhap.d = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dhzo".equals(cls.getName())) {
            dyib<dhzo, dhzq> dyibVar4 = dhap.a;
            if (dyibVar4 == null) {
                synchronized (dhap.class) {
                    dyibVar4 = dhap.a;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.businessmessaging.v1.MobileMapsBusinessMessagingService", "GetBusinessMessagingState");
                        c4.e = true;
                        c4.a = dyyq.b(dhzo.c);
                        c4.b = dyyq.b(dhzq.b);
                        dyibVar4 = c4.a();
                        dhap.a = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("dicg".equals(cls.getName())) {
            dyib<dicg, dici> dyibVar5 = dhap.e;
            if (dyibVar5 == null) {
                synchronized (dhap.class) {
                    dyibVar5 = dhap.e;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.businessmessaging.v1.MobileMapsBusinessMessagingService", "GetMessagingAutoEnableState");
                        c5.e = true;
                        c5.a = dyyq.b(dicg.b);
                        c5.b = dyyq.b(dici.a);
                        dyibVar5 = c5.a();
                        dhap.e = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        if ("dkbg".equals(cls.getName())) {
            dyib<dkbg, dkbi> dyibVar6 = dhap.f;
            if (dyibVar6 == null) {
                synchronized (dhap.class) {
                    dyibVar6 = dhap.f;
                    if (dyibVar6 == null) {
                        dyhx c6 = dyib.c();
                        c6.c = dyhz.UNARY;
                        c6.d = dyib.b("google.internal.mothership.maps.mobilemaps.businessmessaging.v1.MobileMapsBusinessMessagingService", "UpdateMessagingPreference");
                        c6.e = true;
                        c6.a = dyyq.b(dkbg.b);
                        c6.b = dyyq.b(dkbi.a);
                        dyibVar6 = c6.a();
                        dhap.f = dyibVar6;
                    }
                }
            }
            hashSet.add(dyibVar6);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dhvs.class);
        hashSet.add(dhws.class);
        hashSet.add(dhzk.class);
        hashSet.add(dhzo.class);
        hashSet.add(dicg.class);
        hashSet.add(dkbg.class);
        return hashSet;
    }
}
