package defpackage;

import android.app.Application;
import android.text.TextUtils;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: aijp  reason: default package */
/* loaded from: classes2.dex */
public final class aijp implements aijc, aiki, aikh {
    public static final dcqe a = dcqe.c("aijp");
    static final long b = TimeUnit.HOURS.toMillis(24);
    static final long c = TimeUnit.MINUTES.toMillis(1);
    static final long d;
    public static final long e;
    static final long f;
    public final aikb g;
    public final cqat h;
    public final dxio<akfa> i;
    public final dehq j;
    public final Executor k;
    public final ahvi l;
    public final btvo m;
    public final Runnable n;
    public final Object o;
    public final deig<Void> p;
    public final HashMap<btlu, aijl> q;
    private final cjqy r;
    private final ajsj s;
    private final bwrg<ajim> t;
    private final Set<aijb> u;
    private final ReentrantReadWriteLock v;
    private boolean w;
    private final aigw x;

    static {
        TimeUnit.MINUTES.toMillis(10L);
        d = TimeUnit.SECONDS.toMillis(30L);
        e = TimeUnit.MINUTES.toMillis(3L);
        f = TimeUnit.DAYS.toMillis(30L);
    }

    public aijp(Application application, aikb aikbVar, cjqy cjqyVar, cqat cqatVar, dxio dxioVar, ajsj ajsjVar, dehq dehqVar, Executor executor, ahvi ahviVar, btvo btvoVar, aigw aigwVar) {
        aijh aijhVar = new aijh(this);
        this.n = aijhVar;
        this.v = new ReentrantReadWriteLock();
        this.o = new Object();
        this.w = false;
        this.q = new HashMap<>();
        this.g = aikbVar;
        this.u = new CopyOnWriteArraySet();
        this.r = cjqyVar;
        this.h = cqatVar;
        this.i = dxioVar;
        this.s = ajsjVar;
        this.l = ahviVar;
        this.m = btvoVar;
        this.x = aigwVar;
        this.j = dehqVar;
        this.k = executor;
        this.t = new bwrg<>((dssr) ajim.b.cu(7), application, bwre.PERSISTENT_FILE, "ls_state_cache.pb", executor);
        this.p = deig.d();
        bvqd.a(dehqVar.d(aijhVar, c, TimeUnit.MILLISECONDS), executor);
    }

    private final void F(dwdi dwdiVar, @dzsi btlu btluVar, boolean z) {
        int i;
        dbsg dbsgVar;
        String concat;
        Iterator<dqzv> it;
        dqyb dqybVar;
        dqyb dqybVar2;
        Long l;
        bvrj.UI_THREAD.c();
        dbsk.l(b());
        aijl B = B(btluVar);
        B.k = dwdiVar;
        SortedMap<PersonId, aikc> sortedMap = B.a;
        Iterator<aikc> it2 = sortedMap.values().iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            dbsg<aikf> G = G(it2.next().f(), btluVar);
            if (G.a()) {
                aikf b2 = G.b();
                b2.i.writeLock().lock();
                try {
                    b2.g = false;
                    b2.h = false;
                } finally {
                    b2.i.writeLock().unlock();
                }
            }
        }
        if (z) {
            B.g = this.h.e();
            if (dwdiVar.c.size() <= 0 && dwdiVar.b.size() <= 0) {
                aigw aigwVar = this.x;
                aigwVar.c.aa(bvjk.gw, btluVar, aigwVar.a.b());
            } else {
                this.x.a(btluVar);
            }
        }
        HashSet<PersonId> hashSet = new HashSet(sortedMap.keySet());
        Iterator<doep> it3 = dwdiVar.b.iterator();
        while (true) {
            boolean z2 = true;
            if (!it3.hasNext()) {
                break;
            }
            doep next = it3.next();
            PersonId a2 = PersonId.a(next);
            Long l2 = B.e.get(a2.g());
            if (l2 == null || l2.longValue() <= this.h.b()) {
                if (sortedMap.containsKey(a2)) {
                    aikc aikcVar = sortedMap.get(a2);
                    dbsk.s(aikcVar);
                    dbsg<aikf> G2 = G(aikcVar.f(), btluVar);
                    if (G2.a()) {
                        aikf b3 = G2.b();
                        if (!aikcVar.g().z() || next.e) {
                            z2 = false;
                        }
                        b3.e(z2);
                    }
                    aikcVar.a(next);
                } else {
                    sortedMap.put(a2, this.g.a(next));
                }
                hashSet.remove(a2);
            }
        }
        if ((dwdiVar.a & 64) != 0) {
            doep doepVar = dwdiVar.i;
            if (doepVar == null) {
                doepVar = doep.i;
            }
            dsqp dsqpVar = (dsqp) doepVar.cu(5);
            dsqpVar.bC(doepVar);
            doeo doeoVar = (doeo) dsqpVar;
            doep doepVar2 = dwdiVar.i;
            if (doepVar2 == null) {
                doepVar2 = doep.i;
            }
            dqyj dqyjVar = doepVar2.c;
            if (dqyjVar == null) {
                dqyjVar = dqyj.f;
            }
            dsqp dsqpVar2 = (dsqp) dqyjVar.cu(5);
            dsqpVar2.bC(dqyjVar);
            dqyi dqyiVar = (dqyi) dsqpVar2;
            if (dqyiVar.c) {
                dqyiVar.bF();
                dqyiVar.c = false;
            }
            dqyj dqyjVar2 = (dqyj) dqyiVar.b;
            dqyjVar2.a |= 1;
            dqyjVar2.b = "0111001101100001011011100111010001100001";
            if (doeoVar.c) {
                doeoVar.bF();
                doeoVar.c = false;
            }
            doep doepVar3 = (doep) doeoVar.b;
            dqyj bK = dqyiVar.bK();
            bK.getClass();
            doepVar3.c = bK;
            doepVar3.a |= 4;
            dbsgVar = dbsg.i(doeoVar.bK());
        } else {
            dbsgVar = dbpy.a;
        }
        eapd eapdVar = new eapd(this.h.b());
        boolean z3 = eapdVar.w(new eapd(this.m.getLocationSharingParameters().P)) && eapdVar.x(new eapd(this.m.getLocationSharingParameters().Q));
        if (!dbsgVar.a() || !z3) {
            sortedMap.remove(PersonId.a);
            hashSet.remove(PersonId.a);
        } else {
            sortedMap.put(PersonId.a, this.g.a((doep) dbsgVar.b()));
            hashSet.remove(PersonId.a);
        }
        for (PersonId personId : hashSet) {
            aikc aikcVar2 = sortedMap.get(personId);
            dbsk.s(aikcVar2);
            aikcVar2.c(false);
        }
        dbyv N = dbyv.N();
        Iterator<dqzv> it4 = dwdiVar.c.iterator();
        int i2 = 0;
        while (it4.hasNext()) {
            dqzv next2 = it4.next();
            PersonId b4 = PersonId.b(next2);
            if (b4 == null) {
                i2++;
            } else {
                if (b4.c != ahwj.GAIA || (l = B.e.get(b4.g())) == null || l.longValue() <= this.h.b()) {
                    if (b4.c == ahwj.TOKEN) {
                        for (aikc aikcVar3 : sortedMap.values()) {
                            dcdc<dqzv> g = aikcVar3.g().g();
                            int size = g.size();
                            while (i < size) {
                                dqzv dqzvVar = g.get(i);
                                Iterator<dqzv> it5 = it4;
                                if (next2.b == 2) {
                                    dqybVar = (dqyb) next2.c;
                                } else {
                                    dqybVar = dqyb.j;
                                }
                                String str = dqybVar.e;
                                PersonId personId2 = b4;
                                if (dqzvVar.b == 2) {
                                    dqybVar2 = (dqyb) dqzvVar.c;
                                } else {
                                    dqybVar2 = dqyb.j;
                                }
                                b4 = str.equals(dqybVar2.e) ? aikcVar3.f() : personId2;
                                i++;
                                it4 = it5;
                            }
                            i = 0;
                        }
                    }
                    it = it4;
                    int a3 = dqzq.a(next2.d);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int i3 = a3 - 1;
                    if (i3 == 1 || i3 == 2) {
                        N.n(b4, next2);
                    } else {
                        i2++;
                    }
                } else {
                    it = it4;
                }
                it4 = it;
                i = 0;
            }
        }
        B.f = i2;
        ArrayList arrayList = new ArrayList();
        for (aijo aijoVar : B.j) {
            if (aijoVar.b >= this.h.e()) {
                arrayList.add(aijoVar);
                PersonId personId3 = aijoVar.a;
                if (personId3 == null) {
                    bvoo.h("No sharee for pending mutation.", new Object[0]);
                } else {
                    aijoVar.a(N.c(personId3));
                }
            }
        }
        if (z) {
            B.j = arrayList;
        }
        Iterator<aikc> it6 = sortedMap.values().iterator();
        while (it6.hasNext()) {
            aikc next3 = it6.next();
            List<V> c2 = N.c(next3.f());
            if (c2.isEmpty()) {
                if (next3.g().C()) {
                    it6.remove();
                } else {
                    next3.b(dcdc.e());
                }
            } else {
                next3.b(dcdc.r(c2));
            }
        }
        for (K k : N.J()) {
            if (sortedMap.get(k) == null) {
                dcdc<dqzv> r = dcdc.r(N.c(k));
                if (!r.isEmpty()) {
                    sortedMap.put(k, this.g.b(r));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (aikc aikcVar4 : sortedMap.values()) {
            ahwl g2 = aikcVar4.g();
            if (i(btluVar, g2.q()) && !g2.l() && !g2.B()) {
                arrayList2.add(g2.q());
            }
        }
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            D(btluVar, (PersonId) arrayList2.get(i4), false);
        }
        if (z) {
            B.h = false;
        }
        aigs aigsVar = B.c;
        dcdc<ahwl> d2 = d(btluVar);
        bvrj.UI_THREAD.c();
        HashMap hashMap = new HashMap();
        int size3 = d2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            ahwl ahwlVar = d2.get(i5);
            PersonId q = ahwlVar.q();
            ahwj ahwjVar = ahwj.GAIA;
            int ordinal = q.c.ordinal();
            if (ordinal == 0) {
                String valueOf = String.valueOf(q.b);
                concat = valueOf.length() != 0 ? "g:".concat(valueOf) : new String("g:");
            } else if (ordinal == 1) {
                String valueOf2 = String.valueOf(q.b);
                concat = valueOf2.length() != 0 ? "p:".concat(valueOf2) : new String("p:");
            } else if (ordinal != 2) {
                concat = null;
            } else {
                String valueOf3 = String.valueOf(q.b);
                concat = valueOf3.length() != 0 ? "e:".concat(valueOf3) : new String("e:");
            }
            if (concat != null) {
                aigsVar.a(ahwlVar.q());
                hashMap.put(ahwlVar.q(), ahwlVar);
            }
        }
        aigsVar.b(dcdc.q(dcft.i(aigsVar.a.keySet(), new aigp(aigsVar, hashMap))), 0.5f, 0.9f);
        aigsVar.b(dcdc.q(dcft.i(aigsVar.a.keySet(), new aigq(aigsVar, hashMap))), 1.0f, 0.8f);
        A();
        m();
    }

    private final dbsg<aikf> G(PersonId personId, @dzsi btlu btluVar) {
        Map<PersonId, aikf> map = B(btluVar).b;
        if (map.containsKey(personId)) {
            return dbsg.j(map.get(personId));
        }
        aikc H = H(personId, btluVar);
        if (H == null) {
            return dbpy.a;
        }
        aikf aikfVar = new aikf(H, this.r, this.h);
        map.put(personId, aikfVar);
        return dbsg.i(aikfVar);
    }

    @dzsi
    private final aikc H(PersonId personId, @dzsi btlu btluVar) {
        return B(btluVar).a.get(personId);
    }

    public final void A() {
        bvrj.UI_THREAD.c();
        this.v.readLock().lock();
        try {
            for (aijb aijbVar : this.u) {
                aijbVar.d();
            }
        } finally {
            this.v.readLock().unlock();
        }
    }

    public final aijl B(@dzsi btlu btluVar) {
        if (btlu.i(btluVar) == btlt.SIGNED_OUT) {
            btluVar = btlu.b;
        }
        aijl aijlVar = this.q.get(btluVar);
        if (aijlVar == null) {
            aijl aijlVar2 = new aijl();
            this.q.put(btluVar, aijlVar2);
            return aijlVar2;
        }
        return aijlVar;
    }

    @Override // defpackage.aikh
    public final void C(@dzsi btlu btluVar, int i) {
        throw null;
    }

    public final void D(@dzsi btlu btluVar, PersonId personId, boolean z) {
        bvrj.UI_THREAD.c();
        dbsk.l(b());
        aijl B = B(btluVar);
        dbsk.t(B.a.remove(personId), "Sharer already removed.");
        B.b.remove(personId);
        if (z) {
            A();
        }
        m();
    }

    @Override // defpackage.aiki
    public final void E(int i, PersonId personId, @dzsi btlu btluVar) {
        bvrj.UI_THREAD.c();
        aijl B = B(btluVar);
        B.j.add(new aijm(this.h.e() + d, personId, i));
        if (b()) {
            F(B.k, btluVar, false);
        }
    }

    @Override // defpackage.aijc
    public final dehn<Void> a() {
        dehn<Void> o;
        synchronized (this.o) {
            if (this.s.f()) {
                return this.p;
            } else if (this.w) {
                return this.p;
            } else {
                this.w = true;
                this.t.h(new dbsz(this) { // from class: aijd
                    private final aijp a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dbsz
                    public final void NU(Object obj) {
                        final aijp aijpVar = this.a;
                        ajim ajimVar = (ajim) obj;
                        bvrj.BACKGROUND_THREADPOOL.c();
                        final HashMap hashMap = new HashMap();
                        if (ajimVar != null) {
                            for (ajiq ajiqVar : ajimVar.a) {
                                String str = ajiqVar.b;
                                if (str.isEmpty()) {
                                    btlu btluVar = btlu.b;
                                    ajio ajioVar = ajiqVar.c;
                                    if (ajioVar == null) {
                                        ajioVar = ajio.h;
                                    }
                                    hashMap.put(btluVar, ajioVar);
                                } else {
                                    btlu n = aijpVar.i.a().n(str);
                                    if (n != null) {
                                        ajio ajioVar2 = ajiqVar.c;
                                        if (ajioVar2 == null) {
                                            ajioVar2 = ajio.h;
                                        }
                                        hashMap.put(n, ajioVar2);
                                    }
                                }
                            }
                        }
                        aijpVar.j.execute(new Runnable(aijpVar, hashMap) { // from class: aijg
                            private final aijp a;
                            private final Map b;

                            {
                                this.a = aijpVar;
                                this.b = hashMap;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                Profile a2;
                                aijp aijpVar2 = this.a;
                                Map map = this.b;
                                long b2 = aijpVar2.h.b();
                                Iterator it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    aijl B = aijpVar2.B((btlu) entry.getKey());
                                    ajio ajioVar3 = (ajio) entry.getValue();
                                    aigs aigsVar = B.c;
                                    ajiw ajiwVar = ajioVar3.g;
                                    if (ajiwVar == null) {
                                        ajiwVar = ajiw.b;
                                    }
                                    bvrj.UI_THREAD.c();
                                    aigsVar.a.clear();
                                    for (ajiu ajiuVar : ajiwVar.a) {
                                        ajja ajjaVar = ajiuVar.b;
                                        if (ajjaVar == null) {
                                            ajjaVar = ajja.d;
                                        }
                                        PersonId j = PersonId.j(ajjaVar);
                                        dbsk.s(j);
                                        aigr a3 = aigsVar.a(j);
                                        a3.d = ajiuVar.c;
                                        a3.b = ajiuVar.d;
                                        a3.c = ajiuVar.e;
                                        a3.e = ajiuVar.f;
                                    }
                                    B.g = ajioVar3.f - b2;
                                    SortedMap<PersonId, aikc> sortedMap = B.a;
                                    for (ajjg ajjgVar : ajioVar3.b) {
                                        ajja ajjaVar2 = ajjgVar.b;
                                        if (ajjaVar2 == null) {
                                            ajjaVar2 = ajja.d;
                                        }
                                        PersonId j2 = PersonId.j(ajjaVar2);
                                        if (j2 != null) {
                                            ajje ajjeVar = ajjgVar.c;
                                            if (ajjeVar == null) {
                                                ajjeVar = ajje.o;
                                            }
                                            ahvi ahviVar = aijpVar2.l;
                                            cqat cqatVar = aijpVar2.h;
                                            ahwm H = ahwn.H();
                                            if ((ajjeVar.a & 32) != 0) {
                                                ajjc ajjcVar = ajjeVar.h;
                                                if (ajjcVar == null) {
                                                    ajjcVar = ajjc.f;
                                                }
                                                ahwk g = Profile.g();
                                                ahuw ahuwVar = (ahuw) g;
                                                ahuwVar.a = j2;
                                                ahuwVar.b = Profile.h(ajjcVar.b);
                                                ahuwVar.c = Profile.h(ajjcVar.c);
                                                ahuwVar.d = Profile.h(ajjcVar.d);
                                                ahuwVar.e = Profile.h(ajjcVar.e);
                                                a2 = g.a();
                                            } else {
                                                ahwk g2 = Profile.g();
                                                ahuw ahuwVar2 = (ahuw) g2;
                                                ahuwVar2.a = j2;
                                                ahuwVar2.b = Profile.h(ajjeVar.l);
                                                ahuwVar2.c = Profile.h(ajjeVar.m);
                                                ahuwVar2.d = Profile.h(ajjeVar.k);
                                                ahuwVar2.e = Profile.h(ajjeVar.n);
                                                a2 = g2.a();
                                            }
                                            H.j(a2);
                                            doep doepVar = ajjeVar.b;
                                            if (doepVar == null) {
                                                doepVar = doep.i;
                                            }
                                            H.m(doepVar);
                                            Iterator it2 = it;
                                            H.f(ajjeVar.g);
                                            boolean z = true;
                                            if (1 != (ajjeVar.a & 1)) {
                                                z = false;
                                            }
                                            H.n(z);
                                            H.k(dcdc.r(ajjeVar.c));
                                            H.l(ajjeVar.d);
                                            doep doepVar2 = ajjeVar.b;
                                            if (doepVar2 == null) {
                                                doepVar2 = doep.i;
                                            }
                                            doek doekVar = doepVar2.f;
                                            if (doekVar == null) {
                                                doekVar = doek.f;
                                            }
                                            H.e(ahviVar.a(doekVar));
                                            H.g(ajjeVar.e);
                                            H.h((ajjeVar.a & 8) != 0 ? ajjeVar.f : cqatVar.b());
                                            H.c(ajjeVar.j);
                                            H.i((ajjeVar.a & 256) != 0 ? dbsg.i(ajjeVar.i) : ahwn.I(ajjeVar.c));
                                            ahwn a4 = H.a();
                                            if (sortedMap.containsKey(a4.q())) {
                                                bvoo.h("Trying to reconstruct duplicate sharer from disk.", new Object[0]);
                                            } else if (a4.e() + aijp.f >= b2) {
                                                aikb aikbVar = aijpVar2.g;
                                                bvrj.UI_THREAD.c();
                                                aikc aikcVar = new aikc(a4, aikbVar.a, aikbVar.b, aikbVar.c);
                                                if (b2 - ajioVar3.f >= aijp.b) {
                                                    entry.getKey();
                                                    aikcVar.e();
                                                }
                                                if (a4.f() > b2 || b2 - a4.f() > aijpVar2.m.getLocationSharingParameters().t) {
                                                    aikcVar.d();
                                                }
                                                sortedMap.put(a4.q(), aikcVar);
                                            }
                                            it = it2;
                                        }
                                    }
                                    Iterator it3 = it;
                                    for (ajja ajjaVar3 : ajioVar3.c) {
                                        PersonId j3 = PersonId.j(ajjaVar3);
                                        if (j3 != null) {
                                            B.d.add(j3);
                                        }
                                    }
                                    for (ajis ajisVar : ajioVar3.d) {
                                        B.e.put(ajisVar.b, Long.valueOf(ajisVar.c));
                                    }
                                    B.f = ajioVar3.e;
                                    it = it3;
                                }
                                synchronized (aijpVar2.o) {
                                    aijpVar2.p.j(null);
                                }
                                aijpVar2.A();
                                aijpVar2.m();
                            }
                        });
                    }
                });
                synchronized (this.o) {
                    o = deha.o(this.p);
                }
                return o;
            }
        }
    }

    @Override // defpackage.aijc
    public final boolean b() {
        return a().isDone();
    }

    @Override // defpackage.aijc
    public final dcdc<ahwl> c(@dzsi btlu btluVar) {
        bvrj.UI_THREAD.c();
        dbsk.l(b());
        aijl B = B(btluVar);
        dccx dccxVar = new dccx();
        for (aikc aikcVar : B.a.values()) {
            dccxVar.g(aikcVar.g());
        }
        return dccxVar.f();
    }

    @Override // defpackage.aijc
    public final dcdc<ahwl> d(@dzsi btlu btluVar) {
        bvrj.UI_THREAD.c();
        dbsk.l(b());
        aijl B = B(btluVar);
        dccx dccxVar = new dccx();
        for (aikc aikcVar : B.a.values()) {
            if (!B.d.contains(aikcVar.f())) {
                dccxVar.g(aikcVar.g());
            }
        }
        return dccxVar.f();
    }

    @Override // defpackage.aijc
    @dzsi
    public final ahwl e(@dzsi btlu btluVar, PersonId personId) {
        bvrj.UI_THREAD.c();
        dbsk.l(b());
        aikc H = H(personId, btluVar);
        if (H == null) {
            return null;
        }
        return H.g();
    }

    @Override // defpackage.aijc
    public final Iterable<ahwl> f(@dzsi btlu btluVar, Iterable<PersonId> iterable) {
        bvrj.UI_THREAD.c();
        dbsk.l(b());
        return dcft.o(dcft.i(dcft.o(iterable, new aiji(this, btluVar)), new aijj()), new aijk());
    }

    @Override // defpackage.aijc
    public final void g(aijb aijbVar) {
        this.v.writeLock().lock();
        try {
            dbsk.l(this.u.add(aijbVar));
            this.v.writeLock().unlock();
            if (!b()) {
                return;
            }
            aijbVar.d();
        } catch (Throwable th) {
            this.v.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.aijc
    public final void h(aijb aijbVar) {
        this.v.writeLock().lock();
        try {
            this.u.remove(aijbVar);
        } finally {
            this.v.writeLock().unlock();
        }
    }

    @Override // defpackage.aijc
    public final boolean i(@dzsi btlu btluVar, PersonId personId) {
        bvrj.UI_THREAD.c();
        dbsk.l(b());
        return B(btluVar).d.contains(personId);
    }

    @Override // defpackage.aijc
    public final void j(@dzsi btlu btluVar, PersonId personId) {
        bvrj.UI_THREAD.c();
        dbsk.l(b());
        if (B(btluVar).d.remove(personId)) {
            A();
            m();
            return;
        }
        bvoo.h("Sharer already unhidden.", new Object[0]);
    }

    @Override // defpackage.aijc
    public final void k(btlu btluVar, PersonId personId, boolean z, boolean z2) {
        bvrj.UI_THREAD.c();
        dbsk.l(b());
        aikc aikcVar = B(btluVar).a.get(personId);
        boolean z3 = false;
        if (aikcVar == null) {
            bvoo.h("Unknown sharer for personId: %s", personId);
            return;
        }
        bvrj.UI_THREAD.c();
        if (!z || !z2) {
            z3 = true;
        }
        dbsk.l(z3);
        ahwm G = ahwn.G(aikcVar.c);
        G.b(z);
        G.f(z2 ? aikcVar.b.b() : 0L);
        aikcVar.c = G.a();
        A();
    }

    @Override // defpackage.aijc
    public final void l(String str, PrintWriter printWriter) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append("Model #");
        sb.append(hexString);
        printWriter.println(sb.toString());
        printWriter.print(String.valueOf(str).concat("  listeners=["));
        printWriter.print(TextUtils.join(",", dcft.o(this.u, aije.a)));
        printWriter.println("]");
        for (Map.Entry<btlu, aijl> entry : this.q.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(valueOf).length());
            sb2.append(str);
            sb2.append("  state for ");
            sb2.append(valueOf);
            sb2.append(":");
            printWriter.println(sb2.toString());
            aijl value = entry.getValue();
            boolean z = value.i;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 28);
            sb3.append(str);
            sb3.append("    loadingFromNetwork=");
            sb3.append(z);
            printWriter.println(sb3.toString());
            boolean z2 = value.h;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 19);
            sb4.append(str);
            sb4.append("    outOfDate=");
            sb4.append(z2);
            printWriter.println(sb4.toString());
            int i = value.f;
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 29);
            sb5.append(str);
            sb5.append("    unknownShares=");
            sb5.append(i);
            printWriter.println(sb5.toString());
            int size = value.j.size();
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 39);
            sb6.append(str);
            sb6.append("    pendingAclMutationCount=");
            sb6.append(size);
            printWriter.println(sb6.toString());
            String valueOf2 = String.valueOf(value.e);
            StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(valueOf2).length());
            sb7.append(str);
            sb7.append("    blockedUsers=");
            sb7.append(valueOf2);
            printWriter.println(sb7.toString());
            String join = TextUtils.join(",", dcft.o(value.d, aijf.a));
            StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(join).length());
            sb8.append(str);
            sb8.append("    hiddenUsers=[");
            sb8.append(join);
            sb8.append("]");
            printWriter.println(sb8.toString());
            long b2 = this.h.b();
            long e2 = this.h.e();
            long j = value.g;
            StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 42);
            sb9.append(str);
            sb9.append("    lastNetworkUpdate=");
            sb9.append(b2 - (e2 - j));
            printWriter.println(sb9.toString());
            printWriter.println(String.valueOf(str).concat("    sharers:"));
            for (Map.Entry<PersonId, aikc> entry2 : value.a.entrySet()) {
                String hexString2 = Integer.toHexString(System.identityHashCode(entry2.getKey()));
                StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(hexString2).length());
                sb10.append(str);
                sb10.append("      sharer for id #");
                sb10.append(hexString2);
                sb10.append(":");
                printWriter.println(sb10.toString());
                aikc value2 = entry2.getValue();
                String concat = String.valueOf(str).concat("        ");
                String hexString3 = Integer.toHexString(System.identityHashCode(value2));
                StringBuilder sb11 = new StringBuilder(String.valueOf(concat).length() + 8 + String.valueOf(hexString3).length());
                sb11.append(concat);
                sb11.append("Sharer #");
                sb11.append(hexString3);
                printWriter.println(sb11.toString());
                String hexString4 = Integer.toHexString(System.identityHashCode(value2.a));
                StringBuilder sb12 = new StringBuilder(String.valueOf(concat).length() + 6 + String.valueOf(hexString4).length());
                sb12.append(concat);
                sb12.append("  id=#");
                sb12.append(hexString4);
                printWriter.println(sb12.toString());
                value2.c.F(String.valueOf(concat).concat("  "), printWriter);
            }
            printWriter.println(String.valueOf(str).concat("      loggers:"));
            for (Map.Entry<PersonId, aikf> entry3 : value.b.entrySet()) {
                String hexString5 = Integer.toHexString(System.identityHashCode(entry3.getKey()));
                StringBuilder sb13 = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(hexString5).length());
                sb13.append(str);
                sb13.append("        logger for id #");
                sb13.append(hexString5);
                sb13.append(":");
                printWriter.println(sb13.toString());
                aikf value3 = entry3.getValue();
                String concat2 = String.valueOf(str).concat("          ");
                String hexString6 = Integer.toHexString(System.identityHashCode(value3));
                StringBuilder sb14 = new StringBuilder(String.valueOf(concat2).length() + 14 + String.valueOf(hexString6).length());
                sb14.append(concat2);
                sb14.append("SharerLogger #");
                sb14.append(hexString6);
                printWriter.println(sb14.toString());
                String hexString7 = Integer.toHexString(System.identityHashCode(value3.a));
                StringBuilder sb15 = new StringBuilder(String.valueOf(concat2).length() + 10 + String.valueOf(hexString7).length());
                sb15.append(concat2);
                sb15.append("  sharer=#");
                sb15.append(hexString7);
                printWriter.println(sb15.toString());
                boolean z3 = value3.h;
                StringBuilder sb16 = new StringBuilder(String.valueOf(concat2).length() + 31);
                sb16.append(concat2);
                sb16.append("  isAppEnteringForeground=");
                sb16.append(z3);
                printWriter.println(sb16.toString());
                boolean z4 = value3.g;
                StringBuilder sb17 = new StringBuilder(String.valueOf(concat2).length() + 23);
                sb17.append(concat2);
                sb17.append("  isAppStartingUp=");
                sb17.append(z4);
                printWriter.println(sb17.toString());
                long j2 = value3.f;
                StringBuilder sb18 = new StringBuilder(String.valueOf(concat2).length() + 52);
                sb18.append(concat2);
                sb18.append("  timeVedWasLastShownRelativeMs=");
                sb18.append(j2);
                printWriter.println(sb18.toString());
                String valueOf3 = String.valueOf(value3.e);
                StringBuilder sb19 = new StringBuilder(String.valueOf(concat2).length() + 16 + String.valueOf(valueOf3).length());
                sb19.append(concat2);
                sb19.append("  shownContexts=");
                sb19.append(valueOf3);
                printWriter.println(sb19.toString());
            }
        }
    }

    public final void m() {
        bvrj.UI_THREAD.c();
        if (this.s.f()) {
            return;
        }
        ajil bZ = ajim.b.bZ();
        for (btlu btluVar : this.q.keySet()) {
            if (!btluVar.r()) {
                ajip bZ2 = ajiq.d.bZ();
                String str = btluVar.o() ? "" : btluVar.d;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ajiq ajiqVar = (ajiq) bZ2.b;
                str.getClass();
                ajiqVar.a |= 1;
                ajiqVar.b = str;
                ajin bZ3 = ajio.h.bZ();
                aijl B = B(btluVar);
                long b2 = this.h.b() - (this.h.e() - B.g);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ajio ajioVar = (ajio) bZ3.b;
                ajioVar.a |= 2;
                ajioVar.f = b2;
                for (aikc aikcVar : B.a.values()) {
                    ajjf bZ4 = ajjg.d.bZ();
                    ajja i = aikcVar.f().i();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    ajjg ajjgVar = (ajjg) bZ4.b;
                    i.getClass();
                    ajjgVar.b = i;
                    ajjgVar.a |= 1;
                    ajje p = aikcVar.g().p();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    ajjg ajjgVar2 = (ajjg) bZ4.b;
                    p.getClass();
                    ajjgVar2.c = p;
                    ajjgVar2.a |= 2;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    ajio ajioVar2 = (ajio) bZ3.b;
                    ajjg bK = bZ4.bK();
                    bK.getClass();
                    dsrj<ajjg> dsrjVar = ajioVar2.b;
                    if (!dsrjVar.a()) {
                        ajioVar2.b = dsqw.cl(dsrjVar);
                    }
                    ajioVar2.b.add(bK);
                }
                for (PersonId personId : B.d) {
                    ajja i2 = personId.i();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    ajio ajioVar3 = (ajio) bZ3.b;
                    i2.getClass();
                    dsrj<ajja> dsrjVar2 = ajioVar3.c;
                    if (!dsrjVar2.a()) {
                        ajioVar3.c = dsqw.cl(dsrjVar2);
                    }
                    ajioVar3.c.add(i2);
                }
                for (Map.Entry<String, Long> entry : B.e.entrySet()) {
                    String key = entry.getKey();
                    long longValue = entry.getValue().longValue();
                    if (this.h.b() < longValue) {
                        ajir bZ5 = ajis.d.bZ();
                        if (bZ5.c) {
                            bZ5.bF();
                            bZ5.c = false;
                        }
                        ajis ajisVar = (ajis) bZ5.b;
                        key.getClass();
                        int i3 = ajisVar.a | 1;
                        ajisVar.a = i3;
                        ajisVar.b = key;
                        ajisVar.a = i3 | 2;
                        ajisVar.c = longValue;
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        ajio ajioVar4 = (ajio) bZ3.b;
                        ajis bK2 = bZ5.bK();
                        bK2.getClass();
                        dsrj<ajis> dsrjVar3 = ajioVar4.d;
                        if (!dsrjVar3.a()) {
                            ajioVar4.d = dsqw.cl(dsrjVar3);
                        }
                        ajioVar4.d.add(bK2);
                    }
                }
                int i4 = B.f;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ajio ajioVar5 = (ajio) bZ3.b;
                ajioVar5.a |= 1;
                ajioVar5.e = i4;
                aigs aigsVar = B.c;
                ajiv bZ6 = ajiw.b.bZ();
                for (aigr aigrVar : aigsVar.a.values()) {
                    ajit bZ7 = ajiu.g.bZ();
                    ajja i5 = aigrVar.a.i();
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    ajiu ajiuVar = (ajiu) bZ7.b;
                    i5.getClass();
                    ajiuVar.b = i5;
                    int i6 = ajiuVar.a | 1;
                    ajiuVar.a = i6;
                    boolean z = aigrVar.d;
                    int i7 = i6 | 2;
                    ajiuVar.a = i7;
                    ajiuVar.c = z;
                    boolean z2 = aigrVar.b;
                    int i8 = i7 | 4;
                    ajiuVar.a = i8;
                    ajiuVar.d = z2;
                    boolean z3 = aigrVar.c;
                    int i9 = i8 | 8;
                    ajiuVar.a = i9;
                    ajiuVar.e = z3;
                    float f2 = aigrVar.e;
                    ajiuVar.a = i9 | 16;
                    ajiuVar.f = f2;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    ajiw ajiwVar = (ajiw) bZ6.b;
                    ajiu bK3 = bZ7.bK();
                    bK3.getClass();
                    dsrj<ajiu> dsrjVar4 = ajiwVar.a;
                    if (!dsrjVar4.a()) {
                        ajiwVar.a = dsqw.cl(dsrjVar4);
                    }
                    ajiwVar.a.add(bK3);
                }
                ajiw bK4 = bZ6.bK();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ajio ajioVar6 = (ajio) bZ3.b;
                bK4.getClass();
                ajioVar6.g = bK4;
                ajioVar6.a |= 4;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ajiq ajiqVar2 = (ajiq) bZ2.b;
                ajio bK5 = bZ3.bK();
                bK5.getClass();
                ajiqVar2.c = bK5;
                ajiqVar2.a |= 2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ajim ajimVar = (ajim) bZ.b;
                ajiq bK6 = bZ2.bK();
                bK6.getClass();
                dsrj<ajiq> dsrjVar5 = ajimVar.a;
                if (!dsrjVar5.a()) {
                    ajimVar.a = dsqw.cl(dsrjVar5);
                }
                ajimVar.a.add(bK6);
            }
        }
        this.t.e(bZ.bK());
    }

    @Override // defpackage.aiki
    public final void n(dwdi dwdiVar, @dzsi btlu btluVar) {
        if (this.s.f()) {
            return;
        }
        F(dwdiVar, btluVar, true);
    }

    @Override // defpackage.aiki
    public final void o(@dzsi btlu btluVar, dqzv dqzvVar) {
        bvrj.UI_THREAD.c();
        dbsk.l(b());
        PersonId b2 = PersonId.b(dqzvVar);
        if (b2 == null) {
            bvoo.h("Invalid share acl.", new Object[0]);
            return;
        }
        SortedMap<PersonId, aikc> sortedMap = B(btluVar).a;
        aikc aikcVar = sortedMap.get(b2);
        if (aikcVar == null) {
            aikcVar = this.g.b(dcdc.f(dqzvVar));
            sortedMap.put(b2, aikcVar);
        }
        bvrj.UI_THREAD.c();
        ahwm G = ahwn.G(aikcVar.c);
        G.d(true);
        aikcVar.c = G.a();
        A();
        m();
    }

    @Override // defpackage.aiki
    public final void p(@dzsi btlu btluVar, PersonId personId) {
        bvrj.UI_THREAD.c();
        dbsk.l(b());
        aikc aikcVar = B(btluVar).a.get(personId);
        if (aikcVar == null) {
            return;
        }
        dbsk.l(aikcVar.g().i());
        bvrj.UI_THREAD.c();
        ahwm G = ahwn.G(aikcVar.c);
        G.g(aikcVar.b.b());
        G.d(false);
        aikcVar.c = G.a();
        A();
        m();
    }

    @Override // defpackage.aiki
    public final void q(@dzsi btlu btluVar) {
        aijl B = B(btlu.q(btluVar));
        dbsk.l(!B.i);
        B.i = true;
        if (b()) {
            A();
        }
    }

    @Override // defpackage.aiki
    public final void r(boolean z, @dzsi btlu btluVar) {
        aijl B = B(btluVar);
        dbsk.l(B.i);
        B.i = false;
        if (z) {
            B.g = this.h.e();
        } else {
            for (aikc aikcVar : B.a.values()) {
                doep b2 = aikcVar.g().b();
                if (b2.e) {
                    dsqp dsqpVar = (dsqp) b2.cu(5);
                    dsqpVar.bC(b2);
                    doeo doeoVar = (doeo) dsqpVar;
                    if (doeoVar.c) {
                        doeoVar.bF();
                        doeoVar.c = false;
                    }
                    doep doepVar = (doep) doeoVar.b;
                    doepVar.a |= 32;
                    doepVar.e = false;
                    aikcVar.a(doeoVar.bK());
                }
            }
        }
        if (b()) {
            A();
        }
    }

    @Override // defpackage.aiki
    public final void s(dqzv dqzvVar, @dzsi btlu btluVar) {
        bvrj.UI_THREAD.c();
        aijl B = B(btluVar);
        B.j.add(new aijn(this.h.e() + d, dqzvVar));
        if (b()) {
            F(B.k, btluVar, false);
        }
    }

    @Override // defpackage.aiki
    public final void t(Profile profile, dbsg<Boolean> dbsgVar, @dzsi btlu btluVar) {
        bvrj.UI_THREAD.c();
        dbsk.l(b());
        aikc H = H(profile.a(), btluVar);
        if (H == null) {
            aikb aikbVar = this.g;
            boolean booleanValue = dbsgVar.c(false).booleanValue();
            bvrj.UI_THREAD.c();
            long b2 = aikbVar.a.b();
            ahwm H2 = ahwn.H();
            H2.j(profile);
            H2.n(booleanValue);
            H2.h(b2);
            H2.c(b2);
            H2.l(false);
            B(btluVar).a.put(profile.a(), new aikc(H2.a(), aikbVar.a, aikbVar.b, aikbVar.c));
            return;
        }
        if (dbsgVar.a()) {
            H.c(dbsgVar.b().booleanValue());
        }
        if (!profile.e().a()) {
            return;
        }
        ahwk f2 = H.c.a().f();
        f2.c(dbsg.i(profile.e().b()));
        Profile a2 = f2.a();
        ahwm G = ahwn.G(H.c);
        G.j(a2);
        H.c = G.a();
    }

    @Override // defpackage.aiki
    public final void u(@dzsi btlu btluVar) {
        bvrj.UI_THREAD.c();
        B(btluVar).h = true;
        if (b()) {
            A();
        }
    }

    @Override // defpackage.aikh
    public final void v(@dzsi btlu btluVar, PersonId personId, aikg aikgVar) {
        bvrj.UI_THREAD.c();
        dbsk.l(b());
        dbsg<aikf> G = G(personId, btluVar);
        if (G.a()) {
            G.b().d(aikgVar);
        }
    }

    @Override // defpackage.aikh
    public final void w(@dzsi btlu btluVar, PersonId personId, aikg aikgVar) {
        bvrj.UI_THREAD.c();
        dbsk.l(b());
        dbsg<aikf> G = G(personId, btluVar);
        if (G.a()) {
            G.b().f(aikgVar);
        }
    }

    @Override // defpackage.aikh
    public final boolean x(@dzsi btlu btluVar, PersonId personId, aikg aikgVar) {
        throw null;
    }

    @Override // defpackage.aikh
    public final boolean y(@dzsi btlu btluVar, PersonId personId) {
        throw null;
    }

    @Override // defpackage.aikh
    public final dcdc<PersonId> z(@dzsi btlu btluVar) {
        throw null;
    }
}
