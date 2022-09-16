package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buag  reason: default package */
/* loaded from: classes4.dex */
public final class buag extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dryj".equals(cls.getName())) {
            dyib<dryj, dryl> dyibVar = buam.k;
            if (dyibVar == null) {
                synchronized (buam.class) {
                    dyibVar = buam.k;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.notifications.v1.NotificationsApiService", "BatchUpdateThreadState");
                        c.e = true;
                        c.a = dyyq.b(dryj.d);
                        c.b = dyyq.b(dryl.a);
                        dyibVar = c.a();
                        buam.k = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dryn".equals(cls.getName())) {
            dyib<dryn, dryp> dyibVar2 = buam.f;
            if (dyibVar2 == null) {
                synchronized (buam.class) {
                    dyibVar2 = buam.f;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.notifications.v1.NotificationsApiService", "CreateUserSubscription");
                        c2.e = true;
                        c2.a = dyyq.b(dryn.e);
                        c2.b = dyyq.b(dryp.a);
                        dyibVar2 = c2.a();
                        buam.f = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dryr".equals(cls.getName())) {
            dyib<dryr, dryt> dyibVar3 = buam.g;
            if (dyibVar3 == null) {
                synchronized (buam.class) {
                    dyibVar3 = buam.g;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.notifications.v1.NotificationsApiService", "DeleteUserSubscription");
                        c3.e = true;
                        c3.a = dyyq.b(dryr.e);
                        c3.b = dyyq.b(dryt.a);
                        dyibVar3 = c3.a();
                        buam.g = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dryv".equals(cls.getName())) {
            dyib<dryv, dryx> dyibVar4 = buam.a;
            if (dyibVar4 == null) {
                synchronized (buam.class) {
                    dyibVar4 = buam.a;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.notifications.v1.NotificationsApiService", "FetchLatestThreads");
                        c4.e = true;
                        c4.a = dyyq.b(dryv.g);
                        c4.b = dyyq.b(dryx.d);
                        dyibVar4 = c4.a();
                        buam.a = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("dryz".equals(cls.getName())) {
            dyib<dryz, drzb> dyibVar5 = buam.b;
            if (dyibVar5 == null) {
                synchronized (buam.class) {
                    dyibVar5 = buam.b;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.notifications.v1.NotificationsApiService", "FetchThreadsById");
                        c5.e = true;
                        c5.a = dyyq.b(dryz.g);
                        c5.b = dyyq.b(drzb.b);
                        dyibVar5 = c5.a();
                        buam.b = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        if ("drze".equals(cls.getName())) {
            dyib<drze, drzg> dyibVar6 = buam.c;
            if (dyibVar6 == null) {
                synchronized (buam.class) {
                    dyibVar6 = buam.c;
                    if (dyibVar6 == null) {
                        dyhx c6 = dyib.c();
                        c6.c = dyhz.UNARY;
                        c6.d = dyib.b("google.internal.notifications.v1.NotificationsApiService", "FetchUpdatedThreads");
                        c6.e = true;
                        c6.a = dyyq.b(drze.i);
                        c6.b = dyyq.b(drzg.c);
                        dyibVar6 = c6.a();
                        buam.c = dyibVar6;
                    }
                }
            }
            hashSet.add(dyibVar6);
        }
        if ("drzi".equals(cls.getName())) {
            dyib<drzi, drzk> dyibVar7 = buam.h;
            if (dyibVar7 == null) {
                synchronized (buam.class) {
                    dyibVar7 = buam.h;
                    if (dyibVar7 == null) {
                        dyhx c7 = dyib.c();
                        c7.c = dyhz.UNARY;
                        c7.d = dyib.b("google.internal.notifications.v1.NotificationsApiService", "FetchUserPreferences");
                        c7.e = true;
                        c7.a = dyyq.b(drzi.a);
                        c7.b = dyyq.b(drzk.a);
                        dyibVar7 = c7.a();
                        buam.h = dyibVar7;
                    }
                }
            }
            hashSet.add(dyibVar7);
        }
        if ("drzm".equals(cls.getName())) {
            dyib<drzm, drzo> dyibVar8 = buam.e;
            if (dyibVar8 == null) {
                synchronized (buam.class) {
                    dyibVar8 = buam.e;
                    if (dyibVar8 == null) {
                        dyhx c8 = dyib.c();
                        c8.c = dyhz.UNARY;
                        c8.d = dyib.b("google.internal.notifications.v1.NotificationsApiService", "RemoveTarget");
                        c8.e = true;
                        c8.a = dyyq.b(drzm.e);
                        c8.b = dyyq.b(drzo.a);
                        dyibVar8 = c8.a();
                        buam.e = dyibVar8;
                    }
                }
            }
            hashSet.add(dyibVar8);
        }
        if ("drzq".equals(cls.getName())) {
            dyib<drzq, drzs> dyibVar9 = buam.i;
            if (dyibVar9 == null) {
                synchronized (buam.class) {
                    dyibVar9 = buam.i;
                    if (dyibVar9 == null) {
                        dyhx c9 = dyib.c();
                        c9.c = dyhz.UNARY;
                        c9.d = dyib.b("google.internal.notifications.v1.NotificationsApiService", "SetUserPreference");
                        c9.e = true;
                        c9.a = dyyq.b(drzq.e);
                        c9.b = dyyq.b(drzs.a);
                        dyibVar9 = c9.a();
                        buam.i = dyibVar9;
                    }
                }
            }
            hashSet.add(dyibVar9);
        }
        if ("drzu".equals(cls.getName())) {
            dyib<drzu, drzw> dyibVar10 = buam.d;
            if (dyibVar10 == null) {
                synchronized (buam.class) {
                    dyibVar10 = buam.d;
                    if (dyibVar10 == null) {
                        dyhx c10 = dyib.c();
                        c10.c = dyhz.UNARY;
                        c10.d = dyib.b("google.internal.notifications.v1.NotificationsApiService", "StoreTarget");
                        c10.e = true;
                        c10.a = dyyq.b(drzu.i);
                        c10.b = dyyq.b(drzw.d);
                        dyibVar10 = c10.a();
                        buam.d = dyibVar10;
                    }
                }
            }
            hashSet.add(dyibVar10);
        }
        if ("drzy".equals(cls.getName())) {
            dyib<drzy, dsaa> dyibVar11 = buam.j;
            if (dyibVar11 == null) {
                synchronized (buam.class) {
                    dyibVar11 = buam.j;
                    if (dyibVar11 == null) {
                        dyhx c11 = dyib.c();
                        c11.c = dyhz.UNARY;
                        c11.d = dyib.b("google.internal.notifications.v1.NotificationsApiService", "UpdateThreadStateByToken");
                        c11.e = true;
                        c11.a = dyyq.b(drzy.d);
                        c11.b = dyyq.b(dsaa.a);
                        dyibVar11 = c11.a();
                        buam.j = dyibVar11;
                    }
                }
            }
            hashSet.add(dyibVar11);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dryj.class);
        hashSet.add(dryn.class);
        hashSet.add(dryr.class);
        hashSet.add(dryv.class);
        hashSet.add(dryz.class);
        hashSet.add(drze.class);
        hashSet.add(drzi.class);
        hashSet.add(drzm.class);
        hashSet.add(drzq.class);
        hashSet.add(drzu.class);
        hashSet.add(drzy.class);
        return hashSet;
    }
}
