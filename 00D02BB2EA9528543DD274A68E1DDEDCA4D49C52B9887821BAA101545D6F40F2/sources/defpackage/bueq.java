package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bueq  reason: default package */
/* loaded from: classes.dex */
public final class bueq extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhre".equals(cls.getName())) {
            dyib<dhre, dhrg> dyibVar = dhct.g;
            if (dyibVar == null) {
                synchronized (dhct.class) {
                    dyibVar = dhct.g;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugcpost.v1.MobileMapsUgcPostService", "CreateOrUpdateOwnerResponseToUgcPost");
                        c.e = true;
                        c.a = dyyq.b(dhre.a);
                        c.b = dyyq.b(dhrg.a);
                        dyibVar = c.a();
                        dhct.g = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dhsg".equals(cls.getName())) {
            dyib<dhsg, dhsi> dyibVar2 = dhct.a;
            if (dyibVar2 == null) {
                synchronized (dhct.class) {
                    dyibVar2 = dhct.a;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugcpost.v1.MobileMapsUgcPostService", "CreateUgcPost");
                        c2.e = true;
                        c2.a = dyyq.b(dhsg.g);
                        c2.b = dyyq.b(dhsi.e);
                        dyibVar2 = c2.a();
                        dhct.a = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dhuw".equals(cls.getName())) {
            dyib<dhuw, dhuy> dyibVar3 = dhct.h;
            if (dyibVar3 == null) {
                synchronized (dhct.class) {
                    dyibVar3 = dhct.h;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugcpost.v1.MobileMapsUgcPostService", "DeleteOwnerResponseToUgcPost");
                        c3.e = true;
                        c3.a = dyyq.b(dhuw.a);
                        c3.b = dyyq.b(dhuy.a);
                        dyibVar3 = c3.a();
                        dhct.h = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dhvg".equals(cls.getName())) {
            dyib<dhvg, dhvi> dyibVar4 = dhct.b;
            if (dyibVar4 == null) {
                synchronized (dhct.class) {
                    dyibVar4 = dhct.b;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugcpost.v1.MobileMapsUgcPostService", "DeleteUgcPost");
                        c4.e = true;
                        c4.a = dyyq.b(dhvg.d);
                        c4.b = dyyq.b(dhvi.a);
                        dyibVar4 = c4.a();
                        dhct.b = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("dihj".equals(cls.getName())) {
            dyib<dihj, dihl> dyibVar5 = dhct.i;
            if (dyibVar5 == null) {
                synchronized (dhct.class) {
                    dyibVar5 = dhct.i;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugcpost.v1.MobileMapsUgcPostService", "GetUgcPostEditorInfo");
                        c5.e = true;
                        c5.a = dyyq.b(dihj.c);
                        c5.b = dyyq.b(dihl.a);
                        dyibVar5 = c5.a();
                        dhct.i = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        if ("dihn".equals(cls.getName())) {
            dyib<dihn, dihp> dyibVar6 = dhct.c;
            if (dyibVar6 == null) {
                synchronized (dhct.class) {
                    dyibVar6 = dhct.c;
                    if (dyibVar6 == null) {
                        dyhx c6 = dyib.c();
                        c6.c = dyhz.UNARY;
                        c6.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugcpost.v1.MobileMapsUgcPostService", "GetUgcPost");
                        c6.e = true;
                        c6.a = dyyq.b(dihn.e);
                        c6.b = dyyq.b(dihp.c);
                        dyibVar6 = c6.a();
                        dhct.c = dyibVar6;
                    }
                }
            }
            hashSet.add(dyibVar6);
        }
        if ("dinq".equals(cls.getName())) {
            dyib<dinq, dins> dyibVar7 = dhct.d;
            if (dyibVar7 == null) {
                synchronized (dhct.class) {
                    dyibVar7 = dhct.d;
                    if (dyibVar7 == null) {
                        dyhx c7 = dyib.c();
                        c7.c = dyhz.UNARY;
                        c7.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugcpost.v1.MobileMapsUgcPostService", "ListUgcPosts");
                        c7.e = true;
                        c7.a = dyyq.b(dinq.g);
                        c7.b = dyyq.b(dins.d);
                        dyibVar7 = c7.a();
                        dhct.d = dyibVar7;
                    }
                }
            }
            hashSet.add(dyibVar7);
        }
        if ("dkck".equals(cls.getName())) {
            dyib<dkck, dkcm> dyibVar8 = dhct.e;
            if (dyibVar8 == null) {
                synchronized (dhct.class) {
                    dyibVar8 = dhct.e;
                    if (dyibVar8 == null) {
                        dyhx c8 = dyib.c();
                        c8.c = dyhz.UNARY;
                        c8.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugcpost.v1.MobileMapsUgcPostService", "UpdateUgcPost");
                        c8.e = true;
                        c8.a = dyyq.b(dkck.e);
                        c8.b = dyyq.b(dkcm.c);
                        dyibVar8 = c8.a();
                        dhct.e = dyibVar8;
                    }
                }
            }
            hashSet.add(dyibVar8);
        }
        if ("dkeq".equals(cls.getName())) {
            dyib<dkeq, dkes> dyibVar9 = dhct.f;
            if (dyibVar9 == null) {
                synchronized (dhct.class) {
                    dyibVar9 = dhct.f;
                    if (dyibVar9 == null) {
                        dyhx c9 = dyib.c();
                        c9.c = dyhz.UNARY;
                        c9.d = dyib.b("google.internal.mothership.maps.mobilemaps.ugcpost.v1.MobileMapsUgcPostService", "VoteUgcPost");
                        c9.e = true;
                        c9.a = dyyq.b(dkeq.e);
                        c9.b = dyyq.b(dkes.a);
                        dyibVar9 = c9.a();
                        dhct.f = dyibVar9;
                    }
                }
            }
            hashSet.add(dyibVar9);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dhre.class);
        hashSet.add(dhsg.class);
        hashSet.add(dhuw.class);
        hashSet.add(dhvg.class);
        hashSet.add(dihj.class);
        hashSet.add(dihn.class);
        hashSet.add(dinq.class);
        hashSet.add(dkck.class);
        hashSet.add(dkeq.class);
        return hashSet;
    }
}
