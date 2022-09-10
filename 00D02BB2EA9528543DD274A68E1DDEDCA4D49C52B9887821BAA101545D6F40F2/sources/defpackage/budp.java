package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budp  reason: default package */
/* loaded from: classes.dex */
public final class budp extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhkt".equals(cls.getName())) {
            dyib<dhkt, dhkx> dyibVar = dhbs.c;
            if (dyibVar == null) {
                synchronized (dhbs.class) {
                    dyibVar = dhbs.c;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.peoplefollow.v1.MobileMapsPeopleFollowService", "ApproveFollower");
                        c.e = true;
                        c.a = dyyq.b(dhkt.c);
                        c.b = dyyq.b(dhkx.c);
                        dyibVar = c.a();
                        dhbs.c = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dhyu".equals(cls.getName())) {
            dyib<dhyu, dhyy> dyibVar2 = dhbs.g;
            if (dyibVar2 == null) {
                synchronized (dhbs.class) {
                    dyibVar2 = dhbs.g;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.peoplefollow.v1.MobileMapsPeopleFollowService", "FollowPeople");
                        c2.e = true;
                        c2.a = dyyq.b(dhyu.d);
                        c2.b = dyyq.b(dhyy.d);
                        dyibVar2 = c2.a();
                        dhbs.g = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dics".equals(cls.getName())) {
            dyib<dics, dicu> dyibVar3 = dhbs.d;
            if (dyibVar3 == null) {
                synchronized (dhbs.class) {
                    dyibVar3 = dhbs.d;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.peoplefollow.v1.MobileMapsPeopleFollowService", "GetCreatorRecommendations");
                        c3.e = true;
                        c3.a = dyyq.b(dics.d);
                        c3.b = dyyq.b(dicu.b);
                        dyibVar3 = c3.a();
                        dhbs.d = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dicy".equals(cls.getName())) {
            dyib<dicy, dida> dyibVar4 = dhbs.h;
            if (dyibVar4 == null) {
                synchronized (dhbs.class) {
                    dyibVar4 = dhbs.h;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.peoplefollow.v1.MobileMapsPeopleFollowService", "GetPeopleFollowInfo");
                        c4.e = true;
                        c4.a = dyyq.b(dicy.d);
                        c4.b = dyyq.b(dida.b);
                        dyibVar4 = c4.a();
                        dhbs.h = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("dimm".equals(cls.getName())) {
            dyib<dimm, dimq> dyibVar5 = dhbs.e;
            if (dyibVar5 == null) {
                synchronized (dhbs.class) {
                    dyibVar5 = dhbs.e;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.peoplefollow.v1.MobileMapsPeopleFollowService", "ListFollows");
                        c5.e = true;
                        c5.a = dyyq.b(dimm.h);
                        c5.b = dyyq.b(dimq.h);
                        dyibVar5 = c5.a();
                        dhbs.e = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        if ("djok".equals(cls.getName())) {
            dyib<djok, djom> dyibVar6 = dhbs.a;
            if (dyibVar6 == null) {
                synchronized (dhbs.class) {
                    dyibVar6 = dhbs.a;
                    if (dyibVar6 == null) {
                        dyhx c6 = dyib.c();
                        c6.c = dyhz.UNARY;
                        c6.d = dyib.b("google.internal.mothership.maps.mobilemaps.peoplefollow.v1.MobileMapsPeopleFollowService", "RejectCreatorRecommendation");
                        c6.e = true;
                        c6.a = dyyq.b(djok.c);
                        c6.b = dyyq.b(djom.b);
                        dyibVar6 = c6.a();
                        dhbs.a = dyibVar6;
                    }
                }
            }
            hashSet.add(dyibVar6);
        }
        if ("djoo".equals(cls.getName())) {
            dyib<djoo, djoq> dyibVar7 = dhbs.b;
            if (dyibVar7 == null) {
                synchronized (dhbs.class) {
                    dyibVar7 = dhbs.b;
                    if (dyibVar7 == null) {
                        dyhx c7 = dyib.c();
                        c7.c = dyhz.UNARY;
                        c7.d = dyib.b("google.internal.mothership.maps.mobilemaps.peoplefollow.v1.MobileMapsPeopleFollowService", "RejectFollower");
                        c7.e = true;
                        c7.a = dyyq.b(djoo.c);
                        c7.b = dyyq.b(djoq.b);
                        dyibVar7 = c7.a();
                        dhbs.b = dyibVar7;
                    }
                }
            }
            hashSet.add(dyibVar7);
        }
        if ("djzs".equals(cls.getName())) {
            dyib<djzs, djzu> dyibVar8 = dhbs.f;
            if (dyibVar8 == null) {
                synchronized (dhbs.class) {
                    dyibVar8 = dhbs.f;
                    if (dyibVar8 == null) {
                        dyhx c8 = dyib.c();
                        c8.c = dyhz.UNARY;
                        c8.d = dyib.b("google.internal.mothership.maps.mobilemaps.peoplefollow.v1.MobileMapsPeopleFollowService", "UnfollowPeople");
                        c8.e = true;
                        c8.a = dyyq.b(djzs.d);
                        c8.b = dyyq.b(djzu.d);
                        dyibVar8 = c8.a();
                        dhbs.f = dyibVar8;
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
        hashSet.add(dhkt.class);
        hashSet.add(dhyu.class);
        hashSet.add(dics.class);
        hashSet.add(dicy.class);
        hashSet.add(dimm.class);
        hashSet.add(djok.class);
        hashSet.add(djoo.class);
        hashSet.add(djzs.class);
        return hashSet;
    }
}
