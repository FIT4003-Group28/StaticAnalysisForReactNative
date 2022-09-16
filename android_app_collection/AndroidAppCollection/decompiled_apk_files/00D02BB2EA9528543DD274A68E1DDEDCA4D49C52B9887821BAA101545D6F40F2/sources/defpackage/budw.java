package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budw  reason: default package */
/* loaded from: classes.dex */
public final class budw extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("djbb".equals(cls.getName())) {
            dyib<djbb, djbf> dyibVar = dhbz.d;
            if (dyibVar == null) {
                synchronized (dhbz.class) {
                    dyibVar = dhbz.d;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.placeqa.v1.MobileMapsPlaceQaService", "GetPlaceQa");
                        c.e = true;
                        c.a = dyyq.b(djbb.d);
                        c.b = dyyq.b(djbf.c);
                        dyibVar = c.a();
                        dhbz.d = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("djax".equals(cls.getName())) {
            dyib<djax, djaz> dyibVar2 = dhbz.b;
            if (dyibVar2 == null) {
                synchronized (dhbz.class) {
                    dyibVar2 = dhbz.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.placeqa.v1.MobileMapsPlaceQaService", "GetPlaceQaReplies");
                        c2.e = true;
                        c2.a = dyyq.b(djax.a);
                        c2.b = dyyq.b(djaz.a);
                        dyibVar2 = c2.a();
                        dhbz.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("didg".equals(cls.getName())) {
            dyib<didg, didi> dyibVar3 = dhbz.a;
            if (dyibVar3 == null) {
                synchronized (dhbz.class) {
                    dyibVar3 = dhbz.a;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.placeqa.v1.MobileMapsPlaceQaService", "GetSmartAnswers");
                        c3.e = true;
                        c3.a = dyyq.b(didg.e);
                        c3.b = dyyq.b(didi.b);
                        dyibVar3 = c3.a();
                        dhbz.a = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("djbl".equals(cls.getName())) {
            dyib<djbl, djce> dyibVar4 = dhbz.e;
            if (dyibVar4 == null) {
                synchronized (dhbz.class) {
                    dyibVar4 = dhbz.e;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.placeqa.v1.MobileMapsPlaceQaService", "ListUserContributions");
                        c4.e = true;
                        c4.a = dyyq.b(djbl.e);
                        c4.b = dyyq.b(djce.f);
                        dyibVar4 = c4.a();
                        dhbz.e = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("djrg".equals(cls.getName())) {
            dyib<djrg, djri> dyibVar5 = dhbz.f;
            if (dyibVar5 == null) {
                synchronized (dhbz.class) {
                    dyibVar5 = dhbz.f;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.placeqa.v1.MobileMapsPlaceQaService", "SetBestAnswer");
                        c5.e = true;
                        c5.a = dyyq.b(djrg.d);
                        c5.b = dyyq.b(djri.a);
                        dyibVar5 = c5.a();
                        dhbz.f = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        if ("djcg".equals(cls.getName())) {
            dyib<djcg, djci> dyibVar6 = dhbz.g;
            if (dyibVar6 == null) {
                synchronized (dhbz.class) {
                    dyibVar6 = dhbz.g;
                    if (dyibVar6 == null) {
                        dyhx c6 = dyib.c();
                        c6.c = dyhz.UNARY;
                        c6.d = dyib.b("google.internal.mothership.maps.mobilemaps.placeqa.v1.MobileMapsPlaceQaService", "VotePlaceQa");
                        c6.e = true;
                        c6.a = dyyq.b(djcg.f);
                        c6.b = dyyq.b(djci.b);
                        dyibVar6 = c6.a();
                        dhbz.g = dyibVar6;
                    }
                }
            }
            hashSet.add(dyibVar6);
        }
        if ("djaa".equals(cls.getName())) {
            dyib<djaa, djae> dyibVar7 = dhbz.h;
            if (dyibVar7 == null) {
                synchronized (dhbz.class) {
                    dyibVar7 = dhbz.h;
                    if (dyibVar7 == null) {
                        dyhx c7 = dyib.c();
                        c7.c = dyhz.UNARY;
                        c7.d = dyib.b("google.internal.mothership.maps.mobilemaps.placeqa.v1.MobileMapsPlaceQaService", "WriteAnswer");
                        c7.e = true;
                        c7.a = dyyq.b(djaa.l);
                        c7.b = dyyq.b(djae.e);
                        dyibVar7 = c7.a();
                        dhbz.h = dyibVar7;
                    }
                }
            }
            hashSet.add(dyibVar7);
        }
        if ("djar".equals(cls.getName())) {
            dyib<djar, djav> dyibVar8 = dhbz.i;
            if (dyibVar8 == null) {
                synchronized (dhbz.class) {
                    dyibVar8 = dhbz.i;
                    if (dyibVar8 == null) {
                        dyhx c8 = dyib.c();
                        c8.c = dyhz.UNARY;
                        c8.d = dyib.b("google.internal.mothership.maps.mobilemaps.placeqa.v1.MobileMapsPlaceQaService", "WriteQuestion");
                        c8.e = true;
                        c8.a = dyyq.b(djar.l);
                        c8.b = dyyq.b(djav.e);
                        dyibVar8 = c8.a();
                        dhbz.i = dyibVar8;
                    }
                }
            }
            hashSet.add(dyibVar8);
        }
        if ("dkez".equals(cls.getName())) {
            dyib<dkez, dkfb> dyibVar9 = dhbz.c;
            if (dyibVar9 == null) {
                synchronized (dhbz.class) {
                    dyibVar9 = dhbz.c;
                    if (dyibVar9 == null) {
                        dyhx c9 = dyib.c();
                        c9.c = dyhz.UNARY;
                        c9.d = dyib.b("google.internal.mothership.maps.mobilemaps.placeqa.v1.MobileMapsPlaceQaService", "WriteReply");
                        c9.e = true;
                        c9.a = dyyq.b(dkez.f);
                        c9.b = dyyq.b(dkfb.a);
                        dyibVar9 = c9.a();
                        dhbz.c = dyibVar9;
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
        hashSet.add(djbb.class);
        hashSet.add(djax.class);
        hashSet.add(didg.class);
        hashSet.add(djbl.class);
        hashSet.add(djrg.class);
        hashSet.add(djcg.class);
        hashSet.add(djaa.class);
        hashSet.add(djar.class);
        hashSet.add(dkez.class);
        return hashSet;
    }
}
