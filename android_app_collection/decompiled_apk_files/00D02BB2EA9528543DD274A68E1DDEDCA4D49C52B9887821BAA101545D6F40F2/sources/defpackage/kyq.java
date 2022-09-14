package defpackage;
/* compiled from: PG */
/* renamed from: kyq  reason: default package */
/* loaded from: classes7.dex */
public final class kyq implements akzv {
    public final bvnx a;
    public long c;
    public long d;
    public long e;
    public long f;
    @dzsi
    public int g;
    @dzsi
    public int h;
    private final akzh i;
    private final kyp j;
    private final akra k = new akra();
    public final Object b = new Object();

    public kyq(akzh akzhVar, bvnx bvnxVar) {
        dbsk.s(akzhVar);
        this.i = akzhVar;
        this.a = bvnxVar;
        this.j = new kyp();
    }

    private final boolean o() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.g == 0 && this.h == 0) {
                z = false;
            }
        }
        return z;
    }

    public final void a() {
        synchronized (this.b) {
            b();
            c();
        }
    }

    public final void b() {
        synchronized (this.b) {
            this.g = 0;
        }
    }

    public final void c() {
        synchronized (this.b) {
            this.h = 0;
        }
    }

    @Override // defpackage.akzv
    public final int d() {
        return alad.c;
    }

    @Override // defpackage.akzv
    public final int e(long j) {
        double d;
        synchronized (this.b) {
            int i = this.g;
            double d2 = dcyn.a;
            if (i != 0) {
                d = this.j.a(j - this.c) - this.j.a(this.e - this.c);
                if (this.g == 2) {
                    d = -d;
                }
            } else {
                d = 0.0d;
            }
            if (this.h != 0) {
                d2 = this.j.a(j - this.d) - this.j.a(this.f - this.d);
                if (this.h == 4) {
                    d2 = -d2;
                }
            }
            akzh akzhVar = this.i;
            akyx.h(akzhVar, akzhVar.p(), (float) d2, (float) d, this.k);
            this.e = j;
            this.f = j;
        }
        return o() ? 6 : 0;
    }

    @Override // defpackage.akzv
    public final long f() {
        return o() ? -1L : 0L;
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
        if (i == 1) {
            return this.k;
        }
        return null;
    }

    @Override // defpackage.akzv
    @dzsi
    public final Object l(int i) {
        return null;
    }

    @Override // defpackage.akzv
    public final boolean m(@dzsi akzv akzvVar, int i) {
        return true;
    }

    @Override // defpackage.akzv
    public final void n(@dzsi akzv akzvVar, int i) {
        if (akzvVar != this) {
            a();
        }
    }
}
