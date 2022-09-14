package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budf  reason: default package */
/* loaded from: classes.dex */
public final class budf extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dwzw".equals(cls.getName())) {
            dyib<dwzw, dxaa> dyibVar = dhbi.b;
            if (dyibVar == null) {
                synchronized (dhbi.class) {
                    dyibVar = dhbi.b;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.location.v1.MobileMapsLocationService", "GetLocationShift");
                        c.e = true;
                        c.a = dyyq.b(dwzw.c);
                        c.b = dyyq.b(dxaa.g);
                        dyibVar = c.a();
                        dhbi.b = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dwjd".equals(cls.getName())) {
            dyib<dwjd, dwjf> dyibVar2 = dhbi.a;
            if (dyibVar2 == null) {
                synchronized (dhbi.class) {
                    dyibVar2 = dhbi.a;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.location.v1.MobileMapsLocationService", "SnapToPlace");
                        c2.e = true;
                        c2.a = dyyq.b(dwjd.i);
                        c2.b = dyyq.b(dwjf.g);
                        dyibVar2 = c2.a();
                        dhbi.a = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dwzw.class);
        hashSet.add(dwjd.class);
        return hashSet;
    }
}
