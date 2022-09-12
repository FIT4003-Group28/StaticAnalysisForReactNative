package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budc  reason: default package */
/* loaded from: classes.dex */
public final class budc extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhqu".equals(cls.getName())) {
            dyib<dhqu, dhqw> dyibVar = dhbf.c;
            if (dyibVar == null) {
                synchronized (dhbf.class) {
                    dyibVar = dhbf.c;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.localpost.v1.MobileMapsLocalPostService", "CreateLocalPost");
                        c.e = true;
                        c.a = dyyq.b(dhqu.a);
                        c.b = dyyq.b(dhqw.a);
                        dyibVar = c.a();
                        dhbf.c = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dhug".equals(cls.getName())) {
            dyib<dhug, dhui> dyibVar2 = dhbf.b;
            if (dyibVar2 == null) {
                synchronized (dhbf.class) {
                    dyibVar2 = dhbf.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.localpost.v1.MobileMapsLocalPostService", "DeleteLocalPost");
                        c2.e = true;
                        c2.a = dyyq.b(dhug.a);
                        c2.b = dyyq.b(dhui.a);
                        dyibVar2 = c2.a();
                        dhbf.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dipt".equals(cls.getName())) {
            dyib<dipt, dipv> dyibVar3 = dhbf.a;
            if (dyibVar3 == null) {
                synchronized (dhbf.class) {
                    dyibVar3 = dhbf.a;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.localpost.v1.MobileMapsLocalPostService", "ListLocalPosts");
                        c3.e = true;
                        c3.a = dyyq.b(dipt.j);
                        c3.b = dyyq.b(dipv.c);
                        dyibVar3 = c3.a();
                        dhbf.a = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dkbc".equals(cls.getName())) {
            dyib<dkbc, dkbe> dyibVar4 = dhbf.d;
            if (dyibVar4 == null) {
                synchronized (dhbf.class) {
                    dyibVar4 = dhbf.d;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.localpost.v1.MobileMapsLocalPostService", "UpdateLocalPost");
                        c4.e = true;
                        c4.a = dyyq.b(dkbc.a);
                        c4.b = dyyq.b(dkbe.a);
                        dyibVar4 = c4.a();
                        dhbf.d = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dhqu.class);
        hashSet.add(dhug.class);
        hashSet.add(dipt.class);
        hashSet.add(dkbc.class);
        return hashSet;
    }
}
