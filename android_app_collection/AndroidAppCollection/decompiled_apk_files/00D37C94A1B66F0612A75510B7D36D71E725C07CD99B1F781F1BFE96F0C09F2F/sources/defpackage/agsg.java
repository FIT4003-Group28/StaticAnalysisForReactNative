package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
/* compiled from: PG */
/* renamed from: agsg  reason: default package */
/* loaded from: classes.dex */
public final class agsg {
    public final afvm a;
    public agsa e;
    private final yrj f;
    private final acsf g;
    private final agrz h;
    private final Queue i = new PriorityQueue(1, new agsf());
    final Map b = new HashMap();
    final Map c = new HashMap();
    final Set d = new HashSet();

    public agsg(yrj yrjVar, acsf acsfVar, agrz agrzVar, afvm afvmVar) {
        this.f = yrjVar;
        this.g = acsfVar;
        this.h = agrzVar;
        this.a = afvmVar;
    }

    private final Set l(agrv agrvVar, boolean z) {
        agrv agrvVar2;
        HashSet hashSet = new HashSet();
        if (agrvVar.a().h() && (agrvVar2 = (agrv) this.b.get(agrvVar.a().c())) != null) {
            agrvVar2.f.remove(agrvVar.a);
            if (z) {
                agrvVar2.j = true;
            }
            if (!agrvVar2.d()) {
                this.b.remove(agrvVar2.a);
                if (agrvVar2.j) {
                    hashSet.addAll(d(agrvVar2));
                } else {
                    hashSet.addAll(e(agrvVar2));
                }
            }
        }
        return hashSet;
    }

    private final boolean m(agrv agrvVar) {
        atrc atrcVar = agrvVar.c.e;
        if (atrcVar == null) {
            atrcVar = atrc.b;
        }
        for (atra atraVar : new aops(atrcVar.e, atrc.a)) {
            atra atraVar2 = atra.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_UNKNOWN;
            int ordinal = atraVar.ordinal();
            if (ordinal != 2) {
                if (ordinal == 3 && (!this.f.p() || !this.f.r())) {
                    return false;
                }
            } else if (!this.f.p()) {
                return false;
            }
        }
        return true;
    }

    private final void n(atrk atrkVar, String str, int i) {
        acsf acsfVar = this.g;
        acsd acsdVar = new acsd(i - 1, 4);
        aopa createBuilder = aqyu.a.createBuilder();
        createBuilder.copyOnWrite();
        aqyu aqyuVar = (aqyu) createBuilder.instance;
        atrkVar.getClass();
        aqyuVar.e = atrkVar;
        aqyuVar.b |= 4;
        acsdVar.a = (aqyu) createBuilder.mo39build();
        acsfVar.c(acsdVar, aqzj.FLOW_TYPE_OFFLINE_ORCHESTRATION, str);
    }

    private static aopa o(agrv agrvVar) {
        aopa createBuilder = atrk.a.createBuilder();
        aopa createBuilder2 = atrl.a.createBuilder();
        String str = agrvVar.a;
        createBuilder2.copyOnWrite();
        atrl atrlVar = (atrl) createBuilder2.instance;
        str.getClass();
        int i = 1;
        atrlVar.b |= 1;
        atrlVar.c = str;
        createBuilder.copyOnWrite();
        atrk atrkVar = (atrk) createBuilder.instance;
        atrl atrlVar2 = (atrl) createBuilder2.mo39build();
        atrlVar2.getClass();
        atrkVar.h = atrlVar2;
        atrkVar.b |= 32;
        int i2 = agrvVar.b;
        createBuilder.copyOnWrite();
        atrk atrkVar2 = (atrk) createBuilder.instance;
        atrkVar2.b |= 1;
        atrkVar2.c = i2;
        String g = aakj.g(agrvVar.c.d);
        createBuilder.copyOnWrite();
        atrk atrkVar3 = (atrk) createBuilder.instance;
        atrkVar3.b |= 2;
        atrkVar3.d = g;
        int aq = akel.aq(agrvVar.c.c);
        if (aq != 0) {
            i = aq;
        }
        createBuilder.copyOnWrite();
        atrk atrkVar4 = (atrk) createBuilder.instance;
        atrkVar4.e = i - 1;
        atrkVar4.b |= 4;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized agrv a() {
        agrv agrvVar;
        agrvVar = (agrv) this.i.poll();
        while (agrvVar != null) {
            if (m(agrvVar)) {
                break;
            }
            this.d.add(agrvVar);
            agrvVar = (agrv) this.i.poll();
        }
        return agrvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized amuk b(agrv agrvVar, agrx agrxVar) {
        agrv agrvVar2;
        amuf f = amuk.f();
        f.h(agrvVar);
        if (agrxVar.a() <= 1) {
            return f.g();
        }
        int a = agrxVar.a();
        while (true) {
            a--;
            if (a <= 0 || (agrvVar2 = (agrv) this.i.peek()) == null || !m(agrvVar2) || agrvVar.b != agrvVar2.b) {
                break;
            }
            int aq = akel.aq(agrvVar.c.c);
            if (aq == 0) {
                aq = 1;
            }
            int aq2 = akel.aq(agrvVar2.c.c);
            if (aq2 == 0) {
                aq2 = 1;
            }
            if (aq != aq2 || !agrxVar.b().a(agrvVar2.c)) {
                break;
            }
            this.i.poll();
            f.h(agrvVar2);
        }
        return f.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Set c(List list, agrv agrvVar) {
        HashSet hashSet = new HashSet();
        if (list.isEmpty()) {
            return hashSet;
        }
        hashSet.addAll(list);
        if (agrvVar != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                agrv agrvVar2 = (agrv) it.next();
                if (agrvVar2.a().h() && ((String) agrvVar2.a().c()).equals(agrvVar.a)) {
                    agrvVar.f.add(agrvVar2.a);
                    hashSet.add(agrvVar);
                }
            }
            this.b.put(agrvVar.a, agrvVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            agrv agrvVar3 = (agrv) it2.next();
            if (agrvVar3.b().h()) {
                String str = (String) agrvVar3.b().c();
                if (!this.c.containsKey(str)) {
                    this.c.put(str, new HashSet());
                }
                ((Set) this.c.get(str)).add(agrvVar3);
            } else {
                arrayList.add(agrvVar3);
            }
            k(agrvVar3, 2);
        }
        this.i.addAll(arrayList);
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Set d(agrv agrvVar) {
        HashSet hashSet;
        hashSet = new HashSet();
        agrvVar.c();
        hashSet.add(agrvVar);
        ArrayList arrayList = new ArrayList();
        for (atrf atrfVar : agrvVar.c.g) {
            try {
                arrayList.addAll(this.h.a(atrfVar, null));
            } catch (agse e) {
                int i = agrvVar.b;
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 90);
                sb.append("[Offline] Add failedChainAction failed on original action type: ");
                sb.append(i);
                sb.append(" ErrorMessage: ");
                sb.append(message);
                zep.b(sb.toString());
            }
        }
        hashSet.addAll(new HashSet(c(arrayList, null)));
        String str = agrvVar.a;
        HashSet hashSet2 = new HashSet();
        Set<agrv> set = (Set) this.c.remove(str);
        if (set != null) {
            for (agrv agrvVar2 : set) {
                k(agrvVar2, 5);
                hashSet2.addAll(d(agrvVar2));
            }
        }
        hashSet.addAll(hashSet2);
        hashSet.addAll(l(agrvVar, true));
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Set e(agrv agrvVar) {
        HashSet hashSet = new HashSet();
        hashSet.add(agrvVar);
        if (agrvVar.d()) {
            return hashSet;
        }
        agrvVar.c();
        Set<agrv> set = (Set) this.c.remove(agrvVar.a);
        if (set != null) {
            for (agrv agrvVar2 : set) {
                agrvVar2.h = null;
            }
            j(set);
            hashSet.addAll(set);
        }
        hashSet.addAll(l(agrvVar, false));
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        this.e = null;
        this.i.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(agrv agrvVar, agru agruVar, List list, long j, long j2, boolean z) {
        aopa o = o(agrvVar);
        boolean z2 = false;
        if (agruVar.d && !z) {
            z2 = true;
        }
        o.copyOnWrite();
        atrk atrkVar = (atrk) o.instance;
        atrk atrkVar2 = atrk.a;
        atrkVar.b |= 16;
        atrkVar.g = z2;
        int i = agruVar.f;
        o.copyOnWrite();
        atrk atrkVar3 = (atrk) o.instance;
        int i2 = i - 1;
        if (i != 0) {
            atrkVar3.f = i2;
            atrkVar3.b |= 8;
            o.copyOnWrite();
            atrk atrkVar4 = (atrk) o.instance;
            atrkVar4.b |= 128;
            atrkVar4.k = j;
            long j3 = agrvVar.d;
            o.copyOnWrite();
            atrk atrkVar5 = (atrk) o.instance;
            atrkVar5.b |= 64;
            atrkVar5.j = j2 - j3;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aopa createBuilder = atrl.a.createBuilder();
                String str = ((agrv) it.next()).a;
                createBuilder.copyOnWrite();
                atrl atrlVar = (atrl) createBuilder.instance;
                str.getClass();
                atrlVar.b |= 1;
                atrlVar.c = str;
                o.copyOnWrite();
                atrk atrkVar6 = (atrk) o.instance;
                atrl atrlVar2 = (atrl) createBuilder.mo39build();
                atrlVar2.getClass();
                aopu aopuVar = atrkVar6.i;
                if (!aopuVar.c()) {
                    atrkVar6.i = aopi.mutableCopy(aopuVar);
                }
                atrkVar6.i.add(atrlVar2);
            }
            n((atrk) o.mo39build(), agrvVar.g, 4);
            return;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void h() {
        for (agrv agrvVar : new HashSet(this.d)) {
            if (m(agrvVar)) {
                this.d.remove(agrvVar);
                i(agrvVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i(agrv agrvVar) {
        this.i.add(agrvVar);
        agsa agsaVar = this.e;
        if (agsaVar != null) {
            agsaVar.a();
        }
    }

    public final void j(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i((agrv) it.next());
        }
        agsa agsaVar = this.e;
        if (agsaVar == null) {
            return;
        }
        agsaVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(agrv agrvVar, int i) {
        n((atrk) o(agrvVar).mo39build(), agrvVar.g, i);
    }
}
