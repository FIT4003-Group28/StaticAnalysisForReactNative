package defpackage;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: cyqa  reason: default package */
/* loaded from: classes5.dex */
public final class cyqa implements cypq {
    public final ClientVersion a;
    public final cyhd b;
    public final cych c;
    public final cyph d;
    public final cypt e;
    final ConcurrentHashMap<cygg, dehn<cylk>> f = new ConcurrentHashMap<>();
    private final dehp g;

    public cyqa(ClientVersion clientVersion, cyhd cyhdVar, cych cychVar, dehp dehpVar, cyph cyphVar, cypt cyptVar) {
        this.a = clientVersion;
        this.b = cyhdVar;
        this.c = cychVar;
        this.g = dehpVar;
        this.d = cyphVar;
        this.e = cyptVar;
    }

    @Override // defpackage.cypq
    public final synchronized dehn<cyps> a(final ClientConfigInternal clientConfigInternal, final List<cygg> list) {
        if (dyaz.b() && this.c.c != cycg.SUCCESS_LOGGED_IN) {
            cypr a = cyps.a();
            a.a = cyer.PEOPLE_STACK_LOOKUP_RPC;
            a.b = cyes.SKIPPED;
            a.c(list);
            return deha.a(a.a());
        }
        HashSet<cygg> hashSet = new HashSet();
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (cygg cyggVar : list) {
            dehn<cylk> dehnVar = this.f.get(cyggVar);
            if (dehnVar != null) {
                arrayList.add(cyggVar);
                arrayList2.add(dehnVar);
            } else {
                hashSet.add(cyggVar);
            }
        }
        if (!hashSet.isEmpty()) {
            final dcdc r = dcdc.r(hashSet);
            dbtp b = this.d.b();
            dehn<cylk> f = deha.f(new deff(this, clientConfigInternal, r) { // from class: cypx
                private final cyqa a;
                private final ClientConfigInternal b;
                private final List c;

                {
                    this.a = this;
                    this.b = clientConfigInternal;
                    this.c = r;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    dshl bK;
                    cyqa cyqaVar = this.a;
                    ClientConfigInternal clientConfigInternal2 = this.b;
                    List<cygg> list2 = this.c;
                    cylx b2 = cyqaVar.b.b();
                    dshm bZ = dshn.e.bZ();
                    dued duedVar = clientConfigInternal2.h;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dshn dshnVar = (dshn) bZ.b;
                    dshnVar.b = duedVar.cg;
                    dshnVar.a |= 1;
                    dsgl bZ2 = dsgm.c.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dsgm dsgmVar = (dsgm) bZ2.b;
                    dsgmVar.b = 2;
                    dsgmVar.a |= 1;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dshn dshnVar2 = (dshn) bZ.b;
                    dsgm bK2 = bZ2.bK();
                    bK2.getClass();
                    dshnVar2.c = bK2;
                    dshnVar2.a |= 2;
                    for (cygg cyggVar2 : list2) {
                        cygf cygfVar = cygf.EMAIL;
                        dshk dshkVar = dshk.EMAIL;
                        int ordinal = cyggVar2.b().ordinal();
                        if (ordinal == 0) {
                            dshj bZ3 = dshl.c.bZ();
                            String a2 = cyggVar2.a();
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            dshl dshlVar = (dshl) bZ3.b;
                            a2.getClass();
                            dshlVar.a = 1;
                            dshlVar.b = a2;
                            bK = bZ3.bK();
                        } else if (ordinal == 1) {
                            dshj bZ4 = dshl.c.bZ();
                            String a3 = cyggVar2.a();
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            dshl dshlVar2 = (dshl) bZ4.b;
                            a3.getClass();
                            dshlVar2.a = 2;
                            dshlVar2.b = a3;
                            bK = bZ4.bK();
                        } else if (ordinal == 2) {
                            dshj bZ5 = dshl.c.bZ();
                            String a4 = cyggVar2.a();
                            if (bZ5.c) {
                                bZ5.bF();
                                bZ5.c = false;
                            }
                            dshl dshlVar3 = (dshl) bZ5.b;
                            a4.getClass();
                            dshlVar3.a = 3;
                            dshlVar3.b = a4;
                            bK = bZ5.bK();
                        } else {
                            bK = dshl.c;
                        }
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dshn dshnVar3 = (dshn) bZ.b;
                        bK.getClass();
                        dsrj<dshl> dsrjVar = dshnVar3.d;
                        if (!dsrjVar.a()) {
                            dshnVar3.d = dsqw.cl(dsrjVar);
                        }
                        dshnVar3.d.add(bK);
                    }
                    cylt e = cylu.e();
                    e.c(cyqaVar.b.a());
                    e.b(cyqaVar.c);
                    e.d(clientConfigInternal2);
                    ((cyim) e).a = cyqaVar.a;
                    return b2.k(bZ.bK(), e.a());
                }
            }, this.g);
            deha.q(f, new cypy(this, r, b), dege.a);
            deha.q(f, new cypz(this, r), this.g);
            for (cygg cyggVar2 : hashSet) {
                arrayList.add(cyggVar2);
                arrayList2.add(f);
                this.f.put(cyggVar2, f);
            }
        }
        dehn<cyps> h = deew.h(deha.j(arrayList2), new dbrn(list, arrayList) { // from class: cypw
            private final List a;
            private final List b;

            {
                this.a = list;
                this.b = arrayList;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                List list2 = this.a;
                List list3 = this.b;
                List list4 = (List) obj;
                dbsk.b(list3.size() == list4.size(), "key and value lists must have the same size");
                dcdg p = dcdn.p();
                for (int i = 0; i < list3.size(); i++) {
                    p.f(list3.get(i), list4.get(i));
                }
                dcdn b2 = p.b();
                dcdg p2 = dcdn.p();
                Iterator it = b2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    cygg cyggVar3 = (cygg) entry.getKey();
                    dsht dshtVar = ((cylk) entry.getValue()).a;
                    if (dshtVar == null) {
                        dshtVar = dsht.b;
                    }
                    for (dshs dshsVar : dshtVar.a) {
                        dshl dshlVar = dshsVar.c;
                        if (dshlVar == null) {
                            dshlVar = dshl.c;
                        }
                        cygf cygfVar = cygf.EMAIL;
                        int ordinal = cyggVar3.b().ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                if (dshlVar.a == 2 && ((String) dshlVar.b).equals(cyggVar3.a())) {
                                    p2.f(cyggVar3, dshsVar);
                                }
                            } else if (ordinal == 2 && dshlVar.a == 3 && ((String) dshlVar.b).equals(cyggVar3.a())) {
                                p2.f(cyggVar3, dshsVar);
                            }
                        } else if (dshlVar.a == 1 && ((String) dshlVar.b).equals(cyggVar3.a())) {
                            p2.f(cyggVar3, dshsVar);
                        }
                    }
                }
                dcdn b3 = p2.b();
                HashSet hashSet2 = new HashSet(list2);
                cypr a2 = cyps.a();
                a2.a = cyer.PEOPLE_STACK_LOOKUP_RPC;
                a2.b = cyes.SUCCESS;
                dcpd it2 = b3.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    cygg cyggVar4 = (cygg) entry2.getKey();
                    dshs dshsVar2 = (dshs) entry2.getValue();
                    if (dshsVar2.a == 2) {
                        cywm cywmVar = new cywm((dsgk) dshsVar2.b);
                        cywmVar.e(cygl.PAPI_LIST_PEOPLE_BY_KNOWN_ID);
                        a2.d(cyggVar4, cywmVar);
                        hashSet2.remove(cyggVar4);
                    }
                }
                a2.c(hashSet2);
                return a2.a();
            }
        }, dege.a);
        if (dyaz.c()) {
            return deha.o(h);
        }
        return h;
    }
}
