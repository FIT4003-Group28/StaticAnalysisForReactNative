package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buer  reason: default package */
/* loaded from: classes.dex */
public final class buer extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("djzm".equals(cls.getName())) {
            dyib<djzm, djzq> dyibVar = dhcu.d;
            if (dyibVar == null) {
                synchronized (dhcu.class) {
                    dyibVar = dhcu.d;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugctask.v1.MobileMapsUgcTaskService", "CreateAnswer");
                        c.e = true;
                        c.a = dyyq.b(djzm.c);
                        c.b = dyyq.b(djzq.d);
                        dyibVar = c.a();
                        dhcu.d = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dhsk".equals(cls.getName())) {
            dyib<dhsk, dhsm> dyibVar2 = dhcu.a;
            if (dyibVar2 == null) {
                synchronized (dhcu.class) {
                    dyibVar2 = dhcu.a;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugctask.v1.MobileMapsUgcTaskService", "CreatePlaceReminder");
                        c2.e = true;
                        c2.a = dyyq.b(dhsk.d);
                        c2.b = dyyq.b(dhsm.c);
                        dyibVar2 = c2.a();
                        dhcu.a = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dhvk".equals(cls.getName())) {
            dyib<dhvk, dhvm> dyibVar3 = dhcu.b;
            if (dyibVar3 == null) {
                synchronized (dhcu.class) {
                    dyibVar3 = dhcu.b;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugctask.v1.MobileMapsUgcTaskService", "DeletePlaceReminder");
                        c3.e = true;
                        c3.a = dyyq.b(dhvk.d);
                        c3.b = dyyq.b(dhvm.c);
                        dyibVar3 = c3.a();
                        dhcu.b = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dupi".equals(cls.getName())) {
            dyib<dupi, dupk> dyibVar4 = dhcu.e;
            if (dyibVar4 == null) {
                synchronized (dhcu.class) {
                    dyibVar4 = dhcu.e;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugctask.v1.MobileMapsUgcTaskService", "DismissTask");
                        c4.e = true;
                        c4.a = dyyq.b(dupi.c);
                        c4.b = dyyq.b(dupk.c);
                        dyibVar4 = c4.a();
                        dhcu.e = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("dihr".equals(cls.getName())) {
            dyib<dihr, diht> dyibVar5 = dhcu.c;
            if (dyibVar5 == null) {
                synchronized (dhcu.class) {
                    dyibVar5 = dhcu.c;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugctask.v1.MobileMapsUgcTaskService", "GetPlaceReminders");
                        c5.e = true;
                        c5.a = dyyq.b(dihr.a);
                        c5.b = dyyq.b(diht.a);
                        dyibVar5 = c5.a();
                        dhcu.c = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        if ("dwsn".equals(cls.getName())) {
            dyib<dwsn, dwsr> dyibVar6 = dhcu.f;
            if (dyibVar6 == null) {
                synchronized (dhcu.class) {
                    dyibVar6 = dhcu.f;
                    if (dyibVar6 == null) {
                        dyhx c6 = dyib.c();
                        c6.c = dyhz.UNARY;
                        c6.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugctask.v1.MobileMapsUgcTaskService", "ListTasks");
                        c6.e = true;
                        c6.a = dyyq.b(dwsn.k);
                        c6.b = dyyq.b(dwsr.g);
                        dyibVar6 = c6.a();
                        dhcu.f = dyibVar6;
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
        hashSet.add(djzm.class);
        hashSet.add(dhsk.class);
        hashSet.add(dhvk.class);
        hashSet.add(dupi.class);
        hashSet.add(dihr.class);
        hashSet.add(dwsn.class);
        return hashSet;
    }
}
