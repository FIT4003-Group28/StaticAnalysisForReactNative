package defpackage;

import android.content.res.Resources;
import com.google.android.apps.gmm.location.events.CarHeadingEvent;
import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: arbi  reason: default package */
/* loaded from: classes.dex */
public final class arbi implements arbx {
    public static final dcqe a = dcqe.c("arbi");
    public final arbf A;
    final arbe B;
    private final btwd C;
    private final btrm D;
    private final ahjq E;
    private final dxio<ahkg> F;
    private final aufc G;
    private final Executor H;
    @dzsi
    private ahkf K;
    private arbl L;
    private arbs M;
    private boolean N;
    private final AtomicBoolean O;
    private final arbh P;
    public final duwy b;
    public final cqat c;
    public final bvnx d;
    public final btpa e;
    @dzsi
    public final bvjj f;
    @dzsi
    public akox h;
    public final arbo i;
    public boolean j;
    final aray k;
    @dzsi
    public arci l;
    public boolean m;
    public boolean n;
    public final area o;
    public aqzu p;
    public float q;
    public long r;
    public float s;
    public long t;
    public float u;
    public int v;
    public boolean w;
    public int x;
    @dzsi
    public GmmLocation y;
    arbg z;
    public final Set<arbw> g = Collections.newSetFromMap(new ConcurrentHashMap());
    private final crzp<aufb> I = new arbb(this);
    private final crzo<arbv> J = new crzo<>(new arbv());

    public arbi(btwd btwdVar, duwy duwyVar, dkog dkogVar, dkiy dkiyVar, btrm btrmVar, cqat cqatVar, bvnx bvnxVar, btpa btpaVar, ahjq ahjqVar, dxio dxioVar, aufc aufcVar, Executor executor, dxio dxioVar2, ckcw ckcwVar, bvjj bvjjVar, pnq pnqVar, pot potVar, kma kmaVar) {
        new arbc(this);
        new arbd(this);
        this.n = false;
        this.o = new area();
        this.q = -1.0f;
        this.r = Long.MIN_VALUE;
        this.s = -1.0f;
        this.t = Long.MIN_VALUE;
        this.u = -1.0f;
        this.v = 0;
        this.w = false;
        this.x = -1;
        this.O = new AtomicBoolean(false);
        this.P = new arbh(this);
        this.A = new arbf(this);
        this.B = new arbe(this);
        this.C = btwdVar;
        this.b = duwyVar;
        this.D = btrmVar;
        this.c = cqatVar;
        this.d = bvnxVar;
        this.e = btpaVar;
        this.E = ahjqVar;
        this.F = dxioVar;
        this.i = new arbo(ckcwVar);
        this.f = bvjjVar;
        this.G = aufcVar;
        this.H = executor;
        this.k = new aray(duwyVar, dkiyVar, btrmVar, btpaVar, bvjjVar, pnqVar, potVar, executor, cqatVar, dxioVar2);
    }

    private final void E() {
        ahkf ahkfVar;
        if (!this.j) {
            return;
        }
        if ((this.N && this.M != arbs.NAVIGATION) || ahrm.f(this.b)) {
            ahkfVar = ahkf.FAST;
        } else {
            ahkfVar = ahkf.SLOW;
        }
        ahkf ahkfVar2 = this.K;
        if (ahkfVar == ahkfVar2) {
            return;
        }
        if (ahkfVar2 != null) {
            this.F.a().b(this.P);
        }
        this.K = ahkfVar;
        this.F.a().a(this.P, ahkfVar);
        this.w = true;
    }

    public final synchronized void A() {
        if (!this.m) {
            return;
        }
        if (this.h == null) {
            bvoo.h("mapContainer is null in unregisterMyLocationEntities().", new Object[0]);
            return;
        }
        arci arciVar = this.l;
        if (arciVar != null) {
            arciVar.c();
        }
        this.l = null;
        this.m = false;
        this.L.a(null);
    }

    @Override // defpackage.arbx
    public final void B(boolean z) {
        aray arayVar = this.k;
        arayVar.n = z;
        if (arayVar.i != null) {
            arayVar.i.f = z;
        }
    }

    @Override // defpackage.arbx
    public final void C(float f) {
        aray arayVar = this.k;
        if (arayVar.i != null) {
            arayVar.i.b = f;
        }
    }

    @Override // defpackage.arbx
    public final void D() {
        this.p.o();
    }

    @Override // defpackage.arbx
    public final void a(akox akoxVar, Resources resources) {
        this.h = akoxVar;
        aray arayVar = this.k;
        arayVar.e = akoxVar;
        arayVar.f = resources;
        arayVar.k = ardz.NONE;
        arayVar.l = false;
        arayVar.m = false;
        duwo duwoVar = this.b.h;
        if (duwoVar == null) {
            duwoVar = duwo.c;
        }
        this.p = new aqzs(duwoVar);
        this.M = arbs.MOVE_JUMP_TELEPORT;
        synchronized (this) {
            this.l = this.k.j;
            this.L = new arbl(this.l, this.B, akoxVar.j);
        }
        this.z = new arbg(this);
    }

    @Override // defpackage.arbx
    public final void b() {
        akox akoxVar = this.h;
        if (akoxVar == null) {
            bvoo.h("mapContainer is null in onStart().", new Object[0]);
            return;
        }
        this.j = true;
        arbl arblVar = this.L;
        akzh k = akoxVar.k();
        dbsk.s(k);
        arblVar.b = k;
        akpq akpqVar = this.h.j;
        akpqVar.a(this.L);
        akpqVar.a(this.z);
        akpqVar.b(this.z);
        z();
        E();
        this.p.n();
        btrm btrmVar = this.D;
        arbf arbfVar = this.A;
        dceq a2 = dcet.a();
        a2.b(crhp.class, new arbj(0, crhp.class, arbfVar, bvrj.UI_THREAD));
        a2.b(crhr.class, new arbj(1, crhr.class, arbfVar, bvrj.UI_THREAD));
        a2.b(crmk.class, new arbj(2, crmk.class, arbfVar, bvrj.UI_THREAD));
        a2.b(amqo.class, new arbj(3, amqo.class, arbfVar, bvrj.UI_THREAD));
        a2.b(ahlc.class, new arbj(4, ahlc.class, arbfVar, bvrj.UI_THREAD));
        a2.b(ahkz.class, new arbj(5, ahkz.class, arbfVar, bvrj.UI_THREAD));
        a2.b(arbt.class, new arbj(6, arbt.class, arbfVar, bvrj.UI_THREAD));
        a2.b(CarHeadingEvent.class, new arbj(7, CarHeadingEvent.class, arbfVar, bvrj.UI_THREAD));
        a2.b(AndroidLocationEvent.class, new arbj(8, AndroidLocationEvent.class, arbfVar, bvrj.UI_THREAD));
        a2.b(ahju.class, new arbj(9, ahju.class, arbfVar, bvrj.UI_THREAD));
        a2.b(afwq.class, new arbj(10, afwq.class, arbfVar, bvrj.UI_THREAD));
        btrmVar.g(arbfVar, a2.a());
        this.G.i().d(this.I, this.H);
        this.h.h();
        if (!this.E.h().a() || !this.O.compareAndSet(false, true)) {
            return;
        }
        this.h.t.l();
    }

    public final void c(arbv arbvVar) {
        crzo<arbv> crzoVar = this.J;
        if (crzoVar != null) {
            crzoVar.b(arbvVar);
        }
    }

    @Override // defpackage.arbx
    public final void d() {
        this.e.f(null, this.E.h().d());
        this.G.i().c(this.I);
        this.D.a(this.A);
        akox akoxVar = this.h;
        if (akoxVar == null) {
            bvoo.h("mapContainer is null in onStop().", new Object[0]);
        } else {
            akpq akpqVar = akoxVar.j;
            akpqVar.c(this.z);
            akpqVar.c(this.L);
        }
        A();
        if (this.K != null) {
            this.F.a().b(this.P);
            this.K = null;
        }
        this.u = -1.0f;
        this.v = 0;
        this.p.k(-1.0f);
        this.w = false;
        duwo duwoVar = this.b.h;
        if (duwoVar == null) {
            duwoVar = duwo.c;
        }
        if (duwoVar.a) {
            this.p.g();
        }
        this.j = false;
    }

    @Override // defpackage.arbx
    public final void e() {
        aray arayVar = this.k;
        arde ardeVar = arayVar.h;
        if (ardeVar != null) {
            for (arcb arcbVar : ardeVar.c) {
                arcbVar.b();
            }
        }
        if (arayVar.i != null) {
            arayVar.i.f();
        }
        ardc ardcVar = arayVar.g;
        if (ardcVar != null) {
            ardcVar.c();
        }
        arayVar.f();
        this.h = null;
    }

    @Override // defpackage.arbx
    public final boolean f(@dzsi akra akraVar) {
        synchronized (this) {
            if (!this.n) {
                return false;
            }
            synchronized (this.o) {
                if (!this.o.e()) {
                    return false;
                }
                if (akraVar != null) {
                    akraVar.aa(this.o.a);
                }
                return true;
            }
        }
    }

    @Override // defpackage.arbx
    public final float g() {
        float f;
        synchronized (this.o) {
            f = this.o.e;
        }
        return f;
    }

    @Override // defpackage.arbx
    public final boolean h() {
        boolean z;
        synchronized (this.o) {
            z = this.o.k;
        }
        return z;
    }

    @Override // defpackage.arbx
    public final void i(arbs arbsVar) {
        arbs arbsVar2 = this.M;
        if (arbsVar == arbsVar2) {
            return;
        }
        this.M = arbsVar;
        arbs arbsVar3 = arbs.NAVIGATION;
        int ordinal = arbsVar.ordinal();
        if (ordinal == 0) {
            if (arbsVar2 != arbs.NAVIGATION_COMPASS) {
                w(new aqzv(this.d, this.C.X()));
            }
            this.p.m(false);
            if (arbsVar2 == arbs.MOVE_JUMP_TELEPORT) {
                synchronized (this.o) {
                    this.o.k = false;
                }
            }
        } else if (ordinal == 1) {
            if (arbsVar2 != arbs.NAVIGATION) {
                w(new aqzv(this.d, this.C.X()));
            }
            this.p.m(true);
        } else if (ordinal == 2) {
            duwo duwoVar = this.b.h;
            if (duwoVar == null) {
                duwoVar = duwo.c;
            }
            w(new aqzs(duwoVar));
        }
        GmmLocation gmmLocation = this.y;
        if (gmmLocation != null) {
            this.p.h(gmmLocation);
        }
        E();
        y();
    }

    @Override // defpackage.arbx
    public final arbs j() {
        return this.M;
    }

    @Override // defpackage.arbx
    public final void k(ardz ardzVar) {
        ardy ardyVar;
        aray arayVar = this.k;
        if (ardzVar != ardz.NONE && !ardzVar.l && btlu.i(arayVar.d.a().j()) == btlt.INCOGNITO) {
            ardzVar = ardz.INCOGNITO;
        }
        if (ardzVar == arayVar.k) {
            return;
        }
        arayVar.k = ardzVar;
        boolean z = false;
        switch (ardzVar.ordinal()) {
            case 0:
                duwo duwoVar = arayVar.a.h;
                if (duwoVar == null) {
                    duwoVar = duwo.c;
                }
                if (!duwoVar.a) {
                    ardyVar = ardy.DEFAULT_BLUE_DOT;
                } else {
                    ardyVar = ardy.DEFAULT_WHITE_DOT;
                }
                z = arayVar.a(ardyVar);
                break;
            case 1:
                ardyVar = ardy.TWO_WHEELER_DOT;
                z = arayVar.a(ardyVar);
                break;
            case 2:
                ardyVar = ardy.DRIVING_DOT;
                z = arayVar.a(ardyVar);
                break;
            case 3:
                ardyVar = ardy.WALKING_DOT;
                z = arayVar.a(ardyVar);
                break;
            case 4:
                ardyVar = ardy.BIKING_DOT;
                z = arayVar.a(ardyVar);
                break;
            case 5:
                ardyVar = ardy.TAXI_DOT;
                z = arayVar.a(ardyVar);
                break;
            case 6:
            case 7:
                z = arayVar.b();
                break;
            case 8:
                ardyVar = ardy.OFF_ROUTE_DRIVING_DOT;
                z = arayVar.a(ardyVar);
                break;
            case 9:
                if (arayVar.j != null) {
                    arayVar.j.b(false);
                    return;
                }
                break;
            case 10:
                ardyVar = ardy.INCOGNITO;
                z = arayVar.a(ardyVar);
                break;
        }
        if (!z) {
            return;
        }
        z();
    }

    @Override // defpackage.arbx
    public final ardz l() {
        return this.k.k;
    }

    @Override // defpackage.arbx
    @dzsi
    public final arcs m() {
        return this.k.h;
    }

    @Override // defpackage.arbx
    public final int n() {
        int i;
        synchronized (this.o) {
            i = this.o.i;
        }
        return i;
    }

    @Override // defpackage.arbx
    public final akra o() {
        akra akraVar;
        synchronized (this.o) {
            akraVar = this.o.a;
        }
        return akraVar;
    }

    @Override // defpackage.arbx
    public final void p(arbw arbwVar) {
        this.g.add(arbwVar);
    }

    @Override // defpackage.arbx
    public final void q(arbw arbwVar) {
        this.g.remove(arbwVar);
    }

    @Override // defpackage.arbx
    public final void r(String str, int i, String str2, @dzsi Runnable runnable) {
        this.k.g(str, i, str2, runnable);
    }

    @Override // defpackage.arbx
    public final void s() {
        this.k.f();
    }

    @Override // defpackage.arbx
    public final void t() {
        this.p.d();
        y();
    }

    @Override // defpackage.arbx
    public final void u() {
        this.p.f();
        y();
    }

    @Override // defpackage.arbx
    public final void v() {
        this.p.e();
    }

    final void w(aqzu aqzuVar) {
        aqzu aqzuVar2 = this.p;
        this.p = aqzuVar;
        if (aqzuVar2 != null) {
            aqzuVar2.close();
        }
    }

    @Override // defpackage.arbx
    public final void x(boolean z) {
        this.N = z;
        E();
    }

    public final void y() {
        arbl arblVar = this.L;
        arblVar.a.b(arblVar);
        arblVar.a.d();
    }

    public final synchronized void z() {
        arci arciVar = this.k.j;
        if (arciVar == null || !this.n) {
            A();
        } else if (this.h == null) {
            bvoo.h("mapContainer is null in registerMyLocationEntities().", new Object[0]);
        } else {
            A();
            this.l = arciVar;
            this.L.a(arciVar);
            this.m = true;
        }
    }
}
