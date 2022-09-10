package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: kyw  reason: default package */
/* loaded from: classes7.dex */
public final class kyw implements akzv {
    public final dxio<akox> a;
    public final bvnx b;
    public float c;
    public final Object d;
    public final akqa e;
    public long f;
    @dzsi
    public int g;
    private float h;

    public kyw(dxio<akox> dxioVar, bvnx bvnxVar) {
        new Handler();
        this.d = new Object();
        this.e = new akqa(dcyn.a);
        dbsk.f(true, "zoomAnimationDurationMs must be positive but was %s", 500L);
        dbsk.s(dxioVar);
        this.a = dxioVar;
        dbsk.s(bvnxVar);
        this.b = bvnxVar;
    }

    public static boolean o(float f, float f2) {
        return ((double) Math.abs(f - f2)) < 1.0E-6d;
    }

    public final float a() {
        synchronized (this.d) {
            if (this.g != 0) {
                return this.c;
            }
            return this.a.a().n().k;
        }
    }

    public final void b() {
        synchronized (this.d) {
            this.g = 0;
        }
    }

    public final double c() {
        double d;
        synchronized (this.d) {
            dbsk.l(this.g != 0);
            double a = this.b.a() - this.f;
            Double.isNaN(a);
            d = a / 500.0d;
        }
        return d;
    }

    @Override // defpackage.akzv
    public final int d() {
        return alad.d;
    }

    @Override // defpackage.akzv
    public final int e(long j) {
        synchronized (this.d) {
            int i = this.g;
            if (i != 0) {
                double c = c();
                float d = (float) this.e.d(c);
                if (o(d, this.h)) {
                    b();
                    return 0;
                }
                this.h = d;
                if (c > 1.0d) {
                    b();
                }
            }
            return i != 0 ? 6 : 0;
        }
    }

    @Override // defpackage.akzv
    public final long f() {
        return 500L;
    }

    @Override // defpackage.akzv
    public final boolean g() {
        return false;
    }

    @Override // defpackage.akzv
    public final boolean h() {
        return false;
    }

    @Override // defpackage.akzv
    public final void i() {
    }

    @Override // defpackage.akzv
    public final void j(int i) {
    }

    @Override // defpackage.akzv
    @dzsi
    public final Object k(int i) {
        if (i == 2) {
            return Float.valueOf(this.h);
        }
        return null;
    }

    @Override // defpackage.akzv
    @dzsi
    public final Object l(int i) {
        if (i != 2 || o(this.c, 0.0f)) {
            return null;
        }
        return Float.valueOf(this.c);
    }

    @Override // defpackage.akzv
    public final boolean m(@dzsi akzv akzvVar, int i) {
        return !(akzvVar instanceof arba);
    }

    @Override // defpackage.akzv
    public final void n(@dzsi akzv akzvVar, int i) {
        if (akzvVar != this) {
            b();
        }
    }
}
