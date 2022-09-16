package defpackage;

import android.app.Application;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahmb  reason: default package */
/* loaded from: classes.dex */
public final class ahmb implements ahkm {
    private volatile dzsj<bvjj> A;
    private volatile dzsj<bttf> B;
    private volatile dzsj<ckoq> C;
    private volatile dzsj<ahly> D;
    private volatile dzsj<ahkv> G;
    public final iqz a;
    public final ahkn b;
    public volatile buqb f;
    public volatile buqh g;
    private volatile dzsj<btpa> h;
    private volatile dzsj<ahng> i;
    private volatile dzsj<ahmf> j;
    private volatile dzsj<ahmj> k;
    private volatile dzsj<ckcw> l;
    private volatile dzsj<akfa> m;
    private volatile dzsj<Context> o;
    private volatile dzsj<btvo> p;
    private volatile dzsj<bqyp> q;
    private volatile dzsj<bwsa> r;
    private volatile dzsj<btrm> s;
    private volatile dzsj<cqat> t;
    private volatile dzsj<bvrb> u;
    private volatile dzsj<dehq> v;
    private volatile dzsj<cjqy> w;
    private volatile dzsj<btze> x;
    private volatile dzsj<buqb> y;
    private volatile dzsj<buqh> z;
    public volatile Object c = new dxjf();
    public volatile Object d = new dxjf();
    public volatile Object e = new dxjf();
    private volatile Object n = new dxjf();
    private volatile Object E = new dxjf();
    private volatile Object F = new dxjf();

    public ahmb(iqz iqzVar, ahkn ahknVar) {
        this.a = iqzVar;
        this.b = ahknVar;
    }

    private final dzsj<ckcw> g() {
        dzsj<ckcw> dzsjVar = this.l;
        if (dzsjVar == null) {
            ahma ahmaVar = new ahma(this, 4);
            this.l = ahmaVar;
            return ahmaVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.ahkm
    public final ahkg a() {
        Object obj;
        Object obj2 = this.F;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.F;
                if (obj instanceof dxjf) {
                    Context b = this.a.b();
                    dxjg.e(b);
                    cqat rR = this.a.rR();
                    dxjg.e(rR);
                    bvrb tn = this.a.tn();
                    dxjg.e(tn);
                    ahkv f = f();
                    btrm rz = this.a.rz();
                    dxjg.e(rz);
                    duwy sm = this.a.sm();
                    dxjg.e(sm);
                    dehq tf = this.a.tf();
                    dxjg.e(tf);
                    Executor sV = this.a.sV();
                    dxjg.e(sV);
                    obj = new ahre(b, rR, tn, f, rz, sm, tf, sV);
                    dxjc.d(this.F, obj);
                    this.F = obj;
                }
            }
            obj2 = obj;
        }
        return (ahre) obj2;
    }

    @Override // defpackage.ahkm
    public final Runnable b() {
        final dzsj dzsjVar = this.G;
        if (dzsjVar == null) {
            dzsjVar = new ahma(this, 22);
            this.G = dzsjVar;
        }
        return new Runnable(dzsjVar) { // from class: ahmc
            private final dzsj a;

            {
                this.a = dzsjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ((ahjq) this.a.a()).m();
            }
        };
    }

    @Override // defpackage.ahkm
    public final ahjw c() {
        return d();
    }

    public final ahly d() {
        Object obj;
        Object obj2 = this.n;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.n;
                if (obj instanceof dxjf) {
                    Application a = this.a.a();
                    dxjg.e(a);
                    btvo rp = this.a.rp();
                    dxjg.e(rp);
                    cjqy tr = this.a.tr();
                    dxjg.e(tr);
                    dzsj dzsjVar = this.m;
                    if (dzsjVar == null) {
                        dzsjVar = new ahma(this, 5);
                        this.m = dzsjVar;
                    }
                    dxio c = dxjc.c(dzsjVar);
                    cqat rR = this.a.rR();
                    dxjg.e(rR);
                    obj = new ahly(a, rp, tr, c, rR);
                    dxjc.d(this.n, obj);
                    this.n = obj;
                }
            }
            obj2 = obj;
        }
        return (ahly) obj2;
    }

    public final dzsj<btze> e() {
        dzsj<btze> dzsjVar = this.x;
        if (dzsjVar == null) {
            ahma ahmaVar = new ahma(this, 16);
            this.x = ahmaVar;
            return ahmaVar;
        }
        return dzsjVar;
    }

    public final ahkv f() {
        ahkv ahkvVar;
        LocationManager locationManager;
        Object obj = this.E;
        if (obj instanceof dxjf) {
            synchronized (obj) {
                Object obj2 = this.E;
                boolean z = obj2 instanceof dxjf;
                ahkvVar = obj2;
                if (z) {
                    Context b = this.a.b();
                    dxjg.e(b);
                    bvrb tn = this.a.tn();
                    dxjg.e(tn);
                    btrm rz = this.a.rz();
                    dxjg.e(rz);
                    dzsj dzsjVar = this.h;
                    if (dzsjVar == null) {
                        dzsjVar = new ahma(this, 0);
                        this.h = dzsjVar;
                    }
                    dxio c = dxjc.c(dzsjVar);
                    bvjj rB = this.a.rB();
                    dxjg.e(rB);
                    Context b2 = this.a.b();
                    dxjg.e(b2);
                    axrg b3 = axrh.b(b2);
                    cqat rR = this.a.rR();
                    dxjg.e(rR);
                    dzsj dzsjVar2 = this.i;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new ahma(this, 1);
                        this.i = dzsjVar2;
                    }
                    dxio c2 = dxjc.c(dzsjVar2);
                    dzsj dzsjVar3 = this.j;
                    if (dzsjVar3 == null) {
                        dzsjVar3 = new ahma(this, 2);
                        this.j = dzsjVar3;
                    }
                    dxio c3 = dxjc.c(dzsjVar3);
                    dzsj dzsjVar4 = this.k;
                    if (dzsjVar4 == null) {
                        dzsjVar4 = new ahma(this, 3);
                        this.k = dzsjVar4;
                    }
                    final ahkv ahkvVar2 = new ahkv(b, tn, rz, c, rB, b3, rR, c2, c3, dxjc.c(dzsjVar4), dxjc.c(g()), d());
                    dzsj dzsjVar5 = this.o;
                    if (dzsjVar5 == null) {
                        dzsjVar5 = new ahma(this, 6);
                        this.o = dzsjVar5;
                    }
                    dzsj dzsjVar6 = dzsjVar5;
                    dzsj dzsjVar7 = this.p;
                    if (dzsjVar7 == null) {
                        dzsjVar7 = new ahma(this, 7);
                        this.p = dzsjVar7;
                    }
                    dzsj dzsjVar8 = dzsjVar7;
                    dzsj dzsjVar9 = this.q;
                    if (dzsjVar9 == null) {
                        dzsjVar9 = new ahma(this, 8);
                        this.q = dzsjVar9;
                    }
                    dzsj dzsjVar10 = dzsjVar9;
                    dzsj dzsjVar11 = this.r;
                    if (dzsjVar11 == null) {
                        dzsjVar11 = new ahma(this, 9);
                        this.r = dzsjVar11;
                    }
                    dzsj dzsjVar12 = dzsjVar11;
                    dzsj dzsjVar13 = this.s;
                    if (dzsjVar13 == null) {
                        dzsjVar13 = new ahma(this, 10);
                        this.s = dzsjVar13;
                    }
                    dzsj dzsjVar14 = dzsjVar13;
                    dzsj dzsjVar15 = this.t;
                    if (dzsjVar15 == null) {
                        dzsjVar15 = new ahma(this, 11);
                        this.t = dzsjVar15;
                    }
                    dzsj dzsjVar16 = dzsjVar15;
                    dzsj dzsjVar17 = this.u;
                    if (dzsjVar17 == null) {
                        dzsjVar17 = new ahma(this, 12);
                        this.u = dzsjVar17;
                    }
                    dzsj dzsjVar18 = dzsjVar17;
                    dzsj dzsjVar19 = this.v;
                    if (dzsjVar19 == null) {
                        dzsjVar19 = new ahma(this, 13);
                        this.v = dzsjVar19;
                    }
                    dzsj dzsjVar20 = dzsjVar19;
                    dzsj<ckcw> g = g();
                    dzsj dzsjVar21 = this.w;
                    if (dzsjVar21 == null) {
                        dzsjVar21 = new ahma(this, 14);
                        this.w = dzsjVar21;
                    }
                    dzsj dzsjVar22 = dzsjVar21;
                    dzsj dzsjVar23 = this.y;
                    if (dzsjVar23 == null) {
                        dzsjVar23 = new ahma(this, 15);
                        this.y = dzsjVar23;
                    }
                    dzsj dzsjVar24 = dzsjVar23;
                    dzsj dzsjVar25 = this.z;
                    if (dzsjVar25 == null) {
                        dzsjVar25 = new ahma(this, 17);
                        this.z = dzsjVar25;
                    }
                    dzsj dzsjVar26 = dzsjVar25;
                    dzsj dzsjVar27 = this.A;
                    if (dzsjVar27 == null) {
                        dzsjVar27 = new ahma(this, 18);
                        this.A = dzsjVar27;
                    }
                    dzsj dzsjVar28 = dzsjVar27;
                    dzsj dzsjVar29 = this.B;
                    if (dzsjVar29 == null) {
                        dzsjVar29 = new ahma(this, 19);
                        this.B = dzsjVar29;
                    }
                    dzsj dzsjVar30 = dzsjVar29;
                    dzsj dzsjVar31 = this.C;
                    if (dzsjVar31 == null) {
                        dzsjVar31 = new ahma(this, 20);
                        this.C = dzsjVar31;
                    }
                    dzsj dzsjVar32 = dzsjVar31;
                    dzsj dzsjVar33 = this.D;
                    if (dzsjVar33 == null) {
                        dzsjVar33 = new ahma(this, 21);
                        this.D = dzsjVar33;
                    }
                    ahot ahotVar = new ahot(dzsjVar6, dzsjVar8, dzsjVar10, dzsjVar12, dzsjVar14, dzsjVar16, dzsjVar18, dzsjVar20, g, dzsjVar22, dzsjVar24, dzsjVar26, dzsjVar28, dzsjVar30, dzsjVar32, dzsjVar33);
                    btpc sz = this.a.sz();
                    dxjg.e(sz);
                    bvkx o = this.a.o();
                    dxjg.e(o);
                    final Location location = null;
                    if (!ahnz.a(ahkvVar2.a) && (locationManager = (LocationManager) ahkvVar2.a.getSystemService("location")) != null) {
                        try {
                            Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            Location lastKnownLocation2 = locationManager.getLastKnownLocation("network");
                            location = (lastKnownLocation == null || (lastKnownLocation2 != null && lastKnownLocation.getTime() <= lastKnownLocation2.getTime())) ? lastKnownLocation2 : lastKnownLocation;
                            if (location != null) {
                                amvs amvsVar = new amvs();
                                amvsVar.j(location);
                                ahkvVar2.E = amvsVar.d();
                                if (lastKnownLocation != null) {
                                    ahkvVar2.F.a = ahjs.ENABLED;
                                }
                                if (lastKnownLocation2 != null) {
                                    ahkvVar2.F.b = ahjs.ENABLED;
                                }
                            }
                        } catch (SecurityException | Exception unused) {
                        }
                    }
                    if (ahkvVar2.E != null) {
                        GmmLocation gmmLocation = ahkvVar2.E;
                        ahkvVar2.b.b(new Runnable(ahkvVar2, location) { // from class: ahkp
                            private final ahkv a;
                            private final Location b;

                            {
                                this.a = ahkvVar2;
                                this.b = location;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ahkv ahkvVar3 = this.a;
                                Location location2 = this.b;
                                if (location2 != null) {
                                    ahkvVar3.c.b(AndroidLocationEvent.fromLocation(location2));
                                }
                                ahkvVar3.c.b(new amqo(ahkvVar3.E));
                                ahkvVar3.h.a();
                            }
                        }, bvrj.BACKGROUND_THREADPOOL);
                    }
                    bvqm.a(ahkvVar2.a, bvrj.LOCATION_SENSORS, ahkvVar2.b);
                    ahkr ahkrVar = new ahkr(ahkvVar2, ahotVar, sz);
                    if (ahkvVar2.E != null) {
                        o.j(ahkrVar, bvrj.LOCATION_SENSORS, bvkw.ON_STARTUP_FULLY_COMPLETE);
                    } else {
                        ahkvVar2.b.b(ahkrVar, bvrj.LOCATION_SENSORS);
                    }
                    ahkvVar2.h.a.m(new dbty(ahkvVar2) { // from class: ahkq
                        private final ahkv a;

                        {
                            this.a = ahkvVar2;
                        }

                        @Override // defpackage.dbty
                        public final Object a() {
                            return this.a.y();
                        }
                    });
                    dxjc.d(this.E, ahkvVar2);
                    this.E = ahkvVar2;
                    ahkvVar = ahkvVar2;
                }
            }
            obj = ahkvVar;
        }
        return (ahkv) obj;
    }

    @Override // defpackage.ahjr
    public final ahjq wf() {
        return f();
    }
}
