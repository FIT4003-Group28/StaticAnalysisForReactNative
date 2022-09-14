package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buch  reason: default package */
/* loaded from: classes.dex */
public final class buch extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhtm".equals(cls.getName())) {
            dyib<dhtm, dhto> dyibVar = dhan.g;
            if (dyibVar == null) {
                synchronized (dhan.class) {
                    dyibVar = dhan.g;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.businesscalls.v1.MobileMapsBusinessCallsService", "DeleteCallRecord");
                        c.e = true;
                        c.a = dyyq.b(dhtm.a);
                        c.b = dyyq.b(dhto.a);
                        dyibVar = c.a();
                        dhan.g = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dhzs".equals(cls.getName())) {
            dyib<dhzs, dhzu> dyibVar2 = dhan.b;
            if (dyibVar2 == null) {
                synchronized (dhan.class) {
                    dyibVar2 = dhan.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.businesscalls.v1.MobileMapsBusinessCallsService", "GetCallInsights");
                        c2.e = true;
                        c2.a = dyyq.b(dhzs.f);
                        c2.b = dyyq.b(dhzu.b);
                        dyibVar2 = c2.a();
                        dhan.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dhzw".equals(cls.getName())) {
            dyib<dhzw, dhzy> dyibVar3 = dhan.f;
            if (dyibVar3 == null) {
                synchronized (dhan.class) {
                    dyibVar3 = dhan.f;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.businesscalls.v1.MobileMapsBusinessCallsService", "GetCallTranscript");
                        c3.e = true;
                        c3.a = dyyq.b(dhzw.a);
                        c3.b = dyyq.b(dhzy.a);
                        dyibVar3 = c3.a();
                        dhan.f = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("diet".equals(cls.getName())) {
            dyib<diet, diev> dyibVar4 = dhan.a;
            if (dyibVar4 == null) {
                synchronized (dhan.class) {
                    dyibVar4 = dhan.a;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.businesscalls.v1.MobileMapsBusinessCallsService", "GetProxyPhoneNumber");
                        c4.e = true;
                        c4.a = dyyq.b(diet.f);
                        c4.b = dyyq.b(diev.b);
                        dyibVar4 = c4.a();
                        dhan.a = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("diki".equals(cls.getName())) {
            dyib<diki, dikk> dyibVar5 = dhan.c;
            if (dyibVar5 == null) {
                synchronized (dhan.class) {
                    dyibVar5 = dhan.c;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.businesscalls.v1.MobileMapsBusinessCallsService", "ListCallDetails");
                        c5.e = true;
                        c5.a = dyyq.b(diki.i);
                        c5.b = dyyq.b(dikk.d);
                        dyibVar5 = c5.a();
                        dhan.c = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        if ("dikm".equals(cls.getName())) {
            dyib<dikm, diko> dyibVar6 = dhan.d;
            if (dyibVar6 == null) {
                synchronized (dhan.class) {
                    dyibVar6 = dhan.d;
                    if (dyibVar6 == null) {
                        dyhx c6 = dyib.c();
                        c6.c = dyhz.UNARY;
                        c6.d = dyib.b("google.internal.mothership.maps.mobilemaps.businesscalls.v1.MobileMapsBusinessCallsService", "ListCallSurveys");
                        c6.e = true;
                        c6.a = dyyq.b(dikm.e);
                        c6.b = dyyq.b(diko.b);
                        dyibVar6 = c6.a();
                        dhan.d = dyibVar6;
                    }
                }
            }
            hashSet.add(dyibVar6);
        }
        if ("dkay".equals(cls.getName())) {
            dyib<dkay, dkba> dyibVar7 = dhan.e;
            if (dyibVar7 == null) {
                synchronized (dhan.class) {
                    dyibVar7 = dhan.e;
                    if (dyibVar7 == null) {
                        dyhx c7 = dyib.c();
                        c7.c = dyhz.UNARY;
                        c7.d = dyib.b("google.internal.mothership.maps.mobilemaps.businesscalls.v1.MobileMapsBusinessCallsService", "UpdateListingCallsStatus");
                        c7.e = true;
                        c7.a = dyyq.b(dkay.f);
                        c7.b = dyyq.b(dkba.a);
                        dyibVar7 = c7.a();
                        dhan.e = dyibVar7;
                    }
                }
            }
            hashSet.add(dyibVar7);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dhtm.class);
        hashSet.add(dhzs.class);
        hashSet.add(dhzw.class);
        hashSet.add(diet.class);
        hashSet.add(diki.class);
        hashSet.add(dikm.class);
        hashSet.add(dkay.class);
        return hashSet;
    }
}
