package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afty  reason: default package */
/* loaded from: classes.dex */
public final class afty implements afug {
    final HashMap a;
    protected final afuj b;
    final double c;
    private final long d;
    private final afuf e;
    private final snc f;
    private final yrj g;
    private Map h = new HashMap();
    private long i;
    private final double j;
    private final boolean k;
    private final yjs l;
    private final afso m;

    public afty(afso afsoVar, afuj afujVar, afuf afufVar, yjs yjsVar, snc sncVar, yrj yrjVar) {
        this.m = afsoVar;
        this.b = afujVar;
        this.e = afufVar;
        this.l = yjsVar;
        this.f = sncVar;
        this.g = yrjVar;
        this.d = afsoVar.e();
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        this.k = afsoVar.l();
        this.j = afsoVar.a();
        this.c = afsoVar.b();
        long d = afsoVar.d();
        this.i = sncVar.c() + TimeUnit.SECONDS.toMillis(d <= 0 ? 5L : d);
        hashMap.put(aqll.DELAYED_EVENT_TIER_DEFAULT, new afup(this.i, "delayed_event_dispatch_default_tier_one_off_task", afsoVar.h()));
        hashMap.put(aqll.DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY, new afup(this.i, "delayed_event_dispatch_dispatch_to_empty_tier_one_off_task", afsoVar.i()));
        hashMap.put(aqll.DELAYED_EVENT_TIER_FAST, new afup(this.i, "delayed_event_dispatch_fast_tier_one_off_task", afsoVar.j()));
        hashMap.put(aqll.DELAYED_EVENT_TIER_IMMEDIATE, new afup(this.i, "not_applicable_delayed_event_dispatch_immediate_tier_one_off_task", afsoVar.k()));
    }

    private final void A(aqll aqllVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("tier_type", aqllVar.f);
        afup r = r(aqllVar);
        this.l.e(r.a, r.b.c, false, 1, bundle, null, false);
    }

    private final boolean B(Map map, aqll aqllVar) {
        int i;
        long j;
        Iterator it;
        long j2;
        aqll aqllVar2 = aqllVar;
        long c = this.f.c();
        r(aqllVar2).c = c;
        long q = q(c);
        ArrayList arrayList = new ArrayList();
        List b = b();
        HashMap hashMap = new HashMap();
        Iterator it2 = b.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            aopa aopaVar = (aopa) it2.next();
            String str = ((oro) aopaVar.instance).d;
            afuc afucVar = (afuc) this.h.get(str);
            if (afucVar == null) {
                arrayList.add(aopaVar);
                String valueOf = String.valueOf(str);
                z(valueOf.length() != 0 ? "Failed to find delayed event dispatcher for type ".concat(valueOf) : new String("Failed to find delayed event dispatcher for type "), null);
            } else if (J(aopaVar, afucVar.a())) {
                arrayList.add(aopaVar);
                I(hashMap, str, true);
            } else {
                aqll aqllVar3 = aqll.DELAYED_EVENT_TIER_DEFAULT;
                oro oroVar = (oro) aopaVar.instance;
                if ((oroVar.b & 512) != 0) {
                    aqll b2 = aqll.b(oroVar.l);
                    if (b2 == null) {
                        b2 = aqll.DELAYED_EVENT_TIER_UNSPECIFIED;
                    }
                    if (F(b2) && (aqllVar3 = aqll.b(((oro) aopaVar.instance).l)) == null) {
                        aqllVar3 = aqll.DELAYED_EVENT_TIER_UNSPECIFIED;
                    }
                }
                if (!map.containsKey(afucVar)) {
                    map.put(afucVar, new HashMap());
                }
                Map map2 = (Map) map.get(afucVar);
                if (!map2.containsKey(aqllVar3)) {
                    map2.put(aqllVar3, new ArrayList());
                }
                ((List) map2.get(aqllVar3)).add(aopaVar);
                I(hashMap, str, false);
            }
        }
        afuf afufVar = this.e;
        if (afufVar != null && afufVar.k()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                this.e.j((String) entry.getKey(), ((Integer) ((jj) entry.getValue()).a).intValue(), ((Integer) ((jj) entry.getValue()).b).intValue());
            }
        }
        Set H = H(aqllVar2, map);
        HashSet hashSet = new HashSet();
        HashMap hashMap2 = new HashMap();
        Iterator it3 = H.iterator();
        while (it3.hasNext()) {
            afuc afucVar2 = (afuc) it3.next();
            ArrayList arrayList2 = new ArrayList();
            Map map3 = (Map) map.get(afucVar2);
            ArrayList arrayList3 = new ArrayList(map3.keySet());
            Collections.sort(arrayList3, Collections.reverseOrder());
            if (map3.containsKey(aqllVar2)) {
                arrayList3.remove(aqllVar2);
                arrayList3.add(i, aqllVar2);
            }
            int a = afucVar2.a().a();
            int size = arrayList3.size();
            while (true) {
                if (i >= size) {
                    j = q;
                    it = it3;
                    break;
                }
                it = it3;
                aqll aqllVar4 = (aqll) arrayList3.get(i);
                int i2 = size;
                int size2 = a - arrayList2.size();
                if (size2 <= 0) {
                    j = q;
                    break;
                }
                ArrayList arrayList4 = arrayList3;
                List list = (List) map3.get(aqllVar4);
                int i3 = a;
                if (size2 < list.size()) {
                    j2 = q;
                    ArrayList arrayList5 = new ArrayList(list.subList(0, size2));
                    arrayList2.addAll(arrayList5);
                    hashSet.addAll(arrayList5);
                    map3.put(aqllVar4, new ArrayList(list.subList(size2, list.size())));
                } else {
                    j2 = q;
                    arrayList2.addAll(list);
                    hashSet.addAll(list);
                    map3.remove(aqllVar4);
                    if (map3.isEmpty()) {
                        map.remove(afucVar2);
                    }
                }
                i++;
                a = i3;
                it3 = it;
                size = i2;
                arrayList3 = arrayList4;
                q = j2;
            }
            hashMap2.put(afucVar2, arrayList2);
            aqllVar2 = aqllVar;
            it3 = it;
            q = j;
            i = 0;
        }
        hashSet.addAll(arrayList);
        this.b.c(hashSet);
        w(aqllVar, hashMap2, q);
        return !H(aqllVar, map).isEmpty();
    }

    private static boolean C(Map map) {
        for (afuc afucVar : map.keySet()) {
            if (((List) map.get(afucVar)).size() - s(map, afucVar).size() > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean D(Integer num) {
        if (num.intValue() == 0) {
            return false;
        }
        return E(TimeUnit.SECONDS.toMillis(num.intValue()) * 3);
    }

    private final boolean E(long j) {
        return this.f.c() - this.i >= j;
    }

    private final boolean F(aqll aqllVar) {
        return this.a.containsKey(aqllVar);
    }

    private final boolean G() {
        return this.g.o() && (!this.m.o() || !this.g.m());
    }

    private static final Set H(aqll aqllVar, Map map) {
        HashSet hashSet = new HashSet();
        for (afuc afucVar : map.keySet()) {
            if (((Map) map.get(afucVar)).containsKey(aqllVar)) {
                hashSet.add(afucVar);
            }
        }
        return hashSet;
    }

    private static final void I(Map map, String str, boolean z) {
        jj jjVar;
        if (!map.containsKey(str)) {
            map.put(str, new jj(0, 0));
        }
        jj jjVar2 = (jj) map.get(str);
        if (z) {
            jjVar = new jj((Integer) jjVar2.a, Integer.valueOf(((Integer) jjVar2.b).intValue() + 1));
        } else {
            jjVar = new jj(Integer.valueOf(((Integer) jjVar2.a).intValue() + 1), (Integer) jjVar2.b);
        }
        map.put(str, jjVar);
    }

    private final boolean J(aopa aopaVar, afta aftaVar) {
        long c = this.f.c();
        if (c - ((oro) aopaVar.instance).f <= TimeUnit.HOURS.toMillis(aftaVar.b())) {
            oro oroVar = (oro) aopaVar.instance;
            return oroVar.i > 0 && c - oroVar.h > TimeUnit.MINUTES.toMillis((long) aftaVar.d());
        }
        return true;
    }

    private static final void K(String str) {
        ylx.i(afzk.a(), new aftw(str));
    }

    private final long q(long j) {
        long j2 = this.i;
        this.i = j;
        return j - j2;
    }

    private final afup r(aqll aqllVar) {
        if (!F(aqllVar)) {
            z("Invalid tier is supplied in getInfoByTier. Falls back to default tier.", null);
            aqllVar = aqll.DELAYED_EVENT_TIER_DEFAULT;
        }
        return (afup) this.a.get(aqllVar);
    }

    private static List s(Map map, afuc afucVar) {
        List list = (List) map.get(afucVar);
        return list.subList(0, Math.min(afucVar.a().a(), list.size()));
    }

    private final synchronized void t() {
        ylr.b();
        if (this.h.isEmpty()) {
            z("Failed delayed event dispatch, no dispatchers in dispatchAllEventsTiered.", null);
        } else if (G()) {
            List<aqll> asList = Arrays.asList(aqll.values());
            Collections.sort(asList, Collections.reverseOrder());
            for (aqll aqllVar : asList) {
                if (F(aqllVar)) {
                    v(aqllVar);
                }
            }
        }
    }

    private final synchronized void u(aqll aqllVar) {
        String valueOf = String.valueOf(aqllVar.name());
        K(valueOf.length() != 0 ? "Attempt to dispatch for tier ".concat(valueOf) : new String("Attempt to dispatch for tier "));
        ylr.b();
        if (this.h.isEmpty()) {
            String name = aqllVar.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 78);
            sb.append("Failed delayed event dispatch, no dispatchers in dispatchEventsForcedByTier(");
            sb.append(name);
            sb.append(").");
            z(sb.toString(), null);
            return;
        }
        if (!F(aqllVar)) {
            z("Invalid tier is supplied in dispatchEventsForcedByTier. Falls back to default tier.", null);
            aqllVar = aqll.DELAYED_EVENT_TIER_DEFAULT;
        }
        if (!B(new HashMap(), aqllVar)) {
            return;
        }
        int b = aqmv.b(r(aqllVar).b.e);
        if (b != 0 && b == 3) {
            u(aqllVar);
            return;
        }
        A(aqllVar);
    }

    private final synchronized void v(aqll aqllVar) {
        String valueOf = String.valueOf(aqllVar.name());
        K(valueOf.length() != 0 ? "Attempt to dispatch for tier ".concat(valueOf) : new String("Attempt to dispatch for tier "));
        ylr.b();
        if (this.h.isEmpty()) {
            String name = aqllVar.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 89);
            sb.append("Failed delayed event dispatch, no dispatchers in dispatchEventsForcedByTierUntilEmpty.(");
            sb.append(name);
            sb.append(").");
            z(sb.toString(), null);
            return;
        }
        if (!F(aqllVar)) {
            z("Invalid tier is supplied in dispatchEventsForcedByTierUntilEmpty. Falls back to default tier.", null);
            aqllVar = aqll.DELAYED_EVENT_TIER_DEFAULT;
        }
        if (!B(new HashMap(), aqllVar)) {
            return;
        }
        v(aqllVar);
    }

    private final void w(aqll aqllVar, Map map, long j) {
        for (afuc afucVar : map.keySet()) {
            String b = afucVar.b();
            K(b.length() != 0 ? "Start to dispatch events in tier dispatch event type ".concat(b) : new String("Start to dispatch events in tier dispatch event type "));
            List<aopa> s = s(map, afucVar);
            if (!s.isEmpty()) {
                afuf afufVar = this.e;
                if (afufVar != null && afufVar.k()) {
                    this.e.h(afucVar.b(), s.size(), j);
                }
                HashMap hashMap = new HashMap();
                for (aopa aopaVar : s) {
                    oro oroVar = (oro) aopaVar.instance;
                    jj jjVar = new jj(oroVar.g, oroVar.j);
                    if (!hashMap.containsKey(jjVar)) {
                        hashMap.put(jjVar, new ArrayList());
                    }
                    ((List) hashMap.get(jjVar)).add(aopaVar);
                }
                for (jj jjVar2 : hashMap.keySet()) {
                    List list = (List) hashMap.get(jjVar2);
                    String str = (String) jjVar2.b;
                    boolean z = false;
                    if (!list.isEmpty()) {
                        z = ((oro) ((aopa) list.get(0)).instance).k;
                    }
                    aftv aftvVar = new aftv(new afuq(str, z), aqllVar);
                    String b2 = afucVar.b();
                    K(b2.length() != 0 ? "Call dispatcher to dispatch events for each identity in tier dispatch  event type ".concat(b2) : new String("Call dispatcher to dispatch events for each identity in tier dispatch  event type "));
                    afucVar.c((String) jjVar2.a, aftvVar, list);
                }
            }
        }
    }

    private final void x(Map map, List list) {
        long q = q(this.f.c());
        Map c = c();
        for (String str : c.keySet()) {
            List list2 = (List) c.get(str);
            afuc afucVar = (afuc) this.h.get(str);
            if (afucVar == null) {
                list.addAll(list2);
                String valueOf = String.valueOf(str);
                z(valueOf.length() != 0 ? "Failed to find delayed event dispatcher for type ".concat(valueOf) : new String("Failed to find delayed event dispatcher for type "), null);
            } else {
                afta a = afucVar.a();
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    aopa aopaVar = (aopa) it.next();
                    if (J(aopaVar, a)) {
                        arrayList.add(aopaVar);
                        it.remove();
                    }
                }
                list.addAll(arrayList);
                afuf afufVar = this.e;
                if (afufVar != null && afufVar.k()) {
                    this.e.j(str, list2.size(), arrayList.size());
                }
                map.put(afucVar, list2);
            }
        }
        HashSet hashSet = new HashSet();
        for (afuc afucVar2 : map.keySet()) {
            hashSet.addAll(s(map, afucVar2));
        }
        hashSet.addAll(list);
        this.b.c(hashSet);
        w(null, map, q);
    }

    private final void y(SQLException sQLException) {
        if (this.m.p() && (sQLException instanceof SQLiteBlobTooBigException)) {
            this.b.d();
        }
        String valueOf = String.valueOf(sQLException);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
        sb.append("The DB is deleted since large record > 2MB is encountered: ");
        sb.append(valueOf);
        aftx aftxVar = new aftx(sb.toString());
        z("DB dropped on large record: ", aftxVar);
        throw aftxVar;
    }

    private final void z(String str, Exception exc) {
        if (exc != null) {
            if (Math.random() < this.c) {
                zep.f("GEL_DELAYED_EVENT_DEBUG", str, exc);
            }
            if (!this.k) {
                return;
            }
            String valueOf = String.valueOf(str);
            afus.d(1, 12, valueOf.length() != 0 ? "GEL_DELAYED_EVENT_DEBUG ".concat(valueOf) : new String("GEL_DELAYED_EVENT_DEBUG "), exc, this.j);
            return;
        }
        if (Math.random() < this.c) {
            zep.c("GEL_DELAYED_EVENT_DEBUG", str);
        }
        if (!this.k) {
            return;
        }
        String valueOf2 = String.valueOf(str);
        afus.e(1, 12, valueOf2.length() != 0 ? "GEL_DELAYED_EVENT_MONITORING_ERROR ".concat(valueOf2) : new String("GEL_DELAYED_EVENT_MONITORING_ERROR "), this.j);
    }

    @Override // defpackage.afug
    public final double a() {
        if (this.m.l()) {
            return this.m.a();
        }
        return -1.0d;
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        try {
            yms a = this.b.a();
            while (a.hasNext()) {
                arrayList.add((aopa) a.next());
            }
            K("Load all message from store for tier dispatch!");
        } catch (SQLException e) {
            y(e);
        }
        return arrayList;
    }

    protected final Map c() {
        HashMap hashMap = new HashMap(this.h.size());
        try {
            yms a = this.b.a();
            while (a.hasNext()) {
                aopa aopaVar = (aopa) a.next();
                String str = ((oro) aopaVar.instance).d;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new ArrayList());
                }
                ((List) hashMap.get(str)).add(aopaVar);
            }
            a.a();
            K("Load all message from store for on background dispatch!");
        } catch (SQLException e) {
            y(e);
        }
        return hashMap;
    }

    @Override // defpackage.afug
    public final void d(Set set) {
        amum i = amup.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            afuc afucVar = (afuc) it.next();
            String b = afucVar.b();
            if (!TextUtils.isEmpty(b)) {
                i.f(b, afucVar);
            }
        }
        this.h = i.b();
    }

    @Override // defpackage.afug
    public final synchronized void e() {
        if (this.m.n()) {
            t();
            return;
        }
        ylr.b();
        if (this.h.isEmpty()) {
            z("Failed delayed event dispatch, no dispatchers in dispatchAllEvents.", null);
        } else if (!G()) {
        } else {
            HashMap hashMap = new HashMap();
            x(hashMap, new ArrayList());
            if (!C(hashMap)) {
                return;
            }
            e();
        }
    }

    @Override // defpackage.afug
    public final synchronized void f() {
        ylr.b();
        if (!E(TimeUnit.SECONDS.toMillis(this.m.e()))) {
            j();
        } else {
            h();
        }
    }

    @Override // defpackage.afug
    public final synchronized void g(aqll aqllVar) {
        ylr.b();
        afup r = r(aqllVar);
        if (this.f.c() - r.c < TimeUnit.SECONDS.toMillis(r.b.c)) {
            String valueOf = String.valueOf(aqllVar.name());
            K(valueOf.length() != 0 ? "Schedule a dispatch in the future since attempting to dispatch too soon for tier ".concat(valueOf) : new String("Schedule a dispatch in the future since attempting to dispatch too soon for tier "));
            A(aqllVar);
            return;
        }
        u(aqllVar);
    }

    public final synchronized void h() {
        ylr.b();
        if (this.h.isEmpty()) {
            z("Failed delayed event dispatch, no dispatchers in dispatchEventsForced.", null);
            return;
        }
        HashMap hashMap = new HashMap();
        x(hashMap, new ArrayList());
        if (!C(hashMap)) {
            return;
        }
        j();
    }

    @Override // defpackage.afug
    public final void i(afta aftaVar, List list, cff cffVar) {
        ylr.b();
        if (ahfc.e(cffVar)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aopa aopaVar = (aopa) it.next();
            if ((((oro) aopaVar.instance).b & 32) == 0) {
                long c = this.f.c();
                aopaVar.copyOnWrite();
                oro oroVar = (oro) aopaVar.instance;
                oroVar.b |= 32;
                oroVar.h = c;
            }
            int i = ((oro) aopaVar.instance).i;
            if (i >= aftaVar.c()) {
                it.remove();
            } else {
                aopaVar.copyOnWrite();
                oro oroVar2 = (oro) aopaVar.instance;
                oroVar2.b |= 64;
                oroVar2.i = i + 1;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        this.b.e(list);
        if (this.m.m()) {
            A(aqll.DELAYED_EVENT_TIER_DEFAULT);
        } else {
            j();
        }
    }

    public final void j() {
        this.l.e("delayed_event_dispatch_one_off_task", this.d, false, 1, null, null, false);
    }

    @Override // defpackage.afug
    public final boolean k() {
        return this.m.l();
    }

    @Override // defpackage.afug
    public final /* synthetic */ List l() {
        throw new RuntimeException("NotImplemented");
    }

    @Override // defpackage.afug
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.afug
    public final void n(aopa aopaVar) {
        if (this.m.m()) {
            o(aqll.DELAYED_EVENT_TIER_DEFAULT, aopaVar);
            return;
        }
        ylr.b();
        this.b.f(aopaVar);
        if (D(Integer.valueOf(this.m.e())) || !G()) {
            j();
        } else {
            f();
        }
    }

    @Override // defpackage.afug
    public final void o(aqll aqllVar, aopa aopaVar) {
        ylr.b();
        if (aqllVar == aqll.DELAYED_EVENT_TIER_IMMEDIATE) {
            if (this.g.o()) {
                aqll aqllVar2 = aqll.DELAYED_EVENT_TIER_IMMEDIATE;
                aopaVar.copyOnWrite();
                oro oroVar = (oro) aopaVar.instance;
                oro oroVar2 = oro.a;
                oroVar.l = aqllVar2.f;
                oroVar.b |= 512;
                this.b.f(aopaVar);
                u(aqll.DELAYED_EVENT_TIER_IMMEDIATE);
                return;
            }
            aqllVar = aqll.DELAYED_EVENT_TIER_FAST;
        }
        aopaVar.copyOnWrite();
        oro oroVar3 = (oro) aopaVar.instance;
        oro oroVar4 = oro.a;
        oroVar3.l = aqllVar.f;
        oroVar3.b |= 512;
        this.b.f(aopaVar);
        if (D(Integer.valueOf(this.m.h().c)) || !G()) {
            String valueOf = String.valueOf(aqllVar.name());
            K(valueOf.length() != 0 ? "Schedule a dispatch in the future when cold send or no network for tier ".concat(valueOf) : new String("Schedule a dispatch in the future when cold send or no network for tier "));
            A(aqllVar);
            return;
        }
        g(aqllVar);
    }

    @Override // defpackage.afug
    public final void p(aopa aopaVar) {
        this.b.g(aopaVar);
    }
}
