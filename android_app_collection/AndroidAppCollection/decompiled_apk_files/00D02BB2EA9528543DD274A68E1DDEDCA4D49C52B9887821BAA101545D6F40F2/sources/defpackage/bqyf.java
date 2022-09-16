package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bqyf  reason: default package */
/* loaded from: classes4.dex */
public final class bqyf implements bqxt, bqyp {
    private final aluh B;
    public final dbty<awcd> a;
    public final dxio<awcb> b;
    public final btwr c;
    public final akrz f;
    public final cqat g;
    public final btrm h;
    public final bvrb i;
    private final dxio<avns> l;
    private final buwd m;
    private bqyn s;
    private final btmv t;
    private final ckcw u;
    private final bttf v;
    private final dehq w;
    private final dehq x;
    private final dzsj<akwu> y;
    private final Runnable z;
    private final dzjs<WeakReference<bqxy>> n = new dzjs<>();
    private final dzjs<WeakReference<bqxy>> o = new dzjs<>();
    public final Set<Integer> d = new HashSet();
    private int p = bqxu.Jd;
    public int e = bqxu.Jd;
    private final List<WeakReference<Runnable>> q = new ArrayList();
    private final Set<Integer> r = new HashSet();
    private long A = 0;
    public boolean j = false;
    public volatile int k = 0;

    public bqyf(dxio dxioVar, dbty dbtyVar, dxio dxioVar2, btwr btwrVar, buwd buwdVar, akrz akrzVar, btmv btmvVar, ckcw ckcwVar, dzsj dzsjVar, Runnable runnable, cqat cqatVar, bttf bttfVar, btrm btrmVar, bvrb bvrbVar, dehq dehqVar, dehq dehqVar2, aluh aluhVar) {
        this.b = dxioVar;
        this.a = dbtyVar;
        this.l = dxioVar2;
        this.c = btwrVar;
        this.m = buwdVar;
        this.f = akrzVar;
        this.t = btmvVar;
        this.u = ckcwVar;
        this.y = dzsjVar;
        this.z = runnable;
        this.g = cqatVar;
        this.v = bttfVar;
        this.h = btrmVar;
        this.i = bvrbVar;
        this.w = dehqVar;
        this.x = dehqVar2;
        this.B = aluhVar;
    }

    public static Set<Integer> h(final awck awckVar, final int i, final int i2) {
        Set<Integer> set = (Set) awckVar.Qu(new dbty(i, i2, awckVar) { // from class: bqya
            private final int a;
            private final int b;
            private final awck c;

            {
                this.a = i;
                this.b = i2;
                this.c = awckVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                int i3 = this.a;
                int i4 = this.b;
                awck awckVar2 = this.c;
                HashSet hashSet = null;
                for (int i5 = i3 - 1; i5 <= i3 + 1; i5++) {
                    for (int i6 = i4 - 1; i6 <= i4 + 1; i6++) {
                        List<Integer> m = decl.m(awckVar2.f(i5, i6));
                        if (hashSet == null) {
                            hashSet = new HashSet(m);
                        } else {
                            hashSet.retainAll(m);
                        }
                    }
                }
                dbsk.s(hashSet);
                return hashSet;
            }
        });
        return set == null ? new HashSet() : set;
    }

    private final bqxy l(int i, bqxo bqxoVar, amcl amclVar, bqyj bqyjVar) {
        amby ambyVar = new amby(akry.ROAD_GRAPH, amclVar, bqxoVar, null, this.x);
        alzu alzuVar = new alzu(!bqxoVar.c, i);
        dccx dccxVar = new dccx();
        dccxVar.g(alzuVar);
        bqxy bqxyVar = new bqxy(i, ambyVar, bqyjVar, bqxoVar, this, new alzn(this.w, this.m, new alzj(alzb.a(), new alzq(this.y, alyl.o), dccxVar.f(), btsp.c(this.v)), btys.f, this.u), alzuVar, this.f, this.u, this.y, this.z, this.g, this.i, this.w, this.x, this.B);
        this.t.a(bqxyVar, bqxyVar.h.name());
        return bqxyVar;
    }

    @Override // defpackage.bqxt
    public final synchronized bqxu a(int i) {
        bqxo bqytVar;
        WeakReference<bqxy> i2 = this.n.i(i);
        bqxy bqxyVar = i2 != null ? i2.get() : null;
        if (bqxyVar != null) {
            return bqxyVar;
        }
        bqyj bqyjVar = new bqyj(i);
        if (this.d.contains(Integer.valueOf(i))) {
            bqytVar = new bqxs(this.a.a(), bqyjVar, i, this.v.a(), this.u);
        } else {
            bqytVar = new bqyt(this.b.a(), bqyjVar, i, g(), this.f, this.v.a(), this.u);
        }
        bqxy l = l(i, bqytVar, bqyjVar, bqyjVar);
        this.n.a(i, new WeakReference<>(l));
        return l;
    }

    @Override // defpackage.bqxt, defpackage.bqyp
    public final synchronized int b() {
        return this.p;
    }

    @Override // defpackage.bqxt
    public final synchronized void c(Runnable runnable) {
        this.q.add(new WeakReference<>(runnable));
    }

    @Override // defpackage.bqxt
    public final void d(int i, boolean z) {
        List<Runnable> i2;
        synchronized (this) {
            if (z) {
                this.r.add(Integer.valueOf(i));
            } else {
                this.r.remove(Integer.valueOf(i));
            }
            i2 = i();
        }
        for (Runnable runnable : i2) {
            runnable.run();
        }
    }

    @Override // defpackage.bqyp
    public final bqyq e(int i) {
        WeakReference<bqxy> i2 = this.o.i(i);
        bqxy bqxyVar = i2 != null ? i2.get() : null;
        if (bqxyVar != null) {
            return bqxyVar;
        }
        bqxy l = l(i, new bqyv(this.b.a(), i, g(), this.f, this.v.a(), this.u), new bqyr(), null);
        this.o.a(i, new WeakReference<>(l));
        return l;
    }

    @Override // defpackage.bqyp
    public final synchronized void f(final avnm avnmVar) {
        dbsk.l(false);
        if (this.k > 0) {
            return;
        }
        this.k++;
        final dehn h = deha.h(this.l.a().a(avnmVar), 60L, TimeUnit.SECONDS, this.x);
        Runnable runnable = new Runnable(this, h, avnmVar) { // from class: bqxz
            private final bqyf a;
            private final dehn b;
            private final avnm c;

            {
                this.a = this;
                this.b = h;
                this.c = avnmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final bqyf bqyfVar = this.a;
                dehn dehnVar = this.b;
                final avnm avnmVar2 = this.c;
                synchronized (bqyfVar) {
                    bqyfVar.k--;
                }
                try {
                    avno avnoVar = (avno) deha.r(dehnVar);
                    for (avnq avnqVar : avnoVar.b) {
                        if (avnqVar.b == 0 && (avnqVar.a & 2) != 0) {
                            dmzb bZ = dmzh.e.bZ();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dmzh dmzhVar = (dmzh) bZ.b;
                            dmzhVar.b = 2;
                            dmzhVar.a |= 1;
                            dmzc bZ2 = dmzf.e.bZ();
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            dmzf dmzfVar = (dmzf) bZ2.b;
                            dmzfVar.b = 1;
                            dmzfVar.a |= 1;
                            dmzf dmzfVar2 = (dmzf) bZ2.b;
                            dmzfVar2.c = 1;
                            int i = dmzfVar2.a | 8;
                            dmzfVar2.a = i;
                            dspd dspdVar = avnqVar.c;
                            dspdVar.getClass();
                            dmzfVar2.a = i | 32;
                            dmzfVar2.d = dspdVar;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dmzh dmzhVar2 = (dmzh) bZ.b;
                            dmzf bK = bZ2.bK();
                            bK.getClass();
                            dmzhVar2.c = bK;
                            dmzhVar2.a = 2 | dmzhVar2.a;
                            dmzc bZ3 = dmzf.e.bZ();
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            dmzf dmzfVar3 = (dmzf) bZ3.b;
                            dmzfVar3.b = 1;
                            dmzfVar3.a |= 1;
                            dmzf dmzfVar4 = (dmzf) bZ3.b;
                            dmzfVar4.c = 1;
                            dmzfVar4.a |= 8;
                            dmzj dmzjVar = avnoVar.c;
                            if (dmzjVar == null) {
                                dmzjVar = dmzj.a;
                            }
                            dspd bR = dmzjVar.bR();
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            dmzf dmzfVar5 = (dmzf) bZ3.b;
                            bR.getClass();
                            dmzfVar5.a |= 32;
                            dmzfVar5.d = bR;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dmzh dmzhVar3 = (dmzh) bZ.b;
                            dmzf bK2 = bZ3.bK();
                            bK2.getClass();
                            dmzhVar3.d = bK2;
                            dmzhVar3.a |= 4;
                            final byte[] bS = bZ.bK().bS();
                            final awcb a = bqyfVar.b.a();
                            a.Qu(new dbty(bqyfVar, a, bS, avnmVar2) { // from class: bqyb
                                private final bqyf a;
                                private final awcb b;
                                private final byte[] c;
                                private final avnm d;

                                {
                                    this.a = bqyfVar;
                                    this.b = a;
                                    this.c = bS;
                                    this.d = avnmVar2;
                                }

                                @Override // defpackage.dbty
                                public final Object a() {
                                    bqyf bqyfVar2 = this.a;
                                    awcb awcbVar = this.b;
                                    byte[] bArr = this.c;
                                    int i2 = this.d.b;
                                    long g = bqyfVar2.f.g(akry.ROAD_GRAPH, bqyfVar2.g);
                                    awcbVar.a(bArr, i2, g == -1 ? Long.MAX_VALUE : g / 1000);
                                    return null;
                                }
                            });
                        }
                    }
                } catch (ExecutionException e) {
                    avnmVar2.c.size();
                    e.getMessage();
                }
            }
        };
        Executor g = this.i.g(bvrj.BACKGROUND_THREADPOOL);
        dbsk.s(g);
        h.Pk(runnable, g);
    }

    public final bqyn g() {
        if (this.s == null) {
            this.s = new bqyn(this.b.a(), this.i, this.g);
        }
        return this.s;
    }

    public final List<Runnable> i() {
        int i = this.e;
        int i2 = this.p;
        this.p = i;
        if (!this.r.contains(Integer.valueOf(i))) {
            this.A = 0L;
        } else if (!this.j) {
            this.j = true;
            this.i.a(new bqye(this), bvrj.BACKGROUND_THREADPOOL, this.A);
            long j = this.A;
            if (j == 0) {
                this.A = 100L;
            } else {
                this.A = j + j;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (i != i2) {
            Iterator<WeakReference<Runnable>> it = this.q.iterator();
            while (it.hasNext()) {
                Runnable runnable = it.next().get();
                if (runnable == null) {
                    it.remove();
                } else {
                    arrayList.add(runnable);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.bqyp
    public final long j() {
        return this.b.a().e();
    }

    @Override // defpackage.bqyp
    public final awcd k() {
        return this.a.a();
    }
}
