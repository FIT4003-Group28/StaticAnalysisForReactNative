package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bucz  reason: default package */
/* loaded from: classes.dex */
public final class bucz extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhqq".equals(cls.getName())) {
            dyib<dhqq, dhqs> dyibVar = dhbc.a;
            if (dyibVar == null) {
                synchronized (dhbc.class) {
                    dyibVar = dhbc.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.incognito.v1.MobileMapsIncognitoService", "CreateCookie");
                        c.e = true;
                        c.a = dyyq.b(dhqq.c);
                        c.b = dyyq.b(dhqs.b);
                        dyibVar = c.a();
                        dhbc.a = dyibVar;
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
        hashSet.add(dhqq.class);
        return hashSet;
    }
}
