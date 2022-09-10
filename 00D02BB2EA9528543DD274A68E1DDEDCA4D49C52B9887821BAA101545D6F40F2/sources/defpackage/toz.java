package defpackage;

import java.util.EnumSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: toz  reason: default package */
/* loaded from: classes7.dex */
public final class toz implements toh, toi {
    public final Executor a;
    public final tne b;
    private final ConcurrentHashMap<btlu, crzo<tog>> c = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<btlu, dehn<dbsg<tqu>>> d = new ConcurrentHashMap<>();
    private final tlz<tqu> e;

    public toz(final dxio<akfa> dxioVar, dxio<bvjj> dxioVar2, Executor executor, final Executor executor2, tlz<tqu> tlzVar) {
        this.a = executor2;
        this.e = tlzVar;
        this.b = new tne(new vxo(dxioVar2, dxioVar, null, dbpy.a), new ymo(dxioVar2, dxioVar, dbpy.a));
        executor.execute(new Runnable(this, dxioVar, executor2) { // from class: too
            private final toz a;
            private final dxio b;
            private final Executor c;

            {
                this.a = this;
                this.b = dxioVar;
                this.c = executor2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final toz tozVar = this.a;
                dxio dxioVar3 = this.b;
                ((akfa) dxioVar3.a()).C().a(new crzp(tozVar) { // from class: top
                    private final toz a;

                    {
                        this.a = tozVar;
                    }

                    @Override // defpackage.crzp
                    public final void On(crzm crzmVar) {
                        toz tozVar2 = this.a;
                        btlu btluVar = (btlu) crzmVar.l();
                        if (btluVar == null) {
                            btluVar = btlu.b;
                        }
                        tozVar2.e(btluVar);
                    }
                }, this.c);
                btlu j = ((akfa) dxioVar3.a()).j();
                if (j != null) {
                    tozVar.e(j);
                }
            }
        });
    }

    private final synchronized crzm<tog> g(btlu btluVar) {
        crzo<tog> crzoVar;
        this.c.putIfAbsent(btluVar, new crzo<>());
        crzoVar = this.c.get(btluVar);
        dbsk.s(crzoVar);
        return crzoVar.a;
    }

    @Override // defpackage.toh
    public final crzm<tog> a(btlu btluVar) {
        e(btluVar);
        return g(btluVar);
    }

    @Override // defpackage.toi
    public final void b(btlu btluVar, tog togVar) {
        dqvb dqvbVar;
        d(btluVar, togVar);
        tne tneVar = this.b;
        vxo vxoVar = tneVar.a;
        EnumSet<vux> noneOf = EnumSet.noneOf(vux.class);
        if (togVar.b().contains(tob.AVOID_TOLLS)) {
            noneOf.add(vux.AVOID_TOLLS);
        }
        if (togVar.b().contains(tob.AVOID_HIGHWAYS)) {
            noneOf.add(vux.AVOID_HIGHWAYS);
        }
        if (togVar.b().contains(tob.AVOID_FERRIES)) {
            noneOf.add(vux.AVOID_FERRIES);
        }
        vxoVar.e(btluVar, noneOf);
        ymn ymnVar = tneVar.b;
        yiv b = ymnVar.b(btluVar);
        yir bZ = yis.b.bZ();
        yis yisVar = b.b;
        if (yisVar == null) {
            yisVar = yis.b;
        }
        bZ.a(dcbg.b(yisVar.a).o(tnh.a).z());
        bZ.a(dcbg.b(togVar.c()).s(tni.a).z());
        yim bZ2 = yiv.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        yiv yivVar = (yiv) bZ2.b;
        yis bK = bZ.bK();
        bK.getClass();
        yivVar.b = bK;
        yivVar.a |= 1;
        yit bZ3 = yiu.c.bZ();
        if (togVar.b().contains(tob.WHEELCHAIR_ACCESSIBLE)) {
            dqvbVar = dqvb.TRANSIT_PREFER_ACCESSIBLE;
        } else {
            dqvbVar = dqvb.TRANSIT_BEST;
        }
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        yiu yiuVar = (yiu) bZ3.b;
        yiuVar.b = dqvbVar.f;
        yiuVar.a |= 1;
        yiu bK2 = bZ3.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        yiv yivVar2 = (yiv) bZ2.b;
        bK2.getClass();
        yivVar2.c = bK2;
        yivVar2.a |= 2;
        ymnVar.d(btluVar, bZ2.bK());
    }

    public final crzm<tog> c(btlu btluVar) {
        dehn<dbsg<tqu>> dehnVar;
        bvrj.UI_THREAD.d();
        synchronized (this) {
            if (!this.d.containsKey(btluVar)) {
                this.d.put(btluVar, this.e.a(btluVar));
            }
            dehnVar = this.d.get(btluVar);
        }
        dbsk.s(dehnVar);
        f(btluVar, (dbsg) deha.s(dehnVar));
        return g(btluVar);
    }

    public final synchronized void d(btlu btluVar, tog togVar) {
        this.c.putIfAbsent(btluVar, new crzo<>());
        crzo<tog> crzoVar = this.c.get(btluVar);
        dbsk.s(crzoVar);
        crzn<tog> crznVar = crzoVar.a;
        if (!crznVar.k() || togVar != crznVar.l()) {
            tlz<tqu> tlzVar = this.e;
            tqf bZ = tqu.g.bZ();
            tqm bZ2 = tqn.b.bZ();
            dcdc z = dcbg.b(togVar.a()).s(tow.a).z();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            tqn tqnVar = (tqn) bZ2.b;
            dsrj<tql> dsrjVar = tqnVar.a;
            if (!dsrjVar.a()) {
                tqnVar.a = dsqw.cl(dsrjVar);
            }
            dsod.bv(z, tqnVar.a);
            tqn bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            tqu tquVar = (tqu) bZ.b;
            bK.getClass();
            tquVar.b = bK;
            tquVar.a |= 1;
            tqq bZ3 = tqr.b.bZ();
            dcdc z2 = dcbg.b(togVar.b()).s(tox.a).z();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            tqr tqrVar = (tqr) bZ3.b;
            dsrj<tqp> dsrjVar2 = tqrVar.a;
            if (!dsrjVar2.a()) {
                tqrVar.a = dsqw.cl(dsrjVar2);
            }
            dsod.bv(z2, tqrVar.a);
            tqr bK2 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            tqu tquVar2 = (tqu) bZ.b;
            bK2.getClass();
            tquVar2.c = bK2;
            tquVar2.a |= 2;
            tqi bZ4 = tqj.b.bZ();
            dcdc z3 = dcbg.b(togVar.c()).s(toy.a).z();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            tqj tqjVar = (tqj) bZ4.b;
            dsrj<tnx> dsrjVar3 = tqjVar.a;
            if (!dsrjVar3.a()) {
                tqjVar.a = dsqw.cl(dsrjVar3);
            }
            dsod.bv(z3, tqjVar.a);
            tqj bK3 = bZ4.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            tqu tquVar3 = (tqu) bZ.b;
            bK3.getClass();
            tquVar3.d = bK3;
            tquVar3.a |= 4;
            tqg bZ5 = tqh.c.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            tqh tqhVar = (tqh) bZ5.b;
            tqhVar.a |= 1;
            tqhVar.b = true;
            tqh bK4 = bZ5.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            tqu tquVar4 = (tqu) bZ.b;
            bK4.getClass();
            tquVar4.f = bK4;
            tquVar4.a |= 16;
            tqs bZ6 = tqt.c.bZ();
            dqvb dqvbVar = dqvb.TRANSIT_BEST;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            tqt tqtVar = (tqt) bZ6.b;
            tqtVar.b = dqvbVar.f;
            tqtVar.a |= 1;
            tqt bK5 = bZ6.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            tqu tquVar5 = (tqu) bZ.b;
            bK5.getClass();
            tquVar5.e = bK5;
            tquVar5.a |= 8;
            tlzVar.b(btluVar, bZ.bK());
        }
        crzo<tog> crzoVar2 = this.c.get(btluVar);
        dbsk.s(crzoVar2);
        crzoVar2.b(togVar);
    }

    public final synchronized void e(final btlu btluVar) {
        if (!this.d.containsKey(btluVar)) {
            this.d.put(btluVar, this.e.a(btluVar));
        }
        final dehn<dbsg<tqu>> dehnVar = this.d.get(btluVar);
        dbsk.s(dehnVar);
        dehnVar.Pk(new Runnable(this, dehnVar, btluVar) { // from class: tor
            private final toz a;
            private final dehn b;
            private final btlu c;

            {
                this.a = this;
                this.b = dehnVar;
                this.c = btluVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.f(this.c, (dbsg) deha.s(this.b));
            }
        }, this.a);
    }

    public final synchronized void f(btlu btluVar, dbsg<tqu> dbsgVar) {
        tog a;
        this.c.putIfAbsent(btluVar, new crzo<>());
        crzo<tog> crzoVar = this.c.get(btluVar);
        dbsk.s(crzoVar);
        if (!crzoVar.a.k()) {
            if (dbsgVar.a()) {
                tqu b = dbsgVar.b();
                tof h = tog.h();
                tqn tqnVar = b.b;
                if (tqnVar == null) {
                    tqnVar = tqn.b;
                }
                h.e(dcbg.b(tqnVar.a).s(tos.a).B());
                tqr tqrVar = b.c;
                if (tqrVar == null) {
                    tqrVar = tqr.b;
                }
                h.f(dcbg.b(tqrVar.a).s(tot.a).B());
                tqj tqjVar = b.d;
                if (tqjVar == null) {
                    tqjVar = tqj.b;
                }
                h.g(dcbg.b(tqjVar.a).o(tou.a).s(tov.a).B());
                a = h.d();
            } else {
                a = this.b.a(btluVar);
            }
            crzoVar.b(a);
        }
    }
}
