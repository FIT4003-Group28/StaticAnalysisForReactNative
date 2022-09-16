package defpackage;

import android.util.Pair;
import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: amch  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class amch implements anir {
    public final /* synthetic */ amcj a;
    private final /* synthetic */ int b;

    public /* synthetic */ amch(amcj amcjVar) {
        this.a = amcjVar;
    }

    public /* synthetic */ amch(amcj amcjVar, int i) {
        this.b = i;
        this.a = amcjVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.b == 0) {
            Void r6 = (Void) obj;
            return this.a.b();
        }
        final amuk amukVar = (amuk) obj;
        amcv amcvVar = this.a.b.b;
        amlp l = amna.l("Sync Accounts");
        try {
            vne vneVar = ((amdf) amcvVar).h;
            final ampg ampgVar = new ampg() { // from class: amdd
                @Override // defpackage.ampg
                public final Object apply(Object obj2) {
                    boolean z;
                    int k;
                    int i;
                    Collection collection = amukVar;
                    aopa mo52toBuilder = ((amdp) obj2).mo52toBuilder();
                    amdp amdpVar = (amdp) mo52toBuilder.mo39build();
                    HashMap hashMap = new HashMap();
                    Iterator it = collection.iterator();
                    while (true) {
                        z = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        ambp ambpVar = (ambp) it.next();
                        Iterator it2 = Collections.unmodifiableMap(Collections.unmodifiableMap(((amdp) mo52toBuilder.instance).d)).values().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                amds amdsVar = (amds) it2.next();
                                ambp ambpVar2 = amdsVar.d;
                                if (ambpVar2 == null) {
                                    ambpVar2 = ambp.a;
                                }
                                if (ambpVar2.i.equals(ambpVar.i) && ambpVar2.c.equals(ambpVar.c)) {
                                    aopa mo52toBuilder2 = amdsVar.mo52toBuilder();
                                    mo52toBuilder2.copyOnWrite();
                                    amds amdsVar2 = (amds) mo52toBuilder2.instance;
                                    ambpVar.getClass();
                                    ambp ambpVar3 = amdsVar2.d;
                                    if (ambpVar3 != null && ambpVar3 != ambp.a) {
                                        aopc aopcVar = (aopc) ambp.a.createBuilder(amdsVar2.d);
                                        aopcVar.mergeFrom((aopi) ambpVar);
                                        amdsVar2.d = (ambp) aopcVar.mo48buildPartial();
                                    } else {
                                        amdsVar2.d = ambpVar;
                                    }
                                    amdsVar2.b = 2 | amdsVar2.b;
                                    mo52toBuilder.H(amdsVar.c, (amds) mo52toBuilder2.mo39build());
                                    i = amdsVar.c;
                                }
                            } else {
                                aopa createBuilder = amds.a.createBuilder();
                                createBuilder.copyOnWrite();
                                amds amdsVar3 = (amds) createBuilder.instance;
                                ambpVar.getClass();
                                amdsVar3.d = ambpVar;
                                amdsVar3.b = 2 | amdsVar3.b;
                                createBuilder.copyOnWrite();
                                amds amdsVar4 = (amds) createBuilder.instance;
                                amdsVar4.e = 0;
                                amdsVar4.b |= 4;
                                i = ((amdp) mo52toBuilder.instance).c;
                                mo52toBuilder.copyOnWrite();
                                amdp amdpVar2 = (amdp) mo52toBuilder.instance;
                                amdpVar2.b |= 1;
                                amdpVar2.c = i + 1;
                                createBuilder.copyOnWrite();
                                amds amdsVar5 = (amds) createBuilder.instance;
                                amdsVar5.b = 1 | amdsVar5.b;
                                amdsVar5.c = i;
                                mo52toBuilder.H(i, (amds) createBuilder.mo39build());
                                break;
                            }
                        }
                        hashMap.put(AccountId.b(i), ambpVar);
                    }
                    amup j = amup.j(hashMap);
                    if (j.size() == collection.size()) {
                        z = true;
                    }
                    aqxo.z(z, "Provider had duplicate accounts.");
                    amvl i2 = amvn.i();
                    for (amds amdsVar6 : Collections.unmodifiableMap(amdpVar.d).values()) {
                        i2.c(AccountId.b(amdsVar6.c));
                    }
                    amvn<AccountId> p = amvn.p(amyv.c(i2.g(), j.keySet()));
                    amum h = amup.h();
                    Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(((amdp) mo52toBuilder.instance).d));
                    for (AccountId accountId : p) {
                        Integer valueOf = Integer.valueOf(accountId.a());
                        if (unmodifiableMap.containsKey(valueOf) && (k = answ.k(((amds) unmodifiableMap.get(valueOf)).e)) != 0 && k == 2) {
                            h.f(accountId, (amds) unmodifiableMap.get(valueOf));
                        }
                    }
                    amup b = h.b();
                    for (AccountId accountId2 : p) {
                        int a = accountId2.a();
                        mo52toBuilder.copyOnWrite();
                        ((amdp) mo52toBuilder.instance).a().remove(Integer.valueOf(a));
                    }
                    return Pair.create(b, (amdp) mo52toBuilder.mo39build());
                }
            };
            final AtomicReference atomicReference = new AtomicReference();
            final amdf amdfVar = (amdf) amcvVar;
            amne h = amne.f(anii.h(vneVar.b(ammo.a(new ampg() { // from class: amdc
                @Override // defpackage.ampg
                public final Object apply(Object obj2) {
                    ampg ampgVar2 = ampg.this;
                    AtomicReference atomicReference2 = atomicReference;
                    Pair pair = (Pair) ampgVar2.apply((amdp) obj2);
                    atomicReference2.set(pair.first);
                    return (amdp) pair.second;
                }
            }), ((amdf) amcvVar).a), ammo.a(new amde(atomicReference)), anjk.a)).i(new anir() { // from class: amcz
                @Override // defpackage.anir
                public final ankt a(Object obj2) {
                    final amdf amdfVar2 = amdf.this;
                    ArrayList arrayList = new ArrayList();
                    amzs it = ((amup) obj2).entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        ambr a = ambr.a((AccountId) entry.getKey(), amdf.a((amds) entry.getValue()).b);
                        Set<ambs> set = (Set) amdfVar2.e.get();
                        final ArrayList arrayList2 = new ArrayList(set.size());
                        for (ambs ambsVar : set) {
                            try {
                                arrayList2.add(ambsVar.a(a));
                            } catch (Exception e) {
                                arrayList2.add(anlz.p(e));
                            }
                        }
                        arrayList.add(anlz.j(arrayList2).b(ammo.b(new aniq() { // from class: amcy
                            @Override // defpackage.aniq
                            public final ankt a() {
                                amdf amdfVar3 = amdf.this;
                                List list = arrayList2;
                                Set<ambq> set2 = (Set) ((axov) amdfVar3.f).a;
                                ArrayList arrayList3 = new ArrayList(set2.size());
                                for (ambq ambqVar : set2) {
                                    try {
                                        arrayList3.add(ambqVar.a());
                                    } catch (Exception e2) {
                                        arrayList3.add(anlz.p(e2));
                                    }
                                }
                                list.addAll(arrayList3);
                                return anlz.l(list).a(almu.o(), anjk.a);
                            }
                        }), amdfVar2.b));
                    }
                    return anlz.l(arrayList).a(almu.o(), anjk.a);
                }
            }, ((amdf) amcvVar).b).h(akzj.e(), anjk.a);
            l.a(h);
            l.close();
            return h;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
