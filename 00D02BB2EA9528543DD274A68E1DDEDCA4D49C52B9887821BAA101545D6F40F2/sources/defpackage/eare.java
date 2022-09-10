package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: eare  reason: default package */
/* loaded from: classes6.dex */
class eare extends eass {
    final eaon a;
    final eaon b;
    final long c;
    final boolean d;
    protected eaox e;
    protected eaox f;
    final /* synthetic */ earh g;

    public eare(earh earhVar, eaon eaonVar, eaon eaonVar2, long j) {
        this(earhVar, eaonVar, eaonVar2, j, false);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int A() {
        return this.b.A();
    }

    @Override // defpackage.eass, defpackage.eaon
    public int B(long j) {
        if (j >= this.c) {
            return this.b.B(j);
        }
        int B = this.a.B(j);
        long p = this.a.p(j, B);
        long j2 = this.c;
        if (p < j2) {
            return B;
        }
        eaon eaonVar = this.a;
        return eaonVar.d(eaonVar.k(j2, -1));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int C(eapt eaptVar) {
        return B(earh.Y().h(eaptVar, 0L));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int D(eapt eaptVar, int[] iArr) {
        int e = eaptVar.e();
        earh Y = earh.Y();
        long j = 0;
        for (int i = 0; i < e; i++) {
            eaon c = eaptVar.x(i).c(Y);
            if (iArr[i] <= c.B(j)) {
                j = c.p(j, iArr[i]);
            }
        }
        return B(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int E(Locale locale) {
        return Math.max(this.a.E(locale), this.b.E(locale));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long F(long j) {
        if (j >= this.c) {
            long F = this.b.F(j);
            long j2 = this.c;
            return (F >= j2 || this.g.H + F >= j2) ? F : L(F);
        }
        return this.a.F(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long G(long j) {
        if (j >= this.c) {
            return this.b.G(j);
        }
        long G = this.a.G(j);
        long j2 = this.c;
        return (G < j2 || G - this.g.H < j2) ? G : K(G);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long K(long j) {
        if (this.d) {
            earh earhVar = this.g;
            return earh.X(j, earhVar.F, earhVar.G);
        }
        return this.g.ab(j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long L(long j) {
        if (this.d) {
            earh earhVar = this.g;
            return earh.X(j, earhVar.G, earhVar.F);
        }
        earh earhVar2 = this.g;
        return earh.W(j, earhVar2.G, earhVar2.F);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int d(long j) {
        if (j >= this.c) {
            return this.b.d(j);
        }
        return this.a.d(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String e(long j, Locale locale) {
        if (j >= this.c) {
            return this.b.e(j, locale);
        }
        return this.a.e(j, locale);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String g(int i, Locale locale) {
        return this.b.g(i, locale);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String h(long j, Locale locale) {
        if (j >= this.c) {
            return this.b.h(j, locale);
        }
        return this.a.h(j, locale);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String j(int i, Locale locale) {
        return this.b.j(i, locale);
    }

    @Override // defpackage.eass, defpackage.eaon
    public long k(long j, int i) {
        return this.b.k(j, i);
    }

    @Override // defpackage.eass, defpackage.eaon
    public long l(long j, long j2) {
        return this.b.l(j, j2);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int[] m(eapt eaptVar, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return iArr;
        }
        if (eaor.g(eaptVar)) {
            long j = 0;
            for (int i3 = 0; i3 < 2; i3++) {
                j = eaptVar.x(i3).c(this.g).p(j, iArr[i3]);
            }
            return this.g.g(eaptVar, k(j, i2));
        }
        return super.m(eaptVar, i, iArr, i2);
    }

    @Override // defpackage.eass, defpackage.eaon
    public int n(long j, long j2) {
        return this.b.n(j, j2);
    }

    @Override // defpackage.eass, defpackage.eaon
    public long o(long j, long j2) {
        return this.b.o(j, j2);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long p(long j, int i) {
        long p;
        if (j >= this.c) {
            p = this.b.p(j, i);
            long j2 = this.c;
            if (p < j2) {
                if (this.g.H + p < j2) {
                    p = L(p);
                }
                if (d(p) != i) {
                    throw new eapb(this.b.a(), Integer.valueOf(i), null, null);
                }
            }
        } else {
            p = this.a.p(j, i);
            long j3 = this.c;
            if (p >= j3) {
                if (p - this.g.H >= j3) {
                    p = K(p);
                }
                if (d(p) != i) {
                    throw new eapb(this.a.a(), Integer.valueOf(i), null, null);
                }
            }
        }
        return p;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long r(long j, String str, Locale locale) {
        if (j >= this.c) {
            long r = this.b.r(j, str, locale);
            long j2 = this.c;
            return (r >= j2 || this.g.H + r >= j2) ? r : L(r);
        }
        long r2 = this.a.r(j, str, locale);
        long j3 = this.c;
        return (r2 < j3 || r2 - this.g.H < j3) ? r2 : K(r2);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox s() {
        return this.e;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox t() {
        return this.f;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final boolean u(long j) {
        if (j >= this.c) {
            return this.b.u(j);
        }
        return this.a.u(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox v() {
        return this.b.v();
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int w() {
        return this.a.w();
    }

    @Override // defpackage.eass, defpackage.eaon
    public int x(long j) {
        if (j < this.c) {
            return this.a.x(j);
        }
        int x = this.b.x(j);
        long p = this.b.p(j, x);
        long j2 = this.c;
        return p < j2 ? this.b.d(j2) : x;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int y(eapt eaptVar) {
        return this.a.y(eaptVar);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int z(eapt eaptVar, int[] iArr) {
        return this.a.z(eaptVar, iArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eare(earh earhVar, eaon eaonVar, eaon eaonVar2, long j, boolean z) {
        super(eaonVar2.a());
        this.g = earhVar;
        this.a = eaonVar;
        this.b = eaonVar2;
        this.c = j;
        this.d = z;
        this.e = eaonVar2.s();
        eaox t = eaonVar2.t();
        this.f = t == null ? eaonVar.t() : t;
    }
}
