package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: cskv  reason: default package */
/* loaded from: classes5.dex */
public final class cskv {
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;
    public boolean k = true;
    public boolean l = false;
    public double m = dcyn.a;
    public final double a = 100.0d;
    public final double b = 18.0d;
    public final CopyOnWriteArrayList<cskz> c = new CopyOnWriteArrayList<>();

    public static boolean f(double d, double d2, double d3) {
        return d2 < d3 ? d > d3 : d < d3;
    }

    public final boolean a() {
        return Math.abs(this.g) <= 0.005d && Math.abs(this.j - this.f) <= 0.005d;
    }

    public final void b() {
        this.l = true;
    }

    public final void c(double d) {
        if (d != this.j) {
            this.j = d;
            this.i = this.f;
            Iterator<cskz> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    public final void d(double d) {
        if (d != this.f) {
            this.f = d;
            this.i = d;
            Iterator<cskz> it = this.c.iterator();
            while (it.hasNext()) {
                cskz next = it.next();
                next.a(this);
                next.b(d);
            }
        }
    }

    public final void e(cskz cskzVar) {
        this.c.add(cskzVar);
    }
}
