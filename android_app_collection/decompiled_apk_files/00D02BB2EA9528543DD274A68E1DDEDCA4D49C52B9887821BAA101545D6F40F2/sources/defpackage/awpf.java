package defpackage;

import android.graphics.Rect;
import android.os.SystemClock;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: awpf  reason: default package */
/* loaded from: classes3.dex */
public final class awpf implements awph {
    public final akox a;
    public boolean c;
    public boolean e;
    public boolean f;
    public int i;
    @dzsi
    public cray[] j;
    private final btrm l;
    private final arbx m;
    private final boolean n;
    private boolean r;
    public final Object b = new Object();
    private final akra o = new akra();
    private final awpd p = new awpd();
    private awpe q = awpe.LARGE;
    public boolean d = true;
    public long g = -1;
    public float h = 1.0f;
    private final awpc s = new awpc(this);
    public final Runnable k = new awpb(this);

    public awpf(akox akoxVar, btrm btrmVar, arbx arbxVar) {
        dbsk.s(akoxVar);
        this.a = akoxVar;
        dbsk.s(btrmVar);
        this.l = btrmVar;
        dbsk.s(arbxVar);
        this.m = arbxVar;
        this.n = akoxVar.r.b();
    }

    public final void a(awpe awpeVar) {
        synchronized (this.b) {
            if (this.q != awpeVar) {
                this.q = awpeVar;
                if (this.e) {
                    this.c = true;
                }
            }
        }
    }

    public final void d(boolean z) {
        synchronized (this.b) {
            this.r = z;
            if (this.e) {
                this.c = true;
            }
        }
    }

    public final void e(awpd awpdVar, akra akraVar, boolean z) {
        amub amubVar;
        int i;
        double d;
        int i2;
        int i3;
        alad n = this.a.n();
        double r = n.j.r();
        double f = akyx.f(this.a.k());
        Rect d2 = this.a.k().b.d();
        float min = Math.min(d2.height() * 1.25f, d2.width()) * ((float) (r / f)) * ardi.b(n.k, n.l);
        synchronized (this.b) {
            awpdVar.b();
            if (this.q != awpe.NONE && this.h > 0.0f) {
                cray[] crayVarArr = this.j;
                akrn akrnVar = null;
                if (crayVarArr == null || (i3 = this.i) < 0 || i3 >= crayVarArr.length) {
                    amubVar = null;
                } else {
                    amubVar = crayVarArr[i3].a;
                    if (this.r) {
                        akox akoxVar = this.a;
                        Rect d3 = akoxVar.k().b.d();
                        akrp a = amubVar.l.a();
                        if (this.a.n().k < akyx.c(akoxVar.k(), (float) Math.hypot(a.m(), a.n()), (float) Math.hypot(d3.width(), d3.height())) + 1.0f) {
                            return;
                        }
                    }
                }
                if (this.g >= 0 && !this.n) {
                    float elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - this.g)) / 1000.0f;
                    if (elapsedRealtime > 1.0f) {
                        this.h = 0.0f;
                    } else if (elapsedRealtime < 0.0f) {
                        this.h = 1.0f;
                    } else {
                        this.h = (float) Math.sqrt(1.0f - (elapsedRealtime * elapsedRealtime));
                    }
                }
                if (this.d && this.m.f(this.o)) {
                    float y = akraVar.y(this.o);
                    float f2 = this.q.e * this.h * min;
                    if (y < f2) {
                        awpdVar.a = this.o;
                        awpdVar.b = 1.0f - (y / f2);
                    }
                }
                if (amubVar == null) {
                    return;
                }
                double d4 = z ? 2.0015115070354454E7d : this.q.f * this.h * min;
                if (this.j[this.i].g == -1) {
                    d = dcyn.a;
                    i2 = 0;
                } else {
                    int aa = amubVar.aa(amubVar.D - i);
                    double K = amubVar.K(aa);
                    double z2 = this.o.z(amubVar.l.m(aa));
                    Double.isNaN(z2);
                    d = K + z2;
                    i2 = aa;
                }
                Iterator<akrn> it = amubVar.aC(akraVar, d4, i2, 2, true).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    akrn next = it.next();
                    if (amubVar.M(next) > d) {
                        akrnVar = next;
                        break;
                    }
                }
                if (akrnVar != null) {
                    awpdVar.c = amubVar;
                    awpdVar.d = akrnVar;
                }
            }
        }
    }

    public final void b(awpd awpdVar) {
        synchronized (this.b) {
            if (this.c) {
                if (!this.f || this.g >= 0) {
                    e(this.p, this.a.n().j, false);
                } else {
                    this.p.b();
                }
                this.c = false;
            }
            awpdVar.a(this.p);
        }
    }

    @Override // defpackage.awph
    public final void k(int i) {
        if (i != 3) {
            synchronized (this.b) {
                if (!this.e) {
                    return;
                }
                this.p.b();
                this.l.a(this.s);
                this.a.j.c(this.k);
                this.c = false;
                this.e = false;
                this.g = -1L;
                this.h = 1.0f;
                return;
            }
        }
        synchronized (this.b) {
            if (this.e) {
                return;
            }
            this.c = true;
            this.a.j.a(this.k);
            this.a.j.b(this.k);
            btrm btrmVar = this.l;
            awpc awpcVar = this.s;
            dceq a = dcet.a();
            a.b(crhp.class, new awpg(0, crhp.class, awpcVar));
            a.b(alhw.class, new awpg(1, alhw.class, awpcVar));
            btrmVar.g(awpcVar, a.a());
            this.e = true;
        }
    }
}
