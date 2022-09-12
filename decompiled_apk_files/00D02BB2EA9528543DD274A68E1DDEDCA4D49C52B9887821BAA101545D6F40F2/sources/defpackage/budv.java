package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budv  reason: default package */
/* loaded from: classes.dex */
public final class budv extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("diwn".equals(cls.getName())) {
            dyib<diwn, diwp> dyibVar = dhby.a;
            if (dyibVar == null) {
                synchronized (dhby.class) {
                    dyibVar = dhby.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.placelist.v1.MobileMapsPlaceListService", "FollowPlaceList");
                        c.e = true;
                        c.a = dyyq.b(diwn.a);
                        c.b = dyyq.b(diwp.a);
                        dyibVar = c.a();
                        dhby.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("diwr".equals(cls.getName())) {
            dyib<diwr, diwt> dyibVar2 = dhby.b;
            if (dyibVar2 == null) {
                synchronized (dhby.class) {
                    dyibVar2 = dhby.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.placelist.v1.MobileMapsPlaceListService", "GetPlaceList");
                        c2.e = true;
                        c2.a = dyyq.b(diwr.a);
                        c2.b = dyyq.b(diwt.a);
                        dyibVar2 = c2.a();
                        dhby.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("diwv".equals(cls.getName())) {
            dyib<diwv, diwx> dyibVar3 = dhby.c;
            if (dyibVar3 == null) {
                synchronized (dhby.class) {
                    dyibVar3 = dhby.c;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.placelist.v1.MobileMapsPlaceListService", "SharePlaceList");
                        c3.e = true;
                        c3.a = dyyq.b(diwv.a);
                        c3.b = dyyq.b(diwx.a);
                        dyibVar3 = c3.a();
                        dhby.c = dyibVar3;
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
        hashSet.add(diwn.class);
        hashSet.add(diwr.class);
        hashSet.add(diwv.class);
        return hashSet;
    }
}
