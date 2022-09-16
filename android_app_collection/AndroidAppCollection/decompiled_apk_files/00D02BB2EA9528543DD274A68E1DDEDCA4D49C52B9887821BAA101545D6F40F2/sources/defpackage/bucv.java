package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bucv  reason: default package */
/* loaded from: classes.dex */
public final class bucv extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhxa".equals(cls.getName())) {
            dyib<dhxa, dhxc> dyibVar = dhay.c;
            if (dyibVar == null) {
                synchronized (dhay.class) {
                    dyibVar = dhay.c;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.evprofiledata.v1.MobileMapsEvProfileDataService", "ListEvBuilds");
                        c.e = true;
                        c.a = dyyq.b(dhxa.a);
                        c.b = dyyq.b(dhxc.a);
                        dyibVar = c.a();
                        dhay.c = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dilk".equals(cls.getName())) {
            dyib<dilk, dilm> dyibVar2 = dhay.a;
            if (dyibVar2 == null) {
                synchronized (dhay.class) {
                    dyibVar2 = dhay.a;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.evprofiledata.v1.MobileMapsEvProfileDataService", "ListEvConnectorTypes");
                        c2.e = true;
                        c2.a = dyyq.b(dilk.b);
                        c2.b = dyyq.b(dilm.b);
                        dyibVar2 = c2.a();
                        dhay.a = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dhxe".equals(cls.getName())) {
            dyib<dhxe, dhxg> dyibVar3 = dhay.g;
            if (dyibVar3 == null) {
                synchronized (dhay.class) {
                    dyibVar3 = dhay.g;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.evprofiledata.v1.MobileMapsEvProfileDataService", "ListEvMakes");
                        c3.e = true;
                        c3.a = dyyq.b(dhxe.a);
                        c3.b = dyyq.b(dhxg.a);
                        dyibVar3 = c3.a();
                        dhay.g = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dhxi".equals(cls.getName())) {
            dyib<dhxi, dhxk> dyibVar4 = dhay.d;
            if (dyibVar4 == null) {
                synchronized (dhay.class) {
                    dyibVar4 = dhay.d;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.evprofiledata.v1.MobileMapsEvProfileDataService", "ListEvModelYearTrims");
                        c4.e = true;
                        c4.a = dyyq.b(dhxi.a);
                        c4.b = dyyq.b(dhxk.a);
                        dyibVar4 = c4.a();
                        dhay.d = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("dhxm".equals(cls.getName())) {
            dyib<dhxm, dhxo> dyibVar5 = dhay.e;
            if (dyibVar5 == null) {
                synchronized (dhay.class) {
                    dyibVar5 = dhay.e;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.evprofiledata.v1.MobileMapsEvProfileDataService", "ListEvModelYears");
                        c5.e = true;
                        c5.a = dyyq.b(dhxm.a);
                        c5.b = dyyq.b(dhxo.a);
                        dyibVar5 = c5.a();
                        dhay.e = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        if ("dhxq".equals(cls.getName())) {
            dyib<dhxq, dhxs> dyibVar6 = dhay.f;
            if (dyibVar6 == null) {
                synchronized (dhay.class) {
                    dyibVar6 = dhay.f;
                    if (dyibVar6 == null) {
                        dyhx c6 = dyib.c();
                        c6.c = dyhz.UNARY;
                        c6.d = dyib.b("google.internal.mothership.maps.mobilemaps.evprofiledata.v1.MobileMapsEvProfileDataService", "ListEvModels");
                        c6.e = true;
                        c6.a = dyyq.b(dhxq.a);
                        c6.b = dyyq.b(dhxs.a);
                        dyibVar6 = c6.a();
                        dhay.f = dyibVar6;
                    }
                }
            }
            hashSet.add(dyibVar6);
        }
        if ("dilo".equals(cls.getName())) {
            dyib<dilo, dilq> dyibVar7 = dhay.b;
            if (dyibVar7 == null) {
                synchronized (dhay.class) {
                    dyibVar7 = dhay.b;
                    if (dyibVar7 == null) {
                        dyhx c7 = dyib.c();
                        c7.c = dyhz.UNARY;
                        c7.d = dyib.b("google.internal.mothership.maps.mobilemaps.evprofiledata.v1.MobileMapsEvProfileDataService", "ListEvPaymentNetworks");
                        c7.e = true;
                        c7.a = dyyq.b(dilo.a);
                        c7.b = dyyq.b(dilq.a);
                        dyibVar7 = c7.a();
                        dhay.b = dyibVar7;
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
        hashSet.add(dhxa.class);
        hashSet.add(dilk.class);
        hashSet.add(dhxe.class);
        hashSet.add(dhxi.class);
        hashSet.add(dhxm.class);
        hashSet.add(dhxq.class);
        hashSet.add(dilo.class);
        return hashSet;
    }
}
