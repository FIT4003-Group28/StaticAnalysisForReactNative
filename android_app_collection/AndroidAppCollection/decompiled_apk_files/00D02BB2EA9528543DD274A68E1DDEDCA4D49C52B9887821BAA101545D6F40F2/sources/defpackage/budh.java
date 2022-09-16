package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budh  reason: default package */
/* loaded from: classes.dex */
public final class budh extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("disj".equals(cls.getName())) {
            dyib<disj, disp> dyibVar = dhbk.g;
            if (dyibVar == null) {
                synchronized (dhbk.class) {
                    dyibVar = dhbk.g;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.locationsharing.v1.MobileMapsLocationSharingService", "AskForLocation");
                        c.e = true;
                        c.a = dyyq.b(disj.b);
                        c.b = dyyq.b(disp.b);
                        dyibVar = c.a();
                        dhbk.g = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dhnr".equals(cls.getName())) {
            dyib<dhnr, dhnt> dyibVar2 = dhbk.b;
            if (dyibVar2 == null) {
                synchronized (dhbk.class) {
                    dyibVar2 = dhbk.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.locationsharing.v1.MobileMapsLocationSharingService", "CancelSharedJourney");
                        c2.e = true;
                        c2.a = dyyq.b(dhnr.c);
                        c2.b = dyyq.b(dhnt.a);
                        dyibVar2 = c2.a();
                        dhbk.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dwdc".equals(cls.getName())) {
            dyib<dwdc, dwde> dyibVar3 = dhbk.i;
            if (dyibVar3 == null) {
                synchronized (dhbk.class) {
                    dyibVar3 = dhbk.i;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.locationsharing.v1.MobileMapsLocationSharingService", "CancelShares");
                        c3.e = true;
                        c3.a = dyyq.b(dwdc.b);
                        c3.b = dyyq.b(dwde.b);
                        dyibVar3 = c3.a();
                        dhbk.i = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dhsa".equals(cls.getName())) {
            dyib<dhsa, dhsc> dyibVar4 = dhbk.h;
            if (dyibVar4 == null) {
                synchronized (dhbk.class) {
                    dyibVar4 = dhbk.h;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.locationsharing.v1.MobileMapsLocationSharingService", "CreateSharedJourney");
                        c4.e = true;
                        c4.a = dyyq.b(dhsa.g);
                        c4.b = dyyq.b(dhsc.d);
                        dyibVar4 = c4.a();
                        dhbk.h = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("dist".equals(cls.getName())) {
            dyib<dist, disz> dyibVar5 = dhbk.j;
            if (dyibVar5 == null) {
                synchronized (dhbk.class) {
                    dyibVar5 = dhbk.j;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.locationsharing.v1.MobileMapsLocationSharingService", "CreateShares");
                        c5.e = true;
                        c5.a = dyyq.b(dist.d);
                        c5.b = dyyq.b(disz.b);
                        dyibVar5 = c5.a();
                        dhbk.j = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        if ("dwdg".equals(cls.getName())) {
            dyib<dwdg, dwdi> dyibVar6 = dhbk.a;
            if (dyibVar6 == null) {
                synchronized (dhbk.class) {
                    dyibVar6 = dhbk.a;
                    if (dyibVar6 == null) {
                        dyhx c6 = dyib.c();
                        c6.c = dyhz.UNARY;
                        c6.d = dyib.b("google.internal.mothership.maps.mobilemaps.locationsharing.v1.MobileMapsLocationSharingService", "GetState");
                        c6.e = true;
                        c6.a = dyyq.b(dwdg.h);
                        c6.b = dyyq.b(dwdi.j);
                        dyibVar6 = c6.a();
                        dhbk.a = dyibVar6;
                    }
                }
            }
            hashSet.add(dyibVar6);
        }
        if ("ditc".equals(cls.getName())) {
            dyib<ditc, dite> dyibVar7 = dhbk.d;
            if (dyibVar7 == null) {
                synchronized (dhbk.class) {
                    dyibVar7 = dhbk.d;
                    if (dyibVar7 == null) {
                        dyhx c7 = dyib.c();
                        c7.c = dyhz.UNARY;
                        c7.d = dyib.b("google.internal.mothership.maps.mobilemaps.locationsharing.v1.MobileMapsLocationSharingService", "RecordConsent");
                        c7.e = true;
                        c7.a = dyyq.b(ditc.c);
                        c7.b = dyyq.b(dite.c);
                        dyibVar7 = c7.a();
                        dhbk.d = dyibVar7;
                    }
                }
            }
            hashSet.add(dyibVar7);
        }
        if ("ditg".equals(cls.getName())) {
            dyib<ditg, diti> dyibVar8 = dhbk.f;
            if (dyibVar8 == null) {
                synchronized (dhbk.class) {
                    dyibVar8 = dhbk.f;
                    if (dyibVar8 == null) {
                        dyhx c8 = dyib.c();
                        c8.c = dyhz.UNARY;
                        c8.d = dyib.b("google.internal.mothership.maps.mobilemaps.locationsharing.v1.MobileMapsLocationSharingService", "UpdateShare");
                        c8.e = true;
                        c8.a = dyyq.b(ditg.c);
                        c8.b = dyyq.b(diti.b);
                        dyibVar8 = c8.a();
                        dhbk.f = dyibVar8;
                    }
                }
            }
            hashSet.add(dyibVar8);
        }
        if ("dkbo".equals(cls.getName())) {
            dyib<dkbo, dkbs> dyibVar9 = dhbk.c;
            if (dyibVar9 == null) {
                synchronized (dhbk.class) {
                    dyibVar9 = dhbk.c;
                    if (dyibVar9 == null) {
                        dyhx c9 = dyib.c();
                        c9.c = dyhz.UNARY;
                        c9.d = dyib.b("google.internal.mothership.maps.mobilemaps.locationsharing.v1.MobileMapsLocationSharingService", "UpdateSharedJourney");
                        c9.e = true;
                        c9.a = dyyq.b(dkbo.f);
                        c9.b = dyyq.b(dkbs.b);
                        dyibVar9 = c9.a();
                        dhbk.c = dyibVar9;
                    }
                }
            }
            hashSet.add(dyibVar9);
        }
        if ("ditm".equals(cls.getName())) {
            dyib<ditm, dito> dyibVar10 = dhbk.e;
            if (dyibVar10 == null) {
                synchronized (dhbk.class) {
                    dyibVar10 = dhbk.e;
                    if (dyibVar10 == null) {
                        dyhx c10 = dyib.c();
                        c10.c = dyhz.UNARY;
                        c10.d = dyib.b("google.internal.mothership.maps.mobilemaps.locationsharing.v1.MobileMapsLocationSharingService", "UploadLocation");
                        c10.e = true;
                        c10.a = dyyq.b(ditm.f);
                        c10.b = dyyq.b(dito.b);
                        dyibVar10 = c10.a();
                        dhbk.e = dyibVar10;
                    }
                }
            }
            hashSet.add(dyibVar10);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(disj.class);
        hashSet.add(dhnr.class);
        hashSet.add(dwdc.class);
        hashSet.add(dhsa.class);
        hashSet.add(dist.class);
        hashSet.add(dwdg.class);
        hashSet.add(ditc.class);
        hashSet.add(ditg.class);
        hashSet.add(dkbo.class);
        hashSet.add(ditm.class);
        return hashSet;
    }
}
