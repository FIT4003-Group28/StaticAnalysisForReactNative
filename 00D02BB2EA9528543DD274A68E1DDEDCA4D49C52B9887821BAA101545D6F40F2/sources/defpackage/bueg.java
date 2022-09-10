package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bueg  reason: default package */
/* loaded from: classes.dex */
public final class bueg extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhrm".equals(cls.getName())) {
            dyib<dhrm, dhro> dyibVar = dhcj.a;
            if (dyibVar == null) {
                synchronized (dhcj.class) {
                    dyibVar = dhcj.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.share.v1.MobileMapsShareService", "CreateShare");
                        c.e = true;
                        c.a = dyyq.b(dhrm.a);
                        c.b = dyyq.b(dhro.a);
                        dyibVar = c.a();
                        dhcj.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("djrc".equals(cls.getName())) {
            dyib<djrc, djre> dyibVar2 = dhcj.b;
            if (dyibVar2 == null) {
                synchronized (dhcj.class) {
                    dyibVar2 = dhcj.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.share.v1.MobileMapsShareService", "SendShare");
                        c2.e = true;
                        c2.a = dyyq.b(djrc.e);
                        c2.b = dyyq.b(djre.a);
                        dyibVar2 = c2.a();
                        dhcj.b = dyibVar2;
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
        hashSet.add(dhrm.class);
        hashSet.add(djrc.class);
        return hashSet;
    }
}
