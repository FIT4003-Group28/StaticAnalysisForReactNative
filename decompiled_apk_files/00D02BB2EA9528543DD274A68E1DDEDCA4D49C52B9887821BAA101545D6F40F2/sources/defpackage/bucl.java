package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bucl  reason: default package */
/* loaded from: classes.dex */
public final class bucl extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhkn".equals(cls.getName())) {
            dyib<dhkn, dhkp> dyibVar = dhar.c;
            if (dyibVar == null) {
                synchronized (dhar.class) {
                    dyibVar = dhar.c;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.commute.v1.MobileMapsCommuteService", "AllowCommuteNotificationSession");
                        c.e = true;
                        c.a = dyyq.b(dhkn.a);
                        c.b = dyyq.b(dhkp.a);
                        dyibVar = c.a();
                        dhar.c = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dhnn".equals(cls.getName())) {
            dyib<dhnn, dhnp> dyibVar2 = dhar.b;
            if (dyibVar2 == null) {
                synchronized (dhar.class) {
                    dyibVar2 = dhar.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.commute.v1.MobileMapsCommuteService", "CancelCommuteNotificationSession");
                        c2.e = true;
                        c2.a = dyyq.b(dhnn.a);
                        c2.b = dyyq.b(dhnp.a);
                        dyibVar2 = c2.a();
                        dhar.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("diaa".equals(cls.getName())) {
            dyib<diaa, diac> dyibVar3 = dhar.a;
            if (dyibVar3 == null) {
                synchronized (dhar.class) {
                    dyibVar3 = dhar.a;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.commute.v1.MobileMapsCommuteService", "GetCommuteImmersiveContent");
                        c3.e = true;
                        c3.a = dyyq.b(diaa.a);
                        c3.b = dyyq.b(diac.a);
                        dyibVar3 = c3.a();
                        dhar.a = dyibVar3;
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
        hashSet.add(dhkn.class);
        hashSet.add(dhnn.class);
        hashSet.add(diaa.class);
        return hashSet;
    }
}
