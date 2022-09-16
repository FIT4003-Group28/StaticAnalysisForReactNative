package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: amit  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class amit implements anir {
    public final /* synthetic */ amjh a;
    private final /* synthetic */ int b;

    public /* synthetic */ amit(amjh amjhVar) {
        this.a = amjhVar;
    }

    public /* synthetic */ amit(amjh amjhVar, int i) {
        this.b = i;
        this.a = amjhVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.b == 0) {
            final amjh amjhVar = this.a;
            final Map map = (Map) obj;
            if (map.isEmpty()) {
                return anlz.q(Collections.emptySet());
            }
            final amjo amjoVar = amjhVar.d;
            final Set keySet = map.keySet();
            final ankt qp = amjoVar.c.qp(new Callable() { // from class: amjn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean z;
                    ReentrantReadWriteLock reentrantReadWriteLock;
                    amkh a;
                    amjo amjoVar2 = amjo.this;
                    Collection<amjv> collection = keySet;
                    amjoVar2.b.writeLock().lock();
                    try {
                        amkh amkhVar = amkh.a;
                        boolean z2 = false;
                        try {
                            a = amjoVar2.a();
                        } catch (IOException e) {
                            if (!amjoVar2.f(e)) {
                                ((amzw) ((amzw) ((amzw) amjo.a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$prepareForSync$3", (char) 195, "SyncManagerDataStore.java")).q("Error, could not read or clear store. Aborting sync attempt.");
                                z = false;
                                reentrantReadWriteLock = amjoVar2.b;
                            }
                        }
                        aopa createBuilder = amkh.a.createBuilder();
                        createBuilder.mergeFrom((aopi) a);
                        createBuilder.copyOnWrite();
                        ((amkh) createBuilder.instance).d = amkh.emptyProtobufList();
                        long c = amjoVar2.d.c();
                        HashSet hashSet = new HashSet();
                        for (amkg amkgVar : a.d) {
                            amkj amkjVar = amkgVar.c;
                            if (amkjVar == null) {
                                amkjVar = amkj.a;
                            }
                            if (collection.contains(amjv.a(amkjVar))) {
                                amkj amkjVar2 = amkgVar.c;
                                if (amkjVar2 == null) {
                                    amkjVar2 = amkj.a;
                                }
                                hashSet.add(amjv.a(amkjVar2));
                                aopa createBuilder2 = amkg.a.createBuilder();
                                createBuilder2.mergeFrom((aopi) amkgVar);
                                createBuilder2.copyOnWrite();
                                amkg amkgVar2 = (amkg) createBuilder2.instance;
                                amkgVar2.b |= 4;
                                amkgVar2.e = c;
                                createBuilder.I((amkg) createBuilder2.mo39build());
                            } else {
                                createBuilder.I(amkgVar);
                            }
                        }
                        for (amjv amjvVar : collection) {
                            if (!hashSet.contains(amjvVar)) {
                                aopa createBuilder3 = amkg.a.createBuilder();
                                amkj amkjVar3 = amjvVar.a;
                                createBuilder3.copyOnWrite();
                                amkg amkgVar3 = (amkg) createBuilder3.instance;
                                amkjVar3.getClass();
                                amkgVar3.c = amkjVar3;
                                amkgVar3.b |= 1;
                                long j = amjoVar2.f;
                                createBuilder3.copyOnWrite();
                                amkg amkgVar4 = (amkg) createBuilder3.instance;
                                amkgVar4.b |= 2;
                                amkgVar4.d = j;
                                createBuilder3.copyOnWrite();
                                amkg amkgVar5 = (amkg) createBuilder3.instance;
                                amkgVar5.b |= 4;
                                amkgVar5.e = c;
                                createBuilder3.copyOnWrite();
                                amkg amkgVar6 = (amkg) createBuilder3.instance;
                                amkgVar6.b |= 8;
                                amkgVar6.f = 0;
                                createBuilder.I((amkg) createBuilder3.mo39build());
                            }
                        }
                        if (a.c < 0) {
                            long j2 = amjoVar2.f;
                            if (j2 < 0) {
                                j2 = amjoVar2.d.c();
                                amjoVar2.f = j2;
                            }
                            createBuilder.copyOnWrite();
                            amkh amkhVar2 = (amkh) createBuilder.instance;
                            amkhVar2.b |= 1;
                            amkhVar2.c = j2;
                        }
                        try {
                            amjoVar2.e((amkh) createBuilder.mo39build());
                            amjoVar2.e.set(true);
                            z2 = true;
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            amjoVar2.e.set(true);
                            throw th;
                        }
                        z = Boolean.valueOf(z2);
                        reentrantReadWriteLock = amjoVar2.b;
                        reentrantReadWriteLock.writeLock().unlock();
                        return z;
                    } catch (Throwable th2) {
                        amjoVar2.b.writeLock().unlock();
                        throw th2;
                    }
                }
            });
            ankt g = amjhVar.g(qp);
            final Callable g2 = ammo.g(new Callable() { // from class: amiz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return amjh.this.c(qp, map);
                }
            });
            ankt w = antz.w(g, new aniq() { // from class: amjg
                @Override // defpackage.aniq
                public final ankt a() {
                    return (ankt) g2.call();
                }
            }, amjhVar.b);
            amee ameeVar = amjhVar.c;
            map.getClass();
            ankt v = antz.v(w, ammo.g(new Callable() { // from class: amjb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return map.keySet();
                }
            }), amjhVar.b);
            ameeVar.c(v);
            return v;
        }
        final amjh amjhVar2 = this.a;
        final long longValue = ((Long) obj).longValue();
        final afw afwVar = new afw();
        final afw afwVar2 = new afw();
        final long c = amjhVar2.a.c();
        return anii.i(anii.h(amjhVar2.g(amjhVar2.d.b()), ammo.a(new ampg() { // from class: amiy
            @Override // defpackage.ampg
            public final Object apply(Object obj2) {
                long j;
                long j2;
                amjh amjhVar3 = amjh.this;
                long j3 = longValue;
                long j4 = c;
                Map map2 = afwVar2;
                Map map3 = afwVar;
                Map map4 = (Map) obj2;
                synchronized (amjhVar3.h) {
                    synchronized (amjhVar3.g) {
                        for (Map.Entry entry : amjhVar3.g.entrySet()) {
                            amjv amjvVar = (amjv) entry.getKey();
                            if (!amjhVar3.h.containsKey(amjvVar)) {
                                long longValue2 = amjhVar3.i.containsKey(amjvVar) ? ((Long) amjhVar3.i.get(amjvVar)).longValue() : j3;
                                if (map4.containsKey(amjvVar)) {
                                    j2 = ((Long) map4.get(amjvVar)).longValue();
                                    j = j3;
                                } else {
                                    j = j3;
                                    j2 = j;
                                }
                                long max = Math.max(longValue2, j2);
                                amij a = ((amio) entry.getValue()).a();
                                if (a.a() + max <= j4) {
                                    Iterator it = a.c().entrySet().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Map.Entry entry2 = (Map.Entry) it.next();
                                            amik amikVar = (amik) entry2.getValue();
                                            long a2 = amikVar.a();
                                            long j5 = j4 - max;
                                            long a3 = amikVar.a() + a.a();
                                            if (a2 == -1 || j5 <= a3) {
                                                amil amilVar = (amil) entry2.getKey();
                                                if (!map2.containsKey(amilVar)) {
                                                    map2.put(amilVar, Boolean.valueOf(((amip) ((azqb) amjhVar3.e.get(amilVar)).get()).a()));
                                                }
                                                if (!((Boolean) map2.get(amilVar)).booleanValue()) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            SettableFuture f = SettableFuture.f();
                                            amjhVar3.h.put(amjvVar, f);
                                            map3.put(amjvVar, f);
                                            break;
                                        }
                                    }
                                }
                                j3 = j;
                            }
                        }
                    }
                }
                return map3;
            }
        }), amjhVar2.b), ammo.c(new amit(amjhVar2)), amjhVar2.b);
    }
}
