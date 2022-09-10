package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budo  reason: default package */
/* loaded from: classes.dex */
public final class budo extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dviq".equals(cls.getName())) {
            dyib<dviq, dviw> dyibVar = dhbr.a;
            if (dyibVar == null) {
                synchronized (dhbr.class) {
                    dyibVar = dhbr.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.passiveassist.v1.MobileMapsPassiveAssistService", "GetContent");
                        c.e = true;
                        c.a = dyyq.b(dviq.D);
                        c.b = dyyq.b(dviw.aa);
                        dyibVar = c.a();
                        dhbr.a = dyibVar;
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
        hashSet.add(dviq.class);
        return hashSet;
    }
}
