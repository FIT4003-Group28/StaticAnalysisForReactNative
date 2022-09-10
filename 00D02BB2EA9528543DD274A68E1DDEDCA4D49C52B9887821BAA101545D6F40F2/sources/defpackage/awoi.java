package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awoi  reason: default package */
/* loaded from: classes3.dex */
public final class awoi implements awph {
    public final akox a;
    public final awpf b;
    public final awol c;
    public final Object d;
    public final arcg e;
    public final area f;
    public final awpd g;
    public boolean h;
    public boolean i;
    public boolean j;
    public double k;
    public boolean l;
    public final Runnable m;
    private final btrm n;
    private final aufc o;
    private final Executor p;
    private final crzp<aufb> q;
    private final awoh r;

    public awoi(akox akoxVar, btrm btrmVar, awpf awpfVar, Resources resources, bvnx bvnxVar, aufc aufcVar, Executor executor) {
        arcg arcgVar = new arcg(resources, akoxVar.aj().aj());
        this.d = new Object();
        area areaVar = new area();
        this.f = areaVar;
        this.g = new awpd();
        this.j = false;
        this.k = Double.NaN;
        this.q = new awof(this);
        this.r = new awoh(this);
        this.m = new awog(this);
        this.a = akoxVar;
        this.n = btrmVar;
        this.b = awpfVar;
        this.o = aufcVar;
        this.p = executor;
        this.c = new awol(bvnxVar);
        this.e = arcgVar;
        areaVar.k = true;
    }

    public final double a() {
        double d;
        synchronized (this.d) {
            d = this.k;
        }
        return d;
    }

    public final void b(boolean z) {
        synchronized (this.d) {
            if (this.i != z) {
                this.i = z;
                if (this.h) {
                    this.a.j.b(this.m);
                    this.a.j.d();
                }
            }
        }
    }

    @Override // defpackage.awph
    public final void k(int i) {
        if (i != 3) {
            synchronized (this.d) {
                if (!this.h) {
                    return;
                }
                this.o.i().c(this.q);
                this.n.a(this.r);
                this.a.j.c(this.m);
                synchronized (this.d) {
                    this.e.b(false);
                }
                this.h = false;
                this.l = false;
                return;
            }
        }
        synchronized (this.d) {
            if (this.h) {
                return;
            }
            this.a.j.a(this.m);
            btrm btrmVar = this.n;
            awoh awohVar = this.r;
            dceq a = dcet.a();
            a.b(alhw.class, new awoj(alhw.class, awohVar));
            btrmVar.g(awohVar, a.a());
            this.o.i().d(this.q, this.p);
            this.a.j.b(this.m);
            this.a.j.d();
            this.h = true;
        }
    }
}
