package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budq  reason: default package */
/* loaded from: classes.dex */
public final class budq extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dvkr".equals(cls.getName())) {
            dyib<dvkr, dvkt> dyibVar = dhbt.a;
            if (dyibVar == null) {
                synchronized (dhbt.class) {
                    dyibVar = dhbt.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.personalitem.v1.MobileMapsPersonalItemService", "ListPersonalPlaces");
                        c.e = true;
                        c.a = dyyq.b(dvkr.a);
                        c.b = dyyq.b(dvkt.a);
                        dyibVar = c.a();
                        dhbt.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dwdk".equals(cls.getName())) {
            dyib<dwdk, dwdm> dyibVar2 = dhbt.c;
            if (dyibVar2 == null) {
                synchronized (dhbt.class) {
                    dyibVar2 = dhbt.c;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.personalitem.v1.MobileMapsPersonalItemService", "UpdatePersonalIntelligence");
                        c2.e = true;
                        c2.a = dyyq.b(dwdk.c);
                        c2.b = dyyq.b(dwdm.b);
                        dyibVar2 = c2.a();
                        dhbt.c = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dvkd".equals(cls.getName())) {
            dyib<dvkd, dvkf> dyibVar3 = dhbt.b;
            if (dyibVar3 == null) {
                synchronized (dhbt.class) {
                    dyibVar3 = dhbt.b;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.personalitem.v1.MobileMapsPersonalItemService", "UpdatePersonalNotes");
                        c3.e = true;
                        c3.a = dyyq.b(dvkd.a);
                        c3.b = dyyq.b(dvkf.a);
                        dyibVar3 = c3.a();
                        dhbt.b = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dvkr.class);
        hashSet.add(dwdk.class);
        hashSet.add(dvkd.class);
        return hashSet;
    }
}
