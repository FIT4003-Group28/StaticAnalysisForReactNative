package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buec  reason: default package */
/* loaded from: classes.dex */
public final class buec extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhus".equals(cls.getName())) {
            dyib<dhus, dhuu> dyibVar = dhcf.a;
            if (dyibVar == null) {
                synchronized (dhcf.class) {
                    dyibVar = dhcf.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.review.v1.MobileMapsReviewService", "DeleteOwnerResponseToReview");
                        c.e = true;
                        c.a = dyyq.b(dhus.a);
                        c.b = dyyq.b(dhuu.a);
                        dyibVar = c.a();
                        dhcf.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dvqa".equals(cls.getName())) {
            dyib<dvqa, dvqe> dyibVar2 = dhcf.b;
            if (dyibVar2 == null) {
                synchronized (dhcf.class) {
                    dyibVar2 = dhcf.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.review.v1.MobileMapsReviewService", "DeleteReview");
                        c2.e = true;
                        c2.a = dyyq.b(dvqa.f);
                        c2.b = dyyq.b(dvqe.b);
                        dyibVar2 = c2.a();
                        dhcf.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("difj".equals(cls.getName())) {
            dyib<difj, difn> dyibVar3 = dhcf.c;
            if (dyibVar3 == null) {
                synchronized (dhcf.class) {
                    dyibVar3 = dhcf.c;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.review.v1.MobileMapsReviewService", "GetReviews");
                        c3.e = true;
                        c3.a = dyyq.b(difj.b);
                        c3.b = dyyq.b(difn.b);
                        dyibVar3 = c3.a();
                        dhcf.c = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dwhl".equals(cls.getName())) {
            dyib<dwhl, dwhn> dyibVar4 = dhcf.d;
            if (dyibVar4 == null) {
                synchronized (dhcf.class) {
                    dyibVar4 = dhcf.d;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.review.v1.MobileMapsReviewService", "ListEntityReviews");
                        c4.e = true;
                        c4.a = dyyq.b(dwhl.c);
                        c4.b = dyyq.b(dwhn.b);
                        dyibVar4 = c4.a();
                        dhcf.d = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("dwvz".equals(cls.getName())) {
            dyib<dwvz, dwwb> dyibVar5 = dhcf.e;
            if (dyibVar5 == null) {
                synchronized (dhcf.class) {
                    dyibVar5 = dhcf.e;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.review.v1.MobileMapsReviewService", "ListUserReviews");
                        c5.e = true;
                        c5.a = dyyq.b(dwvz.n);
                        c5.b = dyyq.b(dwwb.j);
                        dyibVar5 = c5.a();
                        dhcf.e = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        if ("djvf".equals(cls.getName())) {
            dyib<djvf, djvh> dyibVar6 = dhcf.f;
            if (dyibVar6 == null) {
                synchronized (dhcf.class) {
                    dyibVar6 = dhcf.f;
                    if (dyibVar6 == null) {
                        dyhx c6 = dyib.c();
                        c6.c = dyhz.UNARY;
                        c6.d = dyib.b("google.internal.mothership.maps.mobilemaps.review.v1.MobileMapsReviewService", "ThumbVote");
                        c6.e = true;
                        c6.a = dyyq.b(djvf.d);
                        c6.b = dyyq.b(djvh.a);
                        dyibVar6 = c6.a();
                        dhcf.f = dyibVar6;
                    }
                }
            }
            hashSet.add(dyibVar6);
        }
        if ("dkeu".equals(cls.getName())) {
            dyib<dkeu, dkew> dyibVar7 = dhcf.g;
            if (dyibVar7 == null) {
                synchronized (dhcf.class) {
                    dyibVar7 = dhcf.g;
                    if (dyibVar7 == null) {
                        dyhx c7 = dyib.c();
                        c7.c = dyhz.UNARY;
                        c7.d = dyib.b("google.internal.mothership.maps.mobilemaps.review.v1.MobileMapsReviewService", "WriteOwnerResponseToReview");
                        c7.e = true;
                        c7.a = dyyq.b(dkeu.a);
                        c7.b = dyyq.b(dkew.a);
                        dyibVar7 = c7.a();
                        dhcf.g = dyibVar7;
                    }
                }
            }
            hashSet.add(dyibVar7);
        }
        if ("dvqj".equals(cls.getName())) {
            dyib<dvqj, dvqr> dyibVar8 = dhcf.h;
            if (dyibVar8 == null) {
                synchronized (dhcf.class) {
                    dyibVar8 = dhcf.h;
                    if (dyibVar8 == null) {
                        dyhx c8 = dyib.c();
                        c8.c = dyhz.UNARY;
                        c8.d = dyib.b("google.internal.mothership.maps.mobilemaps.review.v1.MobileMapsReviewService", "WriteReview");
                        c8.e = true;
                        c8.a = dyyq.b(dvqj.o);
                        c8.b = dyyq.b(dvqr.g);
                        dyibVar8 = c8.a();
                        dhcf.h = dyibVar8;
                    }
                }
            }
            hashSet.add(dyibVar8);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dhus.class);
        hashSet.add(dvqa.class);
        hashSet.add(difj.class);
        hashSet.add(dwhl.class);
        hashSet.add(dwvz.class);
        hashSet.add(djvf.class);
        hashSet.add(dkeu.class);
        hashSet.add(dvqj.class);
        return hashSet;
    }
}
