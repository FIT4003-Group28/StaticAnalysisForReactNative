package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: amiu  reason: default package */
/* loaded from: classes.dex */
public final class amiu implements amii, amfq {
    public static final dcqe a = dcqe.c("amiu");
    private boolean A;
    private final btmv B;
    private final dzsj<akwt> C;
    private final btrm D;
    private final dehq E;
    private final Executor F;
    private final dbty<Boolean> G;
    private final amif H;
    private final bvnx I;
    private final dbsg<albj> J;
    private final crzo<aktu> K;
    private final alol L;
    private final alok M;
    private final hwv N;
    public final Object b = new Object();
    public ArrayList<amio> c = dchl.a();
    public ArrayList<amio> d = dchl.a();
    public final amiq e;
    public final amiq f;
    public final amjl g;
    public final Set<akvw> h;
    public final amkp i;
    public final btnh<amio> j;
    public final ArrayList<amjm> k;
    public final ArrayList<amkq> l;
    public volatile boolean m;
    public boolean n;
    public final AtomicReference<amis> o;
    public final amim p;
    public final List<akts> q;
    public final List<aktt> r;
    public volatile boolean s;
    public final ckcw t;
    public final alne u;
    private final amjk v;
    private final amqv w;
    @dzsi
    private amit x;
    private final alsq y;
    private final amix z;

    public amiu(amqv amqvVar, alsq alsqVar, alol alolVar, alok alokVar, amix amixVar, alne alneVar, btmv btmvVar, ckcw ckcwVar, dzsj dzsjVar, btrm btrmVar, hwv hwvVar, dehq dehqVar, Executor executor, amlm amlmVar, dbty dbtyVar, bvnx bvnxVar, boolean z, anbe anbeVar, boolean z2) {
        amiq amiqVar = new amiq();
        this.e = amiqVar;
        amiq amiqVar2 = new amiq();
        this.f = amiqVar2;
        this.v = new amjk();
        this.g = new amjl();
        this.h = new HashSet();
        this.i = new amkp();
        this.j = new amip();
        this.k = dchl.a();
        this.l = dchl.a();
        this.m = true;
        this.o = new AtomicReference<>(null);
        this.p = new amim();
        this.A = false;
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.J = dbpy.a;
        this.w = amqvVar;
        this.y = alsqVar;
        this.L = alolVar;
        this.M = alokVar;
        this.z = amixVar;
        this.u = alneVar;
        this.B = btmvVar;
        this.t = ckcwVar;
        this.C = dzsjVar;
        this.D = btrmVar;
        this.N = hwvVar;
        this.E = dehqVar;
        this.F = executor;
        this.G = dbtyVar;
        this.I = bvnxVar;
        this.H = new amif(amlmVar, dzsjVar, anbeVar);
        this.K = new crzo<>(aktu.a);
        if (z) {
            amiqVar.j = new amhz();
        }
        amiqVar2.g = z2 ? alwn.ROADMAP_DARK : alwn.ROADMAP;
        amiqVar.g = z2 ? alwn.ROADMAP_DARK : alwn.ROADMAP;
    }

    private final void C() {
        amit amitVar = this.x;
        if (amitVar == null || !this.A) {
            return;
        }
        amjd amjdVar = new amjd(amitVar.a, this.D, bntl.a, bntn.OVERLAY_LABELS, bntn.CALLOUT_LABEL_OVER_PLACEMARKS, this.C, this.G);
        ckcw ckcwVar = this.t;
        amit amitVar2 = this.x;
        amkb amkbVar = new amkb(this.x.a, this.w, new amkg(ckcwVar, amitVar2.b, amitVar2.a, this.L, this.M, this.v, this.I), amjdVar, this.z, this.y, new amih(96, this.B), this.L, this.v, this.C, this.N, this.J, this.H, this.K, this.e.g);
        amir amirVar = new amir(this, amkbVar, this.E, this.F);
        this.e.a = amitVar.b.p();
        this.e.c = amitVar.b.y();
        this.e.d = amitVar.b.z();
        this.e.e = amitVar.b.B();
        akyy akyyVar = amitVar.b.b;
        if (akyyVar != null) {
            this.e.i = akyyVar.a();
        }
        amis amisVar = new amis(amitVar.b.b(), amkbVar, amirVar, new Runnable(this) { // from class: amik
            private final amiu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.B();
            }
        });
        this.o.set(amisVar);
        this.x.a.k(amisVar.d);
        amir amirVar2 = amisVar.c;
        amirVar2.d.p(amirVar2.c.c(amirVar2));
        e();
    }

    private final void D(boolean z) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        amis amisVar = this.o.get();
        if (amisVar != null) {
            amisVar.c.d.Pk(new Runnable(countDownLatch) { // from class: amil
                private final CountDownLatch a;

                {
                    this.a = countDownLatch;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.countDown();
                }
            }, this.E);
            amisVar.c.b();
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            amisVar = null;
        }
        synchronized (this) {
            if (!z) {
                int size = this.k.size();
                for (int i = 0; i < size; i++) {
                    this.k.get(i).i(this);
                }
                this.k.clear();
                this.l.clear();
            } else {
                synchronized (this.b) {
                    ArrayList<amio> a2 = dchl.a();
                    Iterator<amio> it = this.c.iterator();
                    while (it.hasNext()) {
                        amio next = it.next();
                        if (!next.a.k()) {
                            a2.add(next);
                        } else {
                            next.a();
                            this.j.h(next);
                        }
                    }
                    this.c = a2;
                }
                dccx F = dcdc.F();
                int size2 = this.k.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    amjm amjmVar = this.k.get(i2);
                    if (amjmVar.k()) {
                        this.k.get(i2).i(this);
                        F.g(amjmVar);
                    }
                }
                dcdc f = F.f();
                this.k.removeAll(f);
                this.l.removeAll(f);
            }
            this.n = true;
            if (amisVar != null) {
                amit amitVar = this.x;
                if (amitVar != null) {
                    amitVar.a.l(amisVar.d);
                }
                amjn amjnVar = amisVar.b;
                ((amkb) amjnVar).a.a();
                ((amkb) amjnVar).e.d();
                ((amkb) amjnVar).d.f();
                ((amkb) amjnVar).c();
                ((amkb) amjnVar).c.b();
                this.v.e();
                this.o.set(null);
            }
            this.A = false;
        }
    }

    private final synchronized boolean E(alad aladVar) {
        alad aladVar2 = this.e.a;
        if (aladVar2 == null) {
            return true;
        }
        if (aladVar.equals(aladVar2)) {
            return false;
        }
        float f = aladVar.k;
        float f2 = aladVar2.k;
        if (((int) (f + f)) != ((int) (f2 + f2))) {
            return true;
        }
        if (Math.abs(f - f2) >= 0.1f) {
            return true;
        }
        if (Math.abs(bvop.c(aladVar.m - aladVar2.m)) >= 3.0f) {
            return true;
        }
        if (Math.abs(aladVar.l - aladVar2.l) >= 1.0f) {
            return true;
        }
        float f3 = aladVar.k;
        amiq amiqVar = this.e;
        float a2 = akyx.a(f3, amiqVar.d, amiqVar.e);
        if (aladVar.j.A(aladVar2.j) / (a2 * a2) >= 0.010000001f) {
            return true;
        }
        alae alaeVar = aladVar.n;
        alae alaeVar2 = aladVar2.n;
        float f4 = alaeVar.b - alaeVar2.b;
        float f5 = alaeVar.c - alaeVar2.c;
        return (f4 * f4) + (f5 * f5) >= 0.010000001f;
    }

    private final synchronized boolean F(akzh akzhVar) {
        boolean z;
        akyy akyyVar;
        akyy akyyVar2 = akzhVar.b;
        if (akyyVar2 == null || ((akyyVar = this.e.i) != null && akyyVar2.c().equals(akyyVar.c()) && akyyVar2.d().equals(akyyVar.d()))) {
            z = false;
        } else {
            this.e.i = akyyVar2.a();
            z = true;
        }
        return z;
    }

    @Override // defpackage.amii
    public final void A() {
        if (!this.m) {
            this.m = true;
            e();
        }
    }

    public final synchronized void B() {
        amit amitVar = this.x;
        if (amitVar == null) {
            return;
        }
        akzh akzhVar = amitVar.b;
        this.e.c = akzhVar.y();
        this.e.d = akzhVar.z();
        this.e.e = akzhVar.B();
        this.e.b = akzhVar.a;
        alad p = akzhVar.p();
        if (this.m && E(p)) {
            F(akzhVar);
            this.e.a = p;
            e();
            return;
        }
        if (!this.m || !F(akzhVar)) {
            return;
        }
        e();
    }

    @Override // defpackage.amfq
    public final void a(amfu amfuVar) {
        if (!amfuVar.a() || amfuVar.h() == null) {
            return;
        }
        e();
    }

    @Override // defpackage.amii
    public final synchronized void b(bnsn bnsnVar, akzh akzhVar) {
        if (this.x != null) {
            return;
        }
        this.x = new amit(bnsnVar, akzhVar);
        akyy akyyVar = akzhVar.b;
        if (akyyVar != null) {
            akyyVar.h(new amij(this));
        }
        C();
    }

    @Override // defpackage.amii
    public final void c() {
        D(true);
        synchronized (this) {
            this.A = true;
            C();
        }
    }

    @Override // defpackage.amii
    public final void d() {
        D(false);
    }

    @Override // defpackage.amii
    public final void e() {
        this.p.c();
        amis amisVar = this.o.get();
        if (amisVar == null || amisVar.c.d.isDone()) {
            return;
        }
        if (!((amkb) amisVar.b).f) {
            ((ckhe) this.t.a(ckgh.e)).a();
        }
        amisVar.c.a();
    }

    @Override // defpackage.amii
    public final boolean f() {
        if (this.m) {
            synchronized (this) {
                if (this.x != null && this.A) {
                    amis amisVar = this.o.get();
                    dbsk.s(amisVar);
                    if (((amkb) amisVar.b).d.g()) {
                        return this.p.d();
                    }
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.amii
    public final crzm<Boolean> g() {
        return this.p.a.a;
    }

    @Override // defpackage.amii
    public final void h(amjm amjmVar) {
        synchronized (this.b) {
            ArrayList<amio> arrayList = this.c;
            amio d = this.j.d();
            d.b(amjmVar, 1);
            arrayList.add(d);
        }
        e();
    }

    @Override // defpackage.amii
    public final void i(amjm amjmVar) {
        synchronized (this.b) {
            ArrayList<amio> arrayList = this.c;
            amio d = this.j.d();
            d.b(amjmVar, 2);
            arrayList.add(d);
        }
        e();
    }

    @Override // defpackage.amii
    public final void j(amjm amjmVar, amjm amjmVar2) {
        synchronized (this.b) {
            if (amjmVar != null) {
                try {
                    ArrayList<amio> arrayList = this.c;
                    amio d = this.j.d();
                    d.b(amjmVar, 2);
                    arrayList.add(d);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (amjmVar2 != null) {
                ArrayList<amio> arrayList2 = this.c;
                amio d2 = this.j.d();
                d2.b(amjmVar2, 1);
                arrayList2.add(d2);
            }
        }
        e();
    }

    @Override // defpackage.amii
    public final void k(amjm amjmVar) {
        synchronized (this.b) {
            ArrayList<amio> arrayList = this.c;
            amio d = this.j.d();
            d.b(amjmVar, 3);
            arrayList.add(d);
        }
        e();
    }

    @Override // defpackage.amii
    public final synchronized void l(@dzsi aktx aktxVar) {
        amiq amiqVar = this.e;
        if (amiqVar.k != aktxVar) {
            amiqVar.k = aktxVar;
            e();
        }
    }

    @Override // defpackage.amii
    public final synchronized void m(amky amkyVar) {
        amiq amiqVar = this.e;
        if (amiqVar.f != amkyVar) {
            amiqVar.f = amkyVar;
            e();
        }
    }

    @Override // defpackage.amii
    public final synchronized amky n() {
        return this.e.f;
    }

    @Override // defpackage.amii
    public final synchronized void o(alwn alwnVar) {
        amiq amiqVar = this.e;
        if (amiqVar.g != alwnVar) {
            amiqVar.g = alwnVar;
            e();
        }
    }

    @Override // defpackage.amii
    public final synchronized void p() {
        this.e.h = true;
    }

    @Override // defpackage.amii
    public final JSONObject q() {
        amis amisVar = this.o.get();
        if (amisVar != null) {
            return ((amkb) amisVar.b).c.c();
        }
        return new JSONObject();
    }

    @Override // defpackage.amii
    public final crzm<aktu> r() {
        return this.K.a;
    }

    @Override // defpackage.amii
    public final void s(akts aktsVar) {
        synchronized (this.q) {
            if (!this.q.contains(aktsVar)) {
                this.q.add(aktsVar);
            }
        }
    }

    @Override // defpackage.amii
    public final void t(akts aktsVar) {
        synchronized (this.q) {
            this.q.remove(aktsVar);
        }
    }

    @Override // defpackage.amii
    public final void u(aktt akttVar) {
        synchronized (this.r) {
            if (!this.r.contains(akttVar)) {
                this.r.add(akttVar);
            }
        }
    }

    @Override // defpackage.amii
    public final void v(aktt akttVar) {
        synchronized (this.r) {
            this.r.remove(akttVar);
        }
    }

    @Override // defpackage.amii
    public final synchronized void w(akub akubVar) {
        this.v.c.add(akubVar);
    }

    @Override // defpackage.amii
    public final synchronized void x(akub akubVar) {
        this.v.c.remove(akubVar);
    }

    @Override // defpackage.amii
    public final akso y() {
        return this.H;
    }

    @Override // defpackage.amii
    public final void z(amko amkoVar) {
        this.i.a(amkoVar);
    }
}
