package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: buda  reason: default package */
/* loaded from: classes.dex */
public final class buda extends bufb {
    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        if ("dijr".equals(cls.getName())) {
            dyib<dijr, dijt> dyibVar = dhbd.b;
            if (dyibVar == null) {
                synchronized (dhbd.class) {
                    dyibVar = dhbd.b;
                    if (dyibVar == null) {
                        dyhx c = dyib.c();
                        c.c = dyhz.UNARY;
                        c.d = dyib.b("google.internal.mothership.maps.mobilemaps.knowledgeentity.v1.MobileMapsKnowledgeEntityService", "EditKnowledgeEntity");
                        c.e = true;
                        c.a = dyyq.b(dijr.e);
                        c.b = dyyq.b(dijt.c);
                        dyibVar = c.a();
                        dhbd.b = dyibVar;
                    }
                }
            }
            hashSet.add(dyibVar);
        }
        if ("diji".equals(cls.getName())) {
            dyib<diji, dijk> dyibVar2 = dhbd.a;
            if (dyibVar2 == null) {
                synchronized (dhbd.class) {
                    dyibVar2 = dhbd.a;
                    if (dyibVar2 == null) {
                        dyhx c2 = dyib.c();
                        c2.c = dyhz.UNARY;
                        c2.d = dyib.b("google.internal.mothership.maps.mobilemaps.knowledgeentity.v1.MobileMapsKnowledgeEntityService", "GetKnowledgeEntity");
                        c2.e = true;
                        c2.a = dyyq.b(diji.e);
                        c2.b = dyyq.b(dijk.c);
                        dyibVar2 = c2.a();
                        dhbd.a = dyibVar2;
                    }
                }
            }
            hashSet.add(dyibVar2);
        }
        if ("dijz".equals(cls.getName())) {
            dyib<dijz, dikb> dyibVar3 = dhbd.d;
            if (dyibVar3 == null) {
                synchronized (dhbd.class) {
                    dyibVar3 = dhbd.d;
                    if (dyibVar3 == null) {
                        dyhx c3 = dyib.c();
                        c3.c = dyhz.UNARY;
                        c3.d = dyib.b("google.internal.mothership.maps.mobilemaps.knowledgeentity.v1.MobileMapsKnowledgeEntityService", "KnowledgeEntityFeedback");
                        c3.e = true;
                        c3.a = dyyq.b(dijz.g);
                        c3.b = dyyq.b(dikb.a);
                        dyibVar3 = c3.a();
                        dhbd.d = dyibVar3;
                    }
                }
            }
            hashSet.add(dyibVar3);
        }
        if ("dijv".equals(cls.getName())) {
            dyib<dijv, dijx> dyibVar4 = dhbd.c;
            if (dyibVar4 == null) {
                synchronized (dhbd.class) {
                    dyibVar4 = dhbd.c;
                    if (dyibVar4 == null) {
                        dyhx c4 = dyib.c();
                        c4.c = dyhz.UNARY;
                        c4.d = dyib.b("google.internal.mothership.maps.mobilemaps.knowledgeentity.v1.MobileMapsKnowledgeEntityService", "ListKnowledgeEntityEditSummaries");
                        c4.e = true;
                        c4.a = dyyq.b(dijv.c);
                        c4.b = dyyq.b(dijx.d);
                        dyibVar4 = c4.a();
                        dhbd.c = dyibVar4;
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
        hashSet.add(dijr.class);
        hashSet.add(diji.class);
        hashSet.add(dijz.class);
        hashSet.add(dijv.class);
        return hashSet;
    }
}
