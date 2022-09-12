package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bueu  reason: default package */
/* loaded from: classes.dex */
public final class bueu extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dwvn".equals(cls.getName())) {
            dyib<dwvn, dwvp> dyibVar = dhcx.a;
            if (dyibVar == null) {
                synchronized (dhcx.class) {
                    dyibVar = dhcx.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.userprefs.v1.MobileMapsUserPrefsService", "GetUserPrefs");
                        c.e = true;
                        c.a = dyyq.b(dwvn.f);
                        c.b = dyyq.b(dwvp.b);
                        dyibVar = c.a();
                        dhcx.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dwvr".equals(cls.getName())) {
            dyib<dwvr, dwvt> dyibVar2 = dhcx.b;
            if (dyibVar2 == null) {
                synchronized (dhcx.class) {
                    dyibVar2 = dhcx.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.userprefs.v1.MobileMapsUserPrefsService", "WriteUserPrefs");
                        c2.e = true;
                        c2.a = dyyq.b(dwvr.e);
                        c2.b = dyyq.b(dwvt.d);
                        dyibVar2 = c2.a();
                        dhcx.b = dyibVar2;
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
        hashSet.add(dwvn.class);
        hashSet.add(dwvr.class);
        return hashSet;
    }
}
