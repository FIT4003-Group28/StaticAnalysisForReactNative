package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: budm  reason: default package */
/* loaded from: classes.dex */
public final class budm extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dhra".equals(cls.getName())) {
            dyib<dhra, dhrc> dyibVar = dhbp.a;
            if (dyibVar == null) {
                synchronized (dhbp.class) {
                    dyibVar = dhbp.a;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.offering.v1.MobileMapsOfferingService", "CreateOfferings");
                        c.e = true;
                        c.a = dyyq.b(dhra.f);
                        c.b = dyyq.b(dhrc.b);
                        dyibVar = c.a();
                        dhbp.a = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("dhum".equals(cls.getName())) {
            dyib<dhum, dhuq> dyibVar2 = dhbp.b;
            if (dyibVar2 == null) {
                synchronized (dhbp.class) {
                    dyibVar2 = dhbp.b;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.offering.v1.MobileMapsOfferingService", "DeleteOfferings");
                        c2.e = true;
                        c2.a = dyyq.b(dhum.d);
                        c2.b = dyyq.b(dhuq.c);
                        dyibVar2 = c2.a();
                        dhbp.b = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dico".equals(cls.getName())) {
            dyib<dico, dicq> dyibVar3 = dhbp.c;
            if (dyibVar3 == null) {
                synchronized (dhbp.class) {
                    dyibVar3 = dhbp.c;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.offering.v1.MobileMapsOfferingService", "GetOfferingDetails");
                        c3.e = true;
                        c3.a = dyyq.b(dico.h);
                        c3.b = dyyq.b(dicq.c);
                        dyibVar3 = c3.a();
                        dhbp.c = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("djox".equals(cls.getName())) {
            dyib<djox, djoz> dyibVar4 = dhbp.d;
            if (dyibVar4 == null) {
                synchronized (dhbp.class) {
                    dyibVar4 = dhbp.d;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.offering.v1.MobileMapsOfferingService", "ReportOfferingProblem");
                        c4.e = true;
                        c4.a = dyyq.b(djox.h);
                        c4.b = dyyq.b(djoz.c);
                        dyibVar4 = c4.a();
                        dhbp.d = dyibVar4;
                    }
                }
            }
            hashSet.add(dyibVar4);
        }
        if ("djsv".equals(cls.getName())) {
            dyib<djsv, djsz> dyibVar5 = dhbp.e;
            if (dyibVar5 == null) {
                synchronized (dhbp.class) {
                    dyibVar5 = dhbp.e;
                    if (dyibVar5 == null) {
                        dyhx c5 = dyib.c();
                        c5.c = dyhz.UNARY;
                        c5.d = dyib.b("google.internal.mothership.maps.mobilemaps.offering.v1.MobileMapsOfferingService", "SubmitOfferingRecommendations");
                        c5.e = true;
                        c5.a = dyyq.b(djsv.d);
                        c5.b = dyyq.b(djsz.c);
                        dyibVar5 = c5.a();
                        dhbp.e = dyibVar5;
                    }
                }
            }
            hashSet.add(dyibVar5);
        }
        if ("djtr".equals(cls.getName())) {
            dyib<djtr, djub> dyibVar6 = dhbp.f;
            if (dyibVar6 == null) {
                synchronized (dhbp.class) {
                    dyibVar6 = dhbp.f;
                    if (dyibVar6 == null) {
                        dyhx c6 = dyib.c();
                        c6.c = dyhz.UNARY;
                        c6.d = dyib.b("google.internal.mothership.maps.mobilemaps.offering.v1.MobileMapsOfferingService", "SuggestOfferings");
                        c6.e = true;
                        c6.a = dyyq.b(djtr.d);
                        c6.b = dyyq.b(djub.b);
                        dyibVar6 = c6.a();
                        dhbp.f = dyibVar6;
                    }
                }
            }
            hashSet.add(dyibVar6);
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(dhra.class);
        hashSet.add(dhum.class);
        hashSet.add(dico.class);
        hashSet.add(djox.class);
        hashSet.add(djsv.class);
        hashSet.add(djtr.class);
        return hashSet;
    }
}
