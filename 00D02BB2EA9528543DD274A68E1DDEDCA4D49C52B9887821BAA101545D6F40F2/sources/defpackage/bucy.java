package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bucy  reason: default package */
/* loaded from: classes.dex */
public final class bucy extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dwbw".equals(cls.getName())) {
            dyib<dwbw, dwby> dyibVar = dhbb.b;
            if (dyibVar == null) {
                synchronized (dhbb.class) {
                    dyibVar = dhbb.b;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.geocode.v1.MobileMapsGeocodeService", "Geocode");
                        c.e = true;
                        c.a = dyyq.b(dwbw.d);
                        c.b = dyyq.b(dwby.c);
                        dyibVar = c.a();
                        dhbb.b = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dibs".equals(cls.getName())) {
            dyib<dibs, dibu> dyibVar2 = dhbb.a;
            if (dyibVar2 == null) {
                synchronized (dhbb.class) {
                    dyibVar2 = dhbb.a;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.geocode.v1.MobileMapsGeocodeService", "GetExhaustiveSearch");
                        c2.e = true;
                        c2.a = dyyq.b(dibs.e);
                        c2.b = dyyq.b(dibu.b);
                        dyibVar2 = c2.a();
                        dhbb.a = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dwcw".equals(cls.getName())) {
            dyib<dwcw, dwcy> dyibVar3 = dhbb.d;
            if (dyibVar3 == null) {
                synchronized (dhbb.class) {
                    dyibVar3 = dhbb.d;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.geocode.v1.MobileMapsGeocodeService", "GetLocationDetails");
                        c3.e = true;
                        c3.a = dyyq.b(dwcw.p);
                        c3.b = dyyq.b(dwcy.e);
                        dyibVar3 = c3.a();
                        dhbb.d = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dwhf".equals(cls.getName())) {
            dyib<dwhf, dwhj> dyibVar4 = dhbb.e;
            if (dyibVar4 == null) {
                synchronized (dhbb.class) {
                    dyibVar4 = dhbb.e;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.geocode.v1.MobileMapsGeocodeService", "Reveal");
                        c4.e = true;
                        c4.a = dyyq.b(dwhf.i);
                        c4.b = dyyq.b(dwhj.f);
                        dyibVar4 = c4.a();
                        dhbb.e = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("dvpt".equals(cls.getName())) {
            dyib<dvpt, dvpw> dyibVar5 = dhbb.c;
            if (dyibVar5 == null) {
                synchronized (dhbb.class) {
                    dyibVar5 = dhbb.c;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.geocode.v1.MobileMapsGeocodeService", "ReverseGeocode");
                        c5.e = true;
                        c5.a = dyyq.b(dvpt.a);
                        c5.b = dyyq.b(dvpw.a);
                        dyibVar5 = c5.a();
                        dhbb.c = dyibVar5;
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
        hashSet.add(dwbw.class);
        hashSet.add(dibs.class);
        hashSet.add(dwcw.class);
        hashSet.add(dwhf.class);
        hashSet.add(dvpt.class);
        return hashSet;
    }
}
