package defpackage;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.AutoValue_AccountId;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: amjh */
/* loaded from: classes.dex */
public final class amjh implements amkc {
    private static final amzy j = amzy.l("com/google/apps/tiktok/sync/impl/SyncManager");
    public final snc a;
    public final ankw b;
    public final amee c;
    public final amjo d;
    public final Map e;
    public final ankt f;
    private final Context k;
    private final ankx l;
    private final ampq m;
    private final amke o;
    public final afw g = new afw();
    public final Map h = new afw();
    public final Map i = new afw();
    private final AtomicReference n = new AtomicReference();

    public amjh(snc sncVar, Context context, ankw ankwVar, ankx ankxVar, amee ameeVar, ampq ampqVar, amjo amjoVar, Set set, Set set2, Map map, amke amkeVar) {
        this.a = sncVar;
        this.k = context;
        this.b = ankwVar;
        this.l = ankxVar;
        this.c = ameeVar;
        this.m = ampqVar;
        this.d = amjoVar;
        this.e = map;
        aqxo.z(set2.isEmpty(), "SyncletBindings cannot be bound outside of account scope without @ApplicationSynclet.");
        this.f = amjoVar.c();
        amzs it = ((amyg) set).iterator();
        while (it.hasNext()) {
            amio amioVar = (amio) it.next();
            afw afwVar = this.g;
            amim b = amioVar.b();
            aopa createBuilder = amkj.a.createBuilder();
            amki amkiVar = b.a;
            createBuilder.copyOnWrite();
            amkj amkjVar = (amkj) createBuilder.instance;
            amkiVar.getClass();
            amkjVar.c = amkiVar;
            amkjVar.b |= 1;
            afwVar.put(new amjv((amkj) createBuilder.mo39build()), amioVar);
        }
        this.o = amkeVar;
    }

    public static /* synthetic */ void i(ankt anktVar) {
        try {
            anlz.y(anktVar);
        } catch (CancellationException | ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((amzw) ((amzw) ((amzw) j.g()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManager", "lambda$onAccountsChanged$9", (char) 506, "SyncManager.java")).q("Timeout updating accounts in sync. Some accounts may not sync correctly.");
            } else {
                ((amzw) ((amzw) ((amzw) j.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManager", "lambda$onAccountsChanged$9", (char) 510, "SyncManager.java")).q("Updating sync accounts failed. Some accounts may not sync correctly.");
            }
        }
    }

    public static /* synthetic */ void k(ankt anktVar) {
        try {
            anlz.y(anktVar);
        } catch (CancellationException e) {
            ((amzw) ((amzw) ((amzw) j.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManager", "lambda$scheduleNextSync$14", (char) 590, "SyncManager.java")).q("The sync scheduling future was cancelled. This should never happen.");
        } catch (ExecutionException e2) {
            ((amzw) ((amzw) ((amzw) j.f()).h(e2)).i("com/google/apps/tiktok/sync/impl/SyncManager", "lambda$scheduleNextSync$14", (char) 588, "SyncManager.java")).q("Error scheduling next sync wakeup");
        }
    }

    private final ankt m() {
        return anii.h(((ambz) ((ampv) this.m).a).c(), ammo.a(amcf.f), this.b);
    }

    private final ankt n() {
        SettableFuture f = SettableFuture.f();
        if (this.n.compareAndSet(null, f)) {
            f.lV(anii.h(m(), ammo.a(new ampg() { // from class: amis
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    amjh.this.h((Set) obj);
                    return null;
                }
            }), this.b));
        }
        return anlz.r((ankt) this.n.get());
    }

    public final /* synthetic */ ankt a(SettableFuture settableFuture, amjv amjvVar) {
        boolean z = false;
        try {
            anlz.y(settableFuture);
            z = true;
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((amzw) ((amzw) ((amzw) j.g()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManager", "lambda$runSyncs$2", 278, "SyncManager.java")).s("Sync cancelled from timeout and will be retried later: %s", amjvVar.b.a());
            }
        }
        final long c = this.a.c();
        return antz.v(this.d.d(amjvVar, c, z), ammo.g(new Callable() { // from class: amix
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(c);
            }
        }), this.b);
    }

    public final /* synthetic */ ankt b(ankt anktVar, Long l) {
        final Set set;
        final amup j2;
        Set emptySet = Collections.emptySet();
        try {
            set = (Set) anlz.y(anktVar);
        } catch (CancellationException | ExecutionException e) {
            ((amzw) ((amzw) ((amzw) j.g()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManager", "lambda$scheduleNextSync$12", (char) 550, "SyncManager.java")).q("Unable to determine attempted syncs. They will not be used to schedule the next sync.");
            set = emptySet;
        }
        synchronized (this.g) {
            j2 = amup.j(this.g);
        }
        final long longValue = l.longValue();
        final amke amkeVar = this.o;
        final amjz amjzVar = amkeVar.b;
        return anii.i(anii.i(anii.h(amjzVar.b.b(), ammo.a(new ampg() { // from class: amjy
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v29, types: [ampq] */
            /* JADX WARN: Type inference failed for: r4v32, types: [ampq] */
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                long convert;
                long convert2;
                long longValue2;
                long j3;
                amij amijVar;
                long j4;
                amjz amjzVar2 = amjz.this;
                Map map = j2;
                Set set2 = set;
                long j5 = longValue;
                Map map2 = (Map) obj;
                ArrayList<amjx> arrayList = new ArrayList();
                long c = amjzVar2.a.c();
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    amjv amjvVar = (amjv) entry.getKey();
                    amij a = ((amio) entry.getValue()).a();
                    Long l2 = (Long) map2.get(amjvVar);
                    if (set2.contains(amjvVar)) {
                        longValue2 = c;
                    } else {
                        longValue2 = l2 == null ? j5 : l2.longValue();
                    }
                    amvl i = amvn.i();
                    amon amonVar = amon.a;
                    Iterator it2 = it;
                    Set set3 = set2;
                    long a2 = a.a() + longValue2;
                    for (amik amikVar : a.c().values()) {
                        long a3 = amikVar.a();
                        if (a3 != -1) {
                            j3 = j5;
                            long a4 = a3 + a.a() + longValue2;
                            if (c <= a4) {
                                if (!amonVar.h()) {
                                    amonVar = ampq.j(Long.valueOf(a4));
                                    amijVar = a;
                                    j4 = longValue2;
                                } else {
                                    amijVar = a;
                                    j4 = longValue2;
                                    amonVar = ampq.j(Long.valueOf(Math.min(((Long) amonVar.c()).longValue(), a4)));
                                }
                                i.c(amikVar.b());
                            } else {
                                amijVar = a;
                                j4 = longValue2;
                            }
                        } else {
                            j3 = j5;
                            amijVar = a;
                            j4 = longValue2;
                            i.c(amikVar.b());
                        }
                        a = amijVar;
                        j5 = j3;
                        longValue2 = j4;
                    }
                    long j6 = j5;
                    amjw a5 = amjx.a();
                    a5.a = a2;
                    a5.b = amonVar;
                    a5.b(i.g());
                    arrayList.add(a5.a());
                    it = it2;
                    set2 = set3;
                    j5 = j6;
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    amjx amjxVar = (amjx) arrayList.get(i2);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    if (vgu.a(amkb.a)) {
                        convert2 = timeUnit.convert(5L, TimeUnit.SECONDS);
                    } else {
                        convert2 = timeUnit.convert(15L, TimeUnit.MINUTES);
                    }
                    long j7 = amjxVar.b;
                    long j8 = convert2 + c;
                    if (j7 < j8) {
                        long max = Math.max(c, j7);
                        amjw a6 = amjx.a();
                        a6.b(amjxVar.a);
                        a6.a = j8;
                        if (amjxVar.c.h()) {
                            long j9 = j8 - max;
                            boolean z = true;
                            aqxo.y(j9 > 0);
                            if (j9 > convert2) {
                                z = false;
                            }
                            aqxo.y(z);
                            a6.b = ampq.j(Long.valueOf(((Long) amjxVar.c.c()).longValue() + j9));
                        }
                        arrayList.set(i2, a6.a());
                    }
                }
                long abs = Math.abs(((SecureRandom) amjzVar2.d.a.get()).nextLong());
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                if (vgu.a(amkb.a)) {
                    convert = timeUnit2.convert(5L, TimeUnit.SECONDS);
                } else {
                    convert = timeUnit2.convert(15L, TimeUnit.MINUTES);
                }
                long j10 = abs % convert;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    amjx amjxVar2 = (amjx) arrayList.get(i3);
                    amjw a7 = amjx.a();
                    a7.b(amjxVar2.a);
                    a7.a = amjxVar2.b + j10;
                    if (amjxVar2.c.h()) {
                        a7.b = ampq.j(Long.valueOf(((Long) amjxVar2.c.c()).longValue() + j10));
                    }
                    arrayList.set(i3, a7.a());
                }
                afw afwVar = new afw();
                for (amjx amjxVar3 : arrayList) {
                    Set set4 = amjxVar3.a;
                    amjx amjxVar4 = (amjx) afwVar.get(set4);
                    if (amjxVar4 == null) {
                        afwVar.put(set4, amjxVar3);
                    } else {
                        afwVar.put(set4, amjx.b(amjxVar4, amjxVar3));
                    }
                }
                ampq ampqVar = amon.a;
                for (amjx amjxVar5 : afwVar.values()) {
                    if (amjxVar5.c.h()) {
                        ampqVar = ampqVar.h() ? ampq.j(Long.valueOf(Math.min(((Long) ampqVar.c()).longValue(), ((Long) amjxVar5.c.c()).longValue()))) : amjxVar5.c;
                    }
                }
                if (ampqVar.h()) {
                    HashMap hashMap = new HashMap(afwVar);
                    amyg amygVar = amyg.a;
                    amjw a8 = amjx.a();
                    a8.a = ((Long) ampqVar.c()).longValue();
                    a8.b = ampqVar;
                    a8.b(amygVar);
                    amjx a9 = a8.a();
                    amjx amjxVar6 = (amjx) hashMap.get(amygVar);
                    if (amjxVar6 == null) {
                        hashMap.put(amygVar, a9);
                    } else {
                        hashMap.put(amygVar, amjx.b(amjxVar6, a9));
                    }
                    return Collections.unmodifiableMap(hashMap);
                }
                return afwVar;
            }
        }), amjzVar.c), ammo.c(new anir() { // from class: amkd
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                amke amkeVar2 = amke.this;
                Map map = (Map) obj;
                if (map.isEmpty()) {
                    return anlz.q(null);
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    amjx amjxVar = (amjx) entry.getValue();
                    amfr amfrVar = amkeVar2.a;
                    amfs amfsVar = new amfs((byte[]) null);
                    amfsVar.a = amkf.class;
                    amfsVar.b(bpu.a);
                    amfsVar.b = amft.a(0L, TimeUnit.SECONDS);
                    amfsVar.c(amyg.a);
                    amfsVar.c = bpd.a(new HashMap());
                    Set set2 = amjxVar.a;
                    StringBuilder sb = new StringBuilder("SyncTask");
                    Iterator it = new TreeSet(set2).iterator();
                    while (it.hasNext()) {
                        sb.append(((amil) it.next()).d);
                        sb.append('_');
                    }
                    amfsVar.d = ampq.j(new amfu(sb.toString()));
                    amfsVar.b = amft.a(Math.max(0L, amjxVar.b - amkeVar2.c.c()), TimeUnit.MILLISECONDS);
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    for (amil amilVar : amjxVar.a) {
                        boolean z4 = true;
                        z |= amilVar == amil.ON_CHARGER;
                        z3 |= amilVar == amil.ON_NETWORK_CONNECTED;
                        if (amilVar != amil.ON_NETWORK_UNMETERED) {
                            z4 = false;
                        }
                        z2 |= z4;
                    }
                    bpt bptVar = new bpt();
                    bptVar.a = z;
                    if (z2) {
                        bptVar.c = 3;
                    } else if (z3) {
                        bptVar.c = 2;
                    }
                    amfsVar.b(bptVar.a());
                    arrayList.add(amfrVar.a(amfsVar.a()));
                }
                return anlz.l(arrayList).a(anis.a, anjk.a);
            }
        }), amkeVar.d), ammo.c(new anir() { // from class: amiu
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                amjh amjhVar = amjh.this;
                amup amupVar = j2;
                Void r4 = (Void) obj;
                amjo amjoVar = amjhVar.d;
                return amjoVar.c.qo(new amjk(amjoVar, amupVar.keySet()));
            }
        }), anjk.a);
    }

    public final /* synthetic */ ankt c(ankt anktVar, final Map map) {
        Throwable th;
        boolean z;
        amlt amltVar;
        amio amioVar;
        try {
            z = ((Boolean) anlz.y(anktVar)).booleanValue();
            th = null;
        } catch (CancellationException | ExecutionException e) {
            th = e;
            z = false;
        }
        if (z) {
            aqxo.y(n().isDone());
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                final amjv amjvVar = (amjv) entry.getKey();
                final SettableFuture settableFuture = (SettableFuture) entry.getValue();
                StringBuilder sb = new StringBuilder("Synclet: ");
                sb.append(amjvVar.b.a());
                if (amjvVar.b()) {
                    sb.append(" ");
                    sb.append(((AutoValue_AccountId) amjvVar.c).a);
                }
                if (!amjvVar.b()) {
                    amltVar = amls.a;
                } else {
                    amlr b = amlt.b();
                    AccountId accountId = amjvVar.c;
                    if (((AutoValue_AccountId) accountId).a != -1) {
                        b.a(alzm.a, accountId);
                    }
                    amltVar = ((amlt) b).e();
                }
                amlp m = amna.m(sb.toString(), amltVar);
                try {
                    final ankt w = antz.w(settableFuture, ammo.b(new aniq() { // from class: amjf
                        @Override // defpackage.aniq
                        public final ankt a() {
                            return amjh.this.a(settableFuture, amjvVar);
                        }
                    }), this.b);
                    m.a(w);
                    w.qY(ammo.f(new Runnable() { // from class: amiw
                        @Override // java.lang.Runnable
                        public final void run() {
                            amjh.this.j(amjvVar, w);
                        }
                    }), this.b);
                    synchronized (this.g) {
                        amioVar = (amio) this.g.get(amjvVar);
                    }
                    if (amioVar != null) {
                        amin aminVar = (amin) amioVar.c().get();
                        aminVar.getClass();
                        settableFuture.lV(anlz.x(aminVar.a(), amioVar.a().b(), TimeUnit.MILLISECONDS, this.l));
                    } else {
                        settableFuture.cancel(true);
                    }
                    arrayList.add(w);
                    m.close();
                } catch (Throwable th2) {
                    try {
                        m.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
            return anlz.w(arrayList);
        }
        ((amzw) ((amzw) ((amzw) j.g()).h(th)).i("com/google/apps/tiktok/sync/impl/SyncManager", "lambda$sync$6", (char) 380, "SyncManager.java")).q("Failed preparing sync datastore for sync. Aborting sync attempt.");
        long c = this.a.c();
        ArrayList arrayList2 = new ArrayList(map.size());
        for (amjv amjvVar2 : map.keySet()) {
            arrayList2.add(this.d.d(amjvVar2, c, false));
        }
        return antz.v(anlz.n(arrayList2), ammo.g(new Callable() { // from class: amja
            @Override // java.util.concurrent.Callable
            public final Object call() {
                amjh amjhVar = amjh.this;
                Map map2 = map;
                synchronized (amjhVar.h) {
                    for (amjv amjvVar3 : map2.keySet()) {
                        amjhVar.h.remove(amjvVar3);
                    }
                }
                return null;
            }
        }), this.b);
    }

    public final ankt d() {
        aqxo.z(true, "onAccountsChanged called without an AccountManager bound");
        final ankt g = g(m());
        amjo amjoVar = this.d;
        final ankt qp = amjoVar.c.qp(ammo.g(new amjl(amjoVar, 1)));
        ankt b = anlz.m(g, qp).b(ammo.b(new aniq() { // from class: amjd
            @Override // defpackage.aniq
            public final ankt a() {
                amjh amjhVar = amjh.this;
                ankt anktVar = g;
                ankt anktVar2 = qp;
                Set set = (Set) anlz.y(anktVar);
                Set set2 = (Set) anlz.y(anktVar2);
                amys c = amyv.c(set, set2);
                amys c2 = amyv.c(set2, set);
                amjhVar.h(c);
                HashSet<amjv> hashSet = new HashSet();
                synchronized (amjhVar.g) {
                    for (amjv amjvVar : amjhVar.g.keySet()) {
                        if (c2.contains(amjvVar.c)) {
                            hashSet.add(amjvVar);
                        }
                    }
                    synchronized (amjhVar.h) {
                        for (amjv amjvVar2 : hashSet) {
                            ankt anktVar3 = (ankt) amjhVar.h.get(amjvVar2);
                            if (anktVar3 != null) {
                                anktVar3.cancel(true);
                            }
                        }
                    }
                    amjhVar.g.keySet().removeAll(hashSet);
                    amee ameeVar = amjhVar.c;
                    amjo amjoVar2 = amjhVar.d;
                    ankt qo = amjoVar2.c.qo(new amjk(amjoVar2, hashSet, 1));
                    ameeVar.c(qo);
                    amee.b(qo, "Error removing accounts from sync. IDs: %s", c2);
                }
                if (!c.isEmpty() || !c2.isEmpty()) {
                    ankt q = anlz.q(Collections.emptySet());
                    amjhVar.l(q);
                    return anii.h(q, akzj.e(), anjk.a);
                }
                return anlz.q(null);
            }
        }), this.b);
        this.n.set(b);
        ankt x = anlz.x(b, 10L, TimeUnit.SECONDS, this.l);
        anku c = anku.c(ammo.f(new amhz(x, 4)));
        x.qY(c, anjk.a);
        return c;
    }

    @Override // defpackage.amkc
    public final ankt e() {
        ankt q = anlz.q(Collections.emptySet());
        l(q);
        return q;
    }

    @Override // defpackage.amkc
    public final ankt f() {
        final long c = this.a.c();
        final amjo amjoVar = this.d;
        return antz.w(amjoVar.c.qp(new Callable() { // from class: amjm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                amjo amjoVar2 = amjo.this;
                long j2 = c;
                amkh amkhVar = amkh.a;
                amjoVar2.b.writeLock().lock();
                try {
                    try {
                        amkhVar = amjoVar2.a();
                    } catch (IOException e) {
                        amqs.a(e);
                    }
                    aopa createBuilder = amkh.a.createBuilder();
                    createBuilder.mergeFrom((aopi) amkhVar);
                    createBuilder.copyOnWrite();
                    amkh amkhVar2 = (amkh) createBuilder.instance;
                    amkhVar2.b |= 2;
                    amkhVar2.e = j2;
                    try {
                        amjoVar2.e((amkh) createBuilder.mo39build());
                    } catch (IOException e2) {
                        ((amzw) ((amzw) ((amzw) amjo.a.g()).h(e2)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$getLastWakeupAndSetNewWakeup$7", (char) 457, "SyncManagerDataStore.java")).q("Error writing sync data file. Cannot update last wakeup.");
                    }
                    amjoVar2.b.writeLock().unlock();
                    int i = amkhVar.b;
                    if ((i & 2) != 0) {
                        return Long.valueOf(amkhVar.e);
                    }
                    if ((i & 1) != 0) {
                        return Long.valueOf(amkhVar.c);
                    }
                    return -1L;
                } catch (Throwable th) {
                    amjoVar2.b.writeLock().unlock();
                    throw th;
                }
            }
        }), ammo.b(new aniq() { // from class: amjc
            @Override // defpackage.aniq
            public final ankt a() {
                amjh amjhVar = amjh.this;
                ankt i = anii.i(amjhVar.f, ammo.c(new amit(amjhVar, 1)), amjhVar.b);
                amjhVar.l(i);
                return i;
            }
        }), this.b);
    }

    public final ankt g(ankt anktVar) {
        return anii.i(n(), new aefs(anktVar, 3), anjk.a);
    }

    public final void h(Set set) {
        synchronized (this.g) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AccountId accountId = (AccountId) it.next();
                try {
                    amzs it2 = ((amyg) ((amjp) amjp.class.cast(((amgp) antz.u(this.k.getApplicationContext(), amgp.class)).gm().a(accountId))).a()).iterator();
                    while (it2.hasNext()) {
                        amio amioVar = (amio) it2.next();
                        amim b = amioVar.b();
                        int a = accountId.a();
                        aopa createBuilder = amkj.a.createBuilder();
                        amki amkiVar = b.a;
                        createBuilder.copyOnWrite();
                        amkj amkjVar = (amkj) createBuilder.instance;
                        amkiVar.getClass();
                        amkjVar.c = amkiVar;
                        amkjVar.b |= 1;
                        createBuilder.copyOnWrite();
                        amkj amkjVar2 = (amkj) createBuilder.instance;
                        amkjVar2.b |= 2;
                        amkjVar2.d = a;
                        this.g.put(new amjv((amkj) createBuilder.mo39build()), amioVar);
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonAccountEntryPoint?", e);
                }
            }
        }
    }

    public final /* synthetic */ void j(amjv amjvVar, ankt anktVar) {
        synchronized (this.h) {
            this.h.remove(amjvVar);
            try {
                this.i.put(amjvVar, (Long) anlz.y(anktVar));
            } catch (CancellationException | ExecutionException unused) {
            }
        }
    }

    public final void l(final ankt anktVar) {
        ankt r = anlz.r(anii.i(this.f, ammo.c(new anir() { // from class: amiv
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                final amjh amjhVar = amjh.this;
                final ankt anktVar2 = anktVar;
                final Long l = (Long) obj;
                return antz.w(amjhVar.g(anktVar2), ammo.b(new aniq() { // from class: amje
                    @Override // defpackage.aniq
                    public final ankt a() {
                        return amjh.this.b(anktVar2, l);
                    }
                }), amjhVar.b);
            }
        }), this.b));
        this.c.c(r);
        r.qY(new amhz(r, 5), this.b);
    }
}
