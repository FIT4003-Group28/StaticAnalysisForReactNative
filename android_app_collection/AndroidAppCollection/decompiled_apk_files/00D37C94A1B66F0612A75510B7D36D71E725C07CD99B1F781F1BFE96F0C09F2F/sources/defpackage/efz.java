package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: efz  reason: default package */
/* loaded from: classes3.dex */
public final class efz {
    public final boolean a;
    public final yxe b;
    public final azqb c;
    public final azqb d;
    public final AtomicBoolean e;
    public final AtomicInteger f;
    public final yxd g;
    public final yxd h;
    public final yxd i;
    private final double j;
    private final yxf k;

    public efz(yxe yxeVar, aksv aksvVar, azqb azqbVar, azqb azqbVar2) {
        this.b = yxeVar;
        this.k = aksvVar.a.h;
        this.c = azqbVar;
        this.d = azqbVar2;
        ywk a = aksvVar.a();
        zdb zdbVar = yxeVar.m;
        boolean z = true;
        if (!a.l(ywk.D) && a.c(ywk.E) == 0) {
            z = false;
        }
        this.a = z;
        if (z) {
            this.g = yxeVar.b("critical");
            this.h = yxeVar.b("intentCritical");
            this.i = yxeVar.b("nonCritical");
        } else {
            this.i = null;
            this.h = null;
            this.g = null;
        }
        double a2 = efj.a();
        Double.isNaN(a2);
        this.j = 1.0d / a2;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicInteger(0);
    }

    public final aynr a() {
        return this.k.c.I(efx.b).ag(1L).h();
    }

    public final aynr b() {
        return this.k.c.I(efx.a).ag(1L).h();
    }

    public final void c(int i) {
        if (this.g == null || this.h == null || this.i == null) {
            return;
        }
        int a = efj.a();
        int i2 = 4;
        int i3 = 3;
        if (i == 0) {
            yxd yxdVar = this.g;
            if (a != 3) {
                i2 = 3;
            }
            yxdVar.e(1, i2);
            yxd yxdVar2 = this.g;
            if (a == 3) {
                i3 = 5;
            }
            yxdVar2.e(0, i3);
        } else if (i != 1) {
            if (i == 2) {
                if (a != 3) {
                    return;
                }
                this.h.e(1, 2);
                this.h.e(0, 2);
            } else if (i == 4) {
                if (a != 3) {
                    return;
                }
                this.h.e(1, 1);
            } else if (a != 3) {
            } else {
                this.h.e(0, 1);
            }
        } else {
            this.h.g(this.g.d(), 2, 3);
            this.i.g(b(), 1, 2);
            if (a == 3) {
                this.i.g(this.h.d(), 0, 2);
            }
            ayor b = azpj.b(this.b.c());
            yxd yxdVar3 = this.g;
            double d = this.j;
            double d2 = efj.d;
            Double.isNaN(d2);
            yxdVar3.l((long) (d * d2), b);
            yxd yxdVar4 = this.h;
            double d3 = this.j;
            double d4 = efj.c;
            Double.isNaN(d4);
            yxdVar4.l((long) (d3 * d4), b);
            yxd yxdVar5 = this.i;
            double d5 = this.j;
            double d6 = efj.a;
            Double.isNaN(d6);
            yxdVar5.l((long) (d5 * d6), b);
            this.g.d().R(new efv(this, 1));
        }
    }

    public final void d() {
        this.k.a(yxf.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.k.a(yxf.b);
    }

    public final void f(int i) {
        int i2;
        long j;
        aynr f;
        yxd yxdVar;
        if (i != 0) {
            do {
                i2 = this.f.get();
                if (i2 != 1 && i2 != 0) {
                    return;
                }
            } while (!this.f.compareAndSet(i2, i));
            if (i != 2 && i != 1) {
                double d = this.j;
                double d2 = efj.e;
                Double.isNaN(d2);
                j = (long) (d * d2);
                if (!this.a || (yxdVar = this.h) == null) {
                    f = aynr.f();
                } else {
                    f = yxdVar.d();
                }
            } else if (i2 == 1) {
                return;
            } else {
                double d3 = this.j;
                double d4 = efj.b;
                Double.isNaN(d4);
                j = (long) (d3 * d4);
                f = aynr.f();
            }
            f.l(j, TimeUnit.MILLISECONDS, azpj.b(this.b.c())).R(new efv(this));
        }
    }
}
