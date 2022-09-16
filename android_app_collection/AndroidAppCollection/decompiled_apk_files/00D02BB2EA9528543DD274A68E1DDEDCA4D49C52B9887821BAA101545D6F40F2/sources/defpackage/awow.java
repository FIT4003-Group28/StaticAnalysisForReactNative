package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: awow  reason: default package */
/* loaded from: classes3.dex */
public final class awow implements akzv {
    public final bvnx b;
    @dzsi
    public akra c;
    public float d;
    public float e;
    public int f;
    public float g;
    public float h;
    public long i;
    public boolean j;
    public boolean k;
    @dzsi
    awop o;
    @dzsi
    awoq p;
    private final awoz r;
    private final akox s;
    private final awpf t;
    private final awpd q = new awpd();
    public final awox a = new awox();
    public boolean l = true;
    public boolean m = true;
    public final Object n = new Object();

    public awow(bvnx bvnxVar, akox akoxVar, awpf awpfVar) {
        this.r = new awoz(awpfVar);
        dbsk.s(bvnxVar);
        this.b = bvnxVar;
        dbsk.s(akoxVar);
        this.s = akoxVar;
        dbsk.s(awpfVar);
        this.t = awpfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        awpe awpeVar;
        this.m = true;
        this.l = true;
        synchronized (this.n) {
            awoq awoqVar = this.p;
            if (awoqVar != null && (awoqVar.a.g.b() || awoqVar.a.g.a())) {
                awot awotVar = awoqVar.a;
                awotVar.e.b(awotVar.b);
                awot awotVar2 = awoqVar.a;
                if (awotVar2.b.d == null) {
                    awpf awpfVar = awotVar2.e;
                    synchronized (awpfVar.b) {
                        awpfVar.d = true;
                        if (awpfVar.e) {
                            awpfVar.c = true;
                        }
                    }
                }
                awot awotVar3 = awoqVar.a;
                awpd awpdVar = awotVar3.b;
                if (awpdVar.a != null || awpdVar.d != null) {
                    awotVar3.e.a(awpe.LARGE);
                } else {
                    awpf awpfVar2 = awotVar3.e;
                    if (awotVar3.d.r.b() && awoqVar.a.g.a()) {
                        awpeVar = awpe.SMALL;
                    } else {
                        awpeVar = awpe.NONE;
                    }
                    awpfVar2.a(awpeVar);
                }
            }
        }
    }

    @Override // defpackage.akzv
    public final int d() {
        return alad.c;
    }

    @Override // defpackage.akzv
    public final int e(long j) {
        akrn akrnVar;
        if (this.l) {
            return 0;
        }
        long a = this.b.a();
        float f = ((float) (a - this.i)) / 1000.0f;
        akzh k = this.s.k();
        float e = akyx.e(k);
        Rect d = k.b.d();
        float width = ((d.width() + d.height()) * e) / 2.0f;
        if (!this.j) {
            awoz awozVar = this.r;
            float f2 = this.g;
            float f3 = this.h;
            float f4 = this.d;
            float f5 = this.e;
            awozVar.b = f2;
            awozVar.c = f3;
            awozVar.d = f4;
            awozVar.e = f5;
            if (awozVar.f(e, width)) {
                awozVar.g(width);
                this.j = true;
            }
        }
        awov awovVar = this.j ? this.r : this.a;
        if (awovVar.a(f, e, width)) {
            synchronized (this.n) {
                if (!this.k && this.o != null && this.j) {
                    awoz awozVar2 = this.r;
                    awpd awpdVar = this.q;
                    if (awozVar2.f < 0.45f) {
                        awpdVar.a(awozVar2.a);
                        awpd awpdVar2 = this.q;
                        if (awpdVar2.a == null && (akrnVar = awpdVar2.d) != null) {
                            awop awopVar = this.o;
                            awopVar.a.a.post(new awon(awopVar, awpdVar2.c, akrnVar));
                            this.k = true;
                        }
                    }
                }
            }
        } else {
            a();
            if (this.j) {
                synchronized (this.n) {
                    if (this.o != null) {
                        this.t.b(this.q);
                        awpd awpdVar3 = this.q;
                        if (awpdVar3.a != null) {
                            this.o.a();
                        } else {
                            akrn akrnVar2 = awpdVar3.d;
                            if (akrnVar2 != null) {
                                awop awopVar2 = this.o;
                                amub amubVar = awpdVar3.c;
                                if (!this.k) {
                                    awopVar2.a.a.post(new awom(awopVar2, amubVar, akrnVar2));
                                }
                            }
                        }
                    }
                }
            }
        }
        this.g = awovVar.b();
        this.h = awovVar.c();
        this.d = awovVar.d();
        this.e = awovVar.e();
        this.c = new akra(Math.round(this.d), Math.round(this.e), this.f);
        this.i = a;
        this.m = true;
        return this.l ? 0 : 6;
    }

    @Override // defpackage.akzv
    public final long f() {
        return -1L;
    }

    @Override // defpackage.akzv
    public final boolean g() {
        return true;
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
    public final Object k(int i) {
        if (i == 1) {
            return this.c;
        }
        String a = alab.a(i);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 38);
        sb.append("Not animating the following property: ");
        sb.append(a);
        throw new AssertionError(sb.toString());
    }

    @Override // defpackage.akzv
    @dzsi
    public final Object l(int i) {
        return null;
    }

    @Override // defpackage.akzv
    public final boolean m(@dzsi akzv akzvVar, int i) {
        return i != 1 || akzvVar == this || this.l || this.m;
    }

    @Override // defpackage.akzv
    public final void n(@dzsi akzv akzvVar, int i) {
        if (i != 1 || akzvVar == this || this.l) {
            return;
        }
        a();
    }
}
