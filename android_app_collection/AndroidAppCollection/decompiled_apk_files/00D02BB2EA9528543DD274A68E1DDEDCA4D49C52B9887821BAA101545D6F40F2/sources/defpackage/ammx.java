package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: ammx  reason: default package */
/* loaded from: classes.dex */
public final class ammx implements akya, akzz {
    private static final cwsv f = cwsv.a("Basemap.CameraAnimation.ByGesture");
    public final akzh a;
    public alad b;
    public final alaa c;
    public long d;
    public boolean e;
    private final alaa g;
    private int h;
    private final bvnx i;
    private final ammw j;
    private final akze k;
    private final akzn l;
    private final ammv m;
    private final akyw n;
    private final dzsj<akwp> o;
    private final btrm p;
    @dzsi
    private alqd q;
    @dzsi
    private alkc r;

    public ammx(Context context, akzh akzhVar, akyw akywVar, bvnx bvnxVar, dzsj<akwp> dzsjVar, btrm btrmVar) {
        alaa alaaVar = new alaa();
        this.g = alaaVar;
        this.c = alad.a();
        this.r = null;
        this.q = null;
        this.a = akzhVar;
        this.i = bvnxVar;
        this.o = dzsjVar;
        this.p = btrmVar;
        alad p = akzhVar.p();
        this.b = p;
        alaaVar.b(p);
        this.j = new ammw(context, akzhVar, bvnxVar);
        this.k = new akze(bvnxVar, akzhVar);
        this.l = new akzn(bvnxVar);
        this.m = new ammv(bvnxVar, akzhVar);
        this.n = akywVar;
    }

    @Override // defpackage.akya
    public final synchronized int a() {
        dcep K;
        boolean e = this.n.e();
        int i = this.h;
        this.h = this.n.b(this.i.a(), this.g);
        alad a = this.g.a();
        this.b = a;
        this.a.o(a);
        if (i == 0) {
            if (this.h != 0 && e) {
                cwsy.b().j(f);
            }
        } else if (i != 0 && this.h == 0) {
            alqd alqdVar = this.q;
            if (alqdVar != null) {
                akzs akzsVar = new akzs(e);
                synchronized (alqdVar.a) {
                    K = dcep.K(alqdVar.a);
                }
                dcpd it = K.iterator();
                while (it.hasNext()) {
                    ((akzx) it.next()).l(akzsVar);
                }
            }
            final alkc alkcVar = this.r;
            if (alkcVar != null) {
                final alad aladVar = this.b;
                alkcVar.d.execute(new Runnable(alkcVar, aladVar) { // from class: alka
                    private final alkc a;
                    private final alad b;

                    {
                        this.a = alkcVar;
                        this.b = aladVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        alkc alkcVar2 = this.a;
                        alad aladVar2 = this.b;
                        Collection<akzy> collection = alkcVar2.e;
                        if (collection != null) {
                            for (akzy akzyVar : collection) {
                                akzyVar.a(aladVar2);
                            }
                        }
                        akzt b = alkcVar2.b();
                        if (b != null) {
                            b.b();
                        }
                    }
                });
            }
            if (e) {
                cwsy.b().k(f);
            }
        }
        notifyAll();
        return this.h;
    }

    @Override // defpackage.akzz
    public final synchronized void b(alad aladVar, int i, @dzsi TimeInterpolator timeInterpolator) {
        alad a = this.a.c.a(aladVar);
        this.h = 6;
        if (this.o.a().b() && i != 0 && !this.b.equals(a)) {
            alad aladVar2 = this.b;
            this.k.a(aladVar2, a);
            if (i != -1) {
                this.k.p(i);
            }
            if (timeInterpolator != null) {
                this.k.b(timeInterpolator);
            }
            d(this.k);
            this.l.a(aladVar2, a);
            if (i != -1) {
                this.l.p(i);
            }
            if (timeInterpolator != null) {
                this.l.b(timeInterpolator);
            }
            d(this.l);
            return;
        }
        l(a);
    }

    @Override // defpackage.akzz
    public final synchronized boolean c(alaa alaaVar) {
        return this.n.d(alaaVar);
    }

    @Override // defpackage.akzz
    public final synchronized void d(akzv akzvVar) {
        alkc alkcVar;
        akzt b;
        if (!(this.a.e instanceof ammx)) {
            this.h = 0;
        } else if (this.n.a(akzvVar) == 0) {
        } else {
            akzh akzhVar = this.a;
            Runnable runnable = akzhVar.h;
            if (runnable != null) {
                runnable.run();
            } else {
                akzhVar.c(6);
            }
            this.c.b(this.b);
            this.e = this.n.d(this.c);
            this.d = this.i.a() + this.n.c();
            notifyAll();
            akze akzeVar = this.k;
            if (akzvVar == akzeVar || akzeVar.c() || (alkcVar = this.r) == null || (b = alkcVar.b()) == null) {
                return;
            }
            b.c();
        }
    }

    @Override // defpackage.akzu
    public final synchronized boolean e() {
        return this.n.e();
    }

    @Override // defpackage.akzu
    public final synchronized boolean f() {
        throw null;
    }

    @Override // defpackage.akzz
    public final synchronized void g(float f2, float f3) {
        this.j.a(this.b, null);
        this.j.B(f2, f3);
        d(this.j);
    }

    @Override // defpackage.akzz
    public final synchronized boolean h() {
        return this.h != 0;
    }

    @Override // defpackage.akzz
    public final void i(@dzsi akzw akzwVar) {
        this.j.c(akzwVar);
    }

    @Override // defpackage.akzz
    public final synchronized void j(@dzsi alqd alqdVar) {
        this.q = alqdVar;
    }

    @Override // defpackage.akzz
    public final synchronized void k(@dzsi alkc alkcVar) {
        this.r = alkcVar;
    }

    public final synchronized void l(alad aladVar) {
        alad aladVar2 = this.b;
        this.g.b(aladVar);
        this.a.c.b(this.g);
        alad a = this.g.a();
        this.b = a;
        this.k.a(aladVar2, a);
        this.k.p(0L);
        d(this.k);
        this.l.a(aladVar2, this.b);
        this.l.p(0L);
        d(this.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void m(float[] fArr) {
        this.j.a(this.b, null);
        this.j.v(fArr);
        float x = this.j.x();
        if (Float.isNaN(x)) {
            this.p.b(new alhx(this.j.w()));
        } else if (x != 0.0f) {
            this.p.b(new alhx(this.j.w() + x));
        }
        d(this.j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized float n() {
        if (!this.j.y()) {
            return 0.0f;
        }
        float x = this.j.x();
        if (!Float.isNaN(x)) {
            return x;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void o() {
        this.j.t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void p() {
        this.j.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized float q(float f2, float f3, float f4) {
        float A;
        this.j.a(this.b, null);
        A = this.j.A(f2, f3, f4);
        d(this.j);
        return A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized float r(float f2) {
        float z;
        this.j.a(this.b, null);
        z = this.j.z(f2);
        d(this.j);
        return z;
    }

    public final synchronized void s(float f2) {
        this.j.a(this.b, null);
        this.j.C(f2);
        d(this.j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void t(float f2) {
        this.j.a(this.b, null);
        this.j.E(f2);
        d(this.j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void u(float f2, float f3, float f4) {
        this.j.a(this.b, null);
        this.j.F(f4, f2, f3);
        d(this.j);
    }

    public final synchronized float v(float f2, float f3) {
        this.m.a(this.b, null);
        ammv ammvVar = this.m;
        float f4 = this.b.k;
        ammvVar.a = true;
        ammvVar.n = f4 + 1.0f;
        ammvVar.o = f2;
        ammvVar.p = f3;
        ammvVar.q = null;
        ammvVar.c();
        d(this.m);
        return akza.d(this.b.k + 1.0f);
    }

    public final synchronized float w(float f2) {
        return x(this.b.k + f2);
    }

    public final synchronized float x(float f2) {
        this.m.a(this.b, null);
        ammv ammvVar = this.m;
        ammvVar.a = false;
        ammvVar.n = f2;
        ammvVar.q = null;
        ammvVar.c();
        d(this.m);
        return akza.d(f2);
    }
}
