package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: earw  reason: default package */
/* loaded from: classes6.dex */
public final class earw extends eass {
    final eaon a;
    final eaou b;
    final eaox c;
    final boolean d;
    final eaox e;
    final eaox f;

    public earw(eaon eaonVar, eaou eaouVar, eaox eaoxVar, eaox eaoxVar2, eaox eaoxVar3) {
        super(eaonVar.a());
        if (eaonVar.c()) {
            this.a = eaonVar;
            this.b = eaouVar;
            this.c = eaoxVar;
            this.d = eary.X(eaoxVar);
            this.e = eaoxVar2;
            this.f = eaoxVar3;
            return;
        }
        throw new IllegalArgumentException();
    }

    private final int K(long j) {
        int b = this.b.b(j);
        long j2 = b;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return b;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int A() {
        return this.a.A();
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int B(long j) {
        return this.a.B(this.b.q(j));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int C(eapt eaptVar) {
        return this.a.C(eaptVar);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int D(eapt eaptVar, int[] iArr) {
        return this.a.D(eaptVar, iArr);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int E(Locale locale) {
        return this.a.E(locale);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long F(long j) {
        if (this.d) {
            long K = K(j);
            return this.a.F(j + K) - K;
        }
        return this.b.u(this.a.F(this.b.q(j)), j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long G(long j) {
        if (this.d) {
            long K = K(j);
            return this.a.G(j + K) - K;
        }
        return this.b.u(this.a.G(this.b.q(j)), j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long H(long j) {
        return this.a.H(this.b.q(j));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int d(long j) {
        return this.a.d(this.b.q(j));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String e(long j, Locale locale) {
        return this.a.e(this.b.q(j), locale);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String g(int i, Locale locale) {
        return this.a.g(i, locale);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String h(long j, Locale locale) {
        return this.a.h(this.b.q(j), locale);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String j(int i, Locale locale) {
        return this.a.j(i, locale);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long k(long j, int i) {
        if (this.d) {
            long K = K(j);
            return this.a.k(j + K, i) - K;
        }
        return this.b.u(this.a.k(this.b.q(j), i), j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long l(long j, long j2) {
        if (this.d) {
            long K = K(j);
            return this.a.l(j + K, j2) - K;
        }
        return this.b.u(this.a.l(this.b.q(j), j2), j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int n(long j, long j2) {
        int K = K(j2);
        return this.a.n(j + (this.d ? K : K(j)), j2 + K);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long o(long j, long j2) {
        int K = K(j2);
        return this.a.o(j + (this.d ? K : K(j)), j2 + K);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long p(long j, int i) {
        long p = this.a.p(this.b.q(j), i);
        long u = this.b.u(p, j);
        if (d(u) == i) {
            return u;
        }
        eapc eapcVar = new eapc(p, this.b.d);
        eapb eapbVar = new eapb(this.a.a(), Integer.valueOf(i), eapcVar.getMessage());
        eapbVar.initCause(eapcVar);
        throw eapbVar;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long r(long j, String str, Locale locale) {
        return this.b.u(this.a.r(this.b.q(j), str, locale), j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox s() {
        return this.c;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox t() {
        return this.e;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final boolean u(long j) {
        return this.a.u(this.b.q(j));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox v() {
        return this.f;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int w() {
        return this.a.w();
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int x(long j) {
        return this.a.x(this.b.q(j));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int y(eapt eaptVar) {
        return this.a.y(eaptVar);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int z(eapt eaptVar, int[] iArr) {
        return this.a.z(eaptVar, iArr);
    }
}
