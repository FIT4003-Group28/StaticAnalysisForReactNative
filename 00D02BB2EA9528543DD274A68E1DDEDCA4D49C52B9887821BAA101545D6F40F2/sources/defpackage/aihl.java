package defpackage;

import defpackage.aihd;
import defpackage.aikz;
import defpackage.dssj;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: aihl  reason: default package */
/* loaded from: classes2.dex */
public final class aihl<M extends dssj, V extends aihd, T extends aikz> implements aihe<M, V> {
    public final ReentrantReadWriteLock c;
    public final Object d;
    public final ConcurrentHashMap<dbsg<String>, aihk<M>> e;
    public final ConcurrentHashMap<dbsg<String>, dcdc<V>> f;
    public final aihc<M, V, T> g;
    public final aihb<ailv, T> h;
    public final cqat i;
    public final ajsj j;
    @dzsi
    public Runnable k;
    private final aigz<T> m;
    private final bvrb n;
    private boolean o;
    private boolean p;
    public static final dcqe a = dcqe.c("aihl");
    private static final eaow l = eaow.d(5);
    public static final long b = TimeUnit.MINUTES.toMillis(10);

    public aihl(aihc<M, V, T> aihcVar, aigz<T> aigzVar, aihb<ailv, T> aihbVar, cqat cqatVar, ajsj ajsjVar, bvrb bvrbVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock;
        this.d = new Object();
        this.e = new ConcurrentHashMap<>();
        this.f = new ConcurrentHashMap<>();
        this.p = true;
        this.g = aihcVar;
        this.m = aigzVar;
        this.h = aihbVar;
        this.i = cqatVar;
        this.j = ajsjVar;
        this.n = bvrbVar;
        if (ajsjVar.f()) {
            return;
        }
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!this.o) {
                this.o = true;
                aihbVar.b(new dbsz(this) { // from class: aihf
                    private final aihl a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dbsz
                    public final void NU(Object obj) {
                        dbsg dbsgVar;
                        aihl aihlVar = this.a;
                        dcdn dcdnVar = (dcdn) obj;
                        aihlVar.c.writeLock().lock();
                        try {
                            dcpd it = dcdnVar.keySet().iterator();
                            while (it.hasNext()) {
                                dbsg<btlu> dbsgVar2 = (dbsg) it.next();
                                ailv ailvVar = (ailv) dcdnVar.get(dbsgVar2);
                                dbsk.s(ailvVar);
                                dbsg<String> f = aihl.f(dbsgVar2);
                                aihlVar.e(f, aihlVar.g.c(ailvVar.d));
                                int i = ailvVar.a;
                                int i2 = i & 1;
                                if (i2 != 0 && (i & 2) != 0) {
                                    boolean z = true;
                                    if (1 != i2) {
                                        z = false;
                                    }
                                    dbsk.l(z);
                                    try {
                                        dbsgVar = dbsg.i((dssj) aihlVar.g.a().l(ailvVar.b));
                                    } catch (dsrm unused) {
                                        bvoo.h("Failed to parse model state", new Object[0]);
                                        dbsgVar = dbpy.a;
                                    }
                                    if (dbsgVar.a() && aihlVar.d(aihk.c((dssj) dbsgVar.b(), new eapd(ailvVar.c)), f)) {
                                        aihlVar.g(dbsgVar2);
                                    }
                                }
                            }
                        } finally {
                            aihlVar.c.writeLock().unlock();
                        }
                    }
                });
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    public static dbsg<String> f(dbsg<btlu> dbsgVar) {
        return (!dbsgVar.a() || !dbsgVar.b().l()) ? dbpy.a : dbsgVar.h(aihj.a);
    }

    private final void h(dbsg<String> dbsgVar) {
        this.c.writeLock().lock();
        try {
            final aihk<M> aihkVar = this.e.get(dbsgVar);
            dcdc<V> dcdcVar = this.f.get(dbsgVar);
            if (aihkVar != null && dcdcVar != null) {
                this.f.put(dbsgVar, dcdc.w(aihh.a, this.g.b(dcdc.q(dcft.i(dcdcVar, new dbsl(aihkVar) { // from class: aihg
                    private final aihk a;

                    {
                        this.a = aihkVar;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        aihk aihkVar2 = this.a;
                        aihd aihdVar = (aihd) obj;
                        dcqe dcqeVar = aihl.a;
                        return aihdVar != null && aihdVar.d().e(aihdVar.e()).w(aihkVar2.b());
                    }
                })))));
            }
        } finally {
            this.c.writeLock().unlock();
        }
    }

    @Override // defpackage.aihe
    public final void a(V v, dbsg<btlu> dbsgVar) {
        if (this.j.f()) {
            return;
        }
        e(f(dbsgVar), dcdc.f(v));
        g(dbsgVar);
    }

    @Override // defpackage.aihe
    public final void b(M m, dbsg<btlu> dbsgVar) {
        if (this.j.f()) {
            return;
        }
        if (!d(aihk.c(m, new eapd(this.i.b())), f(dbsgVar))) {
            return;
        }
        g(dbsgVar);
    }

    @Override // defpackage.aihe
    public final dbsg<Long> c(dbsg<btlu> dbsgVar) {
        long b2 = this.i.b() - this.i.e();
        dbsg<String> f = f(dbsgVar);
        this.c.readLock().lock();
        try {
            aihk<M> aihkVar = this.e.get(f);
            Long valueOf = aihkVar != null ? Long.valueOf(Math.max(aihkVar.b().a - b2, 0L)) : null;
            this.c.readLock().unlock();
            return dbsg.j(valueOf);
        } catch (Throwable th) {
            this.c.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.aihk<M> r3, defpackage.dbsg<java.lang.String> r4) {
        /*
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.concurrent.ConcurrentHashMap<dbsg<java.lang.String>, aihk<M extends dssj>> r0 = r2.e     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L3a
            aihk r0 = (defpackage.aihk) r0     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L25
            r1 = r3
            aigg r1 = (defpackage.aigg) r1     // Catch: java.lang.Throwable -> L3a
            eapd r1 = r1.a     // Catch: java.lang.Throwable -> L3a
            eapd r0 = r0.b()     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r1.w(r0)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L23
            goto L25
        L23:
            r3 = 0
            goto L2b
        L25:
            java.util.concurrent.ConcurrentHashMap<dbsg<java.lang.String>, aihk<M extends dssj>> r0 = r2.e     // Catch: java.lang.Throwable -> L3a
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L3a
            r3 = 1
        L2b:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.unlock()
            if (r3 == 0) goto L39
            r2.h(r4)
        L39:
            return r3
        L3a:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r2.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()
            r4.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aihl.d(aihk, dbsg):boolean");
    }

    public final void e(dbsg<String> dbsgVar, List<V> list) {
        this.c.writeLock().lock();
        try {
            dcdc<V> dcdcVar = this.f.get(dbsgVar);
            dccx F = dcdc.F();
            if (dcdcVar != null) {
                F.i(dcdcVar);
            }
            F.i(list);
            this.f.put(dbsgVar, F.f());
            this.c.writeLock().unlock();
            h(dbsgVar);
        } catch (Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    public final void g(dbsg<btlu> dbsgVar) {
        dbsg<String> f = f(dbsgVar);
        this.c.writeLock().lock();
        try {
            aihk<M> aihkVar = this.e.get(f);
            if (aihkVar != null) {
                dcdc<V> dcdcVar = this.f.get(f);
                if (dcdcVar == null) {
                    dcdcVar = dcdc.e();
                }
                this.m.a(dbsgVar, this.g.e(dbsg.i(aihkVar.a()), dcdcVar));
            }
            synchronized (this.d) {
                if (this.k == null) {
                    Runnable runnable = new Runnable(this) { // from class: aihi
                        private final aihl a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            aihl aihlVar = this.a;
                            synchronized (aihlVar.d) {
                                aihlVar.k = null;
                            }
                            if (aihlVar.j.f()) {
                                return;
                            }
                            aihlVar.c.readLock().lock();
                            try {
                                dcdg p = dcdn.p();
                                dcpd it = dcep.L(dcbg.d(aihlVar.e.keySet(), aihlVar.f.keySet())).iterator();
                                while (it.hasNext()) {
                                    dbsg dbsgVar2 = (dbsg) it.next();
                                    dbsk.s(dbsgVar2);
                                    ailu bZ = ailv.e.bZ();
                                    aihk aihkVar2 = (aihk) aihlVar.e.get(dbsgVar2);
                                    if (aihkVar2 != null) {
                                        dspd bR = aihkVar2.a().bR();
                                        if (bZ.c) {
                                            bZ.bF();
                                            bZ.c = false;
                                        }
                                        ailv ailvVar = (ailv) bZ.b;
                                        bR.getClass();
                                        ailvVar.a |= 1;
                                        ailvVar.b = bR;
                                        long j = aihkVar2.b().a;
                                        if (bZ.c) {
                                            bZ.bF();
                                            bZ.c = false;
                                        }
                                        ailv ailvVar2 = (ailv) bZ.b;
                                        ailvVar2.a |= 2;
                                        ailvVar2.c = j;
                                    }
                                    dcdc dcdcVar2 = (dcdc) aihlVar.f.get(dbsgVar2);
                                    if (dcdcVar2 != null) {
                                        dcdc<dspd> d = aihlVar.g.d(dcdcVar2);
                                        if (bZ.c) {
                                            bZ.bF();
                                            bZ.c = false;
                                        }
                                        ailv ailvVar3 = (ailv) bZ.b;
                                        dsrj<dspd> dsrjVar = ailvVar3.d;
                                        if (!dsrjVar.a()) {
                                            ailvVar3.d = dsqw.cl(dsrjVar);
                                        }
                                        dsod.bv(d, ailvVar3.d);
                                    }
                                    p.f(dbsgVar2, bZ.bK());
                                }
                                aihlVar.h.c(p.b());
                            } finally {
                                aihlVar.c.readLock().unlock();
                            }
                        }
                    };
                    this.k = runnable;
                    this.n.a(runnable, bvrj.BACKGROUND_THREADPOOL, this.p ? 0L : l.b);
                    this.p = false;
                }
            }
        } finally {
            this.c.writeLock().unlock();
        }
    }
}
