package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rjg  reason: default package */
/* loaded from: classes4.dex */
public final class rjg {
    public BitSet a;
    final /* synthetic */ rjl b;
    private String c;
    private boolean d;
    private rqm e;
    private BitSet f;
    private Map g;
    private Map h;

    public rjg(rjl rjlVar, String str) {
        this.b = rjlVar;
        this.c = str;
        this.d = true;
        this.a = new BitSet();
        this.f = new BitSet();
        this.g = new afw();
        this.h = new afw();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rqd a(int i) {
        ArrayList arrayList;
        List list;
        aopa createBuilder = rqd.a.createBuilder();
        createBuilder.copyOnWrite();
        rqd rqdVar = (rqd) createBuilder.instance;
        rqdVar.b |= 1;
        rqdVar.c = i;
        boolean z = this.d;
        createBuilder.copyOnWrite();
        rqd rqdVar2 = (rqd) createBuilder.instance;
        rqdVar2.b |= 8;
        rqdVar2.f = z;
        rqm rqmVar = this.e;
        if (rqmVar != null) {
            createBuilder.copyOnWrite();
            rqd rqdVar3 = (rqd) createBuilder.instance;
            rqdVar3.e = rqmVar;
            rqdVar3.b |= 4;
        }
        aopa createBuilder2 = rqm.a.createBuilder();
        createBuilder2.v(rpp.l(this.a));
        createBuilder2.w(rpp.l(this.f));
        Map map = this.g;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(((agd) map).j);
            for (Integer num : this.g.keySet()) {
                int intValue = num.intValue();
                Long l = (Long) this.g.get(Integer.valueOf(intValue));
                if (l != null) {
                    aopa createBuilder3 = rqe.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    rqe rqeVar = (rqe) createBuilder3.instance;
                    rqeVar.b |= 1;
                    rqeVar.c = intValue;
                    long longValue = l.longValue();
                    createBuilder3.copyOnWrite();
                    rqe rqeVar2 = (rqe) createBuilder3.instance;
                    rqeVar2.b |= 2;
                    rqeVar2.d = longValue;
                    arrayList2.add((rqe) createBuilder3.mo39build());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            createBuilder2.copyOnWrite();
            rqm rqmVar2 = (rqm) createBuilder2.instance;
            rqmVar2.a();
            aonk.addAll((Iterable) arrayList, (List) rqmVar2.d);
        }
        Map map2 = this.h;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(((agd) map2).j);
            for (Integer num2 : this.h.keySet()) {
                aopa createBuilder4 = rqn.a.createBuilder();
                int intValue2 = num2.intValue();
                createBuilder4.copyOnWrite();
                rqn rqnVar = (rqn) createBuilder4.instance;
                rqnVar.b |= 1;
                rqnVar.c = intValue2;
                List list2 = (List) this.h.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    createBuilder4.copyOnWrite();
                    rqn rqnVar2 = (rqn) createBuilder4.instance;
                    aopt aoptVar = rqnVar2.d;
                    if (!aoptVar.c()) {
                        rqnVar2.d = aopi.mutableCopy(aoptVar);
                    }
                    aonk.addAll((Iterable) list2, (List) rqnVar2.d);
                }
                arrayList3.add((rqn) createBuilder4.mo39build());
            }
            list = arrayList3;
        }
        createBuilder2.copyOnWrite();
        rqm rqmVar3 = (rqm) createBuilder2.instance;
        rqmVar3.b();
        aonk.addAll((Iterable) list, (List) rqmVar3.e);
        createBuilder.copyOnWrite();
        rqd rqdVar4 = (rqd) createBuilder.instance;
        rqm rqmVar4 = (rqm) createBuilder2.mo39build();
        rqmVar4.getClass();
        rqdVar4.d = rqmVar4;
        rqdVar4.b |= 2;
        return (rqd) createBuilder.mo39build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(rjj rjjVar) {
        int a = rjjVar.a();
        Boolean bool = rjjVar.d;
        if (bool != null) {
            this.f.set(a, bool.booleanValue());
        }
        Boolean bool2 = rjjVar.e;
        if (bool2 != null) {
            this.a.set(a, bool2.booleanValue());
        }
        if (rjjVar.f != null) {
            Map map = this.g;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = rjjVar.f.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.g.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (rjjVar.g != null) {
            Map map2 = this.h;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.h.put(valueOf2, list);
            }
            if (rjjVar.c()) {
                list.clear();
            }
            axst.b();
            if (this.b.J().p(this.c, rkg.Z) && rjjVar.b()) {
                list.clear();
            }
            axst.b();
            if (!this.b.J().p(this.c, rkg.Z)) {
                list.add(Long.valueOf(rjjVar.g.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(rjjVar.g.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    public rjg(rjl rjlVar, String str, rqm rqmVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.b = rjlVar;
        this.c = str;
        this.a = bitSet;
        this.f = bitSet2;
        this.g = map;
        this.h = new afw();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.h.put(num, arrayList);
        }
        this.d = false;
        this.e = rqmVar;
    }
}
