package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.majorevents.api.MajorEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: akmk  reason: default package */
/* loaded from: classes.dex */
public final class akmk implements akgd {
    public static final eaow a = eaow.a(1);
    public final bwrg<aknr> b;
    public final bwrg<aknx> c;
    public final cqat d;
    private final Set<abaj> i = new LinkedHashSet();
    public final Object e = new Object();
    private final Object j = new Object();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public volatile List<MajorEvent> f = dcdc.e();
    public volatile Map<String, eapd> g = new HashMap();

    public akmk(Application application, Executor executor, cqat cqatVar) {
        this.b = new bwrg<>((dssr) aknr.b.cu(7), application, bwre.CACHE_FILE, "event_cache_file", executor);
        this.c = new bwrg<>((dssr) aknx.b.cu(7), application, bwre.CACHE_FILE, "event_impressions_cache_file", executor);
        this.d = cqatVar;
    }

    public static final List<MajorEvent> k(List<MajorEvent> list, List<MajorEvent> list2, List<String> list3, List<String> list4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MajorEvent majorEvent : list2) {
            if (!list3.contains(majorEvent.a()) || list4.contains(majorEvent.a())) {
                linkedHashMap.put(majorEvent.a(), majorEvent);
            }
        }
        for (MajorEvent majorEvent2 : list) {
            linkedHashMap.put(majorEvent2.a(), majorEvent2);
        }
        return dcdc.r(linkedHashMap.values());
    }

    private static final List<dpwv> l(List<MajorEvent> list) {
        dccx F = dcdc.F();
        for (MajorEvent majorEvent : list) {
            F.g(majorEvent.m());
        }
        return F.f();
    }

    @Override // defpackage.akgd
    public final List<MajorEvent> a() {
        return this.f;
    }

    @Override // defpackage.akgd
    public final void b(List<String> list, List<MajorEvent> list2, List<String> list3) {
        List<MajorEvent> list4;
        List<MajorEvent> k;
        synchronized (this.e) {
            list4 = this.f;
            k = k(list2, list4, list, list3);
            this.f = k;
        }
        List<dpwv> l = l(list4);
        List<dpwv> l2 = l(k);
        if (l.size() != l2.size() || !l.containsAll(l2)) {
            i(k);
            j();
        }
    }

    @Override // defpackage.akgd
    @dzsi
    public final MajorEvent c(String str) {
        for (MajorEvent majorEvent : this.f) {
            if (majorEvent.a().equals(str)) {
                return majorEvent;
            }
        }
        return null;
    }

    @Override // defpackage.akgd
    public final eapd d(String str) {
        eapd eapdVar;
        synchronized (this.e) {
            if (!this.g.containsKey(str)) {
                eapdVar = new eapd(0L);
            } else {
                eapdVar = this.g.get(str);
            }
        }
        return eapdVar;
    }

    @Override // defpackage.akgd
    public final void e(String str, eapd eapdVar) {
        dcdg p = dcdn.p();
        synchronized (this.e) {
            this.g.put(str, eapdVar);
            for (Map.Entry<String, eapd> entry : this.g.entrySet()) {
                p.f(entry.getKey(), entry.getValue());
            }
        }
        dcdn b = p.b();
        if (b.isEmpty()) {
            this.c.g();
            return;
        }
        aknu bZ = aknx.b.bZ();
        Iterator it = b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            aknv bZ2 = aknw.d.bZ();
            String str2 = (String) entry2.getKey();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            aknw aknwVar = (aknw) bZ2.b;
            str2.getClass();
            aknwVar.a |= 1;
            aknwVar.b = str2;
            long j = ((eapd) entry2.getValue()).a;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            aknw aknwVar2 = (aknw) bZ2.b;
            aknwVar2.a |= 2;
            aknwVar2.c = j;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            aknx aknxVar = (aknx) bZ.b;
            aknw bK = bZ2.bK();
            bK.getClass();
            dsrj<aknw> dsrjVar = aknxVar.a;
            if (!dsrjVar.a()) {
                aknxVar.a = dsqw.cl(dsrjVar);
            }
            aknxVar.a.add(bK);
        }
        this.c.e(bZ.bK());
    }

    @Override // defpackage.akgd
    public final eaow f() {
        return a;
    }

    @Override // defpackage.akgd
    public final void g(abaj abajVar) {
        synchronized (this.j) {
            this.i.add(abajVar);
        }
    }

    @Override // defpackage.akgd
    public final void h(abaj abajVar) {
        synchronized (this.j) {
            this.i.remove(abajVar);
        }
    }

    public final void i(List<MajorEvent> list) {
        if (!this.h.get()) {
            return;
        }
        if (list.isEmpty()) {
            this.b.g();
            return;
        }
        akno bZ = aknr.b.bZ();
        for (MajorEvent majorEvent : list) {
            aknp bZ2 = aknq.d.bZ();
            aknt akntVar = majorEvent.a;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            aknq aknqVar = (aknq) bZ2.b;
            aknqVar.b = akntVar.e;
            aknqVar.a |= 1;
            if (!majorEvent.b.equals(diwb.U)) {
                diwb diwbVar = majorEvent.b;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                aknq aknqVar2 = (aknq) bZ2.b;
                diwbVar.getClass();
                aknqVar2.c = diwbVar;
                aknqVar2.a |= 2;
            }
            aknq bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            aknr aknrVar = (aknr) bZ.b;
            bK.getClass();
            dsrj<aknq> dsrjVar = aknrVar.a;
            if (!dsrjVar.a()) {
                aknrVar.a = dsqw.cl(dsrjVar);
            }
            aknrVar.a.add(bK);
        }
        this.b.e(bZ.bK());
    }

    public final void j() {
        synchronized (this.j) {
            for (abaj abajVar : this.i) {
                abajVar.a.e();
            }
        }
    }
}
