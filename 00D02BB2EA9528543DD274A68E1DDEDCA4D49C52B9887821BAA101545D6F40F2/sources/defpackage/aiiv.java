package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: aiiv  reason: default package */
/* loaded from: classes2.dex */
public final class aiiv implements ailf {
    public static final eaow a = eaow.a(30);
    public final ReentrantReadWriteLock b;
    public final Map<dbsg<String>, aimt> c;
    public final dxio<aigz<aile>> d;
    public final aihb<aimt, aile> e;
    public final dxio<Executor> f;
    public final dxio<btvo> g;
    public final dxio<cqat> h;
    public final ajsj i;
    public final dxio<akfa> j;
    public final dxio<aijz> k;
    public final deig<Void> l;
    public final CopyOnWriteArraySet<dehn<Void>> m;
    private final aiiu n;
    private final dxio<cjnx> o;
    private boolean p;

    public aiiv(dxio<aigz<aile>> dxioVar, aihb<aimt, aile> aihbVar, dxio<Executor> dxioVar2, dxio<btvo> dxioVar3, dxio<cqat> dxioVar4, btrm btrmVar, ajsj ajsjVar, dxio<akfa> dxioVar5, dxio<aijz> dxioVar6, dxio<cjnx> dxioVar7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.b = reentrantReadWriteLock;
        this.c = new HashMap();
        aiiu aiiuVar = new aiiu(this);
        this.n = aiiuVar;
        this.p = false;
        this.l = deig.d();
        this.m = new CopyOnWriteArraySet<>();
        this.d = dxioVar;
        this.e = aihbVar;
        this.f = dxioVar2;
        this.g = dxioVar3;
        this.h = dxioVar4;
        this.i = ajsjVar;
        this.j = dxioVar5;
        this.k = dxioVar6;
        this.o = dxioVar7;
        if (!ajsjVar.f()) {
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (!this.p) {
                    this.p = true;
                    aihbVar.b(new dbsz(this) { // from class: aiim
                        private final aiiv a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.dbsz
                        public final void NU(Object obj) {
                            aiiv aiivVar = this.a;
                            dcdn dcdnVar = (dcdn) obj;
                            aiivVar.b.writeLock().lock();
                            try {
                                dcpd it = dcdnVar.keySet().iterator();
                                while (it.hasNext()) {
                                    dbsg<btlu> dbsgVar = (dbsg) it.next();
                                    aimt aimtVar = (aimt) dcdnVar.get(dbsgVar);
                                    dbsk.s(aimtVar);
                                    aiivVar.c.put(aiiv.e(dbsgVar), aimtVar);
                                    aiivVar.d.a().a(dbsgVar, new aiil(aimtVar, dbpy.a));
                                }
                            } finally {
                                aiivVar.b.writeLock().unlock();
                                aiivVar.l.j(null);
                            }
                        }
                    });
                }
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                this.b.writeLock().unlock();
                throw th;
            }
        }
        dceq a2 = dcet.a();
        a2.b(btvr.class, new aiiw(0, btvr.class, aiiuVar, bvrj.UI_THREAD));
        a2.b(cjnw.class, new aiiw(1, cjnw.class, aiiuVar, bvrj.UI_THREAD));
        btrmVar.g(aiiuVar, a2.a());
    }

    public static dbsg<String> e(dbsg<btlu> dbsgVar) {
        return (!dbsgVar.a() || !dbsgVar.b().l()) ? dbpy.a : dbsgVar.h(aiir.a);
    }

    @Override // defpackage.ailf
    public final dehn<Void> a(dbsg<btlu> dbsgVar, dqzl dqzlVar) {
        return b(dbsgVar, dbsg.i(dqzlVar), dbpy.a, true, dbpy.a);
    }

    public final dehn<Void> b(final dbsg<btlu> dbsgVar, final dbsg<dqzl> dbsgVar2, final dbsg<aimr> dbsgVar3, final boolean z, final dbsg<dbsg<dehn<ajne>>> dbsgVar4) {
        dehn<cora> a2;
        if (this.i.f()) {
            return deha.c();
        }
        final deig d = deig.d();
        this.m.add(d);
        d.Pk(new Runnable(this, d) { // from class: aiio
            private final aiiv a;
            private final deig b;

            {
                this.a = this;
                this.b = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aiiv aiivVar = this.a;
                aiivVar.m.remove(this.b);
            }
        }, this.f.a());
        final dbsg<String> e = e(dbsgVar);
        if (dbsgVar.a()) {
            a2 = this.o.a().i(dbsgVar.b());
        } else {
            a2 = deha.a(null);
        }
        final dehn<cora> dehnVar = a2;
        deha.k(dehnVar, this.l).b(new Callable(this, e, dbsgVar2, dbsgVar3, z, dehnVar, dbsgVar, dbsgVar4, d) { // from class: aiip
            private final aiiv a;
            private final dbsg b;
            private final dbsg c;
            private final dbsg d;
            private final boolean e;
            private final dehn f;
            private final dbsg g;
            private final dbsg h;
            private final deig i;

            {
                this.a = this;
                this.b = e;
                this.c = dbsgVar2;
                this.d = dbsgVar3;
                this.e = z;
                this.f = dehnVar;
                this.g = dbsgVar;
                this.h = dbsgVar4;
                this.i = d;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                aimw aimwVar;
                dbsg<dehn<ajne>> f;
                final aiiv aiivVar = this.a;
                dbsg<String> dbsgVar5 = this.b;
                dbsg dbsgVar6 = this.c;
                dbsg dbsgVar7 = this.d;
                boolean z2 = this.e;
                dehn dehnVar2 = this.f;
                dbsg<btlu> dbsgVar8 = this.g;
                dbsg dbsgVar9 = this.h;
                deig deigVar = this.i;
                aiivVar.b.writeLock().lock();
                try {
                    aimt aimtVar = (aimt) dbsg.j(aiivVar.c.get(dbsgVar5)).c(aimt.f);
                    dsqp dsqpVar = (dsqp) aimtVar.cu(5);
                    dsqpVar.bC(aimtVar);
                    aims aimsVar = (aims) dsqpVar;
                    if (dbsgVar6.a()) {
                        long j = ((dqzl) dbsgVar6.b()).b;
                        dqzl dqzlVar = ((aimt) aimsVar.b).c;
                        if (dqzlVar == null) {
                            dqzlVar = dqzl.j;
                        }
                        if (j >= dqzlVar.b) {
                            dqzl dqzlVar2 = (dqzl) dbsgVar6.b();
                            aimsVar = aimsVar;
                            if (aimsVar.c) {
                                aimsVar.bF();
                                aimsVar.c = false;
                            }
                            aimt aimtVar2 = (aimt) aimsVar.b;
                            dqzlVar2.getClass();
                            aimtVar2.c = dqzlVar2;
                            aimtVar2.a |= 2;
                            long b = aiivVar.h.a().b();
                            if (aimsVar.c) {
                                aimsVar.bF();
                                aimsVar.c = false;
                            }
                            aimt aimtVar3 = (aimt) aimsVar.b;
                            aimtVar3.a |= 4;
                            aimtVar3.d = b;
                        } else {
                            aimsVar = aimsVar;
                        }
                    }
                    if (dbsgVar7.a()) {
                        aimr aimrVar = (aimr) dbsgVar7.b();
                        if (aimsVar.c) {
                            aimsVar.bF();
                            aimsVar.c = false;
                        }
                        aimt aimtVar4 = (aimt) aimsVar.b;
                        aimrVar.getClass();
                        aimtVar4.e = aimrVar;
                        aimtVar4.a |= 8;
                    }
                    aimu bZ = aimx.d.bZ();
                    aimt aimtVar5 = (aimt) aimsVar.b;
                    if ((aimtVar5.a & 1) != 0) {
                        aimx aimxVar = aimtVar5.b;
                        if (aimxVar == null) {
                            aimxVar = aimx.d;
                        }
                        aimwVar = aimxVar.b;
                        if (aimwVar == null) {
                            aimwVar = aimw.l;
                        }
                    } else {
                        aimwVar = aimw.l;
                    }
                    dqzl dqzlVar3 = ((aimt) aimsVar.b).c;
                    if (dqzlVar3 == null) {
                        dqzlVar3 = dqzl.j;
                    }
                    cora coraVar = (cora) deha.s(dehnVar2);
                    aimv bZ2 = aimw.l.bZ();
                    aims aimsVar2 = aimsVar;
                    long b2 = aiivVar.h.a().b();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    aimw aimwVar2 = (aimw) bZ2.b;
                    int i = aimwVar2.a | 1;
                    aimwVar2.a = i;
                    aimwVar2.b = b2;
                    boolean z3 = dqzlVar3.c;
                    int i2 = i | 2;
                    aimwVar2.a = i2;
                    aimwVar2.c = z3;
                    boolean z4 = dqzlVar3.h;
                    int i3 = i2 | 4;
                    aimwVar2.a = i3;
                    aimwVar2.d = z4;
                    boolean z5 = dqzlVar3.g;
                    aimwVar2.a = i3 | 8;
                    aimwVar2.e = z5;
                    if (aiivVar.d()) {
                        boolean z6 = dqzlVar3.d;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        aimw aimwVar3 = (aimw) bZ2.b;
                        int i4 = aimwVar3.a | 128;
                        aimwVar3.a = i4;
                        aimwVar3.i = z6;
                        boolean z7 = dqzlVar3.e;
                        int i5 = i4 | 256;
                        aimwVar3.a = i5;
                        aimwVar3.j = z7;
                        if (z2) {
                            aimwVar3.a = i5 | 512;
                            aimwVar3.k = true;
                        } else if ((aimwVar.a & 512) != 0) {
                            boolean z8 = aimwVar.k;
                            aimwVar3.a = i5 | 512;
                            aimwVar3.k = z8;
                        }
                    }
                    if (coraVar != null) {
                        boolean h = coraVar.h();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        aimw aimwVar4 = (aimw) bZ2.b;
                        aimwVar4.a |= 16;
                        aimwVar4.f = h;
                        boolean e2 = coraVar.e();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        aimw aimwVar5 = (aimw) bZ2.b;
                        aimwVar5.a |= 32;
                        aimwVar5.g = e2;
                        boolean f2 = coraVar.f();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        aimw aimwVar6 = (aimw) bZ2.b;
                        aimwVar6.a |= 64;
                        aimwVar6.h = f2;
                    }
                    aimw bK = bZ2.bK();
                    if (aiivVar.d() && (bK.a & 512) != 0 && !aiil.k(bK).isEmpty()) {
                        dsqp dsqpVar2 = (dsqp) bK.cu(5);
                        dsqpVar2.bC(bK);
                        aimv aimvVar = (aimv) dsqpVar2;
                        if (aimvVar.c) {
                            aimvVar.bF();
                            aimvVar.c = false;
                        }
                        aimw aimwVar7 = (aimw) aimvVar.b;
                        aimwVar7.a |= 512;
                        aimwVar7.k = false;
                        bK = aimvVar.bK();
                    }
                    dsqp dsqpVar3 = (dsqp) bK.cu(5);
                    dsqpVar3.bC(bK);
                    aimv aimvVar2 = (aimv) dsqpVar3;
                    if (aimvVar2.c) {
                        aimvVar2.bF();
                        aimvVar2.c = false;
                    }
                    aimw aimwVar8 = (aimw) aimvVar2.b;
                    aimwVar8.a &= -2;
                    aimwVar8.b = 0L;
                    aimw bK2 = aimvVar2.bK();
                    dsqp dsqpVar4 = (dsqp) aimwVar.cu(5);
                    dsqpVar4.bC(aimwVar);
                    aimv aimvVar3 = (aimv) dsqpVar4;
                    if (aimvVar3.c) {
                        aimvVar3.bF();
                        aimvVar3.c = false;
                    }
                    aimw aimwVar9 = (aimw) aimvVar3.b;
                    aimwVar9.a &= -2;
                    aimwVar9.b = 0L;
                    if (bK2.equals(aimvVar3.bK())) {
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        aimx aimxVar2 = (aimx) bZ.b;
                        aimwVar.getClass();
                        aimxVar2.b = aimwVar;
                        aimxVar2.a |= 1;
                    } else {
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        aimx aimxVar3 = (aimx) bZ.b;
                        bK.getClass();
                        aimxVar3.b = bK;
                        aimxVar3.a |= 1;
                        aimx aimxVar4 = (aimx) bZ.b;
                        aimwVar.getClass();
                        aimxVar4.b();
                        aimxVar4.c.add(aimwVar);
                    }
                    aimx aimxVar5 = ((aimt) aimsVar2.b).b;
                    if (aimxVar5 == null) {
                        aimxVar5 = aimx.d;
                    }
                    Iterable i6 = dcft.i(aimxVar5.c, new dbsl(aiivVar) { // from class: aiis
                        private final aiiv a;

                        {
                            this.a = aiivVar;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            return new eaow(((aimw) obj).b, this.a.h.a().b()).q(aiiv.a);
                        }
                    });
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    aimx aimxVar6 = (aimx) bZ.b;
                    aimxVar6.b();
                    dsod.bv(i6, aimxVar6.c);
                    if (aimsVar2.c) {
                        aimsVar2.bF();
                        aimsVar2.c = false;
                    }
                    aimt aimtVar6 = (aimt) aimsVar2.b;
                    aimx bK3 = bZ.bK();
                    bK3.getClass();
                    aimtVar6.b = bK3;
                    aimtVar6.a |= 1;
                    aiivVar.c.put(dbsgVar5, aimsVar2.bK());
                    aigz<aile> a3 = aiivVar.d.a();
                    aimt bK4 = aimsVar2.bK();
                    if (!dbsgVar9.a()) {
                        dbsg<aile> b3 = aiivVar.d.a().b(dbsgVar8);
                        f = b3.a() ? b3.b().f() : dbpy.a;
                    } else {
                        f = (dbsg) dbsgVar9.b();
                    }
                    a3.a(dbsgVar8, new aiil(bK4, f));
                    aiivVar.b.writeLock().unlock();
                    deigVar.j(null);
                    aiivVar.b.readLock().lock();
                    try {
                        dcdg p = dcdn.p();
                        dcpd it = dcep.K(aiivVar.c.keySet()).iterator();
                        while (it.hasNext()) {
                            dbsg dbsgVar10 = (dbsg) it.next();
                            dbsk.s(dbsgVar10);
                            aimt aimtVar7 = aiivVar.c.get(dbsgVar10);
                            dbsk.s(aimtVar7);
                            p.f(dbsgVar10, aimtVar7);
                        }
                        aiivVar.e.c(p.b());
                        aiivVar.b.readLock().unlock();
                        return new Object();
                    } catch (Throwable th) {
                        aiivVar.b.readLock().unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    aiivVar.b.writeLock().unlock();
                    throw th2;
                }
            }
        }, this.f.a());
        return d;
    }

    public final void c() {
        this.b.writeLock().lock();
        try {
            Set<dbsg<String>> keySet = this.c.keySet();
            this.b.writeLock().unlock();
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                final dbsg dbsgVar = (dbsg) it.next();
                this.f.a().execute(new Runnable(this, dbsgVar) { // from class: aiiq
                    private final aiiv a;
                    private final dbsg b;

                    {
                        this.a = this;
                        this.b = dbsgVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dbsg<btlu> dbsgVar2;
                        aiiv aiivVar = this.a;
                        dbsg dbsgVar3 = this.b;
                        if (aiivVar.i.f()) {
                            return;
                        }
                        if (dbsgVar3.a()) {
                            dbsgVar2 = dbsg.j(aiivVar.j.a().n((String) dbsgVar3.b()));
                        } else {
                            dbsgVar2 = dbpy.a;
                        }
                        if (dbsgVar2.a() != dbsgVar3.a()) {
                            return;
                        }
                        aimt aimtVar = (aimt) dbsg.j(aiivVar.c.get(dbsgVar3)).c(aimt.f);
                        dsqp dsqpVar = (dsqp) aimtVar.cu(5);
                        dsqpVar.bC(aimtVar);
                        dqzl dqzlVar = ((aimt) ((aims) dsqpVar).b).c;
                        if (dqzlVar == null) {
                            dqzlVar = dqzl.j;
                        }
                        aiivVar.b(dbsgVar2, dbsg.i(dqzlVar), dbpy.a, false, dbpy.a);
                    }
                });
            }
        } catch (Throwable th) {
            this.b.writeLock().unlock();
            throw th;
        }
    }

    public final boolean d() {
        return this.g.a().getLocationSharingParameters().b;
    }

    @Override // defpackage.ailf
    public final void f(dbsg<btlu> dbsgVar, dqzl dqzlVar) {
        b(dbsgVar, dbsg.i(dqzlVar), dbpy.a, false, dbpy.a);
    }

    @Override // defpackage.ailf
    public final void g(btlu btluVar, dbsg<dehn<ajne>> dbsgVar) {
        b(dbsg.i(btluVar), dbpy.a, dbpy.a, false, dbsg.i(dbsgVar));
    }
}
