package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buct  reason: default package */
/* loaded from: classes.dex */
public final class buct extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("djzw".equals(cls.getName())) {
            dyib<djzw, djzy> dyibVar = dhaw.a;
            if (dyibVar == null) {
                synchronized (dhaw.class) {
                    dyibVar = dhaw.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.discoveryprefs.v1.MobileMapsDiscoveryPrefsService", "UpdateDiscoveryPrefs");
                        c.e = true;
                        c.a = dyyq.b(djzw.b);
                        c.b = dyyq.b(djzy.b);
                        dyibVar = c.a();
                        dhaw.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(djzw.class);
        return hashSet;
    }
}
