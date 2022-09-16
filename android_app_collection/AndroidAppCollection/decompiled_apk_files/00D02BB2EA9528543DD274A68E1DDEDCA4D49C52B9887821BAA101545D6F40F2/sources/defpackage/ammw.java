package defpackage;

import android.content.Context;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ammw  reason: default package */
/* loaded from: classes.dex */
public final class ammw extends akzm {
    private alad A;
    private final akzh B;
    private final ammt C;
    private float a;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private boolean t;
    private akzw u;
    private boolean v;
    private final float[] w;
    private final float[] x;
    private final float[] y;
    private final float[] z;

    public ammw(Context context, akzh akzhVar, bvnx bvnxVar) {
        super(bvnxVar);
        this.w = new float[4];
        this.x = new float[4];
        this.y = new float[4];
        this.z = new float[4];
        this.B = akzhVar;
        this.A = akzhVar.p();
        ammt ammtVar = new ammt(context);
        this.C = ammtVar;
        this.u = ammtVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized float A(float f, float f2, float f3) {
        float f4;
        f4 = this.a + f;
        this.a = f4;
        if (f != 0.0f) {
            this.r = f2;
            this.s = f3;
            this.t = true;
        }
        return akza.d(this.A.k + f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void B(float f, float f2) {
        this.p += f;
        this.q += f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void C(float f) {
        this.o += f;
    }

    final synchronized void D() {
        this.u.b(this.y);
        int i = 0;
        while (true) {
            float[] fArr = this.y;
            int length = fArr.length;
            if (i < 4) {
                float[] fArr2 = this.z;
                float f = fArr[i];
                float[] fArr3 = this.x;
                fArr2[i] = f - fArr3[i];
                fArr3[i] = fArr[i];
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void E(float f) {
        this.n += f;
        if (f != 0.0f) {
            this.t = false;
        }
        float f2 = this.A.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void F(float f, float f2, float f3) {
        this.n += f;
        if (f != 0.0f) {
            this.r = f2;
            this.s = f3;
            this.t = true;
        }
        float f4 = this.A.m;
    }

    @Override // defpackage.akzm
    public final boolean a(@dzsi alad aladVar, @dzsi alad aladVar2) {
        dbsk.s(aladVar);
        this.A = aladVar;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(@dzsi akzw akzwVar) {
        if (this.u == akzwVar) {
            return;
        }
        if (akzwVar == null) {
            this.u = this.C;
        } else {
            this.u = akzwVar;
        }
    }

    @Override // defpackage.akzm, defpackage.akzv
    public final synchronized int d() {
        int i = 0;
        if (this.p != 0.0f || this.q != 0.0f || (this.t && (this.a != 0.0f || this.n != 0.0f))) {
            i = alad.c;
        }
        if (this.a != 0.0f) {
            i |= alad.d;
        }
        if (this.o != 0.0f) {
            i |= alad.e;
        }
        if (this.n != 0.0f) {
            i |= alad.f;
        }
        if (this.v) {
            if (this.u.d()) {
                i |= alad.c;
            }
            if (this.u.e()) {
                i = alad.d | i;
            }
            if (this.u.f()) {
                return alad.f | i;
            }
        }
        return i;
    }

    @Override // defpackage.akzm, defpackage.akzv
    public final int e(long j) {
        float f;
        float f2;
        float f3;
        float max;
        float max2;
        synchronized (this) {
            float f4 = this.r;
            float f5 = this.s;
            boolean z = true;
            if (this.v) {
                D();
                float f6 = this.p;
                float[] fArr = this.z;
                f = f6 + fArr[0];
                f2 = this.q + fArr[1];
                max = this.a + fArr[2];
                max2 = this.n + fArr[3];
                f3 = this.o;
                this.o = 0.0f;
                this.n = 0.0f;
                this.a = 0.0f;
                this.q = 0.0f;
                this.p = 0.0f;
            } else {
                f = this.p;
                f2 = this.q;
                f3 = this.o;
                float f7 = this.a;
                max = f7 < 0.0f ? Math.max(f7, f7 * f7 * (-10.0f)) : Math.min(f7, f7 * f7 * 10.0f);
                float f8 = this.n;
                max2 = f8 < 0.0f ? Math.max(f8, f8 * f8 * (-0.1f)) : Math.min(f8, f8 * f8 * 0.1f);
                this.a -= max;
                this.n -= max2;
                this.p -= f;
                this.q -= f2;
                this.o -= f3;
            }
            if (this.f != 0 && (Math.abs(f) >= 0.1d || Math.abs(f2) >= 0.1d || Math.abs(max) >= 1.0E-4d || Math.abs(max2) >= 0.001d || f3 != 0.0f || !this.u.g())) {
                boolean z2 = ((f == 0.0f && f2 == 0.0f) || (this.f & alad.c) == 0) ? false : true;
                boolean z3 = (max2 == 0.0f || (this.f & alad.f) == 0) ? false : true;
                boolean z4 = (max == 0.0f || (this.f & alad.d) == 0) ? false : true;
                if (f3 == 0.0f || (this.f & alad.e) == 0) {
                    z = false;
                }
                if (z2) {
                    alad g = akyx.g(this.B, this.A, f, f2);
                    this.A = g;
                    if (z3 || z4 || z) {
                        this.B.o(g);
                    }
                }
                if (z3) {
                    if (this.t) {
                        akzh akzhVar = this.B;
                        alad p = akzhVar.p();
                        float y = f4 - (akzhVar.y() * p.n.b());
                        float z5 = f5 - (akzhVar.z() * p.n.c());
                        alaa b = alad.b(akyx.g(akzhVar, p, y, z5));
                        b.e = p.m + max2;
                        akzhVar.c.b(b);
                        alad a = b.a();
                        akzhVar.o(a);
                        this.A = akyx.g(akzhVar, a, -y, -z5);
                    } else {
                        alaa b2 = alad.b(this.A);
                        b2.e = this.A.m + max2;
                        this.A = b2.a();
                    }
                    if (z4 || z) {
                        this.B.o(this.A);
                    }
                }
                if (z4) {
                    alad aladVar = this.A;
                    float f9 = aladVar.k + max;
                    if (this.t) {
                        this.A = akyx.j(this.B, aladVar, f9, f4, f5);
                    } else {
                        alaa b3 = alad.b(aladVar);
                        b3.c = f9;
                        this.A = b3.a();
                    }
                    if (z) {
                        this.B.o(this.A);
                    }
                }
                if (z) {
                    alaa b4 = alad.b(this.A);
                    b4.d = this.A.l + f3;
                    this.A = b4.a();
                }
                this.A = this.B.c.a(this.A);
                return 6;
            }
            this.o = 0.0f;
            this.a = 0.0f;
            this.n = 0.0f;
            this.q = 0.0f;
            this.p = 0.0f;
            return 0;
        }
    }

    @Override // defpackage.akzm, defpackage.akzv
    public final long f() {
        return 0L;
    }

    @Override // defpackage.akzm, defpackage.akzv
    public final boolean g() {
        return true;
    }

    @Override // defpackage.akzm, defpackage.akzv
    public final void j(int i) {
        this.f = i;
    }

    @Override // defpackage.akzm, defpackage.akzv
    public final Object k(int i) {
        return this.A.h(i);
    }

    @Override // defpackage.akzm, defpackage.akzv
    @dzsi
    public final Object l(int i) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void t() {
        this.v = false;
        this.u.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void u() {
        this.u.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void v(float[] fArr) {
        this.v = true;
        float[] fArr2 = this.w;
        int length = fArr2.length;
        System.arraycopy(fArr, 0, fArr2, 0, 4);
        this.u.a(this.w);
        Arrays.fill(this.x, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized float w() {
        return this.A.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized float x() {
        return this.u.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean y() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized float z(float f) {
        float f2;
        f2 = this.a + f;
        this.a = f2;
        if (f != 0.0f) {
            this.t = false;
        }
        return akza.d(this.A.k + f2);
    }
}
